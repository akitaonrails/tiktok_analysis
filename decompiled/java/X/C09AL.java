package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.09AL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09AL implements CoroutineExceptionHandler {
    public final C2185208hG LL = CoroutineExceptionHandler.LJJLIL;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y<CoroutineExceptionHandler> getKey() {
        return this.LL;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        return (E) C09A1.LIZIZ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        return C09A1.LIZJ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return C09A1.LIZLLL(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C09A1.LIZ(this, r, function2);
    }
}
