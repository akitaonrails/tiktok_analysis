package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.1BHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2202461BHw extends WebViewClient implements InterfaceC1548170qOF, Cloneable {
    public static final AtomicInteger LLILZIL = new AtomicInteger(0);
    public static final List<C2202461BHw>[] LLILZLL = new List[10];
    public static final WeakHashMap<WebViewClient, Map<Integer, WeakReference<C2202461BHw>>> LLIZ = new WeakHashMap<>();
    public static final WebViewClient LLIZLLLIL = new WebViewClient();
    public final int LL;
    public int LLILLJJLI;
    public String LLILLL;
    public WebViewClient LLILZ;

    public C2202461BHw() {
        this.LLILZ = LLIZLLLIL;
        this.LLILLJJLI = LLILZIL.getAndIncrement();
        this.LL = -1;
    }

    @Override // X.InterfaceC1548170qOF
    public String LIZ() {
        return getClass().getName();
    }

    public final Object clone() {
        try {
            C2202461BHw c2202461BHw = (C2202461BHw) super.clone();
            c2202461BHw.LLILLJJLI = this.LLILLJJLI;
            return c2202461BHw;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("WebViewClientExt clone error");
        }
    }

    public C2202461BHw(int i) {
        this.LLILZ = LLIZLLLIL;
        this.LLILLJJLI = LLILZIL.getAndIncrement();
        this.LL = i;
        if (i > 2 && i <= 9) {
        } else {
            throw new RuntimeException("WebViewClientExt priorityRegion out of bounds!");
        }
    }

    public static C2202461BHw LIZJ(C2202461BHw c2202461BHw) {
        boolean z;
        int i = c2202461BHw.LL;
        if (i < 0) {
            i = 2;
            z = true;
        } else {
            z = false;
        }
        while (true) {
            List<C2202461BHw>[] listArr = LLILZLL;
            if (i < listArr.length) {
                List<C2202461BHw> list = listArr[i];
                if (list != null) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C2202461BHw c2202461BHw2 = (C2202461BHw) ListProtector.get(list, i2);
                        if (c2202461BHw2 != null) {
                            if (z) {
                                C2202461BHw c2202461BHwLIZIZ = LIZIZ(c2202461BHw2, c2202461BHw);
                                if (!C1548160qOE.LIZ(c2202461BHwLIZIZ.LLILLL, c2202461BHwLIZIZ)) {
                                    return c2202461BHwLIZIZ;
                                }
                            } else if (c2202461BHw2.LLILLJJLI != c2202461BHw.LLILLJJLI) {
                                continue;
                            } else {
                                int i3 = i2 + 1;
                                if (i3 < list.size()) {
                                    C2202461BHw c2202461BHw3 = (C2202461BHw) ListProtector.get(list, i3);
                                    if (c2202461BHw3 != null) {
                                        C2202461BHw c2202461BHwLIZIZ2 = LIZIZ(c2202461BHw3, c2202461BHw);
                                        if (!C1548160qOE.LIZ(c2202461BHwLIZIZ2.LLILLL, c2202461BHwLIZIZ2)) {
                                            return c2202461BHwLIZIZ2;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public static C2202461BHw LIZIZ(C2202461BHw c2202461BHw, C2202461BHw c2202461BHw2) {
        C2202461BHw c2202461BHw3;
        Map<Integer, WeakReference<C2202461BHw>> map = LLIZ.get(c2202461BHw2.LLILZ);
        if (map == null) {
            map = new HashMap<>();
            LLIZ.put(c2202461BHw2.LLILZ, map);
        }
        WeakReference<C2202461BHw> weakReference = map.get(Integer.valueOf(c2202461BHw.LLILLJJLI));
        if (weakReference == null || (c2202461BHw3 = weakReference.get()) == null) {
            try {
                c2202461BHw3 = (C2202461BHw) super.clone();
                c2202461BHw3.LLILLJJLI = c2202461BHw.LLILLJJLI;
                WebViewClient webViewClient = c2202461BHw2.LLILZ;
                if (webViewClient == null) {
                    c2202461BHw3.LLILZ = LLIZLLLIL;
                } else {
                    c2202461BHw3.LLILZ = webViewClient;
                }
                map.put(Integer.valueOf(c2202461BHw.LLILLJJLI), new WeakReference<>(c2202461BHw3));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException("WebViewClientExt clone error");
            }
        }
        c2202461BHw3.LLILLL = c2202461BHw2.LLILLL;
        return c2202461BHw3;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onLoadResource(webView, str);
        } else {
            this.LLILZ.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onPageCommitVisible(webView, str);
        } else {
            this.LLILZ.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onPageFinished(webView, str);
        } else {
            this.LLILZ.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            this.LLILZ.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            return c2202461BHwLIZJ.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        boolean zOnRenderProcessGone = this.LLILZ.onRenderProcessGone(webView, renderProcessGoneDetail);
        C846490XIp c846490XIp = WebViewHooker.LJIIIZ;
        if (c846490XIp != null && c846490XIp.LIZJ) {
            return true;
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            this.LLILZ.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            return c2202461BHwLIZJ.shouldInterceptRequest(webView, webResourceRequest);
        }
        return this.LLILZ.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            return c2202461BHwLIZJ.shouldOverrideKeyEvent(webView, keyEvent);
        }
        return this.LLILZ.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C794280VDu.LIZ(webView, "seclink")) {
            C2202461BHw c2202461BHwLIZJ = LIZJ(this);
            if (c2202461BHwLIZJ != null) {
                return c2202461BHwLIZJ.shouldOverrideUrlLoading(webView, str);
            }
            return this.LLILZ.shouldOverrideUrlLoading(webView, str);
        }
        C1064860doi.LIZ.getClass();
        if (C1064860doi.LIZLLL(webView, str)) {
            return true;
        }
        C2202461BHw c2202461BHwLIZJ2 = LIZJ(this);
        if (c2202461BHwLIZJ2 != null) {
            return c2202461BHwLIZJ2.shouldOverrideUrlLoading(webView, str);
        }
        return this.LLILZ.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            return c2202461BHwLIZJ.shouldInterceptRequest(webView, str);
        }
        return this.LLILZ.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            return c2202461BHwLIZJ.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return this.LLILZ.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.doUpdateVisitedHistory(webView, str, z);
        } else {
            this.LLILZ.doUpdateVisitedHistory(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onFormResubmission(webView, message, message2);
        } else {
            this.LLILZ.onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onPageStarted(webView, str, bitmap);
        } else {
            this.LLILZ.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            this.LLILZ.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            this.LLILZ.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            this.LLILZ.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onScaleChanged(webView, f, f2);
        } else {
            this.LLILZ.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onTooManyRedirects(webView, message, message2);
        } else {
            this.LLILZ.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onReceivedError(webView, i, str, str2);
        } else {
            this.LLILZ.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            this.LLILZ.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            this.LLILZ.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        C2202461BHw c2202461BHwLIZJ = LIZJ(this);
        if (c2202461BHwLIZJ != null) {
            c2202461BHwLIZJ.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        } else {
            this.LLILZ.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }
}
