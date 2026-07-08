package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.1BVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206041BVq extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C2206051BVr LLJIJIL = new C1ET3() { // from class: X.1BVr
        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj getExtension() {
            return this.LL;
        }

        @Override // X.C1ET3
        public final void LJJII(String str) {
            boolean z;
            C2206041BVq c2206041BVq = this.LL;
            if (!c2206041BVq.LLIZ && !c2206041BVq.LLIZLLLIL) {
                z = true;
            } else {
                z = false;
            }
            c2206041BVq.LLIZ = true;
            if (z) {
                try {
                    C0V1W c0v1w = c2206041BVq.LLJILJIL;
                    if (c0v1w == null) {
                        C0V1W c0v1w2 = new C0V1W(c2206041BVq.LL);
                        c2206041BVq.LLJILJIL = c0v1w2;
                        c0v1w2.LIZ(0, str);
                    } else {
                        c0v1w.LIZ(1, str);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LL.LLIZ = false;
                    throw th;
                }
            }
            super.LJJII(str);
            if (z) {
                this.LL.getClass();
            }
            this.LL.LLIZ = false;
        }

        @Override // X.C1ET3
        public final void LJJIII(String str, Map<String, String> map) {
            boolean z;
            C2206041BVq c2206041BVq = this.LL;
            if (!c2206041BVq.LLIZ && !c2206041BVq.LLIZLLLIL) {
                z = true;
            } else {
                z = false;
            }
            c2206041BVq.LLIZLLLIL = true;
            if (z) {
                try {
                    C0V1W c0v1w = c2206041BVq.LLJILJIL;
                    if (c0v1w == null) {
                        C0V1W c0v1w2 = new C0V1W(c2206041BVq.LL);
                        c2206041BVq.LLJILJIL = c0v1w2;
                        c0v1w2.LIZ(0, str);
                    } else {
                        c0v1w.LIZ(1, str);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LL.LLIZLLLIL = false;
                    throw th;
                }
            }
            super.LJJIII(str, map);
            if (z) {
                this.LL.getClass();
            }
            this.LL.LLIZLLLIL = false;
        }
    };
    public C0V1W LLJILJIL;

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), new C2206061BVs(this));
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebChromeClient(), new C1BW0(this));
        LJ("loadUrl", this.LLJIJIL, 500);
    }
}
