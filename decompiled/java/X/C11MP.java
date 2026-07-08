package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11MP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MP<T, U> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC19474811He<? super U> LL;
    public final C11L5<? super U, ? super T> LLILLJJLI;
    public final U LLILLL;
    public InterfaceC420801kM LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        this.LL.onSuccess(this.LLILLL);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZIL) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILZIL = true;
            this.LL.onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLILZIL) {
            return;
        }
        try {
            this.LLILLJJLI.accept(this.LLILLL, t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZ.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZ, interfaceC420801kM)) {
            this.LLILZ = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11MP(InterfaceC19474811He<? super U> interfaceC19474811He, U u, C11L5<? super U, ? super T> c11l5) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = c11l5;
        this.LLILLL = u;
    }
}
