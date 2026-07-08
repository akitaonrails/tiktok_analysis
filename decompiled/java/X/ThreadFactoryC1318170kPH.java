package X;

import Y.ARunnableS89S0200000_20;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0kPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ThreadFactoryC1318170kPH implements ThreadFactory {
    public final String LLILLJJLI;
    public final AtomicInteger LLILZ = new AtomicInteger(1);
    public final int LL = 10;
    public final boolean LLILLL = true;

    public ThreadFactoryC1318170kPH(String str) {
        this.LLILLJJLI = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String strLIZIZ;
        ARunnableS89S0200000_20 aRunnableS89S0200000_20 = new ARunnableS89S0200000_20(this, runnable, 7);
        if (this.LLILLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append("-");
            sbLIZ.append(this.LLILZ.getAndIncrement());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = this.LLILLJJLI;
        }
        return new BPEAThread(aRunnableS89S0200000_20, strLIZIZ);
    }
}
