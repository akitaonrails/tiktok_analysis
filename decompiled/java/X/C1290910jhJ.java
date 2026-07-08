package X;

/* JADX INFO: renamed from: X.0jhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290910jhJ {
    public long LIZ;
    public final long[] LIZIZ = new long[100];
    public int LIZJ;
    public int LIZLLL;
    public double LJ;

    public final float LIZ() {
        double d = this.LJ;
        if (this.LIZJ > 0) {
            long j = 0;
            for (long j2 : this.LIZIZ) {
                j += j2;
            }
            double d2 = j;
            double d3 = this.LJ;
            int i = this.LIZLLL;
            d = (d2 + (d3 * ((double) (i - this.LIZJ)))) / ((double) i);
        }
        this.LIZ = 0L;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0.0d;
        float f = (float) d;
        if (f != 0.0f) {
            return 1000000000 / f;
        }
        return 0.0f;
    }

    public final void LIZIZ() {
        long jNanoTime = System.nanoTime();
        long j = this.LIZ;
        if (j != 0) {
            long[] jArr = this.LIZIZ;
            int i = this.LIZJ;
            jArr[i] = jNanoTime - j;
            this.LIZJ = i + 1;
            this.LIZLLL++;
        }
        this.LIZ = jNanoTime;
        int i2 = this.LIZJ;
        long[] jArr2 = this.LIZIZ;
        if (i2 != jArr2.length || jArr2.length == 0) {
            return;
        }
        int length = jArr2.length;
        double d = 0.0d;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            d += jArr2[i3];
            this.LIZIZ[i4] = 0;
            i3++;
            i4++;
        }
        double d2 = this.LJ;
        int i5 = this.LIZLLL;
        this.LJ = ((d2 * ((double) (i5 - this.LIZJ))) + d) / ((double) i5);
        this.LIZJ = 0;
    }
}
