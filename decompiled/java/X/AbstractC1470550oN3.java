package X;

import X.AbstractC1470590oN7;

/* JADX INFO: renamed from: X.0oN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1470550oN3<T extends AbstractC1470590oN7> implements InterfaceC1470560oN4 {
    public T LIZ;
    public AbstractC1469000oKY LIZIZ;
    public InterfaceC1470540oN2<InterfaceC1470560oN4> LIZJ;

    @Override // X.InterfaceC1470600oN8
    public final /* synthetic */ int getRecycleState() {
        return 1;
    }

    @Override // X.InterfaceC1470560oN4, X.InterfaceC1470600oN8
    public final boolean isRecyclable() {
        return true;
    }

    @Override // X.InterfaceC1470560oN4
    public final boolean recycle() {
        InterfaceC1470540oN2<InterfaceC1470560oN4> interfaceC1470540oN2 = this.LIZJ;
        if (interfaceC1470540oN2 != null) {
            return interfaceC1470540oN2.LIZ(this);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1470560oN4, X.InterfaceC1470600oN8
    public final void setPool(InterfaceC1470540oN2<? extends InterfaceC1470600oN8> interfaceC1470540oN2) {
        this.LIZJ = interfaceC1470540oN2;
    }

    public AbstractC1470550oN3(T t, InterfaceC1469660oLc interfaceC1469660oLc) {
        this.LIZ = t;
        this.LIZIZ = (AbstractC1469000oKY) interfaceC1469660oLc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1470560oN4, X.InterfaceC1470600oN8
    public void update(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        this.LIZ = abstractC1470590oN7;
        this.LIZIZ = (AbstractC1469000oKY) interfaceC1469660oLc;
    }
}
