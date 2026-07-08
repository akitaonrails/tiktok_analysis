package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Itt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481150Itt {
    public static final Map<String, String> LIZ = new LinkedHashMap();
    public static final List<Function0<Unit>> LIZIZ = new ArrayList();
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"to_user_id", "share_relation_type", "share_platform", "share_follow_status", "rank_index", "panel_source"});

    public static void LIZIZ() {
        ((LinkedHashMap) LIZ).clear();
        ((ArrayList) LIZIZ).clear();
    }

    public static void LIZ(Function0 function0) {
        if (((LinkedHashMap) LIZ).keySet().containsAll(LIZJ)) {
            function0.invoke();
        } else {
            ((ArrayList) LIZIZ).add(function0);
        }
    }

    public static void LIZJ(Map map) {
        Map<String, String> map2 = LIZ;
        map2.putAll(map);
        if (((LinkedHashMap) map2).keySet().containsAll(LIZJ)) {
            Iterator it2 = ((ArrayList) LIZIZ).iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
            ((ArrayList) LIZIZ).clear();
        }
    }
}
