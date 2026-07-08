package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08D6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08D6 extends C08DB {
    public final Object LIZ = new Object();
    public final ExecutorService LIZIZ = C786410Ut5.e4(4, new ThreadFactory() { // from class: X.08D7
        public final AtomicInteger LL = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            ThreadMethodProxy.setName(thread, C786410Ut5.j4("arch_disk_io_%d", new Object[]{Integer.valueOf(this.LL.getAndIncrement())}));
            return thread;
        }
    });
    public volatile Handler LIZJ;

    @Override // X.C08DB
    public final boolean LIZIZ() {
        return Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }

    public static Handler LIZLLL(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            return new Handler(looper);
        }
    }

    @Override // X.C08DB
    public final void LIZJ(Runnable runnable) {
        if (this.LIZJ == null) {
            synchronized (this.LIZ) {
                try {
                    if (this.LIZJ == null) {
                        this.LIZJ = LIZLLL(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C786410Ut5.LJJZZIII(this.LIZJ, runnable);
    }
}
