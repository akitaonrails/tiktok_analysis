package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0P4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class ThreadFactoryC638870P4b implements ThreadFactory {
    public final int $t;

    public static final Thread newThread$3(ThreadFactoryC638870P4b threadFactoryC638870P4b, Runnable runnable) {
        return C589740NBc.lambda$semisugar$invoke$lambda$0$0(runnable);
    }

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

    public ThreadFactoryC638870P4b(int i) {
        this.$t = i;
    }

    public static final Thread newThread$0(ThreadFactoryC638870P4b threadFactoryC638870P4b, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setName(bPEAThread, "VECameraCapture-Background-Thread");
        return bPEAThread;
    }

    public static final Thread newThread$1(ThreadFactoryC638870P4b threadFactoryC638870P4b, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setName(bPEAThread, "launch_sleep_detector");
        return bPEAThread;
    }

    public static final Thread newThread$2(ThreadFactoryC638870P4b threadFactoryC638870P4b, Runnable runnable) {
        return new BPEAThread(runnable, "SignalChannelScheduler");
    }
}
