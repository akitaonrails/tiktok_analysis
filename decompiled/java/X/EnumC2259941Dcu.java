package X;

/* JADX INFO: renamed from: X.1Dcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2259941Dcu {
    SYMBOL,
    NARROWSYMBOL,
    CODE,
    NAME;

    public int getNameStyle() {
        return C2259961Dcw.LJFF[ordinal()] != 4 ? 0 : 1;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2259961Dcw.LJFF[ordinal()];
        if (i == 1) {
            return "symbol";
        }
        if (i == 2) {
            return "narrowSymbol";
        }
        if (i == 3) {
            return "code";
        }
        if (i == 4) {
            return "name";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2259941Dcu valueOf(String str) {
        return (EnumC2259941Dcu) C08FF.LIZ(EnumC2259941Dcu.class, str);
    }
}
