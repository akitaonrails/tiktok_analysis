package X;

/* JADX INFO: renamed from: X.0yKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853610yKt implements InterfaceC1783630wW1 {
    public final C1853600yKs LIZ;
    public final C1853620yKu LIZIZ;
    public final InterfaceC346201Wa<InterfaceC1557650qdX> LIZJ;

    @Override // X.InterfaceC1783630wW1
    public final void LIZ() {
        this.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC1783630wW1
    public final void LJI() {
        this.LIZIZ.LJI();
    }

    @Override // X.InterfaceC1783630wW1
    public final InterfaceC346201Wa<InterfaceC1557650qdX> getEvents() {
        return this.LIZJ;
    }

    public C1853610yKt(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        C1853600yKs c1853600yKs = new C1853600yKs();
        this.LIZ = c1853600yKs;
        C1853620yKu c1853620yKu = new C1853620yKu(C1697810uHb.LJIIJJI(new C1577700r9s(viewOnAttachStateChangeListenerC20604515jv), c1853600yKs));
        this.LIZIZ = c1853620yKu;
        this.LIZJ = c1853620yKu.LIZIZ;
    }
}
