package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ljg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551260Ljg {
    public static final Map<String, Integer> LIZ = LIZIZ(new C551250Ljf(0));

    public static final Map<String, Integer> LIZIZ(C551250Ljf c551250Ljf) {
        return C2097608Jq.LJII(new Pair("AIGCWorkflowQuotaNode", Integer.valueOf(c551250Ljf.LIZ)), new Pair("AIGCWorkflowUploadNode", Integer.valueOf(c551250Ljf.LIZIZ)), new Pair("AIGCWorkflowServerNode", Integer.valueOf(c551250Ljf.LIZJ)), new Pair("AIGCLegacyWorkflowServerNode", Integer.valueOf(c551250Ljf.LIZJ)), new Pair("AIGCWorkflowPollingNode", Integer.valueOf(c551250Ljf.LIZLLL)), new Pair("AIGCWorkflowDownloadNode", Integer.valueOf(c551250Ljf.LJ)));
    }

    public static final Map<String, Integer> LIZ(C552940LmO c552940LmO, Map<String, Integer> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C552890LmJ<?, ?, ?, ?>> entry : c552940LmO.LIZLLL.entrySet()) {
            String key = entry.getKey();
            Integer num = map.get(entry.getValue().LIZLLL.getNodeName());
            if (num != null) {
                linkedHashMap.put(key, Integer.valueOf(num.intValue()));
            }
        }
        return linkedHashMap;
    }
}
