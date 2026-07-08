package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838660xwm implements InterfaceC1677690tl9 {
    public final C05ZL LL = C1691250u71.LIZ(1.0f);

    @Override // X.InterfaceC1677690tl9
    public final float LJLJI() {
        return this.LL.LIZIZ();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y getKey() {
        return InterfaceC1677690tl9.LJLJJI;
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
