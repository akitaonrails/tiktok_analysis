package X;

/* JADX INFO: renamed from: X.0ziA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906480ziA {
    public long LIZ;
    public long LIZIZ;

    public final Long LIZ() {
        if (this.LIZIZ == 0) {
            if (this.LIZ == 0) {
                return null;
            }
            return Long.valueOf(this.LIZ);
        }
        long jCurrentTimeMillis = this.LIZ + (System.currentTimeMillis() - this.LIZIZ);
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        return Long.valueOf(jCurrentTimeMillis);
    }

    public final void LIZIZ() {
        if (this.LIZIZ == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.LIZIZ;
        this.LIZ += j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeTracker pauseRecording, currentTime = ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", duration = ");
        sbLIZ.append(j);
        sbLIZ.append(", totalDuration = ");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ() {
        if (this.LIZIZ == 0) {
            return;
        }
        this.LIZIZ = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeTracker resumeRecording, lastTime = ");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZLLL() {
        if (this.LIZIZ != 0) {
            return;
        }
        this.LIZIZ = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeTracker startRecording, lastTime = ");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1906480ziA(String str) {
    }
}
