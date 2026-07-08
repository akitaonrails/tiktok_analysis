package X;

/* JADX INFO: renamed from: X.08JU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C08JU {
    DEF_BUFFER,
    OPT_BUILDER,
    CHAR_ARRAY,
    OPT_NATIVE;

    public static C08JU fromInt(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return DEF_BUFFER;
                }
                return OPT_NATIVE;
            }
            return CHAR_ARRAY;
        }
        return OPT_BUILDER;
    }

    public static C08JU valueOf(String str) {
        return (C08JU) C08FF.LIZ(C08JU.class, str);
    }
}
