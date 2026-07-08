package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0NHV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NHV extends AbstractC23273099z implements CoroutineExceptionHandler {
    public C0NHV(C2185208hG c2185208hG) {
        super(c2185208hG);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        C1AF0.LJFF(th, "GoldenHouse: message error");
        C0NH6.LJIILLIIL.LJII(new AwS553S0100000_9(th, 1768));
    }
}
