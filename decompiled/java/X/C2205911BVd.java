package X;

import android.webkit.WebViewClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.1BVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205911BVd extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public final C2205921BVe LLIZ = new C1ET3() { // from class: X.1BVe
        @Override // X.C1ET3
        public final boolean LIZJ() {
            return this.LL.LLJ == null ? super.LIZJ() : super.LIZJ() && this.LL.LLJ.canGoBack();
        }

        @Override // X.C1ET3
        public final void LJIJJLI() {
            if (this.LL.LLJ == null) {
                super.LJIJJLI();
            } else {
                if (this.LL.LLJ.LIZJ()) {
                    return;
                }
                super.LJIJJLI();
            }
        }

        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj getExtension() {
            return this.LL;
        }

        @Override // X.C1ET3
        public final void LJJII(String str) {
            C2205911BVd c2205911BVd = this.LL;
            if (c2205911BVd.LLIZLLLIL == null) {
                super.LJJII(str);
                return;
            }
            if (c2205911BVd.LLJ == null) {
                synchronized (C2205911BVd.class) {
                    try {
                        if (this.LL.LLJ == null) {
                            this.LL.LLJ = new C1B2Y(getExtendable(), this.LL.LLIZLLLIL);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                this.LL.LLJ.LIZIZ = this.LL.LLIZLLLIL;
            }
            this.LL.LLJ.LJII();
            super.LJJII(this.LL.LLJ.LJI(str));
        }

        @Override // X.C1ET3
        public final void LJJZ(WebViewClient webViewClient) {
            super.LJJZ(webViewClient);
        }

        @Override // X.C1ET3
        public final void LJJIII(String str, Map<String, String> map) {
            C2205911BVd c2205911BVd = this.LL;
            if (c2205911BVd.LLIZLLLIL == null) {
                super.LJJIII(str, map);
                return;
            }
            if (c2205911BVd.LLJ == null) {
                synchronized (C2205911BVd.class) {
                    try {
                        if (this.LL.LLJ == null) {
                            this.LL.LLJ = new C1B2Y(getExtendable(), this.LL.LLIZLLLIL);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                this.LL.LLJ.LIZIZ = this.LL.LLIZLLLIL;
            }
            this.LL.LLJ.LJII();
            super.LJJIII(this.LL.LLJ.LJI(str), map);
        }
    };
    public String LLIZLLLIL;
    public volatile C1B2Y LLJ;

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), new C2205931BVf(this));
        LIZLLL("loadUrl", this.LLIZ);
        LJ("canGoBack", this.LLIZ, 9000);
        LJ("goBack", this.LLIZ, 9000);
    }
}
