package X;

/* JADX INFO: renamed from: X.07qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC1989007qi {
    UNKNOWN,
    EXP,
    PRECISE_EXP,
    CONFIG_CENTER,
    CUSTOM_LOADER;

    public static EnumC1989007qi fromTypeValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return UNKNOWN;
                    }
                    return CUSTOM_LOADER;
                }
                return CONFIG_CENTER;
            }
            return PRECISE_EXP;
        }
        return EXP;
    }

    public static EnumC1989007qi valueOf(String str) {
        return (EnumC1989007qi) C08FF.LIZ(EnumC1989007qi.class, str);
    }
}
