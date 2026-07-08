package X;

import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X71, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X71 {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZ(C843370X6p c843370X6p) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_loader_error_code", c843370X6p.LIZJ.LIZ);
        jSONObject.put("res_error_msg", c843370X6p.LIZJ.LIZIZ);
        jSONObject.put("net_library_error_code", c843370X6p.LIZJ.LIZJ);
        jSONObject.put("http_status_code", c843370X6p.LIZJ.LIZLLL);
        return jSONObject;
    }

    public static JSONObject LIZIZ(C843370X6p c843370X6p) throws JSONException {
        String str;
        Object c098200Yq;
        String strOptString;
        String strOptString2;
        String strOptString3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_src", c843370X6p.LIZ.LIZ);
        if (c843370X6p.LIZ.LIZLLL) {
            jSONObject.put("res_scene", "web_main_resource");
        } else {
            jSONObject.put("res_scene", "web_child_resource");
        }
        jSONObject.put("res_from", "cdn");
        if (c843370X6p.LIZ.LIZIZ) {
            str = "success";
        } else {
            str = "failed";
        }
        jSONObject.put("res_state", str);
        jSONObject.put("cdn_request_method", c843370X6p.LIZ.LIZJ);
        jSONObject.put("cdn_response_content_type", c843370X6p.LIZ.LJIIIIZZ);
        jSONObject.put("cdn_is_socket_reused", c843370X6p.LIZ.LJIIJ);
        jSONObject.put("cdn_request_header_accept", c843370X6p.LIZ.LJ);
        jSONObject.put("cdn_request_header_accept_encoding", c843370X6p.LIZ.LJFF);
        jSONObject.put("cdn_response_header_content_encoding", c843370X6p.LIZ.LJIIIZ);
        try {
            c098200Yq = new JSONObject(c843370X6p.LIZ.LJI);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            JSONObject jSONObject2 = (JSONObject) c098200Yq;
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("base");
            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("header");
            Integer numValueOf = null;
            if (jSONObjectOptJSONObject2 != null) {
                strOptString = jSONObjectOptJSONObject2.optString("x-tt-logid");
            } else {
                strOptString = null;
            }
            jSONObject.put("cdn_response_header_logid", strOptString);
            JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("header");
            if (jSONObjectOptJSONObject3 != null) {
                strOptString2 = jSONObjectOptJSONObject3.optString("x-tt-trace-host");
            } else {
                strOptString2 = null;
            }
            jSONObject.put("cdn_response_header_trace_host", strOptString2);
            JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("header");
            if (jSONObjectOptJSONObject4 != null) {
                strOptString3 = jSONObjectOptJSONObject4.optString("x-tt-trace-id");
            } else {
                strOptString3 = null;
            }
            jSONObject.put("cdn_response_header_trace_id", strOptString3);
            if (jSONObjectOptJSONObject != null) {
                numValueOf = Integer.valueOf(jSONObjectOptJSONObject.optInt("redirect_times"));
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() > 0) {
                    jSONObject.put("cdn_dispatch_action", jSONObjectOptJSONObject.optBoolean("dispatched"));
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("redirecting_list");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        jSONObject.put("cdn_dispatch_target_host", jSONArrayOptJSONArray.get(jSONArrayOptJSONArray.length() - 1));
                    }
                }
            } else {
                jSONObject.put("cdn_dispatch_action", false);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static void LIZJ(WebView webView, String str, String str2) {
        WebKitView webKitView;
        if (webView != null && (webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null) {
            C1537480q70 hybridContext = webKitView.getHybridContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resource_ttp_");
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            C1530570pvr.LIZIZ(hybridContext, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
