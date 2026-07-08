package X;

/* JADX INFO: renamed from: X.0sF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619380sF6 implements InterfaceC1391650mJn {
    public final String LIZ;
    public final EnumC1584360rKc LIZIZ;
    public final InterfaceC1391650mJn LIZJ;

    @Override // X.InterfaceC1391650mJn
    public final void onShow() {
        if (!C295090BhT.LIZ()) {
            C1905750zgz.LIZIZ.LIZ(this.LIZ, this.LIZIZ);
        }
        InterfaceC1391650mJn interfaceC1391650mJn = this.LIZJ;
        if (interfaceC1391650mJn != null) {
            interfaceC1391650mJn.onShow();
        }
    }

    public C1619380sF6(String str, EnumC1584360rKc enumC1584360rKc, InterfaceC1391650mJn interfaceC1391650mJn) {
        this.LIZ = str;
        this.LIZIZ = enumC1584360rKc;
        this.LIZJ = interfaceC1391650mJn;
    }
}
