package X;

import h0.n2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677630tl3 extends AbstractC1676570tjL {
    public InterfaceC1677030tk5<C1682900ttY> LLJJ;
    public InterfaceC1668050tVb LLJJI;
    public Function2<? super C1682900ttY, ? super C1682900ttY, Unit> LLJJIII;
    public boolean LLJJIJIL;
    public long LLJJIJI = C1672150tcD.LIZ;
    public long LLJJIJIIJIL = C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public final C05P0 LLJJJ = C20028913Yh.LJI(null);

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        this.LLJJIJI = C1672150tcD.LIZ;
        this.LLJJIJIL = false;
    }

    @Override // X.AbstractC20055413dY
    public final void LLJ() {
        ((C13FE) this.LLJJJ).setValue(null);
    }

    public C1677630tl3(InterfaceC1675680thu interfaceC1675680thu, InterfaceC1668050tVb interfaceC1668050tVb, Function2 function2) {
        this.LLJJ = interfaceC1675680thu;
        this.LLJJI = interfaceC1668050tVb;
        this.LLJJIII = function2;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        long j2;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ;
        long j3;
        long jLIZLLL;
        boolean z = true;
        if (interfaceC1689940u4u.LLIILII()) {
            this.LLJJIJIIJIL = j;
            this.LLJJIJIL = true;
            abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j);
        } else {
            if (this.LLJJIJIL) {
                j2 = this.LLJJIJIIJIL;
            } else {
                j2 = j;
            }
            abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j2);
        }
        long j4 = (((long) abstractC1686530tzPLJJJJZ.LLILLJJLI) & 4294967295L) | (((long) abstractC1686530tzPLJJJJZ.LL) << 32);
        if (interfaceC1689940u4u.LLIILII()) {
            this.LLJJIJI = j4;
            jLIZLLL = j4;
        } else {
            if (!C1682900ttY.LIZIZ(this.LLJJIJI, C1672150tcD.LIZ)) {
                j3 = this.LLJJIJI;
            } else {
                j3 = j4;
            }
            C1677640tl4 c1677640tl4 = (C1677640tl4) ((C13FE) this.LLJJJ).getValue();
            if (c1677640tl4 != null) {
                if (C1682900ttY.LIZIZ(j3, c1677640tl4.LIZ.LIZLLL().LIZ) || c1677640tl4.LIZ.LJ()) {
                    z = false;
                }
                if (!C1682900ttY.LIZIZ(j3, ((C1682900ttY) ((C13FE) c1677640tl4.LIZ.LJ).getValue()).LIZ) || z) {
                    c1677640tl4.LIZIZ = c1677640tl4.LIZ.LIZLLL().LIZ;
                    C23250099c.LIZLLL(LLILLIZIL(), null, null, new C1677620tl2(c1677640tl4, j3, this, null), 3);
                }
            } else {
                long j5 = 1;
                c1677640tl4 = new C1677640tl4(new C1677480tko(new C1682900ttY(j3), n2.LJII, new C1682900ttY((j5 & 4294967295L) | (j5 << 32)), 8), j3);
            }
            ((C13FE) this.LLJJJ).setValue(c1677640tl4);
            jLIZLLL = C1682390tsj.LIZLLL(j, c1677640tl4.LIZ.LIZLLL().LIZ);
        }
        int i = (int) (jLIZLLL >> 32);
        int i2 = (int) (jLIZLLL & 4294967295L);
        return interfaceC1689940u4u.LJLJJL(i, i2, C2097608Jq.LJ(), new C1677650tl5(this, j4, i, i2, interfaceC1689940u4u, abstractC1686530tzPLJJJJZ));
    }
}
