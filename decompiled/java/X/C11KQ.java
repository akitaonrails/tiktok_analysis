package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11KQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KQ<T> extends AbstractC19484711Kz<T> {
    public final InterfaceC19473011Gm<T> LL;
    public final C09JN<? super Throwable> LLILLJJLI;

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(final InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LL.LIZ((InterfaceC19474811He<? super T>) new InterfaceC19474811He<T>(interfaceC19474811He) { // from class: X.11KP
            public final InterfaceC19474811He<? super T> LL;

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) throws Throwable {
                try {
                    this.LLILLJJLI.LLILLJJLI.accept(th);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C11SP.LIZ(th2);
                    th = new C0VYA(th, th2);
                }
                this.LL.onError(th);
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

    public C11KQ(InterfaceC19473011Gm<T> interfaceC19473011Gm, C09JN<? super Throwable> c09jn) {
        this.LL = interfaceC19473011Gm;
        this.LLILLJJLI = c09jn;
    }
}
