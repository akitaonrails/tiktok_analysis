package X;

import android.view.View;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.03og, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C957203og {
    public static String LIZ(View view, HashMap map) {
        Object obj = map.get("room_id");
        if (obj != null) {
            map.put("source_content_id", obj);
        }
        String strLIZIZ = C848530XQl.LIZIZ(C848530XQl.LIZ, view, C1741890vQh.LJIIIIZZ(map));
        List<String> list = C957303oh.LIZ().addToCardEntranceInfoKeys;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(strLIZIZ);
        if (mapLJIIJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                if (list.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return C1741890vQh.LJIIIIZZ(linkedHashMap);
        }
        return null;
    }

    public static String LIZIZ(String str, View view, Map map) {
        HashMap mapLJ = C1741890vQh.LJ("entrance_info", map);
        if (mapLJ == null) {
            mapLJ = new HashMap();
        }
        if (str != null) {
            mapLJ.put("enter_from", str);
        }
        return LIZ(view, mapLJ);
    }
}
