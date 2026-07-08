package X;

import Y.ARunnableS18S0100100_13;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0V3A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V3A implements C0V3D {
    public volatile HandlerThread LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 158));

    public final void LIZJ() {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = new HandlerThread("trace-log-task");
                        HandlerThread handlerThread = this.LIZ;
                        if (handlerThread != null) {
                            handlerThread.start();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C0V3D
    public final void LIZ() {
        LIZJ();
    }

    @Override // X.C0V3D
    public final void LIZIZ(long j, ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        Thread thread;
        Looper looper;
        if (j == 0) {
            Thread threadU3 = C786410Ut5.u3();
            Handler handler = (Handler) this.LIZIZ.getValue();
            if (handler != null && (looper = handler.getLooper()) != null) {
                thread = looper.getThread();
            } else {
                thread = null;
            }
            if (threadU3 == thread) {
                aRunnableS18S0100100_13.run();
                return;
            }
        }
        Handler handler2 = (Handler) this.LIZIZ.getValue();
        if (handler2 == null) {
            return;
        }
        C786410Ut5.LJLIIL(j, handler2, aRunnableS18S0100100_13);
    }
}
