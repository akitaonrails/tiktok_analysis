package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.080p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20481080p {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str) {
        HashMap<String, Object> mapLJIIJ;
        if (!C123100dR.LIZ(str) || str == null || (mapLJIIJ = C1741890vQh.LJIIJ(str)) == null || !(!mapLJIIJ.isEmpty())) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
            Object value = entry.getValue();
            if (C19719512Dh.LJII(value) && value != null) {
                LinkedList linkedList = new LinkedList();
                linkedList.addFirst(value);
                linkedHashMap.put(entry.getKey(), linkedList);
            }
        }
        return linkedHashMap;
    }
}
