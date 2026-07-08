package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0lcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364880lcc extends AbstractC23273099z implements CoroutineExceptionHandler {
    public C1364880lcc(C2185208hG c2185208hG) {
        super(c2185208hG);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        C1AF0.LJFF(th, "processing quick share items exception");
    }
}
