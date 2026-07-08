package X;

/* JADX INFO: renamed from: X.0XDP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0XDP {
    L0(0),
    L1(1);

    public final int LL;

    public int value() {
        return this.LL;
    }

    public static C0XDP valueOf(String str) {
        return (C0XDP) C08FF.LIZ(C0XDP.class, str);
    }

    C0XDP(int i) {
        this.LL = i;
    }
}
