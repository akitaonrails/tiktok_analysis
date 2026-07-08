package X;

import android.os.AsyncTask;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WP3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WP3 {
    public static C822650WOx LIZ;
    public static PThreadPoolExecutor LIZIZ;
    public static final C086E LIZJ = new ThreadFactory() { // from class: X.086E
        public final AtomicInteger LL = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BPEAAsyncTask #");
            sbLIZ.append(this.LL.getAndIncrement());
            return new Thread(runnable, C2188811AlT.LIZIZ(sbLIZ));
        }
    };
    public static final C0WP4 LIZLLL = new RejectedExecutionHandler() { // from class: X.0WP4
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            if (C0WP3.LIZIZ == null) {
                PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(5, 5, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C0WP3.LIZJ);
                C0WP3.LIZIZ = pThreadPoolExecutor;
                pThreadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            C0WP3.LIZIZ.execute(runnable);
        }
    };

    public static Executor LIZ(Executor executor) {
        if (C0WP5.LIZ && C0WP5.LIZLLL) {
            if (executor == PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2) {
                if (LIZ == null) {
                    C822650WOx c822650WOx = new C822650WOx(1, 20, 3L, TimeUnit.SECONDS, new SynchronousQueue(), LIZJ);
                    LIZ = c822650WOx;
                    c822650WOx.setRejectedExecutionHandler(LIZLLL);
                }
                return LIZ;
            }
            if (executor == AsyncTask.SERIAL_EXECUTOR) {
                return new C0T5D(executor);
            }
            return executor;
        }
        return executor;
    }

    public static void LIZJ(Runnable runnable) {
        if (C0WP5.LIZ && C0WP5.LIZLLL) {
            PthreadAsyncTask.execute(C0T5C.LIZ(runnable));
        } else {
            PthreadAsyncTask.execute(runnable);
        }
    }

    public static void LIZIZ(PthreadAsyncTask pthreadAsyncTask, Object... objArr) {
        if (C0WP5.LIZ && C0WP5.LIZLLL) {
            pthreadAsyncTask.executeOnExecutor(new C0T5D(AsyncTask.SERIAL_EXECUTOR), objArr);
        } else {
            pthreadAsyncTask.executeOnExecutor(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2, objArr);
        }
    }

    public static void LIZLLL(AsyncTask asyncTask, Executor executor, Object... objArr) {
        if (C0WP5.LIZ && C0WP5.LIZLLL) {
            asyncTask.executeOnExecutor(new C0T5D(executor), objArr);
        } else {
            asyncTask.executeOnExecutor(executor, objArr);
        }
    }
}
