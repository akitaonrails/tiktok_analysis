package X;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.11S1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11S1 {
    public final int LIZ;
    public final C11S2[] LIZIZ;
    public long LIZJ;

    public final C11S2 LIZ() {
        int i = this.LIZ;
        if (i == 0) {
            return C19502211Rs.LJI;
        }
        C11S2[] c11s2Arr = this.LIZIZ;
        long j = this.LIZJ;
        this.LIZJ = 1 + j;
        return c11s2Arr[(int) (j % ((long) i))];
    }

    public C11S1(int i, ThreadFactory threadFactory) {
        this.LIZ = i;
        this.LIZIZ = new C11S2[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.LIZIZ[i2] = new C11S2(threadFactory);
        }
    }
}
