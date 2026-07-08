package X;

/* JADX INFO: renamed from: X.13FJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FJ extends AbstractC19977113Ej {
    public float LIZJ;

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZIZ() {
        return LIZJ(C13YE.LJIIIZ().LJI());
    }

    @Override // X.AbstractC19977113Ej
    public final void LIZ(AbstractC19977113Ej abstractC19977113Ej) {
        this.LIZJ = ((C13FJ) abstractC19977113Ej).LIZJ;
    }

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZJ(long j) {
        return new C13FJ(j, this.LIZJ);
    }

    public C13FJ(long j, float f) {
        super(j);
        this.LIZJ = f;
    }
}
