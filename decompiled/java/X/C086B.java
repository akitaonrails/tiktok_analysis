package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.086B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086B implements ThreadFactory {
    public final String LL;
    public final int LLILLJJLI;
    public final AtomicInteger LLILLL = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append('-');
        sbLIZ.append(this.LLILLL.incrementAndGet());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return new BPEAThread(runnable, strLIZIZ) { // from class: X.086A
            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("LiveThreadManager$LiveThreadFactory@9835.newThread$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    try {
                        Process.setThreadPriority(this.LLILLJJLI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    super.run();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("LiveThreadManager$LiveThreadFactory@9835.newThread$1");
            }
        };
    }

    public C086B(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
