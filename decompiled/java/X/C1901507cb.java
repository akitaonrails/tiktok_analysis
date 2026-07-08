package X;

import com.ss.ugc.effectplatform.model.LocalPerfStats;
import com.ss.ugc.effectplatform.model.PerfMetricEntry;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1901507cb {
    public static LocalPerfStats LIZ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            PerfMetricEntry perfMetricEntry = (PerfMetricEntry) entry.getValue();
            if (LocalPerfStats.INCLUDED_METRICS.contains(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("local_");
                sbLIZ.append(str);
                sbLIZ.append("_freq");
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), Double.valueOf(perfMetricEntry.freq));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("local_");
                sbLIZ2.append(str);
                sbLIZ2.append("_avg");
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), Double.valueOf(perfMetricEntry.f442avg));
            }
        }
        return new LocalPerfStats(linkedHashMap);
    }
}
