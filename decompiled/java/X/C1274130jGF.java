package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274130jGF {
    public final AbstractC1273900jFs LIZ;
    public final Handler LIZIZ;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public final ARunnableS120S0100000_20 LJ = new ARunnableS120S0100000_20(this, 321);

    public final void LIZ() {
        synchronized (C1274170jGJ.LIZ) {
            try {
                C1274170jGJ.LIZIZ = 0.0d;
                C1274170jGJ.LIZJ = 0;
                C1274170jGJ.LIZLLL = 0.0d;
                C1274170jGJ.LJ = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1274170jGJ.LIZLLL();
        Handler handler = this.LIZIZ;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.LJ);
        C786410Ut5.LJLIIL(30000L, this.LIZIZ, this.LJ);
    }

    public final void LIZIZ() {
        this.LIZIZ.removeCallbacks(this.LJ);
        C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS120S0100000_20(this, 322));
    }

    public C1274130jGF(AbstractC1273900jFs abstractC1273900jFs, Handler handler) {
        this.LIZ = abstractC1273900jFs;
        this.LIZIZ = handler;
    }
}
