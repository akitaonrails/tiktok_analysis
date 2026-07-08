package X;

import Y.ARunnableS123S0100000_23;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521200pgk extends AbstractC1514820pWS<C1521180pgi> {
    public final C1521190pgj LLJILLL;
    public final WeakReference<WebView> LLJJ;
    public boolean LLJJI;
    public final String LLJJIII;
    public C1521250pgp LLJJIJI;
    public EnumC1521270pgr LLJJIJIIJIL;
    public final HashMap<EnumC1521270pgr, Long> LLJJIJIL;
    public int LLJJJ;
    public final HashMap<String, Long> LLJJJIL;
    public ViewOnAttachStateChangeListenerC1521440ph8 LLJJJJ;
    public final HashMap<String, Integer> LLJJJJJIL;
    public C1286970jax LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public final int LLJLIL;
    public final int LLJLILLLLZIIL;
    public final int LLJLL;
    public final int LLJLLIL;
    public boolean LLJLLL;
    public final List<AbstractC1039540d9s> LLJZ;
    public final EnumC1520910pgH LLJZIJLIL;

    public final void LJIIJ() {
        C1522170piJ<C1520560pfi> c1522170piJLIZJ;
        if (this.LLJLLL) {
            return;
        }
        this.LLJLLL = true;
        LJIILLIIL(true);
        LJIILIIL();
        T t = this.LLJIJIL;
        if (t != 0 && (c1522170piJLIZJ = t.LIZJ()) != null) {
            c1522170piJLIZJ.LIZIZ();
        }
        C786410Ut5.LJLIIL(150L, C824310WVh.LIZ, new C0W89(new ARunnableS123S0100000_23(this, 13)));
    }

    public final String LJIIJJI() {
        String str;
        Object c098200Yq;
        T t = this.LLJIJIL;
        if (t == 0 || (str = t.LLILZ) == null) {
            str = "";
        }
        if (!a0.LJJJIL(str)) {
            return str;
        }
        try {
            WebView webViewLJIIL = LJIIL();
            c098200Yq = webViewLJIIL != null ? webViewLJIIL.getUrl() : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        String strValueOf = String.valueOf(c098200Yq);
        if (!a0.LJJJIL(strValueOf)) {
            return strValueOf;
        }
        Object obj = ((LinkedHashMap) this.LLILLL).get("schema");
        String strLIZ = C08HX.LIZ(obj instanceof String ? (String) obj : null, "url");
        return a0.LJJJIL(strLIZ) ^ true ? strLIZ : "";
    }

    public final WebView LJIIL() {
        View view = this.LL.get();
        if (view == null || !(view instanceof WebView)) {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("MonitorViewSession", "view is null or not lynxview");
            view = null;
        }
        return (WebView) view;
    }

    public final void LJIILIIL() {
        String strLJ;
        Bitmap.Config config;
        int i;
        C1491690ov9 c1491690ov9LIZLLL;
        T t = this.LLJIJIL;
        Object obj = null;
        if (t != 0 && (c1491690ov9LIZLLL = t.LIZLLL()) != null) {
            c1491690ov9LIZLLL.LIZIZ(EnumC1521270pgr.BLANK_DETECT_START, null);
        }
        C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("blank", null);
        WebView webViewLJIIL = LJIIL();
        C1521180pgi c1521180pgi = (C1521180pgi) this.LLJIJIL;
        if (c1521180pgi != null) {
            C2119208Ry.LIZIZ(c1521180pgi.LLJJIJIL.LIZIZ, "blank_check", null, null);
        }
        EnumC1521270pgr enumC1521270pgr = this.LLJJIJIIJIL;
        if ((enumC1521270pgr != null ? enumC1521270pgr.ordinal() : EnumC1521270pgr.CREATED.ordinal()) >= EnumC1521270pgr.DESTROYED.ordinal() || webViewLJIIL == null || webViewLJIIL.getUrl() == null || Intrinsics.LJFF(webViewLJIIL.getUrl(), "about:blank")) {
            c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.INVALID_CASE);
            return;
        }
        if (EnumC1521240pgo.webBlank.not()) {
            c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
            return;
        }
        if (EnumC1520990pgP.BLANK_SCREEN_OPTIMIZE.isEnabled() && !webViewLJIIL.isAttachedToWindow()) {
            c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.NOT_ATTACHED);
            return;
        }
        T t2 = this.LLJIJIL;
        if (t2 != 0) {
            C1520140pf2 c1520140pf2 = t2.LLJILJILJ;
            String str = t2.LIZLLL().LIZ;
            c1520140pf2.getClass();
            C1514490pVv c1514490pVv = C1514580pW4.LIZLLL;
            if (c1514490pVv != null && c1514490pVv.LIZ) {
                C1491570oux c1491570oux = C1491570oux.LIZ;
                C1514510pVx c1514510pVx = new C1514510pVx(c1520140pf2, "web");
                c1491570oux.getClass();
                C1491570oux.LJIIIZ(str, c1514510pVx);
            }
        }
        JSONObject jSONObject = new JSONObject();
        C1521250pgp c1521250pgp = this.LLJJIJI;
        InterfaceC1521890phr interfaceC1521890phr = c1521250pgp != null ? c1521250pgp.LJII : null;
        EnumC1520990pgP enumC1520990pgP = EnumC1520990pgP.WebBlank;
        ArrayList<String> strListOptions = enumC1520990pgP.getStrListOptions("scope");
        T t3 = this.LLJIJIL;
        if (t3 == 0 || (strLJ = t3.LJ()) == null) {
            strLJ = "";
        }
        boolean z = (a0.LJJJIL(strLJ) ^ true) && strListOptions.contains(strLJ);
        float f = 0.1f;
        if (!z) {
            Object obj2 = ((ConcurrentHashMap) C1322300kVw.LIZ).get(InterfaceC1521760phe.class);
            if (obj2 == null) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot find service implementation of ");
                sbLIZ.append(InterfaceC1521760phe.class);
                C1521730phb.LIZJ("MonitorService", C2188811AlT.LIZIZ(sbLIZ), new Throwable());
            } else if (obj2 instanceof InterfaceC1521760phe) {
                obj = obj2;
            } else {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Internal error, service is not instance of ");
                sbLIZ2.append(InterfaceC1521760phe.class);
                sbLIZ2.append(", is that call register and get in different classloader?");
                C1521730phb.LIZJ("MonitorService", C2188811AlT.LIZIZ(sbLIZ2), new Throwable());
            }
            InterfaceC1521760phe interfaceC1521760phe = (InterfaceC1521760phe) obj;
            if (interfaceC1521760phe != null) {
                LJIIIIZZ(webViewLJIIL, jSONObject, interfaceC1521760phe.detect(webViewLJIIL, 0.1f, Bitmap.Config.ARGB_8888), interfaceC1521890phr, this.LLJLIL);
            }
        } else if (enumC1520990pgP.not()) {
            C12868051u.LJI(jSONObject, "event_type", "blank");
            C12868051u.LJI(jSONObject, "is_blank", 0);
            C12868051u.LJI(jSONObject, "detect_type", Integer.valueOf(this.LLJLILLLLZIIL));
            C12868051u.LJI(jSONObject, "cost_time", 0);
            if (interfaceC1521890phr != null) {
                interfaceC1521890phr.LIZ(0L);
                interfaceC1521890phr.LIZIZ(4, webViewLJIIL);
            }
        } else {
            if (enumC1520990pgP.getIntOption("quality", 0) == 1) {
                config = Bitmap.Config.RGB_565;
                i = this.LLJLLIL;
                f = 0.05f;
            } else {
                config = Bitmap.Config.ARGB_8888;
                i = this.LLJLL;
            }
            Object obj3 = ((ConcurrentHashMap) C1322300kVw.LIZ).get(InterfaceC1521760phe.class);
            if (obj3 == null) {
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Cannot find service implementation of ");
                sbLIZ3.append(InterfaceC1521760phe.class);
                C1521730phb.LIZJ("MonitorService", C2188811AlT.LIZIZ(sbLIZ3), new Throwable());
            } else if (obj3 instanceof InterfaceC1521760phe) {
                obj = obj3;
            } else {
                int i5 = C2187451AjH.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Internal error, service is not instance of ");
                sbLIZ4.append(InterfaceC1521760phe.class);
                sbLIZ4.append(", is that call register and get in different classloader?");
                C1521730phb.LIZJ("MonitorService", C2188811AlT.LIZIZ(sbLIZ4), new Throwable());
            }
            InterfaceC1521760phe interfaceC1521760phe2 = (InterfaceC1521760phe) obj;
            if (interfaceC1521760phe2 != null) {
                LJIIIIZZ(webViewLJIIL, jSONObject, interfaceC1521760phe2.detect(webViewLJIIL, f, config), interfaceC1521890phr, i);
            }
        }
        C1521180pgi c1521180pgi2 = (C1521180pgi) this.LLJIJIL;
        if (c1521180pgi2 != null) {
            c1521180pgi2.LJIJJLI(c1520220pfALIZ, jSONObject);
        }
        int i6 = C2187451AjH.LIZ;
        C1521730phb.LIZ(this.LLJJIII, "handleBlankDetect");
    }

    public final void LJIIZILJ() {
        WebViewMonitorJsBridge webViewMonitorJsBridge = new WebViewMonitorJsBridge(this);
        WebView webViewLJIIL = LJIIL();
        if (webViewLJIIL != null) {
            if (!webViewLJIIL.getSettings().getJavaScriptEnabled()) {
                webViewLJIIL.getSettings().setJavaScriptEnabled(true);
            }
            webViewLJIIL.addJavascriptInterface(webViewMonitorJsBridge, "iesJsBridgeTransferMonitor");
        }
    }

    @Override // X.AbstractC1514820pWS
    public final EnumC1520910pgH LIZJ() {
        return this.LLJZIJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1521200pgk(WebView webView) {
        super(webView);
        C1521190pgj c1521190pgj = C1521190pgj.LIZ;
        this.LLJILLL = c1521190pgj;
        this.LLJJ = new WeakReference<>(webView);
        this.LLJJIII = "WebViewDataManager";
        this.LLJJIJIL = new HashMap<>();
        this.LLJJJIL = new HashMap<>();
        this.LLJJJJJIL = new HashMap<>();
        this.LLJJL = -401;
        this.LLJJLIIIJLLLLLLLZ = -402;
        this.LLJL = -403;
        this.LLJLIL = 4;
        this.LLJLILLLLZIIL = 5;
        this.LLJLL = 6;
        this.LLJLLIL = 7;
        this.LLJZ = new ArrayList();
        this.LLJZIJLIL = EnumC1520910pgH.WEB;
        LIZIZ().LIZ(C1521190pgj.LJIIIIZZ.LIZ);
    }

    public final void LJIIIZ(C1520340pfM c1520340pfM) {
        String str;
        C1520350pfN c1520350pfN;
        final JSONObject jSONObject;
        T t = this.LLJIJIL;
        if (t != 0) {
            t.LIZJ().LIZ(c1520340pfM);
        } else {
            c1520340pfM.onEventTerminated(EnumC1520250pfD.INVALID_CASE);
        }
        String str2 = this.LLILZIL;
        C1520350pfN c1520350pfN2 = c1520340pfM.LJIILIIL;
        if (c1520350pfN2 != null) {
            str = c1520350pfN2.LIZJ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "hybrid_monitor_resource_load") && (c1520350pfN = c1520340pfM.LJIILIIL) != null && (jSONObject = c1520350pfN.LJ) != null) {
            C1491570oux.LJI(C1491570oux.LIZ, str2, new InterfaceC1491630ov3() { // from class: X.0pE1
                @Override // X.InterfaceC1491630ov3
                public final void onReceiveValue(Object obj) {
                    C1491690ov9 c1491690ov9 = (C1491690ov9) obj;
                    if (c1491690ov9 != null) {
                        c1491690ov9.LJ(C2097608Jq.LJIIIIZZ(new Pair("res_load_start", Long.valueOf(jSONObject.optLong("res_load_start", -1L))), new Pair("res_load_start", Long.valueOf(jSONObject.optLong("res_load_finish", -1L)))));
                    }
                }
            });
        }
    }

    public final void LJIILJJIL(JSONObject jSONObject) throws InterruptedException {
        String str;
        if (jSONObject == null) {
            return;
        }
        String strLJIIJ = C1520640pfq.LJIIJ("serviceType", jSONObject);
        if (Intrinsics.LJFF(strLJIIJ, "")) {
            C1521180pgi c1521180pgi = (C1521180pgi) this.LLJIJIL;
            if (c1521180pgi != null) {
                JSONObject jSONObjectLJIILL = C1520640pfq.LJIILL(C1520640pfq.LJIIJ("category", jSONObject));
                JSONObject jSONObjectLJIILL2 = C1520640pfq.LJIILL(C1520640pfq.LJIIJ("metrics", jSONObject));
                JSONObject jSONObjectLJIILL3 = C1520640pfq.LJIILL(C1520640pfq.LJIIJ("timing", jSONObject));
                JSONObject jSONObjectLJIILL4 = C1520640pfq.LJIILL(C1520640pfq.LJIIJ("extra", jSONObject));
                String strLJIIJ2 = C1520640pfq.LJIIJ("bid", jSONObject);
                int iLJFF = C1520640pfq.LJFF("level", jSONObject);
                int iLJFF2 = C1520640pfq.LJFF("canSample", jSONObject);
                boolean zOptBoolean = jSONObject.optBoolean("canSample", true);
                if (!jSONObject.has("level")) {
                    if (jSONObject.has("canSample") && (iLJFF2 == 0 || !zOptBoolean)) {
                        iLJFF = 0;
                    } else {
                        iLJFF = 2;
                    }
                }
                C1520360pfO c1520360pfO = new C1520360pfO(C1520640pfq.LJIIJ("eventName", jSONObject));
                c1520360pfO.LIZLLL = jSONObjectLJIILL;
                c1520360pfO.LJFF = jSONObjectLJIILL4;
                c1520360pfO.LJI = jSONObjectLJIILL3;
                c1520360pfO.LJ = jSONObjectLJIILL2;
                c1520360pfO.LIZIZ(iLJFF);
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                if (!TextUtils.isEmpty(strLJIIJ2)) {
                    c1520350pfNLIZ.LIZIZ = strLJIIJ2;
                }
                C1520340pfM c1520340pfM = new C1520340pfM();
                c1520340pfM.LJIILIIL = c1520350pfNLIZ;
                Map<String, String> map = c1520340pfM.LJ;
                C1521250pgp c1521250pgp = c1521180pgi.LLJJI.LLJJIJI;
                if (c1521250pgp != null) {
                    str = c1521250pgp.LJFF;
                } else {
                    str = null;
                }
                map.put("config_bid", str);
                c1520340pfM.LJ.put("jsb_bid", c1521180pgi.LLJI);
                c1520340pfM.LIZJ();
                c1521180pgi.LIZJ().LIZ(c1520340pfM);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(strLJIIJ, "perf")) {
            C1521180pgi c1521180pgi2 = (C1521180pgi) this.LLJIJIL;
            if (c1521180pgi2 == null) {
                return;
            }
            c1521180pgi2.LJIILJJIL(jSONObject);
            return;
        }
        C1521180pgi c1521180pgi3 = (C1521180pgi) this.LLJIJIL;
        if (c1521180pgi3 == null) {
            return;
        }
        c1521180pgi3.LJIJJ(strLJIIJ, jSONObject);
    }

    public final void LJIILLIIL(boolean z) {
        String str;
        WebView webViewLJIIL = LJIIL();
        if (webViewLJIIL == null) {
            return;
        }
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        webViewLJIIL.evaluateJavascript(C786410Ut5.j4(" javascript: (function () {\n                    var target = {}\n                    if (typeof SlardarHybrid !== 'undefined' && typeof jsIESLiveTimingMonitor !== 'undefined'){\n                    var performacess = SlardarHybrid('getLatestPerformance');\n                    var resourcess = SlardarHybrid('getLatestResource');\n                    var cacheData = SlardarHybrid('flushCacheData');\n                    target.performance = performacess;\n                    target.resource = resourcess;\n                    target.cacheData = cacheData;\n                    target.needReport = %s;\n                    jsIESLiveTimingMonitor.reportPageLatestData(target);}\n                })()", Arrays.copyOf(new Object[]{str}, 1)), null);
    }

    public final void LJII(String str, String str2) {
        C1521180pgi c1521180pgi = (C1521180pgi) this.LLJIJIL;
        if (c1521180pgi != null) {
            c1521180pgi.LLJJIJIL.LIZJ(str2, str);
        }
        C1491690ov9 c1491690ov9LIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("web_context_");
        sbLIZ.append(str);
        c1491690ov9LIZIZ.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    public final void LJIILL(EnumC1521270pgr enumC1521270pgr, C1491690ov9 c1491690ov9) {
        this.LLJJIJIIJIL = enumC1521270pgr;
        this.LLJJIJIL.put(enumC1521270pgr, Long.valueOf(c1491690ov9.LIZIZ(enumC1521270pgr, null)));
    }

    public final void LJIIIIZZ(View view, JSONObject jSONObject, C1521720pha c1521720pha, InterfaceC1521890phr interfaceC1521890phr, int i) {
        int i2;
        boolean z;
        C1520140pf2 c1520140pf2;
        C1491690ov9 c1491690ov9LIZLLL;
        T t = this.LLJIJIL;
        if (t != 0 && (c1491690ov9LIZLLL = t.LIZLLL()) != null) {
            c1491690ov9LIZLLL.LIZIZ(EnumC1521270pgr.BLANK_DETECT_END, null);
        }
        if (interfaceC1521890phr != null) {
            interfaceC1521890phr.LIZ(c1521720pha.LIZIZ);
            interfaceC1521890phr.LIZIZ(c1521720pha.LIZ, view);
        }
        C1521180pgi c1521180pgi = (C1521180pgi) this.LLJIJIL;
        boolean z2 = true;
        if (c1521180pgi != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i3 = c1521720pha.LIZ;
            if (i3 != 1) {
                if (i3 != 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("code:");
                    sbLIZ.append(c1521720pha.LIZJ);
                    sbLIZ.append(", msg:");
                    sbLIZ.append(c1521720pha.LIZLLL);
                    linkedHashMap.put("error_error_msg", C2188811AlT.LIZIZ(sbLIZ));
                    linkedHashMap.put("error_desc", "web blank check fail");
                    C2119208Ry.LIZIZ(c1521180pgi.LLJJIJIL.LIZIZ, "internal_error", linkedHashMap, null);
                } else {
                    linkedHashMap.put("result", CardStruct.IStatusCode.DEFAULT);
                    C2119208Ry.LIZIZ(c1521180pgi.LLJJIJIL.LIZIZ, "blank_result", linkedHashMap, null);
                }
            } else {
                linkedHashMap.put("result", "1");
                C2119208Ry.LIZIZ(c1521180pgi.LLJJIJIL.LIZIZ, "blank_result", linkedHashMap, null);
            }
        }
        T t2 = this.LLJIJIL;
        if (t2 != 0 && (c1520140pf2 = t2.LLJILJILJ) != null) {
            c1520140pf2.LJ = c1521720pha.LJ;
        }
        C12868051u.LJI(jSONObject, "event_type", "blank");
        if (c1521720pha.LIZ == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C12868051u.LJI(jSONObject, "is_blank", Integer.valueOf(i2));
        C12868051u.LJI(jSONObject, "detect_type", Integer.valueOf(i));
        C12868051u.LJI(jSONObject, "cost_time", Long.valueOf(c1521720pha.LIZIZ));
        if (c1521720pha.LIZ == 3) {
            C12868051u.LJI(jSONObject, "error_code", Integer.valueOf(c1521720pha.LIZJ));
            C12868051u.LJI(jSONObject, "error_msg", c1521720pha.LIZLLL);
        }
        C12868051u.LJI(jSONObject, "detect_start_time", Long.valueOf(System.currentTimeMillis() - c1521720pha.LIZIZ));
        JSONObject jSONObject2 = new JSONObject();
        try {
            int i4 = TTNetInit.getNetworkQuality().LIZIZ;
            if (i4 != 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            Integer numValueOf = Integer.valueOf(i4);
            if (boolValueOf != null && boolValueOf.booleanValue()) {
                C12868051u.LJI(jSONObject2, "http_rtt_ms", numValueOf);
            }
            C189200o6.m2constructorimpl(jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            int i5 = TTNetInit.getNetworkQuality().LIZ;
            if (i5 == 0) {
                z2 = false;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            Integer numValueOf2 = Integer.valueOf(i5);
            if (boolValueOf2 != null && boolValueOf2.booleanValue()) {
                C12868051u.LJI(jSONObject2, "transport_rtt_ms", numValueOf2);
            }
            C189200o6.m2constructorimpl(jSONObject2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        C12868051u.LJI(jSONObject, "assist_info", jSONObject2);
    }
}
