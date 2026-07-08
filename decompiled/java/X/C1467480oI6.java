package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0oI6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467480oI6 {
    public int LIZ = 2;
    public int LIZIZ;
    public long LIZJ;

    public final void LIZ() {
        this.LIZIZ = 0;
        if (this.LIZ == 1) {
            this.LIZJ = SystemClock.elapsedRealtime();
        }
    }

    public final void LIZJ() {
        this.LIZ = 2;
        this.LIZIZ = 0;
        this.LIZJ = 0L;
    }

    public final int LIZIZ() {
        if (this.LIZ == 1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (jElapsedRealtime - this.LIZJ);
            if (i >= 0) {
                this.LIZIZ += i;
            }
            this.LIZJ = jElapsedRealtime;
        }
        return this.LIZIZ;
    }

    public final void LIZLLL() {
        if (this.LIZ == 2) {
            this.LIZ = 1;
            this.LIZJ = SystemClock.elapsedRealtime();
        }
    }

    public final void LJ() {
        if (this.LIZ == 1) {
            this.LIZ = 2;
            int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.LIZJ);
            if (iElapsedRealtime >= 0) {
                this.LIZIZ += iElapsedRealtime;
            }
        }
    }
}
