package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.06q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1730106q3 extends AbstractC23273099z implements CoroutineExceptionHandler {
    public C1730106q3(C2185208hG c2185208hG) {
        super(c2185208hG);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        C1AF0.LJ(th);
        C309160C9y.LIZJ("ChatListActor", th);
    }
}
