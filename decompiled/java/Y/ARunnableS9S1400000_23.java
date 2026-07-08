package Y;

import X.C1520960pgM;
import X.C1521180pgi;
import X.C1521190pgj;
import X.C1521200pgk;
import X.C1521730phb;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS9S1400000_23 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportPageLatestData : ");
            sbLIZ.append(this.s0);
            C1521730phb.LIZ("WebViewMonitorJsBridge", C2188811AlT.LIZIZ(sbLIZ));
            ((WebViewMonitorJsBridge) ((ARunnableS28S1100000_23) this.l4).l1).webViewViewSession.LJIILJJIL((JSONObject) this.l1);
            ((WebViewMonitorJsBridge) ((ARunnableS28S1100000_23) this.l4).l1).webViewViewSession.LJIILJJIL((JSONObject) this.l2);
            C1521180pgi navigationManager = ((WebViewMonitorJsBridge) ((ARunnableS28S1100000_23) this.l4).l1).getNavigationManager();
            if (navigationManager != null) {
                navigationManager.LJIIZILJ();
            }
            if (((JSONObject) this.l3).length() > 0) {
                ((WebViewMonitorJsBridge) ((ARunnableS28S1100000_23) this.l4).l1).webViewViewSession.LJIILJJIL((JSONObject) this.l3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    public static final void run$0(ARunnableS9S1400000_23 aRunnableS9S1400000_23) {
        boolean zLIZ;
        C1521200pgk c1521200pgkLIZJ;
        C1C7U.LIZ("WebViewMonitorHelper@53f1.updateJsbInfo$1");
        try {
            C1521190pgj c1521190pgj = ((WebViewMonitorHelper) aRunnableS9S1400000_23.l4).impl;
            WebView webView = (WebView) aRunnableS9S1400000_23.l1;
            c1521190pgj.getClass();
            if ((webView instanceof WebView) && (c1521200pgkLIZJ = C1521190pgj.LIZJ(webView)) != null) {
                T t = c1521200pgkLIZJ.LLJIJIL;
                if (t instanceof C1521180pgi) {
                    ((C1521180pgi) t).LJIILIIL(((Integer) aRunnableS9S1400000_23.l2).intValue(), aRunnableS9S1400000_23.s0, new JSONObject((Map) aRunnableS9S1400000_23.l3));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WebViewMonitorHelper@53f1.updateJsbInfo$1");
    }

    public static final void run$1(ARunnableS9S1400000_23 aRunnableS9S1400000_23) {
        boolean zLIZ;
        C1C7U.LIZ("WebViewMonitorJsBridge@6e17.reportPageLatestData$1$1");
        try {
            aRunnableS9S1400000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WebViewMonitorJsBridge@6e17.reportPageLatestData$1$1");
    }

    public ARunnableS9S1400000_23(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l4 = obj;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
