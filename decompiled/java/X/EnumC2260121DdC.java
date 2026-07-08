package X;

/* JADX INFO: renamed from: X.1DdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260121DdC {
    LONG,
    SHORT,
    NARROW,
    UNDEFINED;

    public String getSkeleonSymbol() {
        int i = C2260131DdD.LIZLLL[ordinal()];
        if (i == 1) {
            return "GGGG";
        }
        if (i == 2) {
            return "GGG";
        }
        if (i == 3) {
            return "G5";
        }
        if (i == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2260131DdD.LIZLLL[ordinal()];
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

    public static EnumC2260121DdC valueOf(String str) {
        return (EnumC2260121DdC) C08FF.LIZ(EnumC2260121DdC.class, str);
    }
}
