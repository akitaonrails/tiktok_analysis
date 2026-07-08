package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11MB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MB extends AtomicReference<InterfaceC420801kM> implements C11IY, InterfaceC420801kM {
    public static final long serialVersionUID = -4101678820158072998L;
    public final C11IY LL;
    public final C11IV LLILLJJLI;

    @Override // X.C11IY
    public final void onComplete() {
        C11IV c11iv = this.LLILLJJLI;
        final C11IY c11iy = this.LL;
        c11iv.LIZIZ(new C11IY(this, c11iy) { // from class: X.11MC
            public final AtomicReference<InterfaceC420801kM> LL;
            public final C11IY LLILLJJLI;

            @Override // X.C11IY
            public final void onComplete() {
                this.LLILLJJLI.onComplete();
            }

            @Override // X.C11IY
            public final void onError(Throwable th) {
                this.LLILLJJLI.onError(th);
            }

            @Override // X.C11IY
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                C11JE.replace(this.LL, interfaceC420801kM);
            }

            {
                this.LL = this;
                this.LLILLJJLI = c11iy;
            }
        });
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.C11IY
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    public C11MB(C11IY c11iy, C11IV c11iv) {
        this.LL = c11iy;
        this.LLILLJJLI = c11iv;
    }
}
