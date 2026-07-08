package X;

import android.webkit.WebView;

/* JADX INFO: renamed from: X.1BW0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BW0 extends AbstractC1541650qDj {
    public final C1BW1 LLIZ = new C1BVX() { // from class: X.1BW1
        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj getExtension() {
            return this.LL;
        }

        @Override // X.C1BVX
        public final void onProgressChanged(WebView webView, int i) {
            this.LL.LLIZLLLIL.getClass();
            super.onProgressChanged(webView, i);
        }
    };
    public final /* synthetic */ C2206041BVq LLIZLLLIL;

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        LJ("onProgressChanged", this.LLIZ, 500);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BW1] */
    public C1BW0(C2206041BVq c2206041BVq) {
        this.LLIZLLLIL = c2206041BVq;
    }
}
