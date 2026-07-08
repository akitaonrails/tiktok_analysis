package X;

import Y.ARunnableS92S0200000_23;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0pBO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501760pBO<T> implements InterfaceC1500240p8w<T> {
    public final /* synthetic */ InterfaceC1500240p8w LIZ;
    public final /* synthetic */ C1501740pBM LIZIZ;

    public C1501760pBO(C1501740pBM c1501740pBM, InterfaceC1500240p8w interfaceC1500240p8w) {
        this.LIZIZ = c1501740pBM;
        this.LIZ = interfaceC1500240p8w;
    }

    @Override // X.InterfaceC1500240p8w
    public final void onFailure(InterfaceC1501750pBN<T> interfaceC1501750pBN, Throwable th) {
        this.LIZIZ.LL.execute(new ARunnableS92S0200000_23(th, this, 80));
    }

    @Override // X.InterfaceC1500240p8w
    public final void onResponse(InterfaceC1501750pBN<T> interfaceC1501750pBN, C1500770p9n<T> c1500770p9n) {
        this.LIZIZ.LL.execute(new ARunnableS92S0200000_23(c1500770p9n, this, 79));
    }
}
