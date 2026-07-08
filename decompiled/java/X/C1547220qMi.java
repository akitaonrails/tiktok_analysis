package X;

import androidx.webkit.internal.WebViewFeatureInternal;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* JADX INFO: renamed from: X.0qMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1547220qMi implements InterfaceC1541510qDV {
    public final C1547210qMh LIZ = new InterfaceC1541770qDv() { // from class: X.0qMh
        @Override // X.InterfaceC1541770qDv
        public final void LIZ(WebKitView webKitView, C1537480q70 c1537480q70) {
            HybridSchemaParam hybridSchemaParamLIZJ;
            InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getDisableSafeBrowsing() && WebViewFeatureInternal.isSupported("SAFE_BROWSING_ENABLE")) {
                C2266801Dny.LIZ(webKitView.getSettings());
            }
        }
    };
    public final C1075410e5j LIZIZ = new InterfaceC1543050qFz() { // from class: X.0e5j
        @Override // X.InterfaceC1543050qFz
        public final InterfaceC1543270qGL LIZ() {
            return null;
        }

        @Override // X.InterfaceC1543050qFz
        public final InterfaceC1538820q9A LIZIZ(C1537480q70 c1537480q70) {
            C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
            InterfaceC1075390e5h interfaceC1075390e5h = (InterfaceC1075390e5h) C1075530e5v.LIZIZ().LIZIZ(InterfaceC1075390e5h.class, c1537480q70.bidFrom);
            if (interfaceC1075390e5h != null) {
                return interfaceC1075390e5h.LIZIZ();
            }
            return null;
        }
    };
    public InterfaceC1541780qDw LIZJ = new C1547230qMj();
    public final C0WTD LIZLLL = new C0WTD();

    @Override // X.InterfaceC1541510qDV
    public InterfaceC1536300q56 LIZ() {
        return null;
    }

    @Override // X.InterfaceC1541510qDV
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1541510qDV
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC1541510qDV
    public final void LJ() {
        this.LIZJ = null;
    }

    @Override // X.InterfaceC1541510qDV
    public final boolean LJII() {
        return true;
    }

    @Override // X.InterfaceC1541510qDV
    public final String name() {
        return "default";
    }

    @Override // X.InterfaceC1541510qDV
    public final InterfaceC1541780qDw LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1541510qDV
    public final InterfaceC1541770qDv LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1541510qDV
    public final InterfaceC1543050qFz LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1541510qDV
    public InterfaceC1059260dfg LJIIIIZZ() {
        return this.LIZLLL;
    }
}
