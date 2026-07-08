package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11J5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11J5<T, U> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<U>, InterfaceC420801kM {
    public static final long serialVersionUID = -8565274649390031272L;
    public final InterfaceC19474811He<? super T> LL;
    public final InterfaceC19473011Gm<T> LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        this.LLILLJJLI.LIZ(new C11I4(this.LL, this));
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILLL) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILLL = true;
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(U u) {
        get().dispose();
        onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.set(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    public C11J5(InterfaceC19474811He<? super T> interfaceC19474811He, InterfaceC19473011Gm<T> interfaceC19473011Gm) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = interfaceC19473011Gm;
    }
}
