package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0oaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478710oaD implements Comparable<C1478710oaD> {
    public final double LL;
    public final double LLILLJJLI;
    public final double LLILLL;
    public long LLILZ;

    @Override // java.lang.Comparable
    public final int compareTo(C1478710oaD c1478710oaD) {
        double d;
        C1478710oaD c1478710oaD2 = c1478710oaD;
        double d2 = this.LLILLL;
        if (c1478710oaD2 == null) {
            d = 0.0d;
        } else {
            d = c1478710oaD2.LLILLL;
        }
        return Double.compare(d2, d);
    }

    public C1478710oaD(double d, double d2) {
        d = d < 0.0d ? 0.0d : d;
        this.LL = d;
        d2 = d2 < 0.0d ? 0.0d : d2;
        this.LLILLJJLI = d2;
        this.LLILZ = SystemClock.elapsedRealtime();
        this.LLILLL = d / (d2 / 1000.0d);
    }
}
