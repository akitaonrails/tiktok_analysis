package X;

/* JADX INFO: renamed from: X.0pXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515770pXz implements InterfaceC644200POo<Object> {
    public final /* synthetic */ InterfaceC1515790pY1 LIZ;
    public final /* synthetic */ C1515820pY4 LIZIZ;

    @Override // X.InterfaceC644200POo
    public final void LIZ(final C0POE<Object> c0poe) {
        this.LIZIZ.LIZLLL(new C0POE<Object>() { // from class: X.0pY0
            @Override // X.C0POE
            public final void onComplete() {
                this.LIZIZ.LIZ.onComplete();
                c0poe.onComplete();
            }

            @Override // X.C0POE
            public final void onFailed(Throwable th) {
                this.LIZIZ.LIZ.onFailed();
                c0poe.onFailed(th);
            }

            @Override // X.C0POE
            public final void onNext(Object obj) {
                this.LIZIZ.LIZ.onNext(obj);
                c0poe.onNext(obj);
            }
        });
    }

    public C1515770pXz(C1515840pY6 c1515840pY6, C1515760pXy c1515760pXy) {
        this.LIZIZ = c1515840pY6;
        this.LIZ = c1515760pXy;
    }
}
