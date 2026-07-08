package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19481911Jx<T, R> implements InterfaceC19474811He<T> {
    public final InterfaceC19474811He<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends R> LLILLJJLI;

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LL.onSubscribe(interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) throws Throwable {
        try {
            R rApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(rApply, "The mapper function returned a null value.");
            this.LL.onSuccess(rApply);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            onError(th);
        }
    }

    public C19481911Jx(InterfaceC19474811He<? super R> interfaceC19474811He, InterfaceC1487280oo2<? super T, ? extends R> interfaceC1487280oo2) {
        this.LL = interfaceC19474811He;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
