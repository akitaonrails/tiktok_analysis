package X;

/* JADX INFO: renamed from: X.1DdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260141DdE {
    NUMERIC,
    DIGIT2,
    LONG,
    SHORT,
    NARROW,
    UNDEFINED;

    public String getSkeleonSymbol() {
        switch (C2260131DdD.LJFF[ordinal()]) {
            case 1:
                return "M";
            case 2:
                return "MM";
            case 3:
                return "MMMM";
            case 4:
                return "MMM";
            case 5:
                return "MMMMM";
            case 6:
                return "";
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C2260131DdD.LJFF[ordinal()]) {
            case 1:
                return "numeric";
            case 2:
                return "2-digit";
            case 3:
                return "long";
            case 4:
                return "short";
            case 5:
                return "narrow";
            case 6:
                return "";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static EnumC2260141DdE valueOf(String str) {
        return (EnumC2260141DdE) C08FF.LIZ(EnumC2260141DdE.class, str);
    }
}
