package X;

/* JADX INFO: renamed from: X.0qU0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractRunnableC1551740qU0 implements Runnable, Comparable<AbstractRunnableC1551740qU0> {
    public final int LL;
    public final C1551770qU3 LLILLJJLI;

    @Override // java.lang.Comparable
    public final int compareTo(AbstractRunnableC1551740qU0 abstractRunnableC1551740qU0) {
        int i = this.LL;
        int i2 = abstractRunnableC1551740qU0.LL;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }

    public AbstractRunnableC1551740qU0(int i, C1551770qU3 c1551770qU3) {
        this.LL = i;
        this.LLILLJJLI = c1551770qU3;
    }
}
