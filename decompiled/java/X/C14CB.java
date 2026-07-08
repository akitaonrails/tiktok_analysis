package X;

import android.webkit.WebView;

/* JADX INFO: renamed from: X.14CB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CB extends AbstractC1541650qDj<C2205951BVh> {
    public final InterfaceC1740150vNt LLIZ;
    public final C14CC LLIZLLLIL = new AbstractC2205961BVi() { // from class: X.14CC
        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj<?> getExtension() {
            return this.LL;
        }

        @Override // X.AbstractC2205961BVi
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.LL.LLIZ.LIZ(webView);
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        LJ("onPageFinished", this.LLIZLLLIL, 7000);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.14CC] */
    public C14CB(C1740130vNr c1740130vNr) {
        this.LLIZ = c1740130vNr;
    }
}
