package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474570IjH {
    public static final List<String> LIZ = Collections.singletonList("livesdk_send_gift");
    public static final List<String> LIZIZ = Collections.singletonList("livesdk_recharge_success");
    public static final Map<String, List<String>> LIZJ = C2097608Jq.LJIIJ(new Pair("livesdk_send_gift", C1697810uHb.LJIIJJI("money", "gift_info", "gift_cnt")), new Pair("livesdk_recharge_success", Collections.singletonList("money")));

    public static void LIZ(String str, Map map) {
        List list = (List) ((LinkedHashMap) LIZJ).get(str);
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                map.remove(it2.next());
            }
        }
    }
}
