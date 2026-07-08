package X;

/* JADX INFO: renamed from: X.0kGZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1312770kGZ {
    CENTER,
    INNER2,
    OUTER2,
    INNER3,
    OUTER3;

    public final float LIZJ() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 0.5f;
        }
        if (iOrdinal == 1) {
            return 0.75f;
        }
        if (iOrdinal == 2) {
            return 0.25f;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 0.0f : 0.16666667f;
        }
        return 0.8333333f;
    }

    public static EnumC1312770kGZ valueOf(String str) {
        return (EnumC1312770kGZ) C08FF.LIZ(EnumC1312770kGZ.class, str);
    }
}
