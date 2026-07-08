package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11JM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JM<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final InterfaceC626120Oh8<? super T> LL;
    public final C09JN<? super T> LLILLJJLI;
    public final C09JN<? super Throwable> LLILLL;
    public final InterfaceC781210Ukh LLILZ;
    public final InterfaceC781210Ukh LLILZIL;
    public InterfaceC420801kM LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZLL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZLL.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() throws Throwable {
        if (this.LLIZ) {
            return;
        }
        try {
            this.LLILZ.run();
            this.LLIZ = true;
            this.LL.onComplete();
            try {
                this.LLILZIL.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                C19489211Ms.LIZIZ(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            onError(th2);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) throws Throwable {
        if (this.LLIZ) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLIZ = true;
        try {
            this.LLILLL.accept(th);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            th = new C0VYA(th, th2);
        }
        this.LL.onError(th);
        try {
            this.LLILZIL.run();
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C11SP.LIZ(th3);
            C19489211Ms.LIZIZ(th3);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        if (this.LLIZ) {
            return;
        }
        try {
            this.LLILLJJLI.accept(t);
            this.LL.onNext(t);
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

    public C11JM(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C09JN<? super T> c09jn, C09JN<? super Throwable> c09jn2, InterfaceC781210Ukh interfaceC781210Ukh, InterfaceC781210Ukh interfaceC781210Ukh2) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c09jn;
        this.LLILLL = c09jn2;
        this.LLILZ = interfaceC781210Ukh;
        this.LLILZIL = interfaceC781210Ukh2;
    }
}
