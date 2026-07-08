package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0V6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ThreadFactoryC792480V6w implements ThreadFactory {
    public final String LL;

    public ThreadFactoryC792480V6w(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("APM6-");
        sbLIZ.append(str);
        this.LL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("creating newThread ");
            sbLIZ.append(this.LL);
            C792910V8n.LIZ("APM-AsyncTask", C2188811AlT.LIZIZ(sbLIZ));
        }
        return new BPEAThread(new Runnable() { // from class: X.0V6v
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SingleThreadFactory@a33.newThread$1");
                try {
                    Process.setThreadPriority(10);
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("SingleThreadFactory error when running in thread ");
                        sbLIZ2.append(this.LLILLJJLI.LL);
                        C792910V8n.LIZJ("APM-AsyncTask", C2188811AlT.LIZIZ(sbLIZ2), th);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SingleThreadFactory@a33.newThread$1");
            }
        }, this.LL);
    }
}
