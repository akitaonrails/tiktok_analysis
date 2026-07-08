package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1543840qHG extends AbstractC1543580qGq implements InterfaceC1543240qGI {
    public final InterfaceC1544190qHp LIZIZ;
    public final C789070UxN LIZJ;

    public abstract C1543910qHN LJIIL(String str);

    public abstract Pair<String, AbstractC1544900qIy> LJIILIIL(C1543910qHN c1543910qHN, C1543440qGc c1543440qGc);

    public abstract String LJIILJJIL();

    public abstract void LJIILLIIL(String str, JSONObject jSONObject);

    @Override // X.AbstractC1543580qGq
    public void LJIIIIZZ() {
        InterfaceC1544190qHp interfaceC1544190qHp = this.LIZ.LJ;
        if (interfaceC1544190qHp != null) {
            interfaceC1544190qHp.LJI(this, LJIILJJIL());
        }
    }

    public AbstractC1543840qHG(C1543190qGD c1543190qGD) {
        super(c1543190qGD);
        this.LIZIZ = c1543190qGD.LJ;
        this.LIZJ = C1543410qGZ.LJIIL;
    }

    public static boolean LJIIJJI(C1543910qHN c1543910qHN) {
        String url;
        ArrayList<String> arrayList = C1543410qGZ.LJIJJLI.LIZIZ;
        if (arrayList != null) {
            for (String str : arrayList) {
                if (Intrinsics.LJFF(str, "*")) {
                    return true;
                }
                InterfaceC1544190qHp interfaceC1544190qHp = c1543910qHN.LIZ.LJ;
                if (interfaceC1544190qHp != null && (url = interfaceC1544190qHp.getUrl()) != null && a0.LJJIIZI(url, str, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1543240qGI
    public final void LJFF(C1543440qGc c1543440qGc, final C1543910qHN c1543910qHN) {
        WebView webViewLIZ;
        if (!C1544000qHW.LJIIJ) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBridgeResult,result:");
            sbLIZ.append(c1543440qGc);
            sbLIZ.append(",call:");
            sbLIZ.append(c1543910qHN);
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        }
        if (c1543910qHN == null) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onBridgeResult,result:");
            sbLIZ2.append(c1543440qGc);
            sbLIZ2.append(",call:");
            sbLIZ2.append(c1543910qHN);
            C2188811AlT.LIZIZ(sbLIZ2);
            InterfaceC1297560js2 interfaceC1297560js22 = C1543410qGZ.LJIIIZ;
            return;
        }
        try {
            C1543190qGD c1543190qGD = this.LIZ;
            c1543190qGD.LIZLLL.LIZIZ(c1543440qGc, c1543910qHN, c1543190qGD);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Pair<String, AbstractC1544900qIy> pairLJIILIIL = LJIILIIL(c1543910qHN, c1543440qGc);
            String first = pairLJIILIIL.getFirst();
            AbstractC1544900qIy second = pairLJIILIIL.getSecond();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            c1543910qHN.LJJIIZ = jCurrentTimeMillis;
            c1543910qHN.LJJIIZI = jCurrentTimeMillis2;
            this.LIZ.LIZLLL.LIZJ(c1543910qHN, c1543440qGc);
            if (!C1543410qGZ.LJIJJLI.LIZ) {
                ValueCallback<String> valueCallback = new ValueCallback() { // from class: X.0qHl
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        C1543910qHN c1543910qHN2 = c1543910qHN;
                        c1543910qHN2.LJJIJ = (String) obj;
                        C1543190qGD c1543190qGD2 = this.LIZ;
                        c1543190qGD2.LIZLLL.LIZLLL(c1543190qGD2, c1543910qHN2);
                    }
                };
                InterfaceC1544190qHp interfaceC1544190qHp = this.LIZIZ;
                if (interfaceC1544190qHp != null) {
                    interfaceC1544190qHp.LJII(first, valueCallback, second);
                }
            } else if (c1543910qHN.LJJI == EnumC045700El.ALL && LJIIJJI(c1543910qHN)) {
                C1543190qGD c1543190qGD2 = this.LIZ;
                c1543190qGD2.LIZLLL.LIZLLL(c1543190qGD2, c1543910qHN);
            } else if (c1543910qHN.LJJI == EnumC045700El.ONLY_SUCCESS && LJIIJJI(c1543910qHN) && c1543440qGc.LIZ()) {
                C1543190qGD c1543190qGD3 = this.LIZ;
                c1543190qGD3.LIZLLL.LIZLLL(c1543190qGD3, c1543910qHN);
            } else {
                ValueCallback<String> valueCallback2 = new ValueCallback() { // from class: X.0qHm
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        C1543910qHN c1543910qHN2 = c1543910qHN;
                        c1543910qHN2.LJJIJ = (String) obj;
                        C1543190qGD c1543190qGD4 = this.LIZ;
                        c1543190qGD4.LIZLLL.LIZLLL(c1543190qGD4, c1543910qHN2);
                    }
                };
                InterfaceC1544190qHp interfaceC1544190qHp2 = this.LIZIZ;
                if (interfaceC1544190qHp2 != null) {
                    interfaceC1544190qHp2.LJII(first, valueCallback2, second);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("jsb_status_code", Integer.valueOf(c1543440qGc.LIZJ(c1543910qHN).optInt("code")));
            InterfaceC1544190qHp interfaceC1544190qHp3 = this.LIZIZ;
            if (interfaceC1544190qHp3 != null) {
                webViewLIZ = interfaceC1544190qHp3.LIZ();
            } else {
                webViewLIZ = null;
            }
            LJIIZILJ(webViewLIZ, c1543910qHN, C2097608Jq.LJIIZILJ(linkedHashMap), 200);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC1543580qGq
    public final void LJIIIZ(Object obj, String str) {
        JSONObject jSONObject;
        this.LIZ.LIZLLL.LJI(obj, str);
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        LJIILLIIL(str, jSONObject);
        this.LIZ.LIZLLL.LJFF(obj, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r8, int r9, X.C1544070qHd r10) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1543840qHG.LJIILL(java.lang.String, int, X.0qHd):void");
    }

    public static void LJIIZILJ(WebView webView, C1543910qHN c1543910qHN, Map map, int i) {
        C1543190qGD c1543190qGD;
        C1543410qGZ c1543410qGZ;
        InterfaceC1544420qIC interfaceC1544420qIC;
        if (c1543910qHN != null && (c1543190qGD = c1543910qHN.LIZ) != null && (c1543410qGZ = c1543190qGD.LIZ) != null && (interfaceC1544420qIC = c1543410qGZ.LJI) != null && !interfaceC1544420qIC.LIZJ(webView) && c1543910qHN.LJ.length() > 0 && C1544000qHW.LJII) {
            int i2 = c1543910qHN.LJJIII;
            if (i2 == 1 || i2 == 2) {
                ((WebViewMonitorHelper) WebViewMonitorHelper.getInstance()).updateJsbInfo(webView, c1543910qHN.LJ, Integer.valueOf(i), map);
            }
        }
    }
}
