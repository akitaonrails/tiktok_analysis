package X;

import p2.j1;

/* JADX INFO: renamed from: X.13cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20050713cn implements InterfaceC1692950u9l {
    public final AbstractC20050413ck LL;

    @Override // X.InterfaceC1692950u9l
    public final long LIZ() {
        AbstractC20050413ck abstractC20050413ck = this.LL;
        return (((long) abstractC20050413ck.LL) << 32) | (((long) abstractC20050413ck.LLILLJJLI) & 4294967295L);
    }

    public final long LIZIZ() {
        AbstractC20050413ck abstractC20050413ckLIZ = C20050613cm.LIZ(this.LL);
        return C1378605aS.LJFF(LJIL(abstractC20050413ckLIZ.LLJJI, 0L), this.LL.LLJILJILJ.LJIL(abstractC20050413ckLIZ.LLJILJILJ, 0L));
    }

    @Override // X.InterfaceC1692950u9l
    public final boolean LIZLLL() {
        return this.LL.LLJILJILJ.LIZLLL();
    }

    @Override // X.InterfaceC1692950u9l
    public final InterfaceC1692950u9l LJJJIL() {
        AbstractC20050413ck abstractC20050413ckLLIIII;
        if (!LIZLLL()) {
            C1696250uF5.LIZIZ("LayoutCoordinate operations are only valid when isAttached is true");
        }
        j1 j1Var = this.LL.LLJILJILJ.LLJILJILJ.LLJLLIL.LIZJ.LLJJIII;
        if (j1Var == null || (abstractC20050413ckLLIIII = j1Var.LLIIII()) == null) {
            return null;
        }
        return abstractC20050413ckLLIIII.LLJJI;
    }

    public C20050713cn(AbstractC20050413ck abstractC20050413ck) {
        this.LL = abstractC20050413ck;
    }

    @Override // X.InterfaceC1692950u9l
    public final long LJIIL(long j) {
        return C1378605aS.LJI(this.LL.LLJILJILJ.LJIIL(j), LIZIZ());
    }

    @Override // X.InterfaceC1692950u9l
    public final long LJJIIJZLJL(long j) {
        return this.LL.LLJILJILJ.LJJIIJZLJL(C1378605aS.LJI(j, LIZIZ()));
    }

    @Override // X.InterfaceC1692950u9l
    public final void LJJIJLIJ(float[] fArr) {
        this.LL.LLJILJILJ.LJJIJLIJ(fArr);
    }

    @Override // X.InterfaceC1692950u9l
    public final long LJJJJ(long j) {
        return this.LL.LLJILJILJ.LJJJJ(C1378605aS.LJI(j, LIZIZ()));
    }

    @Override // X.InterfaceC1692950u9l
    public final long LJJJJJ(long j) {
        return C1378605aS.LJI(this.LL.LLJILJILJ.LJJJJJ(j), LIZIZ());
    }

    @Override // X.InterfaceC1692950u9l
    public final long LJIL(InterfaceC1692950u9l interfaceC1692950u9l, long j) {
        if (interfaceC1692950u9l instanceof C20050713cn) {
            AbstractC20050413ck abstractC20050413ck = ((C20050713cn) interfaceC1692950u9l).LL;
            abstractC20050413ck.LLJILJILJ.LLILZ();
            AbstractC20050413ck abstractC20050413ckLLIIII = this.LL.LLJILJILJ.LLFFF(abstractC20050413ck.LLJILJILJ).LLIIII();
            if (abstractC20050413ckLLIIII != null) {
                return (((long) Float.floatToRawIntBits((int) (r6 >> 32))) << 32) | (((long) Float.floatToRawIntBits(C1676820tjk.LIZJ(C1676820tjk.LIZLLL(C1676820tjk.LJ(abstractC20050413ck.LJZ(abstractC20050413ckLLIIII, false), C1680450tpb.LIZJ(j)), this.LL.LJZ(abstractC20050413ckLLIIII, false))))) & 4294967295L);
            }
            AbstractC20050413ck abstractC20050413ckLIZ = C20050613cm.LIZ(abstractC20050413ck);
            long jLJ = C1676820tjk.LJ(C1676820tjk.LJ(abstractC20050413ck.LJZ(abstractC20050413ckLIZ, false), abstractC20050413ckLIZ.LLJILLL), C1680450tpb.LIZJ(j));
            AbstractC20050413ck abstractC20050413ckLIZ2 = C20050613cm.LIZ(this.LL);
            return abstractC20050413ckLIZ2.LLJILJILJ.LLJJIII.LJIL(abstractC20050413ckLIZ.LLJILJILJ.LLJJIII, (((long) Float.floatToRawIntBits(C1676820tjk.LIZJ(C1676820tjk.LIZLLL(jLJ, C1676820tjk.LJ(this.LL.LJZ(abstractC20050413ckLIZ2, false), abstractC20050413ckLIZ2.LLJILLL))))) & 4294967295L) | (Float.floatToRawIntBits((int) (r6 >> 32)) << 32));
        }
        AbstractC20050413ck abstractC20050413ckLIZ3 = C20050613cm.LIZ(this.LL);
        long jLJFF = C1378605aS.LJFF(LJIL(abstractC20050413ckLIZ3.LLJJI, j), (4294967295L & ((long) Float.floatToRawIntBits(C1676820tjk.LIZJ(abstractC20050413ckLIZ3.LLJILLL)))) | (Float.floatToRawIntBits((int) (r4 >> 32)) << 32));
        j1 j1Var = abstractC20050413ckLIZ3.LLJILJILJ;
        if (!j1Var.LIZLLL()) {
            C1696250uF5.LIZIZ("LayoutCoordinate operations are only valid when isAttached is true");
        }
        j1Var.LLILZ();
        j1 j1Var2 = j1Var.LLJJIII;
        if (j1Var2 == null) {
            j1Var2 = abstractC20050413ckLIZ3.LLJILJILJ;
            j1Var2.getClass();
        }
        return C1378605aS.LJI(jLJFF, j1Var2.LJIL(interfaceC1692950u9l, 0L));
    }

    @Override // X.InterfaceC1692950u9l
    public final long LJJIFFI(InterfaceC1692950u9l interfaceC1692950u9l, long j) {
        return LJIL(interfaceC1692950u9l, j);
    }

    @Override // X.InterfaceC1692950u9l
    public final void LJJJI(InterfaceC1692950u9l interfaceC1692950u9l, float[] fArr) {
        this.LL.LLJILJILJ.LJJJI(interfaceC1692950u9l, fArr);
    }

    @Override // X.InterfaceC1692950u9l
    public final C1683130ttv LJJJJZI(InterfaceC1692950u9l interfaceC1692950u9l, boolean z) {
        return this.LL.LLJILJILJ.LJJJJZI(interfaceC1692950u9l, z);
    }
}
