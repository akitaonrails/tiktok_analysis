package X;

import android.os.Handler;

/* JADX INFO: renamed from: X.0N5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractRunnableC588330N5r implements Runnable {
    public Handler LL;

    public abstract void LIZ();

    public abstract long LIZIZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PythiaScheduler$TimerRunnable@b05e.run");
        try {
            LIZ();
            C786410Ut5.LJLIIL(LIZIZ(), this.LL, this);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PythiaScheduler$TimerRunnable@b05e.run");
    }
}
