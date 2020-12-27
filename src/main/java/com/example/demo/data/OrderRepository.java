package com.example.demo.data;

import com.example.demo.model.Order;

public interface OrderRepository {
    Order save(Order order);
}
