package X;

import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.08hE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2185008hE {
    public static final void LIZ(final CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        Iterator<CoroutineExceptionHandler> it2 = C2184908hD.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LJJ(coroutineContext, th);
            } catch (C2185308hH unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C13SZ.LIZ(runtimeException, th);
                }
                Thread threadU3 = C786410Ut5.u3();
                threadU3.getUncaughtExceptionHandler().uncaughtException(threadU3, runtimeException);
            }
        }
        try {
            C13SZ.LIZ(th, new RuntimeException(coroutineContext) { // from class: X.082X
                public final transient CoroutineContext LL;

                @Override // java.lang.Throwable
                public Throwable fillInStackTrace() {
                    setStackTrace(new StackTraceElement[0]);
                    return this;
                }

                @Override // java.lang.Throwable
                public String getLocalizedMessage() {
                    return this.LL.toString();
                }

                {
                    this.LL = coroutineContext;
                }
            });
        } catch (Throwable unused2) {
        }
        Thread threadU32 = C786410Ut5.u3();
        threadU32.getUncaughtExceptionHandler().uncaughtException(threadU32, th);
    }
}
