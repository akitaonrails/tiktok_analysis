package X;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.hybrid.spark.security.web_js.core.IFrameOptConfig;
import com.bytedance.hybrid.spark.security.web_js.setting.InlineInjectOptSettings;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectGlobalConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hybridkit.experiment.BdxbridgeUrlSecurityTokenSettings;
import com.ss.android.ugc.aweme.hybridkit.web.inject.WebViewJSInjectExtImpl;
import com.ss.android.ugc.aweme.hybridkit.web.inject.WebViewProviderImpl;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543890qHL {
    public static final C1543890qHL LIZ = new C1543890qHL();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1544260qHw());
    public static final List<String> LIZLLL = C1697810uHb.LJIILJJIL(".tiktok.com", ".tiktokv.com", ".tiktokcdn.com", ".tiktokcdn-us.com");

    public final synchronized void LIZ() {
        AtomicBoolean atomicBoolean = LIZIZ;
        if (atomicBoolean.get()) {
            return;
        }
        C1541490qDT.LJFF = new C1541910qE9();
        Boolean bool = Boolean.TRUE;
        C1544520qIM.LIZIZ(bool, "web_js_inject_sdk_init_start");
        C1544520qIM.LIZIZ(Long.valueOf(System.currentTimeMillis()), "web_js_inject_sdk_init_start_tmp");
        C1544850qIt c1544850qIt = new C1544850qIt();
        C828220WeK.LIZIZ = new C1536240q50();
        WebViewHooker.LIZLLL(new WebViewJSInjectExtImpl(c1544850qIt));
        WebViewHooker.LJ(new WebViewProviderImpl(c1544850qIt));
        InterfaceC1544560qIQ interfaceC1544560qIQ = new InterfaceC1544560qIQ() { // from class: X.0qHc
            @Override // X.InterfaceC1544560qIQ
            public final Object LIZ(String str, Type type, JSInjectConfig jSInjectConfig) {
                Object c098200Yq;
                String str2;
                if (str != null) {
                    try {
                        Object objLJIIJJI = C0C59.LJ().LJIIJJI(str, true);
                        Gson gson = C7740030o.LIZ().getGson();
                        if (objLJIIJJI instanceof String) {
                            str2 = (String) objLJIIJJI;
                        } else {
                            str2 = null;
                        }
                        c098200Yq = gson.LJIIIIZZ(str2, type);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        return c098200Yq;
                    }
                }
                return jSInjectConfig;
            }
        };
        if (C1544770qIl.LIZJ == null) {
            C1544770qIl.LIZJ = interfaceC1544560qIQ;
        }
        InterfaceC1544790qIn interfaceC1544790qIn = new InterfaceC1544790qIn() { // from class: X.0qI4
            @Override // X.InterfaceC1544790qIn
            public final JSInjectGlobalConfig LIZ() {
                if (C1544350qI5.LIZIZ == null) {
                    C1544350qI5.LIZIZ = (JSInjectGlobalConfig) C0C64.LJIILLIIL().LJJII(JSInjectGlobalConfig.class, C1544350qI5.LIZ, "global_js_inject_manage_collections", true);
                }
                JSInjectGlobalConfig jSInjectGlobalConfig = C1544350qI5.LIZIZ;
                return jSInjectGlobalConfig == null ? C1544350qI5.LIZ : jSInjectGlobalConfig;
            }
        };
        if (C1544770qIl.LIZIZ == null) {
            C1544770qIl.LIZIZ = interfaceC1544790qIn;
        }
        InterfaceC1545030qJB interfaceC1545030qJB = new InterfaceC1545030qJB() { // from class: X.0qHZ
            @Override // X.InterfaceC1545010qJ9
            public final boolean LIZIZ(String str) {
                return false;
            }

            @Override // X.InterfaceC1545010qJ9
            public final boolean LIZJ(WebView webView, String str, String str2, JSInjectConfig jSInjectConfig, Integer num) {
                return false;
            }

            @Override // X.InterfaceC1545030qJB
            public final boolean LIZLLL(String str) {
                Object c098200Yq;
                if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
                    return true;
                }
                try {
                    c098200Yq = C1942007j8.LIZ(UriProtector.parse(str));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str2 = (String) c098200Yq;
                if (str2 == null) {
                    return true;
                }
                Iterator<String> it2 = C1543890qHL.LIZLLL.iterator();
                while (it2.hasNext()) {
                    if (u.LJIIZILJ(str2, it2.next(), false)) {
                        return false;
                    }
                }
                return true;
            }
        };
        if (C1544770qIl.LJ == null) {
            C1544770qIl.LJ = interfaceC1545030qJB;
        }
        InterfaceC1544390qI9 interfaceC1544390qI9 = new InterfaceC1544390qI9() { // from class: X.0qI2
            @Override // X.InterfaceC1544390qI9
            public final C1537250q6d LIZ(EnumC1537240q6c enumC1537240q6c, InterfaceC1544330qI3 interfaceC1544330qI3) {
                Uri url;
                String string;
                ISparkHostApi iSparkHostApi;
                C1544380qI8 c1544380qI8LJLZ;
                WebResourceResponse webResourceResponseLJJIJIIJIL;
                EnumC1537240q6c enumC1537240q6c2 = EnumC1537240q6c.Online;
                if (enumC1537240q6c == enumC1537240q6c2) {
                    WebView webViewLIZ = interfaceC1544330qI3.LIZ();
                    if (webViewLIZ == null) {
                        return null;
                    }
                    Map<String, String> requestHeaders = interfaceC1544330qI3.getRequestHeaders();
                    if (requestHeaders == null) {
                        requestHeaders = new LinkedHashMap<>();
                    }
                    requestHeaders.put("x-tt-bypass-dp", "1");
                    C1543890qHL c1543890qHL = C1543890qHL.LIZ;
                    if (((Boolean) C1543890qHL.LIZJ.getValue()).booleanValue()) {
                        requestHeaders.put("x-web-inject", "1");
                    }
                    ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi2 == null || (webResourceResponseLJJIJIIJIL = iSparkHostApi2.LJJIJIIJIL(webViewLIZ, interfaceC1544330qI3.isForMainFrame(), "GET", interfaceC1544330qI3.getUrl(), requestHeaders)) == null) {
                        return null;
                    }
                    return C1543890qHL.LIZJ(webResourceResponseLJJIJIIJIL, enumC1537240q6c2, null);
                }
                EnumC1537240q6c enumC1537240q6c3 = EnumC1537240q6c.Offline;
                if (enumC1537240q6c != enumC1537240q6c3 || (url = interfaceC1544330qI3.getUrl()) == null || (string = url.toString()) == null || (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) == null || (c1544380qI8LJLZ = iSparkHostApi.LJLZ(string, interfaceC1544330qI3.LIZLLL(), interfaceC1544330qI3.LIZIZ(), interfaceC1544330qI3.LIZJ())) == null) {
                    return null;
                }
                if (!c1544380qI8LJLZ.LIZIZ) {
                    enumC1537240q6c2 = enumC1537240q6c3;
                }
                WebResourceResponse webResourceResponse = c1544380qI8LJLZ.LIZ;
                if (webResourceResponse == null) {
                    return null;
                }
                C1543890qHL c1543890qHL2 = C1543890qHL.LIZ;
                return C1543890qHL.LIZJ(webResourceResponse, enumC1537240q6c2, Integer.valueOf(c1544380qI8LJLZ.LIZJ));
            }
        };
        if (C1544770qIl.LIZLLL == null) {
            C1544770qIl.LIZLLL = interfaceC1544390qI9;
        }
        C1544520qIM.LIZIZ(bool, "web_js_inject_sdk_init_end");
        C1544520qIM.LIZIZ(Long.valueOf(System.currentTimeMillis()), "web_js_inject_sdk_init_tmp");
        LIZIZ();
        C1544770qIl.LIZ.set(true);
        C1055810da7 c1055810da7 = C1055810da7.LIZ;
        InterfaceC1055820da8 interfaceC1055820da8 = new InterfaceC1055820da8() { // from class: X.0da9
            @Override // X.InterfaceC1055820da8
            public final void LIZ(WebView webView, String str, ValueCallback<String> valueCallback, EnumC1055790da5 enumC1055790da5, AbstractC1544900qIy abstractC1544900qIy) {
                C1544770qIl.LIZ(webView, abstractC1544900qIy);
            }
        };
        c1055810da7.getClass();
        C1055810da7.LIZIZ = interfaceC1055820da8;
        C1055810da7.LIZJ = ((Boolean) C0AJA.LIZ.getValue()).booleanValue();
        InlineInjectOptSettings inlineInjectOptSettings = C828230WeL.LIZ;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        InlineInjectOptSettings inlineInjectOptSettings2 = C828230WeL.LIZ;
        InlineInjectOptSettings inlineInjectOptSettings3 = (InlineInjectOptSettings) c0c64LJIILLIIL.LJJII(InlineInjectOptSettings.class, inlineInjectOptSettings2, "jsinjection_inline_nonce_opt", true);
        if (inlineInjectOptSettings3 != null) {
            inlineInjectOptSettings2 = inlineInjectOptSettings3;
        }
        IFrameOptConfig iFrameOptConfig = (IFrameOptConfig) SettingsManager.LIZLLL().LJIIIIZZ("jsinject_iframe_opt", IFrameOptConfig.class, null);
        if (iFrameOptConfig != null) {
            if (iFrameOptConfig.enableNonHtmlCache) {
                C1535930q4V.LIZIZ = iFrameOptConfig;
                Set<String> stringSet = Keva.getRepo("spark_js_inject").getStringSet("non_html_urls", C08CX.INSTANCE);
                int i = iFrameOptConfig.nonHtmlCacheLimit;
                if (i <= 0) {
                    i = 500;
                }
                C1535930q4V.LIZJ = new C612740O1o(stringSet, i);
                C1535930q4V.LIZ.set(true);
            }
            inlineInjectOptSettings2.enableIframe = inlineInjectOptSettings2.enableIframe || iFrameOptConfig.enableNonce;
        }
        C1544810qIp.LIZJ = inlineInjectOptSettings2;
        atomicBoolean.set(true);
    }

    public static void LIZIZ() {
        C1544010qHX.LIZ.getClass();
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        C1543410qGZ.LJIILLIIL = BdxbridgeUrlSecurityTokenSettings.LIZ().reportAllTokenState;
        C1543410qGZ.LJIILL = BdxbridgeUrlSecurityTokenSettings.LIZ().noTokenUseUrl;
        List<String> list = BdxbridgeUrlSecurityTokenSettings.LIZ().noAuthTokenPassUrlList;
        if (list != null) {
            C1543410qGZ.LJIIZILJ.addAll(list);
        }
        C1543410qGZ.LJIJ = BdxbridgeUrlSecurityTokenSettings.LIZ().iframeCallCanBePass;
        C1543850qHH.LJIIL = new InterfaceC1287010jb1() { // from class: X.0qHj
            @Override // X.InterfaceC1287010jb1
            public final Map<String, Object> LIZ(WebView webView) {
                Map<String, Object> map;
                C1544280qHy c1544280qHy = C1544850qIt.LJ.get(Integer.valueOf(webView.hashCode()));
                if (c1544280qHy == null || (map = c1544280qHy.LIZ) == null) {
                    return C2097608Jq.LJ();
                }
                return map;
            }
        };
        C1544770qIl.LIZJ(new C0X57() { // from class: X.0qHK
            @Override // X.AbstractC1544900qIy, X.InterfaceC1545010qJ9
            public final boolean LIZIZ(String str) {
                JSONObject jSONObjectLIZ;
                List<C1543160qGA> listLIZ;
                Matcher matcher;
                if (!BdxbridgeUrlSecurityTokenSettings.LIZ().enable) {
                    C1544520qIM.LIZIZ("enable_false", "jsb_auth_should_reject_jsb_protection");
                    return true;
                }
                boolean z = false;
                if (BdxbridgeUrlSecurityTokenSettings.LIZ().allPageToInjectJS) {
                    C1544520qIM.LIZIZ("all_page_to_inject_js", "jsb_auth_should_reject_jsb_protection");
                    return false;
                }
                Uri uri = UriProtector.parse(str);
                String host = uri.getHost();
                if (host != null && host.length() != 0) {
                    for (String str2 : C1542900qFk.LIZIZ) {
                        if (!Intrinsics.LJFF(host, str2)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('.');
                            sbLIZ.append(str2);
                            if (u.LJIIZILJ(host, C2188811AlT.LIZIZ(sbLIZ), false)) {
                            }
                        }
                        C1544520qIM.LIZIZ("safe_host_match", "jsb_auth_should_reject_jsb_protection");
                    }
                    Iterator<Map.Entry<String, C1542910qFl>> it2 = C1542900qFk.LIZ.entrySet().iterator();
                    loop1: while (it2.hasNext()) {
                        C1542910qFl value = it2.next().getValue();
                        value.getClass();
                        String strLIZIZ = C1542910qFl.LIZIZ(uri.getHost());
                        String string = uri.toString();
                        if (strLIZIZ != null && strLIZIZ.length() != 0 && (listLIZ = value.LIZ(strLIZIZ)) != null) {
                            Iterator<C1543160qGA> it3 = listLIZ.iterator();
                            while (it3.hasNext()) {
                                Pattern pattern = it3.next().LIZ;
                                if (pattern != null && (matcher = pattern.matcher(string)) != null && matcher.find()) {
                                    C1544520qIM.LIZIZ("permission_config_match", "jsb_auth_should_reject_jsb_protection");
                                    z = true;
                                }
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    for (String str3 : C1543850qHH.LJIILJJIL.keySet()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sdk: ");
                        sbLIZ2.append(str3);
                        sbLIZ2.append(": ");
                        C1544530qIN c1544530qIN = C1543850qHH.LJIILJJIL.get(str3);
                        if (c1544530qIN != null) {
                            jSONObjectLIZ = c1544530qIN.LIZ();
                        } else {
                            jSONObjectLIZ = null;
                        }
                        sbLIZ2.append(jSONObjectLIZ);
                        sbLIZ2.append(',');
                        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    String string2 = sb.toString();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(C1542900qFk.LIZIZ.size());
                    sbLIZ3.append(" | ");
                    sbLIZ3.append(C1542900qFk.LIZ.size());
                    sbLIZ3.append(" | ");
                    sbLIZ3.append(string2);
                    C1544520qIM.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), "jsb_auth_check_repository");
                    C1544520qIM.LIZIZ("all_cannot_match", "jsb_auth_should_reject_jsb_protection");
                } else {
                    C1544520qIM.LIZIZ("host_is_empty", "jsb_auth_should_reject_jsb_protection");
                }
                return !z;
            }

            @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
            public final String LJFF(Uri uri, WebView webView) throws JSONException {
                String string = uri.toString();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("generateWebViewToken with Url = ");
                sbLIZ.append(string);
                sbLIZ.append(", webview = ");
                sbLIZ.append(webView);
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1297560js2 interfaceC1297560js22 = C1543410qGZ.LJIIIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(System.currentTimeMillis());
                sbLIZ2.append('-');
                sbLIZ2.append(UUID.randomUUID());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                C1544400qIA c1544400qIA = new C1544400qIA(string, strLIZIZ);
                ConcurrentHashMap<String, ConcurrentHashMap<String, C1544400qIA>> concurrentHashMap = C1543920qHO.LIZ;
                if (concurrentHashMap.containsKey(String.valueOf(webView.hashCode()))) {
                    ConcurrentHashMap<String, C1544400qIA> concurrentHashMap2 = concurrentHashMap.get(String.valueOf(webView.hashCode()));
                    if (concurrentHashMap2 != null) {
                        concurrentHashMap2.put(strLIZIZ, c1544400qIA);
                    }
                } else {
                    String strValueOf = String.valueOf(webView.hashCode());
                    ConcurrentHashMap<String, C1544400qIA> concurrentHashMap3 = new ConcurrentHashMap<>();
                    concurrentHashMap3.put(strLIZIZ, c1544400qIA);
                    concurrentHashMap.put(strValueOf, concurrentHashMap3);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", strLIZIZ);
                return C786410Ut5.J3(jSONObject);
            }

            @Override // X.AbstractC1544900qIy
            public final void LJII(WebView webView, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, C1047860dNI c1047860dNI) {
                String str;
                String str2;
                String str3;
                String str4;
                if (BdxbridgeUrlSecurityTokenSettings.LIZ().markNewSolution) {
                    String str5 = null;
                    if (BdxbridgeUrlSecurityTokenSettings.LIZ().allPageNoTokenCannotPass) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("all_page_no_token_cannot_pass, code: ");
                        sbLIZ.append(iJSInjectCallback$ErrorCode);
                        sbLIZ.append(" main: ");
                        if (c1047860dNI != null) {
                            str4 = c1047860dNI.LIZIZ;
                        } else {
                            str4 = null;
                        }
                        sbLIZ.append(str4);
                        sbLIZ.append(" iframe: ");
                        if (c1047860dNI != null) {
                            str5 = c1047860dNI.LIZ;
                        }
                        sbLIZ.append(str5);
                        C1544520qIM.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "jsb_auth_should_mark_no_token_tag");
                        return;
                    }
                    List<String> list2 = BdxbridgeUrlSecurityTokenSettings.LIZ().noAuthTokenPassUrlList;
                    if (list2 != null) {
                        boolean z = false;
                        for (String str6 : list2) {
                            if (c1047860dNI != null && (str3 = c1047860dNI.LIZIZ) != null && u.LJJIIJZLJL(str3, str6, false)) {
                                z = true;
                            }
                        }
                        if (z) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("all_page_no_token_can_pass_in_allow_list, code: ");
                            sbLIZ2.append(iJSInjectCallback$ErrorCode);
                            sbLIZ2.append(" main: ");
                            if (c1047860dNI != null) {
                                str2 = c1047860dNI.LIZIZ;
                            } else {
                                str2 = null;
                            }
                            sbLIZ2.append(str2);
                            sbLIZ2.append(" iframe: ");
                            if (c1047860dNI != null) {
                                str5 = c1047860dNI.LIZ;
                            }
                            sbLIZ2.append(str5);
                            C1544520qIM.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), "jsb_auth_should_mark_no_token_tag");
                            C1543920qHO.LJFF(webView, iJSInjectCallback$ErrorCode.toString());
                            return;
                        }
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("all_page_no_token_cannot_pass_no_in_allow_list, code: ");
                    sbLIZ3.append(iJSInjectCallback$ErrorCode);
                    sbLIZ3.append(" main: ");
                    if (c1047860dNI != null) {
                        str = c1047860dNI.LIZIZ;
                    } else {
                        str = null;
                    }
                    sbLIZ3.append(str);
                    sbLIZ3.append(" iframe: ");
                    if (c1047860dNI != null) {
                        str5 = c1047860dNI.LIZ;
                    }
                    sbLIZ3.append(str5);
                    C1544520qIM.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), "jsb_auth_should_mark_no_token_tag");
                    return;
                }
                C1543920qHO.LJFF(webView, iJSInjectCallback$ErrorCode.toString());
            }
        });
        C1544520qIM.LIZIZ(Boolean.TRUE, "jsb_auth_inject_provider_init_finish");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0q6d] */
    public static C1537250q6d LIZJ(final WebResourceResponse webResourceResponse, final EnumC1537240q6c enumC1537240q6c, final Integer num) {
        if (!Intrinsics.LJFF(webResourceResponse.getReasonPhrase(), "redirect")) {
            int statusCode = webResourceResponse.getStatusCode();
            if (300 <= statusCode && statusCode < 400) {
                return null;
            }
            return new InterfaceC1544960qJ4() { // from class: X.0q6d
                @Override // X.InterfaceC1544960qJ4
                public final String LIZ() {
                    String reasonPhrase = webResourceResponse.getReasonPhrase();
                    return reasonPhrase == null ? "OK" : reasonPhrase;
                }

                @Override // X.InterfaceC1544960qJ4
                public final String LIZIZ() {
                    String encoding = webResourceResponse.getEncoding();
                    return encoding == null ? "UTF-8" : encoding;
                }

                @Override // X.InterfaceC1544960qJ4
                public final InputStream getData() {
                    return webResourceResponse.getData();
                }

                @Override // X.InterfaceC1544960qJ4
                public final Map<String, String> getHeaders() {
                    return webResourceResponse.getResponseHeaders();
                }

                @Override // X.InterfaceC1544960qJ4
                public final String getMimeType() {
                    String mimeType = webResourceResponse.getMimeType();
                    return mimeType == null ? "text/html" : mimeType;
                }

                @Override // X.InterfaceC1544960qJ4
                public final int getStatusCode() {
                    Integer num2 = num;
                    return num2 != null ? num2.intValue() : webResourceResponse.getStatusCode();
                }

                @Override // X.InterfaceC1544960qJ4
                public final EnumC1537240q6c LIZJ() {
                    return enumC1537240q6c;
                }
            };
        }
        return null;
    }
}
