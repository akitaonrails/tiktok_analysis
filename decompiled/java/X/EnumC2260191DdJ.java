package X;

/* JADX INFO: renamed from: X.1DdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260191DdJ {
    NUMERIC,
    DIGIT2,
    UNDEFINED;

    public String getSkeleonSymbol() {
        int i = C2260131DdD.LJIIIIZZ[ordinal()];
        if (i == 1) {
            return "m";
        }
        if (i == 2) {
            return "mm";
        }
        if (i == 3) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2260131DdD.LJIIIIZZ[ordinal()];
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

    public static EnumC2260191DdJ valueOf(String str) {
        return (EnumC2260191DdJ) C08FF.LIZ(EnumC2260191DdJ.class, str);
    }
}
