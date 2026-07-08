package X;

import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImpl.task.ColdBootRejectStrategyV2;

/* JADX INFO: renamed from: X.0Xfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class ChoreographerFrameCallbackC854650Xfr implements Choreographer.FrameCallback {
    public final int $t;
    public Object l0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.$t) {
            case 0:
                doFrame$0(this, j);
                break;
            case 1:
                doFrame$1(this, j);
                break;
            case 2:
                doFrame$2(this, j);
                break;
        }
    }

    public ChoreographerFrameCallbackC854650Xfr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void doFrame$0(ChoreographerFrameCallbackC854650Xfr choreographerFrameCallbackC854650Xfr, long j) {
        ((ColdBootRejectStrategyV2) choreographerFrameCallbackC854650Xfr.l0).LIZ();
    }

    public static final void doFrame$1(ChoreographerFrameCallbackC854650Xfr choreographerFrameCallbackC854650Xfr, long j) {
        ColdBootRejectStrategyV2 coldBootRejectStrategyV2 = (ColdBootRejectStrategyV2) choreographerFrameCallbackC854650Xfr.l0;
        coldBootRejectStrategyV2.getClass();
        C799900VZk c799900VZk = C799900VZk.LIZ;
        C800290VaN c800290VaN = coldBootRejectStrategyV2.LLILLJJLI;
        c799900VZk.getClass();
        coldBootRejectStrategyV2.LL = C799900VZk.LIZ(c800290VaN);
    }

    public static final void doFrame$2(ChoreographerFrameCallbackC854650Xfr choreographerFrameCallbackC854650Xfr, long j) {
        C0V2A c0v2a = (C0V2A) choreographerFrameCallbackC854650Xfr.l0;
        if (c0v2a.LJIIJJI == -1) {
            c0v2a.LJIIJJI = j;
        }
        c0v2a.getClass();
        C0V2A c0v2a2 = (C0V2A) choreographerFrameCallbackC854650Xfr.l0;
        c0v2a2.LJIILIIL++;
        if (c0v2a2.LIZIZ) {
            C786410Ut5.v2().postFrameCallback(choreographerFrameCallbackC854650Xfr);
        }
        C0V2A c0v2a3 = (C0V2A) choreographerFrameCallbackC854650Xfr.l0;
        long j2 = c0v2a3.LJIIL;
        if (j2 > 0) {
            long j3 = j - j2;
            if (j3 / 1000000 > 0) {
                synchronized (c0v2a3) {
                    try {
                        if (c0v2a3.LJII.size() > 20000) {
                            c0v2a3.LJII.poll();
                        }
                        c0v2a3.LJII.add(Integer.valueOf(((int) j3) / 10000));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        ((C0V2A) choreographerFrameCallbackC854650Xfr.l0).LJIIL = j;
    }
}
