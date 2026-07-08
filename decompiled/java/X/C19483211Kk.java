package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19483211Kk<T> implements C11IH<T>, InterfaceC420801kM {
    public final C11IH<? super T> LL;
    public final InterfaceC19483011Ki<? super T> LLILLJJLI;
    public InterfaceC420801kM LLILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        this.LLILLL = C11JE.DISPOSED;
        interfaceC420801kM.dispose();
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
        try {
            if (this.LLILLJJLI.test(t)) {
                this.LL.onSuccess(t);
            } else {
                this.LL.onComplete();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LL.onError(th);
        }
    }

    public C19483211Kk(C11IH<? super T> c11ih, InterfaceC19483011Ki<? super T> interfaceC19483011Ki) {
        this.LL = c11ih;
        this.LLILLJJLI = interfaceC19483011Ki;
    }
}
