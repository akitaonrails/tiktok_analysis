package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0YCS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YCS extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ C0YCR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YCS(C2185208hG c2185208hG, C0YCR c0ycr) {
        super(c2185208hG);
        this.LL = c0ycr;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        this.LL.LIZJ.LIZLLL("InitMetricsHelper", th);
    }
}
