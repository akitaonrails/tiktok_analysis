package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301710jyj extends C09AY implements Function0<ExecutorService> {
    public C1301710jyj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ExecutorService invoke() {
        return C786410Ut5.i4(new ThreadFactory() { // from class: X.0jyi
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                BPEAThread bPEAThread = new BPEAThread(runnable, "myna-image-request-thread");
                if (bPEAThread.isDaemon()) {
                    bPEAThread.setDaemon(false);
                }
                ThreadMethodProxy.setPriority(bPEAThread, 10);
                return bPEAThread;
            }
        });
    }
}
