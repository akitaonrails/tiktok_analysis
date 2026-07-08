package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11L3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11L3<T> extends AbstractC19484711Kz<T> {
    public final InterfaceC19473011Gm<T> LL;
    public final C11L5<? super T, ? super Throwable> LLILLJJLI;

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(final InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LL.LIZ((InterfaceC19474811He<? super T>) new InterfaceC19474811He<T>(interfaceC19474811He) { // from class: X.11L4
            public final InterfaceC19474811He<? super T> LL;

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) throws Throwable {
                try {
                    this.LLILLJJLI.LLILLJJLI.accept(null, th);
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
            public final void onSuccess(T t) throws Throwable {
                try {
                    this.LLILLJJLI.LLILLJJLI.accept(t, null);
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

    public C11L3(InterfaceC19473011Gm<T> interfaceC19473011Gm, C11L5<? super T, ? super Throwable> c11l5) {
        this.LL = interfaceC19473011Gm;
        this.LLILLJJLI = c11l5;
    }
}
