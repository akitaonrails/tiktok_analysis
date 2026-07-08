package com.bytedance.aigc.proto;

import X.C08FF;

/* JADX INFO: loaded from: classes9.dex */
public enum Tenant {
    NO(-1),
    aigc(0);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static Tenant fromValue(int i) {
        if (i != 0) {
            return null;
        }
        return aigc;
    }

    public static Tenant valueOf(String str) {
        return (Tenant) C08FF.LIZ(Tenant.class, str);
    }

    Tenant(int i) {
        this.value = i;
    }
}
