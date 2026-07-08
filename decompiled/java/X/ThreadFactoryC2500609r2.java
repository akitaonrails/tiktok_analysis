package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.09r2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class ThreadFactoryC2500609r2 implements ThreadFactory {
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

    public ThreadFactoryC2500609r2(int i) {
        this.$t = i;
    }

    public static final Thread newThread$0(ThreadFactoryC2500609r2 threadFactoryC2500609r2, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable, "minigame-udp-recv");
        bPEAThread.setDaemon(true);
        return bPEAThread;
    }

    public static final Thread newThread$1(ThreadFactoryC2500609r2 threadFactoryC2500609r2, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable, "pumbaa-3p-network-monitor-report");
        bPEAThread.setDaemon(true);
        return bPEAThread;
    }

    public static final Thread newThread$2(ThreadFactoryC2500609r2 threadFactoryC2500609r2, Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable, "PumbaaPerfSlaWatchdog");
        bPEAThread.setDaemon(true);
        return bPEAThread;
    }

    public static final Thread newThread$3(ThreadFactoryC2500609r2 threadFactoryC2500609r2, Runnable runnable) {
        return new BPEAThread(runnable, "Apm_Normal");
    }
}
