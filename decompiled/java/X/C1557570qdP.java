package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0qdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557570qdP extends C20116013nK {
    public List<String> LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;

    public C1557570qdP() {
        this("");
    }

    @Override // X.C20116013nK
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append("\n [fallbackDomains=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(",shuffle = ");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(",cdnNoCache=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append("，maxAttempt=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append("，isRemote=");
        sbLIZ.append(false);
        sbLIZ.append(",useInteraction = ");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557570qdP(String str) {
        super(str);
        this.LJIIL = new ArrayList();
    }

    @Override // X.C20116013nK
    public final void LIZ(C20116013nK c20116013nK) {
        if (c20116013nK instanceof C1557570qdP) {
            C1557570qdP c1557570qdP = (C1557570qdP) c20116013nK;
            this.LJIIL = c1557570qdP.LJIIL;
            this.LJIILIIL = c1557570qdP.LJIILIIL;
            this.LJIILJJIL = c1557570qdP.LJIILJJIL;
            this.LJIILL = c1557570qdP.LJIILL;
            this.LJIILLIIL = c1557570qdP.LJIILLIIL;
        }
        super.LIZ(c20116013nK);
    }
}
