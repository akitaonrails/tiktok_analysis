package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0qYL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class ThreadFactoryC1554430qYL implements ThreadFactory {
    public final int $t;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.$t) {
            case 0:
                return newThread$0(this, runnable);
            case 1:
                return newThread$1(this, runnable);
            case 2:
                return newThread$2(this, runnable);
            case 3:
                return newThread$3(this, runnable);
            default:
                return null;
        }
    }

    public ThreadFactoryC1554430qYL(int i) {
        this.$t = i;
    }

    public static final Thread newThread$0(ThreadFactoryC1554430qYL threadFactoryC1554430qYL, Runnable runnable) {
        return new BPEAThread(runnable, "AdaptiveScheduler");
    }

    public static final Thread newThread$1(ThreadFactoryC1554430qYL threadFactoryC1554430qYL, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setName(bPEAThread, "gecko-check-update-internal-thread");
        ThreadMethodProxy.setPriority(bPEAThread, 3);
        return bPEAThread;
    }

    public static final Thread newThread$2(ThreadFactoryC1554430qYL threadFactoryC1554430qYL, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setName(bPEAThread, "gecko-io-thread");
        ThreadMethodProxy.setPriority(bPEAThread, 3);
        return bPEAThread;
    }

    public static final Thread newThread$3(ThreadFactoryC1554430qYL threadFactoryC1554430qYL, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setName(bPEAThread, "gecko-piecemeal-thread");
        return bPEAThread;
    }
}
