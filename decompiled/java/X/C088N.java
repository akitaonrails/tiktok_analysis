package X;

import java.lang.Thread;

/* JADX INFO: renamed from: X.088N, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088N {
    public static boolean LIZ;
    public static Thread.UncaughtExceptionHandler LIZIZ;

    public static boolean LIZ(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().getName().contains("java.lang.ArrayIndexOutOfBoundsException") || th.getMessage() == null || ((!th.getMessage().contains("length=0; index=1") && !th.getMessage().contains("Array index out of range:")) || (stackTrace = th.getStackTrace()) == null)) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "collectComponentCallbacks".equals(stackTraceElement.getMethodName())) {
                C814290Vwx.LIZIZ.ensureNotReachHere(th, "BootCrashFix");
                return true;
            }
        }
        return false;
    }
}
