package X;

/* JADX INFO: renamed from: X.13Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13Y7 implements C13YP {
    public static final int $stable = 0;
    public final C1514410pVn readerKind = new C1514410pVn(0);

    @Override // X.C13YP
    public /* synthetic */ AbstractC19977113Ej LJIILIIL(AbstractC19977113Ej abstractC19977113Ej, AbstractC19977113Ej abstractC19977113Ej2, AbstractC19977113Ej abstractC19977113Ej3) {
        return null;
    }

    public final boolean LJIILLIIL(int i) {
        if ((i & this.readerKind.get()) != 0) {
            return true;
        }
        return false;
    }

    public final void LJIJ(int i) {
        int i2;
        do {
            i2 = this.readerKind.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(i2, i2 | i));
    }
}
