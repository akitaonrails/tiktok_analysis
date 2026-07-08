package X;

import Y.ARunnableS103S0000000_30;

/* JADX INFO: renamed from: X.1BBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200681BBa extends AbstractC2201091BCp<C1512840pTG> {
    public static final C2200681BBa LJFF = new C2200681BBa();
    public static final C202114146m LJI = new C202114146m();

    @Override // X.AbstractC2201091BCp
    public final long LJII() {
        return 1000L;
    }

    @Override // X.AbstractC2201091BCp
    public final long LJIIZILJ() {
        return 300L;
    }

    @Override // X.AbstractC2201091BCp
    public final long LJIJJLI() {
        return 300L;
    }

    @Override // X.AbstractC2201091BCp
    public final void LJIIL() {
        C0NBO.LIZJ(100L, new ARunnableS103S0000000_30(2));
    }

    @Override // X.AbstractC2201091BCp
    public final C1512840pTG LJIILIIL() {
        return new C1512840pTG(0.0d, 0.0d);
    }

    @Override // X.AbstractC2201091BCp
    public final C1512840pTG LJIILJJIL() {
        C2200821BBo.LIZ.getClass();
        boolean z = C2200821BBo.LJIJI;
        C202114146m c202114146m = LJI;
        c202114146m.LIZ.LIZ();
        C798350VTl c798350VTl = c202114146m.LIZ.LJI;
        C1512840pTG c1512840pTG = new C1512840pTG(c798350VTl.LIZ, c798350VTl.LIZIZ);
        double d = c202114146m.LIZ.LJI.LIZ;
        C1057270dcT c1057270dcT = C2200821BBo.LJII;
        c1512840pTG.LIZ = d > ((double) c1057270dcT.LIZ) ? EnumC1006810cJ5.Critical : d > ((double) c1057270dcT.LIZIZ) ? EnumC1006810cJ5.High : d > ((double) c1057270dcT.LIZJ) ? EnumC1006810cJ5.Medium : EnumC1006810cJ5.Low;
        return c1512840pTG;
    }

    @Override // X.AbstractC2201091BCp
    public final InterfaceC1702080uOU LJIIJJI() {
        return C1BC9.Cpu;
    }

    @Override // X.AbstractC2201091BCp
    public final C1512840pTG LJIIJ(C1057250dcR c1057250dcR) {
        C1057270dcT c1057270dcT;
        EnumC1006810cJ5 enumC1006810cJ5;
        C1512840pTG c1512840pTGLJIIIZ = LJIIIZ();
        if ((c1057250dcR instanceof C1057270dcT) && (c1057270dcT = (C1057270dcT) c1057250dcR) != null) {
            double d = c1512840pTGLJIIIZ.LIZIZ;
            if (d > c1057270dcT.LIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Critical;
            } else if (d > c1057270dcT.LIZIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.High;
            } else if (d > c1057270dcT.LIZJ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ5 = EnumC1006810cJ5.Low;
            }
            C1512840pTG c1512840pTG = new C1512840pTG(d, c1512840pTGLJIIIZ.LIZJ);
            c1512840pTG.LIZ = enumC1006810cJ5;
            return c1512840pTG;
        }
        return c1512840pTGLJIIIZ;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILLIIL(C1512840pTG c1512840pTG, C1512840pTG c1512840pTG2) {
        if (c1512840pTG.LIZ != c1512840pTG2.LIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2201091BCp
    public final void LJJI(C2201121BCs<C1512840pTG> c2201121BCs, C1512840pTG c1512840pTG, C1057250dcR c1057250dcR) {
        C1057270dcT c1057270dcT;
        EnumC1006810cJ5 enumC1006810cJ5;
        EnumC1006810cJ5 enumC1006810cJ52;
        C1512840pTG c1512840pTG2 = c1512840pTG;
        if ((c1057250dcR instanceof C1057270dcT) && (c1057270dcT = (C1057270dcT) c1057250dcR) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current cpuChangeListener has defined config level, media: ");
            sbLIZ.append(c1057270dcT.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            double d = c1512840pTG2.LIZIZ;
            if (d > c1057270dcT.LIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Critical;
            } else if (d > c1057270dcT.LIZIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.High;
            } else if (d > c1057270dcT.LIZJ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ5 = EnumC1006810cJ5.Low;
            }
            C1702170uOd c1702170uOd = c2201121BCs.LJ;
            C1512840pTG c1512840pTG3 = new C1512840pTG(d, c1512840pTG2.LIZJ);
            c1512840pTG3.LIZ = enumC1006810cJ5;
            c2201121BCs.LJ = c1512840pTG3;
            if (c1702170uOd != null && (enumC1006810cJ52 = c1702170uOd.LIZ) != EnumC1006810cJ5.Unknown && enumC1006810cJ52 != enumC1006810cJ5) {
                c2201121BCs.LIZ(c1702170uOd, c1512840pTG3);
            }
        }
    }
}
