package Y;

import X.AbstractC1544900qIy;
import X.C098200Yq;
import X.C13LP;
import X.C1537480q70;
import X.C1544760qIk;
import X.C1544770qIl;
import X.C1544810qIp;
import X.C1544840qIs;
import X.C1544860qIu;
import X.C1544870qIv;
import X.C1544880qIw;
import X.C1544980qJ6;
import X.C189200o6;
import X.C1C7U;
import X.C1E6B;
import X.C1E6N;
import X.C20509081r;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C821850WLv;
import X.C828420Wee;
import X.EnumC1541410qDL;
import X.EnumC1544890qIx;
import X.EnumC993040bws;
import X.InterfaceC1545030qJB;
import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectGlobalConfig;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS3S1500000_23 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c3 A[Catch: all -> 0x02af, TRY_LEAVE, TryCatch #7 {all -> 0x02af, blocks: (B:28:0x014f, B:30:0x015d, B:31:0x0165, B:40:0x017b, B:48:0x01c3, B:49:0x01cf, B:51:0x01d5, B:53:0x01e1, B:56:0x01e8, B:58:0x01f0, B:59:0x01f4, B:61:0x01fa, B:41:0x0190, B:44:0x0198, B:46:0x01ad), top: B:98:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f0 A[Catch: 0ozz -> 0x0214, 0ozZ -> 0x0261, all -> 0x02af, TryCatch #1 {0ozZ -> 0x0261, blocks: (B:49:0x01cf, B:51:0x01d5, B:53:0x01e1, B:56:0x01e8, B:58:0x01f0, B:59:0x01f4, B:61:0x01fa), top: B:90:0x01cf }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0296 A[Catch: all -> 0x02ad, TRY_LEAVE, TryCatch #5 {all -> 0x02ad, blocks: (B:27:0x0128, B:64:0x0208, B:71:0x0215, B:72:0x023c, B:74:0x0242, B:76:0x024f, B:79:0x025c, B:78:0x0259, B:81:0x0262, B:65:0x020c, B:83:0x0296), top: B:94:0x0128, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v49, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0pDK] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.0ozZ] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, X.0ozz, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, X.0ozZ, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.0ozz] */
    /* JADX WARN: Type inference failed for: r2v16, types: [X.0ozz] */
    /* JADX WARN: Type inference failed for: r2v17, types: [X.0ozZ] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.0ozz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS3S1500000_23.LIZ$0():void");
    }

    public final void LIZ$1() {
        Object c098200Yq;
        Object obj;
        WebKitView webKitView;
        C1537480q70 hybridContext;
        if (((WebView) this.l1).getParent() == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1544870qIv c1544870qIv = new C1544870qIv(jCurrentTimeMillis);
        String strLJI = ((AbstractC1544900qIy) this.l2).LJI();
        C1544980qJ6 c1544980qJ6 = c1544870qIv.LIZJ;
        c1544980qJ6.LIZIZ = EnumC1544890qIx.MANUAL;
        c1544980qJ6.LIZ = strLJI;
        c1544980qJ6.LIZLLL = ((WebView) this.l1).getUrl();
        C1544980qJ6 c1544980qJ62 = c1544870qIv.LIZJ;
        ((EnumC993040bws) this.l3).getType();
        c1544980qJ62.getClass();
        c1544870qIv.LJI.LIZ = Integer.valueOf(((EnumC1541410qDL) this.l4).getScope());
        c1544870qIv.LJI.LIZIZ = 1;
        c1544870qIv.LJI.LIZJ = 1;
        try {
            c098200Yq = UriProtector.parse(this.s0);
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
            WebView webView = (WebView) this.l1;
            AbstractC1544900qIy abstractC1544900qIy = (AbstractC1544900qIy) this.l2;
            c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode = IJSInjectCallback$ErrorCode.ERROR_MANUAL_EMPTY_URL;
            C1544870qIv.LIZIZ(c1544870qIv, webView, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode, null, 40);
            abstractC1544900qIy.LJIIIIZZ(iJSInjectCallback$ErrorCode);
            if (C1544770qIl.LIZLLL(strLJI)) {
                int code = iJSInjectCallback$ErrorCode.getCode();
                String url = webView.getUrl();
                if (url == null) {
                    url = "";
                }
                abstractC1544900qIy.LJIIJ(code, C2097908Jt.LIZJ(new Pair("func", "addDocumentJS")), url);
                return;
            }
            return;
        }
        JSInjectGlobalConfig jSInjectGlobalConfigLIZ = C1544810qIp.LIZ();
        if (!jSInjectGlobalConfigLIZ.manualInjectors.contains(((AbstractC1544900qIy) this.l2).LJI())) {
            c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            WebView webView2 = (WebView) this.l1;
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode2 = IJSInjectCallback$ErrorCode.ERROR_MANUAL_PROVIDER_NAME_NOT_FOUND;
            C1544870qIv.LIZIZ(c1544870qIv, webView2, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode2, null, 40);
            ((AbstractC1544900qIy) this.l2).LJIIIIZZ(iJSInjectCallback$ErrorCode2);
            if (C1544770qIl.LIZLLL(strLJI)) {
                AbstractC1544900qIy abstractC1544900qIy2 = (AbstractC1544900qIy) this.l2;
                int code2 = iJSInjectCallback$ErrorCode2.getCode();
                String url2 = ((WebView) this.l1).getUrl();
                if (url2 == null) {
                    url2 = "";
                }
                abstractC1544900qIy2.LJIIJ(code2, C2097608Jq.LJIIIIZZ(new Pair("func", "addDocumentJS"), new Pair("manual_injectors", C13LP.LJJLIIIJ(jSInjectGlobalConfigLIZ.manualInjectors, null, null, null, 0, null, null, 63))), url2);
                return;
            }
            return;
        }
        if (C1544810qIp.LIZLLL(uri, jSInjectGlobalConfigLIZ)) {
            C1544840qIs.LIZJ("Url is block by global inline JS inject. url: " + ((WebView) this.l1).getUrl());
            c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            WebView webView3 = (WebView) this.l1;
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode3 = IJSInjectCallback$ErrorCode.ERROR_MANUAL_GLOBAL_CONFIG_INTERCEPT_URL;
            C1544870qIv.LIZIZ(c1544870qIv, webView3, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode3, null, 40);
            ((AbstractC1544900qIy) this.l2).LJIIIIZZ(iJSInjectCallback$ErrorCode3);
            if (C1544770qIl.LIZLLL(strLJI)) {
                String strLIZ = C20509081r.LIZ(uri);
                Boolean boolValueOf = strLIZ != null ? Boolean.valueOf(jSInjectGlobalConfigLIZ.LIZ(strLIZ)) : null;
                String strLJJLIIIJ = C13LP.LJJLIIIJ(jSInjectGlobalConfigLIZ.blockList, null, null, null, 0, null, null, 63);
                AbstractC1544900qIy abstractC1544900qIy3 = (AbstractC1544900qIy) this.l2;
                int code3 = iJSInjectCallback$ErrorCode3.getCode();
                String url3 = ((WebView) this.l1).getUrl();
                if (url3 == null) {
                    url3 = "";
                }
                abstractC1544900qIy3.LJIIJ(code3, C2097608Jq.LJIIIIZZ(new Pair("func", "addDocumentJS"), new Pair("path", strLIZ), new Pair("is_block", boolValueOf), new Pair("block_list", strLJJLIIIJ)), url3);
                return;
            }
            return;
        }
        JSInjectConfig jSInjectConfigLIZIZ = C1544810qIp.LIZIZ(strLJI, (AbstractC1544900qIy) this.l2, c1544870qIv, true, true);
        if (jSInjectConfigLIZIZ == null) {
            C1544840qIs.LIZLLL("[Manual] Fail for empty JSConfig. JSName: " + strLJI + ", url: " + this.s0);
            c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            WebView webView4 = (WebView) this.l1;
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode4 = IJSInjectCallback$ErrorCode.ERROR_MANUAL_JS_CONFIG_NOT_FOUND;
            C1544870qIv.LIZIZ(c1544870qIv, webView4, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode4, null, 40);
            ((AbstractC1544900qIy) this.l2).LJIIIIZZ(iJSInjectCallback$ErrorCode4);
            if (C1544770qIl.LIZLLL(strLJI)) {
                AbstractC1544900qIy abstractC1544900qIy4 = (AbstractC1544900qIy) this.l2;
                int code4 = iJSInjectCallback$ErrorCode4.getCode();
                String url4 = ((WebView) this.l1).getUrl();
                if (url4 == null) {
                    url4 = "";
                }
                abstractC1544900qIy4.LJIIJ(code4, C2097908Jt.LIZJ(new Pair("func", "addDocumentJS")), url4);
                return;
            }
            return;
        }
        c1544870qIv.LIZJ.LIZJ = Integer.valueOf(jSInjectConfigLIZIZ.businessLine);
        if (((AbstractC1544900qIy) this.l2).LIZIZ(this.s0)) {
            C1544840qIs.LIZJ("reject by business interceptor. URL: " + this.s0 + ", JSName: " + jSInjectConfigLIZIZ.name);
            c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            WebView webView5 = (WebView) this.l1;
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode5 = IJSInjectCallback$ErrorCode.ERROR_MANUAL_JS_PROVIDER_INTERCEPT;
            C1544870qIv.LIZIZ(c1544870qIv, webView5, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode5, null, 40);
            ((AbstractC1544900qIy) this.l2).LJIIIIZZ(iJSInjectCallback$ErrorCode5);
            if (C1544770qIl.LIZLLL(strLJI)) {
                AbstractC1544900qIy abstractC1544900qIy5 = (AbstractC1544900qIy) this.l2;
                int code5 = iJSInjectCallback$ErrorCode5.getCode();
                String url5 = ((WebView) this.l1).getUrl();
                if (url5 == null) {
                    url5 = "";
                }
                abstractC1544900qIy5.LJIIJ(code5, C2097908Jt.LIZJ(new Pair("func", "addDocumentJS")), url5);
                return;
            }
            return;
        }
        int i = C1544880qIw.LIZ;
        String strLIZIZ = C1544880qIw.LIZIZ((WebView) this.l1, jSInjectConfigLIZIZ, (AbstractC1544900qIy) this.l2, c1544870qIv);
        if (strLIZIZ == null) {
            C1544840qIs.LIZLLL("[Manual] Load JSCode fail. JSName: " + strLJI + ", url: " + this.s0);
            c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            WebView webView6 = (WebView) this.l1;
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode6 = IJSInjectCallback$ErrorCode.ERROR_MANUAL_JS_CODE_NOT_FOUND;
            C1544870qIv.LIZIZ(c1544870qIv, webView6, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode6, null, 40);
            ((AbstractC1544900qIy) this.l2).LJIIIIZZ(iJSInjectCallback$ErrorCode6);
            if (C1544770qIl.LIZLLL(strLJI)) {
                AbstractC1544900qIy abstractC1544900qIy6 = (AbstractC1544900qIy) this.l2;
                int code6 = iJSInjectCallback$ErrorCode6.getCode();
                String url6 = ((WebView) this.l1).getUrl();
                if (url6 == null) {
                    url6 = "";
                }
                abstractC1544900qIy6.LJIIJ(code6, C2097908Jt.LIZJ(new Pair("func", "addDocumentJS")), url6);
                return;
            }
            return;
        }
        InterfaceC1545030qJB interfaceC1545030qJB = C1544770qIl.LJ;
        if (interfaceC1545030qJB != null && interfaceC1545030qJB.LIZIZ(this.s0)) {
            C1544840qIs.LIZJ("reject by global interceptor. URL: " + this.s0 + ", JSName: " + jSInjectConfigLIZIZ.name);
            WebView webView7 = (WebView) this.l1;
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode7 = IJSInjectCallback$ErrorCode.ERROR_MANUAL_GLOBAL_INTERCEPT;
            C1544870qIv.LIZIZ(c1544870qIv, webView7, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode7, null, 40);
            ((AbstractC1544900qIy) this.l2).LJIIIIZZ(iJSInjectCallback$ErrorCode7);
            if (C1544770qIl.LIZLLL(strLJI)) {
                AbstractC1544900qIy abstractC1544900qIy7 = (AbstractC1544900qIy) this.l2;
                int code7 = iJSInjectCallback$ErrorCode7.getCode();
                String url7 = ((WebView) this.l1).getUrl();
                if (url7 == null) {
                    url7 = "";
                }
                abstractC1544900qIy7.LJIIJ(code7, C2097908Jt.LIZJ(new Pair("func", "addDocumentJS")), url7);
                return;
            }
            return;
        }
        Pair pairLIZLLL = C1544880qIw.LIZLLL((WebView) this.l1, uri, strLIZIZ, jSInjectConfigLIZIZ, (AbstractC1544900qIy) this.l2, c1544870qIv);
        Object first = pairLIZLLL.getFirst();
        String strLIZIZ2 = (String) pairLIZLLL.getSecond();
        WebView webView8 = (WebView) this.l1;
        Integer numValueOf = (!(webView8 instanceof WebKitView) || (webKitView = (WebKitView) webView8) == null || (hybridContext = webKitView.getHybridContext()) == null) ? null : Integer.valueOf(hybridContext.LJ());
        String str = this.s0;
        WebView webView9 = (WebView) this.l1;
        SparkSecurityJSInjectionService sparkSecurityJSInjectionService = (SparkSecurityJSInjectionService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelJSExecution);
        c828420Wee.LJFF.put("dataflowId", Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
        c828420Wee.LJFF.put("URL", str);
        c828420Wee.LJFF.put("inject_script", strLIZIZ);
        c828420Wee.LJFF.put("engine_view", webView9);
        c828420Wee.LJFF.put("inject_config", jSInjectConfigLIZIZ);
        c828420Wee.LJFF.put("is_iframe_scene", Boolean.TRUE);
        c828420Wee.LJFF.put("is_iframe", Boolean.FALSE);
        Map<String, Object> map = c828420Wee.LJFF;
        if (str == null) {
            str = "";
        }
        map.put("main_frame_url", str);
        c828420Wee.LJFF.put("inject_params", first);
        C821850WLv c821850WLvHandleInitScriptByJSInjectSDKWithEvent = sparkSecurityJSInjectionService.handleInitScriptByJSInjectSDKWithEvent(c828420Wee);
        if (c821850WLvHandleInitScriptByJSInjectSDKWithEvent != null && c821850WLvHandleInitScriptByJSInjectSDKWithEvent.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reject by spark security solution. URL: ");
            sbLIZ.append(this.s0);
            sbLIZ.append(", JSName: ");
            sbLIZ.append(jSInjectConfigLIZIZ.name);
            C1544840qIs.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), null);
            c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            WebView webView10 = (WebView) this.l1;
            IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode8 = IJSInjectCallback$ErrorCode.ERROR_MANUAL_SECURITY_INTERCEPT;
            Map<?, ?> map2 = c821850WLvHandleInitScriptByJSInjectSDKWithEvent.LIZIZ;
            C1544870qIv.LIZIZ(c1544870qIv, webView10, false, "js_inject_manage_client", null, iJSInjectCallback$ErrorCode8, (map2 == null || (obj = map2.get("error")) == null) ? null : obj.toString(), 8);
            ((AbstractC1544900qIy) this.l2).LJIIIIZZ(iJSInjectCallback$ErrorCode8);
            if (C1544770qIl.LIZLLL(strLJI)) {
                AbstractC1544900qIy abstractC1544900qIy8 = (AbstractC1544900qIy) this.l2;
                int code8 = iJSInjectCallback$ErrorCode8.getCode();
                String url8 = ((WebView) this.l1).getUrl();
                if (url8 == null) {
                    url8 = "";
                }
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("func", "addDocumentJS");
                Map<?, ?> map3 = c821850WLvHandleInitScriptByJSInjectSDKWithEvent.LIZIZ;
                pairArr[1] = new Pair("error_message", String.valueOf(map3 != null ? map3.get("error") : null));
                abstractC1544900qIy8.LJIIJ(code8, C2097608Jq.LJIIIIZZ(pairArr), url8);
                return;
            }
            return;
        }
        ((WebView) this.l1).setTag(R.id.vsq, jSInjectConfigLIZIZ.name);
        if (((EnumC993040bws) this.l3) == EnumC993040bws.ADD_DOCUMENT_JS_LOADED) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("\n                        (function(){ \n                            function runAfterOnLoad(){\n                              ");
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append("\n                            } \n                            if (document.readyState === 'complete') { \n                              runAfterOnLoad(); \n                            } else {\n                              window.addEventListener('load', runAfterOnLoad); \n                            } \n                         })();\n                    ");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        C1544860qIu c1544860qIu = C1544760qIk.LIZ;
        WebView webView11 = (WebView) this.l1;
        Set set = (Set) this.l5;
        String str2 = jSInjectConfigLIZIZ.name;
        EnumC1541410qDL enumC1541410qDL = (EnumC1541410qDL) this.l4;
        c1544860qIu.getClass();
        C1544860qIu.LIZ(webView11, strLIZIZ2, uri, set, str2, enumC1541410qDL);
        ((WebView) this.l1).setTag(R.id.vsq, "");
        c1544870qIv.LIZIZ = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        C1544870qIv.LIZIZ(c1544870qIv, (WebView) this.l1, true, "js_inject_manage_client", null, null, null, 56);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[Manual] Success inject js using ");
        sbLIZ3.append((EnumC993040bws) this.l3);
        sbLIZ3.append(", frame_scope:");
        sbLIZ3.append((EnumC1541410qDL) this.l4);
        sbLIZ3.append(". JSName: ");
        sbLIZ3.append(strLJI);
        sbLIZ3.append(", Url: ");
        sbLIZ3.append(this.s0);
        C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static final void run$0(ARunnableS3S1500000_23 aRunnableS3S1500000_23) {
        boolean zLIZ;
        C1C7U.LIZ("XDownloadFileMethod@208.handleDownloadFile$2");
        try {
            aRunnableS3S1500000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XDownloadFileMethod@208.handleDownloadFile$2");
    }

    public static final void run$1(ARunnableS3S1500000_23 aRunnableS3S1500000_23) {
        boolean zLIZ;
        C1C7U.LIZ("WebViewJSInjectSDK@d5d4.addDocumentJS$1");
        try {
            aRunnableS3S1500000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WebViewJSInjectSDK@d5d4.addDocumentJS$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS3S1500000_23(Object obj, WebView webView, AbstractC1544900qIy abstractC1544900qIy, EnumC993040bws enumC993040bws, EnumC1541410qDL enumC1541410qDL, String str, Set<String> set) {
        this.$t = set;
        this.l1 = obj;
        this.l2 = webView;
        this.l3 = abstractC1544900qIy;
        this.l4 = enumC993040bws;
        this.s0 = enumC1541410qDL;
        this.l5 = str;
    }
}
