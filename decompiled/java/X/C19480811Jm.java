package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19480811Jm<T, R> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends Iterable<? extends R>> LLILLJJLI;
    public InterfaceC420801kM LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.dispose();
        this.LLILLL = C11JE.DISPOSED;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM == c11je) {
            return;
        }
        this.LLILLL = c11je;
        this.LL.onComplete();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM == c11je) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILLL = c11je;
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        if (this.LLILLL == C11JE.DISPOSED) {
            return;
        }
        try {
            InterfaceC626120Oh8<? super R> interfaceC626120Oh8 = this.LL;
            for (R r : this.LLILLJJLI.apply(t)) {
                try {
                    try {
                        C1701890uOB.LIZ(r, "The iterator returned a null value");
                        interfaceC626120Oh8.onNext(r);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C11SP.LIZ(th);
                        this.LLILLL.dispose();
                        onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C11SP.LIZ(th2);
                    this.LLILLL.dispose();
                    onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C11SP.LIZ(th3);
            this.LLILLL.dispose();
            onError(th3);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19480811Jm(InterfaceC626120Oh8<? super R> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends Iterable<? extends R>> interfaceC1487280oo2) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
