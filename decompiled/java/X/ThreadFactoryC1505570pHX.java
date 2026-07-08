package X;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0pHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class ThreadFactoryC1505570pHX implements ThreadFactory {
    public final String LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(new Runnable() { // from class: X.0pHY
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        Process.setThreadPriority(this.LLILLJJLI.LLILLJJLI);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    runnable.run();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (!C2179971ATj.LIZ(th2)) {
                        throw th2;
                    }
                }
            }
        });
        ThreadMethodProxy.setName(bPEAThread, this.LL);
        bPEAThread.setDaemon(this.LLILLL);
        return bPEAThread;
    }

    public ThreadFactoryC1505570pHX(String str, int i) {
        this.LL = "block-thread";
        this.LLILLJJLI = 10;
        if (!TextUtils.isEmpty(str)) {
            this.LL = str;
        }
        this.LLILLJJLI = i;
        this.LLILLL = false;
    }
}
