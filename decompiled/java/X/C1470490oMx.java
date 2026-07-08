package X;

/* JADX INFO: renamed from: X.0oMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470490oMx extends C1470520oN0 {
    public InterfaceC1470050oMF LIZJ;

    public C1470490oMx(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        super(abstractC1470590oN7, interfaceC1469660oLc);
        this.LIZJ = (InterfaceC1470050oMF) C1469430oLF.LIZ.LIZJ(abstractC1470590oN7, interfaceC1469660oLc, InterfaceC1470050oMF.class);
    }

    public final void LIZIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        this.LIZ = abstractC1470590oN7;
        this.LIZIZ = (AbstractC1469000oKY) interfaceC1469660oLc;
        if (C1474810oTv.LLJI().pluginReuseMode == 2) {
            this.LIZJ.update(abstractC1470590oN7, interfaceC1469660oLc);
        } else {
            this.LIZJ = (InterfaceC1470050oMF) C1469430oLF.LIZ.LIZJ(abstractC1470590oN7, interfaceC1469660oLc, InterfaceC1470050oMF.class);
        }
    }
}
