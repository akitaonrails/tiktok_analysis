package X;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.095J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C095J {
    public static final void LIZ(CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            C19489211Ms.LIZIZ(th);
        } catch (Throwable th2) {
            C13SZ.LIZ(th, th2);
            C2185108hF.LIZ(coroutineContext, th);
        }
    }
}
