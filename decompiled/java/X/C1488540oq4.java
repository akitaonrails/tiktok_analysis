package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0oq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1488540oq4 {
    public static final Executor LIZ = C807400Vlq.LIZLLL(new ThreadFactory() { // from class: X.0oq3
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable);
            ThreadMethodProxy.setName(bPEAThread, "gecko-ng-event-handle-thread");
            ThreadMethodProxy.setPriority(bPEAThread, 2);
            return bPEAThread;
        }
    });
}
