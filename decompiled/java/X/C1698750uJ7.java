package X;

import android.os.SystemClock;
import android.util.Pair;

/* JADX INFO: renamed from: X.0uJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698750uJ7 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ = -1;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZJ() {
        this.LJ = true;
        this.LIZLLL = false;
        if (this.LIZJ != -1) {
            this.LIZIZ += SystemClock.elapsedRealtime() - this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stall end due to switch, accum duration:");
            sbLIZ.append(this.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            this.LIZJ = -1L;
        }
    }

    public final void LIZLLL() {
        if (this.LIZLLL) {
            this.LIZLLL = false;
        }
        if (this.LJ) {
            this.LJ = false;
        }
        if (this.LIZJ == -1) {
            return;
        }
        this.LIZIZ += SystemClock.elapsedRealtime() - this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stall end, accum duration:");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        this.LIZJ = -1L;
    }

    public final void LJ() {
        if (this.LJ) {
            return;
        }
        if (this.LJFF) {
            this.LIZLLL = true;
            return;
        }
        if (this.LIZJ != -1) {
            return;
        }
        this.LIZJ = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stall start:");
        sbLIZ.append(this.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        this.LIZ++;
    }

    public final Pair<Integer, Integer> LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LIZJ;
        if (j != -1) {
            this.LIZIZ += jElapsedRealtime - j;
            this.LIZJ = jElapsedRealtime;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stall end due to report, accum duration:");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", count:");
            sbLIZ.append(this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("refresh stall start:");
            sbLIZ2.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("report, accum duration:");
        sbLIZ3.append(this.LIZIZ);
        sbLIZ3.append(", count:");
        sbLIZ3.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        C1698940uJQ.LIZJ();
        long j2 = this.LIZIZ;
        long j3 = this.LIZ;
        this.LIZIZ = 0L;
        this.LIZ = 0L;
        return Pair.create(Integer.valueOf((int) j2), Integer.valueOf((int) j3));
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            if (this.LIZJ != -1) {
                this.LIZIZ += SystemClock.elapsedRealtime() - this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("stall end due to background, accum duration:");
                sbLIZ.append(this.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
                this.LIZJ = -1L;
                this.LIZLLL = true;
            }
        } else if (this.LIZLLL) {
            this.LIZJ = SystemClock.elapsedRealtime();
            this.LIZ++;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("background left stall start:");
            sbLIZ2.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
            this.LIZLLL = false;
        }
        this.LJFF = z;
    }
}
