package X;

import Y.ARunnableS67S0300000_34;
import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.ies.web.jsbridge2.WebViewBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BM0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BM0 {
    public final AbstractC2204751BQr LIZ;
    public final IESJsBridge LIZIZ;
    public final C2204781BQu LIZJ;
    public final Map<String, C1BRC> LIZLLL = new LinkedHashMap();
    public final Set<String> LJ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1BQu] */
    public C1BM0(WebView webView, C2204711BQn c2204711BQn) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.LJ = copyOnWriteArraySet;
        AbstractC2204751BQr abstractC2204751BQr = c2204711BQn.LIZ;
        this.LIZ = abstractC2204751BQr;
        IESJsBridge iESJsBridge = new IESJsBridge(webView);
        iESJsBridge.LJ = true;
        this.LIZIZ = iESJsBridge;
        if (abstractC2204751BQr instanceof WebViewBridge) {
            final WebViewBridge webViewBridge = (WebViewBridge) abstractC2204751BQr;
            this.LIZJ = new InterfaceC1051760dTa(webViewBridge, copyOnWriteArraySet) { // from class: X.1BQu
                public final Set<String> LL;
                public final WebViewBridge LLILLJJLI;

                {
                    this.LL = copyOnWriteArraySet;
                    this.LLILLJJLI = webViewBridge;
                }

                @Override // X.InterfaceC1051760dTa
                public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) throws JSONException {
                    if (this.LL.contains(c1058910df7.LIZJ)) {
                        jSONObject.put("code", "-1");
                        return;
                    }
                    c1058910df7.LJIIJJI = false;
                    C1BR2 c1br2 = new C1BR2();
                    c1br2.LIZJ = c1058910df7.LIZJ;
                    c1br2.LIZIZ = c1058910df7.LIZ;
                    c1br2.LIZLLL = C786410Ut5.J3(c1058910df7.LIZLLL);
                    c1br2.LJ = c1058910df7.LIZIZ;
                    c1br2.LIZ = String.valueOf(c1058910df7.LJ);
                    c1br2.LJFF = c1058910df7.LJFF;
                    c1br2.LJI = c1058910df7.LJI;
                    C2204761BQs c2204761BQs = new C2204761BQs(c1br2);
                    WebViewBridge webViewBridge2 = this.LLILLJJLI;
                    if (!webViewBridge2.LJFF) {
                        C2204811BQx c2204811BQx = new C2204811BQx();
                        c2204811BQx.LIZLLL();
                        c2204811BQx.LIZ = "label_pre_call_origin_url";
                        webViewBridge2.LIZLLL.execute(new ARunnableS67S0300000_34(c2204761BQs, c2204811BQx.LIZIZ(), webViewBridge2, 5));
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Legacy call forwarded to new bridge: ");
                    sbLIZ.append(c1058910df7.toString());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            };
        } else {
            this.LIZJ = null;
        }
    }
}
