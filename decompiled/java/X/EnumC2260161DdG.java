package X;

/* JADX INFO: renamed from: X.1DdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260161DdG {
    FULL,
    LONG,
    MEDIUM,
    SHORT,
    UNDEFINED;

    @Override // java.lang.Enum
    public String toString() {
        int i = C2260131DdD.LJIIL[ordinal()];
        if (i == 1) {
            return "full";
        }
        if (i == 2) {
            return "long";
        }
        if (i == 3) {
            return "medium";
        }
        if (i == 4) {
            return "short";
        }
        if (i == 5) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2260161DdG valueOf(String str) {
        return (EnumC2260161DdG) C08FF.LIZ(EnumC2260161DdG.class, str);
    }
}
