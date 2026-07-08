package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0V48, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V48 extends C09AY implements Function0<ExecutorService> {
    public C0V48() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZIZ = "lego_low_cpu";
        c2123408ToLIZ.LIZJ = 1;
        c2123408ToLIZ.LJI = new ThreadFactory() { // from class: X.0V45
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                BPEAThread bPEAThread = new BPEAThread(runnable);
                ThreadMethodProxy.setPriority(bPEAThread, 1);
                return bPEAThread;
            }
        };
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }
}
