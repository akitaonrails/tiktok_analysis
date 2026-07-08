package X;

/* JADX INFO: renamed from: X.0oaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478850oaR implements Comparable<C1478850oaR> {
    public double LL;
    public double LLILLJJLI;
    public long LLILLL;
    public long LLILZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeedRecord{mSpeed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mWeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mCostTime=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentTime=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1478850oaR c1478850oaR) {
        double d = this.LL;
        double d2 = c1478850oaR.LL;
        if (d == d2) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public C1478850oaR(double d, double d2, long j, long j2) {
        this.LL = d;
        this.LLILLJJLI = d2;
        this.LLILLL = j;
        this.LLILZ = j2;
        if (d >= 0.0d && d2 >= 0.0d) {
        } else {
            throw new IllegalArgumentException(toString());
        }
    }
}
