package X;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0bKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969310bKb {
    public static final C969310bKb LIZLLL;
    public static final C1701780uO0 LJ;
    public final BPEAHandler LIZ;
    public final Looper LIZIZ;
    public final HandlerThread LIZJ;

    static {
        C969310bKb c969310bKb = C969320bKc.LIZ;
        LIZLLL = c969310bKb;
        LJ = C1701940uOG.LIZ(C786410Ut5.W2(c969310bKb.LIZJ));
    }

    public C969310bKb() {
        HandlerThread handlerThread = new HandlerThread("Link-Mic-Triones-Thread");
        handlerThread.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LIZIZ = C786410Ut5.W2(handlerThread);
        this.LIZJ = handlerThread;
    }

    public final void LIZ(Runnable runnable) {
        if (!this.LIZJ.isAlive()) {
            C1CC2.LIZ("triones thread not alive", new Throwable());
        }
        C786410Ut5.LJJZZIII(this.LIZ, runnable);
    }
}
