package X;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.086F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086F {
    public static Executor LIZJ;
    public static final C086F LIZ = new C086F();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20590084u());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C083X());

    public static boolean LIZ() {
        return Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
    }

    public static void LIZLLL(Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        C01GW c01gw = LIZLLL;
        if (Intrinsics.LJFF(looperMyLooper, ((Handler) c01gw.getValue()).getLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) c01gw.getValue(), runnable);
        }
    }

    public static void LJ(Executor executor) {
        LIZJ = executor;
    }

    public static void LJFF(Runnable runnable) {
        Executor executorLIZ = LIZJ;
        if (executorLIZ == null) {
            executorLIZ = C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2);
        }
        executorLIZ.execute(runnable);
    }

    public static void LJI(final Function0 function0) {
        LJFF(new Runnable() { // from class: X.07z0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ThreadUtils@353b.runInBackground$runnable$1");
                try {
                    function0.invoke();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ThreadUtils@353b.runInBackground$runnable$1");
            }
        });
    }

    public static void LJII(Runnable runnable) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZIZ.getValue(), runnable);
        }
    }

    public static void LIZIZ(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, (Handler) LIZIZ.getValue(), runnable);
    }

    public static void LIZJ(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, (Handler) LIZLLL.getValue(), runnable);
    }
}
