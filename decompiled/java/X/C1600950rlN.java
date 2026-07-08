package X;

/* JADX INFO: renamed from: X.0rlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600950rlN {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ = 2;
    public long LIZLLL;

    public final void LIZ() {
        if (this.LIZJ == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
            if (jCurrentTimeMillis < 3600000) {
                this.LIZ += jCurrentTimeMillis;
            }
            this.LIZIZ = 0L;
            this.LIZJ = 1;
        }
    }
}
