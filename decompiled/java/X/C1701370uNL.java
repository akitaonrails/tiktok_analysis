package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701370uNL {
    public static C1701370uNL LJ;
    public BPEAHandler LIZ;
    public HandlerThread LIZIZ;
    public int LIZJ;
    public final Object LIZLLL = new Object();

    public final void LIZ() {
        synchronized (this.LIZLLL) {
            try {
                if (this.LIZ == null) {
                    if (this.LIZJ <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.LIZIZ = handlerThread;
                    handlerThread.start();
                    this.LIZ = new BPEAHandler(C786410Ut5.W2(this.LIZIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ() {
        synchronized (this.LIZLLL) {
            try {
                this.LIZIZ.quit();
                this.LIZIZ = null;
                this.LIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(Runnable runnable) {
        synchronized (this.LIZLLL) {
            try {
                LIZ();
                C786410Ut5.LJJZZIII(this.LIZ, runnable);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
