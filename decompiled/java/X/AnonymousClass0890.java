package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0890, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0890 implements Thread.UncaughtExceptionHandler {
    public boolean LIZ;
    public Thread.UncaughtExceptionHandler LIZIZ;
    public final List<AnonymousClass0897> LIZJ = new LinkedList();

    public static boolean LIZIZ(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (!(th instanceof OutOfMemoryError)) {
            try {
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            if (i > 20) {
                return false;
            }
            i++;
            th = th.getCause();
            if (th == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean LIZ(Thread thread, Throwable th) {
        try {
            synchronized (this.LIZJ) {
                try {
                    Iterator<AnonymousClass0897> it2 = this.LIZJ.iterator();
                    while (it2.hasNext()) {
                        try {
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            th2.toString();
                        }
                        if (it2.next().LIZ(thread, th)) {
                            return true;
                        }
                    }
                    return false;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th3) {
            return false;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            if (!LIZIZ(th) && LIZ(thread, th)) {
                if (thread != null && thread.getName().equals("main")) {
                    while (true) {
                        try {
                            Looper.loop();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (LIZIZ(e) || !LIZ(thread, e)) {
                                uncaughtExceptionHandler = this.LIZIZ;
                                if (uncaughtExceptionHandler == null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    uncaughtExceptionHandler = this.LIZIZ;
                    if (uncaughtExceptionHandler == null && uncaughtExceptionHandler != this) {
                        uncaughtExceptionHandler.uncaughtException(thread, e);
                        return;
                    }
                    return;
                }
                return;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.LIZIZ;
            if (uncaughtExceptionHandler2 != null && uncaughtExceptionHandler2 != this) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.LIZIZ;
            if (uncaughtExceptionHandler3 != null && uncaughtExceptionHandler3 != this) {
                uncaughtExceptionHandler3.uncaughtException(thread, th2);
            }
        }
    }
}
