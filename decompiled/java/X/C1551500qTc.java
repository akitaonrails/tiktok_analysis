package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0qTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551500qTc {
    public C21172217tI LIZ;
    public Executor LIZIZ;
    public ExecutorC1551550qTh LIZJ;
    public int LIZLLL;

    public final Executor LIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = C786410Ut5.i4(new ThreadFactoryC1554430qYL(1));
        }
        return this.LIZIZ;
    }

    public static void LIZIZ(Runnable runnable) {
        C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2).execute(runnable);
    }
}
