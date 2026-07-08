package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386000mAg {
    public static final C1385990mAf LIZ;
    public static final Map<String, Map<String, Object>> LIZIZ;
    public static Map<String, Map<String, Object>> LIZJ;

    /* JADX WARN: Type inference failed for: r12v0, types: [X.0mAf] */
    static {
        ?? r12 = new Object() { // from class: X.0mAf
            public static List LIZ(C1385990mAf c1385990mAf) {
                List listLJIIJJI = C1697810uHb.LJIIJJI(0, 1, 2, 3, 4, 5);
                List<Function1> listLJIIJJI2 = C1697810uHb.LJIIJJI(new C1385980mAe(c1385990mAf), new C1385940mAa(c1385990mAf), new C1385950mAb(c1385990mAf), new C1385970mAd(c1385990mAf), new C1385960mAc(c1385990mAf), new C1385930mAZ(c1385990mAf), new C1385920mAY(c1385990mAf));
                ArrayList arrayList = new ArrayList();
                for (Function1 function1 : listLJIIJJI2) {
                    Iterator it2 = listLJIIJJI.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(function1.invoke(Integer.valueOf(((Number) it2.next()).intValue())));
                    }
                }
                return arrayList;
            }
        };
        LIZ = r12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("matching_strategy_orchestrator", C2097608Jq.LJIIIIZZ(new Pair("type", "match_all"), new Pair("matching_strategies", C1385990mAf.LIZ(r12))));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("matching_strategy_orchestrator", C2097608Jq.LJIIIIZZ(new Pair("type", "match_all"), new Pair("matching_strategies", C1385990mAf.LIZ(r12))));
        linkedHashMap2.put("ranking_strategy", C2097608Jq.LJIIIIZZ(new Pair("type", "psp"), new Pair("scene_key", "social_search_ranking_strategy"), new Pair("strategy_key", "bucket_ranking_v1")));
        LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("share_panel_config_v0", linkedHashMap), new Pair("share_panel_config_v1", linkedHashMap2));
        LIZJ = new LinkedHashMap();
    }
}
