package X;

/* JADX INFO: renamed from: X.13FL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FL extends AbstractC19977113Ej {
    public long LIZJ;

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZIZ() {
        return LIZJ(C13YE.LJIIIZ().LJI());
    }

    @Override // X.AbstractC19977113Ej
    public final void LIZ(AbstractC19977113Ej abstractC19977113Ej) {
        this.LIZJ = ((C13FL) abstractC19977113Ej).LIZJ;
    }

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZJ(long j) {
        return new C13FL(j, this.LIZJ);
    }

    public C13FL(long j, long j2) {
        super(j);
        this.LIZJ = j2;
    }
}
