package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11IS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IS<T> extends AtomicReference<InterfaceC420801kM> implements C11IH<T> {
    public static final long serialVersionUID = 8663801314800248617L;
    public final C11IH<? super T> LL;

    @Override // X.C11IH
    public final void onComplete() {
        this.LL.onComplete();
    }

    public C11IS(C11IH<? super T> c11ih) {
        this.LL = c11ih;
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        this.LL.onSuccess(t);
    }
}
