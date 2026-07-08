package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS78S0200000_9;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0ohP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483170ohP implements C0IS1 {
    public final C1483080ohG LIZ;
    public C1482930oh1 LIZIZ;
    public volatile EnumC1483180ohQ LIZJ;
    public C741820T8a LIZLLL;
    public final AbstractC1483210ohT LJ;

    @Override // X.C0IS1
    public final void LIZ() {
        EnumC1483050ohD.INS.post(new ARunnableS123S0100000_23(this, 120));
    }

    @Override // X.C0IS1
    public final void LIZIZ() {
        EnumC1483050ohD.INS.post(new ARunnableS112S0100000_12(this, 327));
    }

    @Override // X.C0IS1
    public final void LIZJ() {
        EnumC1483050ohD.INS.post(new ARunnableS123S0100000_23(this, 119));
    }

    @Override // X.C0IS1
    public final C0IR1 LIZLLL() {
        return this.LJ.LIZ();
    }

    public final void LJ() {
        if (this.LIZJ != EnumC1483180ohQ.STARTED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopScene error, sceneId:");
            sbLIZ.append(this.LIZ.LIZ.LIZ);
            sbLIZ.append(", can't stopScene from state:");
            sbLIZ.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stopScene, sceneId:");
        sbLIZ2.append(this.LIZ.LIZ.LIZ);
        sbLIZ2.append(", from state:");
        sbLIZ2.append(this.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ2);
        this.LIZLLL.getClass();
        for (AbstractC1482950oh3 abstractC1482950oh3 : (ArrayList) this.LIZIZ.LIZ) {
            abstractC1482950oh3.getClass();
            C0NBW c0nbwLIZIZ = C0NBW.LIZIZ();
            c0nbwLIZIZ.LIZIZ.execute(new ARunnableS78S0200000_9(abstractC1482950oh3, c0nbwLIZIZ, 89));
        }
        this.LIZJ = EnumC1483180ohQ.STOPPED;
    }

    @Override // X.C0IS1
    public final C0IS3 getParams() {
        return this.LIZ.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyScene@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1483170ohP(C0IS3 c0is3) {
        AbstractC1483210ohT abstractC1483210ohT;
        C1483080ohG c1483080ohG = new C1483080ohG();
        this.LIZ = c1483080ohG;
        this.LIZJ = EnumC1483180ohQ.INIT;
        C786410Ut5.j4("create StrategyScene:@%s, sceneParams:%s", new Object[]{Integer.valueOf(hashCode()), c0is3});
        c1483080ohG.LIZ = c0is3;
        c1483080ohG.LIZJ = new C1479120oas();
        String str = c0is3.LIZJ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1632291488) {
            if (iHashCode != 2196294) {
                if (iHashCode == 2129562405) {
                    str.equals("LIST_ONE");
                }
            } else if (str.equals("GRID")) {
                abstractC1483210ohT = new AbstractC1483210ohT() { // from class: X.0ohR
                    public final C1483200ohS LIZ = new C1483200ohS();

                    @Override // X.AbstractC1483210ohT
                    public final C0IR1 LIZ() {
                        return this.LIZ;
                    }
                };
            }
            abstractC1483210ohT = new AbstractC1483210ohT() { // from class: X.0ohN
                public final C1483130ohL LIZ = new C1483130ohL();

                @Override // X.AbstractC1483210ohT
                public final C0IR1 LIZ() {
                    return this.LIZ;
                }
            };
        } else if (!str.equals("LIVE_ULTRA_FAST_MODE")) {
            abstractC1483210ohT = new AbstractC1483210ohT() { // from class: X.0ohN
                public final C1483130ohL LIZ = new C1483130ohL();

                @Override // X.AbstractC1483210ohT
                public final C0IR1 LIZ() {
                    return this.LIZ;
                }
            };
        } else {
            abstractC1483210ohT = new AbstractC1483210ohT() { // from class: X.0ohO
                public final C1483140ohM LIZ = new C1483140ohM();

                @Override // X.AbstractC1483210ohT
                public final C0IR1 LIZ() {
                    return this.LIZ;
                }
            };
        }
        this.LJ = abstractC1483210ohT;
        EnumC1483050ohD.INS.post(new ARunnableS123S0100000_23(this, 118));
    }
}
