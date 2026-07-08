package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0V4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4Y implements ThreadFactory {
    public final String LL;
    public C0V4Z LLILLJJLI;

    public C0V4Y(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("APM_");
        sbLIZ.append(str);
        this.LL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return new BPEAThread(new Runnable() { // from class: X.0V4X
            public final void LIZ() {
                Process.setThreadPriority(10);
                C0V4Z c0v4z = this.LLILLJJLI.LLILLJJLI;
                if (c0v4z != null) {
                    c0v4z.LIZ(C786410Ut5.u3().getId());
                }
                try {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C791610V3n.LIZ.LIZ("APM_INNER_ERROR_async_task", th);
                    this.LLILLJJLI.getClass();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ApmInnerThreadFactory@995e.newThread$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ApmInnerThreadFactory@995e.newThread$1");
            }
        }, this.LL);
    }
}
