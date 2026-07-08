package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11My, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19489811My<T> implements InterfaceC19474811He, InterfaceC420801kM {
    public final AtomicReference<InterfaceC420801kM> LL = new AtomicReference<>();
    public final AtomicReference<InterfaceC420801kM> LLILLJJLI = new AtomicReference<>();
    public final C11IV LLILLL;
    public final InterfaceC19474811He<? super T> LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        EnumC19489911Mz.LIZJ(this.LLILLJJLI);
        EnumC19489911Mz.LIZJ(this.LL);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.get() == EnumC19489911Mz.LL;
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.LL.lazySet(EnumC19489911Mz.LL);
            EnumC19489911Mz.LIZJ(this.LLILLJJLI);
            this.LLILZ.onError(th);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11N1 c11n1 = new C11N1() { // from class: X.11N0
            @Override // X.C11IY
            public final void onComplete() {
                this.LLILLJJLI.LLILLJJLI.lazySet(EnumC19489911Mz.LL);
                EnumC19489911Mz.LIZJ(this.LLILLJJLI.LL);
            }

            @Override // X.C11IY
            public final void onError(Throwable th) {
                this.LLILLJJLI.LLILLJJLI.lazySet(EnumC19489911Mz.LL);
                this.LLILLJJLI.onError(th);
            }
        };
        if (C19489711Mx.LIZIZ(this.LLILLJJLI, c11n1, C19489811My.class)) {
            this.LLILZ.onSubscribe(this);
            this.LLILLL.LIZIZ(c11n1);
            C19489711Mx.LIZIZ(this.LL, interfaceC420801kM, C19489811My.class);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        if (!isDisposed()) {
            this.LL.lazySet(EnumC19489911Mz.LL);
            EnumC19489911Mz.LIZJ(this.LLILLJJLI);
            this.LLILZ.onSuccess(t);
        }
    }

    public C19489811My(C11IV c11iv, InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LLILLL = c11iv;
        this.LLILZ = interfaceC19474811He;
    }
}
