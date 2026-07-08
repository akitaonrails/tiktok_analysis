package X;

/* JADX INFO: renamed from: X.0PT5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PT5 {
    public final int LIZ;
    public final InterfaceC645400PTe LIZIZ;
    public final C0P6P LIZJ;
    public int LIZLLL;

    public C0PT5(InterfaceC645400PTe interfaceC645400PTe) {
        this.LIZLLL = Integer.MIN_VALUE;
        this.LIZ = 0;
        this.LIZIZ = interfaceC645400PTe;
    }

    public C0PT5(int i, C0P6P c0p6p) {
        this.LIZLLL = Integer.MIN_VALUE;
        this.LIZ = i;
        this.LIZJ = c0p6p;
    }

    public final void LIZ(int i, int i2) {
        if (i > this.LIZLLL) {
            this.LIZLLL = i;
            int i3 = this.LIZ;
            if (i3 > 0 && (i2 - i) - 1 <= i3) {
                C0P6P c0p6p = this.LIZJ;
                if (c0p6p != null) {
                    c0p6p.LJJIFFI();
                    return;
                }
                InterfaceC645400PTe interfaceC645400PTe = this.LIZIZ;
                if (interfaceC645400PTe == null) {
                    return;
                }
                interfaceC645400PTe.LJJIFFI();
            }
        }
    }
}
