package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19479311Ix<T> implements C11IH<T>, InterfaceC420801kM {
    public final C11IH<? super T> LL;
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

    @Override // X.C11IH
    public final void onComplete() {
        this.LL.onComplete();
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11IH
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

    public C19479311Ix(C11IH<? super T> c11ih, C09JN<? super T> c09jn) {
        this.LL = c11ih;
        this.LLILLJJLI = c09jn;
    }
}
