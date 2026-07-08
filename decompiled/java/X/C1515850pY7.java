package X;

/* JADX INFO: renamed from: X.0pY7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515850pY7 implements InterfaceC644200POo<Object> {
    public final /* synthetic */ InterfaceC1515570pXf LIZ;
    public final /* synthetic */ C1515820pY4 LIZIZ;

    @Override // X.InterfaceC644200POo
    public final void LIZ(final C0POE<Object> c0poe) {
        this.LIZIZ.LIZLLL(new C0POE<Object>() { // from class: X.0pY8
            @Override // X.C0POE
            public final void onComplete() {
                c0poe.onComplete();
            }

            @Override // X.C0POE
            public final void onFailed(Throwable th) {
                c0poe.onFailed(th);
            }

            @Override // X.C0POE
            public final void onNext(Object obj) {
                c0poe.onNext(this.LIZIZ.LIZ.apply(obj));
            }
        });
    }

    public C1515850pY7(C1515820pY4 c1515820pY4, InterfaceC1515570pXf interfaceC1515570pXf) {
        this.LIZIZ = c1515820pY4;
        this.LIZ = interfaceC1515570pXf;
    }
}
