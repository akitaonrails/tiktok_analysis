package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11MX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MX<T> extends C11K7<T> implements InterfaceC626120Oh8<T> {
    public static final long serialVersionUID = 8443155186132538303L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C11IV> LLILLL;
    public final boolean LLILZ;
    public InterfaceC420801kM LLILZLL;
    public volatile boolean LLIZ;
    public final C19487711Md LLILLJJLI = new C19487711Md();
    public final C11NJ LLILZIL = new C11NJ();

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final void clear() {
    }

    @Override // X.C11K7, X.InterfaceC420801kM
    public final void dispose() {
        this.LLIZ = true;
        this.LLILZLL.dispose();
        this.LLILZIL.dispose();
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return true;
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final T poll() {
        return null;
    }

    @Override // X.C11K7, X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        return i & 2;
    }

    @Override // X.C11K7, X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZLL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            Throwable thTerminate = this.LLILLJJLI.terminate();
            if (thTerminate != null) {
                this.LL.onError(thTerminate);
            } else {
                this.LL.onComplete();
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILLJJLI.addThrowable(th)) {
            if (this.LLILZ) {
                if (decrementAndGet() == 0) {
                    this.LL.onError(this.LLILLJJLI.terminate());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) <= 0) {
                return;
            }
            this.LL.onError(this.LLILLJJLI.terminate());
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        try {
            C11IV c11ivApply = this.LLILLL.apply(t);
            C1701890uOB.LIZ(c11ivApply, "The mapper returned a null CompletableSource");
            C11IV c11iv = c11ivApply;
            getAndIncrement();
            C11MZ c11mz = new C11MZ(this);
            if (!this.LLIZ && this.LLILZIL.LIZ(c11mz)) {
                c11iv.LIZIZ(c11mz);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LLILZLL.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZLL, interfaceC420801kM)) {
            this.LLILZLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11MX(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends C11IV> interfaceC1487280oo2, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLL = interfaceC1487280oo2;
        this.LLILZ = z;
        lazySet(1);
    }
}
