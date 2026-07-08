package X;

/* JADX INFO: renamed from: X.13FD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FD<T> extends AbstractC19977113Ej {
    public T LIZJ;

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZIZ() {
        return new C13FD(C13YE.LJIIIZ().LJI(), this.LIZJ);
    }

    @Override // X.AbstractC19977113Ej
    public final void LIZ(AbstractC19977113Ej abstractC19977113Ej) {
        this.LIZJ = ((C13FD) abstractC19977113Ej).LIZJ;
    }

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZJ(long j) {
        return new C13FD(C13YE.LJIIIZ().LJI(), this.LIZJ);
    }

    public C13FD(long j, T t) {
        super(j);
        this.LIZJ = t;
    }
}
