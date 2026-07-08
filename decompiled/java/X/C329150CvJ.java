package X;

/* JADX INFO: renamed from: X.0CvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329150CvJ implements InterfaceC329190CvN {
    public final /* synthetic */ C329170CvL LL;

    public C329150CvJ(C329170CvL c329170CvL) {
        this.LL = c329170CvL;
    }

    @Override // X.InterfaceC329190CvN
    public final C095D l0(C329180CvM c329180CvM) {
        return new C095D(new C329160CvK(this.LL, c329180CvM, null));
    }

    @Override // X.InterfaceC329190CvN
    public final C095D queryBatchAweme(String str, int i) {
        return new C095D(new C329140CvI(this.LL, str, i, null));
    }
}
