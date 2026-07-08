package X;

import Y.ARunnableS126S0100000_26;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1BWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206191BWf {
    public static InterfaceC1700550uM1 LIZ = new InterfaceC1700550uM1() { // from class: X.0uM0
        @Override // X.InterfaceC1700550uM1
        public final ExecutorService LIZ(final String str) {
            return new C822650WOx(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.0uLz
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    BPEAThread bPEAThread = new BPEAThread(new ARunnableS126S0100000_26(runnable, 71));
                    ThreadMethodProxy.setName(bPEAThread, str);
                    return bPEAThread;
                }
            });
        }
    };
    public static InterfaceC20024213Wm LIZIZ;
    public static boolean LIZJ;
}
