package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1DTI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DTI {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1DTG] */
    public static C1DTG LIZ() {
        if (C1DTH.LJIIJ == null) {
            final C1DTH c1dth = new C1DTH();
            C1DTH.LJIIJ = new Object() { // from class: X.1DTG
                public long LIZ;
                public long LIZIZ;

                public final void LJI() {
                    C1DTH.LJIIJ = null;
                    if (c1dth.LIZ <= 0 || this.LIZIZ == 0) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("feature_type", c1dth.LJIIIZ);
                    linkedHashMap.put("asset_id", c1dth.LIZJ);
                    linkedHashMap.put("resource_from", c1dth.LIZLLL);
                    linkedHashMap.put("download_result_code", String.valueOf(c1dth.LJ));
                    linkedHashMap.put("asset_resource_from", c1dth.LIZIZ);
                    linkedHashMap.put("download_time_consuming", String.valueOf(c1dth.LJFF));
                    linkedHashMap.put("is_replace_feature", String.valueOf(c1dth.LJII));
                    linkedHashMap.put("apply_effect_time", String.valueOf(c1dth.LJI));
                    linkedHashMap.put("apply_effect_result", String.valueOf(c1dth.LJIIIIZZ));
                    linkedHashMap.put("apply_feature_total_time", String.valueOf(c1dth.LIZ));
                    C00YL c00ylLIZ = C1706400uVS.LIZ();
                    if (c00ylLIZ != null) {
                        c00ylLIZ.LIZ("ame_performance_apply_feature", linkedHashMap);
                    }
                }

                public final void LIZ() {
                    c1dth.LJI = (int) (System.currentTimeMillis() - this.LIZ);
                }

                public final void LIZIZ() {
                    c1dth.LIZ = (int) (System.currentTimeMillis() - this.LIZIZ);
                }

                public final void LJFF() {
                    this.LIZ = System.currentTimeMillis();
                }

                public final void LJII() {
                    this.LIZIZ = System.currentTimeMillis();
                }

                public final void LIZJ(boolean z) {
                    String str;
                    if (z) {
                        str = "cache";
                    } else {
                        str = "net";
                    }
                    c1dth.LIZIZ = str;
                }

                public final void LIZLLL(long j) {
                    c1dth.LJFF = (int) j;
                }

                public static void LJ(Long l, String str, boolean z) {
                    String str2;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("template_id", str);
                    if (z) {
                        str2 = "success";
                    } else {
                        str2 = "fail";
                    }
                    pairArr[1] = new Pair("deliver_result", str2);
                    Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    if (l != null) {
                        mapLJIIJ.put("time_cost", String.valueOf(l.longValue()));
                    }
                    C00YL c00ylLIZ = C1706400uVS.LIZ();
                    if (c00ylLIZ != null) {
                        c00ylLIZ.LIZ("server_deliver_template", mapLJIIJ);
                    }
                }
            };
        }
        return C1DTH.LJIIJ;
    }
}
