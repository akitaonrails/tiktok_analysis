package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0owM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492440owM {
    public static void LIZ(EnumC1492450owN enumC1492450owN, EnumC1492290ow7 enumC1492290ow7, HashMap map) {
        Object c098200Yq;
        String str;
        if (enumC1492290ow7 != null && map != null) {
            try {
                HashMap map2 = (HashMap) map.get("extra_info");
                if (map2 != null) {
                    Object obj = map2.get("start_time");
                    if (obj != null && (obj instanceof Long)) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long jLongValue = jCurrentTimeMillis - ((Number) obj).longValue();
                        int i = C1492430owL.LIZ[enumC1492450owN.ordinal()];
                        int i2 = 2;
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    str = "S";
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                str = "B";
                            }
                        } else {
                            str = "T";
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("start_time", obj);
                        linkedHashMap.put("show_notice_time", Long.valueOf(jCurrentTimeMillis));
                        linkedHashMap.put("notice_time", Long.valueOf(jLongValue));
                        int i3 = C1492430owL.LIZIZ[enumC1492290ow7.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    i2 = -1;
                                }
                            } else {
                                i2 = 1;
                            }
                        } else {
                            i2 = 0;
                        }
                        linkedHashMap.put("detect_res", Integer.valueOf(i2));
                        HashMap map3 = new HashMap();
                        map3.put("extra_info", linkedHashMap);
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("network_status", str);
                        c2344009Gk.LJ(map3, "network_status_detail");
                        C20684815ws.LJIILLIIL("network_observe_report", c2344009Gk.LIZ);
                    }
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }
}
