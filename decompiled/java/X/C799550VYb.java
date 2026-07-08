package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799550VYb extends C09AY implements Function0<ExecutorService> {
    public C799550VYb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
        c2123408To.LIZIZ = "lego_cpu";
        c2123408To.LIZJ = C799570VYd.LIZ();
        c2123408To.LJI = new ThreadFactory() { // from class: X.0NBf
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new BPEAThread(runnable);
            }
        };
        c2123408To.LIZLLL = new PriorityBlockingQueue(128);
        return C823050WQl.LIZ(new C2123508Tp(c2123408To));
    }
}
