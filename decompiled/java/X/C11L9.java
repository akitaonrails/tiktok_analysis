package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11L9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11L9<T, U> extends AtomicReference<InterfaceC420801kM> implements C11IH<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -2187421758664251153L;
    public final C11IH<? super T> LL;
    public final C11LA<U> LLILLJJLI = new C11LA<>(this);

    @Override // X.C11IH
    public final void onComplete() {
        C11NC.cancel(this.LLILLJJLI);
        C11JE c11je = C11JE.DISPOSED;
        if (getAndSet(c11je) != c11je) {
            this.LL.onComplete();
        }
    }

    public final void LIZ() {
        if (C11JE.dispose(this)) {
            this.LL.onComplete();
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
        C11NC.cancel(this.LLILLJJLI);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    public C11L9(C11IH<? super T> c11ih) {
        this.LL = c11ih;
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        C11NC.cancel(this.LLILLJJLI);
        C11JE c11je = C11JE.DISPOSED;
        if (getAndSet(c11je) != c11je) {
            this.LL.onError(th);
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        C11NC.cancel(this.LLILLJJLI);
        C11JE c11je = C11JE.DISPOSED;
        if (getAndSet(c11je) != c11je) {
            this.LL.onSuccess(t);
        }
    }
}
