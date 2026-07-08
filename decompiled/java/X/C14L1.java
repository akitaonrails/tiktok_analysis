package X;

/* JADX INFO: renamed from: X.14L1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14L1 {
    L(1),
    M(0),
    Q(3),
    H(2);

    public static final C14L1[] LLILLJJLI;
    public final int LL;

    static {
        C14L1 c14l1 = L;
        C14L1 c14l12 = M;
        C14L1 c14l13 = Q;
        LLILLJJLI = new C14L1[]{c14l12, c14l1, H, c14l13};
    }

    public int getBits() {
        return this.LL;
    }

    public static C14L1 forBits(int i) {
        if (i >= 0 && i < 4) {
            return LLILLJJLI[i];
        }
        throw new IllegalArgumentException();
    }

    public static C14L1 valueOf(String str) {
        return (C14L1) C08FF.LIZ(C14L1.class, str);
    }

    C14L1(int i) {
        this.LL = i;
    }
}
