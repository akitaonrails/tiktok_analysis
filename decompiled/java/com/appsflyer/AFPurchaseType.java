package com.appsflyer;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum AFPurchaseType {
    SUBSCRIPTION("subscription"),
    ONE_TIME_PURCHASE("one_time_purchase");

    public final String AFInAppEventType;

    public static AFPurchaseType valueOf(String str) {
        return (AFPurchaseType) C08FF.LIZ(AFPurchaseType.class, str);
    }

    public final String getValue() {
        return this.AFInAppEventType;
    }

    AFPurchaseType(String str) {
        this.AFInAppEventType = str;
    }
}
