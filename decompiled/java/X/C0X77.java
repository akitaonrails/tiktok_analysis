package X;

import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X77, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X77 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ WebKitView LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X77(WebKitView webKitView, String str, JSONObject jSONObject) {
        super(0);
        this.LL = jSONObject;
        this.LLILLJJLI = webKitView;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object obj;
        Object c098200Yq;
        C1533840q18 c1533840q18;
        C1533900q1E c1533900q1E;
        String strOptString = this.LL.optString("original_url", "");
        if (strOptString != null) {
            boolean z = this.LL.optInt("error_code", -1) == 0;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LL.optString("size"));
            long jLongValue = lLJIILIIL != null ? lLJIILIIL.longValue() : 0L;
            boolean zOptBoolean = this.LL.optBoolean("is_for_mainframe");
            boolean zOptBoolean2 = this.LL.optBoolean("is_blocking");
            String strOptString2 = this.LL.optString("request_priority");
            String strOptString3 = this.LL.optString("request_destination");
            boolean zOptBoolean3 = this.LL.optBoolean("render_intercept");
            String strOptString4 = this.LL.optString("type");
            boolean zOptBoolean4 = this.LL.optBoolean("is_preloaded");
            boolean zOptBoolean5 = this.LL.optBoolean("is_request_reused");
            int iOptInt = this.LL.optInt("preload_type", 0);
            if (iOptInt != 0) {
                JSONArray jSONArray = C1533710q0v.LIZ;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(this.LLILLJJLI.getHybridContext(), false);
                if ((iResourceServiceXLIZIZ instanceof C1533840q18) && (c1533840q18 = (C1533840q18) iResourceServiceXLIZIZ) != null && (c1533900q1E = c1533840q18.LIZ) != null) {
                    if (zOptBoolean5) {
                        c1533900q1E.LJII++;
                    }
                    c1533900q1E.LJI++;
                }
            }
            JSONObject jSONObject = this.LL;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("extra"));
                int length = jSONObject2.length();
                JSONObject jSONObject3 = jSONObject2;
                if (length == 0) {
                    jSONObject3 = new JSONObject(jSONObject.optString("biz_info"));
                }
                C189200o6.m2constructorimpl(jSONObject3);
                obj = jSONObject3;
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
                obj = c098200Yq2;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj2 = obj;
            if (zM7isFailureimpl) {
                obj2 = null;
            }
            JSONObject jSONObject4 = (JSONObject) obj2;
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            try {
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                c098200Yq = new JSONObject(this.LL.optString("request_log"));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th4) {
                th = th4;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            JSONObject jSONObject5 = (JSONObject) c098200Yq;
            try {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("res_loader_name", this.LLILLL);
                jSONObject6.put("res_loader_version", String.valueOf(TTWebViewHelper.INSTANCE.getTtKernelVersion()));
                JSONObject jSONObject7 = new JSONObject();
                String str = this.LLILLL;
                JSONObject jSONObject8 = this.LL;
                try {
                    jSONObject7.put("res_src", strOptString);
                    jSONObject7.put("res_size", jLongValue);
                    jSONObject7.put("res_state", z ? "success" : "failed");
                    jSONObject7.put("res_type", strOptString4);
                    jSONObject7.put("res_scene", zOptBoolean ? "web_main_document" : "web_child_resource");
                    jSONObject7.put("is_preloaded", String.valueOf(zOptBoolean4));
                    jSONObject7.put("preload_type", iOptInt);
                    jSONObject7.put("is_request_reused", String.valueOf(zOptBoolean5));
                    jSONObject7.put("is_memory", String.valueOf(zOptBoolean3));
                    jSONObject7.put("is_blocking", zOptBoolean2);
                    jSONObject7.put("request_priority", strOptString2);
                    jSONObject7.put("request_destination", strOptString3);
                    jSONObject7.put("gecko_access_key", jSONObject4.optString("gecko_access_key"));
                    jSONObject7.put("gecko_channel", jSONObject4.optString("gecko_channel"));
                    jSONObject7.put("gecko_bundle", jSONObject4.optString("gecko_bundle"));
                    jSONObject7.put("res_version", jSONObject4.optString("res_version"));
                    jSONObject7.put("res_from", jSONObject4.optString("res_from"));
                    jSONObject7.put("kernel_extra_context", C0X73.LIZIZ());
                    C0X78 c0x78 = C0X78.TTWEB_TTNET;
                    if (Intrinsics.LJFF(str, c0x78.getValue())) {
                        C0X73.LIZ(jSONObject7, jSONObject8, jSONObject4, jSONObject5);
                    }
                    JSONObject jSONObject9 = new JSONObject();
                    try {
                        JSONObject jSONObject10 = this.LL;
                        String str2 = this.LLILLL;
                        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(jSONObject10.optString("request_load_start"));
                        long jLongValue2 = lLJIILIIL2 != null ? lLJIILIIL2.longValue() : -1L;
                        Long lLJIILIIL3 = C2095008Iq.LJIILIIL(jSONObject10.optString("request_load_end"));
                        long jLongValue3 = lLJIILIIL3 != null ? lLJIILIIL3.longValue() : -1L;
                        Long lLJIILIIL4 = C2095008Iq.LJIILIIL(jSONObject4.optString("client_start_timing"));
                        Long lLJIILIIL5 = C2095008Iq.LJIILIIL(jSONObject4.optString("res_intercept_start"));
                        long jLongValue4 = lLJIILIIL5 != null ? lLJIILIIL5.longValue() : -1L;
                        Long lLJIILIIL6 = C2095008Iq.LJIILIIL(jSONObject4.optString("res_intercept_finish"));
                        long jLongValue5 = lLJIILIIL6 != null ? lLJIILIIL6.longValue() : -1L;
                        jSONObject9.put("res_load_start", lLJIILIIL4 != null ? lLJIILIIL4.longValue() : jLongValue2);
                        jSONObject9.put("res_load_finish", jLongValue3);
                        if (jLongValue4 != -1 && jLongValue5 != -1) {
                            jSONObject9.put("res_intercept_start", jLongValue4);
                            jSONObject9.put("res_intercept_finish", jLongValue5);
                        }
                        if (Intrinsics.LJFF(str2, c0x78.getValue())) {
                            jSONObject9.put("cdn_start", jLongValue2);
                            jSONObject9.put("cdn_finish", jLongValue3);
                        }
                        if (jSONObject5 != null) {
                            JSONObject jSONObjectOptJSONObject = jSONObject5.optJSONObject("timing");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("detailed_duration") : null;
                            jSONObject9.put("cdn_detail_proxy", jSONObjectOptJSONObject2 != null ? Long.valueOf(jSONObjectOptJSONObject2.optLong("proxy")) : null);
                            jSONObject9.put("cdn_detail_dns", jSONObjectOptJSONObject2 != null ? Long.valueOf(jSONObjectOptJSONObject2.optLong("dns")) : null);
                            jSONObject9.put("cdn_detail_tcp", jSONObjectOptJSONObject2 != null ? Long.valueOf(jSONObjectOptJSONObject2.optLong("tcp")) : null);
                            jSONObject9.put("cdn_detail_ssl", jSONObjectOptJSONObject2 != null ? Long.valueOf(jSONObjectOptJSONObject2.optLong("ssl")) : null);
                            jSONObject9.put("cdn_detail_send", jSONObjectOptJSONObject2 != null ? Long.valueOf(jSONObjectOptJSONObject2.optLong("send")) : null);
                            jSONObject9.put("cdn_detail_ttfb", jSONObjectOptJSONObject2 != null ? Long.valueOf(jSONObjectOptJSONObject2.optLong("ttfb")) : null);
                            jSONObject9.put("cdn_detail_rtt_time", jSONObjectOptJSONObject2 != null ? Long.valueOf(jSONObjectOptJSONObject2.optLong("rtt")) : null);
                            jSONObject9.put("cdn_detail_inner_time", jSONObjectOptJSONObject2 != null ? Long.valueOf(jSONObjectOptJSONObject2.optLong("inner")) : null);
                        }
                        JSONObject jSONObject11 = new JSONObject();
                        JSONObject jSONObject12 = this.LL;
                        jSONObject11.put("http_status_code", jSONObject12.optInt("http_status_code", -1));
                        jSONObject11.put("net_library_error_code", jSONObject12.optInt("error_code", 0));
                        String str3 = zOptBoolean ? "res_loader_perf_template" : "res_loader_perf";
                        InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
                        WebKitView webKitView = this.LLILLJJLI;
                        JSONObject jSONObject13 = new JSONObject();
                        jSONObject13.put("res_loader_info", jSONObject6);
                        jSONObject13.put("res_info", jSONObject7);
                        jSONObject13.put("res_load_perf", jSONObject9);
                        jSONObject13.put("res_load_error", jSONObject11);
                        webViewMonitorHelper.handleNativeInfo(webKitView, str3, jSONObject13);
                        if (!z) {
                            String str4 = zOptBoolean ? "res_loader_error_template" : "res_loader_error";
                            InterfaceC1041930dDj webViewMonitorHelper2 = WebViewMonitorHelper.getInstance();
                            WebKitView webKitView2 = this.LLILLJJLI;
                            JSONObject jSONObject14 = new JSONObject();
                            jSONObject14.put("res_loader_info", jSONObject6);
                            jSONObject14.put("res_info", jSONObject7);
                            jSONObject14.put("res_load_error", jSONObject11);
                            webViewMonitorHelper2.handleNativeInfo(webKitView2, str4, jSONObject14);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str4);
                            sbLIZ.append(", url: ");
                            sbLIZ.append(strOptString);
                            sbLIZ.append(", error:");
                            sbLIZ.append(jSONObject11);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        TryCatchGuardChecker.doCheck(th);
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
        return Unit.LIZ;
    }
}
