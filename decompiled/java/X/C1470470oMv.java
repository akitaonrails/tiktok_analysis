package X;

/* JADX INFO: renamed from: X.0oMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470470oMv extends C1470520oN0 implements InterfaceC1470740oNM {
    public InterfaceC1470070oMH LIZJ;
    public boolean LIZLLL;

    public C1470470oMv(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        super(abstractC1470590oN7, interfaceC1469660oLc);
        this.LIZJ = (InterfaceC1470070oMH) C1469430oLF.LIZ.LIZJ(abstractC1470590oN7, interfaceC1469660oLc, InterfaceC1470070oMH.class);
    }

    public final void LIZIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        this.LIZ = abstractC1470590oN7;
        this.LIZIZ = (AbstractC1469000oKY) interfaceC1469660oLc;
        if (C1474810oTv.LLJI().pluginReuseMode == 2) {
            InterfaceC1470070oMH interfaceC1470070oMH = this.LIZJ;
            if (interfaceC1470070oMH != null) {
                interfaceC1470070oMH.update(abstractC1470590oN7, interfaceC1469660oLc);
                return;
            }
            return;
        }
        this.LIZJ = (InterfaceC1470070oMH) C1469430oLF.LIZ.LIZJ(abstractC1470590oN7, interfaceC1469660oLc, InterfaceC1470070oMH.class);
    }
}
