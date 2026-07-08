package X;

/* JADX INFO: renamed from: X.1DdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260241DdO {
    BESTFIT,
    BASIC;

    @Override // java.lang.Enum
    public String toString() {
        int i = C2260131DdD.LIZ[ordinal()];
        if (i == 1) {
            return "best fit";
        }
        if (i == 2) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2260241DdO valueOf(String str) {
        return (EnumC2260241DdO) C08FF.LIZ(EnumC2260241DdO.class, str);
    }
}
