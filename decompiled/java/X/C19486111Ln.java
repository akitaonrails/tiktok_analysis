package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19486111Ln<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -622603812305745221L;
    public final InterfaceC19474811He<? super T> LL;
    public final C19486211Lo LLILLJJLI = new C19486211Lo(this);

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
        C19486211Lo c19486211Lo = this.LLILLJJLI;
        c19486211Lo.getClass();
        C11NC.cancel(c19486211Lo);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    public C19486111Ln(InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LL = interfaceC19474811He;
    }

    public final void LIZ(Throwable th) {
        InterfaceC420801kM andSet;
        InterfaceC420801kM interfaceC420801kM = get();
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM != c11je && (andSet = getAndSet(c11je)) != c11je) {
            if (andSet != null) {
                andSet.dispose();
            }
            this.LL.onError(th);
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        C19486211Lo c19486211Lo = this.LLILLJJLI;
        c19486211Lo.getClass();
        C11NC.cancel(c19486211Lo);
        InterfaceC420801kM interfaceC420801kM = get();
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM != c11je && getAndSet(c11je) != c11je) {
            this.LL.onError(th);
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        C19486211Lo c19486211Lo = this.LLILLJJLI;
        c19486211Lo.getClass();
        C11NC.cancel(c19486211Lo);
        C11JE c11je = C11JE.DISPOSED;
        if (getAndSet(c11je) != c11je) {
            this.LL.onSuccess(t);
        }
    }
}
