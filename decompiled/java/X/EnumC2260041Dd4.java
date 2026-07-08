package X;

/* JADX INFO: renamed from: X.1Dd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260041Dd4 {
    SHORT,
    LONG;

    @Override // java.lang.Enum
    public String toString() {
        int i = C2259961Dcw.LIZJ[ordinal()];
        if (i == 1) {
            return "short";
        }
        if (i == 2) {
            return "long";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2260041Dd4 valueOf(String str) {
        return (EnumC2260041Dd4) C08FF.LIZ(EnumC2260041Dd4.class, str);
    }
}
