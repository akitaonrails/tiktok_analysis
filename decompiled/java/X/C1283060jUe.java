package X;

import Y.ACallableS425S0100000_20;
import Y.ARunnableS28S0400000_20;
import android.os.Handler;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.utils.AVLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0jUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283060jUe {
    public static final Map<String, Integer> LIZ = new HashMap();

    public static <V> V LIZ(Handler handler, Callable<V> callable) {
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            try {
                return callable.call();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        C1283080jUg c1283080jUg = new C1283080jUg();
        C1283070jUf c1283070jUf = new C1283070jUf();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!C786410Ut5.LJJZZIII(handler, new ARunnableS28S0400000_20(c1283080jUg, callable, c1283070jUf, countDownLatch, 0))) {
            Exception exc = new Exception("Handler is invalid");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(exc.getCause());
            sbLIZ.append(" ");
            sbLIZ.append(Log.getStackTraceString(exc));
            AVLog.ioe("ThreadUtils", C2188811AlT.LIZIZ(sbLIZ));
            countDownLatch.countDown();
        }
        C1283090jUh c1283090jUh = new C1283090jUh(countDownLatch);
        boolean z = false;
        while (true) {
            try {
                c1283090jUh.LIZ.await();
                break;
            } catch (InterruptedException e2) {
                TryCatchGuardChecker.doCheck(e2);
                z = true;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
        if (c1283070jUf.LIZ == null) {
            return c1283080jUg.LIZ;
        }
        RuntimeException runtimeException = new RuntimeException(c1283070jUf.LIZ);
        StackTraceElement[] stackTrace = c1283070jUf.LIZ.getStackTrace();
        StackTraceElement[] stackTrace2 = runtimeException.getStackTrace();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + stackTrace2.length];
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, stackTrace.length);
        System.arraycopy(stackTrace2, 0, stackTraceElementArr, stackTrace.length, stackTrace2.length);
        runtimeException.setStackTrace(stackTraceElementArr);
        throw runtimeException;
    }

    public static void LIZIZ(Handler handler, Runnable runnable) {
        LIZ(handler, new ACallableS425S0100000_20(runnable, 1));
    }
}
