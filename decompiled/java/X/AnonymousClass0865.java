package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0865, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0865 implements ThreadFactory {
    public final String LL;
    public final int LLILLJJLI;
    public final AtomicInteger LLILLL = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append('#');
        sbLIZ.append(this.LLILLL.getAndIncrement());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        BPEAThread bPEAThread = new BPEAThread(runnable, strLIZIZ) { // from class: X.0864
            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("ApiThreadFactory@9bd8.newThread$result$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    bpea_origin_run();
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("ApiThreadFactory@9bd8.newThread$result$1");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    throw th;
                }
            }

            public final void bpea_origin_run() {
                Object c098200Yq;
                try {
                    try {
                        Process.setThreadPriority(this.LLILLJJLI);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    super.run();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (!C2179971ATj.LIZ(th2)) {
                        throw th2;
                    }
                }
            }
        };
        bPEAThread.setDaemon(false);
        return bPEAThread;
    }

    public AnonymousClass0865(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
