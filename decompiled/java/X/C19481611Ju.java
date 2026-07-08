package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19481611Ju<T, R> implements C11IH<T>, InterfaceC420801kM {
    public final C11IH<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends R> LLILLJJLI;
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
            R rApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(rApply, "The mapper returned a null item");
            this.LL.onSuccess(rApply);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LL.onError(th);
        }
    }

    public C19481611Ju(C11IH<? super R> c11ih, InterfaceC1487280oo2<? super T, ? extends R> interfaceC1487280oo2) {
        this.LL = c11ih;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
