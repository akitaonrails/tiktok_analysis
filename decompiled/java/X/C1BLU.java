package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.1BLU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLU extends AbstractC2203321BLe<C1BLP> {
    @Override // X.AbstractC2203321BLe
    public final boolean LIZ() {
        C1BLC c1blc = this.LIZ;
        C1BLR.LIZIZ(c1blc);
        String str = c1blc.LIZIZ;
        C1BLM c1blm = (C1BLM) ((HashMap) C1BLN.LIZJ).get(str);
        if (c1blm == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The state of ");
            sbLIZ.append(str);
            sbLIZ.append("was not found");
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            c1blc.LIZ(2, c1blc.LJIIIIZZ, null);
            return false;
        }
        int i = c1blm.LIZJ;
        C1BLQ.LIZJ(i, c1blc);
        if (i == 5) {
            if (c1blc.LIZLLL()) {
                c1blc.LIZJ(1);
                return true;
            }
        } else if (i == 2 || i == 4) {
            C1BLL.LJ().LJFF(c1blc.LIZ).LIZ(c1blc);
            return false;
        }
        C1BLL.LJ().LIZIZ(c1blc);
        return false;
    }

    public C1BLU(C1BLP c1blp) {
        super(c1blp);
    }
}
