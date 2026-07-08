package X;

/* JADX INFO: renamed from: X.1BBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200711BBd extends AbstractC2201091BCp<C2189391AmP> implements InterfaceC2200731BBf {
    @Override // X.AbstractC2201091BCp
    public final C2189391AmP LJIILIIL() {
        return new C2189391AmP();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.1AmP] */
    @Override // X.AbstractC2201091BCp
    public final C2189391AmP LJIILJJIL() {
        C2200821BBo.LIZ.getClass();
        boolean z = C2200821BBo.LJIJI;
        return this.LIZIZ;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILL() {
        C2200821BBo.LIZ.getClass();
        boolean z = C2200821BBo.LJIJI;
        return this instanceof C2200681BBa;
    }

    @Override // X.AbstractC2201091BCp
    public final InterfaceC1702080uOU LJIIJJI() {
        return C1BC9.Temperature;
    }

    @Override // X.AbstractC2201091BCp
    public final void LJIIL() {
        C2200791BBl.LJ = this;
    }

    @Override // X.InterfaceC2200731BBf
    public final void LJFF(C2189391AmP c2189391AmP) {
        C2200821BBo.LIZ.getClass();
        boolean z = C2200821BBo.LJIJI;
        LJJ(c2189391AmP);
    }

    @Override // X.AbstractC2201091BCp
    public final C2189391AmP LJIIJ(C1057250dcR c1057250dcR) {
        C2200721BBe c2200721BBe;
        EnumC1006810cJ5 enumC1006810cJ5;
        C2189391AmP c2189391AmPLJIIIZ = LJIIIZ();
        if ((c1057250dcR instanceof C2200721BBe) && (c2200721BBe = (C2200721BBe) c1057250dcR) != null) {
            float f = c2189391AmPLJIIIZ.LIZIZ;
            if (f > c2200721BBe.LIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Critical;
            } else if (f > c2200721BBe.LIZIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.High;
            } else if (f > c2200721BBe.LIZJ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ5 = EnumC1006810cJ5.Low;
            }
            C2189391AmP c2189391AmP = new C2189391AmP();
            c2189391AmP.LIZ = enumC1006810cJ5;
            c2189391AmP.LIZIZ = c2189391AmPLJIIIZ.LIZIZ;
            return c2189391AmP;
        }
        return c2189391AmPLJIIIZ;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILLIIL(C2189391AmP c2189391AmP, C2189391AmP c2189391AmP2) {
        if (c2189391AmP.LIZ != c2189391AmP2.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC2201091BCp
    public final void LJJI(C2201121BCs<C2189391AmP> c2201121BCs, C2189391AmP c2189391AmP, C1057250dcR c1057250dcR) {
        C2200721BBe c2200721BBe;
        EnumC1006810cJ5 enumC1006810cJ5;
        EnumC1006810cJ5 enumC1006810cJ52;
        C2189391AmP c2189391AmP2 = c2189391AmP;
        Float fValueOf = null;
        if ((c1057250dcR instanceof C2200721BBe) && (c2200721BBe = (C2200721BBe) c1057250dcR) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemperatureStateManager cpuChangeListener has defined config level, media: ");
            sbLIZ.append(c2200721BBe.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            float f = c2189391AmP2.LIZIZ;
            if (f > c2200721BBe.LIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Critical;
            } else if (f > c2200721BBe.LIZIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.High;
            } else if (f > c2200721BBe.LIZJ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ5 = EnumC1006810cJ5.Low;
            }
            C2189391AmP c2189391AmP3 = (C2189391AmP) c2201121BCs.LJ;
            C2189391AmP c2189391AmP4 = new C2189391AmP();
            c2189391AmP4.LIZ = enumC1006810cJ5;
            c2189391AmP4.LIZIZ = c2189391AmP2.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TemperatureStateManager, pre temperature: ");
            if (c2189391AmP3 != null) {
                fValueOf = Float.valueOf(c2189391AmP3.LIZIZ);
            }
            sbLIZ2.append(fValueOf);
            sbLIZ2.append(", new temperature: ");
            sbLIZ2.append(c2189391AmP2.LIZIZ);
            sbLIZ2.append(", resLevel: ");
            sbLIZ2.append(enumC1006810cJ5);
            sbLIZ2.append(' ');
            C2188811AlT.LIZIZ(sbLIZ2);
            c2201121BCs.LJ = c2189391AmP4;
            if (c2189391AmP3 != null && (enumC1006810cJ52 = c2189391AmP3.LIZ) != EnumC1006810cJ5.Unknown && enumC1006810cJ52 != enumC1006810cJ5) {
                c2201121BCs.LIZ(c2189391AmP3, c2189391AmP4);
            }
        }
    }
}
