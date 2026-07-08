package X;

/* JADX INFO: renamed from: X.18hJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21352718hJ {
    UI(999),
    P0(888),
    P1(777),
    P2(666),
    P3(555),
    UNKNOWN(600);

    public int LL;

    public static EnumC21352718hJ valueOf(String str) {
        return (EnumC21352718hJ) C08FF.LIZ(EnumC21352718hJ.class, str);
    }

    public final int getPriority() {
        return this.LL;
    }

    public final void setPriority(int i) {
        this.LL = i;
    }

    EnumC21352718hJ(int i) {
        this.LL = i;
    }
}
