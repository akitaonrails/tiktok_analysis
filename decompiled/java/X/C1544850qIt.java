package X;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectGlobalConfig;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544850qIt implements InterfaceC1544310qI1 {
    public static boolean LIZJ;
    public static final C01GW<C1544760qIk> LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(201));
    public static final C1535710q49 LIZIZ = new C1535710q49();
    public static final ConcurrentHashMap<Integer, String> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, C1544280qHy> LJ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1544310qI1
    public final void LJI(WebView webView, String str, boolean z) {
    }

    public static C1544280qHy LJIIJ(WebView webView) {
        ConcurrentHashMap<Integer, C1544280qHy> concurrentHashMap = LJ;
        C1544280qHy c1544280qHy = concurrentHashMap.get(Integer.valueOf(webView.hashCode()));
        if (c1544280qHy != null) {
            return c1544280qHy;
        }
        C1544280qHy c1544280qHy2 = new C1544280qHy();
        concurrentHashMap.put(Integer.valueOf(webView.hashCode()), c1544280qHy2);
        return c1544280qHy2;
    }

    public static boolean LJIILJJIL(WebResourceRequest webResourceRequest) {
        if (!Intrinsics.LJFF(webResourceRequest.getMethod().toUpperCase(Locale.US), "GET")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Intercept a non-GET request, method = ");
            sbLIZ.append(webResourceRequest.getMethod());
            sbLIZ.append(", url = ");
            sbLIZ.append(webResourceRequest.getUrl());
            sbLIZ.append('.');
            C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        return true;
    }

    public static boolean LJIILL(WebView webView) {
        if (LIZ.getValue() != null && C1541490qDT.LIZLLL.isTTWebView(webView)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1544310qI1
    public final void LIZJ(WebView webView) {
        C1544280qHy c1544280qHyLJIIJ = LJIIJ(webView);
        ConcurrentHashMap<Integer, C1544280qHy> concurrentHashMap = LJ;
        Integer numValueOf = Integer.valueOf(webView.hashCode());
        c1544280qHyLJIIJ.LIZ.put("js_inject_webview_create", 1);
        concurrentHashMap.put(numValueOf, c1544280qHyLJIIJ);
    }

    @Override // X.InterfaceC1544310qI1
    public final void LJFF(WebView webView) {
        if (LJIILL(webView)) {
            LIZ.getValue();
        }
    }

    @Override // X.InterfaceC1544310qI1
    public final void destroy(WebView webView) {
        int iHashCode;
        C1544760qIk value;
        if (webView != null) {
            try {
                CopyOnWriteArrayList<C828170WeF> copyOnWriteArrayList = C828160WeE.LIZ.get(Integer.valueOf(webView.hashCode()));
                if (copyOnWriteArrayList != null) {
                    for (C828170WeF c828170WeF : copyOnWriteArrayList) {
                        C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                        C1520360pfO c1520360pfO = new C1520360pfO(c828170WeF.LIZ);
                        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                        c1520360pfO.LIZ = c828170WeF.LIZIZ;
                        c1520360pfO.LIZLLL = c828170WeF.LIZJ;
                        c1520360pfO.LJ = c828170WeF.LIZLLL;
                        c1520360pfO.LIZIZ = "js_inject_manage";
                        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                        c1520200pf8.getClass();
                        C1520200pf8.LIZ(c1520350pfNLIZ);
                    }
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            C828160WeE.LIZ.remove(Integer.valueOf(webView.hashCode()));
        }
        ConcurrentHashMap<Integer, C1544280qHy> concurrentHashMap = LJ;
        int iHashCode2 = 0;
        if (webView != null) {
            iHashCode = webView.hashCode();
        } else {
            iHashCode = 0;
        }
        concurrentHashMap.remove(Integer.valueOf(iHashCode));
        ConcurrentHashMap<Integer, String> concurrentHashMap2 = LIZLLL;
        if (webView != null) {
            iHashCode2 = webView.hashCode();
        }
        concurrentHashMap2.remove(Integer.valueOf(iHashCode2));
        if (webView != null && LJIILL(webView) && (value = LIZ.getValue()) != null) {
            value.destroy(webView);
        }
        C1544840qIs.LIZJ("webview destroy, do web js injection metrics report to tea.");
    }

    public static boolean LJIILIIL(WebResourceResponse webResourceResponse, WebView webView) {
        boolean z;
        Object c098200Yq;
        C1544280qHy c1544280qHyLJIIJ = LJIIJ(webView);
        if (!Intrinsics.LJFF(webResourceResponse.getMimeType(), "text/html")) {
            c1544280qHyLJIIJ.LIZ.put("js_inject_main_intercept", 1);
            Map<String, Object> map = c1544280qHyLJIIJ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mimeType_");
            sbLIZ.append(webResourceResponse.getMimeType());
            map.put("js_inject_main_intercept_reason", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        int statusCode = webResourceResponse.getStatusCode();
        if (300 <= statusCode && statusCode < 400) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1544280qHyLJIIJ.LIZ.put("js_inject_main_intercept", 1);
            Map<String, Object> map2 = c1544280qHyLJIIJ.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("statusCode_");
            sbLIZ2.append(webResourceResponse.getStatusCode());
            map2.put("js_inject_main_intercept_reason", C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
        int statusCode2 = webResourceResponse.getStatusCode();
        if (400 <= statusCode2 && statusCode2 < 500) {
            Object obj = null;
            try {
                JSONObject config = HybridSettings.INSTANCE.getConfig("spark_inject_statusCode_4xx_intercept_config");
                if (config != null) {
                    c098200Yq = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                c1544280qHyLJIIJ.LIZ.put("js_inject_main_intercept", 1);
                Map<String, Object> map3 = c1544280qHyLJIIJ.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("statusCode_");
                sbLIZ3.append(webResourceResponse.getStatusCode());
                map3.put("js_inject_main_intercept_reason", C2188811AlT.LIZIZ(sbLIZ3));
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1544310qI1
    public final void LIZ(WebView webView, String str) throws JSONException {
        Object c098200Yq;
        if (str == null || webView == null) {
            return;
        }
        if (!C1544770qIl.LIZ.get()) {
            C1544940qJ2.LIZ(webView, str, null, null, IJSInjectCallback$ErrorCode.ERROR_PAGE_STARTED_WEBVIEWJSINJECTSDK_NOT_INIT);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSInjectGlobalConfig jSInjectGlobalConfigLIZ = C1544810qIp.LIZ();
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            C1544940qJ2.LIZ(webView, str, null, null, IJSInjectCallback$ErrorCode.ERROR_PAGE_STARTED_EMPTY_URL);
            return;
        }
        if (C1544810qIp.LIZLLL(uri, jSInjectGlobalConfigLIZ)) {
            C1544940qJ2.LIZ(webView, str, null, null, IJSInjectCallback$ErrorCode.ERROR_PAGE_STARTED_GLOBAL_CONFIG_INTERCEPT_URL);
            C1544840qIs.LIZJ("[onPageStart] Url is block by global inline JS inject. url: ".concat(str));
            return;
        }
        Set<String> setLIZJ = C1535930q4V.LIZJ(jSInjectGlobalConfigLIZ.manualInjectors, 0);
        if (setLIZJ != null) {
            for (String str2 : setLIZJ) {
                LJIIL(str2, str, webView, C1544770qIl.LIZIZ(str2), EnumC1544890qIx.LOAD_START);
            }
        }
        for (String str3 : jSInjectGlobalConfigLIZ.startInjectors) {
            LJIIL(str3, str, webView, C1544770qIl.LIZIZ(str3), EnumC1544890qIx.LOAD_START);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", jCurrentTimeMillis2 - jCurrentTimeMillis);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("current_url", str);
        jSONObject2.put("inject_time", EnumC1544890qIx.LOAD_START.getValue());
        C828160WeE.LIZIZ(webView, "js_inject_manage_client_auto", str, jSONObject, jSONObject2);
    }

    @Override // X.InterfaceC1544310qI1
    public final WebResourceResponse LIZIZ(WebView webView, WebResourceRequest webResourceRequest) {
        int i;
        int i2;
        String strLJI;
        WebResourceResponse webResourceResponseLIZJ;
        String strLIZIZ;
        WebKitView webKitView;
        Integer numValueOf;
        boolean z;
        boolean z2;
        String strLJI2;
        String strLJI3;
        String string;
        Object obj;
        String strLJI4;
        C1537480q70 hybridContext;
        if (webView == null || webResourceRequest == null || webResourceRequest.isForMainFrame()) {
            return null;
        }
        if (!C1544770qIl.LIZ.get()) {
            C1544940qJ2.LIZ(webView, String.valueOf(webResourceRequest.getUrl()), null, null, IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_WEBVIEWJSINJECTSDK_NOT_INIT);
            return null;
        }
        String string2 = webResourceRequest.getUrl().toString();
        JSInjectConfig jSInjectConfig = C1544810qIp.LIZ;
        JSInjectConfig jSInjectConfig2 = C1544810qIp.LIZIZ.get(string2);
        if (jSInjectConfig2 == null) {
            C1544940qJ2.LIZ(webView, String.valueOf(webResourceRequest.getUrl()), null, null, IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_INLINE_CONFIG_NOT_FOUND);
            return null;
        }
        if (!Intrinsics.LJFF(jSInjectConfig2.geckoUrl, string2)) {
            C1544940qJ2.LIZ(webView, String.valueOf(webResourceRequest.getUrl()), null, null, IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_URL_NOT_MATCH);
            return null;
        }
        if (!Intrinsics.LJFF(jSInjectConfig2.injectTime, EnumC1544890qIx.VERY_BEGINNING.getValue()) && !Intrinsics.LJFF(jSInjectConfig2.injectTime, EnumC1544890qIx.MANUAL.getValue())) {
            C1544940qJ2.LIZ(webView, string2, jSInjectConfig2.name, null, IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_INJECT_TIME_ERROR);
            return null;
        }
        C1544280qHy c1544280qHyLJIIJ = LJIIJ(webView);
        Map<String, Object> map = c1544280qHyLJIIJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("js_inject_script_fetch_start_");
        sbLIZ.append(jSInjectConfig2.name);
        map.put(C2188811AlT.LIZIZ(sbLIZ), 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1544870qIv c1544870qIv = new C1544870qIv(jCurrentTimeMillis);
        C1544980qJ6 c1544980qJ6 = c1544870qIv.LIZJ;
        c1544980qJ6.LIZ = jSInjectConfig2.name;
        c1544980qJ6.LIZLLL = LIZLLL.get(Integer.valueOf(webView.hashCode()));
        c1544870qIv.LIZJ.LIZJ = Integer.valueOf(jSInjectConfig2.businessLine);
        C1545000qJ8 c1545000qJ8 = c1544870qIv.LJI;
        if (webResourceRequest.isForMainFrame()) {
            i = 0;
        } else {
            i = 1;
        }
        c1545000qJ8.LIZIZ = i;
        C1545000qJ8 c1545000qJ82 = c1544870qIv.LJI;
        if (webResourceRequest.isForMainFrame()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c1545000qJ82.LIZJ = i2;
        AbstractC1544900qIy abstractC1544900qIyLIZIZ = C1544770qIl.LIZIZ(jSInjectConfig2.name);
        try {
            webResourceResponseLIZJ = C1544880qIw.LIZJ(webView, jSInjectConfig2, abstractC1544900qIyLIZIZ, c1544870qIv);
            strLIZIZ = C1544880qIw.LIZIZ(webView, jSInjectConfig2, abstractC1544900qIyLIZIZ, c1544870qIv);
            if (webView instanceof WebKitView) {
                webKitView = (WebKitView) webView;
            } else {
                webKitView = null;
            }
            if (webKitView != null && (hybridContext = webKitView.getHybridContext()) != null) {
                numValueOf = Integer.valueOf(hybridContext.LJ());
            } else {
                numValueOf = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            C821850WLv c821850WLvLJIIJJI = LJIIJJI(numValueOf, string2, strLIZIZ, webView, jSInjectConfig2, false, false, null);
            if (strLIZIZ == null || strLIZIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String strValueOf = String.valueOf(webResourceRequest.getUrl());
                if (abstractC1544900qIyLIZIZ != null) {
                    strLJI4 = abstractC1544900qIyLIZIZ.LJI();
                } else {
                    strLJI4 = null;
                }
                IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode = IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_JS_CODE_NOT_FOUND;
                C1544940qJ2.LIZ(webView, strValueOf, strLJI4, null, iJSInjectCallback$ErrorCode);
                if (abstractC1544900qIyLIZIZ != null) {
                    abstractC1544900qIyLIZIZ.LJIIIIZZ(iJSInjectCallback$ErrorCode);
                }
            } else {
                if (c821850WLvLJIIJJI == null || !c821850WLvLJIIJJI.LIZ) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("reject by spark security solution. URL: ");
                    sbLIZ2.append(string2);
                    sbLIZ2.append(", JSName: ");
                    sbLIZ2.append(jSInjectConfig2.name);
                    sbLIZ2.append(", time: ");
                    sbLIZ2.append(jSInjectConfig2);
                    sbLIZ2.append(".injectTime");
                    C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                    String strValueOf2 = String.valueOf(webResourceRequest.getUrl());
                    if (abstractC1544900qIyLIZIZ != null) {
                        strLJI3 = abstractC1544900qIyLIZIZ.LJI();
                    } else {
                        strLJI3 = null;
                    }
                    Map<?, ?> map2 = c821850WLvLJIIJJI.LIZIZ;
                    if (map2 != null && (obj = map2.get("error")) != null) {
                        string = obj.toString();
                    } else {
                        string = null;
                    }
                    IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode2 = IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_SECURITY_INTERCEPT;
                    C1544940qJ2.LIZ(webView, strValueOf2, strLJI3, string, iJSInjectCallback$ErrorCode2);
                    if (abstractC1544900qIyLIZIZ != null) {
                        abstractC1544900qIyLIZIZ.LJIIIIZZ(iJSInjectCallback$ErrorCode2);
                    }
                } else {
                    Map<String, Object> map3 = c1544280qHyLJIIJ.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("js_inject_script_fetch_end_");
                    sbLIZ3.append(jSInjectConfig2.name);
                    map3.put(C2188811AlT.LIZIZ(sbLIZ3), 1);
                    String str = c1544870qIv.LIZLLL.LJII;
                    if (str != null) {
                        Map<String, Object> map4 = c1544280qHyLJIIJ.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("js_inject_script_params_");
                        sbLIZ4.append(jSInjectConfig2.name);
                        map4.put(C2188811AlT.LIZIZ(sbLIZ4), str);
                    }
                    if (webResourceResponseLIZJ != null) {
                        c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                        C1544870qIv.LIZIZ(c1544870qIv, webView, true, "js_inject_manage_client_inline_sub", null, null, null, 56);
                        Map<String, Object> map5 = c1544280qHyLJIIJ.LIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("js_inject_script_fetch_status_");
                        sbLIZ5.append(jSInjectConfig2.name);
                        map5.put(C2188811AlT.LIZIZ(sbLIZ5), 1);
                        Integer num = c1544870qIv.LIZLLL.LJ;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Map<String, Object> map6 = c1544280qHyLJIIJ.LIZ;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("js_inject_script_res_from_");
                            sbLIZ6.append(jSInjectConfig2.name);
                            map6.put(C2188811AlT.LIZIZ(sbLIZ6), Integer.valueOf(iIntValue));
                        }
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("[InlineJSIntercept] success, script url: ");
                        sbLIZ7.append(webResourceRequest.getUrl());
                        sbLIZ7.append(", duration = ");
                        sbLIZ7.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ7));
                        return webResourceResponseLIZJ;
                    }
                    String strValueOf3 = String.valueOf(webResourceRequest.getUrl());
                    if (abstractC1544900qIyLIZIZ != null) {
                        strLJI2 = abstractC1544900qIyLIZIZ.LJI();
                    } else {
                        strLJI2 = null;
                    }
                    IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode3 = IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_FETCH_EMPTY_RESPONSE;
                    C1544940qJ2.LIZ(webView, strValueOf3, strLJI2, null, iJSInjectCallback$ErrorCode3);
                    if (abstractC1544900qIyLIZIZ != null) {
                        abstractC1544900qIyLIZIZ.LJIIIIZZ(iJSInjectCallback$ErrorCode3);
                    }
                }
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C1544840qIs.LIZJ("[InlineJSIntercept] exception happened, url: " + webResourceRequest.getUrl() + ", exception: " + th.getMessage());
            String strValueOf4 = String.valueOf(webResourceRequest.getUrl());
            if (abstractC1544900qIyLIZIZ != null) {
                strLJI = abstractC1544900qIyLIZIZ.LJI();
            } else {
                strLJI = null;
            }
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode4 = IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_EXCEPTION_FETCH_RESPONSE;
            C1544940qJ2.LIZ(webView, strValueOf4, strLJI, null, iJSInjectCallback$ErrorCode4);
            if (abstractC1544900qIyLIZIZ != null) {
                abstractC1544900qIyLIZIZ.LJIIIIZZ(iJSInjectCallback$ErrorCode4);
            }
        }
        C1544840qIs.LIZJ("[InlineJSIntercept] failed, script url: " + webResourceRequest.getUrl());
        if (abstractC1544900qIyLIZIZ != null) {
            abstractC1544900qIyLIZIZ.LJIIIIZZ(IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_SCRIPT_RESOURCE_INTERCEPT_FAIL);
        }
        c1544870qIv.LIZLLL.LIZLLL = 0;
        c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client_inline_sub", th, IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_SCRIPT_RESOURCE_INTERCEPT_FAIL, null, 32);
        c1544280qHyLJIIJ.LIZ.put("js_inject_script_fetch_status_" + jSInjectConfig2.name, 0);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // X.InterfaceC1544310qI1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 1
            r1 = 0
            if (r6 == 0) goto L7e
            java.lang.String r0 = "http://"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r6, r0, r1)
            if (r0 == r3) goto L14
            java.lang.String r0 = "https://"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r6, r0, r1)
            if (r0 != r3) goto L7e
        L14:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r1 = X.C1544850qIt.LIZLLL
            int r0 = r5.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r0, r6)
            X.0qJB r1 = X.C1544770qIl.LJ
            if (r1 == 0) goto L2f
            if (r6 != 0) goto L7f
            java.lang.String r0 = ""
        L29:
            boolean r0 = r1.LIZLLL(r0)
            if (r0 != 0) goto L62
        L2f:
            android.webkit.WebSettings r0 = r5.getSettings()
            r0.setJavaScriptEnabled(r3)
            com.bytedance.hybrid.spark.security.web_js.core.WJSIReport r1 = new com.bytedance.hybrid.spark.security.web_js.core.WJSIReport
            r1.<init>(r5)
            java.lang.String r0 = "WJSIReport"
            r5.addJavascriptInterface(r1, r0)
            X.0qHy r0 = LJIIJ(r5)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.LIZ
            java.lang.String r1 = "js_inject_jsi"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.put(r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "success inject WJSIReport. url: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1544840qIs.LIZJ(r0)
        L62:
            X.0qHy r0 = LJIIJ(r5)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.LIZ
            java.lang.String r0 = "js_inject_current_url"
            r1.put(r0, r6)
            boolean r0 = LJIILL(r5)
            if (r0 == 0) goto L7e
            X.01GW<X.0qIk> r0 = X.C1544850qIt.LIZ
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L7e
            X.C1544760qIk.LJIIIIZZ(r5, r6)
        L7e:
            return
        L7f:
            r0 = r6
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1544850qIt.LJ(android.webkit.WebView, java.lang.String):void");
    }

    @Override // X.InterfaceC1544310qI1
    public final void LJII(WebView webView, String str) {
        if (u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) {
            LIZLLL.put(Integer.valueOf(webView.hashCode()), str);
            C1544280qHy c1544280qHyLJIIJ = LJIIJ(webView);
            c1544280qHyLJIIJ.LIZ.put("js_inject_redirect", 1);
            c1544280qHyLJIIJ.LIZ.put("js_inject_redirect_url", str);
        }
    }

    @Override // X.InterfaceC1544310qI1
    public final void onPageFinished(WebView webView, String str) throws JSONException {
        Object c098200Yq;
        if (str == null || webView == null) {
            return;
        }
        if (!C1544770qIl.LIZ.get()) {
            C1544940qJ2.LIZ(webView, str, null, null, IJSInjectCallback$ErrorCode.ERROR_PAGE_FINISHED_WEBVIEWJSINJECTSDK_NOT_INIT);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSInjectGlobalConfig jSInjectGlobalConfigLIZ = C1544810qIp.LIZ();
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            C1544940qJ2.LIZ(webView, str, null, null, IJSInjectCallback$ErrorCode.ERROR_PAGE_FINISHED_EMPTY_URL);
            return;
        }
        if (C1544810qIp.LIZLLL(uri, jSInjectGlobalConfigLIZ)) {
            C1544840qIs.LIZJ("[onPageStart] Url is block by global inline JS inject. url: ".concat(str));
            C1544940qJ2.LIZ(webView, str, null, null, IJSInjectCallback$ErrorCode.ERROR_PAGE_FINISHED_GLOBAL_CONFIG_INTERCEPT_URL);
            return;
        }
        Set<String> setLIZJ = C1535930q4V.LIZJ(jSInjectGlobalConfigLIZ.manualInjectors, 1);
        if (setLIZJ != null) {
            for (String str2 : setLIZJ) {
                LJIIL(str2, str, webView, C1544770qIl.LIZIZ(str2), EnumC1544890qIx.LOAD_FINISH);
            }
        }
        for (String str3 : jSInjectGlobalConfigLIZ.finishInjectors) {
            LJIIL(str3, str, webView, C1544770qIl.LIZIZ(str3), EnumC1544890qIx.LOAD_FINISH);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", jCurrentTimeMillis2 - jCurrentTimeMillis);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("current_url", str);
        jSONObject2.put("inject_time", EnumC1544890qIx.LOAD_FINISH.getValue());
        C828160WeE.LIZIZ(webView, "js_inject_manage_client_auto", str, jSONObject, jSONObject2);
    }

    public static void LJIIIIZZ(StringBuilder sb, JSInjectConfig jSInjectConfig, Set set) {
        sb.append("<script data-name=");
        sb.append("\"");
        sb.append(jSInjectConfig.name);
        sb.append("\"");
        sb.append(" src=");
        sb.append("\"");
        sb.append(jSInjectConfig.geckoUrl);
        sb.append("\"");
        sb.append(" ></script>");
        set.add(jSInjectConfig.geckoUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0ac6 A[LOOP:11: B:326:0x0ac0->B:328:0x0ac6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0afc A[LOOP:12: B:330:0x0af6->B:332:0x0afc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0432 A[PHI: r46
      0x0432: PHI (r46v5 java.lang.String) = (r46v4 java.lang.String), (r46v7 java.lang.String) binds: [B:89:0x03cb, B:91:0x03db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [X.0qIy] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r34v11, types: [X.0qIy] */
    /* JADX WARN: Type inference failed for: r37v3, types: [X.0qIy] */
    /* JADX WARN: Type inference failed for: r37v7, types: [X.0qIy] */
    /* JADX WARN: Type inference failed for: r3v125 */
    /* JADX WARN: Type inference failed for: r3v126 */
    /* JADX WARN: Type inference failed for: r3v127, types: [X.0qIr, X.0qIy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v135 */
    /* JADX WARN: Type inference failed for: r3v147 */
    /* JADX WARN: Type inference failed for: r3v148 */
    /* JADX WARN: Type inference failed for: r3v149 */
    /* JADX WARN: Type inference failed for: r3v28, types: [X.0qIy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r44v0, types: [X.0qJ9, X.0qJB] */
    /* JADX WARN: Type inference failed for: r4v27, types: [X.0qIy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.webkit.WebView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0qIy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.0qIy, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1544310qI1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LIZLLL(android.webkit.WebView r51, final android.webkit.WebResourceRequest r52, android.webkit.WebResourceResponse r53) {
        /*
            Method dump skipped, instruction units count: 3284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1544850qIt.LIZLLL(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):android.webkit.WebResourceResponse");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIL(final String str, final String str2, WebView webView, final AbstractC1544900qIy abstractC1544900qIy, EnumC1544890qIx enumC1544890qIx) {
        String strLJI;
        boolean z;
        Integer numValueOf;
        String str3;
        int iIntValue;
        String string;
        Object obj;
        InterfaceC1541990qEH interfaceC1541990qEH;
        C1537480q70 hybridContext;
        String strLJI2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1544870qIv c1544870qIv = new C1544870qIv(jCurrentTimeMillis);
        Uri uri = UriProtector.parse(str2);
        if (uri == null || !uri.isHierarchical() || ((!Intrinsics.LJFF(uri.getScheme(), "http") && !Intrinsics.LJFF(uri.getScheme(), "https")) || uri.getHost() == null || uri.getPath() == null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Auto] Fail for error uri. JSName: ");
            sbLIZ.append(str);
            sbLIZ.append(", Uri: ");
            sbLIZ.append(str2);
            C1544840qIs.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), null);
            if (abstractC1544900qIy != null) {
                strLJI = abstractC1544900qIy.LJI();
            } else {
                strLJI = null;
            }
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode = IJSInjectCallback$ErrorCode.ERROR_AUTO_ILLEGAL_URL;
            C1544940qJ2.LIZ(webView, str2, strLJI, null, iJSInjectCallback$ErrorCode);
            if (abstractC1544900qIy != null) {
                abstractC1544900qIy.LJIIIIZZ(iJSInjectCallback$ErrorCode);
                return;
            }
            return;
        }
        c1544870qIv.LJI.LIZIZ = 0;
        c1544870qIv.LJI.LIZJ = 0;
        C1544980qJ6 c1544980qJ6 = c1544870qIv.LIZJ;
        c1544980qJ6.LIZLLL = str2;
        c1544980qJ6.LIZ = str;
        c1544980qJ6.LIZIZ = enumC1544890qIx;
        JSInjectConfig jSInjectConfigLIZIZ = C1544810qIp.LIZIZ(str, abstractC1544900qIy, c1544870qIv, true, true);
        if (jSInjectConfigLIZIZ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[Auto] Fail for empty JSConfig. JSName: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", url: ");
            sbLIZ2.append(str2);
            C1544840qIs.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode2 = IJSInjectCallback$ErrorCode.ERROR_AUTO_JS_CONFIG_NOT_FOUND;
            C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode2, null, 40);
            if (abstractC1544900qIy == null) {
                return;
            }
            abstractC1544900qIy.LJIIIIZZ(iJSInjectCallback$ErrorCode2);
            return;
        }
        ConcurrentHashMap<Integer, String> concurrentHashMap = LIZLLL;
        concurrentHashMap.get(Integer.valueOf(webView.hashCode()));
        if (abstractC1544900qIy != null && abstractC1544900qIy.LIZIZ(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("reject by business interceptor. URL: ");
            sbLIZ3.append(str2);
            sbLIZ3.append(", JSName: ");
            sbLIZ3.append(jSInjectConfigLIZIZ.name);
            C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode3 = IJSInjectCallback$ErrorCode.ERROR_AUTO_JS_PROVIDER_INTERCEPT;
            C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode3, null, 40);
            if (abstractC1544900qIy == null) {
                return;
            }
            abstractC1544900qIy.LJIIIIZZ(iJSInjectCallback$ErrorCode3);
            return;
        }
        c1544870qIv.LIZJ.LIZJ = Integer.valueOf(jSInjectConfigLIZIZ.businessLine);
        if (!C1544810qIp.LIZJ(uri, jSInjectConfigLIZIZ, c1544870qIv)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[Auto] Fail for block url. JSName: ");
            sbLIZ4.append(str);
            sbLIZ4.append(", Url: ");
            sbLIZ4.append(str2);
            C1544840qIs.LIZLLL(C2188811AlT.LIZIZ(sbLIZ4));
            if (abstractC1544900qIy != null) {
                strLJI2 = abstractC1544900qIy.LJI();
            } else {
                strLJI2 = null;
            }
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode4 = IJSInjectCallback$ErrorCode.ERROR_AUTO_JS_CONFIG_INTERCEPT;
            C1544940qJ2.LIZ(webView, str2, strLJI2, null, iJSInjectCallback$ErrorCode4);
            if (abstractC1544900qIy == null) {
                return;
            }
            abstractC1544900qIy.LJIIIIZZ(iJSInjectCallback$ErrorCode4);
            return;
        }
        InterfaceC1545030qJB interfaceC1545030qJB = C1544770qIl.LJ;
        if (interfaceC1545030qJB != null && interfaceC1545030qJB.LIZIZ(str2)) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("reject by global interceptor. URL: ");
            sbLIZ5.append(str2);
            sbLIZ5.append(", JSName: ");
            sbLIZ5.append(jSInjectConfigLIZIZ.name);
            C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ5));
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode5 = IJSInjectCallback$ErrorCode.ERROR_AUTO_GLOBAL_INTERCEPT;
            C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode5, null, 40);
            if (abstractC1544900qIy == null) {
                return;
            }
            abstractC1544900qIy.LJIIIIZZ(iJSInjectCallback$ErrorCode5);
            return;
        }
        String strLIZIZ = C1544880qIw.LIZIZ(webView, jSInjectConfigLIZIZ, abstractC1544900qIy, c1544870qIv);
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            Pair pairLIZLLL = C1544880qIw.LIZLLL(webView, uri, strLIZIZ, jSInjectConfigLIZIZ, abstractC1544900qIy, c1544870qIv);
            Object first = pairLIZLLL.getFirst();
            String str4 = (String) pairLIZLLL.getSecond();
            if ((webView instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) webView) != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
                numValueOf = Integer.valueOf(hybridContext.LJ());
            } else {
                numValueOf = null;
            }
            boolean zLJFF = Intrinsics.LJFF(jSInjectConfigLIZIZ.injectTime, EnumC1544890qIx.MANUAL.getValue());
            if (zLJFF) {
                str3 = concurrentHashMap.get(Integer.valueOf(webView.hashCode()));
            } else {
                str3 = null;
            }
            SparkSecurityJSInjectionService sparkSecurityJSInjectionService = (SparkSecurityJSInjectionService) SparkSecurityServiceCenter.INSTANCE.protocol();
            C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelJSExecution);
            Map<String, Object> map = c828420Wee.LJFF;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            map.put("dataflowId", Integer.valueOf(iIntValue));
            c828420Wee.LJFF.put("URL", str2);
            c828420Wee.LJFF.put("inject_script", strLIZIZ);
            c828420Wee.LJFF.put("engine_view", webView);
            c828420Wee.LJFF.put("inject_config", jSInjectConfigLIZIZ);
            c828420Wee.LJFF.put("is_iframe_scene", Boolean.valueOf(zLJFF));
            c828420Wee.LJFF.put("is_iframe", Boolean.FALSE);
            Map<String, Object> map2 = c828420Wee.LJFF;
            if (str3 == null) {
                str3 = "";
            }
            map2.put("main_frame_url", str3);
            c828420Wee.LJFF.put("inject_params", first);
            C821850WLv c821850WLvHandleEvaluateJSByJSInjectSDKWithEvent = sparkSecurityJSInjectionService.handleEvaluateJSByJSInjectSDKWithEvent(c828420Wee);
            if (c821850WLvHandleEvaluateJSByJSInjectSDKWithEvent != null && c821850WLvHandleEvaluateJSByJSInjectSDKWithEvent.LIZ) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("reject by spark security solution. URL: ");
                sbLIZ6.append(str2);
                sbLIZ6.append(", JSName: ");
                sbLIZ6.append(jSInjectConfigLIZIZ.name);
                sbLIZ6.append(", time: ");
                sbLIZ6.append(enumC1544890qIx);
                C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ6));
                IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode6 = IJSInjectCallback$ErrorCode.ERROR_AUTO_SECURITY_INTERCEPT;
                Map<?, ?> map3 = c821850WLvHandleEvaluateJSByJSInjectSDKWithEvent.LIZIZ;
                if (map3 != null && (obj = map3.get("error")) != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode6, string, 8);
                if (abstractC1544900qIy == null) {
                    return;
                }
                abstractC1544900qIy.LJIIIIZZ(iJSInjectCallback$ErrorCode6);
                return;
            }
            webView.setTag(R.id.vsq, jSInjectConfigLIZIZ.name);
            webView.evaluateJavascript(str4, new ValueCallback() { // from class: X.0X7I
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj2) {
                    String str5 = (String) obj2;
                    AbstractC1544900qIy abstractC1544900qIy2 = abstractC1544900qIy;
                    String str6 = str;
                    String str7 = str2;
                    try {
                        JSONObject jSONObject = new JSONObject(str5);
                        int iOptInt = jSONObject.optInt("code", -1);
                        String strOptString = jSONObject.optString("message", "");
                        Object objOpt = jSONObject.opt("data");
                        if (iOptInt != 0) {
                            if (abstractC1544900qIy2 != null) {
                                abstractC1544900qIy2.LJIIJ(iOptInt, objOpt, strOptString);
                            }
                        } else if (abstractC1544900qIy2 != null) {
                            abstractC1544900qIy2.LJIIJJI(objOpt);
                        }
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("[Auto] Result Callback.name: ");
                        sbLIZ7.append(str6);
                        sbLIZ7.append(", code: ");
                        sbLIZ7.append(iOptInt);
                        sbLIZ7.append(", msg: ");
                        sbLIZ7.append(strOptString);
                        sbLIZ7.append(", data: ");
                        sbLIZ7.append(objOpt);
                        sbLIZ7.append(", url: ");
                        sbLIZ7.append(str7);
                        C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ7));
                        C189200o6.m2constructorimpl(jSONObject);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            });
            webView.setTag(R.id.vsq, "");
            c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            C1544870qIv.LIZIZ(c1544870qIv, webView, true, "js_inject_manage_client", null, null, null, 56);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("[Auto] Success inject js. JSName: ");
            sbLIZ7.append(str);
            sbLIZ7.append(", Url: ");
            sbLIZ7.append(str2);
            C1544840qIs.LIZLLL(C2188811AlT.LIZIZ(sbLIZ7));
            return;
        }
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("[Auto] Fail for empty script. JSName: ");
        sbLIZ8.append(str);
        sbLIZ8.append(", Url: ");
        sbLIZ8.append(str2);
        C1544840qIs.LIZLLL(C2188811AlT.LIZIZ(sbLIZ8));
        c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode7 = IJSInjectCallback$ErrorCode.ERROR_AUTO_JS_CODE_NOT_FOUND;
        C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode7, null, 40);
        if (abstractC1544900qIy == null) {
            return;
        }
        abstractC1544900qIy.LJIIIIZZ(iJSInjectCallback$ErrorCode7);
    }

    public static void LJIIIZ(StringBuilder sb, String str, JSInjectConfig jSInjectConfig, Uri uri, AbstractC1544900qIy abstractC1544900qIy, C1544870qIv c1544870qIv, WebView webView, List list) {
        String str2 = (String) C1544880qIw.LIZLLL(webView, uri, str, jSInjectConfig, abstractC1544900qIy, c1544870qIv).getSecond();
        sb.append("<script data-name=\"");
        sb.append(jSInjectConfig.name);
        sb.append("\">");
        sb.append(str2);
        sb.append("</script>");
        c1544870qIv.LJFF.LJIIJ = true;
        if (list != null) {
            list.add(str2);
        }
    }

    public static C821850WLv LJIIJJI(Integer num, String str, String str2, WebView webView, JSInjectConfig jSInjectConfig, boolean z, boolean z2, String str3) {
        int iIntValue;
        SparkSecurityJSInjectionService sparkSecurityJSInjectionService = (SparkSecurityJSInjectionService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelJSExecution);
        Map<String, Object> map = c828420Wee.LJFF;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put("dataflowId", Integer.valueOf(iIntValue));
        c828420Wee.LJFF.put("URL", str);
        Map<String, Object> map2 = c828420Wee.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        map2.put("inject_script", str2);
        c828420Wee.LJFF.put("engine_view", webView);
        c828420Wee.LJFF.put("inject_config", jSInjectConfig);
        c828420Wee.LJFF.put("is_iframe_scene", Boolean.valueOf(z));
        c828420Wee.LJFF.put("is_iframe", Boolean.valueOf(z2));
        Map<String, Object> map3 = c828420Wee.LJFF;
        if (str3 == null) {
            str3 = "";
        }
        map3.put("main_frame_url", str3);
        c828420Wee.LJFF.put("inject_params", "");
        return sparkSecurityJSInjectionService.handleInitScriptByJSInjectSDKWithEvent(c828420Wee);
    }
}
