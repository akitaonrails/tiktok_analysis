package X;

import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X72, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X72 {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(C843360X6o c843360X6o) {
        if (c843360X6o.LIZJ.LIZ != -999) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("res_loader_error_code", Integer.valueOf(c843360X6o.LIZJ.LIZ));
            linkedHashMap.put("res_error_msg", c843360X6o.LIZJ.LIZIZ);
            linkedHashMap.put("net_library_error_code", Integer.valueOf(c843360X6o.LIZJ.LIZJ));
            linkedHashMap.put("http_status_code", Integer.valueOf(c843360X6o.LIZJ.LIZLLL));
            return linkedHashMap;
        }
        return null;
    }

    public static Map LIZIZ(C843360X6o c843360X6o) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = C0X66.LIZ[c843360X6o.LIZ.LJIIJJI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                linkedHashMap.put("res_loader_name", "webview_intercept_unknown");
            } else {
                linkedHashMap.put("res_loader_name", "webview_intercept_native");
            }
        } else {
            linkedHashMap.put("res_loader_name", "webview_intercept_android");
        }
        linkedHashMap.put("res_loader_version", "2.0");
        return linkedHashMap;
    }

    public static Map LIZJ(C843360X6o c843360X6o, WebView webView) {
        String str;
        String strOptString;
        String strOptString2;
        String strOptString3;
        Object objOpt;
        Boolean boolValueOf;
        JSONObject jSONObjectLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("res_src", c843360X6o.LIZ.LIZ);
        if (c843360X6o.LIZ.LIZLLL) {
            linkedHashMap.put("res_scene", "web_main_resource");
        } else {
            linkedHashMap.put("res_scene", "web_child_resource");
        }
        linkedHashMap.put("res_from", "cdn");
        if (c843360X6o.LIZ.LIZIZ) {
            str = "success";
        } else {
            str = "failed";
        }
        linkedHashMap.put("res_state", str);
        linkedHashMap.put("sdk_enable_ttnet_native", Boolean.valueOf(C843290X6h.LIZIZ().enableTTNetNative));
        Integer numValueOf = null;
        if (webView != null) {
            C01GW c01gw = C843290X6h.LJIIJ;
            InterfaceC843110X5p interfaceC843110X5p = (InterfaceC843110X5p) c01gw.getValue();
            if (interfaceC843110X5p != null) {
                boolValueOf = Boolean.valueOf(interfaceC843110X5p.LIZIZ(webView));
            } else {
                boolValueOf = null;
            }
            linkedHashMap.put("kernel_enable_ttnet_native", boolValueOf);
            InterfaceC843110X5p interfaceC843110X5p2 = (InterfaceC843110X5p) c01gw.getValue();
            if (interfaceC843110X5p2 != null) {
                jSONObjectLIZJ = interfaceC843110X5p2.LIZJ();
            } else {
                jSONObjectLIZJ = null;
            }
            linkedHashMap.put("kernel_extra_context", jSONObjectLIZJ);
        }
        c843360X6o.LIZ.getClass();
        linkedHashMap.put("cdn_request_method", c843360X6o.LIZ.LIZJ);
        linkedHashMap.put("cdn_response_content_type", c843360X6o.LIZ.LJIIIIZZ);
        linkedHashMap.put("cdn_request_header_accept", c843360X6o.LIZ.LJ);
        linkedHashMap.put("cdn_request_header_accept_encoding", c843360X6o.LIZ.LJFF);
        linkedHashMap.put("cdn_response_header_content_encoding", c843360X6o.LIZ.LJIIIZ);
        JSONObject jSONObject = c843360X6o.LIZ.LJI;
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("x-tt-logid");
            } else {
                strOptString = null;
            }
            linkedHashMap.put("cdn_response_header_logid", strOptString);
            if (jSONObjectOptJSONObject != null) {
                strOptString2 = jSONObjectOptJSONObject.optString("x-tt-trace-host");
            } else {
                strOptString2 = null;
            }
            linkedHashMap.put("cdn_response_header_trace_host", strOptString2);
            if (jSONObjectOptJSONObject != null) {
                strOptString3 = jSONObjectOptJSONObject.optString("x-tt-trace-id");
            } else {
                strOptString3 = null;
            }
            linkedHashMap.put("cdn_response_header_trace_id", strOptString3);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("socket");
            if (jSONObjectOptJSONObject2 != null) {
                objOpt = jSONObjectOptJSONObject2.opt("socket_reused");
            } else {
                objOpt = null;
            }
            linkedHashMap.put("cdn_is_socket_reused", objOpt);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("base");
            if (jSONObjectOptJSONObject3 != null) {
                numValueOf = Integer.valueOf(jSONObjectOptJSONObject3.optInt("redirect_times"));
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() > 0) {
                    linkedHashMap.put("cdn_dispatch_action", Boolean.valueOf(jSONObjectOptJSONObject3.optBoolean("dispatched")));
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("redirecting_list");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        linkedHashMap.put("cdn_dispatch_target_host", jSONArrayOptJSONArray.get(jSONArrayOptJSONArray.length() - 1));
                    }
                }
            } else {
                linkedHashMap.put("cdn_dispatch_action", Boolean.FALSE);
                return linkedHashMap;
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.webkit.WebView r13, X.C0X61 r14, X.C843360X6o r15, X.C0X70 r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X72.LIZLLL(android.webkit.WebView, X.0X61, X.0X6o, X.0X70):void");
    }
}
