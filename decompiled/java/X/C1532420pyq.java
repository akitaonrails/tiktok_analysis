package X;

/* JADX INFO: renamed from: X.0pyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532420pyq<T> extends AbstractC1534220q1k<T> {
    public final AbstractC1532350pyj<T> LJ;
    public final C1532710pzJ LJFF;

    @Override // X.AbstractC1534220q1k
    public final void LIZJ() {
        this.LJ.LIZLLL();
    }

    @Override // X.AbstractC1534220q1k
    public final AbstractC1534220q1k<T> LIZ(C1533790q13 c1533790q13) {
        AbstractC1532350pyj<T> abstractC1532350pyjLIZIZ = this.LJ.LIZIZ(this.LJFF);
        if (abstractC1532350pyjLIZIZ != null) {
            return new C1532420pyq(abstractC1532350pyjLIZIZ, this.LJFF);
        }
        return null;
    }

    public C1532420pyq(AbstractC1532350pyj<T> abstractC1532350pyj, C1532710pzJ c1532710pzJ) {
        super(abstractC1532350pyj.LIZ, abstractC1532350pyj.LIZIZ, null, 12);
        this.LJ = abstractC1532350pyj;
        this.LJFF = c1532710pzJ;
    }
}
