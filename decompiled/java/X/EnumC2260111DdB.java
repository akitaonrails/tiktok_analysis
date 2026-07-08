package X;

/* JADX INFO: renamed from: X.1DdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260111DdB {
    H11,
    H12,
    H23,
    H24,
    UNDEFINED;

    @Override // java.lang.Enum
    public String toString() {
        int i = C2260131DdD.LIZIZ[ordinal()];
        if (i == 1) {
            return "h11";
        }
        if (i == 2) {
            return "h12";
        }
        if (i == 3) {
            return "h23";
        }
        if (i == 4) {
            return "h24";
        }
        if (i == 5) {
            return "";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2260111DdB valueOf(String str) {
        return (EnumC2260111DdB) C08FF.LIZ(EnumC2260111DdB.class, str);
    }
}
