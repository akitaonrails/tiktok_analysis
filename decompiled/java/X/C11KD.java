package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11KD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KD<T> extends AbstractC19484711Kz<T> {
    public final InterfaceC19473011Gm<? extends T> LL;
    public final InterfaceC1487280oo2<? super Throwable, ? extends T> LLILLJJLI;
    public final T LLILLL;

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(final InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LL.LIZ((InterfaceC19474811He<? super Object>) new InterfaceC19474811He<T>(interfaceC19474811He) { // from class: X.11KC
            public final InterfaceC19474811He<? super T> LL;

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) throws Throwable {
                T tApply;
                C11KD c11kd = this.LLILLJJLI;
                InterfaceC1487280oo2<? super Throwable, ? extends T> interfaceC1487280oo2 = c11kd.LLILLJJLI;
                if (interfaceC1487280oo2 != null) {
                    try {
                        tApply = interfaceC1487280oo2.apply(th);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C11SP.LIZ(th2);
                        this.LL.onError(new C0VYA(th, th2));
                        return;
                    }
                } else {
                    tApply = c11kd.LLILLL;
                }
                if (tApply == null) {
                    NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                    nullPointerException.initCause(th);
                    this.LL.onError(nullPointerException);
                    return;
                }
                this.LL.onSuccess(tApply);
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL.onSubscribe(interfaceC420801kM);
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(T t) {
                this.LL.onSuccess(t);
            }

            {
                this.LL = interfaceC19474811He;
            }
        });
    }

    public C11KD(InterfaceC19473011Gm<? extends T> interfaceC19473011Gm, InterfaceC1487280oo2<? super Throwable, ? extends T> interfaceC1487280oo2, T t) {
        this.LL = interfaceC19473011Gm;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = t;
    }
}
