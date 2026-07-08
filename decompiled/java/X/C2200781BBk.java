package X;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: renamed from: X.1BBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200781BBk extends AbstractC2201091BCp<C1512930pTP> implements InterfaceC2200861BBs {
    public static final C2200781BBk LJFF = new C2200781BBk();

    @Override // X.AbstractC2201091BCp
    public final void LJIIL() throws Exception {
        C2200791BBl c2200791BBl = C2200791BBl.LIZ;
        c2200791BBl.getClass();
        if (C2200821BBo.LJIILL) {
            Context context = C798140VSq.LIZ;
            if (context != null) {
                C786410Ut5.LJIL(context, c2200791BBl, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, C0NBO.LIZIZ());
            }
        } else {
            Context context2 = C798140VSq.LIZ;
            if (context2 != null) {
                C786410Ut5.LJIJJ(context2, c2200791BBl, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            }
        }
        C2200791BBl.LIZLLL = this;
    }

    @Override // X.AbstractC2201091BCp
    public final C1512930pTP LJIILIIL() {
        return new C1512930pTP();
    }

    @Override // X.AbstractC2201091BCp
    public final C1512930pTP LJIILJJIL() {
        C2200791BBl.LIZ.getClass();
        return C2200791BBl.LIZIZ;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILL() {
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LJIJI) {
            return true;
        }
        return this instanceof C2200681BBa;
    }

    @Override // X.AbstractC2201091BCp
    public final void LJIJ() {
        C2200791BBl.LIZ.getClass();
        C2200791BBl.LIZJ = true;
    }

    @Override // X.AbstractC2201091BCp
    public final void LJIJI() {
        C2200791BBl.LIZ.getClass();
        C2200791BBl.LIZJ = false;
    }

    @Override // X.AbstractC2201091BCp
    public final InterfaceC1702080uOU LJIIJJI() {
        return C1BC9.Battery;
    }

    @Override // X.InterfaceC2200861BBs
    public final void LIZJ(C1512930pTP c1512930pTP) {
        LJJ(c1512930pTP);
    }

    @Override // X.AbstractC2201091BCp
    public final C1512930pTP LJIIJ(C1057250dcR c1057250dcR) {
        C2200811BBn c2200811BBn;
        EnumC1006810cJ5 enumC1006810cJ5;
        C1512930pTP c1512930pTPLJIIIZ = LJIIIZ();
        if ((c1057250dcR instanceof C2200811BBn) && (c2200811BBn = (C2200811BBn) c1057250dcR) != null) {
            float f = c1512930pTPLJIIIZ.LIZLLL;
            if (f < c2200811BBn.LIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Critical;
            } else if (f < c2200811BBn.LIZIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.High;
            } else if (f < c2200811BBn.LIZJ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ5 = EnumC1006810cJ5.Low;
            }
            C1512930pTP c1512930pTP = new C1512930pTP();
            c1512930pTP.LIZ = enumC1006810cJ5;
            c1512930pTP.LJ = c1512930pTPLJIIIZ.LJ;
            c1512930pTP.LIZLLL = c1512930pTPLJIIIZ.LIZLLL;
            return c1512930pTP;
        }
        return c1512930pTPLJIIIZ;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILLIIL(C1512930pTP c1512930pTP, C1512930pTP c1512930pTP2) {
        C1512930pTP c1512930pTP3 = c1512930pTP;
        C1512930pTP c1512930pTP4 = c1512930pTP2;
        if (c1512930pTP3.LIZIZ != c1512930pTP4.LIZIZ || c1512930pTP3.LJ != c1512930pTP4.LJ || c1512930pTP3.LIZ != c1512930pTP4.LIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2201091BCp
    public final void LJJI(C2201121BCs<C1512930pTP> c2201121BCs, C1512930pTP c1512930pTP, C1057250dcR c1057250dcR) {
        C2200811BBn c2200811BBn;
        EnumC1006810cJ5 enumC1006810cJ5;
        EnumC1006810cJ5 enumC1006810cJ52;
        C1512930pTP c1512930pTP2 = c1512930pTP;
        if ((c1057250dcR instanceof C2200811BBn) && (c2200811BBn = (C2200811BBn) c1057250dcR) != null) {
            float f = c1512930pTP2.LIZLLL;
            if (f < c2200811BBn.LIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Critical;
            } else if (f < c2200811BBn.LIZIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.High;
            } else if (f < c2200811BBn.LIZJ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ5 = EnumC1006810cJ5.Low;
            }
            C1702170uOd c1702170uOd = c2201121BCs.LJ;
            C1512930pTP c1512930pTP3 = new C1512930pTP();
            c1512930pTP3.LIZ = enumC1006810cJ5;
            c1512930pTP3.LJ = c1512930pTP2.LJ;
            c1512930pTP3.LIZLLL = c1512930pTP2.LIZLLL;
            c2201121BCs.LJ = c1512930pTP3;
            if (c1702170uOd != null && (enumC1006810cJ52 = c1702170uOd.LIZ) != EnumC1006810cJ5.Unknown && enumC1006810cJ52 != enumC1006810cJ5) {
                c2201121BCs.LIZ(c1702170uOd, c1512930pTP3);
            }
        }
    }
}
