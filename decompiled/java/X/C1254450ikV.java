package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.0ikV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254450ikV extends C2202271BHd {
    public final C1254440ikU LIZ;

    public C1254450ikV(C1254440ikU c1254440ikU) {
        this.LIZ = c1254440ikU;
    }

    @Override // X.C2202271BHd
    public final boolean LJ(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest != null) {
            url = webResourceRequest.getUrl();
        } else {
            url = null;
        }
        String strValueOf = String.valueOf(url);
        if (C123100dR.LIZ(strValueOf)) {
            C1254510ikb.LIZ.getClass();
            if (C1254510ikb.LIZ(strValueOf)) {
                C1254440ikU c1254440ikU = this.LIZ;
                C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                String str = c1254440ikU.LIZIZ;
                c1254430ikT.getClass();
                C1254430ikT.LIZJ(str, true);
                C1254510ikb.LIZIZ(strValueOf, this.LIZ);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C2202271BHd
    public final boolean LJFF(WebView webView, String str) {
        if (C123100dR.LIZ(str)) {
            C1254510ikb.LIZ.getClass();
            if (C1254510ikb.LIZ(str)) {
                C1254440ikU c1254440ikU = this.LIZ;
                C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                String str2 = c1254440ikU.LIZIZ;
                c1254430ikT.getClass();
                C1254430ikT.LIZJ(str2, true);
                C1254510ikb.LIZIZ(str, this.LIZ);
                return true;
            }
            return false;
        }
        return false;
    }
}
