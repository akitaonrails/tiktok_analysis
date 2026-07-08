package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0kIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ThreadFactoryC1314210kIt implements ThreadFactory {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable, this.LL);
        if (bPEAThread.isDaemon()) {
            bPEAThread.setDaemon(false);
        }
        ThreadMethodProxy.setPriority(bPEAThread, this.LLILLJJLI);
        bPEAThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0kJ9
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
            }
        });
        return bPEAThread;
    }

    public ThreadFactoryC1314210kIt(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
