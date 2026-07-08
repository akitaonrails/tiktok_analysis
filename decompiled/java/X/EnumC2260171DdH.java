package X;

/* JADX INFO: renamed from: X.1DdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260171DdH {
    NUMERIC,
    DIGIT2,
    UNDEFINED;

    public String getSkeleonSymbol12() {
        int i = C2260131DdD.LJII[ordinal()];
        if (i == 1) {
            return "h";
        }
        if (i == 2) {
            return "hh";
        }
        if (i == 3) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    public String getSkeleonSymbol24() {
        int i = C2260131DdD.LJII[ordinal()];
        if (i == 1) {
            return "k";
        }
        if (i == 2) {
            return "kk";
        }
        if (i == 3) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2260131DdD.LJII[ordinal()];
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

    public static EnumC2260171DdH valueOf(String str) {
        return (EnumC2260171DdH) C08FF.LIZ(EnumC2260171DdH.class, str);
    }
}
