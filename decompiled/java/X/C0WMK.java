package X;

import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import android.webkit.WebView;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import com.bytedance.pumbaa.hybrid.governance.navigation.settings.PnsRawWebViewShutdown;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WMK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WMK extends C0WMA<C0WNY> {
    public final List<C0WNY> LIZ = new ArrayList();

    public C0WMK() {
        for (C822010WMl c822010WMl : Collections.singletonList(new C0WNY() { // from class: X.0WMl
            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                if (C0WNK.LIZ == null || System.currentTimeMillis() - C0WNK.LIZIZ > 7200000) {
                    PnsRawWebViewShutdown pnsRawWebViewShutdown = C0WNK.LIZ;
                    if (pnsRawWebViewShutdown == null) {
                        pnsRawWebViewShutdown = new PnsRawWebViewShutdown(null, null, 3, null);
                    }
                    C0WNK.LIZ = (PnsRawWebViewShutdown) C821960WMg.LIZ(PnsRawWebViewShutdown.class, "pns_raw_webview_shutdown", pnsRawWebViewShutdown);
                    C0WNK.LIZIZ = System.currentTimeMillis();
                }
                return C0WNK.LIZ;
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("RawWebViewShutdownAction", C0WN8.NAVIGATION, C0WNE.L3, 0, 24);
            }

            @Override // X.C0WMB
            public final C0WM1 LJ(C0WMD c0wmd) throws JSONException {
                C822090WMt c822090WMt;
                WebView webView;
                String str;
                PnsRawWebViewShutdown pnsRawWebViewShutdown = (PnsRawWebViewShutdown) LIZIZ();
                Object objLIZ = c0wmd.LIZ();
                if (!(objLIZ instanceof C822090WMt) || (c822090WMt = (C822090WMt) objLIZ) == null || !pnsRawWebViewShutdown.enable || (webView = c822090WMt.LIZJ) == null || !c822090WMt.LJFF || c822090WMt.LJ || C800430Vab.LIZ(webView) || (str = c822090WMt.LIZIZ) == null || str.length() == 0 || !u.LJJIIJZLJL(c822090WMt.LIZIZ, "http", false) || !C1110204Vw.LIZ().LIZ(c822090WMt.LIZIZ)) {
                    return null;
                }
                C821970WMh.LIZ().LJ();
                String strLIZ = C2348209Ia.LIZ(c822090WMt.LIZJ);
                String name = c822090WMt.LIZJ.getClass().getName();
                for (String str2 : pnsRawWebViewShutdown.allowViewList) {
                    if (a0.LJJIIZI(name, str2, false) || (strLIZ != null && a0.LJJIIZI(strLIZ, str2, false))) {
                        return null;
                    }
                }
                String str3 = c822090WMt.LIZIZ;
                if (str3.length() != 0) {
                    Iterator<String> it2 = pnsRawWebViewShutdown.allowlist.iterator();
                    while (it2.hasNext()) {
                        if (a0.LJJIIZI(str3, it2.next(), false)) {
                            return null;
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, "raw_webview");
                jSONObject.put("blocked", pnsRawWebViewShutdown.blockEnable ? 1 : 0);
                jSONObject.put("dataflowId", c822090WMt.LIZLLL);
                jSONObject.put("viewName", c822090WMt.LIZJ.getClass().getName());
                jSONObject.put("containerName", strLIZ);
                String strSubstring = c822090WMt.LIZIZ;
                int iLJJIZ = a0.LJJIZ(strSubstring, '?', 0, false, 6);
                if (iLJJIZ != -1) {
                    strSubstring = strSubstring.substring(0, iLJJIZ);
                }
                jSONObject.put("host", strSubstring);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", c822090WMt.LIZIZ);
                jSONObject2.put("viewName", c822090WMt.LIZJ.getClass().getName());
                boolean z = pnsRawWebViewShutdown.blockEnable;
                C822060WMq.LIZ(this, z);
                if (z) {
                    C822100WMu.LIZ(c822090WMt.LIZJ.getContext(), c822090WMt.LIZLLL, c822090WMt.LIZIZ, false);
                    C821850WLv c821850WLv = new C821850WLv(true, null);
                    c821850WLv.LJ = new C821780WLo(EnumC821770WLn.WEB_NAVIGATION_RAW_WEBVIEW_BLOCKED, C2097608Jq.LJIIJ(new Pair("error", new C821880WLy(102, "Raw WebView Blocked"))));
                    return new C0WM1(true, jSONObject, jSONObject2, c821850WLv);
                }
                return new C0WM1(false, jSONObject, jSONObject2, null);
            }
        })) {
            C0WMA.LIZJ(c822010WMl);
            ((ArrayList) this.LIZ).add(c822010WMl);
            C08XD.LJJ(this.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(45), 9));
        }
    }

    @Override // X.C0WMA
    public final List<C0WNY> LIZIZ(C0WMD c0wmd) {
        return C13LP.LLIIII(this.LIZ);
    }
}
