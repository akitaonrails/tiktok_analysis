package X;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.14BD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14BD extends WebView {
    public boolean LL;

    public void setWebViewUrlFilter(C14BF c14bf) {
    }

    @Override // android.webkit.WebView
    public final boolean canGoBack() {
        boolean zCanGoBack = false;
        if (C794280VDu.LIZ(this, "seclink")) {
            try {
                zCanGoBack = super.canGoBack();
                return zCanGoBack;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return zCanGoBack;
            }
        }
        try {
            if (!super.canGoBack()) {
                return false;
            }
            C1064860doi.LIZ.getClass();
            return C1064860doi.LIZIZ(this);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        if (C794280VDu.LIZ(this, "seclink")) {
            try {
                super.goBack();
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C1064860doi.LIZ.getClass();
        if (C1064860doi.LIZJ(this)) {
            return;
        }
        try {
            super.goBack();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // android.webkit.WebView
    public final boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // android.webkit.WebView
    public final void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public final void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 1;
        }
    }

    @Override // android.webkit.WebView
    public String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.webkit.WebView
    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 100;
        }
    }

    @Override // android.webkit.WebView
    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.webkit.WebView
    public final void goForward() {
        try {
            super.goForward();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public final void reload() {
        try {
            super.reload();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public final boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // android.webkit.WebView
    public final void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public final void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        if (C794280VDu.LIZ(this, "seclink")) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        String strOnLoadUrl = C1064860doi.LIZ.onLoadUrl(this, str);
        if (!TextUtils.isEmpty(strOnLoadUrl)) {
            str = strOnLoadUrl;
        }
        try {
            super.loadUrl(str);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        boolean z;
        try {
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient != null) {
                z = true;
            } else {
                z = false;
            }
            this.LL = z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL = false;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        if (C794280VDu.LIZ(this, "seclink")) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        String strOnLoadUrl = C1064860doi.LIZ.onLoadUrl(this, str);
        if (!TextUtils.isEmpty(strOnLoadUrl)) {
            str = strOnLoadUrl;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // android.webkit.WebView
    public final void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(str, bArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
