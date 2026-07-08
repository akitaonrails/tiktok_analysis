package X;

/* JADX INFO: renamed from: X.15kN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20607315kN implements InterfaceC20605815k8 {
    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ(Exception exc) {
    }

    public void LJFF() {
    }

    public void LJI(boolean z) {
    }

    public void LJII(Exception exc) {
    }

    public void LJIIIIZZ() {
    }

    public void LJIIIZ(boolean z) {
    }

    @Override // X.InterfaceC20605815k8
    public final void LIZ(C20607615kQ c20607615kQ) {
        AbstractC20607715kR abstractC20607715kR = c20607615kQ.LIZ;
        EnumC323450Cm7 enumC323450Cm7 = abstractC20607715kR.LIZ;
        if (abstractC20607715kR instanceof C20608115kV) {
            int i = C326760CrS.LIZ[enumC323450Cm7.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LJIIIIZZ();
                        return;
                    }
                    throw new C1954807lC();
                }
                LJFF();
                return;
            }
            LIZJ();
            return;
        }
        if (abstractC20607715kR instanceof C20608015kU) {
            int i2 = C326760CrS.LIZ[enumC323450Cm7.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        LJIIIZ(true);
                        return;
                    }
                    throw new C1954807lC();
                }
                LJI(true);
                return;
            }
            LIZLLL();
            return;
        }
        if (abstractC20607715kR instanceof C20607815kS) {
            Exception exc = ((C20607815kS) abstractC20607715kR).LIZLLL;
            int i3 = C326760CrS.LIZ[enumC323450Cm7.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        LJII(exc);
                        return;
                    }
                    throw new C1954807lC();
                }
                LJ(exc);
                return;
            }
            LIZIZ();
            return;
        }
        if (!(abstractC20607715kR instanceof C20607915kT)) {
            return;
        }
        int i4 = C326760CrS.LIZ[enumC323450Cm7.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    LJIIIZ(false);
                    return;
                }
                throw new C1954807lC();
            }
            LJI(false);
            return;
        }
        LIZLLL();
    }
}
