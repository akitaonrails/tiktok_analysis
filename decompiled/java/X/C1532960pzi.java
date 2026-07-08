package X;

import Y.ARunnableS109S0100000_9;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532960pzi {
    public static MessageQueue LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(444));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(445));
    public static final Looper LIZLLL = Looper.getMainLooper();

    public static boolean LIZ() {
        return Intrinsics.LJFF(Looper.myLooper(), LIZLLL);
    }

    public static void LIZIZ(final Runnable runnable) {
        MessageQueue messageQueue = LIZ;
        if (messageQueue != null) {
            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0pzl
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    runnable.run();
                    return false;
                }
            }, messageQueue);
        } else {
            LIZ = ((Handler) LIZJ.getValue()).getLooper().getQueue();
            LIZIZ(runnable);
        }
    }

    public static void LIZLLL(Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        C01GW c01gw = LIZJ;
        if (Intrinsics.LJFF(looperMyLooper, ((Handler) c01gw.getValue()).getLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) c01gw.getValue(), runnable);
        }
    }

    public static void LJ(Function0 function0) {
        C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2).execute(new ARunnableS109S0100000_9(function0, 157));
    }

    public static void LJFF(Runnable runnable) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZIZ.getValue(), runnable);
        }
    }

    public static void LIZJ(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, (Handler) LIZJ.getValue(), runnable);
    }

    public static boolean LJI(CountDownLatch countDownLatch, C1541080qCo c1541080qCo, Long l) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            try {
                if (l == null) {
                    countDownLatch.await();
                    return true;
                }
                long jLongValue = (l.longValue() + jCurrentTimeMillis) - System.currentTimeMillis();
                if (jLongValue <= 0) {
                    if (countDownLatch.getCount() == 0) {
                        return true;
                    }
                    return false;
                }
                return countDownLatch.await(jLongValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } while (c1541080qCo.isValid());
        return true;
    }
}
