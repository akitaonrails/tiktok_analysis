package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.forest.Forest;
import com.bytedance.hybrid.spark.pia.PiaFetcher;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533070pzt extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public InterfaceC1533080pzu LLIZ;
    public final C1533110pzx LLIZLLLIL = new C1ET3() { // from class: X.0pzx
        @Override // X.C1ET3
        public final void LJI() {
            InterfaceC1533080pzu interfaceC1533080pzu = this.LL.LLIZ;
            if (interfaceC1533080pzu != null) {
                interfaceC1533080pzu.onDestroy();
            }
            super.LJI();
        }

        @Override // X.AbstractC1541670qDl
        public final /* bridge */ /* synthetic */ AbstractC1541650qDj getExtension() {
            return this.LL;
        }

        @Override // X.C1ET3
        public final void LJJII(String str) {
            InterfaceC1533080pzu interfaceC1533080pzu;
            if (str != null && (interfaceC1533080pzu = this.LL.LLIZ) != null) {
                interfaceC1533080pzu.LJJ(str);
            }
            super.LJJII(str);
        }

        @Override // X.C1ET3
        public final void LJJIII(String str, Map<String, String> map) {
            InterfaceC1533080pzu interfaceC1533080pzu;
            if (str != null && (interfaceC1533080pzu = this.LL.LLIZ) != null) {
                interfaceC1533080pzu.LJJ(str);
            }
            super.LJJIII(str, map);
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0XGV] */
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
    @Override // X.AbstractC1541650qDj
    public final void LIZJ() throws JSONException {
        WebKitView webKitView;
        Forest forest;
        C2204031BNx c2204031BNxLIZJ;
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), new AbstractC1541650qDj<C2205951BVh>(this) { // from class: X.0pzw
            public final C1533090pzv LLIZ;

            @Override // X.AbstractC1541650qDj
            public final void LIZJ() {
                LJ("onPageStarted", this.LLIZ, 7000);
                LJ("shouldOverrideUrlLoading", this.LLIZ, 7000);
                LIZLLL("onPageFinished", this.LLIZ);
                LJ("shouldInterceptRequest", this.LLIZ, 7000);
                LIZLLL("onReceivedError", this.LLIZ);
                LIZLLL("onReceivedHttpError", this.LLIZ);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0pzv] */
            {
                this.LLIZ = new AbstractC2205961BVi() { // from class: X.0pzv
                    @Override // X.AbstractC1541670qDl
                    public final /* bridge */ /* synthetic */ AbstractC1541650qDj getExtension() {
                        return this.LL;
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onPageFinished(WebView webView, String str) {
                        InterfaceC1533080pzu interfaceC1533080pzu;
                        if (str != null && (interfaceC1533080pzu = this.LLIZ) != null) {
                            interfaceC1533080pzu.LJJIZ();
                        }
                        super.onPageFinished(webView, str);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, final WebResourceRequest webResourceRequest) throws JSONException {
                        InterfaceC1533080pzu interfaceC1533080pzu;
                        InterfaceC1533080pzu interfaceC1533080pzu2;
                        InterfaceC1532650pzD interfaceC1532650pzDLJI;
                        if (webResourceRequest != null && (interfaceC1533080pzu = this.LLIZ) != null && interfaceC1533080pzu.LIZLLL(webResourceRequest.getUrl()) && (interfaceC1533080pzu2 = this.LLIZ) != null) {
                            InterfaceC1535470q3l interfaceC1535470q3l = new InterfaceC1535470q3l() { // from class: X.0pzz
                                @Override // X.InterfaceC1535470q3l
                                public final Map<String, String> getRequestHeaders() {
                                    return webResourceRequest.getRequestHeaders();
                                }

                                @Override // X.InterfaceC1535470q3l
                                public final Uri getUrl() {
                                    return webResourceRequest.getUrl();
                                }

                                @Override // X.InterfaceC1535470q3l
                                public final boolean isForMainFrame() {
                                    return webResourceRequest.isForMainFrame();
                                }
                            };
                            if (webView instanceof WebKitView) {
                                JSONArray jSONArray = C1533710q0v.LIZ;
                                WebKitView webKitView2 = (WebKitView) webView;
                                if (C1533710q0v.LIZIZ(webKitView2.getHybridContext(), false) == null && (interfaceC1532650pzDLJI = interfaceC1533080pzu2.LJI(interfaceC1535470q3l)) != null) {
                                    C1537480q70 hybridContext = webKitView2.getHybridContext();
                                    if (interfaceC1532650pzDLJI.LIZJ() == EnumC1535440q3i.Offline) {
                                        hybridContext.templateResData.put("res_from", "gecko");
                                    } else {
                                        hybridContext.templateResData.put("res_from", "cdn");
                                    }
                                    webKitView2.U0(C2097908Jt.LIZJ(new Pair("templateResData", hybridContext.templateResData)));
                                    WebResourceResponse webResourceResponse = new WebResourceResponse(interfaceC1532650pzDLJI.getMimeType(), interfaceC1532650pzDLJI.LIZIZ(), interfaceC1532650pzDLJI.getData());
                                    webResourceResponse.setResponseHeaders(interfaceC1532650pzDLJI.getHeaders());
                                    return webResourceResponse;
                                }
                            }
                        }
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                        InterfaceC1533080pzu interfaceC1533080pzu;
                        if (webResourceRequest != null && webResourceRequest.isForMainFrame() && (interfaceC1533080pzu = this.LLIZ) != null) {
                            interfaceC1533080pzu.LIZJ(webResourceRequest.getUrl().toString());
                        }
                        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        return super.shouldInterceptRequest(webView, str);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        InterfaceC1533080pzu interfaceC1533080pzu;
                        if (str != null && (interfaceC1533080pzu = this.LLIZ) != null) {
                            interfaceC1533080pzu.LIZ();
                        }
                        super.onPageStarted(webView, str, bitmap);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            if (webResourceError == null) {
                                InterfaceC1533080pzu interfaceC1533080pzu = this.LLIZ;
                                if (interfaceC1533080pzu != null) {
                                    interfaceC1533080pzu.LIZIZ();
                                }
                            } else {
                                InterfaceC1533080pzu interfaceC1533080pzu2 = this.LLIZ;
                                if (interfaceC1533080pzu2 != null) {
                                    webResourceError.getErrorCode();
                                    webResourceError.getDescription().toString();
                                    interfaceC1533080pzu2.LIZIZ();
                                }
                            }
                        }
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            if (webResourceResponse == null) {
                                InterfaceC1533080pzu interfaceC1533080pzu = this.LLIZ;
                                if (interfaceC1533080pzu != null) {
                                    interfaceC1533080pzu.LIZIZ();
                                }
                            } else {
                                InterfaceC1533080pzu interfaceC1533080pzu2 = this.LLIZ;
                                if (interfaceC1533080pzu2 != null) {
                                    webResourceResponse.getStatusCode();
                                    webResourceResponse.getReasonPhrase();
                                    interfaceC1533080pzu2.LIZIZ();
                                }
                            }
                        }
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                    }
                };
            }
        });
        LJ("loadUrl", this.LLIZLLLIL, 8000);
        LJ("destroy", this.LLIZLLLIL, 2000);
        C0V1Y c0v1yLIZ = LIZ();
        C2204031BNx c2204031BNx = null;
        if (!(c0v1yLIZ instanceof WebKitView) || (webKitView = (WebKitView) c0v1yLIZ) == null) {
            return;
        }
        InterfaceC1533190q05 interfaceC1533190q05 = (InterfaceC1533190q05) C1963807me.LIZ(InterfaceC1533190q05.class);
        if (interfaceC1533190q05 != null && (c2204031BNxLIZJ = interfaceC1533190q05.LIZJ(new C1530150pvB(webKitView.getHybridContext(), webKitView.getInitParams()))) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hybrid_module", "pia");
            jSONObject.put("infra_service", "vmsdk");
            C1520360pfO c1520360pfO = new C1520360pfO("bd_hybrid_monitor_infra_service");
            c1520360pfO.LIZLLL = jSONObject;
            c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
            c1520360pfO.LJIIIIZZ = webKitView.getHybridContext().containerId;
            C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
            C1520200pf8.LIZ.getClass();
            C1520200pf8.LIZ(c1520350pfNLIZ);
            c2204031BNx = c2204031BNxLIZJ;
        }
        this.LLIZ = c2204031BNx;
        if (c2204031BNx != null) {
            c2204031BNx.LJIIIIZZ(webKitView);
        }
        webKitView.getHybridContext().LJJ(InterfaceC1533080pzu.class, this.LLIZ);
        InterfaceC1533080pzu interfaceC1533080pzu = this.LLIZ;
        if (interfaceC1533080pzu != 0) {
            interfaceC1533080pzu.LJ(new C0XGW() { // from class: X.0XGV
                @Override // X.C0XGW
                public final void LIZ(String str, String str2) throws JSONException {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", str);
                    jSONObject2.put("name", str2);
                    C1520360pfO c1520360pfO2 = new C1520360pfO("pia_downgrade_call");
                    c1520360pfO2.LIZIZ = "hybridkit_default_bid";
                    c1520360pfO2.LJIIJJI = EnumC993170bx5.Both;
                    c1520360pfO2.LIZLLL = jSONObject2;
                    C1520350pfN c1520350pfNLIZ2 = c1520360pfO2.LIZ();
                    C1520380pfQ.LIZ.getClass();
                    C1520380pfQ.LIZ(c1520350pfNLIZ2);
                }
            });
        }
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(webKitView.getHybridContext(), false);
        if (iResourceServiceXLIZIZ != null && (forest = iResourceServiceXLIZIZ.getForest()) != null) {
            forest.registerCustomFetcher("pia", PiaFetcher.class);
        }
        C1529330ptr.LIZIZ.put("pia", C1532500pyy.LIZ);
    }
}
