package X;

import java.lang.Thread;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0WQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQ4 {
    public static volatile C0WQ3 LIZ = new Thread.UncaughtExceptionHandler() { // from class: X.0WQ3
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("thread ");
            sbLIZ.append(thread.getName());
            sbLIZ.append(" uncaught exception");
            C823280WRi.LIZJ(C2188811AlT.LIZIZ(sbLIZ), "thread_crash", th);
        }
    };
    public static final ExecutorService LIZIZ = C786410Ut5.c4(new ThreadFactoryC854690Xfv(6));

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0WQ3] */
    static {
        C807400Vlq.LJFF(new ThreadFactoryC854690Xfv(7));
    }
}
