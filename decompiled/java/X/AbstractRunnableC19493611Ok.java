package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractRunnableC19493611Ok<T> extends AtomicReference<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = -3517602651313910099L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RO LLILZ;
    public final AtomicReference<InterfaceC420801kM> LLILZIL = new AtomicReference<>();
    public InterfaceC420801kM LLILZLL;

    public abstract void LIZ();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this.LLILZIL);
        this.LLILZLL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZLL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        C11JE.dispose(this.LLILZIL);
        LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C11JE.dispose(this.LLILZIL);
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        lazySet(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZLL, interfaceC420801kM)) {
            this.LLILZLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
            C11RO c11ro = this.LLILZ;
            long j = this.LLILLJJLI;
            C11JE.replace(this.LLILZIL, c11ro.LIZLLL(this, j, j, this.LLILLL));
        }
    }

    public AbstractRunnableC19493611Ok(C11PI c11pi, long j, TimeUnit timeUnit, C11RO c11ro) {
        this.LL = c11pi;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11ro;
    }
}
