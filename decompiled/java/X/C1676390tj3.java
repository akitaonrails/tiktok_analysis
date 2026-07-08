package X;

/* JADX INFO: renamed from: X.0tj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676390tj3 extends AbstractC1676440tj8 {
    public EnumC995470c0n LLJJ;
    public boolean LLJJI;

    @Override // X.AbstractC1676440tj8
    public final boolean LLJJI() {
        return this.LLJJI;
    }

    public C1676390tj3(EnumC995470c0n enumC995470c0n, boolean z) {
        this.LLJJ = enumC995470c0n;
        this.LLJJI = z;
    }

    @Override // X.AbstractC1676440tj8
    public final long LLJJ(InterfaceC1673370teB interfaceC1673370teB, long j) {
        int iLJJIIZ;
        if (this.LLJJ == EnumC995470c0n.Min) {
            iLJJIIZ = interfaceC1673370teB.LJJIJ(C1682380tsi.LJIIIIZZ(j));
        } else {
            iLJJIIZ = interfaceC1673370teB.LJJIIZ(C1682380tsi.LJIIIIZZ(j));
        }
        if (iLJJIIZ < 0) {
            iLJJIIZ = 0;
        }
        return C1682390tsj.LJII(0, Integer.MAX_VALUE, iLJJIIZ, iLJJIIZ);
    }

    @Override // X.AbstractC1676440tj8, X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (this.LLJJ == EnumC995470c0n.Min) {
            return interfaceC1676340tiy.LJJIJ(i);
        }
        return interfaceC1676340tiy.LJJIIZ(i);
    }

    @Override // X.AbstractC1676440tj8, X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (this.LLJJ == EnumC995470c0n.Min) {
            return interfaceC1676340tiy.LJJIJ(i);
        }
        return interfaceC1676340tiy.LJJIIZ(i);
    }
}
