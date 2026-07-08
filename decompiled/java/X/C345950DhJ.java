package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0DhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345950DhJ<T> implements InterfaceC345960DhK<T>, C05P0<T> {
    public final CoroutineContext LL;
    public final /* synthetic */ C05P0<T> LLILLJJLI;

    @Override // X.C05P0, X.C05P1
    public final T getValue() {
        return this.LLILLJJLI.getValue();
    }

    @Override // X.C05P0
    public final void setValue(T t) {
        this.LLILLJJLI.setValue(t);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public C345950DhJ(C05P0<T> c05p0, CoroutineContext coroutineContext) {
        this.LL = coroutineContext;
        this.LLILLJJLI = c05p0;
    }
}
