package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11QZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QZ<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<T>, InterfaceC420801kM, InterfaceC19498011Qc {
    public static final long serialVersionUID = 3764492702657003550L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RN LLILZ;
    public final C19484811La LLILZIL = new C19484811La();
    public final AtomicLong LLILZLL = new AtomicLong();
    public final AtomicReference<InterfaceC420801kM> LLIZ = new AtomicReference<>();
    public C098D<? extends T> LLIZLLLIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this.LLIZ);
        C11JE.dispose(this);
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILZLL.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.LLILZIL.dispose();
            this.LL.onComplete();
            this.LLILZ.dispose();
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC19498011Qc
    public final void LIZ(long j) {
        if (this.LLILZLL.compareAndSet(j, Long.MAX_VALUE)) {
            C11JE.dispose(this.LLIZ);
            C098D<? extends T> c098d = this.LLIZLLLIL;
            this.LLIZLLLIL = null;
            final InterfaceC626120Oh8<? super T> interfaceC626120Oh8 = this.LL;
            c098d.LIZIZ((InterfaceC626120Oh8<? super Object>) new InterfaceC626120Oh8<T>(interfaceC626120Oh8, this) { // from class: X.11Hz
                public final InterfaceC626120Oh8<? super T> LL;
                public final AtomicReference<InterfaceC420801kM> LLILLJJLI;

                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                    this.LL.onComplete();
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    this.LL.onError(th);
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(T t) {
                    this.LL.onNext(t);
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    C11JE.replace(this.LLILLJJLI, interfaceC420801kM);
                }

                {
                    this.LL = interfaceC626120Oh8;
                    this.LLILLJJLI = this;
                }
            });
            this.LLILZ.dispose();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZLL.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.LLILZIL.dispose();
            this.LL.onError(th);
            this.LLILZ.dispose();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        long j = this.LLILZLL.get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (this.LLILZLL.compareAndSet(j, j2)) {
                this.LLILZIL.get().dispose();
                this.LL.onNext(t);
                this.LLILZIL.replace(this.LLILZ.LIZJ(new RunnableC19497911Qb(j2, this), this.LLILLJJLI, this.LLILLL));
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this.LLIZ, interfaceC420801kM);
    }

    public C11QZ(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, long j, TimeUnit timeUnit, C11RN c11rn, C098D<? extends T> c098d) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11rn;
        this.LLIZLLLIL = c098d;
    }
}
