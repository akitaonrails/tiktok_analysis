package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11WO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11WO extends AbstractC2205961BVi {
    public final C11WF LL;
    public final AbstractC1541650qDj<?> LLILLJJLI;
    public final List<C11WL> LLILLL = new ArrayList();

    @Override // X.AbstractC1541670qDl
    public final AbstractC1541650qDj<?> getExtension() {
        return this.LLILLJJLI;
    }

    public C11WO(C11WF c11wf, AbstractC1541650qDj<?> abstractC1541650qDj) {
        this.LL = c11wf;
        this.LLILLJJLI = abstractC1541650qDj;
    }

    @Override // X.AbstractC2205961BVi
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C11WF c11wf = this.LL;
        if (c11wf != null) {
            c11wf.LJFF = str;
            c11wf.LJI = true;
        }
        if (webView != null) {
            webView.getTitle();
        }
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((C11WL) it2.next()).LIZ(webView);
        }
    }

    @Override // X.AbstractC2205961BVi
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // X.AbstractC2205961BVi
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // X.AbstractC2205961BVi
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((C11WL) it2.next()).LIZIZ(webResourceRequest, webResourceError);
        }
    }
}
