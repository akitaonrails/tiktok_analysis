package X;

import android.text.TextUtils;
import android.webkit.WebViewClient;
import com.bytedance.hybrid.web.extension.components.scc.network.DefaultNetAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Map;

/* JADX INFO: renamed from: X.0plF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523990plF extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public boolean LLIZ;
    public InterfaceC1522920pjW LLIZLLLIL;
    public volatile C1497050p3n LLJ;
    public C1522930pjX LLJI;
    public final C1533120pzy LLJIJIL = new C1ET3() { // from class: X.0pzy
        @Override // X.C1ET3
        public final void LJIJJLI() {
            if (this.LL.LLJ == null) {
                super.LJIJJLI();
            } else {
                this.LL.LLJ.LJI = true;
                super.LJIJJLI();
            }
        }

        @Override // X.C1ET3
        public final void LJJLIIIIJ() {
            if (!this.LL.LJII(getExtendable().getUrl())) {
                super.LJJLIIIIJ();
            } else {
                this.LL.LLJ.LIZ(getExtendable().getUrl());
                super.LJJLIIIIJ();
            }
        }

        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj getExtension() {
            return this.LL;
        }

        @Override // X.C1ET3
        public final void LJJII(String str) {
            if (!this.LL.LJII(str)) {
                super.LJJII(str);
            } else {
                this.LL.LLJ.LIZ(str);
                super.LJJII(str);
            }
        }

        @Override // X.C1ET3
        public final void LJJZ(WebViewClient webViewClient) {
            super.LJJZ(webViewClient);
        }

        @Override // X.C1ET3
        public final void LJJIII(String str, Map<String, String> map) {
            if (!this.LL.LJII(str)) {
                super.LJJIII(str, map);
            } else {
                this.LL.LLJ.LIZ(str);
                super.LJJIII(str, map);
            }
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), new C1524030plJ(this));
        LIZLLL("loadUrl", this.LLJIJIL);
        LIZLLL("reload", this.LLJIJIL);
        LIZLLL("goBack", this.LLJIJIL);
    }

    public static void LJI(InterfaceC1496980p3g interfaceC1496980p3g) {
        synchronized (C1523990plF.class) {
            try {
                if (C1489780os4.LIZ() == null) {
                    C1489780os4.LIZJ(new DefaultNetAdapter(interfaceC1496980p3g));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF(n nVar) {
        if (this.LLJ == null) {
            this.LLJ = new C1497050p3n();
        }
        if (nVar == null) {
            return;
        }
        k kVarLJJIIZ = nVar.LJJIIZ("scc_cs_enable");
        if (kVarLJJIIZ != null) {
            this.LLIZ = kVarLJJIIZ.LJ();
        }
        k kVarLJJIIZ2 = nVar.LJJIIZ("scc_cs_is_debug");
        if (kVarLJJIIZ2 != null) {
            kVarLJJIIZ2.LJ();
        }
        this.LLJ.LIZ.LIZ(nVar);
    }

    public final boolean LJII(String str) {
        if (this.LLIZ && this.LLJ != null && this.LLIZLLLIL != null && !TextUtils.isEmpty(str)) {
            this.LLIZLLLIL.LIZLLL();
            return true;
        }
        return false;
    }
}
