package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tsf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682350tsf extends AbstractC20055413dY implements InterfaceC20052813d8, InterfaceC1695680uEA {
    public AbstractC1676270tir LLJJ;
    public boolean LLJJI;
    public InterfaceC1668050tVb LLJJIII;
    public InterfaceC1671600tbK LLJJIJI;
    public float LLJJIJIIJIL;
    public C1685400txa LLJJIJIL;

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    public final boolean LLJJ() {
        return this.LLJJI && this.LLJJ.LJIIIIZZ() != 9205357640488583168L;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PainterModifier(painter=");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(", sizeToIntrinsics=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(", alignment=");
        sbLIZ.append(this.LLJJIII);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(", colorFilter=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LLJJI(long j) {
        if (C1680770tq7.LIZ(j, 9205357640488583168L) || (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        return true;
    }

    public static boolean LLJJIII(long j) {
        if (C1680770tq7.LIZ(j, 9205357640488583168L) || (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long jLIZ;
        long jLJIIIIZZ = this.LLJJ.LJIIIIZZ();
        if (LLJJIII(jLJIIIIZZ)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (jLJIIIIZZ >> 32));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32));
        }
        if (LLJJI(jLJIIIIZZ)) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jLJIIIIZZ & 4294967295L));
        } else {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L));
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32)) != 0.0f && Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L)) != 0.0f) {
            jLIZ = C1682370tsh.LIZ(jFloatToRawIntBits, this.LLJJIJI.LIZ(jFloatToRawIntBits, interfaceC1669010tX9.LIZIZ()));
        } else {
            jLIZ = 0;
        }
        long jLIZ2 = this.LLJJIII.LIZ((((long) Math.round(Float.intBitsToFloat((int) (jLIZ >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jLIZ & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L)))) & 4294967295L), interfaceC1669010tX9.getLayoutDirection());
        float f = (int) (jLIZ2 >> 32);
        float fLIZJ = C1676820tjk.LIZJ(jLIZ2);
        interfaceC1669010tX9.LJLJI().LIZ.LJII(f, fLIZJ);
        try {
            this.LLJJ.LJI(interfaceC1669010tX9, jLIZ, this.LLJJIJIIJIL, this.LLJJIJIL);
            interfaceC1669010tX9.LJLJI().LIZ.LJII(-f, -fLIZJ);
            interfaceC1669010tX9.LLIIJLIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC1669010tX9.LJLJI().LIZ.LJII(-f, -fLIZJ);
            throw th;
        }
    }

    public final long LLJJIJI(long j) {
        boolean z;
        boolean z2;
        int iLJIIJ;
        int iLJIIIZ;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        if (C1682380tsi.LJ(j) && C1682380tsi.LIZLLL(j)) {
            z = true;
        } else {
            z = false;
        }
        if (C1682380tsi.LJI(j) && C1682380tsi.LJFF(j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((LLJJ() || !z) && !z2) {
            long jLJIIIIZZ = this.LLJJ.LJIIIIZZ();
            if (LLJJIII(jLJIIIIZZ)) {
                iLJIIJ = Math.round(Float.intBitsToFloat((int) (jLJIIIIZZ >> 32)));
            } else {
                iLJIIJ = C1682380tsi.LJIIJ(j);
            }
            if (LLJJI(jLJIIIIZZ)) {
                iLJIIIZ = Math.round(Float.intBitsToFloat((int) (jLJIIIIZZ & 4294967295L)));
            } else {
                iLJIIIZ = C1682380tsi.LJIIIZ(j);
            }
            int iLJI = C1682390tsj.LJI(iLJIIJ, j);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C1682390tsj.LJFF(iLJIIIZ, j))) & 4294967295L) | (Float.floatToRawIntBits(iLJI) << 32);
            if (LLJJ()) {
                if (!LLJJIII(this.LLJJ.LJIIIIZZ())) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (this.LLJJ.LJIIIIZZ() >> 32));
                }
                if (!LLJJI(this.LLJJ.LJIIIIZZ())) {
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                } else {
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.LLJJ.LJIIIIZZ() & 4294967295L));
                }
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) != 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) != 0.0f) {
                    jFloatToRawIntBits = C1682370tsh.LIZ(jFloatToRawIntBits2, this.LLJJIJI.LIZ(jFloatToRawIntBits2, jFloatToRawIntBits));
                } else {
                    jFloatToRawIntBits = 0;
                }
            }
            return C1682380tsi.LIZ(C1682390tsj.LJI(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), C1682380tsi.LJIIIIZZ(j), C1682390tsj.LJFF(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), C1682380tsi.LJII(j));
        }
        return C1682380tsi.LIZ(C1682380tsi.LJIIIIZZ(j), C1682380tsi.LJIIIIZZ(j), C1682380tsi.LJII(j), C1682380tsi.LJII(j));
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (LLJJ()) {
            long jLLJJIJI = LLJJIJI(C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE));
            return Math.max(C1682380tsi.LJIIIZ(jLLJJIJI), interfaceC1676340tiy.LJJIJ(i));
        }
        return interfaceC1676340tiy.LJJIJ(i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (LLJJ()) {
            long jLLJJIJI = LLJJIJI(C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE));
            return Math.max(C1682380tsi.LJIIIZ(jLLJJIJI), interfaceC1676340tiy.LJJIIZ(i));
        }
        return interfaceC1676340tiy.LJJIIZ(i);
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(LLJJIJI(j));
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, abstractC1686530tzPLJJJJZ.LLILLJJLI, C2097608Jq.LJ(), new AwS604S0100000_25(abstractC1686530tzPLJJJJZ, 818));
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (LLJJ()) {
            long jLLJJIJI = LLJJIJI(C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, i));
            return Math.max(C1682380tsi.LJIIJ(jLLJJIJI), interfaceC1676340tiy.LJJII(i));
        }
        return interfaceC1676340tiy.LJJII(i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (LLJJ()) {
            long jLLJJIJI = LLJJIJI(C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, i));
            return Math.max(C1682380tsi.LJIIJ(jLLJJIJI), interfaceC1676340tiy.LJJIL(i));
        }
        return interfaceC1676340tiy.LJJIL(i);
    }

    public C1682350tsf(AbstractC1676270tir abstractC1676270tir, boolean z, InterfaceC1668050tVb interfaceC1668050tVb, InterfaceC1671600tbK interfaceC1671600tbK, float f, C1685400txa c1685400txa) {
        this.LLJJ = abstractC1676270tir;
        this.LLJJI = z;
        this.LLJJIII = interfaceC1668050tVb;
        this.LLJJIJI = interfaceC1671600tbK;
        this.LLJJIJIIJIL = f;
        this.LLJJIJIL = c1685400txa;
    }
}
