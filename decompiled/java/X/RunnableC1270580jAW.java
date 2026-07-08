package X;

import Y.ARunnableS0S0513200_20;
import Y.ARunnableS120S0100000_20;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1270580jAW implements Runnable {
    public volatile ARunnableS0S0513200_20 LL;
    public InterfaceC1272490jDb LLILLJJLI;
    public final WeakReference<C1271090jBL> LLILLL;

    public final void LIZ() {
        C1270590jAX c1270590jAX;
        C1270610jAZ c1270610jAZ;
        ARunnableS0S0513200_20 aRunnableS0S0513200_20 = this.LL;
        if (aRunnableS0S0513200_20 != null) {
            this.LL = null;
            aRunnableS0S0513200_20.run();
            InterfaceC1272490jDb interfaceC1272490jDb = this.LLILLJJLI;
            if (interfaceC1272490jDb != null) {
                interfaceC1272490jDb.release();
                this.LLILLJJLI = null;
            }
            C1271090jBL c1271090jBL = this.LLILLL.get();
            if (c1271090jBL == null || (c1270590jAX = c1271090jBL.LLJJI) == null || (c1270610jAZ = c1270590jAX.LLILLJJLI) == null) {
                return;
            }
            if (c1270610jAZ.LLJJJJ()) {
                C786410Ut5.LJJZZIII(c1270610jAZ.LLLLLLLLL, new ARunnableS120S0100000_20(c1270610jAZ, 414));
            } else {
                C786410Ut5.LJJZZIII(c1270610jAZ.LLJL, new ARunnableS120S0100000_20(c1270610jAZ, 415));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MediaEngine$DelayProcessorRunnable@8fe9.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MediaEngine$DelayProcessorRunnable@8fe9.run");
    }

    public RunnableC1270580jAW(C1271090jBL c1271090jBL) {
        this.LLILLL = new WeakReference<>(c1271090jBL);
    }
}
