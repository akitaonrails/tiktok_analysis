package X;

/* JADX INFO: renamed from: X.1Dof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267231Dof {
    public static final boolean[] LIZ = new boolean[3];

    public static void LIZ(C2267091DoR c2267091DoR, C21536919Qh c21536919Qh, C2267081DoQ c2267081DoQ) {
        c2267081DoQ.LJIILLIIL = -1;
        c2267081DoQ.LJIIZILJ = -1;
        EnumC2266981DoG enumC2266981DoG = c2267091DoR.LJJJJ[0];
        EnumC2266981DoG enumC2266981DoG2 = EnumC2266981DoG.WRAP_CONTENT;
        if (enumC2266981DoG != enumC2266981DoG2 && c2267081DoQ.LJJJJ[0] == EnumC2266981DoG.MATCH_PARENT) {
            int i = c2267081DoQ.LJJIJ.LJI;
            int iLJIIJJI = c2267091DoR.LJIIJJI() - c2267081DoQ.LJJIJIIJIL.LJI;
            C2267141DoW c2267141DoW = c2267081DoQ.LJJIJ;
            c2267141DoW.LJIIIIZZ = c21536919Qh.LJIIJ(c2267141DoW);
            C2267141DoW c2267141DoW2 = c2267081DoQ.LJJIJIIJIL;
            c2267141DoW2.LJIIIIZZ = c21536919Qh.LJIIJ(c2267141DoW2);
            c21536919Qh.LIZLLL(c2267081DoQ.LJJIJ.LJIIIIZZ, i);
            c21536919Qh.LIZLLL(c2267081DoQ.LJJIJIIJIL.LJIIIIZZ, iLJIIJJI);
            c2267081DoQ.LJIILLIIL = 2;
            c2267081DoQ.LJJJJLI = i;
            int i2 = iLJIIJJI - i;
            c2267081DoQ.LJJJJIZL = i2;
            int i3 = c2267081DoQ.LJJJJZI;
            if (i2 < i3) {
                c2267081DoQ.LJJJJIZL = i3;
            }
        }
        if (c2267091DoR.LJJJJ[1] != enumC2266981DoG2 && c2267081DoQ.LJJJJ[1] == EnumC2266981DoG.MATCH_PARENT) {
            int i4 = c2267081DoQ.LJJIJIIJI.LJI;
            int iLJIIIIZZ = c2267091DoR.LJIIIIZZ() - c2267081DoQ.LJJIJIL.LJI;
            C2267141DoW c2267141DoW3 = c2267081DoQ.LJJIJIIJI;
            c2267141DoW3.LJIIIIZZ = c21536919Qh.LJIIJ(c2267141DoW3);
            C2267141DoW c2267141DoW4 = c2267081DoQ.LJJIJIL;
            c2267141DoW4.LJIIIIZZ = c21536919Qh.LJIIJ(c2267141DoW4);
            c21536919Qh.LIZLLL(c2267081DoQ.LJJIJIIJI.LJIIIIZZ, i4);
            c21536919Qh.LIZLLL(c2267081DoQ.LJJIJIL.LJIIIIZZ, iLJIIIIZZ);
            if (c2267081DoQ.LJJJJZ > 0 || c2267081DoQ.LJJL == 8) {
                C2267141DoW c2267141DoW5 = c2267081DoQ.LJJIJL;
                c2267141DoW5.LJIIIIZZ = c21536919Qh.LJIIJ(c2267141DoW5);
                c21536919Qh.LIZLLL(c2267081DoQ.LJJIJL.LJIIIIZZ, c2267081DoQ.LJJJJZ + i4);
            }
            c2267081DoQ.LJIIZILJ = 2;
            c2267081DoQ.LJJJJLL = i4;
            int i5 = iLJIIIIZZ - i4;
            c2267081DoQ.LJJJJJ = i5;
            int i6 = c2267081DoQ.LJJJLIIL;
            if (i5 < i6) {
                c2267081DoQ.LJJJJJ = i6;
            }
        }
    }
}
