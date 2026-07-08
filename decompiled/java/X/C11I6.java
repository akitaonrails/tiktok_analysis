package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11I6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11I6<T> extends AtomicReference<InterfaceC420801kM> implements C11IH<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 4603919676453758899L;
    public final InterfaceC19474811He<? super T> LL;
    public final InterfaceC19473011Gm<? extends T> LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.C11IH
    public final void onComplete() {
        InterfaceC420801kM interfaceC420801kM = get();
        if (interfaceC420801kM == C11JE.DISPOSED || !compareAndSet(interfaceC420801kM, null)) {
            return;
        }
        InterfaceC19473011Gm<? extends T> interfaceC19473011Gm = this.LLILLJJLI;
        final InterfaceC19474811He<? super T> interfaceC19474811He = this.LL;
        interfaceC19473011Gm.LIZ((InterfaceC19474811He<? super Object>) new InterfaceC19474811He<T>(interfaceC19474811He, this) { // from class: X.11I5
            public final InterfaceC19474811He<? super T> LL;
            public final AtomicReference<InterfaceC420801kM> LLILLJJLI;

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                this.LL.onError(th);
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM2) {
                C11JE.setOnce(this.LLILLJJLI, interfaceC420801kM2);
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(T t) {
                this.LL.onSuccess(t);
            }

            {
                this.LL = interfaceC19474811He;
                this.LLILLJJLI = this;
            }
        });
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        this.LL.onSuccess(t);
    }

    public C11I6(InterfaceC19474811He<? super T> interfaceC19474811He, InterfaceC19473011Gm<? extends T> interfaceC19473011Gm) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = interfaceC19473011Gm;
    }
}
