package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741570vQB {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;
    public final long LIZLLL;
    public final Map<String, Object> LJ;
    public volatile long LJFF;
    public volatile boolean LJI;

    static {
        new C1741580vQC();
    }

    public final void LJ(Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                this.LJ.put(entry.getKey(), value);
            } else {
                this.LJ.remove(entry.getKey());
            }
        }
    }

    public final void LIZJ(String str, String str2, Map<String, ? extends Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tiktokec_rd_pdp_exception_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map2 = this.LIZJ;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.putAll(this.LJ);
        linkedHashMap.put("msg", str2);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C1018703yb.LJ(strLIZIZ, linkedHashMap);
    }

    public final void LIZLLL(Long l, String str, Map map) {
        long jCurrentTimeMillis;
        if (l != null && l.longValue() > 0) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map2 = this.LIZJ;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.putAll(this.LJ);
        linkedHashMap.put("action", this.LIZIZ);
        C1008603wy.LIZIZ(linkedHashMap, "key_point", str);
        linkedHashMap.put("init_time", String.valueOf(this.LIZLLL));
        linkedHashMap.put("action_duration", Integer.valueOf((int) (jCurrentTimeMillis - this.LIZLLL)));
        linkedHashMap.put("point_duration", Integer.valueOf((int) (jCurrentTimeMillis - this.LJFF)));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LJFF = jCurrentTimeMillis;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tiktokec_rd_pdp_perf_");
        sbLIZ.append(this.LIZ);
        C1018703yb.LJ(C2188811AlT.LIZIZ(sbLIZ), linkedHashMap);
    }

    public final void LIZ(String str, String str2, Map map, boolean z) {
        LinkedHashMap linkedHashMap;
        if (this.LJI) {
            String str3 = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("repeat track final-");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append('-');
            sbLIZ.append(str);
            LIZJ(str3, C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        this.LJI = true;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("action_result", C893803eS.LIZ(z));
        C1008603wy.LIZIZ(linkedHashMap, "msg", str2);
        LIZLLL(null, str, linkedHashMap);
    }

    public C1741570vQB(String str, String str2, Map map, long j, Map map2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = j;
        this.LJ = map2;
        this.LJFF = j;
    }

    public static void LIZIZ(C1741570vQB c1741570vQB, String str, Long l, Map map, int i) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        c1741570vQB.LIZLLL(l, str, map);
    }
}
