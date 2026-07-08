package X;

import android.util.SparseArray;
import java.io.IOException;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00KU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00KU {
    public static final /* synthetic */ int LIZIZ = 0;
    public final SparseArray<AbstractC057100Iv> LIZ;

    public C00KU() {
        throw null;
    }

    public C00KU(SparseArray sparseArray) {
        this.LIZ = sparseArray;
    }

    public final JSONObject LIZ(C1516680pZS c1516680pZS, Map map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI == -1) {
                c1516680pZS.LJ(jLIZJ);
                for (int i = 0; i < this.LIZ.size(); i++) {
                    AbstractC057100Iv abstractC057100IvValueAt = this.LIZ.valueAt(i);
                    if (abstractC057100IvValueAt != null && (!jSONObject.has(abstractC057100IvValueAt.LIZ))) {
                        if (abstractC057100IvValueAt.LIZLLL) {
                            jSONObject.put(abstractC057100IvValueAt.LIZ, new JSONArray());
                        } else {
                            Object objLIZIZ = abstractC057100IvValueAt.LIZIZ();
                            if ((!Intrinsics.LJFF(objLIZIZ, -1)) && objLIZIZ != null) {
                                jSONObject.put(abstractC057100IvValueAt.LIZ, objLIZIZ);
                            }
                        }
                    }
                }
                return jSONObject;
            }
            AbstractC057100Iv abstractC057100Iv = this.LIZ.get(iLJI);
            if (abstractC057100Iv == null) {
                C1516700pZU.LJ(c1516680pZS);
            } else if (abstractC057100Iv.LIZLLL) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(abstractC057100Iv.LIZ);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONObject.put(abstractC057100Iv.LIZ, jSONArrayOptJSONArray);
                }
                jSONArrayOptJSONArray.put(abstractC057100Iv.LIZ(c1516680pZS, map));
            } else if (abstractC057100Iv instanceof C057000Iu) {
                Pair pairLIZ = ((C057000Iu) abstractC057100Iv).LIZ(c1516680pZS, map);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(abstractC057100Iv.LIZ);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                    jSONObject.put(abstractC057100Iv.LIZ, jSONObjectOptJSONObject);
                }
                String string = pairLIZ.getFirst().toString();
                Object second = pairLIZ.getSecond();
                if (second != null) {
                    jSONObjectOptJSONObject.put(string, second);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("decodedFieldData has null value: ");
                    sbLIZ.append(pairLIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
            } else {
                jSONObject.put(abstractC057100Iv.LIZ, abstractC057100Iv.LIZ(c1516680pZS, map));
            }
        }
    }
}
