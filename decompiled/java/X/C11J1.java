package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11J1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11J1<T> implements InterfaceC19474811He<T>, InterfaceC420801kM {
    public final InterfaceC19474811He<? super T> LL;
    public final C09JN<? super T> LLILLJJLI;
    public InterfaceC420801kM LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.isDisposed();
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) throws Throwable {
        this.LL.onSuccess(t);
        try {
            this.LLILLJJLI.accept(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
        }
    }

    public C11J1(InterfaceC19474811He<? super T> interfaceC19474811He, C09JN<? super T> c09jn) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = c09jn;
    }
}
