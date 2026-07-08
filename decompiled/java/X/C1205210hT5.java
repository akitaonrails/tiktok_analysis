package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hT5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205210hT5 {
    public static final void LIZ(Aweme aweme, Object obj, String str, String str2) {
        Object obj2;
        Map map;
        Map map2;
        if (!Intrinsics.LJFF(str, "homepage_nearby")) {
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1205250hT9 c1205250hT9 = C1205250hT9.LIZIZ;
            c1205250hT9.LJIIJ(str2, linkedHashMap);
            HashMap<String, String> map3 = new HashMap<>();
            if (aweme != null) {
                c1205250hT9.LIZJ(str, map3, aweme, true);
            }
            map3.put("nearby_inner_session_id", String.valueOf(c1205250hT9.LIZLLL()));
            if (obj instanceof C2344009Gk) {
                ((C2344009Gk) obj).LJII(linkedHashMap);
                C2344009Gk c2344009Gk = (C2344009Gk) obj;
                c2344009Gk.LJI(map3);
                obj2 = c2344009Gk;
            } else if (C19719512Dh.LJII(obj)) {
                if (C19719512Dh.LJII(obj) && (map2 = (Map) obj) != null) {
                    map2.putAll(linkedHashMap);
                }
                if (C19719512Dh.LJII(obj) && (map = (Map) obj) != null) {
                    map.putAll(map3);
                    obj2 = Unit.LIZ;
                } else {
                    obj2 = null;
                }
            } else {
                if (obj instanceof JSONObject) {
                    try {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            ((JSONObject) obj).put((String) entry.getKey(), entry.getValue());
                        }
                        for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                            ((JSONObject) obj).put(entry2.getKey(), entry2.getValue());
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                obj2 = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(obj2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
