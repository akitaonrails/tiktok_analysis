package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.13kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class ThreadFactoryC20100313kn implements ThreadFactory {
    public final String LL;

    public ThreadFactoryC20100313kn(String str) {
        this.LL = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable, this.LL);
        if (bPEAThread.isDaemon()) {
            bPEAThread.setDaemon(false);
        }
        if (bPEAThread.getPriority() != 10) {
            ThreadMethodProxy.setPriority(bPEAThread, 10);
        }
        return bPEAThread;
    }
}
