package com.bytedance.aigc.proto;

import X.C08FF;

/* JADX INFO: loaded from: classes9.dex */
public enum Scene {
    NO(-1),
    CAMEO(0),
    VIDEO(1),
    REMIX_VIDEO(2),
    IMAGE2VIDEO(3),
    PORTRAIT(4);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static Scene fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return PORTRAIT;
                    }
                    return IMAGE2VIDEO;
                }
                return REMIX_VIDEO;
            }
            return VIDEO;
        }
        return CAMEO;
    }

    public static Scene valueOf(String str) {
        return (Scene) C08FF.LIZ(Scene.class, str);
    }

    Scene(int i) {
        this.value = i;
    }
}
