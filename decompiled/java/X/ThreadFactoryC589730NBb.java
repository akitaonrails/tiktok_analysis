package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0NBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ThreadFactoryC589730NBb implements ThreadFactory {
    public static final ThreadFactoryC589730NBb LL = new ThreadFactoryC589730NBb();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new BPEAThread(runnable, "Live-Pitaya-Thread");
    }
}
