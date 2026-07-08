package X;

import android.net.Uri;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import defpackage.k0;
import defpackage.l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068840dv8 {
    public static String LIZIZ;
    public static WeakReference<WebView> LIZJ;
    public static final C1068840dv8 LIZ = new C1068840dv8();
    public static final HashMap<String, Boolean> LIZLLL = new HashMap<>();
    public static final HashMap<String, Boolean> LJ = new HashMap<>();
    public static List<String> LJFF = new ArrayList();

    public static JSONArray LIZIZ() {
        JSONObject jSONObject;
        JSONArray jSONArrayNames;
        String strLIZJ = LIZJ();
        if ((strLIZJ == null || strLIZJ.length() == 0) || (jSONArrayNames = (jSONObject = new JSONObject(strLIZJ)).names()) == null || jSONArrayNames.length() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int length = jSONArrayNames.length();
        for (int i = 0; i < length; i++) {
            String strOptString = jSONArrayNames.optString(i);
            String strOptString2 = jSONObject.optString(strOptString);
            if (strOptString2 != null && strOptString2.length() != 0) {
                jSONArray.put(strOptString);
            }
        }
        if (jSONArray.length() != 0) {
            return jSONArray;
        }
        return null;
    }

    public static String LIZJ() {
        return ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIILIIL();
    }

    public static final void LIZ(boolean z) {
        WebView webView;
        WeakReference<WebView> weakReference = LIZJ;
        if (weakReference != null && (webView = weakReference.get()) != null) {
            if (z) {
                C1544770qIl.LIZ(webView, new k0() { // from class: X.0dv9
                    @Override // X.AbstractC1544900qIy
                    public final void LJIIJJI(Object obj) {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("autofillJSCallback, AbsTtopAutofillCallback onReceiveSuccess, data:");
                        sbLIZ.append(obj);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView2) {
                        String strLIZJ;
                        C1068840dv8.LIZ.getClass();
                        List<String> list = C1068840dv8.LJFF;
                        if (list != null && !list.isEmpty() && (strLIZJ = C1068840dv8.LIZJ()) != null) {
                            JSONObject jSONObject = new JSONObject(strLIZJ);
                            jSONObject.remove("is_default");
                            return C786410Ut5.J3(jSONObject);
                        }
                        return null;
                    }

                    @Override // X.AbstractC1544900qIy
                    public final void LJIIJ(int i, Object obj, String str) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("autofillJSCallback, AbsTtopAutofillCallback onReceiveFailure, code:");
                        sbLIZ.append(i);
                        sbLIZ.append(", msg:");
                        sbLIZ.append(str);
                        C1720106oR.LIZ("TtopAutofillManager", C2188811AlT.LIZIZ(sbLIZ));
                    }
                });
            }
            C1544770qIl.LIZ(webView, new l0() { // from class: X.0dvA
                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView2) {
                    return null;
                }

                @Override // X.AbstractC1544900qIy
                public final void LJIIJJI(Object obj) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("autofillJSCallback, AbsTtopAutofillpopupClose onReceiveSuccess, data:");
                    sbLIZ.append(obj);
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC1544900qIy
                public final void LJIIJ(int i, Object obj, String str) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("autofillJSCallback, AbsTtopAutofillpopupClose onReceiveFailure, code:");
                    sbLIZ.append(i);
                    sbLIZ.append(", msg:");
                    sbLIZ.append(str);
                    C1720106oR.LIZ("TtopAutofillManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
    }
}
