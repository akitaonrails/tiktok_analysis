package X;

/* JADX INFO: renamed from: X.0kIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1314070kIf {
    REPEAT,
    NO_REPEAT,
    REPEAT_X,
    REPEAT_Y,
    ROUND,
    SPACE;

    public static EnumC1314070kIf valueOf(int i) {
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

    public static EnumC1314070kIf valueOf(String str) {
        return (EnumC1314070kIf) C08FF.LIZ(EnumC1314070kIf.class, str);
    }
}
