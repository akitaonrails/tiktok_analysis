package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectGlobalConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0qIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544860qIu {
    public static void LIZIZ(Uri uri, String str, WebView webView, JSInjectGlobalConfig jSInjectGlobalConfig, InterfaceC1685420txc interfaceC1685420txc) {
        String strLIZIZ;
        Object c098200Yq;
        if (jSInjectGlobalConfig.inlineInjectors.isEmpty() || C1544810qIp.LIZLLL(uri, jSInjectGlobalConfig)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1545030qJB interfaceC1545030qJB = C1544770qIl.LJ;
        for (String str2 : jSInjectGlobalConfig.inlineInjectors) {
            AbstractC1544900qIy abstractC1544900qIyLIZIZ = C1544770qIl.LIZIZ(str2);
            C1544870qIv c1544870qIv = new C1544870qIv(jCurrentTimeMillis);
            c1544870qIv.LJI.LIZIZ = 0;
            c1544870qIv.LJI.LIZJ = 0;
            C1544980qJ6 c1544980qJ6 = c1544870qIv.LIZJ;
            c1544980qJ6.LIZLLL = str;
            c1544980qJ6.LJ = str;
            c1544980qJ6.LIZIZ = EnumC1544890qIx.VERY_BEGINNING;
            c1544980qJ6.LIZ = str2;
            JSInjectConfig jSInjectConfigLIZIZ = C1544810qIp.LIZIZ(str2, abstractC1544900qIyLIZIZ, c1544870qIv, true, false);
            if (jSInjectConfigLIZIZ != null) {
                if (abstractC1544900qIyLIZIZ != null && abstractC1544900qIyLIZIZ.LIZIZ(str)) {
                    IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode = IJSInjectCallback$ErrorCode.BLOCK_BY_BUSINESS_INTERCEPTOR;
                    abstractC1544900qIyLIZIZ.LJII(webView, iJSInjectCallback$ErrorCode, c1544870qIv.LIZLLL());
                    C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client_inline_main", null, iJSInjectCallback$ErrorCode, null, 40);
                } else {
                    c1544870qIv.LIZJ.LIZJ = Integer.valueOf(jSInjectConfigLIZIZ.businessLine);
                    if (C1544810qIp.LIZJ(uri, jSInjectConfigLIZIZ, c1544870qIv)) {
                        if (interfaceC1545030qJB != null && interfaceC1545030qJB.LIZIZ(str)) {
                            if (abstractC1544900qIyLIZIZ != null) {
                                abstractC1544900qIyLIZIZ.LJII(webView, IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_GLOBAL_INTERCEPT, c1544870qIv.LIZLLL());
                            }
                            C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client_inline_main", null, IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_GLOBAL_INTERCEPT, null, 40);
                        } else {
                            c1544870qIv.LIZLLL.LIZJ();
                            if (str2.length() > 0 && (strLIZIZ = C1544760qIk.LIZIZ.get(str2)) != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("[TTWebJSInjectExt] consume preload JS: JSName: ");
                                sbLIZ.append(jSInjectConfigLIZIZ.name);
                                sbLIZ.append(", url: ");
                                sbLIZ.append(str);
                                C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                strLIZIZ = "";
                            }
                            if (strLIZIZ.length() != 0 || (strLIZIZ = C1544880qIw.LIZIZ(webView, jSInjectConfigLIZIZ, abstractC1544900qIyLIZIZ, c1544870qIv)) != null) {
                                if (strLIZIZ.length() != 0) {
                                    ((Boolean) interfaceC1685420txc.invoke(strLIZIZ, jSInjectConfigLIZIZ.name, abstractC1544900qIyLIZIZ, jSInjectConfigLIZIZ, c1544870qIv)).booleanValue();
                                    c1544870qIv.LIZLLL.LIZ();
                                }
                            }
                        }
                    } else {
                        if (abstractC1544900qIyLIZIZ != null) {
                            abstractC1544900qIyLIZIZ.LJII(webView, IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_JS_CONFIG_INTERCEPT, c1544870qIv.LIZLLL());
                        }
                        C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client_inline_main", null, IJSInjectCallback$ErrorCode.ERROR_VERY_BEGINNING_JS_CONFIG_INTERCEPT, null, 40);
                    }
                }
            } else {
                if (abstractC1544900qIyLIZIZ != null) {
                    try {
                        abstractC1544900qIyLIZIZ.LJII(webView, IJSInjectCallback$ErrorCode.ERROR_BLOCK_BY_EMPTY_CONFIG, c1544870qIv.LIZLLL());
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                }
                C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client_inline_main", null, IJSInjectCallback$ErrorCode.ERROR_BLOCK_BY_EMPTY_CONFIG, null, 40);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m1boximpl(c098200Yq);
            }
        }
    }

    public static boolean LIZ(WebView webView, String str, Uri uri, Set set, String str2, EnumC1541410qDL enumC1541410qDL) {
        InterfaceC1544780qIm first;
        Set<String> second;
        ConcurrentHashMap<String, Map<String, Pair<InterfaceC1544780qIm, Set<String>>>> concurrentHashMap = C1544760qIk.LIZJ;
        Map<String, Pair<InterfaceC1544780qIm, Set<String>>> map = concurrentHashMap.get(String.valueOf(webView.hashCode()));
        if (map != null) {
            String strLIZIZ = C20509081r.LIZIZ(uri);
            Pair<InterfaceC1544780qIm, Set<String>> pair = map.get(str2);
            if (pair != null && (second = pair.getSecond()) != null && C13LP.LJJJJ(strLIZIZ, second)) {
                return true;
            }
        }
        InterfaceC1544780qIm interfaceC1544780qImAddDocumentStartJavaScript = C1541490qDT.LIZLLL.addDocumentStartJavaScript(webView, str, set, enumC1541410qDL);
        if (interfaceC1544780qImAddDocumentStartJavaScript == null) {
            return false;
        }
        String strValueOf = String.valueOf(webView.hashCode());
        Map<String, Pair<InterfaceC1544780qIm, Set<String>>> linkedHashMap = concurrentHashMap.get(strValueOf);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        Pair<InterfaceC1544780qIm, Set<String>> pair2 = linkedHashMap.get(str2);
        if (pair2 != null && (first = pair2.getFirst()) != null) {
            first.remove();
        }
        linkedHashMap.remove(str2);
        linkedHashMap.put(str2, new Pair<>(interfaceC1544780qImAddDocumentStartJavaScript, set));
        concurrentHashMap.put(strValueOf, linkedHashMap);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[TTWebJSInjectExt] addDocumentScript success, name:");
        sbLIZ.append(str2);
        sbLIZ.append(", view:");
        sbLIZ.append(webView);
        sbLIZ.append(", url:");
        sbLIZ.append(uri);
        C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }
}
