package X;

import Y.ARunnableS23S0110000_4;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CBI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CBI implements Runnable {
    public final C557050Lt1 LL = new C557050Lt1(false);
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C2120008Sg LLILZLL;
    public final /* synthetic */ Keva LLIZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PreloadBootFinishABValueTask@ccc.run$1$1");
        try {
            if (this.LL.LIZ(false, true)) {
                try {
                    PumbaaWorkerThread.getHandler().removeCallbacks(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C786410Ut5.LJL(PumbaaWorkerThread.getHandler(), new ARunnableS23S0110000_4(this, SystemClock.uptimeMillis() - this.LLILLJJLI > ((long) C2549109yr.LIZ), 0));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadBootFinishABValueTask@ccc.run$1$1");
    }

    public C0CBI(long j, boolean z, boolean z2, boolean z3, C2120008Sg c2120008Sg, Keva keva) {
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = c2120008Sg;
        this.LLIZ = keva;
    }
}
