package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11L6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11L6<T> extends AbstractC19484711Kz<T> {
    public final InterfaceC19473011Gm<T> LL;
    public final C09JN<? super T> LLILLJJLI;

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(final InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LL.LIZ((InterfaceC19474811He<? super T>) new InterfaceC19474811He<T>(interfaceC19474811He) { // from class: X.11L7
            public final InterfaceC19474811He<? super T> LL;

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
                    this.LLILLJJLI.LLILLJJLI.accept(t);
                    this.LL.onSuccess(t);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    this.LL.onError(th);
                }
            }

            {
                this.LL = interfaceC19474811He;
            }
        });
    }

    public C11L6(InterfaceC19473011Gm<T> interfaceC19473011Gm, C09JN<? super T> c09jn) {
        this.LL = interfaceC19473011Gm;
        this.LLILLJJLI = c09jn;
    }
}
