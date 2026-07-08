package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11J9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11J9<T, U> extends AtomicReference<InterfaceC420801kM> implements C11IH<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -5955289211445418871L;
    public final C11IH<? super T> LL;
    public final C11JA<T, U> LLILLJJLI = new C11JA<>(this);
    public final C11ID<? extends T> LLILLL;
    public final C11IS<T> LLILZ;

    @Override // X.C11IH
    public final void onComplete() {
        C11JE.dispose(this.LLILLJJLI);
        C11JE c11je = C11JE.DISPOSED;
        if (getAndSet(c11je) != c11je) {
            this.LL.onComplete();
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
        C11JE.dispose(this.LLILLJJLI);
        C11IS<T> c11is = this.LLILZ;
        if (c11is != null) {
            C11JE.dispose(c11is);
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        C11JE.dispose(this.LLILLJJLI);
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
        C11JE.dispose(this.LLILLJJLI);
        C11JE c11je = C11JE.DISPOSED;
        if (getAndSet(c11je) != c11je) {
            this.LL.onSuccess(t);
        }
    }

    public C11J9(C11IH<? super T> c11ih, C11ID<? extends T> c11id) {
        C11IS<T> c11is;
        this.LL = c11ih;
        this.LLILLL = c11id;
        if (c11id != null) {
            c11is = new C11IS<>(c11ih);
        } else {
            c11is = null;
        }
        this.LLILZ = c11is;
    }
}
