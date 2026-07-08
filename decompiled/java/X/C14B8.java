package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.security.OptIABUAExp;
import com.tts.oecverify.BdTuring;
import com.tts.oecverify.twiceverify.TwiceVerifyWebActivity;

/* JADX INFO: renamed from: X.14B8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14B8 extends WebView {
    public C14BO LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public C20221114Af LLILZ;
    public Activity LLILZIL;
    public final C14B9 LLILZLL;
    public final C14BL LLIZ;

    @Override // android.webkit.WebView
    public final boolean canGoBack() {
        if (C794280VDu.LIZ(this, "seclink")) {
            return super.canGoBack();
        }
        if (!super.canGoBack()) {
            return false;
        }
        C1064860doi.LIZ.getClass();
        return C1064860doi.LIZIZ(this);
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        if (C794280VDu.LIZ(this, "seclink")) {
            super.goBack();
            return;
        }
        C1064860doi.LIZ.getClass();
        if (C1064860doi.LIZJ(this)) {
            return;
        }
        super.goBack();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C14BO c14bo) {
        Integer numValueOf;
        String strLIZJ;
        C1537480q70 hybridContext;
        this.LL = c14bo;
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setCacheMode(2);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setTextZoom(100);
        if (BdTuring.getInstance().getConfig().isRegionBoe()) {
            settings.setMixedContentMode(0);
        }
        try {
            setOverScrollMode(2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        if (C14A6.LIZ()) {
            setWebChromeClient(this.LLILZLL);
        }
        C14BL c14bl = this.LLIZ;
        if (C794280VDu.LIZ(this, "csrf")) {
            setWebViewClient(c14bl);
            return;
        }
        if (C292470BdF.LIZ() && c14bl != null) {
            if ((this instanceof WebKitView) && (hybridContext = ((WebKitView) this).getHybridContext()) != null) {
                numValueOf = Integer.valueOf(hybridContext.LJ());
            } else {
                numValueOf = null;
            }
            WebSettings settings2 = getSettings();
            if (numValueOf != null) {
                C788140Uvs.LIZ.put(settings2, numValueOf);
            }
            String userAgentString = settings2.getUserAgentString();
            if (OptIABUAExp.LIZ(numValueOf)) {
                strLIZJ = OptIABUAExp.LIZJ();
                if (strLIZJ == null || strLIZJ.isEmpty()) {
                    setWebViewClient(c14bl);
                    return;
                }
            } else {
                strLIZJ = " BytedanceWebview/d8a21c6";
            }
            if (!userAgentString.contains(strLIZJ)) {
                settings2.setUserAgentString(userAgentString.concat(strLIZJ));
            }
        }
        setWebViewClient(c14bl);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C20221114Af c20221114Af = this.LLILZ;
        if (c20221114Af != null) {
            c20221114Af.LIZ(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTouchListener(C20221114Af c20221114Af) {
        this.LLILZ = c20221114Af;
    }

    public void setParentActivity(Activity activity) {
        this.LLILZIL = activity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.14B9] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.14BL] */
    public C14B8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = false;
        this.LLILLL = false;
        this.LLILZLL = new WebChromeClient() { // from class: X.14B9
            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }
        };
        this.LLIZ = new WebViewClient() { // from class: X.14BL
            @Override // android.webkit.WebViewClient
            public final void onLoadResource(WebView webView, String str) {
                super.onLoadResource(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                C14B8 c14b8 = this.LIZ;
                if (!c14b8.LLILLJJLI && !c14b8.LLILLL) {
                    c14b8.LLILLL = true;
                    c14b8.LL.LIZIZ();
                }
                super.onPageFinished(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                if (str.toLowerCase().contains("/favicon.ico")) {
                    try {
                        return new WebResourceResponse("image/png", null, null);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return super.shouldInterceptRequest(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                int statusCode;
                if (C14A6.LIZ()) {
                    this.LIZ.getContext();
                }
                Activity activity = this.LIZ.LLILZIL;
                if (activity != null && (activity instanceof TwiceVerifyWebActivity)) {
                    try {
                        statusCode = webResourceResponse.getStatusCode();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        statusCode = 0;
                    }
                    ((TwiceVerifyWebActivity) this.LIZ.LLILZIL).LLLLLZL(statusCode);
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                try {
                    webResourceRequest.getUrl().toString().toLowerCase().contains("/favicon.ico");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C14A6.LIZIZ();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                int primaryError;
                if (C14A6.LIZ()) {
                    Context context2 = this.LIZ.getContext();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onReceivedSslError : ");
                    sbLIZ.append(sslError);
                    C786410Ut5.re(Toast.makeText(context2, C2188811AlT.LIZIZ(sbLIZ), 1));
                }
                Activity activity = this.LIZ.LLILZIL;
                if (activity != null && (activity instanceof TwiceVerifyWebActivity)) {
                    try {
                        primaryError = sslError.getPrimaryError();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        primaryError = 0;
                    }
                    ((TwiceVerifyWebActivity) this.LIZ.LLILZIL).LLLLLZL(primaryError);
                }
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                this.LIZ.LLILLJJLI = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append(" onReceivedError ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C14BO c14bo = this.LIZ.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("|");
                sbLIZ2.append(str2);
                c14bo.LIZ(i, C2188811AlT.LIZIZ(sbLIZ2));
                Activity activity = this.LIZ.LLILZIL;
                if (activity != null && (activity instanceof TwiceVerifyWebActivity)) {
                    ((TwiceVerifyWebActivity) activity).LLLLLZL(i);
                }
                super.onReceivedError(webView, i, str, str2);
            }
        };
    }
}
