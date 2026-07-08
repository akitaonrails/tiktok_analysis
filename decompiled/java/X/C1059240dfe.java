package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorPureService;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hybridkit.experiment.EnableGlobalpropsDesensitizationSettings;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059240dfe implements InterfaceC1536300q56 {
    public static final C1059240dfe LIZ = new C1059240dfe();

    public static void LJ(SparkContext sparkContext) {
        sparkContext.LJJIII(InterfaceC1059280dfi.class);
        sparkContext.LJJIII(C1543000qFu.class);
        sparkContext.LJJIII(C1051660dTQ.class);
        sparkContext.LJJIII(C1059860dge.class);
        sparkContext.LJJIII(C1075770e6J.class);
    }

    public static void LIZLLL(SparkContext sparkContext, Map map, C13BV c13bv) {
        for (Map.Entry entry : map.entrySet()) {
            if (!c13bv.contains(entry.getKey())) {
                sparkContext.LJJJZ((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[PHI: r1
      0x0018: PHI (r1v2 boolean) = (r1v1 boolean), (r1v4 boolean), (r1v4 boolean) binds: [B:14:0x0020, B:7:0x0010, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1536300q56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C1537480q70 r3, X.InterfaceC1541510qDV r4, android.webkit.WebView r5, android.webkit.WebResourceRequest r6) {
        /*
            r2 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L1f
            if (r6 == 0) goto L1f
            boolean r1 = r6.isRedirect()
        Lc:
            android.net.Uri r0 = r6.getUrl()
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L1a
        L18:
            java.lang.String r0 = ""
        L1a:
            boolean r0 = LJFF(r4, r0, r1, r3, r5)
            return r0
        L1f:
            r1 = 0
            if (r6 == 0) goto L18
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1059240dfe.LIZ(X.0q70, X.0qDV, android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    @Override // X.InterfaceC1536300q56
    public final boolean LIZIZ(C1537480q70 c1537480q70, InterfaceC1541510qDV interfaceC1541510qDV, WebView webView, String str) {
        if (str == null) {
            str = "";
        }
        return LJFF(interfaceC1541510qDV, str, false, c1537480q70, webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, java.lang.String] */
    @Override // X.InterfaceC1536300q56
    public final void LIZJ(C1537480q70 c1537480q70, InterfaceC1541510qDV interfaceC1541510qDV, WebView webView, String str) throws JSONException {
        ISparkHostApi iSparkHostApi;
        boolean z;
        SparkHostApiImpl sparkHostApiImplLLIIJI;
        SparkHostApiImpl sparkHostApiImplLLIIJI2;
        SparkHostApiImpl sparkHostApiImplLLIIJI3;
        InterfaceC1059260dfg interfaceC1059260dfgLJIIIIZZ;
        Map<String, Object> map;
        InterfaceC1059260dfg interfaceC1059260dfgLJIIIIZZ2;
        if ((interfaceC1541510qDV == null || !interfaceC1541510qDV.LIZJ()) && 0 == 0) {
            if (webView instanceof WebKitView) {
                C828310WeT c828310WeT = (C828310WeT) c1537480q70.LJFF(C828310WeT.class);
                if (c828310WeT != null) {
                    c828310WeT.LIZIZ = str;
                }
                if (EnableGlobalpropsDesensitizationSettings.LIZIZ(str)) {
                    List<String> listLIZ = EnableGlobalpropsDesensitizationSettings.LIZ(str);
                    if (interfaceC1541510qDV != null && (interfaceC1059260dfgLJIIIIZZ2 = interfaceC1541510qDV.LJIIIIZZ()) != null) {
                        interfaceC1059260dfgLJIIIIZZ2.LIZ((InterfaceC1541990qEH) webView, listLIZ);
                    }
                } else if (interfaceC1541510qDV != null && (interfaceC1059260dfgLJIIIIZZ = interfaceC1541510qDV.LJIIIIZZ()) != null) {
                    InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) webView;
                    if (c828310WeT != null) {
                        map = c828310WeT.LIZ;
                    } else {
                        map = null;
                    }
                    interfaceC1059260dfgLJIIIIZZ.LIZJ(interfaceC1541990qEH, map);
                }
            }
            if ((webView instanceof WebKitView) && (c1537480q70 instanceof SparkContext) && str != null && u.LJJIIJZLJL(str, "http", false)) {
                WebKitView webKitView = (WebKitView) webView;
                int iLJ = webKitView.getHybridContext().LJ();
                SparkContext sparkContext = (SparkContext) c1537480q70;
                C1059200dfa.LIZ.getClass();
                if (!C1059200dfa.LIZ(sparkContext, str) || ((iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null && (sparkHostApiImplLLIIJI3 = iSparkHostApi.LLIIJI()) != null && sparkHostApiImplLLIIJI3.LLJLLL(sparkContext, str))) {
                    IHybridMonitorPureService iHybridMonitorPureService = (IHybridMonitorPureService) PluggableExtentionKt.pluggableSpi$default(IHybridMonitorPureService.class, false, false, false, 14, null);
                    if (iHybridMonitorPureService != null) {
                        iHybridMonitorPureService.notifySparkWebViewEvent(str, webView);
                        return;
                    }
                    return;
                }
                ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi2 != null) {
                    SparkHostApiImpl sparkHostApiImplLLIIJI4 = iSparkHostApi2.LLIIJI();
                    if (sparkHostApiImplLLIIJI4 != null && sparkHostApiImplLLIIJI4.LLLIILIL(iLJ) && (sparkHostApiImplLLIIJI2 = iSparkHostApi2.LLIIJI()) != null && sparkHostApiImplLLIIJI2.LLJLIL()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((iSparkHostApi2 != null && (sparkHostApiImplLLIIJI = iSparkHostApi2.LLIIJI()) != null && sparkHostApiImplLLIIJI.LLLIL()) || z) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Scene.SCENE_SERVICE, "isolation_onpagestarted");
                        jSONObject.put("url", a0.LJJZ(str, "?", str));
                        jSONObject.put("isolationSetting", z);
                        jSONObject.put("dataflowId", iLJ);
                        C793770VBv.LJII("pns_hybrid_dm_shutdown", jSONObject, null, null);
                        if (z) {
                            String str2 = "aweme://webview?url=" + Uri.encode(str);
                            new LinkedHashMap();
                            Uri uriLJ = C1537540q76.LJ(sparkContext.LJJIL());
                            Map<String, String> mapLJJJ = sparkContext.LJJJ();
                            String string = C1059200dfa.LIZIZ(uriLJ, mapLJJJ, str, C13BV.INSTANCE).toString();
                            Map<String, String> mapLIZJ = C08RQ.LIZJ(c1537480q70.containerId);
                            boolean z2 = !Intrinsics.LJFF(mapLIZJ.get("show_closeall"), CardStruct.IStatusCode.DEFAULT);
                            SparkContext sparkContext2 = new SparkContext();
                            if (c1537480q70 instanceof SparkContext) {
                                SparkContext sparkContext3 = (SparkContext) c1537480q70;
                                Bundle bundle = sparkContext3.bundle;
                                if (bundle != null) {
                                    sparkContext2.LJJJJL(bundle);
                                }
                                int iLJ2 = sparkContext3.LJ();
                                if (iLJ2 == 0) {
                                    ISparkHostApi iSparkHostApi3 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                                    if (iSparkHostApi3 != null && iSparkHostApi3.LLIL() != null) {
                                        iLJ2 = 402685958;
                                    } else {
                                        iLJ2 = 0;
                                    }
                                }
                                sparkContext2.bizCert = new ThirdPartyBizCert(iLJ2);
                            }
                            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                            C1161970gLL.LIZIZ().LIZIZ(c1537480q70.containerId, sparkContext2.containerId);
                            LJ(sparkContext2);
                            final C259800zU c259800zU = new C259800zU();
                            ?? r9 = mapLIZJ.get("__spark_session_id");
                            c259800zU.element = r9;
                            CharSequence charSequence = (CharSequence) r9;
                            if (charSequence == null || charSequence.length() == 0) {
                                c259800zU.element = c1537480q70.containerId;
                            }
                            ISparkHostApi iSparkHostApi4 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                            if (iSparkHostApi4 != null && iSparkHostApi4.LLIIJI() != null) {
                                C1051980dTw.LIZ((String) c259800zU.element, sparkContext2.containerId);
                            }
                            sparkContext2.LJJLIIJ(string);
                            C1059240dfe c1059240dfe = LIZ;
                            C13BV c13bv = C13BV.INSTANCE;
                            c1059240dfe.getClass();
                            LIZLLL(sparkContext2, mapLJJJ, c13bv);
                            sparkContext2.LJJJZ("skip_sec_link_first_jump", "1");
                            String str3 = mapLIZJ.get("need_sec_link");
                            String str4 = "";
                            if (str3 == null) {
                                str3 = "";
                            }
                            sparkContext2.LJJJZ("need_sec_link", str3);
                            String str5 = mapLIZJ.get("sec_link_scene");
                            if (str5 != null) {
                                str4 = str5;
                            }
                            sparkContext2.LJJJZ("sec_link_scene", str4);
                            sparkContext2.LJJ(InterfaceC1541510qDV.class, C1059250dff.LIZ());
                            sparkContext2.LJJJLIIL(C1059270dfh.LL);
                            sparkContext2.LJJJZ("transition_animation", "none");
                            sparkContext2.LJJJZ("__jump_from_override", "1");
                            sparkContext2.LJJ(InterfaceC1059290dfj.class, new InterfaceC1059290dfj() { // from class: X.0dfb
                                @Override // X.InterfaceC1059290dfj
                                public final void LIZ(SparkPopup sparkPopup) {
                                    String str6;
                                    ISparkHostApi iSparkHostApi5 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                                    if (iSparkHostApi5 != null && iSparkHostApi5.LLIIJI() != null) {
                                        String str7 = c259800zU.element;
                                        String str8 = "";
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        SparkContext sparkContext4 = sparkPopup.LLJIJIL;
                                        if (sparkContext4 != null && (str6 = sparkContext4.containerId) != null) {
                                            str8 = str6;
                                        }
                                        C1051980dTw.LIZJ(str7, str8);
                                    }
                                }
                            });
                            String str6 = (String) c259800zU.element;
                            if (str6 != null) {
                                sparkContext2.LJJJZ("__spark_session_id", str6);
                            }
                            if (z2) {
                                sparkContext2.LJJJZ("show_closeall", "1");
                            }
                            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                            Context context = webKitView.getContext();
                            c1537900q7g.getClass();
                            new C1541950qED(context, sparkContext2).LIZIZ();
                            C1529880puk c1529880puk = SparkContext.Companion;
                            String str7 = c1537480q70.containerId;
                            c1529880puk.getClass();
                            InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str7);
                            if (interfaceC1059280dfiLIZ == null) {
                                return;
                            }
                            interfaceC1059280dfiLIZ.m3(false);
                            return;
                        }
                    }
                }
            }
        }
        IHybridMonitorPureService iHybridMonitorPureService2 = (IHybridMonitorPureService) PluggableExtentionKt.pluggableSpi$default(IHybridMonitorPureService.class, false, false, false, 14, null);
        if (iHybridMonitorPureService2 != null) {
            iHybridMonitorPureService2.notifySparkWebViewEvent(str, webView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0286  */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(X.InterfaceC1541510qDV r35, java.lang.String r36, boolean r37, X.C1537480q70 r38, android.webkit.WebView r39) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1059240dfe.LJFF(X.0qDV, java.lang.String, boolean, X.0q70, android.webkit.WebView):boolean");
    }
}
