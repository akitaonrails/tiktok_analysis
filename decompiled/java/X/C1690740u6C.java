package X;

/* JADX INFO: renamed from: X.0u6C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690740u6C implements InterfaceC20090813jG, InterfaceC1392705cj {
    public final /* synthetic */ InterfaceC1392705cj LIZ;
    public final /* synthetic */ AbstractC1690640u62 LIZIZ;

    @Override // X.InterfaceC1392705cj
    public final float LIZJ(float f) {
        return this.LIZ.LIZJ(f);
    }

    @Override // X.InterfaceC20090813jG
    public final int LIZIZ() {
        return this.LIZIZ.LJFF;
    }

    @Override // X.InterfaceC20090813jG
    public final int LIZLLL() {
        return this.LIZIZ.LJ;
    }

    @Override // X.InterfaceC20090813jG
    public final int LJ() {
        return ((InterfaceC1690900u6S) C13LP.LJJLIIIJJI(this.LIZIZ.LJIIL().LJIIIZ())).getIndex();
    }

    @Override // X.InterfaceC20090813jG
    public final int getItemCount() {
        return this.LIZIZ.LJIILIIL();
    }

    public C1690740u6C(InterfaceC1392705cj interfaceC1392705cj, AbstractC1690640u62 abstractC1690640u62) {
        this.LIZIZ = abstractC1690640u62;
        this.LIZ = interfaceC1392705cj;
    }

    @Override // X.InterfaceC20090813jG
    public final int LIZ(int i, int i2) {
        long jLIZ = C1690870u6P.LIZ(this.LIZIZ) + ((long) C814420VxA.LIZIZ((((i - this.LIZIZ.LJIIIZ()) * this.LIZIZ.LJIILL()) - (this.LIZIZ.LJIIJ() * this.LIZIZ.LJIILL())) + i2));
        AbstractC1690640u62 abstractC1690640u62 = this.LIZIZ;
        return (int) (C13LZ.LJFF(jLIZ, abstractC1690640u62.LJII, abstractC1690640u62.LJI) - C1690870u6P.LIZ(this.LIZIZ));
    }

    @Override // X.InterfaceC20090813jG
    public final void LJFF(int i, int i2) {
        this.LIZIZ.LJIL(i2 / this.LIZIZ.LJIILL(), i, true);
    }
}
