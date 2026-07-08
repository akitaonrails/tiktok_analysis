package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.1BVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2205931BVf extends AbstractC1541650qDj {
    public final C2205941BVg LLIZ = new AbstractC2205961BVi() { // from class: X.1BVg
        public boolean LL = true;

        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj getExtension() {
            return this.LLILLJJLI;
        }

        @Override // X.AbstractC2205961BVi
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (this.LLILLJJLI.LLIZLLLIL.LLJ == null) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            this.LL = true;
            this.LLILLJJLI.LLIZLLLIL.LLJ.LIZ(webResourceRequest.getUrl().toString());
            boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
            this.LL = false;
            return zShouldOverrideUrlLoading;
        }

        @Override // X.AbstractC2205961BVi
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!this.LL && this.LLILLJJLI.LLIZLLLIL.LLJ != null) {
                this.LLILLJJLI.LLIZLLLIL.LLJ.LIZ(str);
                return super.shouldOverrideUrlLoading(webView, str);
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    };
    public final /* synthetic */ C2205911BVd LLIZLLLIL;

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        LIZLLL("shouldOverrideUrlLoading", this.LLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BVg] */
    public C2205931BVf(C2205911BVd c2205911BVd) {
        this.LLIZLLLIL = c2205911BVd;
    }
}
