package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0ufU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712620ufU extends AbstractC23273099z implements CoroutineExceptionHandler {
    public C1712620ufU(C2185208hG c2185208hG) {
        super(c2185208hG);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoroutineExceptionHandler: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
