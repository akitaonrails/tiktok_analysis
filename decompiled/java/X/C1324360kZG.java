package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.lang.Thread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0kZG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324360kZG {
    public static final C822650WOx LIZ;
    public static final AtomicBoolean LIZIZ;

    static {
        int iMax = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
        ThreadFactory threadFactory = new ThreadFactory() { // from class: X.0jyk
            public final AtomicInteger LL = new AtomicInteger(1);
            public final C1301730jyl LLILLJJLI = new Thread.UncaughtExceptionHandler() { // from class: X.0jyl
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    C2344809Gs.LJI(th);
                }
            };

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Facebook-SDK #");
                sbLIZ.append(this.LL.getAndIncrement());
                BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
                bPEAThread.setUncaughtExceptionHandler(this.LLILLJJLI);
                return bPEAThread;
            }
        };
        C822650WOx c822650WOx = new C822650WOx(iMax, (iMax * 2) + 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), threadFactory);
        c822650WOx.allowCoreThreadTimeOut(true);
        LIZ = c822650WOx;
        LIZIZ = new AtomicBoolean();
    }
}
