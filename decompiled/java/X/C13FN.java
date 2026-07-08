package X;

/* JADX INFO: renamed from: X.13FN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FN extends AbstractC19977113Ej {
    public double LIZJ;

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZIZ() {
        return LIZJ(this.LIZ);
    }

    @Override // X.AbstractC19977113Ej
    public final void LIZ(AbstractC19977113Ej abstractC19977113Ej) {
        this.LIZJ = ((C13FN) abstractC19977113Ej).LIZJ;
    }

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZJ(long j) {
        return new C13FN(this.LIZJ, j);
    }

    public C13FN(double d, long j) {
        super(j);
        this.LIZJ = d;
    }
}
