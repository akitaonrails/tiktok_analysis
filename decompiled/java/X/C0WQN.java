package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WQN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQN implements ThreadFactory {
    public static final AtomicInteger LLILLL = new AtomicInteger(0);
    public final String LL;
    public final C0WQO LLILLJJLI;

    public C0WQN(String str) {
        this.LLILLJJLI = C0WQO.NORMAL;
        this.LL = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append('-');
        sbLIZ.append(LLILLL.incrementAndGet());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return new BPEAThread(runnable, strLIZIZ) { // from class: X.0WQM
            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("AccountThreadFactory@2a48.newThread$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    try {
                        C0WQO c0wqo = this.LLILLJJLI;
                        if (c0wqo == C0WQO.LOW) {
                            Process.setThreadPriority(10);
                        } else if (c0wqo == C0WQO.HIGH) {
                            Process.setThreadPriority(-4);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    super.run();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("AccountThreadFactory@2a48.newThread$1");
            }
        };
    }

    public C0WQN(String str, C0WQO c0wqo) {
        this.LLILLJJLI = C0WQO.NORMAL;
        this.LL = str;
        this.LLILLJJLI = c0wqo;
    }
}
