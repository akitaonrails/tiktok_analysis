package X;

import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BUH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUH extends C1BUI {
    public WebView LJI;
    public Long LJII;
    public final Map<String, C1045900dK8> LJIIIIZZ;
    public final String LJIIIZ;

    public C1BUH(String str, Map<String, C1045900dK8> map, String str2) {
        super(str);
        this.LJII = null;
        this.LJIIIIZZ = map;
        this.LJIIIZ = str2;
    }

    @Override // X.C1BUI
    public final void LJII() {
        WebView webView = new WebView(C1BUO.LIZIZ.LIZ);
        this.LJI = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.LJI.getSettings().setAllowContentAccess(false);
        this.LJI.getSettings().setAllowFileAccess(false);
        C786410Ut5.te(this.LJI, new WebViewClient() { // from class: X.1BUK
            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (this.LIZ.LJI() == webView2) {
                    C1BUH c1buh = this.LIZ;
                    c1buh.getClass();
                    c1buh.LIZIZ = new C1BUN(null);
                }
                webView2.destroy();
                return true;
            }
        });
        this.LIZIZ = new C1BUN(this.LJI);
        C1287860jcO.LIZIZ(this.LJI, this.LJIIIZ);
        for (String str : this.LJIIIIZZ.keySet()) {
            String externalForm = this.LJIIIIZZ.get(str).LIZIZ.toExternalForm();
            WebView webView2 = this.LJI;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                C1287860jcO.LIZIZ(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.LJII = Long.valueOf(System.nanoTime());
    }

    @Override // X.C1BUI
    public final void LJFF() {
        super.LJFF();
        C786410Ut5.LJLIIL(Math.max(4000 - (this.LJII == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.LJII.longValue(), TimeUnit.NANOSECONDS)), 2000L), new BPEAHandler(), new Runnable(this) { // from class: X.1BUJ
            public final WebView LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("b@25b0.b$1");
                try {
                    this.LL.destroy();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("b@25b0.b$1");
            }

            {
                this.LL = this.LJI;
            }
        });
        this.LJI = null;
    }

    @Override // X.C1BUI
    public final void LIZJ(C1BUP c1bup, C1046930dLn c1046930dLn) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(c1046930dLn.LIZLLL);
        for (String str : mapUnmodifiableMap.keySet()) {
            C1045900dK8 c1045900dK8 = (C1045900dK8) mapUnmodifiableMap.get(str);
            c1045900dK8.getClass();
            JSONObject jSONObject2 = new JSONObject();
            C1287890jcR.LIZIZ(jSONObject2, "vendorKey", c1045900dK8.LIZ);
            C1287890jcR.LIZIZ(jSONObject2, "resourceUrl", c1045900dK8.LIZIZ.toString());
            C1287890jcR.LIZIZ(jSONObject2, "verificationParameters", c1045900dK8.LIZJ);
            C1287890jcR.LIZIZ(jSONObject, str, jSONObject2);
        }
        LIZLLL(c1bup, c1046930dLn, jSONObject);
    }
}
