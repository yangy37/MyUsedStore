package com.zhijieketang.store.service;

import java.util.List;
import java.util.Map;

public interface OrdersService {

    String submitOrders(List<Map<String, Object>> cart);

}
