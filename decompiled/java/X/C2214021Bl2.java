package X;

import Y.ACallableS436S0100000_34;
import Y.ARunnableS42S0400000_34;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.1Bl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214021Bl2 {
    public static void LIZ(Handler handler, Runnable runnable) {
        ACallableS436S0100000_34 aCallableS436S0100000_34 = new ACallableS436S0100000_34(runnable, 2);
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            try {
                aCallableS436S0100000_34.call();
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        C2214051Bl5 c2214051Bl5 = new C2214051Bl5();
        C2214041Bl4 c2214041Bl4 = new C2214041Bl4();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!C786410Ut5.LJJZZIII(handler, new ARunnableS42S0400000_34(c2214051Bl5, aCallableS436S0100000_34, c2214041Bl4, countDownLatch, 0))) {
            new Exception("Handler is invalid");
            countDownLatch.countDown();
        }
        C2214031Bl3 c2214031Bl3 = new C2214031Bl3(countDownLatch);
        boolean z = false;
        while (true) {
            try {
                c2214031Bl3.LIZ.await();
                break;
            } catch (InterruptedException e2) {
                TryCatchGuardChecker.doCheck(e2);
                z = true;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
        if (c2214041Bl4.LIZ != null) {
            RuntimeException runtimeException = new RuntimeException(c2214041Bl4.LIZ);
            StackTraceElement[] stackTrace = c2214041Bl4.LIZ.getStackTrace();
            StackTraceElement[] stackTrace2 = runtimeException.getStackTrace();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + stackTrace2.length];
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, stackTrace.length);
            System.arraycopy(stackTrace2, 0, stackTraceElementArr, stackTrace.length, stackTrace2.length);
            runtimeException.setStackTrace(stackTraceElementArr);
            throw runtimeException;
        }
    }
}
