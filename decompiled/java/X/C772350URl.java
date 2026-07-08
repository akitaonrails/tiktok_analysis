package X;

import Y.ARunnableS17S1200000_12;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCreateRoomRequestOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;

/* JADX INFO: renamed from: X.0URl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772350URl {
    public static final C772350URl LIZ = new C772350URl();
    public static final C11NJ LIZIZ = new C11NJ();
    public static final C557050Lt1 LIZJ = new C557050Lt1(false);
    public static HandlerThread LIZLLL;
    public static BPEAHandler LJ;

    public final synchronized void LIZIZ() {
        if (LiveCreateRoomRequestOptSetting.INSTANCE.isEnable()) {
            LIZJ.LIZJ(false);
            try {
                LIZIZ.LJ();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LiveCreateRoomOptHelper", "resetValue", e);
            }
            BPEAHandler bPEAHandler = LJ;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = LIZLLL;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            LIZLLL = null;
            LJ = null;
        }
    }

    public final synchronized void LIZ(ARunnableS17S1200000_12 aRunnableS17S1200000_12) {
        LiveCreateRoomRequestOptSetting liveCreateRoomRequestOptSetting = LiveCreateRoomRequestOptSetting.INSTANCE;
        if (liveCreateRoomRequestOptSetting.isEnable() && LIZJ.LIZIZ()) {
            if (liveCreateRoomRequestOptSetting.getValue() == 1) {
                if (LIZLLL == null) {
                    HandlerThread handlerThread = new HandlerThread("live-create-room-request", -19);
                    handlerThread.start();
                    LJ = new BPEAHandler(C786410Ut5.W2(handlerThread));
                    ThreadMethodProxy.setPriority(C786410Ut5.W2(handlerThread).getThread(), 9);
                    LIZLLL = handlerThread;
                }
            } else if (LJ == null) {
                LJ = new BPEAHandler(Looper.getMainLooper());
            }
            BPEAHandler bPEAHandler = LJ;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            BPEAHandler bPEAHandler2 = LJ;
            if (bPEAHandler2 != null) {
                C786410Ut5.LJLIIL(3000L, bPEAHandler2, aRunnableS17S1200000_12);
            }
        }
    }
}
