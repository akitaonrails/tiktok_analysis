package X;

/* JADX INFO: renamed from: X.1DdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260201DdK {
    NUMERIC,
    DIGIT2,
    UNDEFINED;

    public String getSkeleonSymbol() {
        int i = C2260131DdD.LJI[ordinal()];
        if (i == 1) {
            return "d";
        }
        if (i == 2) {
            return "dd";
        }
        if (i == 3) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2260131DdD.LJI[ordinal()];
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

    public static EnumC2260201DdK valueOf(String str) {
        return (EnumC2260201DdK) C08FF.LIZ(EnumC2260201DdK.class, str);
    }
}
