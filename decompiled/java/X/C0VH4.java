package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0VH4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VH4 implements ThreadFactory {
    public final String LL;
    public final ThreadFactory LLILLJJLI = Executors.defaultThreadFactory();

    public C0VH4(String str) {
        this.LL = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.LLILLJJLI.newThread(new AnonymousClass0862(runnable));
        threadNewThread.setName(this.LL);
        return threadNewThread;
    }
}
