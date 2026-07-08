package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0ESg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364880ESg extends AbstractC23273099z implements CoroutineExceptionHandler {
    public C364880ESg(C2185208hG c2185208hG) {
        super(c2185208hG);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        C0CHQ.LIZ().isDebugConfigOpen();
        C1AF0.LJFF(th, "EditorProLoaderComponent-loader-fail");
    }
}
