package X;

/* JADX INFO: renamed from: X.1DdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260101DdA {
    LONG,
    LONGOFFSET,
    LONGGENERIC,
    SHORT,
    SHORTOFFSET,
    SHORTGENERIC,
    UNDEFINED;

    public String getSkeleonSymbol() {
        switch (C2260131DdD.LJIIJ[ordinal()]) {
            case 1:
                return "zzzz";
            case 2:
                return "OOOO";
            case 3:
                return "vvvv";
            case 4:
                return "z";
            case 5:
                return "O";
            case 6:
                return "v";
            case 7:
                return "";
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C2260131DdD.LJIIJ[ordinal()]) {
            case 1:
                return "long";
            case 2:
                return "longOffset";
            case 3:
                return "longGeneric";
            case 4:
                return "short";
            case 5:
                return "shortOffset";
            case 6:
                return "shortGeneric";
            case 7:
                return "";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static EnumC2260101DdA valueOf(String str) {
        return (EnumC2260101DdA) C08FF.LIZ(EnumC2260101DdA.class, str);
    }
}
