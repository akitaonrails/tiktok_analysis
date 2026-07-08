package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19478411Io<T> implements C11IH<T>, InterfaceC420801kM {
    public final C11IH<? super T> LL;
    public final InterfaceC1487280oo2<? super Throwable, ? extends T> LLILLJJLI;
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
    public final void onError(Throwable th) throws Throwable {
        try {
            T tApply = this.LLILLJJLI.apply(th);
            C1701890uOB.LIZ(tApply, "The valueSupplier returned a null value");
            this.LL.onSuccess(tApply);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LL.onError(new C0VYA(th, th2));
        }
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        this.LL.onSuccess(t);
    }

    public C19478411Io(C11IH<? super T> c11ih, InterfaceC1487280oo2<? super Throwable, ? extends T> interfaceC1487280oo2) {
        this.LL = c11ih;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
