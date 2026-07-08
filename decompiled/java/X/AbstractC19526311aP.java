package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11aP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19526311aP extends AbstractC19529411au {
    public Map<String, String> LIZJ = C2097608Jq.LJ();

    public abstract C19528911ap LIZIZ(List list);

    public static Map LIZ(List list, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C19525911aL c19525911aL = (C19525911aL) it2.next();
            boolean zContainsKey = map.containsKey(c19525911aL.LIZIZ);
            String str = (String) map.get(c19525911aL.LIZIZ);
            if ((zContainsKey && (str == null || str.length() == 0)) || Intrinsics.LJFF(str, c19525911aL.LIZJ)) {
                linkedHashMap.put(c19525911aL.LIZIZ, Boolean.TRUE);
            }
        }
        return linkedHashMap;
    }
}
