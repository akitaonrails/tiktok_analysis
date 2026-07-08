package X;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebNavigationService;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828250WeN {
    public static final AnonymousClass0843 LIZ = new AnonymousClass0843();
    public static final AnonymousClass0844 LIZIZ = new AnonymousClass0844();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[PHI: r2
      0x0014: PHI (r2v2 boolean) = (r2v0 boolean), (r2v3 boolean) binds: [B:15:0x0026, B:8:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebResourceResponse LIZIZ(android.webkit.WebView r4, android.webkit.WebResourceRequest r5, boolean r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L2a
            android.net.Uri r1 = r5.getUrl()
        L7:
            java.lang.String r3 = java.lang.String.valueOf(r1)
            if (r5 == 0) goto L25
            boolean r1 = r5.isForMainFrame()
            r2 = 1
            if (r1 != r2) goto L25
        L14:
            java.util.Map r1 = r5.getRequestHeaders()
        L18:
            kotlin.Pair r1 = LIZJ(r4, r3, r2, r6, r1)
            if (r1 == 0) goto L24
            java.lang.Object r0 = r1.getFirst()
            android.webkit.WebResourceResponse r0 = (android.webkit.WebResourceResponse) r0
        L24:
            return r0
        L25:
            r2 = 0
            if (r5 != 0) goto L14
            r1 = r0
            goto L18
        L2a:
            r1 = r0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C828250WeN.LIZIZ(android.webkit.WebView, android.webkit.WebResourceRequest, boolean):android.webkit.WebResourceResponse");
    }

    public static Pair LIZJ(WebView webView, String str, boolean z, boolean z2, Map map) {
        Object c098200Yq;
        C098200Yq c098200Yq2;
        int iHashCode;
        int iHashCode2;
        C821850WLv c821850WLvLIZ;
        int iHashCode3;
        Object obj;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("spark_security_web_navigation_config");
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
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        boolean z3 = true;
        if ((bool == null || bool.booleanValue()) && str != null) {
            try {
                AnonymousClass0843 anonymousClass0843 = LIZ;
                if (webView != null) {
                    iHashCode = webView.hashCode();
                } else {
                    iHashCode = 0;
                }
                String str2 = (String) anonymousClass0843.get((Object) Integer.valueOf(iHashCode));
                if (str2 == null) {
                    str2 = "null";
                }
                if (webView == null) {
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = webView.hashCode();
                }
                anonymousClass0843.put(Integer.valueOf(iHashCode2), str);
                c821850WLvLIZ = LIZ(str, str2, z, webView, webView instanceof WebKitView, z2, map);
                AnonymousClass0844 anonymousClass0844 = LIZIZ;
                if (webView != null) {
                    iHashCode3 = webView.hashCode();
                } else {
                    iHashCode3 = 0;
                }
                Integer numValueOf = Integer.valueOf(iHashCode3);
                if (c821850WLvLIZ == null || !c821850WLvLIZ.LIZ) {
                    z3 = false;
                }
                anonymousClass0844.put(numValueOf, new AnonymousClass0845(z3));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (c821850WLvLIZ != null && c821850WLvLIZ.LIZ) {
                Map<?, ?> map2 = c821850WLvLIZ.LIZIZ;
                if (map2 != null && (obj = map2.get("block_html_string")) != null && (obj instanceof String)) {
                    return new Pair(new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(((String) obj).getBytes(Charsets.UTF_8))), c821850WLvLIZ);
                }
                return new Pair(null, c821850WLvLIZ);
            }
            C189200o6.m2constructorimpl(null);
            c098200Yq2 = null;
            C189200o6.m1boximpl(c098200Yq2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C821850WLv LIZ(String str, String str2, boolean z, WebView webView, boolean z2, boolean z3, Map map) {
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        InterfaceC1541990qEH interfaceC1541990qEH;
        SparkSecurityWebNavigationService sparkSecurityWebNavigationService = (SparkSecurityWebNavigationService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C1E6N c1e6n = C1E6N.SparkSecuritySolutionEndpointWebView;
        C828420Wee c828420Wee = new C828420Wee(c1e6n, c1e6n, C1E6B.SparkSecuritySolutionChannelWebNavigation);
        Map<String, Object> map2 = c828420Wee.LJFF;
        if (str == null) {
            str = "";
        }
        map2.put("URL", str);
        c828420Wee.LJFF.put("prev_url", str2);
        c828420Wee.LJFF.put("is_main_frame", Boolean.valueOf(z));
        if (webView != 0) {
            c828420Wee.LJFF.put("web_instance", new WeakReference(webView));
        }
        c828420Wee.LJFF.put("is_spark", Boolean.valueOf(z2));
        c828420Wee.LJFF.put("origin_router_url", "");
        c828420Wee.LJFF.put("origin_http_url", "");
        c828420Wee.LJFF.put("iframe_redirect", Boolean.valueOf(z3));
        if (map != null) {
            c828420Wee.LJFF.put("header", map);
        }
        if ((webView instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) webView) != null && interfaceC1541990qEH.getHybridContext() != null) {
            InterfaceC1541990qEH interfaceC1541990qEH2 = (InterfaceC1541990qEH) webView;
            c828420Wee.LJFF.put("dataflowId", Integer.valueOf(interfaceC1541990qEH2.getHybridContext().LJ()));
            c828420Wee.LJFF.put("origin_router_url", interfaceC1541990qEH2.getHybridContext().LJIJI());
        }
        if (z2 && (interfaceC1531560pxS = ((WebKitView) webView).getHybridContext().hybridParams) != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
            if (hybridSchemaParamLIZJ.getUrl().length() > 0) {
                c828420Wee.LJFF.put("origin_http_url", hybridSchemaParamLIZJ.getUrl());
            } else {
                c828420Wee.LJFF.put("origin_http_url", hybridSchemaParamLIZJ.getSurl());
            }
        }
        return sparkSecurityWebNavigationService.handleWebViewWillStartNavigation(c828420Wee);
    }
}
