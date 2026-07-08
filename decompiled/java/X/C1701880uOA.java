package X;

/* JADX INFO: renamed from: X.0uOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701880uOA implements Comparable<C1701880uOA> {
    public final Runnable LL;
    public final long LLILLJJLI;
    public final int LLILLL;
    public volatile boolean LLILZ;

    @Override // java.lang.Comparable
    public final int compareTo(C1701880uOA c1701880uOA) {
        C1701880uOA c1701880uOA2 = c1701880uOA;
        long j = this.LLILLJJLI;
        long j2 = c1701880uOA2.LLILLJJLI;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        int i = this.LLILLL;
        int i2 = c1701880uOA2.LLILLL;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }

    public C1701880uOA(Runnable runnable, Long l, int i) {
        this.LL = runnable;
        this.LLILLJJLI = l.longValue();
        this.LLILLL = i;
    }
}
