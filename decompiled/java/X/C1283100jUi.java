package X;

import Y.ACallableS425S0100000_20;
import Y.ARunnableS28S0400000_20;
import android.os.Handler;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0jUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283100jUi {
    public static <V> V LIZ(Handler handler, Callable<V> callable) {
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            try {
                return callable.call();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        C1283120jUk c1283120jUk = new C1283120jUk();
        C1283110jUj c1283110jUj = new C1283110jUj();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!C786410Ut5.LJJZZIII(handler, new ARunnableS28S0400000_20(c1283120jUk, callable, c1283110jUj, countDownLatch, 2))) {
            Exception exc = new Exception("Handler is invalid");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(exc.getCause());
            sbLIZ.append(" ");
            sbLIZ.append(Log.getStackTraceString(exc));
            AVLog.ioe("ThreadUtils", C2188811AlT.LIZIZ(sbLIZ));
            countDownLatch.countDown();
        }
        C1283130jUl c1283130jUl = new C1283130jUl(countDownLatch);
        boolean z = false;
        while (true) {
            try {
                c1283130jUl.LIZ.await();
                break;
            } catch (InterruptedException e2) {
                TryCatchGuardChecker.doCheck(e2);
                z = true;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
        if (c1283110jUj.LIZ == null) {
            return c1283120jUk.LIZ;
        }
        RuntimeException runtimeException = new RuntimeException(c1283110jUj.LIZ);
        StackTraceElement[] stackTrace = c1283110jUj.LIZ.getStackTrace();
        StackTraceElement[] stackTrace2 = runtimeException.getStackTrace();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + stackTrace2.length];
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, stackTrace.length);
        System.arraycopy(stackTrace2, 0, stackTraceElementArr, stackTrace.length, stackTrace2.length);
        runtimeException.setStackTrace(stackTraceElementArr);
        throw runtimeException;
    }

    public static void LIZIZ(Handler handler, Runnable runnable) {
        LIZ(handler, new ACallableS425S0100000_20(runnable, 11));
    }
}
