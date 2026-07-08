package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.087f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC20653087f implements ThreadFactory {
    public final String LL;
    public final C00GL LLILLJJLI;
    public final AtomicInteger LLILLL;

    public ThreadFactoryC20653087f() {
        C00GL c00gl = C00GL.NORMAL;
        this.LL = "TTImmediateExecutors";
        this.LLILLJJLI = c00gl;
        this.LLILLL = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append('-');
        sbLIZ.append(this.LLILLL.incrementAndGet());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return new BPEAThread(runnable, strLIZIZ) { // from class: X.087e
            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("ECThreadFactory@3398.newThread$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    C00GL c00gl = this.LLILLJJLI;
                    if (c00gl == C00GL.LOW) {
                        Process.setThreadPriority(10);
                    } else if (c00gl == C00GL.HIGH) {
                        Process.setThreadPriority(-4);
                    }
                    super.run();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("ECThreadFactory@3398.newThread$1");
            }
        };
    }
}
