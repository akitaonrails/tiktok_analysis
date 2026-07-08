package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11QY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QY<T> extends AtomicLong implements InterfaceC626120Oh8<T>, InterfaceC420801kM, InterfaceC19498011Qc {
    public static final long serialVersionUID = 3764492702657003550L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RN LLILZ;
    public final C19484811La LLILZIL = new C19484811La();
    public final AtomicReference<InterfaceC420801kM> LLILZLL = new AtomicReference<>();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this.LLILZLL);
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(this.LLILZLL.get());
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.LLILZIL.dispose();
            this.LL.onComplete();
            this.LLILZ.dispose();
        }
    }

    @Override // X.InterfaceC19498011Qc
    public final void LIZ(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            C11JE.dispose(this.LLILZLL);
            this.LL.onError(new TimeoutException(C11QG.LIZ(this.LLILLJJLI, this.LLILLL)));
            this.LLILZ.dispose();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.LLILZIL.dispose();
            this.LL.onError(th);
            this.LLILZ.dispose();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                this.LLILZIL.get().dispose();
                this.LL.onNext(t);
                this.LLILZIL.replace(this.LLILZ.LIZJ(new RunnableC19497911Qb(j2, this), this.LLILLJJLI, this.LLILLL));
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this.LLILZLL, interfaceC420801kM);
    }

    public C11QY(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, long j, TimeUnit timeUnit, C11RN c11rn) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11rn;
    }
}
