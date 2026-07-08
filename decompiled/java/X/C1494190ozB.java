package X;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494190ozB {
    public static final Set<String> LIZ;
    public static final double LIZIZ;

    static {
        HashSet hashSet = new HashSet();
        LIZ = hashSet;
        LIZIZ = 1.0E-9d;
        hashSet.add("ttnet_high_lvl_conn");
        hashSet.add("multinetwork");
        hashSet.add("mpa_client");
        hashSet.add("ttnet_feedback_detect");
        hashSet.add("ttnet_exception_detect");
        hashSet.add("ttnet_stress_detect");
        hashSet.add("ttnet_polling_detect");
        hashSet.add("long_cost_net_task");
        hashSet.add("ws_all");
        hashSet.add("frontier_all");
        hashSet.add("frontier_msg");
        hashSet.add("user_msg");
        hashSet.add("store_idc");
        hashSet.add("ttnet_route_select");
        hashSet.add("ws_ping");
        hashSet.add("frontier_online");
        hashSet.add("ttnet_all_log");
        hashSet.add("cookie_mismatch");
        hashSet.add("cronet_native_requestlog");
        hashSet.add("ttnet_debug_trace_info");
        hashSet.add("ttnet_http_dns_fail");
        hashSet.add("ttnet_tnc_update_result");
        hashSet.add("cronet_native_requestlog_empty");
        hashSet.add("frontier_qos");
        hashSet.add("ttnet_net_exp");
        hashSet.add("bad_request_diagnosis");
        hashSet.add("ttnet_raw_detect");
        hashSet.add("gna_raw_detect");
        hashSet.add("ttnet_network_environment");
        hashSet.add("game_network");
        hashSet.add("ttnet_zstd_stream");
        hashSet.add("ttnet_zstd_dict_error");
        hashSet.add("ttnet_load");
        hashSet.add("ttnet_insec_rect");
        hashSet.add("ttquiche_native_request_log");
        hashSet.add("otel_log");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[Catch: Exception -> 0x0138, PHI: r6
      0x0030: PHI (r6v2 org.json.JSONObject) = (r6v1 org.json.JSONObject), (r6v3 org.json.JSONObject) binds: [B:14:0x002b, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x0138, blocks: (B:5:0x0007, B:7:0x0015, B:9:0x001d, B:16:0x0030, B:17:0x0043, B:19:0x0049, B:22:0x0059, B:23:0x0060, B:25:0x006d, B:28:0x0074, B:30:0x007a, B:32:0x0084, B:33:0x0087, B:34:0x008a, B:35:0x0093, B:37:0x0099, B:40:0x00a9, B:41:0x00b0, B:45:0x00c6, B:48:0x00cf, B:49:0x00d2, B:51:0x00d9, B:53:0x00e1, B:57:0x00f1, B:59:0x00fd, B:12:0x0025, B:61:0x0103, B:63:0x010c, B:65:0x0112, B:66:0x0114, B:72:0x012d, B:67:0x0122, B:38:0x009f, B:20:0x004f), top: B:81:0x0003, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1494200ozC LIZ(int r15, org.json.JSONObject r16) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1494190ozB.LIZ(int, org.json.JSONObject):X.0ozC");
    }

    public static boolean LIZIZ(JSONObject jSONObject, String str, Collection<String> collection) {
        JSONObject jSONObjectOptJSONObject;
        if (TextUtils.isEmpty(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            return false;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                collection.add(next);
            }
        }
        return true;
    }
}
