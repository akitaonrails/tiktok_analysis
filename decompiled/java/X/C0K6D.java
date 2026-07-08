package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0K6D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6D {
    public static final C0K6D LIZ = new C0K6D();

    public static final void LIZLLL(Throwable th, Map map) throws JSONException {
        int iIntValue;
        C0K6E c0k6eLIZ = C09OK.LIZ(null, th);
        C0K6F c0k6fLIZ = C0K6L.LIZ("pgc_subscription_exception");
        Map<String, String> map2 = c0k6fLIZ.LIZLLL;
        "1".toString();
        map2.put("is_from_pgc_subscription", "1");
        Integer num = c0k6eLIZ.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c0k6fLIZ.LIZJ(Integer.valueOf(iIntValue), "error_code");
        String str = c0k6eLIZ.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Map<String, String> map3 = c0k6fLIZ.LIZLLL;
        str.toString();
        map3.put("error_msg", str);
        String str3 = c0k6eLIZ.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        Map<String, String> map4 = c0k6fLIZ.LIZLLL;
        str3.toString();
        map4.put("error_prompt", str3);
        String str4 = c0k6eLIZ.LIZLLL;
        if (str4 != null) {
            str2 = str4;
        }
        Map<String, String> map5 = c0k6fLIZ.LIZLLL;
        str2.toString();
        map5.put("log_id", str2);
        C0K66.LIZJ(c0k6fLIZ);
        if (th != null) {
            c0k6fLIZ.LIZ(th);
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C0K66.LIZ(c0k6fLIZ, (String) entry.getKey(), entry.getValue());
        }
        c0k6fLIZ.LIZLLL(C0K6G.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
    }

    public static final void LJFF(long j, Map map) throws JSONException {
        C0K6F c0k6fLIZ = C0K6L.LIZ("pgc_subscription_api_perf");
        Map<String, String> map2 = c0k6fLIZ.LIZLLL;
        "1".toString();
        map2.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZJ.put("duration", Float.valueOf(j));
        C0K66.LIZJ(c0k6fLIZ);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C0K66.LIZ(c0k6fLIZ, (String) entry.getKey(), entry.getValue());
        }
        c0k6fLIZ.LIZLLL(C0K6G.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
    }

    public static final void LIZJ(Throwable th, String str, Map<String, ? extends Object> map) throws JSONException {
        LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("source", str));
        linkedHashMapLJII.putAll(map);
        LIZLLL(th, linkedHashMapLJII);
    }

    public static Map LIZIZ(EnumC499440JiI enumC499440JiI, String str, String str2, Map map) {
        LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("api_scene", enumC499440JiI.getScene()), new Pair("source", str));
        if (str2 != null && !a0.LJJJIL(str2)) {
            linkedHashMapLJII.put("api_path", str2);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str3 = (String) entry.getValue();
            if (!a0.LJJJIL(str3)) {
                linkedHashMapLJII.put(key, str3);
            }
        }
        return linkedHashMapLJII;
    }

    public static final void LIZ(EnumC499440JiI enumC499440JiI, String str, long j, String str2, Map<String, String> map, boolean z) throws JSONException {
        LIZ.getClass();
        LJFF(j, C2097608Jq.LJIIL(LIZIZ(enumC499440JiI, str, str2, map), C2097608Jq.LJIIIIZZ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success"), new Pair("completed_without_item", Integer.valueOf(z ? 1 : 0)))));
    }
}
