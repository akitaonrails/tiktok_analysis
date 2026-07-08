package X;

/* JADX INFO: renamed from: X.0tj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676400tj4 extends AbstractC1676440tj8 {
    public EnumC995470c0n LLJJ;
    public boolean LLJJI;

    @Override // X.AbstractC1676440tj8
    public final boolean LLJJI() {
        return this.LLJJI;
    }

    public C1676400tj4(EnumC995470c0n enumC995470c0n, boolean z) {
        this.LLJJ = enumC995470c0n;
        this.LLJJI = z;
    }

    @Override // X.AbstractC1676440tj8
    public final long LLJJ(InterfaceC1673370teB interfaceC1673370teB, long j) {
        int iLJJIL;
        if (this.LLJJ == EnumC995470c0n.Min) {
            iLJJIL = interfaceC1673370teB.LJJII(C1682380tsi.LJII(j));
        } else {
            iLJJIL = interfaceC1673370teB.LJJIL(C1682380tsi.LJII(j));
        }
        if (iLJJIL < 0) {
            iLJJIL = 0;
        }
        return C1682390tsj.LJII(iLJJIL, iLJJIL, 0, Integer.MAX_VALUE);
    }

    @Override // X.AbstractC1676440tj8, X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (this.LLJJ == EnumC995470c0n.Min) {
            return interfaceC1676340tiy.LJJII(i);
        }
        return interfaceC1676340tiy.LJJIL(i);
    }

    @Override // X.AbstractC1676440tj8, X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (this.LLJJ == EnumC995470c0n.Min) {
            return interfaceC1676340tiy.LJJII(i);
        }
        return interfaceC1676340tiy.LJJIL(i);
    }
}
