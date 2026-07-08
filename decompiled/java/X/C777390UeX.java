package X;

import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoreInitOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;

/* JADX INFO: renamed from: X.0UeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777390UeX {
    public static HandlerThread LIZ;
    public static BPEAHandler LIZIZ;
    public static C0UUX LIZJ;

    static {
        HandlerThread handlerThread = new HandlerThread("Live-core-Thread", LiveCoreInitOptSetting.INSTANCE.liveCoreInitPriority());
        handlerThread.start();
        new BPEAHandler(C786410Ut5.W2(handlerThread));
    }

    public static void LIZ(Runnable runnable) {
        HandlerThread handlerThread = LIZ;
        if (handlerThread != null && handlerThread.isAlive()) {
            BPEAHandler bPEAHandler = LIZIZ;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, runnable);
                return;
            }
            return;
        }
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setName(bPEAThread, "LiveCore-core-java");
        ThreadMethodProxy.setPriority(bPEAThread, 9);
        bPEAThread.start();
    }

    public static void LIZIZ(boolean z) {
        String str;
        BPEAHandler bPEAHandler;
        if (z) {
            str = "-init";
        } else {
            str = "-release";
        }
        HandlerThread handlerThread = LIZ;
        if (handlerThread != null && handlerThread.isAlive()) {
            C0UUX c0uux = LIZJ;
            if (c0uux != null && (bPEAHandler = LIZIZ) != null) {
                bPEAHandler.removeCallbacks(c0uux);
            }
            HandlerThread handlerThread2 = LIZ;
            if (handlerThread2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(handlerThread2.getName());
                sbLIZ.append(str);
                handlerThread2.setName(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        HandlerThread handlerThread3 = LIZ;
        if (handlerThread3 != null) {
            handlerThread3.quit();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Live-core");
        sbLIZ2.append(str);
        HandlerThread handlerThread4 = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ2), -19);
        handlerThread4.start();
        LIZIZ = new BPEAHandler(C786410Ut5.W2(handlerThread4));
        ThreadMethodProxy.setPriority(C786410Ut5.W2(handlerThread4).getThread(), 9);
        LIZ = handlerThread4;
    }

    public static void LIZJ(boolean z) {
        if (z) {
            C0UUX c0uux = C0UUX.LL;
            BPEAHandler bPEAHandler = LIZIZ;
            if (bPEAHandler != null) {
                C786410Ut5.LJLIIL(30000L, bPEAHandler, c0uux);
            }
            LIZJ = c0uux;
            return;
        }
        HandlerThread handlerThread = LIZ;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        LIZIZ = null;
        LIZJ = null;
    }
}
