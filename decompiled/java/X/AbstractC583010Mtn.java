package X;

/* JADX INFO: renamed from: X.0Mtn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC583010Mtn extends AbstractRunnableC583020Mto {
    public long LLILLL = -1;
    public final long LLILLJJLI = 60000;

    public abstract void LIZ();

    public abstract void LIZIZ(boolean z);

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FpsReportHelper$DelayRunnable@8d8e.run");
        try {
            LIZ();
            if (this.LLILLL > 0) {
                LIZIZ(System.currentTimeMillis() - this.LLILLL >= this.LLILLJJLI);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FpsReportHelper$DelayRunnable@8d8e.run");
    }
}
