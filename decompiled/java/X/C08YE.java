package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08YE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08YE {
    public static final C2232408os LIZ(final String str) {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return new C2232408os(C807400Vlq.LIZIZ(new ThreadFactory() { // from class: X.0869
            public final /* synthetic */ int LL = 1;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i = this.LL;
                String strLIZIZ = str;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (i != 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append('-');
                    sbLIZ.append(atomicInteger2.incrementAndGet());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                BPEAThread bPEAThread = new BPEAThread(runnable, strLIZIZ);
                bPEAThread.setDaemon(true);
                return bPEAThread;
            }
        }));
    }
}
