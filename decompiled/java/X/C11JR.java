package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11JR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JR<T> implements C11IH<T>, InterfaceC420801kM {
    public final C11IH<? super T> LL;
    public final C11JS<T> LLILLJJLI;
    public InterfaceC420801kM LLILLL;

    public final void LIZ() throws Throwable {
        try {
            this.LLILLJJLI.LLILZLL.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() throws Throwable {
        try {
            this.LLILLJJLI.LLIZ.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
        }
        this.LLILLL.dispose();
        this.LLILLL = C11JE.DISPOSED;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.isDisposed();
    }

    @Override // X.C11IH
    public final void onComplete() throws Throwable {
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM == c11je) {
            return;
        }
        try {
            this.LLILLJJLI.LLILZIL.run();
            this.LLILLL = c11je;
            this.LL.onComplete();
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            LIZIZ(th);
        }
    }

    public final void LIZIZ(Throwable th) throws Throwable {
        try {
            this.LLILLJJLI.LLILZ.accept(th);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            th = new C0VYA(th, th2);
        }
        this.LLILLL = C11JE.DISPOSED;
        this.LL.onError(th);
        LIZ();
    }

    @Override // X.C11IH
    public final void onError(Throwable th) throws Throwable {
        if (this.LLILLL == C11JE.DISPOSED) {
            C19489211Ms.LIZIZ(th);
        } else {
            LIZIZ(th);
        }
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) throws Throwable {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            try {
                this.LLILLJJLI.LLILLJJLI.accept(interfaceC420801kM);
                this.LLILLL = interfaceC420801kM;
                this.LL.onSubscribe(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                interfaceC420801kM.dispose();
                this.LLILLL = C11JE.DISPOSED;
                C11JT.error(th, this.LL);
            }
        }
    }

    @Override // X.C11IH
    public final void onSuccess(T t) throws Throwable {
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        C11JE c11je = C11JE.DISPOSED;
        if (interfaceC420801kM == c11je) {
            return;
        }
        try {
            this.LLILLJJLI.LLILLL.accept(t);
            this.LLILLL = c11je;
            this.LL.onSuccess(t);
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            LIZIZ(th);
        }
    }

    public C11JR(C11IH<? super T> c11ih, C11JS<T> c11js) {
        this.LL = c11ih;
        this.LLILLJJLI = c11js;
    }
}
