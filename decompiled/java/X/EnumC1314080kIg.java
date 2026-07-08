package X;

/* JADX INFO: renamed from: X.0kIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1314080kIg {
    REPEAT,
    NO_REPEAT,
    REPEAT_X,
    REPEAT_Y,
    ROUND,
    SPACE;

    public static EnumC1314080kIg valueOf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return REPEAT;
                            }
                            return SPACE;
                        }
                        return ROUND;
                    }
                    return REPEAT_Y;
                }
                return REPEAT_X;
            }
            return NO_REPEAT;
        }
        return REPEAT;
    }

    public static EnumC1314080kIg valueOf(String str) {
        return (EnumC1314080kIg) C08FF.LIZ(EnumC1314080kIg.class, str);
    }
}
