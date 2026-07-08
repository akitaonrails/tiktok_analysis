package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11Ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19489211Ms {
    public static volatile C09JN<? super Throwable> LIZ;
    public static volatile InterfaceC1487280oo2<? super C11RO, ? extends C11RO> LIZIZ;

    public static C11RO LIZ(Callable<C11RO> callable) {
        try {
            C11RO c11roCall = callable.call();
            C1701890uOB.LIZ(c11roCall, "Scheduler Callable result can't be null");
            return c11roCall;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw C11QG.LIZIZ(th);
        }
    }

    public static void LIZIZ(Throwable th) {
        C09JN<? super Throwable> c09jn = LIZ;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof C1324280kZ8) && !(th instanceof C11MF) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C0VYA)) {
            th = new C08EF(th);
        }
        if (c09jn != null) {
            try {
                c09jn.accept(th);
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                Thread threadU3 = C786410Ut5.u3();
                threadU3.getUncaughtExceptionHandler().uncaughtException(threadU3, th2);
            }
        }
        Thread threadU32 = C786410Ut5.u3();
        threadU32.getUncaughtExceptionHandler().uncaughtException(threadU32, th);
    }
}
