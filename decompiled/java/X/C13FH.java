package X;

/* JADX INFO: renamed from: X.13FH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FH extends AbstractC19977113Ej {
    public int LIZJ;

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZIZ() {
        return LIZJ(C13YE.LJIIIZ().LJI());
    }

    @Override // X.AbstractC19977113Ej
    public final void LIZ(AbstractC19977113Ej abstractC19977113Ej) {
        this.LIZJ = ((C13FH) abstractC19977113Ej).LIZJ;
    }

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZJ(long j) {
        return new C13FH(j, this.LIZJ);
    }

    public C13FH(long j, int i) {
        super(j);
        this.LIZJ = i;
    }
}
