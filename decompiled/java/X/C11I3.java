package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11I3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11I3<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T> {
    public static final long serialVersionUID = 2071387740092105509L;
    public final InterfaceC19474811He<? super T> LL;

    public C11I3(InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LL = interfaceC19474811He;
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        this.LL.onSuccess(t);
    }
}
