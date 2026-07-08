package X;

import java.util.HashMap;
import p2.x;

/* JADX INFO: renamed from: X.13dA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20053013dA extends AbstractC20050413ck {
    @Override // X.AbstractC20050413ck
    public final void LJLLLL() {
        this.LLJILJILJ.LLJILJILJ.LLJLLL.LJIILLIIL.LJLIIL();
    }

    public C20053013dA(x xVar) {
        super(xVar);
    }

    @Override // X.AbstractC20050413ck, X.InterfaceC1676340tiy
    public final int LJJII(int i) {
        C20053213dC c20053213dCLJJIJIIJIL = this.LLJILJILJ.LLJILJILJ.LJJIJIIJIL();
        InterfaceC20053113dB interfaceC20053113dBLIZ = c20053213dCLJJIJIIJIL.LIZ();
        C20053713dH c20053713dH = c20053213dCLJJIJIIJIL.LIZ;
        return interfaceC20053113dBLIZ.LIZIZ(c20053713dH.LLJLLIL.LIZJ, c20053713dH.LJJIII(), i);
    }

    @Override // X.AbstractC20050413ck, X.InterfaceC1676340tiy
    public final int LJJIIZ(int i) {
        C20053213dC c20053213dCLJJIJIIJIL = this.LLJILJILJ.LLJILJILJ.LJJIJIIJIL();
        InterfaceC20053113dB interfaceC20053113dBLIZ = c20053213dCLJJIJIIJIL.LIZ();
        C20053713dH c20053713dH = c20053213dCLJJIJIIJIL.LIZ;
        return interfaceC20053113dBLIZ.LIZJ(c20053713dH.LLJLLIL.LIZJ, c20053713dH.LJJIII(), i);
    }

    @Override // X.AbstractC20050413ck, X.InterfaceC1676340tiy
    public final int LJJIJ(int i) {
        C20053213dC c20053213dCLJJIJIIJIL = this.LLJILJILJ.LLJILJILJ.LJJIJIIJIL();
        InterfaceC20053113dB interfaceC20053113dBLIZ = c20053213dCLJJIJIIJIL.LIZ();
        C20053713dH c20053713dH = c20053213dCLJJIJIIJIL.LIZ;
        return interfaceC20053113dBLIZ.LIZ(c20053713dH.LLJLLIL.LIZJ, c20053713dH.LJJIII(), i);
    }

    @Override // X.AbstractC20050413ck, X.InterfaceC1676340tiy
    public final int LJJIL(int i) {
        C20053213dC c20053213dCLJJIJIIJIL = this.LLJILJILJ.LLJILJILJ.LJJIJIIJIL();
        InterfaceC20053113dB interfaceC20053113dBLIZ = c20053213dCLJJIJIIJIL.LIZ();
        C20053713dH c20053713dH = c20053213dCLJJIJIIJIL.LIZ;
        return interfaceC20053113dBLIZ.LIZLLL(c20053713dH.LLJLLIL.LIZJ, c20053713dH.LJJIII(), i);
    }

    @Override // X.InterfaceC1673370teB
    public final AbstractC1686530tzP LJJJJZ(long j) {
        LJJLJ(j);
        C19968013Aw<C20053713dH> c19968013AwLJJIL = this.LLJILJILJ.LLJILJILJ.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            c20053713dHArr[i2].LLJLLL.LJIILLIIL.LLJI = EnumC20038113al.NotUsed;
        }
        C20053713dH c20053713dH = this.LLJILJILJ.LLJILJILJ;
        AbstractC20050413ck.LJLL(this, c20053713dH.LLJJJJ.LJFF(this, c20053713dH.LJJIII(), j));
        return this;
    }

    @Override // X.AbstractC20048613cS
    public final int LJJLJLI(C115T c115t) {
        int iIntValue;
        C20053613dG c20053613dG = this.LLJILJILJ.LLJILJILJ.LLJLLL.LJIILLIIL;
        if (!c20053613dG.LLJIJIL) {
            C20054013dK c20054013dK = c20053613dG.LLILZLL;
            if (c20054013dK.LIZLLL == EnumC20047813cK.LookaheadMeasuring) {
                C20050513cl c20050513cl = c20053613dG.LLJJIJIIJIL;
                c20050513cl.LJFF = true;
                if (c20050513cl.LIZIZ) {
                    c20054013dK.LJFF = true;
                    c20054013dK.LJI = true;
                }
            } else {
                c20053613dG.LLJJIJIIJIL.LJI = true;
            }
        }
        AbstractC20050413ck abstractC20050413ck = c20053613dG.LJJJJLI().LLLIIIL;
        if (abstractC20050413ck != null) {
            abstractC20050413ck.LLIZLLLIL = true;
        }
        c20053613dG.LJJJJL();
        AbstractC20050413ck abstractC20050413ck2 = c20053613dG.LJJJJLI().LLLIIIL;
        if (abstractC20050413ck2 != null) {
            abstractC20050413ck2.LLIZLLLIL = false;
        }
        Integer num = (Integer) ((HashMap) c20053613dG.LLJJIJIIJIL.LJIIIIZZ).get(c115t);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MIN_VALUE;
        }
        this.LLJJIJI.LJII(iIntValue, c115t);
        return iIntValue;
    }
}
