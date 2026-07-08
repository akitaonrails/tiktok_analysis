package X;

/* JADX INFO: renamed from: X.10Gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19219210Gw extends C11N2<C0CV2> {
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C19219010Gu LLILLL;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        C1911410zq7.LIZJ("DelayComponent", "observeInitialPluginRequest onComplete");
        this.LLILLL.LJ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C1911410zq7.LIZJ("DelayComponent", "observeInitialPluginRequest onError");
        C013C c013c = this.LLILLJJLI;
        if (c013c.element) {
            C1911410zq7.LIZLLL("DelayComponent", "observeInitialPluginRequest onError isRequestDone is true");
            this.LLILLL.LJI = 2;
        } else {
            c013c.element = true;
            C19219010Gu c19219010Gu = this.LLILLL;
            c19219010Gu.LJI = 1;
            c19219010Gu.LJ();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(Object obj) {
        C1911410zq7.LIZJ("DelayComponent", "observeInitialPluginRequest onNext");
        C013C c013c = this.LLILLJJLI;
        if (c013c.element) {
            C1911410zq7.LIZLLL("DelayComponent", "observeInitialPluginRequest onNext isRequestDone is true");
            this.LLILLL.LJI = 2;
        } else {
            c013c.element = true;
            this.LLILLL.LJ();
        }
    }

    public C19219210Gw(C013C c013c, C19219010Gu c19219010Gu) {
        this.LLILLJJLI = c013c;
        this.LLILLL = c19219010Gu;
    }
}
