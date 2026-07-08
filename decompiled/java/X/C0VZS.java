package X;

import Y.ARunnableS113S0100000_13;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.aweme.legoImp.task.ArsenalPreloadInitTask;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VZS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZS extends C09AY implements Function0<C0VZR> {
    public C0VZS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VZR] */
    @Override // kotlin.jvm.functions.Function0
    public final C0VZR invoke() {
        return new InterfaceC1700550uM1() { // from class: X.0VZR
            @Override // X.InterfaceC1700550uM1
            public final ExecutorService LIZ(final String str) {
                ArsenalPreloadInitTask.LLILLJJLI.getClass();
                C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
                c2123408To.LIZIZ = str;
                c2123408To.LJFF = 60L;
                c2123408To.LIZJ = 1;
                c2123408To.LJI = new ThreadFactory() { // from class: X.0Uv4
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        BPEAThread bPEAThread = new BPEAThread(new ARunnableS113S0100000_13(runnable, 108));
                        ThreadMethodProxy.setName(bPEAThread, str);
                        return bPEAThread;
                    }
                };
                return C823050WQl.LIZ(new C2123508Tp(c2123408To));
            }
        };
    }
}
