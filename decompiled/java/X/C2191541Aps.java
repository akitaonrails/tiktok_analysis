package X;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191541Aps extends AbstractC2191611Apz {
    public static final long LIZ(C1513780pUm<C2191511App, Long> c1513780pUm, int i, InterfaceC2190291Anr interfaceC2190291Anr, Long l) {
        String str;
        JSONObject jSONObject;
        String str2 = C2191131ApD.LIZ().calculateSpeedStrategyName;
        if (str2 == null || (str = C2191131ApD.LIZ().algoVersion) == null) {
            return 0L;
        }
        ArrayList<C1513780pUm<C2191511App, Long>.a> arrayListLIZ = c1513780pUm.LIZ(i);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLIZ, 10));
        Iterator<C1513780pUm<C2191511App, Long>.a> it2 = arrayListLIZ.iterator();
        while (true) {
            C2191511App c2191511App = null;
            if (!it2.hasNext()) {
                break;
            }
            C2191511App c2191511App2 = it2.next().LIZ;
            if (c2191511App2 != null) {
                c2191511App2.toMap();
                c2191511App = c2191511App2;
            }
            arrayList.add(c2191511App);
        }
        C1306400k6I c1306400k6I = new C1306400k6I(str2);
        c1306400k6I.LIZ(Boolean.valueOf(C2191131ApD.LIZ().needFilterSamples), "need_filter_samples");
        c1306400k6I.LIZ(arrayList, "samples");
        c1306400k6I.LIZ(str, "algo_version");
        if (l != null) {
            c1306400k6I.LIZ(Long.valueOf(l.longValue()), "req_file_size");
        }
        Object obj = C326690CrL.LIZ.runStrategySync(c1306400k6I).LIZ;
        if ((obj instanceof JSONObject) && (jSONObject = (JSONObject) obj) != null) {
            if (jSONObject.optInt("success") == 1) {
                return jSONObject.optLong("output");
            }
            String strOptString = jSONObject.optString("errorMsg");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runStrategy ");
            sbLIZ.append(str2);
            sbLIZ.append(" error:");
            sbLIZ.append(strOptString);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return 0L;
    }
}
