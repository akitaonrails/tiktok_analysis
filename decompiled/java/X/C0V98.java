package X;

/* JADX INFO: renamed from: X.0V98, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0V98 {
    B(0),
    KB(1),
    MB(2),
    GB(3),
    TB(4),
    PB(5);

    public long LL = -1;
    public int exponent;

    public long getBytes() {
        long j = this.LL;
        if (j > 0) {
            return j;
        }
        long j2 = 1;
        for (int i = 0; i < this.exponent; i++) {
            j2 *= 1024;
        }
        this.LL = j2;
        return j2;
    }

    public static C0V98 valueOf(String str) {
        return (C0V98) C08FF.LIZ(C0V98.class, str);
    }

    public double getByUnit(C0V98 c0v98) {
        return (getBytes() * 1.0d) / c0v98.getBytes();
    }

    public long getLongByUnit(C0V98 c0v98) {
        return getBytes() / c0v98.getBytes();
    }

    C0V98(int i) {
        this.exponent = i;
    }
}
