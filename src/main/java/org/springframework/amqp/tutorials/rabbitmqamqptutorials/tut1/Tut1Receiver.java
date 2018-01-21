package org.springframework.amqp.tutorials.rabbitmqamqptutorials.tut1;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * AUTH: JiSoo Yoon
 * MODIFY:
 * DESC:
 * TODO:
 */
@RabbitListener(queues = "hello")
public class Tut1Receiver {

    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }
}
