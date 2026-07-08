package com.bytedance.aigc.proto;

import X.C08FF;

/* JADX INFO: loaded from: classes9.dex */
public enum Level {
    DEBUG(0),
    INFO(1),
    WARN(2),
    ERROR(3);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static Level fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ERROR;
                }
                return WARN;
            }
            return INFO;
        }
        return DEBUG;
    }

    public static Level valueOf(String str) {
        return (Level) C08FF.LIZ(Level.class, str);
    }

    Level(int i) {
        this.value = i;
    }
}
