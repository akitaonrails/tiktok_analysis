package X;

/* JADX INFO: renamed from: X.08JT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C08JT {
    DEF_BUFFER,
    OPT_BUILDER,
    CHAR_ARRAY,
    OTIS_NATIVE;

    public static C08JT fromInt(int i) {
        if (i != 1) {
            if (i != 2) {
                return DEF_BUFFER;
            }
            return CHAR_ARRAY;
        }
        return OPT_BUILDER;
    }

    public static C08JT valueOf(String str) {
        return (C08JT) C08FF.LIZ(C08JT.class, str);
    }
}
