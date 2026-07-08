package X;

import Y.ARunnableS104S0200000_35;
import Y.ARunnableS135S0100000_35;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1DO6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DO6 {
    public static volatile C1DO6 LIZIZ;
    public BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static C1DO6 LIZJ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        synchronized (C1DO6.class) {
            try {
                if (LIZIZ != null) {
                    return LIZIZ;
                }
                LIZIZ = new C1DO6();
                return LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        this.LIZ.removeCallbacksAndMessages(null);
        this.LIZ = null;
        super.finalize();
    }

    public static void LIZIZ(C1DO8 c1do8) {
        if (c1do8 == null) {
            return;
        }
        C786410Ut5.LJJZZIII(LIZJ().LIZ, new ARunnableS135S0100000_35(c1do8, 23));
    }

    public static void LIZ(C1DO7 c1do7, UIAnnotationErrorCode uIAnnotationErrorCode) {
        if (c1do7 == null) {
            return;
        }
        C786410Ut5.LJJZZIII(LIZJ().LIZ, new ARunnableS104S0200000_35(c1do7, uIAnnotationErrorCode, 7));
    }
}
