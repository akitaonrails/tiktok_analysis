package X;

/* JADX INFO: renamed from: X.1DdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260181DdI {
    LONG,
    SHORT,
    NARROW,
    UNDEFINED;

    public String getSkeleonSymbol() {
        int i = C2260131DdD.LIZJ[ordinal()];
        if (i == 1) {
            return "EEEE";
        }
        if (i == 2) {
            return "EEE";
        }
        if (i == 3) {
            return "EEEEE";
        }
        if (i == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2260131DdD.LIZJ[ordinal()];
        if (i == 1) {
            return "long";
        }
        if (i == 2) {
            return "short";
        }
        if (i == 3) {
            return "narrow";
        }
        if (i == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2260181DdI valueOf(String str) {
        return (EnumC2260181DdI) C08FF.LIZ(EnumC2260181DdI.class, str);
    }
}
