package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0V4A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4A extends C09AY implements Function0<ExecutorService> {
    public C0V4A() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZIZ = "lego_io";
        c2123408ToLIZ.LIZJ = 2;
        c2123408ToLIZ.LJI = new ThreadFactory() { // from class: X.0NBe
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new BPEAThread(runnable);
            }
        };
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }
}
