package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dSB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050890dSB extends AbstractC1539010q9T {
    public long LLILLJJLI;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS instanceof C1541480qDS) {
            ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.0dSC
                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    Uri url;
                    Uri url2 = null;
                    if (webResourceRequest != null) {
                        url = webResourceRequest.getUrl();
                    } else {
                        url = null;
                    }
                    if (!u.LJJIIJZLJL(String.valueOf(url), "http", false)) {
                        if (webResourceRequest != null) {
                            url2 = webResourceRequest.getUrl();
                        }
                        if (!u.LJJIIJZLJL(String.valueOf(url2), "https", false)) {
                            C1050890dSB c1050890dSB = this.LL;
                            c1050890dSB.getClass();
                            if (webView != null) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - c1050890dSB.LLILLJJLI >= 3000) {
                                    c1050890dSB.LLILLJJLI = jCurrentTimeMillis;
                                    C1389890mGx c1389890mGx = new C1389890mGx(webView);
                                    c1389890mGx.LIZLLL(2000L);
                                    c1389890mGx.LJIIIZ(2131830512);
                                    c1389890mGx.LJIIJJI();
                                    return true;
                                }
                                return true;
                            }
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
            };
        }
    }
}
