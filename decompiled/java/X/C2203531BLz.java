package X;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS225S0000000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203531BLz {
    public static final /* synthetic */ int LJIIJ = 0;
    public final WeakReference<WebView> LIZ;
    public AbstractC1056750dbd LIZIZ;
    public IESJsBridge LIZJ;
    public C1BM0 LJ;
    public C2204711BQn LJFF;
    public boolean LJI;
    public C2198811B3v LJII;
    public boolean LIZLLL = true;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(296));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(281));

    public final void LIZ() {
        IESJsBridge iESJsBridge = this.LIZJ;
        if (iESJsBridge != null) {
            WebView webView = iESJsBridge.LIZ;
            if (webView != null) {
                C1543920qHO.LIZ(webView);
            }
            iESJsBridge.LIZ = null;
            Handler handler = iESJsBridge.LJII;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            iESJsBridge.getClass();
            iESJsBridge.LIZLLL = null;
        }
        C2204711BQn c2204711BQn = this.LJFF;
        if (c2204711BQn == null || c2204711BQn.LIZLLL) {
            return;
        }
        c2204711BQn.LIZ.LJIIJ();
        c2204711BQn.LIZLLL = true;
        for (C1BMI c1bmi : (ArrayList) c2204711BQn.LIZJ) {
            if (c1bmi != null) {
                c1bmi.LJIIJJI();
            }
        }
    }

    public C2203531BLz(WeakReference<WebView> weakReference) {
        this.LIZ = weakReference;
    }

    public final void LIZIZ(String str, final InterfaceC1051760dTa interfaceC1051760dTa) {
        C1BM0 c1bm0 = this.LJ;
        if (c1bm0 != null) {
            C2204781BQu c2204781BQu = c1bm0.LIZJ;
            if (c2204781BQu != null) {
                IESJsBridge iESJsBridge = c1bm0.LIZIZ;
                iESJsBridge.getClass();
                if (!TextUtils.isEmpty(str)) {
                    ((HashMap) iESJsBridge.LIZLLL).put(str, c2204781BQu);
                }
            }
            C1BRC c1brc = new C1BRC(interfaceC1051760dTa) { // from class: X.1BQv
                public final InterfaceC1051760dTa LLILLL;

                {
                    this.LLILLL = interfaceC1051760dTa;
                }

                @Override // X.C1BRC
                public final void LJ(C2204761BQs c2204761BQs, C1BRA c1bra) {
                    C1058910df7 c1058910df7 = new C1058910df7();
                    c1058910df7.LIZJ = c2204761BQs.LIZLLL;
                    c1058910df7.LIZLLL = new JSONObject(c2204761BQs.LJ);
                    c1058910df7.LIZIZ = c2204761BQs.LJFF;
                    c1058910df7.LIZ = c2204761BQs.LIZJ;
                    c1058910df7.LJ = 0;
                    c1058910df7.LJFF = c2204761BQs.LJI;
                    c1058910df7.LJI = c2204761BQs.LJII;
                    c1058910df7.LJIIJJI = true;
                    EnumC1062390dkj enumC1062390dkj = c1bra.LIZIZ;
                    if (enumC1062390dkj != null) {
                        c1058910df7.LJIIJ = enumC1062390dkj.toString();
                    }
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invoking legacy method with: ");
                    sbLIZ.append(c1058910df7.toString());
                    C2188811AlT.LIZIZ(sbLIZ);
                    try {
                        this.LLILLL.call(c1058910df7, jSONObject);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (!c1058910df7.LJIIJJI) {
                        c1058910df7.toString();
                        return;
                    }
                    String strJ3 = C786410Ut5.J3(jSONObject);
                    if (!c1bra.LIZLLL) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Jsb async call already finished: ");
                        sbLIZ2.append(c1bra.LIZ);
                        sbLIZ2.append(", stub: ");
                        sbLIZ2.append(c1bra.hashCode());
                        IllegalStateException illegalStateException = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                        if (C1835380xrU.LIZ) {
                            throw illegalStateException;
                        }
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Jsb async call about to finish with response: ");
                    sbLIZ3.append(c1bra.LIZ);
                    sbLIZ3.append(", stub: ");
                    sbLIZ3.append(c1bra.hashCode());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1BRE c1bre = (C1BRE) c1bra.LIZJ;
                    if (strJ3 != null) {
                        AbstractC2204751BQr abstractC2204751BQr = c1bre.LIZIZ.LJIIIZ;
                        if (abstractC2204751BQr != null) {
                            abstractC2204751BQr.LIZJ(strJ3, c1bre.LIZ);
                        }
                    } else {
                        c1bre.getClass();
                    }
                    c1bra.LIZLLL = false;
                    if (!C1835380xrU.LIZ) {
                        return;
                    }
                    if (jSONObject.optInt("code", 0) == 1) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Method succeed with: ");
                        sbLIZ4.append(c1058910df7.toString());
                        C2188811AlT.LIZIZ(sbLIZ4);
                        return;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("No need for callback, but error occurred: ");
                    sbLIZ5.append(c1058910df7.toString());
                    C2188811AlT.LIZIZ(sbLIZ5);
                }
            };
            C2204741BQq c2204741BQq = c1bm0.LIZ.LJII;
            c2204741BQq.getClass();
            c1brc.LL = str;
            ((HashMap) c2204741BQq.LIZJ).put(str, c1brc);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JsBridge raw method registered: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c1bm0.LIZLLL.put(str, c1brc);
            return;
        }
        IESJsBridge iESJsBridge2 = this.LIZJ;
        if (iESJsBridge2 == null || TextUtils.isEmpty(str) || interfaceC1051760dTa == null) {
            return;
        }
        ((HashMap) iESJsBridge2.LIZLLL).put(str, interfaceC1051760dTa);
    }
}
