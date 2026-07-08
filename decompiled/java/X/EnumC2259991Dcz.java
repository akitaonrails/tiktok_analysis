package X;

/* JADX INFO: renamed from: X.1Dcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2259991Dcz {
    STANDARD,
    ACCOUNTING;

    @Override // java.lang.Enum
    public String toString() {
        int i = C2259961Dcw.LJI[ordinal()];
        if (i == 1) {
            return "accounting";
        }
        if (i == 2) {
            return "standard";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2259991Dcz valueOf(String str) {
        return (EnumC2259991Dcz) C08FF.LIZ(EnumC2259991Dcz.class, str);
    }
}
