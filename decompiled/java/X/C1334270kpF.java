package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334270kpF {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(JSONObject jSONObject) {
        String strOptString;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("biz_tag");
        } else {
            strOptString = null;
        }
        Set<String> set = C196700pJ.LIZ;
        if (strOptString == null || a0.LJJJIL(strOptString) || !C196700pJ.LIZ.contains(strOptString)) {
            return false;
        }
        return true;
    }

    public static Map LIZIZ(JSONObject jSONObject) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        boolean z;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        String string8;
        String str = "";
        if (jSONObject == null) {
            return C2097608Jq.LJ();
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt == null || (string8 = objOpt.toString()) == null) {
                    string8 = "";
                }
                linkedHashMap.put(next, string8);
            }
            return linkedHashMap;
        } catch (ConcurrentModificationException e) {
            TryCatchGuardChecker.doCheck(e);
            C13DA c13da = new C13DA();
            c13da.put("biz_tag", jSONObject.optString("biz_tag"));
            c13da.put("duration", String.valueOf(jSONObject.optLong("duration")));
            c13da.put("decode_duration", String.valueOf(jSONObject.optLong("decode_duration")));
            c13da.put("queue_duration", String.valueOf(jSONObject.optLong("queue_duration")));
            c13da.put("hit_cdn_cache", jSONObject.optString("hit_cdn_cache"));
            c13da.put("fail_reason", jSONObject.optString("fail_reason"));
            c13da.put("image_size", jSONObject.optString("file_size"));
            c13da.put("image_type", jSONObject.optString("image_type"));
            c13da.put("image_url", jSONObject.optString("uri"));
            c13da.put("nw_session_trace", jSONObject.optString("nw-session-trace"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("net_timing_detail");
            if (jSONObjectOptJSONObject == null || (string = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_connect")).toString()) == null) {
                string = "";
            }
            c13da.put("connect_duration", string);
            if (jSONObjectOptJSONObject == null || (string2 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_dns")).toString()) == null) {
                string2 = "";
            }
            c13da.put("dns_duration", string2);
            if (jSONObjectOptJSONObject == null || (string3 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_ssl")).toString()) == null) {
                string3 = "";
            }
            c13da.put("ssl_duration", string3);
            if (jSONObjectOptJSONObject == null || (string4 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_wait")).toString()) == null) {
                string4 = "";
            }
            c13da.put("wait_duration", string4);
            if (jSONObjectOptJSONObject == null || (string5 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_send")).toString()) == null) {
                string5 = "";
            }
            c13da.put("send_duration", string5);
            if (jSONObjectOptJSONObject == null || (string6 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_receive")).toString()) == null) {
                string6 = "";
            }
            c13da.put("receive_duration", string6);
            if (jSONObjectOptJSONObject == null || (string7 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_total")).toString()) == null) {
                string7 = "";
            }
            c13da.put("timing_total", string7);
            boolean z4 = true;
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("timing_isCached")) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "1";
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c13da.put("is_net_cached", obj);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("timing_isFromProxy")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            c13da.put("is_from_proxy", obj2);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("timing_isSocketReused")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c13da.put("is_socket_reused", str2);
            c13da.put("image_source", String.valueOf(jSONObject.optInt("from")));
            String strValueOf = String.valueOf(TTNetInit.getEffectiveConnectionType());
            if (strValueOf != null) {
                str = strValueOf;
            }
            c13da.put("network_quality_level", str);
            c13da.put("scene_tag", jSONObject.optString("scene_tag"));
            c13da.put("download_duration", String.valueOf(jSONObject.optLong("download_duration")));
            c13da.put("fail_phase", jSONObject.optString("fail_phase"));
            c13da.put("err_code", jSONObject.optString("err_code"));
            c13da.put("err_desc", jSONObject.optString("err_desc"));
            c13da.put("is_lynx", String.valueOf(jSONObject.optInt("is_lynx")));
            c13da.put("extra_bitmap_config", jSONObject.optString("extra_bitmap_config"));
            c13da.put("image_ram_size", jSONObject.optString("image_ram_size"));
            String strOptString = jSONObject.optString("nw-session-trace");
            if (strOptString.length() <= 0) {
                z4 = false;
            }
            if (z4) {
                c13da.put("image_x_cost", a0.LJLIIIL(a0.LJJLJ(' ', strOptString, strOptString)).toString());
            }
            c13da.put("fallback_conversion", "true");
            return c13da.build();
        }
    }
}
