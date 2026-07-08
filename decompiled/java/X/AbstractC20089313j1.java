package X;

/* JADX INFO: renamed from: X.13j1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20089313j1 {
    public final C1776880wL8 LIZ;
    public AbstractC20089313j1 LIZIZ;
    public InterfaceC20090313jB LIZJ;

    public abstract void LIZIZ(InterfaceC1692950u9l interfaceC1692950u9l, boolean z, InterfaceC20090313jB interfaceC20090313jB);

    public void LIZLLL(boolean z) {
    }

    public void LIZ() {
        AbstractC20089313j1 abstractC20089313j1 = this.LIZIZ;
        if (abstractC20089313j1 != null) {
            abstractC20089313j1.LIZ();
        }
    }

    public void LJFF() {
        AbstractC20089313j1 abstractC20089313j1 = this.LIZIZ;
        if (abstractC20089313j1 != null) {
            abstractC20089313j1.LJFF();
        }
    }

    public AbstractC20089313j1(C1776880wL8 c1776880wL8) {
        this.LIZ = c1776880wL8;
    }

    public final void LJ(boolean z) {
        InterfaceC20090313jB interfaceC20090313jB = this.LIZJ;
        if (interfaceC20090313jB != null) {
            interfaceC20090313jB.LIZ(z);
        }
    }

    public final void LIZJ(InterfaceC1692950u9l interfaceC1692950u9l, boolean z) {
        AbstractC20089313j1 abstractC20089313j1 = this.LIZIZ;
        if (abstractC20089313j1 != null) {
            abstractC20089313j1.LIZIZ(interfaceC1692950u9l, z, new InterfaceC20090313jB() { // from class: X.13j3
                @Override // X.InterfaceC20090313jB
                public final void LIZ(boolean z2) {
                    this.LIZ.LIZLLL(z2);
                    this.LIZ.LJ(z2);
                }
            });
        }
    }
}
