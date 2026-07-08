package X;

import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X73, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X73 {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        TTWebViewHelper tTWebViewHelper = TTWebViewHelper.INSTANCE;
        InterfaceC1541390qDJ ttWebViewRuntimeService = tTWebViewHelper.getTtWebViewRuntimeService();
        jSONObject.put("ttnet_native_enable", ttWebViewRuntimeService != null ? Boolean.valueOf(ttWebViewRuntimeService.isTTNetNativeEnable()) : null);
        InterfaceC1541390qDJ ttWebViewRuntimeService2 = tTWebViewHelper.getTtWebViewRuntimeService();
        jSONObject.put("ttnet_native_init_code", ttWebViewRuntimeService2 != null ? Integer.valueOf(ttWebViewRuntimeService2.getTTNetNativeInitError()) : null);
        InterfaceC1541390qDJ ttWebViewRuntimeService3 = tTWebViewHelper.getTtWebViewRuntimeService();
        jSONObject.put("ttweb_offline_enable", ttWebViewRuntimeService3 != null ? Boolean.valueOf(ttWebViewRuntimeService3.isOfflineNativeInterceptorSupport()) : null);
        InterfaceC1541390qDJ ttWebViewRuntimeService4 = tTWebViewHelper.getTtWebViewRuntimeService();
        jSONObject.put("ttweb_predictor_enable", ttWebViewRuntimeService4 != null ? Boolean.valueOf(ttWebViewRuntimeService4.isPredictorEnable()) : null);
        return jSONObject;
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) throws JSONException {
        Object c098200Yq;
        String strOptString;
        String strOptString2;
        String strOptString3;
        Object objOpt;
        String strOptString4;
        String strOptString5;
        jSONObject.put("cdn_request_method", jSONObject2.optString("method"));
        jSONObject.put("cdn_request_header_accept", jSONObject3.optString("request_accept"));
        jSONObject.put("cdn_request_header_accept_encoding", jSONObject3.optString("request_accept_encoding"));
        try {
            c098200Yq = new JSONObject(jSONObject2.optString("response_header"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer numValueOf = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject5 = (JSONObject) c098200Yq;
        if (jSONObject5 != null) {
            if (jSONObject5.has("content-type")) {
                strOptString4 = jSONObject5.optString("content-type");
            } else {
                strOptString4 = jSONObject5.optString("Content-Type");
            }
            if (strOptString4.length() == 0) {
                strOptString4 = jSONObject2.optString("type");
            }
            if (jSONObject5.has("content-encoding")) {
                strOptString5 = jSONObject5.optString("content-encoding");
            } else {
                strOptString5 = jSONObject5.optString("Content-Encoding");
            }
            jSONObject.put("cdn_response_content_type", strOptString4);
            jSONObject.put("cdn_response_header_content_encoding", strOptString5);
        }
        if (jSONObject4 != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("header");
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("x-tt-logid");
            } else {
                strOptString = null;
            }
            jSONObject.put("cdn_response_header_logid", strOptString);
            if (jSONObjectOptJSONObject != null) {
                strOptString2 = jSONObjectOptJSONObject.optString("x-tt-trace-host");
            } else {
                strOptString2 = null;
            }
            jSONObject.put("cdn_response_header_trace_host", strOptString2);
            if (jSONObjectOptJSONObject != null) {
                strOptString3 = jSONObjectOptJSONObject.optString("x-tt-trace-id");
            } else {
                strOptString3 = null;
            }
            jSONObject.put("cdn_response_header_trace_id", strOptString3);
            JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("socket");
            if (jSONObjectOptJSONObject2 != null) {
                objOpt = jSONObjectOptJSONObject2.opt("socket_reused");
            } else {
                objOpt = null;
            }
            jSONObject.put("cdn_is_socket_reused", objOpt);
            JSONObject jSONObjectOptJSONObject3 = jSONObject4.optJSONObject("base");
            if (jSONObjectOptJSONObject3 != null) {
                numValueOf = Integer.valueOf(jSONObjectOptJSONObject3.optInt("redirect_times"));
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() > 0) {
                    jSONObject.put("cdn_dispatch_action", jSONObjectOptJSONObject3.optBoolean("dispatched"));
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("redirecting_list");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        jSONObject.put("cdn_dispatch_target_host", jSONArrayOptJSONArray.get(jSONArrayOptJSONArray.length() - 1));
                        return;
                    }
                    return;
                }
                return;
            }
            jSONObject.put("cdn_dispatch_action", false);
        }
    }
}
