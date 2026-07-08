package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0sWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630330sWl extends AbstractC23273099z implements CoroutineExceptionHandler {
    public C1630330sWl(C2185208hG c2185208hG) {
        super(c2185208hG);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        String strLJZL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullWidthEffectCarouselComponent: throw message: ");
        String message = th.getMessage();
        if (message != null) {
            strLJZL = C13LN.LJZL(20, message);
        } else {
            strLJZL = null;
        }
        sbLIZ.append(strLJZL);
        C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
    }
}
