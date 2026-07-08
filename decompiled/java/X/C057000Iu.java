package X;

import java.io.IOException;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00Iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C057000Iu extends AbstractC057100Iv {
    public final AbstractC057100Iv LJFF;
    public final AbstractC057100Iv LJI;

    @Override // X.AbstractC057100Iv
    public final Object LIZIZ() {
        return new JSONObject();
    }

    @Override // X.AbstractC057100Iv
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final Pair LIZ(C1516680pZS c1516680pZS, Map map) throws IOException {
        long jLIZJ = c1516680pZS.LIZJ();
        Object objLIZ = null;
        Object objLIZ2 = null;
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI == -1) {
                c1516680pZS.LJ(jLIZJ);
                if (objLIZ == null) {
                    objLIZ = Unit.LIZ;
                }
                if (objLIZ2 == null) {
                    objLIZ2 = Unit.LIZ;
                }
                return new Pair(objLIZ, objLIZ2);
            }
            if (iLJI != 1) {
                if (iLJI == 2) {
                    objLIZ2 = this.LJI.LIZ(c1516680pZS, map);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unknown tag [");
                    sbLIZ.append(iLJI);
                    sbLIZ.append("] for map");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
            } else {
                objLIZ = this.LJFF.LIZ(c1516680pZS, map);
            }
        }
    }

    public C057000Iu(String str, int i, boolean z, AbstractC057100Iv abstractC057100Iv, AbstractC057100Iv abstractC057100Iv2) {
        super(i, str, z, 21);
        this.LJFF = abstractC057100Iv;
        this.LJI = abstractC057100Iv2;
    }
}
