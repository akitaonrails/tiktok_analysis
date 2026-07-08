package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0p2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ThreadFactoryC1496300p2a implements ThreadFactory {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable, this.LL);
        bPEAThread.setDaemon(this.LLILLJJLI);
        return bPEAThread;
    }

    public ThreadFactoryC1496300p2a(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
