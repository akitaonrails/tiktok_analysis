package X;

import Y.ARunnableS3S1500000_23;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectGlobalConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544760qIk implements InterfaceC1544310qI1 {
    public static final C1544860qIu LIZ = new C1544860qIu();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Map<String, Pair<InterfaceC1544780qIm, Set<String>>>> LIZJ = new ConcurrentHashMap<>();
    public static final C01GW<Boolean> LIZLLL = C452501pT.LIZIZ(new C1542290qEl());

    @Override // X.InterfaceC1544310qI1
    public final void LIZ(WebView webView, String str) {
    }

    @Override // X.InterfaceC1544310qI1
    public final WebResourceResponse LIZIZ(WebView webView, WebResourceRequest webResourceRequest) {
        return null;
    }

    @Override // X.InterfaceC1544310qI1
    public final void LIZJ(WebView webView) {
    }

    @Override // X.InterfaceC1544310qI1
    public final WebResourceResponse LIZLLL(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        return webResourceResponse;
    }

    @Override // X.InterfaceC1544310qI1
    public final void LJFF(WebView webView) {
    }

    @Override // X.InterfaceC1544310qI1
    public final void LJII(WebView webView, String str) {
    }

    @Override // X.InterfaceC1544310qI1
    public final void onPageFinished(WebView webView, String str) {
    }

    public static void LJIIIZ(WebView webView) {
        String strValueOf = String.valueOf(webView.hashCode());
        Map<String, Pair<InterfaceC1544780qIm, Set<String>>> map = LIZJ.get(strValueOf);
        if (map != null) {
            Iterator<Map.Entry<String, Pair<InterfaceC1544780qIm, Set<String>>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().getFirst().remove();
            }
        }
        ConcurrentHashMap<String, Map<String, Pair<InterfaceC1544780qIm, Set<String>>>> concurrentHashMap = LIZJ;
        Map<String, Pair<InterfaceC1544780qIm, Set<String>>> map2 = concurrentHashMap.get(strValueOf);
        if (map2 != null) {
            map2.clear();
        }
        concurrentHashMap.remove(strValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[TTWebJSInjectExt] clear scriptHandler&preloadJSCode, viewHash:");
        sbLIZ.append(strValueOf);
        C1544840qIs.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1544310qI1
    public final void destroy(WebView webView) {
        if (webView == null) {
            return;
        }
        LJIIIZ(webView);
        LIZIZ.clear();
    }

    public static void LJIIIIZZ(WebView webView, String str) {
        Object c098200Yq;
        if (str == null) {
            return;
        }
        if (u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[TTWebJSInjectExt] refreshDocumentJSInject Start, url:");
            sbLIZ.append(str);
            C1544840qIs.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (!C1544770qIl.LIZ.get()) {
                return;
            }
            JSInjectGlobalConfig jSInjectGlobalConfigLIZ = C1544810qIp.LIZ();
            LJIIIZ(webView);
            LIZ.getClass();
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
            if (uri != null) {
                C1544860qIu.LIZIZ(uri, str, webView, jSInjectGlobalConfigLIZ, new C1544800qIo(uri, webView));
            }
            if (C1541490qDT.LIZLLL.enableOptimizeIframeJSInjection()) {
                LIZ.getClass();
                Set setLIZJ = C1535930q4V.LIZJ(jSInjectGlobalConfigLIZ.manualInjectors, 3);
                if (setLIZJ != null) {
                    Iterator it2 = setLIZJ.iterator();
                    while (it2.hasNext()) {
                        AbstractC1544900qIy abstractC1544900qIyLIZIZ = C1544770qIl.LIZIZ((String) it2.next());
                        if (abstractC1544900qIyLIZIZ != null) {
                            Set setSingleton = Collections.singleton("*");
                            EnumC1541410qDL enumC1541410qDL = EnumC1541410qDL.ONLY_IFRAMES;
                            EnumC993040bws enumC993040bws = EnumC993040bws.ADD_DOCUMENT_JS_LOADED;
                            if (C1544770qIl.LIZ.get()) {
                                HandlerHook.viewPost(webView, new ARunnableS3S1500000_23(webView, abstractC1544900qIyLIZIZ, enumC993040bws, enumC1541410qDL, str, setSingleton, 1));
                            } else {
                                String url = webView.getUrl();
                                String strLJI = abstractC1544900qIyLIZIZ.LJI();
                                IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode = IJSInjectCallback$ErrorCode.ERROR_MANUAL_WEBVIEWJSINJECTSDK_NOT_INIT;
                                C1544940qJ2.LIZ(webView, url, strLJI, null, iJSInjectCallback$ErrorCode);
                                abstractC1544900qIyLIZIZ.LJIIIIZZ(iJSInjectCallback$ErrorCode);
                                if (C1544770qIl.LIZLLL(abstractC1544900qIyLIZIZ.LJI())) {
                                    int code = iJSInjectCallback$ErrorCode.getCode();
                                    String url2 = webView.getUrl();
                                    if (url2 == null) {
                                        url2 = "";
                                    }
                                    abstractC1544900qIyLIZIZ.LJIIJ(code, C2097908Jt.LIZJ(new Pair("func", "addDocumentLoadJavaScript")), url2);
                                }
                            }
                        }
                    }
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[TTWebJSInjectExt] refreshDocumentJSInject End, url:");
            sbLIZ2.append(str);
            C1544840qIs.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC1544310qI1
    public final void LJ(WebView webView, String str) {
        LJIIIIZZ(webView, str);
    }

    @Override // X.InterfaceC1544310qI1
    public final void LJI(WebView webView, String str, boolean z) {
        if (z) {
            return;
        }
        LJIIIIZZ(webView, str);
    }
}
