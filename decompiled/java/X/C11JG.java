package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11JG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JG<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public final C09JN<? super InterfaceC420801kM> LLILLJJLI;
    public final InterfaceC781210Ukh LLILLL;
    public InterfaceC420801kM LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() throws Throwable {
        InterfaceC420801kM interfaceC420801kM = this.LLILZ;
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM != c11je) {
            this.LLILZ = c11je;
            try {
                this.LLILLL.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                C19489211Ms.LIZIZ(th);
            }
            interfaceC420801kM.dispose();
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        InterfaceC420801kM interfaceC420801kM = this.LLILZ;
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM != c11je) {
            this.LLILZ = c11je;
            this.LL.onComplete();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        InterfaceC420801kM interfaceC420801kM = this.LLILZ;
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM != c11je) {
            this.LLILZ = c11je;
            this.LL.onError(th);
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LL.onNext(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) throws Throwable {
        try {
            this.LLILLJJLI.accept(interfaceC420801kM);
            if (C11JE.validate(this.LLILZ, interfaceC420801kM)) {
                this.LLILZ = interfaceC420801kM;
                this.LL.onSubscribe(this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            interfaceC420801kM.dispose();
            this.LLILZ = C11JE.DISPOSED;
            C11JT.error(th, this.LL);
        }
    }

    public C11JG(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C09JN<? super InterfaceC420801kM> c09jn, InterfaceC781210Ukh interfaceC781210Ukh) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c09jn;
        this.LLILLL = interfaceC781210Ukh;
    }
}
