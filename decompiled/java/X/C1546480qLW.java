package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0qLW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546480qLW extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ InterfaceC1506990pJp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546480qLW(C2185208hG c2185208hG, C1547300qMq c1547300qMq) {
        super(c2185208hG);
        this.LL = c1547300qMq;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        this.LL.LIZ(th.getMessage());
    }
}
