package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q7D, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q7D {
    public static final C0Q7D LIZ = new C0Q7D();
    public static final Map<String, C0Q7M> LIZIZ = new LinkedHashMap();

    public static void LIZ(String str) {
        long j;
        long jLongValue;
        Long lValueOf;
        Long l;
        Long l2;
        if (str == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, C0Q7M> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        C0Q7M c0q7m = (C0Q7M) linkedHashMap.get(str);
        if (c0q7m != null) {
            j = c0q7m.LIZIZ;
        } else {
            j = 0;
        }
        C0Q7M c0q7m2 = (C0Q7M) linkedHashMap.get(str);
        if (c0q7m2 != null && (l2 = c0q7m2.LIZ) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = jCurrentTimeMillis;
        }
        long j2 = j + (jCurrentTimeMillis - jLongValue);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotVisible endCardShow before= ");
        C0Q7M c0q7m3 = (C0Q7M) linkedHashMap.get(str);
        if (c0q7m3 != null) {
            lValueOf = Long.valueOf(c0q7m3.LIZIZ);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(" after= ");
        sbLIZ.append(j2);
        sbLIZ.append(", startTime= ");
        C0Q7M c0q7m4 = (C0Q7M) linkedHashMap.get(str);
        if (c0q7m4 != null) {
            l = c0q7m4.LIZ;
        } else {
            l = null;
        }
        sbLIZ.append(l);
        C2188811AlT.LIZIZ(sbLIZ);
        map.put(str, new C0Q7M(j2, (Long) null));
    }

    public static void LJ(int i, Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            LIZ.getClass();
            LJI(jSONObject, map);
            jSONObject.put("is_success", 1);
            jSONObject.put("loading_duration", 0L);
            jSONObject.put("click_times", 0);
            jSONObject.put("text_length", i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AppLogNewUtils.onEventV3("search_result_complete_show", jSONObject);
    }

    public static void LJI(JSONObject jSONObject, Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (C123100dR.LIZ((String) entry.getValue())) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static void LIZLLL(Integer num, String str, Map map) {
        JSONObject jSONObject = new JSONObject();
        LIZ.getClass();
        LJI(jSONObject, map);
        jSONObject.put("button_type", str);
        jSONObject.put("token_type", "tikbot");
        jSONObject.put("is_page", num);
        AppLogNewUtils.onEventV3("search_result_click", jSONObject);
    }

    public static void LIZIZ(int i, String str, Map map, boolean z) {
        String str2;
        if (z) {
            str2 = "tikbot_quick_interaction_show";
        } else {
            str2 = "tikbot_quick_interaction_click";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            LIZ.getClass();
            LJI(jSONObject, map);
            jSONObject.put("enter_from", C14TF.LIZIZ.LJJJLIIL());
            jSONObject.put("rank", String.valueOf(i));
            jSONObject.put("interaction_name", str);
            jSONObject.put("button_type", "click_info");
            jSONObject.put("enter_method", "none");
            jSONObject.put("source", "1");
            AppLogNewUtils.onEventV3(str2, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(long j, Map map, String str, Integer num) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("rank", str);
        c2344009Gk.LJ(num, "is_page");
        C20684815ws.LJIILLIIL("search_card_stay_duration", c2344009Gk.LIZ);
    }

    public static void LJFF(Integer num, Integer num2, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", C14TF.LIZIZ.LJJJLIIL());
        jSONObject.put("enter_method", "none");
        jSONObject.put("search_id", str);
        jSONObject.put("is_hidden", num);
        jSONObject.put("link_name", str2);
        jSONObject.put("link_url", str3);
        jSONObject.put("rank", num2);
        AppLogNewUtils.onEventV3("tikbot_webpage_link_show", jSONObject);
    }
}
