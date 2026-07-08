package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0By2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305360By2 {
    public static final C305360By2 LIZIZ = new C305360By2();
    public static final int LIZJ;
    public static final int LIZLLL;
    public final ExecutorC305340By0 LIZ = new Executor() { // from class: X.0By0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
        }
    };

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        LIZJ = iAvailableProcessors + 1;
        LIZLLL = (iAvailableProcessors * 2) + 1;
    }
}
