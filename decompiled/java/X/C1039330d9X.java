package X;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: X.0d9X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039330d9X extends WebViewClient {
    public final /* synthetic */ C1039050d95 LIZ;

    public C1039330d9X(C1039050d95 c1039050d95) {
        this.LIZ = c1039050d95;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LJJIII(this.LIZ, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LJJIII(this.LIZ, false);
        }
    }
}
