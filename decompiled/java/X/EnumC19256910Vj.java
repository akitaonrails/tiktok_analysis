package X;

/* JADX INFO: renamed from: X.10Vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public enum EnumC19256910Vj {
    NONE(0),
    BLOCKING(1),
    NON_BLOCKING(2);

    public final int LL;

    public static EnumC19256910Vj valueOf(String str) {
        return (EnumC19256910Vj) C08FF.LIZ(EnumC19256910Vj.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC19256910Vj(int i) {
        this.LL = i;
    }
}
