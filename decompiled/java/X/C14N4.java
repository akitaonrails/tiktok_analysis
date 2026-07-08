package X;

import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.14N4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14N4 implements C14NJ {
    @Override // X.C14NJ
    public final String getName() {
        return "tracker";
    }

    @Override // X.C14NJ
    public final void LIZ(Map<String, ? extends Object> map, C14NX c14nx, Map<String, ? extends Object> map2, C14NF c14nf) {
        Object obj;
        String str;
        Object obj2;
        Map map3;
        String string;
        Object objLJ;
        Map<String, String> mapLJ = null;
        if (map != null) {
            obj = map.get("trackerEvent");
        } else {
            obj = null;
        }
        if ((obj instanceof String) && (str = (String) obj) != null) {
            if (map != null) {
                obj2 = map.get("trackerParams");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof Map) && (map3 = (Map) obj2) != null) {
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    String strValueOf = String.valueOf(entry.getKey());
                    Object value = entry.getValue();
                    if (value == null || (objLJ = c14nx.LJ(value)) == null || (string = objLJ.toString()) == null) {
                        string = "";
                    }
                    arrayList.add(new Pair(strValueOf, string));
                }
                Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
                INimbleModelAbility iNimbleModelAbility = (INimbleModelAbility) C1558520qew.LIZ(c14nx.LIZIZ(), INimbleModelAbility.class, null);
                if (iNimbleModelAbility != null) {
                    mapLJ = iNimbleModelAbility.G7();
                }
                ExecutorService executorService = C1909880zne.LIZ;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                C1909880zne.LIZLLL(str, mapLJIILLIIL, mapLJ, C1910150zo5.LIZ());
            }
        }
    }
}
