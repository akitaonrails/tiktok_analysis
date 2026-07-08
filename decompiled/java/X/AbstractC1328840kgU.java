package X;

/* JADX INFO: renamed from: X.0kgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1328840kgU<I, O> extends AbstractC1327820keq<I> {
    public final InterfaceC1328020kfA<O> LIZIZ;

    @Override // X.AbstractC1327820keq
    public void LJFF() {
        this.LIZIZ.LIZIZ();
    }

    public AbstractC1328840kgU(InterfaceC1328020kfA<O> interfaceC1328020kfA) {
        this.LIZIZ = interfaceC1328020kfA;
    }

    @Override // X.AbstractC1327820keq
    public void LJI(Throwable th) {
        this.LIZIZ.onFailure(th);
    }

    @Override // X.AbstractC1327820keq
    public void LJIIIIZZ(float f) {
        this.LIZIZ.LIZ(f);
    }
}
