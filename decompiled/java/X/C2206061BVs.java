package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2206061BVs extends AbstractC1541650qDj {
    public final C2206031BVp LLIZ = new AbstractC2205961BVi() { // from class: X.1BVp
        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj getExtension() {
            return this.LL;
        }

        @Override // X.AbstractC2205961BVi
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            boolean z;
            C2206041BVq c2206041BVq = this.LL.LLIZLLLIL;
            if (!c2206041BVq.LLJ && !c2206041BVq.LLJI) {
                z = true;
            } else {
                z = false;
            }
            c2206041BVq.LLJI = true;
            try {
                boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
                if (z) {
                    if (!zShouldOverrideUrlLoading) {
                        C2206041BVq c2206041BVq2 = this.LL.LLIZLLLIL;
                        String string = webResourceRequest.getUrl().toString();
                        C0V1W c0v1w = c2206041BVq2.LLJILJIL;
                        if (c0v1w != null) {
                            c0v1w.LIZ(1, string);
                        }
                    }
                    this.LL.LLIZLLLIL.getClass();
                }
                this.LL.LLIZLLLIL.LLJI = false;
                return zShouldOverrideUrlLoading;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LL.LLIZLLLIL.LLJI = false;
                throw th;
            }
        }

        @Override // X.AbstractC2205961BVi
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean z;
            C0V1W c0v1w;
            C2206041BVq c2206041BVq = this.LL.LLIZLLLIL;
            if (!c2206041BVq.LLJ && !c2206041BVq.LLJI) {
                z = true;
            } else {
                z = false;
            }
            c2206041BVq.LLJ = true;
            try {
                boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
                if (z) {
                    if (!zShouldOverrideUrlLoading && (c0v1w = this.LL.LLIZLLLIL.LLJILJIL) != null) {
                        c0v1w.LIZ(1, str);
                    }
                    this.LL.LLIZLLLIL.getClass();
                }
                this.LL.LLIZLLLIL.LLJ = false;
                return zShouldOverrideUrlLoading;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LL.LLIZLLLIL.LLJ = false;
                throw th;
            }
        }

        @Override // X.AbstractC2205961BVi
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            C0V1W c0v1w = this.LL.LLIZLLLIL.LLJILJIL;
            if (c0v1w != null) {
                c0v1w.LIZ(1, str);
            }
            this.LL.LLIZLLLIL.getClass();
            super.doUpdateVisitedHistory(webView, str, z);
        }
    };
    public final /* synthetic */ C2206041BVq LLIZLLLIL;

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        LJ("shouldOverrideUrlLoading", this.LLIZ, 500);
        LJ("doUpdateVisitedHistory", this.LLIZ, 500);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BVp] */
    public C2206061BVs(C2206041BVq c2206041BVq) {
        this.LLIZLLLIL = c2206041BVq;
    }
}
