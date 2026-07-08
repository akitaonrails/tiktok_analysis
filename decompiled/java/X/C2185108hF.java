package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.08hF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2185108hF {
    public static final void LIZ(CoroutineContext coroutineContext, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.LJJLIL);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.LJJ(coroutineContext, th);
            } else {
                C2185008hE.LIZ(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C13SZ.LIZ(runtimeException, th);
                th = runtimeException;
            }
            C2185008hE.LIZ(coroutineContext, th);
        }
    }
}
