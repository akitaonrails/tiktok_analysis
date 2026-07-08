package X;

/* JADX INFO: renamed from: X.1Dcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2259981Dcy {
    STANDARD,
    SCIENTIFIC,
    ENGINEERING,
    COMPACT;

    @Override // java.lang.Enum
    public String toString() {
        int i = C2259961Dcw.LIZIZ[ordinal()];
        if (i == 1) {
            return "standard";
        }
        if (i == 2) {
            return "scientific";
        }
        if (i == 3) {
            return "engineering";
        }
        if (i == 4) {
            return "compact";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2259981Dcy valueOf(String str) {
        return (EnumC2259981Dcy) C08FF.LIZ(EnumC2259981Dcy.class, str);
    }
}
