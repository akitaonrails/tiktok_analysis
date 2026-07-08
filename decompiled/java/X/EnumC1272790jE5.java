package X;

/* JADX INFO: renamed from: X.0jE5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1272790jE5 {
    MAIN_CHAIN(0),
    SELFSIDE_RENDER_CHAIN(1);

    public final int LL;

    @Override // java.lang.Enum
    public String toString() {
        int i = C1272800jE6.LIZ[ordinal()];
        return i != 1 ? i != 2 ? "UNKNOWN" : "SELFSIDE_RENDER_CHAIN" : "MAIN_CHAIN";
    }

    public int value() {
        return this.LL;
    }

    public static EnumC1272790jE5 valueOf(String str) {
        return (EnumC1272790jE5) C08FF.LIZ(EnumC1272790jE5.class, str);
    }

    EnumC1272790jE5(int i) {
        this.LL = i;
    }
}
