package X;

/* JADX INFO: renamed from: X.0wEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772720wEQ extends AbstractC1773210wFD {
    public int LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public int LJJIII;

    public C1772720wEQ() {
        this(0);
    }

    @Override // X.AbstractC1773210wFD
    /* JADX INFO: renamed from: LJI */
    public final boolean LIZIZ(AbstractC1773210wFD abstractC1773210wFD) {
        return false;
    }

    @Override // X.AbstractC1773210wFD
    /* JADX INFO: renamed from: LJII */
    public final boolean LIZLLL(AbstractC1773210wFD abstractC1773210wFD) {
        return false;
    }

    @Override // X.AbstractC1773210wFD
    public final int LJIIIIZZ() {
        return this.LJJIII;
    }

    @Override // X.AbstractC1773210wFD
    public final String LJIIIZ() {
        return this.LJJI;
    }

    @Override // X.AbstractC1773210wFD
    public final String LJIIJ() {
        return this.LJJII;
    }

    @Override // X.AbstractC1773210wFD
    public final String LJIIJJI() {
        return this.LJJIFFI;
    }

    public C1772720wEQ(int i) {
        this.LJJ = -1;
        this.LJJI = "item_loadmore";
        this.LJJIFFI = "item_loadmore";
        this.LJJII = "section_loadmore";
        this.LJJIII = 1;
    }

    @Override // X.AbstractC1773210wFD, X.InterfaceC1774050wGZ
    public final /* bridge */ /* synthetic */ boolean LIZIZ(InterfaceC1774050wGZ interfaceC1774050wGZ) {
        return false;
    }

    @Override // X.AbstractC1773210wFD, X.InterfaceC1774050wGZ
    public final /* bridge */ /* synthetic */ boolean LIZLLL(InterfaceC1774050wGZ interfaceC1774050wGZ) {
        return false;
    }

    @Override // X.AbstractC1773210wFD
    public final void LJIILJJIL(int i) {
        this.LJJIII = i;
    }

    @Override // X.AbstractC1773210wFD
    public final void LJIILL(String str) {
        this.LJJI = str;
    }

    @Override // X.AbstractC1773210wFD
    public final void LJIILLIIL(String str) {
        this.LJJII = str;
    }

    @Override // X.AbstractC1773210wFD
    public final void LJIIZILJ(String str) {
        this.LJJIFFI = str;
    }

    public final void LJIJ(C1772690wEN c1772690wEN) {
        this.LJII.LIZIZ.LIZ = c1772690wEN;
        Boolean bool = c1772690wEN.LJ;
        if (bool == null) {
            this.LJJ = 0;
            return;
        }
        if (!bool.booleanValue()) {
            this.LJJ = 3;
        } else if (c1772690wEN.LIZJ.isEmpty()) {
            this.LJJ = 2;
        } else {
            this.LJJ = -1;
        }
    }
}
