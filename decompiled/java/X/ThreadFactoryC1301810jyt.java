package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ThreadFactoryC1301810jyt extends AtomicLong implements ThreadFactory {
    public static final long serialVersionUID = -7789753024099756196L;
    public final String LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RxThreadFactory[");
        sbLIZ.append(this.LL);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThreadFactoryC1301810jyt(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        BPEAThread bPEAThread;
        final String str = this.LL + '-' + incrementAndGet();
        if (this.LLILLL) {
            bPEAThread = new BPEAThread(runnable, str) { // from class: X.0jyu
            };
        } else {
            bPEAThread = new BPEAThread(runnable, str);
        }
        ThreadMethodProxy.setPriority(bPEAThread, this.LLILLJJLI);
        bPEAThread.setDaemon(true);
        return bPEAThread;
    }

    public ThreadFactoryC1301810jyt(String str, int i) {
        this(str, i, false);
    }

    public ThreadFactoryC1301810jyt(String str, int i, boolean z) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }
}
