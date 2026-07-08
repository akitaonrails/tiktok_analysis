package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.statistic.StatisticLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15wt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20684915wt {
    public static void LIZ(String str, Map map) {
        C1770180wAK c1770180wAK = C1770180wAK.LIZ;
        c1770180wAK.getClass();
        if (map != null && Intrinsics.LJFF(str, "trending_words_show") && Intrinsics.LJFF(map.get("words_source"), "comment_related_search") && C1202904nD.LIZ()) {
            String str2 = (String) map.get("words_content");
            c1770180wAK.getClass();
            C1770180wAK.LIZIZ = str2;
        }
        try {
            LIZLLL(str, map);
            if (C20684815ws.LIZLLL && C20684815ws.LIZIZ != null) {
                Iterator<InterfaceC20685415wy> it2 = C20684815ws.LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(str, map);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(String str, Map map) {
        try {
            try {
                C20685015wu.LIZ(str, map);
                LIZ(str, map);
            } catch (Exception e) {
                try {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "ExploreMobLancet onEventV3 exception");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJFF(e2, "MobClickConsumeLancet onEventV3 exception");
                }
            }
            C2252051DCp.LIZ.getClass();
            C2252051DCp.LJIIIZ(str, map);
            if (((Boolean) C286270BJx.LIZ.getValue()).booleanValue() && C1896840zSc.LIZIZ.contains(str)) {
                C1896840zSc.LIZ.put(str, map);
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public static void LIZLLL(String str, Map<String, String> map) {
        Set<Map.Entry<String, String>> setEntrySet;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(null)) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("launch_from", null);
        }
        C807620VmC c807620VmC = C807630VmD.LIZ;
        c807620VmC.getClass();
        boolean zLJI = MethodIDManager.LJI(137729);
        HashMap map2 = new HashMap();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            for (Map.Entry<String, String> entry : setEntrySet) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        c807620VmC.LIZIZ(new StatisticLog(str, map2, 16));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJFF(String str, Map map) {
        try {
            C20685115wv.LIZ(str, map);
            LIZIZ(str, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "Text2ImageMobLancet onEventV3 exception");
        }
    }

    public static void LJ(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        try {
            LIZJ(context, "event_v1", str, str2, j, j2, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if ((C2213981Bky.LIZIZ.LIZLLL() && C2211941Bhg.LIZ.LIZLLL()) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "event_v1";
        }
        if (!C2093608Ic.LJ(null)) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("launch_from", (Object) null);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (context != null) {
            C807620VmC c807620VmC = C807630VmD.LIZ;
            Long lValueOf = Long.valueOf(j);
            Long lValueOf2 = Long.valueOf(j2);
            c807620VmC.getClass();
            boolean zLJI = MethodIDManager.LJI(137729);
            HashMap map = new HashMap();
            if (str != null) {
                map.put("category", str);
            }
            if (str3 != null) {
                map.put("label", str3);
            }
            if (lValueOf != null) {
                map.put("value", lValueOf);
            }
            if (lValueOf2 != null) {
                map.put("ext_value", lValueOf2);
            }
            if (jSONObject != null) {
                map.put("ext_json", jSONObject);
            }
            c807620VmC.LIZIZ(new StatisticLog(str2, map, 8));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }
}
