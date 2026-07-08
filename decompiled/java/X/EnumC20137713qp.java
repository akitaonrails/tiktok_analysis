package X;

/* JADX INFO: renamed from: X.13qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC20137713qp {
    YUV(0),
    Y(1),
    U(2),
    V(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC20137713qp valueOf(String str) {
        return (EnumC20137713qp) C08FF.LIZ(EnumC20137713qp.class, str);
    }

    EnumC20137713qp(int i) {
        this.LL = i;
    }
}
