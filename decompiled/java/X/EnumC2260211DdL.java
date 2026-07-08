package X;

/* JADX INFO: renamed from: X.1DdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260211DdL {
    NUMERIC,
    DIGIT2,
    UNDEFINED;

    public String getSkeleonSymbol() {
        int i = C2260131DdD.LJIIIZ[ordinal()];
        if (i == 1) {
            return "s";
        }
        if (i == 2) {
            return "ss";
        }
        if (i == 3) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2260131DdD.LJIIIZ[ordinal()];
        if (i == 1) {
            return "numeric";
        }
        if (i == 2) {
            return "2-digit";
        }
        if (i == 3) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2260211DdL valueOf(String str) {
        return (EnumC2260211DdL) C08FF.LIZ(EnumC2260211DdL.class, str);
    }
}
