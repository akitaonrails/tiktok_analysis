package X;

import defpackage.g9;

/* JADX INFO: renamed from: X.10RW, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RW implements C10TO {
    public static final C10RW LIZ = new C10RW();
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static C10QZ LIZLLL;

    @Override // X.C10TO
    public final void LIZIZ() {
        LIZIZ = true;
        LJ();
        C10QI c10qi = new C10QI() { // from class: X.10Qa
            {
                g9 g9Var = g9.STRATEGY_TTS_SEA_EMPTY_AB;
            }
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("abGroup: ");
        sbLIZ.append(c10qi.LIZLLL("ab_group", "v0"));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C10TO
    public final void LIZJ() {
        LIZJ = true;
        LJ();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.10QI, X.10QZ] */
    public static void LJ() {
        if (LIZIZ && LIZJ) {
            ?? r2 = new C10QI() { // from class: X.10QZ
                {
                    g9 g9Var = g9.STRATEGY_TTS_SEA_AB;
                }
            };
            LIZLLL = r2;
            Boolean boolValueOf = Boolean.valueOf(r2.LIZ("is_ecomm_new", false));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryExposureTTSAB: ");
            sbLIZ.append(boolValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.C10TO
    public final C10RX LIZ() {
        return C10RX.LIZ;
    }

    @Override // X.C10TO
    public final C10SR LIZLLL() {
        return C10SR.LIZ;
    }
}
