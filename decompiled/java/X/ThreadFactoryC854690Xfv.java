package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.aweme.keepalive.KeepAliveReceiver;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0Xfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class ThreadFactoryC854690Xfv implements ThreadFactory {
    public final int $t;

    public static final Thread newThread$4(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        return AFwS200S0000000_13.lambda$semisugar$invoke$lambda$1$0$0(runnable);
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
            case 4:
                return newThread$4(this, runnable);
            case 5:
                return newThread$5(this, runnable);
            case 6:
                return newThread$6(this, runnable);
            case 7:
                return newThread$7(this, runnable);
            case 8:
                return newThread$8(this, runnable);
            case BdTuring.TYPE_ECAF /* 9 */:
                return newThread$9(this, runnable);
            default:
                return null;
        }
    }

    public ThreadFactoryC854690Xfv(int i) {
        this.$t = i;
    }

    public static final Thread newThread$0(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        ThreadMethodProxy.setName(threadNewThread, "TTLivePlayer2");
        return threadNewThread;
    }

    public static final Thread newThread$1(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        ThreadMethodProxy.setName(threadNewThread, "TTLivePlayer3");
        return threadNewThread;
    }

    public static final Thread newThread$2(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setName(bPEAThread, "Alog_newthreadpoolimpl");
        if (((Boolean) C296490Bjj.LIZIZ.getValue()).booleanValue()) {
            ThreadMethodProxy.setPriority(bPEAThread, 1);
        }
        return bPEAThread;
    }

    public static final Thread newThread$3(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setName(bPEAThread, "Mobius_thread");
        ThreadMethodProxy.setPriority(bPEAThread, 5);
        return bPEAThread;
    }

    public static final Thread newThread$5(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        return new BPEAThread(runnable, "Apm_Log_Bypass_Store");
    }

    public static final Thread newThread$6(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PumbaaWorkerThread-");
        sbLIZ.append(bPEAThread.getId());
        ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
        bPEAThread.setUncaughtExceptionHandler(C0WQ4.LIZ);
        return bPEAThread;
    }

    public static final Thread newThread$7(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PumbaaWorkerSingleThread-");
        sbLIZ.append(bPEAThread.getId());
        ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
        bPEAThread.setUncaughtExceptionHandler(C0WQ4.LIZ);
        return bPEAThread;
    }

    public static final Thread newThread$8(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        AtomicBoolean atomicBoolean = KeepAliveReceiver.LIZ;
        BPEAThread bPEAThread = new BPEAThread(runnable, "keep-alive-hold");
        bPEAThread.setDaemon(true);
        return bPEAThread;
    }

    public static final Thread newThread$9(ThreadFactoryC854690Xfv threadFactoryC854690Xfv, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setName(bPEAThread, "deximage_monitor");
        return bPEAThread;
    }
}
