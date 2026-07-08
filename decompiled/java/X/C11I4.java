package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11I4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11I4<T> implements InterfaceC19474811He<T> {
    public final AtomicReference<InterfaceC420801kM> LL;
    public final InterfaceC19474811He<? super T> LLILLJJLI;

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LLILLJJLI.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.replace(this.LL, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        this.LLILLJJLI.onSuccess(t);
    }

    public C11I4(InterfaceC19474811He interfaceC19474811He, AtomicReference atomicReference) {
        this.LL = atomicReference;
        this.LLILLJJLI = interfaceC19474811He;
    }
}
