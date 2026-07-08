package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Wq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835490Wq3 {
    public static final C0TU0 LIZ = new Executor() { // from class: X.0TU0
        public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C786410Ut5.LJJZZIII(this.LL, runnable);
        }
    };
    public static final ExecutorC835500Wq4 LIZIZ = new Executor() { // from class: X.0Wq4
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
}
