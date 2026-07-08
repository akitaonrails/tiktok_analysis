package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0Vqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810560Vqw {
    public static ExecutorService LIZ;
    public static BPEAHandler LIZIZ;

    public static void LIZIZ() {
        ExecutorService executorService = LIZ;
        if (executorService == null || executorService.isTerminated() || LIZIZ == null) {
            LIZ = (ExecutorService) C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2);
            LIZIZ = new BPEAHandler(Looper.getMainLooper());
        }
    }

    public static void LIZ(Runnable runnable) {
        LIZIZ();
        LIZIZ.removeCallbacks(runnable);
    }

    public static void LIZJ(Runnable runnable) {
        LIZIZ();
        BPEAHandler bPEAHandler = LIZIZ;
        if (bPEAHandler != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, runnable);
        }
    }

    public static void LJ(Runnable runnable) {
        LIZIZ();
        try {
            LIZ.execute(runnable);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(Runnable runnable, int i) {
        LIZIZ();
        BPEAHandler bPEAHandler = LIZIZ;
        if (bPEAHandler != null) {
            C786410Ut5.LJLIIL(i, bPEAHandler, runnable);
        }
    }
}
