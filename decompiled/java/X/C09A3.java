package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09A3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09A3 implements CoroutineContext {
    public final Throwable LL;
    public final /* synthetic */ CoroutineContext LLILLJJLI;

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) this.LLILLJJLI.fold(r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        return (E) this.LLILLJJLI.get(interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        return this.LLILLJJLI.minusKey(interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.LLILLJJLI.plus(coroutineContext);
    }

    public C09A3(CoroutineContext coroutineContext, Throwable th) {
        this.LL = th;
        this.LLILLJJLI = coroutineContext;
    }
}
