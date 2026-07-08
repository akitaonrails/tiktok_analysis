package X;

/* JADX INFO: renamed from: X.1Dcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2259921Dcs {
    AUTO,
    ALWAYS,
    NEVER,
    EXCEPTZERO;

    @Override // java.lang.Enum
    public String toString() {
        int i = C2259961Dcw.LIZLLL[ordinal()];
        if (i == 1) {
            return "auto";
        }
        if (i == 2) {
            return "always";
        }
        if (i == 3) {
            return "never";
        }
        if (i == 4) {
            return "exceptZero";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2259921Dcs valueOf(String str) {
        return (EnumC2259921Dcs) C08FF.LIZ(EnumC2259921Dcs.class, str);
    }
}
