package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.086H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086H implements ThreadFactory {
    public final C00GJ LL;
    public final AtomicInteger LLILLJJLI = new AtomicInteger(0);

    public C086H(C00GJ c00gj) {
        this.LL = c00gj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECPbDecode");
        sbLIZ.append('-');
        sbLIZ.append(this.LLILLJJLI.incrementAndGet());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return new BPEAThread(runnable, strLIZIZ) { // from class: X.086G
            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("ECExtendPriorityThreadFactory@2a4e.newThread$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    Integer linuxPriority = this.LL.getLinuxPriority();
                    if (linuxPriority != null) {
                        Process.setThreadPriority(linuxPriority.intValue());
                    }
                    super.run();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("ECExtendPriorityThreadFactory@2a4e.newThread$1");
            }
        };
    }
}
