package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.container.SparkThirdWebViewInner;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.tiktok.security.OptIABUAExp;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BHX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BHX extends FrameLayout implements C1BHL, InterfaceC1051240dSk, SharedPreferences.OnSharedPreferenceChangeListener {
    public boolean LL;
    public View LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ;
    public InterfaceC1163110gNB LLILZIL;
    public InterfaceC1542250qEh LLILZLL;
    public final FrameLayout LLIZ;
    public final TextView LLIZLLLIL;
    public final SparkThirdWebViewInner LLJ;
    public InterfaceC1542320qEo LLJI;
    public C2202311BHh LLJIJIL;
    public SparkThirdContext LLJILJIL;
    public C1B2Y LLJILJILJ;
    public View LLJILLL;
    public WebChromeClient.CustomViewCallback LLJJ;
    public Integer LLJJI;
    public String LLJJIII;
    public final Map<String, String> LLJJIJI;
    public final C1BHZ LLJJIJIIJIL;

    public C1BHX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2202291BHf c2202291BHfLJIIIZ;
        LIZLLL(false);
        super.onDetachedFromWindow();
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            C1537570q79.LIZ().unregisterOnSharedPreferenceChangeListener(this);
        }
        C1BHO c1bho = C1554300qY8.LIZ;
        if (c1bho != null && (c2202291BHfLJIIIZ = c1bho.LJIIIZ()) != null) {
            c2202291BHfLJIIIZ.LIZIZ();
        }
        this.LLJILJIL = null;
    }

    @Override // X.C1BHH
    public final boolean LIZIZ() {
        SparkThirdWebViewInner sparkThirdWebViewInner = this.LLJ;
        if (!canGoBack() || sparkThirdWebViewInner == null) {
            return false;
        }
        C1B2Y c1b2y = this.LLJILJILJ;
        if (c1b2y != null && c1b2y.LIZJ()) {
            return true;
        }
        sparkThirdWebViewInner.goBack();
        return true;
    }

    public final void LJI() {
        if (this.LLILZIL != null) {
            LJIIIIZZ();
            InterfaceC1163110gNB interfaceC1163110gNB = this.LLILZIL;
            if (interfaceC1163110gNB != null) {
                View viewLJJJLIIL = interfaceC1163110gNB.LJJJLIIL(this);
                this.LLILLL = viewLJJJLIIL;
                LJ(viewLJJJLIIL);
                View view = this.LLILLL;
                if (view != null) {
                    C786410Ut5.LJJJJIZL(this.LLIZ);
                    this.LLIZ.addView(view);
                    C786410Ut5.LJZ(0, this.LLIZ);
                }
            }
        }
    }

    public final void LJII() {
        InterfaceC1542250qEh interfaceC1542250qEh = this.LLILZLL;
        if (interfaceC1542250qEh != null) {
            interfaceC1542250qEh.setProgress(10);
        }
        InterfaceC1163110gNB interfaceC1163110gNB = this.LLILZIL;
        if (interfaceC1163110gNB != null) {
            LJIIIIZZ();
            C786410Ut5.LJJJJIZL(this.LLIZ);
            C786410Ut5.LJZ(8, this.LLIZ);
            View viewLJJL = interfaceC1163110gNB.LJJL();
            this.LLILLJJLI = viewLJJL;
            LJ(viewLJJL);
            View view = this.LLILLJJLI;
            if (view != null) {
                this.LLIZ.addView(view);
                C786410Ut5.LJZ(0, this.LLIZ);
            }
        }
    }

    public final void LJIIIIZZ() {
        if (this.LLILZ) {
            return;
        }
        InterfaceC1163110gNB interfaceC1163110gNB = this.LLILZIL;
        if (interfaceC1163110gNB != null) {
            interfaceC1163110gNB.LJIIJ(getContext());
        }
        this.LLILZ = true;
    }

    public final void LJIIIZ() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            C786410Ut5.LLIL(this.LLIZLLLIL, (C1161970gLL.LIZIZ().LIZ && C1537570q79.LIZ().getBoolean("enable_spark_debug_label", true)) ? 0 : 8);
            this.LLIZLLLIL.setText("spark third");
        }
    }

    @Override // X.C1BHH
    public final boolean canGoBack() {
        return this.LLJILJILJ == null ? this.LLJ.canGoBack() : this.LLJ.canGoBack() && this.LLJILJILJ.canGoBack();
    }

    @Override // X.C1BHH
    public final void reload() {
        SparkThirdContext sparkThirdContext = this.LLJILJIL;
        if (sparkThirdContext == null) {
            return;
        }
        String str = this.LLJJIII;
        if (str == null && (str = sparkThirdContext.url) == null) {
            return;
        }
        sparkThirdContext.url = str;
        LIZ(sparkThirdContext);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            C1537570q79.LIZ().registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        reload();
    }

    public static void LJ(View view) {
        if (view != null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    @Override // X.C1BHL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.hybrid.spark.third.router.SparkThirdContext r9) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BHX.LIZ(com.bytedance.hybrid.spark.third.router.SparkThirdContext):void");
    }

    public final void LIZLLL(boolean z) {
        WebChromeClient.CustomViewCallback customViewCallback;
        Activity activity;
        Window window;
        View decorView;
        View view = this.LLJILLL;
        if (view == null) {
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
        removeView(view);
        this.LLJILLL = null;
        SparkThirdWebViewInner sparkThirdWebViewInner = this.LLJ;
        int visibility = sparkThirdWebViewInner.getVisibility();
        sparkThirdWebViewInner.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, sparkThirdWebViewInner);
        Context context = getContext();
        if ((context instanceof Activity) && (activity = (Activity) context) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Integer num = this.LLJJI;
            if (num != null) {
                decorView.setSystemUiVisibility(num.intValue());
            }
            this.LLJJI = null;
        }
        if (z && (customViewCallback = this.LLJJ) != null) {
            customViewCallback.onCustomViewHidden();
        }
        this.LLJJ = null;
    }

    public final void LJFF(String str) throws JSONException {
        C1BHS c1bhsLJIIIIZZ;
        boolean z;
        SparkThirdContext sparkThirdContext = this.LLJILJIL;
        if (sparkThirdContext == null) {
            return;
        }
        C1BHT c1bht = sparkThirdContext.performanceState;
        long j = c1bht.LIZLLL;
        if (j != 0 && c1bht.LIZ != 0) {
            c1bht.LIZLLL = 0L;
            C1BHO c1bho = C1554300qY8.LIZ;
            if (c1bho != null && (c1bhsLJIIIIZZ = c1bho.LJIIIIZZ()) != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                String str2 = this.LLJJIII;
                if (str2 == null) {
                    str2 = sparkThirdContext.url;
                }
                boolean zLJJIIZI = a0.LJJIIZI(str2, "tiktoklinksafety", true);
                int i = 0;
                if (zLJJIIZI) {
                    z = false;
                } else {
                    z = !c1bht.LIZJ;
                    c1bht.LIZJ = true;
                }
                EnumC1152590g6D enumC1152590g6D = EnumC1152590g6D.URL_LOAD_FINISH;
                JSONObject jSONObjectPut = new JSONObject().put("is_first_jump", z).put("result", str).put("reason", c1bht.LJ).put("duration", jUptimeMillis - j).put("total_duration", jUptimeMillis - c1bht.LIZ).put("is_seclink_url", zLJJIIZI);
                ThirdPartyBizCert thirdPartyBizCert = sparkThirdContext.bizCert;
                if (thirdPartyBizCert != null) {
                    i = thirdPartyBizCert.dataflowId;
                }
                c1bhsLJIIIIZZ.LIZ(enumC1152590g6D, jSONObjectPut.put("dataflowId", String.valueOf(i)));
            }
        }
    }

    @Override // X.C1BHL
    public void setLoadCallback(C2202311BHh c2202311BHh) {
        this.LLJIJIL = c2202311BHh;
    }

    @Override // X.C1BHL
    public void setWebTitleCallback(InterfaceC1542320qEo interfaceC1542320qEo) {
        this.LLJI = interfaceC1542320qEo;
    }

    public final void LIZJ(int i, String str) {
        C1BHT c1bht;
        String strLIZIZ;
        SparkThirdContext sparkThirdContext = this.LLJILJIL;
        if (sparkThirdContext == null || (c1bht = sparkThirdContext.performanceState) == null || c1bht.LJ != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("code=");
        sbLIZ.append(i);
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(", msg=");
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        c1bht.LJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (Intrinsics.LJFF(str, "enable_spark_debug_label")) {
            LJIIIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.1BHZ, android.webkit.WebViewClient] */
    public C1BHX(Context context, AttributeSet attributeSet, int i) {
        Integer numValueOf;
        String strLIZJ;
        C1537480q70 hybridContext;
        C2202291BHf c2202291BHfLJIIIZ;
        Map<String, String> mapLIZIZ;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C1BHO c1bho = C1554300qY8.LIZ;
        this.LLJJIJI = (c1bho == null || (mapLIZIZ = c1bho.LIZIZ()) == null) ? new LinkedHashMap<>() : mapLIZIZ;
        ?? r5 = new C1BHY() { // from class: X.1BHZ
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) throws JSONException {
                String str2;
                InterfaceC2202301BHg interfaceC2202301BHg;
                super.onPageFinished(webView, str);
                C1BHX c1bhx = this.LIZJ;
                boolean z = c1bhx.LL;
                if (c1bhx.LLILZIL != null) {
                    c1bhx.LJIIIIZZ();
                    if (!z) {
                        C786410Ut5.LJJJJIZL(c1bhx.LLIZ);
                        C786410Ut5.LJZ(8, c1bhx.LLIZ);
                        InterfaceC1542250qEh interfaceC1542250qEh = c1bhx.LLILZLL;
                        if (interfaceC1542250qEh != null) {
                            interfaceC1542250qEh.setProgress(100);
                        }
                    }
                }
                InterfaceC1542250qEh interfaceC1542250qEh2 = this.LIZJ.LLILZLL;
                if (interfaceC1542250qEh2 != null) {
                    interfaceC1542250qEh2.LIZ(false);
                }
                C2202311BHh c2202311BHh = this.LIZJ.LLJIJIL;
                if (c2202311BHh != null) {
                    c2202311BHh.LIZIZ(str);
                }
                SparkThirdContext sparkThirdContext = this.LIZJ.LLJILJIL;
                if (sparkThirdContext != null && (interfaceC2202301BHg = sparkThirdContext.callback) != null) {
                    interfaceC2202301BHg.LIZIZ(str);
                }
                C1BHX c1bhx2 = this.LIZJ;
                if (c1bhx2.LL) {
                    str2 = "fail";
                } else {
                    str2 = "success";
                }
                c1bhx2.LJFF(str2);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                String str2;
                C2202271BHd c2202271BHd;
                InterfaceC2202301BHg interfaceC2202301BHg;
                C1BHT c1bht;
                super.onPageStarted(webView, str, bitmap);
                C1BHX c1bhx = this.LIZJ;
                if (str == null) {
                    SparkThirdContext sparkThirdContext = c1bhx.LLJILJIL;
                    if (sparkThirdContext != null) {
                        str2 = sparkThirdContext.url;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = str;
                }
                c1bhx.LLJJIII = str2;
                c1bhx.LJII();
                C1BHX c1bhx2 = this.LIZJ;
                c1bhx2.LL = false;
                SparkThirdContext sparkThirdContext2 = c1bhx2.LLJILJIL;
                if (sparkThirdContext2 != null && (c1bht = sparkThirdContext2.performanceState) != null) {
                    c1bht.LIZLLL = SystemClock.uptimeMillis();
                    c1bht.LJ = null;
                }
                InterfaceC1542250qEh interfaceC1542250qEh = this.LIZJ.LLILZLL;
                if (interfaceC1542250qEh != null) {
                    interfaceC1542250qEh.LIZ(true);
                }
                C2202311BHh c2202311BHh = this.LIZJ.LLJIJIL;
                if (c2202311BHh != null) {
                    c2202311BHh.LIZJ(str);
                }
                SparkThirdContext sparkThirdContext3 = this.LIZJ.LLJILJIL;
                if (sparkThirdContext3 != null && (interfaceC2202301BHg = sparkThirdContext3.callback) != null) {
                    interfaceC2202301BHg.LIZJ(str);
                }
                SparkThirdContext sparkThirdContext4 = this.LIZJ.LLJILJIL;
                if (sparkThirdContext4 != null && (c2202271BHd = sparkThirdContext4.webViewClient) != null) {
                    c2202271BHd.LIZIZ(webView, str);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
                int errorCode;
                String string;
                InterfaceC2202301BHg interfaceC2202301BHg;
                CharSequence description;
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                int errorCode2 = 0;
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    C1BHX c1bhx = this.LIZJ;
                    c1bhx.LL = true;
                    if (webResourceError != null) {
                        errorCode = webResourceError.getErrorCode();
                    } else {
                        errorCode = 0;
                    }
                    CharSequence description2 = null;
                    if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                        string = description.toString();
                    } else {
                        string = null;
                    }
                    c1bhx.LIZJ(errorCode, string);
                    SparkThirdContext sparkThirdContext = this.LIZJ.LLJILJIL;
                    if (sparkThirdContext != null && (interfaceC2202301BHg = sparkThirdContext.callback) != null) {
                        Uri url = webResourceRequest.getUrl();
                        if (url != null) {
                            url.toString();
                        }
                        if (webResourceError != null) {
                            errorCode2 = webResourceError.getErrorCode();
                            description2 = webResourceError.getDescription();
                        }
                        interfaceC2202301BHg.LIZ(errorCode2, String.valueOf(description2));
                    }
                    this.LIZJ.LJI();
                    this.LIZJ.LJFF("fail");
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws JSONException {
                int statusCode;
                String reasonPhrase;
                InterfaceC2202301BHg interfaceC2202301BHg;
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                int statusCode2 = 0;
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    C1BHX c1bhx = this.LIZJ;
                    c1bhx.LL = true;
                    if (webResourceResponse != null) {
                        statusCode = webResourceResponse.getStatusCode();
                    } else {
                        statusCode = 0;
                    }
                    String reasonPhrase2 = null;
                    if (webResourceResponse != null) {
                        reasonPhrase = webResourceResponse.getReasonPhrase();
                    } else {
                        reasonPhrase = null;
                    }
                    c1bhx.LIZJ(statusCode, reasonPhrase);
                    SparkThirdContext sparkThirdContext = this.LIZJ.LLJILJIL;
                    if (sparkThirdContext != null && (interfaceC2202301BHg = sparkThirdContext.callback) != null) {
                        Uri url = webResourceRequest.getUrl();
                        if (url != null) {
                            url.toString();
                        }
                        if (webResourceResponse != null) {
                            statusCode2 = webResourceResponse.getStatusCode();
                            reasonPhrase2 = webResourceResponse.getReasonPhrase();
                        }
                        interfaceC2202301BHg.LIZ(statusCode2, reasonPhrase2);
                    }
                    this.LIZJ.LJI();
                    this.LIZJ.LJFF("fail");
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws JSONException {
                int primaryError;
                String string;
                InterfaceC2202301BHg interfaceC2202301BHg;
                SslCertificate certificate;
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                C1BHX c1bhx = this.LIZJ;
                c1bhx.LL = true;
                int primaryError2 = 0;
                if (sslError != null) {
                    primaryError = sslError.getPrimaryError();
                } else {
                    primaryError = 0;
                }
                SslCertificate certificate2 = null;
                if (sslError != null && (certificate = sslError.getCertificate()) != null) {
                    string = certificate.toString();
                } else {
                    string = null;
                }
                c1bhx.LIZJ(primaryError, string);
                SparkThirdContext sparkThirdContext = this.LIZJ.LLJILJIL;
                if (sparkThirdContext != null && (interfaceC2202301BHg = sparkThirdContext.callback) != null) {
                    if (webView != null) {
                        webView.getUrl();
                    }
                    if (sslError != null) {
                        primaryError2 = sslError.getPrimaryError();
                        certificate2 = sslError.getCertificate();
                    }
                    interfaceC2202301BHg.LIZ(primaryError2, String.valueOf(certificate2));
                }
                this.LIZJ.LJI();
                this.LIZJ.LJFF("fail");
            }

            @Override // android.webkit.WebViewClient
            @InterfaceC1294060jmO
            public final void onReceivedError(WebView webView, int i2, String str, String str2) throws JSONException {
                InterfaceC2202301BHg interfaceC2202301BHg;
                super.onReceivedError(webView, i2, str, str2);
                C1BHX c1bhx = this.LIZJ;
                c1bhx.LL = true;
                c1bhx.LIZJ(i2, str);
                SparkThirdContext sparkThirdContext = this.LIZJ.LLJILJIL;
                if (sparkThirdContext != null && (interfaceC2202301BHg = sparkThirdContext.callback) != null) {
                    interfaceC2202301BHg.LIZ(i2, str);
                }
                this.LIZJ.LJI();
                this.LIZJ.LJFF("fail");
            }
        };
        this.LLJJIJIIJIL = r5;
        C786410Ut5.Sd(R.layout.f_y, C786410Ut5.ne(context), this);
        SparkThirdWebViewInner sparkThirdWebViewInner = (SparkThirdWebViewInner) findViewById(R.id.webView);
        this.LLJ = sparkThirdWebViewInner;
        if (!C794280VDu.LIZ(sparkThirdWebViewInner, "csrf") && C292470BdF.LIZ()) {
            if ((sparkThirdWebViewInner instanceof WebKitView) && (hybridContext = ((WebKitView) sparkThirdWebViewInner).getHybridContext()) != null) {
                numValueOf = Integer.valueOf(hybridContext.LJ());
            } else {
                numValueOf = null;
            }
            WebSettings settings = sparkThirdWebViewInner.getSettings();
            if (numValueOf != null) {
                C788140Uvs.LIZ.put(settings, numValueOf);
            }
            String userAgentString = settings.getUserAgentString();
            if (OptIABUAExp.LIZ(numValueOf)) {
                strLIZJ = OptIABUAExp.LIZJ();
                if (strLIZJ == null || strLIZJ.isEmpty()) {
                    sparkThirdWebViewInner.setWebViewClient(r5);
                }
            } else {
                strLIZJ = " BytedanceWebview/d8a21c6";
            }
            if (!userAgentString.contains(strLIZJ)) {
                settings.setUserAgentString(userAgentString.concat(strLIZJ));
            }
            sparkThirdWebViewInner.setWebViewClient(r5);
        } else {
            sparkThirdWebViewInner.setWebViewClient(r5);
        }
        sparkThirdWebViewInner.setBackgroundColor(-1);
        C1BHO c1bho2 = C1554300qY8.LIZ;
        C786410Ut5.se(sparkThirdWebViewInner.getSettings(), c1bho2 != null ? c1bho2.LJI(sparkThirdWebViewInner.getSettings().getUserAgentString()) : null);
        C1BHO c1bho3 = C1554300qY8.LIZ;
        if (c1bho3 != null && (c2202291BHfLJIIIZ = c1bho3.LJIIIZ()) != null) {
            c2202291BHfLJIIIZ.LIZ(sparkThirdWebViewInner);
        }
        sparkThirdWebViewInner.setWebChromeClient(new WebChromeClient() { // from class: X.1BHb
            @Override // android.webkit.WebChromeClient
            public final void onHideCustomView() {
                this.LIZ.LIZLLL(true);
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i2) {
                super.onProgressChanged(webView, i2);
                InterfaceC1542250qEh interfaceC1542250qEh = this.LIZ.LLILZLL;
                if (interfaceC1542250qEh != null) {
                    interfaceC1542250qEh.setProgress(((int) (i2 * 0.9f)) + 10);
                }
            }

            @Override // android.webkit.WebChromeClient
            public final void onReceivedTitle(WebView webView, String str) {
                String url;
                InterfaceC1542320qEo interfaceC1542320qEo;
                String url2;
                if (str == null || str.length() == 0 || (webView != null && (url2 = webView.getUrl()) != null && a0.LJJIIZI(url2, str, false))) {
                    InterfaceC1542320qEo interfaceC1542320qEo2 = this.LIZ.LLJI;
                    if (interfaceC1542320qEo2 != null) {
                        interfaceC1542320qEo2.LIZIZ("");
                    }
                } else {
                    InterfaceC1542320qEo interfaceC1542320qEo3 = this.LIZ.LLJI;
                    if (interfaceC1542320qEo3 != null) {
                        interfaceC1542320qEo3.LIZIZ(str);
                    }
                }
                if (webView != null && (url = webView.getUrl()) != null && (interfaceC1542320qEo = this.LIZ.LLJI) != null) {
                    interfaceC1542320qEo.LIZ(url);
                }
            }

            @Override // android.webkit.WebChromeClient
            public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                Activity activity;
                Window window;
                View decorView;
                if (view == null) {
                    if (customViewCallback != null) {
                        customViewCallback.onCustomViewHidden();
                        return;
                    }
                    return;
                }
                C1BHX c1bhx = this.LIZ;
                if (c1bhx.LLJILLL != null) {
                    c1bhx.LIZLLL(true);
                }
                this.LIZ.getClass();
                C1BHX.LJ(view);
                C1BHX c1bhx2 = this.LIZ;
                c1bhx2.LLJILLL = view;
                c1bhx2.LLJJ = customViewCallback;
                SparkThirdWebViewInner sparkThirdWebViewInner2 = c1bhx2.LLJ;
                int visibility = sparkThirdWebViewInner2.getVisibility();
                sparkThirdWebViewInner2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, sparkThirdWebViewInner2);
                this.LIZ.addView(view, new FrameLayout.LayoutParams(-1, -1));
                C1BHX c1bhx3 = this.LIZ;
                Context context2 = c1bhx3.getContext();
                if ((context2 instanceof Activity) && (activity = (Activity) context2) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    c1bhx3.LLJJI = Integer.valueOf(decorView.getSystemUiVisibility());
                    decorView.setSystemUiVisibility(5894);
                }
            }
        });
        this.LLIZ = (FrameLayout) findViewById(R.id.w0p);
        this.LLIZLLLIL = (TextView) findViewById(R.id.fgm);
        LJIIIZ();
    }
}
