package com.bytedance.aigc.proto;

import X.C08FF;

/* JADX INFO: loaded from: classes9.dex */
public enum Business {
    NO(-1),
    AI_THEATER(0),
    CAMERA_AIGC(1),
    EFFECT_AIGC(2),
    AI_PORTRAIT(3);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static Business fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return AI_PORTRAIT;
                }
                return EFFECT_AIGC;
            }
            return CAMERA_AIGC;
        }
        return AI_THEATER;
    }

    public static Business valueOf(String str) {
        return (Business) C08FF.LIZ(Business.class, str);
    }

    Business(int i) {
        this.value = i;
    }
}
