package X;

import com.ss.android.ugc.aweme.outreach.dispersion.data.DispersionModel;

/* JADX INFO: renamed from: X.15rK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20650415rK {
    public static volatile boolean LIZIZ;
    public static final C20650415rK LIZ = new C20650415rK();
    public static final DispersionModel LIZJ = new DispersionModel(0, null, null, null);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C20652115rb());
    public static final C20651415rU LJ = new InterfaceC1590650rUl() { // from class: X.15rU
        @Override // X.InterfaceC1590650rUl
        public final boolean LIZ() {
            C20650415rK.LIZ.getClass();
            DispersionModel dispersionModelLIZ = C20650415rK.LIZ();
            return dispersionModelLIZ != null && dispersionModelLIZ.outreachDispersionExpValue > 0 && C282000B3m.LIZ();
        }
    };

    public static DispersionModel LIZ() {
        if (!LIZIZ) {
            LIZIZ = true;
            C20571715ed c20571715ed = C20571715ed.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("use hook ab: ");
            sbLIZ.append(false);
            C2188811AlT.LIZIZ(sbLIZ);
            c20571715ed.getClass();
        }
        return (DispersionModel) LIZLLL.getValue();
    }
}
