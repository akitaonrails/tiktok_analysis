package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11OD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11OD<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RN LLILZ;
    public InterfaceC420801kM LLILZIL;
    public C11OE LLILZLL;
    public volatile long LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZIL.dispose();
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        C11OE c11oe = this.LLILZLL;
        if (c11oe != null) {
            c11oe.dispose();
            c11oe.run();
        }
        this.LL.onComplete();
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLIZLLLIL) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        C11OE c11oe = this.LLILZLL;
        if (c11oe != null) {
            c11oe.dispose();
        }
        this.LLIZLLLIL = true;
        this.LL.onError(th);
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLIZLLLIL) {
            return;
        }
        long j = this.LLIZ + 1;
        this.LLIZ = j;
        C11OE c11oe = this.LLILZLL;
        if (c11oe != null) {
            c11oe.dispose();
        }
        C11OE c11oe2 = new C11OE(t, j, this);
        this.LLILZLL = c11oe2;
        c11oe2.setResource(this.LLILZ.LIZJ(c11oe2, this.LLILLJJLI, this.LLILLL));
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZIL, interfaceC420801kM)) {
            this.LLILZIL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11OD(C11PI c11pi, long j, TimeUnit timeUnit, C11RN c11rn) {
        this.LL = c11pi;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11rn;
    }
}
