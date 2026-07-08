package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0vRJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742270vRJ {
    public static Map LIZIZ(IPdpStarter.PdpEnterParam pdpEnterParam) {
        Object obj;
        Object obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map = pdpEnterParam.trackParams;
        if (map != null && (obj2 = map.get("author_id")) != null) {
            linkedHashMap.put("kol_id", obj2);
        }
        Map<String, Object> map2 = pdpEnterParam.trackParams;
        if (map2 != null && (obj = map2.get("lineup_room_id")) != null) {
            linkedHashMap.put("live_room_id", obj);
        }
        linkedHashMap.put("promotion_response_style", 1);
        return linkedHashMap;
    }

    public static void LIZ(IPdpStarter.PdpEnterParam pdpEnterParam, Map map) {
        Map<String, Object> map2 = pdpEnterParam.trackParams;
        if (map2 != null && map2.containsKey("traffic_source_list")) {
            Map<String, Object> map3 = pdpEnterParam.trackParams;
            Object obj = null;
            if (map3 != null) {
                obj = map3.get("traffic_source_list");
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object objOpt = jSONArray.opt(i);
                        if (objOpt instanceof Number) {
                            arrayList.add(Integer.valueOf(((Number) objOpt).intValue()));
                        }
                    }
                    if (C756302xN.LIZ(arrayList)) {
                        map.put("traffic_source_list", arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof ArrayList) {
                ArrayList arrayList2 = (ArrayList) obj;
                if (arrayList2 != null && C756302xN.LIZ(arrayList2)) {
                    map.put("traffic_source_list", arrayList2);
                    return;
                }
                return;
            }
            if (obj instanceof String) {
                try {
                    List listLJ = C08JS.LJ(Integer[].class, (String) obj);
                    if (C756302xN.LIZ(listLJ)) {
                        map.put("traffic_source_list", listLJ);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
        }
    }
}
