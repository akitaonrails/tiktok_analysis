package com.bytedance.aigc.proto;

import X.C08FF;

/* JADX INFO: loaded from: classes9.dex */
public enum FlowDomain {
    CUSTOMIZE(0),
    PREPARE(101),
    GENERATE(102),
    CONSUME(103);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static FlowDomain fromValue(int i) {
        if (i != 0) {
            switch (i) {
                case 101:
                    return PREPARE;
                case 102:
                    return GENERATE;
                case 103:
                    return CONSUME;
                default:
                    return null;
            }
        }
        return CUSTOMIZE;
    }

    public static FlowDomain valueOf(String str) {
        return (FlowDomain) C08FF.LIZ(FlowDomain.class, str);
    }

    FlowDomain(int i) {
        this.value = i;
    }
}
