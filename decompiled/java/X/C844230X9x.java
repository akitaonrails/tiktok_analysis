package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0X9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844230X9x implements InterfaceC2178151AMj {
    public final Context LIZ;
    public WebView LIZIZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZJ;
    public InterfaceC844240X9y LIZLLL;
    public HashMap<String, Object> LJ;

    @Override // X.InterfaceC2178151AMj
    public final void LJJIII(String str) {
    }

    @Override // X.InterfaceC2178151AMj
    public final void destroy() {
    }

    @Override // X.InterfaceC2178151AMj
    public final WebView LIZ() {
        ViewGroup viewGroup;
        WebView webView = this.LIZIZ;
        if (webView != null && webView.getParent() != null) {
            WebView webView2 = this.LIZIZ;
            ViewParent parent = webView2 != null ? webView2.getParent() : null;
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LIZIZ, viewGroup);
            }
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2178151AMj
    public final void LJJI() {
        String string;
        Object obj;
        if (this.LIZIZ != null) {
            return;
        }
        HashMap<String, Object> map = this.LJ;
        if (map == null || (obj = map.get("src")) == null || (string = obj.toString()) == null) {
            string = "aweme://webview/?url=about:blank&tt_dfid=268439551";
        }
        if (this.LIZJ == null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = this.LIZ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(string);
            sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0X9u
                @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    if (interfaceC1531560pxS instanceof C1541480qDS) {
                        final C844230X9x c844230X9x = this.LLILLJJLI;
                        ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.0X9t
                            @Override // X.AbstractC2205961BVi
                            public final void onPageCommitVisible(WebView webView, String str) {
                                super.onPageCommitVisible(webView, str);
                                if (webView != null) {
                                    c844230X9x.getClass();
                                    C844230X9x.LIZIZ(webView);
                                }
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C807670VmH(webView, c844230X9x, null), 3);
                            }

                            @Override // X.AbstractC2205961BVi
                            public final void onPageFinished(WebView webView, String str) {
                                super.onPageFinished(webView, str);
                                if (webView != null) {
                                    c844230X9x.getClass();
                                    C844230X9x.LIZIZ(webView);
                                }
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C807680VmI(webView, c844230X9x, null), 3);
                            }

                            @Override // X.AbstractC2205961BVi
                            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                int errorCode;
                                super.onReceivedError(webView, webResourceRequest, webResourceError);
                                InterfaceC844240X9y interfaceC844240X9y = c844230X9x.LIZLLL;
                                if (interfaceC844240X9y != null) {
                                    if (webResourceError != null) {
                                        errorCode = webResourceError.getErrorCode();
                                        CharSequence description = webResourceError.getDescription();
                                        if (description == null || (string = description.toString()) == null) {
                                        }
                                        interfaceC844240X9y.LIZIZ(errorCode, string);
                                    }
                                    errorCode = -1;
                                    String string2 = "";
                                    interfaceC844240X9y.LIZIZ(errorCode, string2);
                                }
                            }
                        };
                    }
                }
            });
            c1537900q7g.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            this.LIZJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZJ;
        InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() : null;
        this.LIZIZ = kitView instanceof WebView ? (WebView) kitView : null;
    }

    @Override // X.InterfaceC2178151AMj
    public final void reload() {
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.reload();
    }

    public C844230X9x(Context context) {
        this.LIZ = context;
    }

    public static void LIZIZ(WebView webView) {
        C1544770qIl.LIZ(webView, new C0X8L() { // from class: X.0X8M
            @Override // X.AbstractC1544900qIy
            public final void LJIIJ(int i, Object obj, String str) {
            }

            @Override // X.AbstractC1544900qIy
            public final void LJIIJJI(Object obj) {
            }
        });
    }

    @Override // X.InterfaceC2178151AMj
    public final void LJJ(String str) throws JSONException {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(null, str, false);
        }
    }

    @Override // X.InterfaceC2178151AMj
    public final void LJJIFFI(String str) {
        WebView webView = this.LIZIZ;
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    @Override // X.InterfaceC2178151AMj
    public final void LJJII(C2178141AMi c2178141AMi) {
        this.LIZLLL = c2178141AMi;
    }

    @Override // X.InterfaceC2178151AMj
    public final void setParams(HashMap<String, Object> map) {
        this.LJ = map;
    }
}
