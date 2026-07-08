package X;

/* JADX INFO: renamed from: X.15l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20611615l4<T> extends AbstractC20611515l3<T> {
    public final AbstractC20611515l3<T> LIZIZ;
    public T LIZJ;
    public boolean LIZLLL;

    public C20611615l4(AbstractC20611515l3<T> abstractC20611515l3) {
        this.LIZIZ = abstractC20611515l3;
    }

    @Override // X.AbstractC20611515l3
    public final T LIZIZ(C1DRG c1drg) {
        T t = this.LIZJ;
        if (t != null) {
            return t;
        }
        T tLIZIZ = this.LIZIZ.LIZIZ(c1drg);
        this.LIZJ = tLIZIZ;
        return tLIZIZ;
    }

    @Override // X.AbstractC20611515l3
    public final void LIZ(T t, C1DRG c1drg) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        super.LIZ(t, c1drg);
    }
}
