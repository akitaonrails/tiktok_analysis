package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13fQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20067013fQ {
    public final C20053713dH LIZ;
    public final C20066513fL LIZIZ;
    public final C20067113fR LIZJ = new C20067113fR();
    public final C13B8 LIZLLL = new C13B8();
    public boolean LJ;

    public C20067013fQ(C20053713dH c20053713dH) {
        this.LIZ = c20053713dH;
        this.LIZIZ = new C20066513fL(c20053713dH.LLJLLIL.LIZIZ);
    }

    public final int LIZ(C20067813fY c20067813fY, InterfaceC20057813dw interfaceC20057813dw, boolean z) {
        boolean z2;
        int i;
        if (this.LJ) {
            return 0;
        }
        try {
            this.LJ = true;
            C20067413fU c20067413fULIZ = this.LIZJ.LIZ(c20067813fY, interfaceC20057813dw);
            int iLJIIJJI = c20067413fULIZ.LIZ.LJIIJJI();
            for (int i2 = 0; i2 < iLJIIJJI; i2++) {
                C20066813fO c20066813fOLJIIL = c20067413fULIZ.LIZ.LJIIL(i2);
                if (c20066813fOLJIIL.LIZLLL || c20066813fOLJIIL.LJII) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            int iLJIIJJI2 = c20067413fULIZ.LIZ.LJIIJJI();
            for (int i3 = 0; i3 < iLJIIJJI2; i3++) {
                C20066813fO c20066813fOLJIIL2 = c20067413fULIZ.LIZ.LJIIL(i3);
                if (z2 || C05ZS.LIZ(c20066813fOLJIIL2)) {
                    this.LIZ.LJJIZ(c20066813fOLJIIL2.LIZJ, this.LIZLLL, c20066813fOLJIIL2.LJIIIIZZ, true);
                    if (!this.LIZLLL.isEmpty()) {
                        this.LIZIZ.LIZ(c20066813fOLJIIL2.LIZ, this.LIZLLL, C05ZS.LIZ(c20066813fOLJIIL2));
                        this.LIZLLL.clear();
                    }
                }
            }
            boolean zLIZIZ = this.LIZIZ.LIZIZ(c20067413fULIZ, z);
            if (!c20067413fULIZ.LIZJ) {
                int iLJIIJJI3 = c20067413fULIZ.LIZ.LJIIJJI();
                for (int i4 = 0; i4 < iLJIIJJI3; i4++) {
                    C20066813fO c20066813fOLJIIL3 = c20067413fULIZ.LIZ.LJIIL(i4);
                    if ((!C1378605aS.LIZJ(C05ZS.LJ(c20066813fOLJIIL3, true), 0L)) && c20066813fOLJIIL3.LIZIZ()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            } else {
                i = 0;
            }
            int i5 = (i << 1) | (zLIZIZ ? 1 : 0);
            this.LJ = false;
            return i5;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJ = false;
            throw th;
        }
    }
}
