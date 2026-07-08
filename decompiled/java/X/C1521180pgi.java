package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0pgi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521180pgi extends AbstractC1521100pga {
    public final C1521200pgk LLJJI;
    public final String LLJJIII;
    public long LLJJIJI;
    public JSONObject LLJJIJIIJIL;
    public final C1521360ph0 LLJJIJIL;
    public C1491800ovK LLJJJ;
    public C1491810ovL LLJJJIL;
    public final int LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C1521420ph6 LLJL;
    public C1520220pfA LLJLIL;
    public String LLJLILLLLZIIL;
    public final ConcurrentHashMap<String, JSONObject> LLJLL;
    public final ConcurrentHashMap<String, Boolean> LLJLLIL;

    @Override // X.AbstractC1521100pga
    public final InterfaceC1522240piQ LIZ() {
        return new InterfaceC1522240piQ<C1520560pfi>(this) { // from class: X.0pgL
            public static final /* synthetic */ int LIZIZ = 0;
            public final C1521180pgi LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1522240piQ
            public final void LIZIZ(C1520560pfi c1520560pfi) {
                C1520350pfN c1520350pfN;
                String str;
                String str2;
                JSONObject jSONObject;
                String str3;
                String strOptString;
                String str4;
                InterfaceC1520860pgC interfaceC1520860pgC;
                C1520560pfi c1520560pfi2 = c1520560pfi;
                if (c1520560pfi2 instanceof C1520220pfA) {
                    C1520290pfH.LIZ(this.LIZ.LLJJI, c1520560pfi2.LJFF);
                    C1521180pgi c1521180pgi = this.LIZ;
                    c1520560pfi2.LIZJ = c1521180pgi.LLJJI.LLILZIL;
                    c1520560pfi2.LJII = c1521180pgi.LLJJJ;
                    C12868051u.LJFF(c1520560pfi2.LJI, c1521180pgi.LLJJIJIIJIL);
                    Map<String, String> map = c1520560pfi2.LJ;
                    if (C1520370pfP.LIZ(this.LIZ.LLJI)) {
                        strOptString = this.LIZ.LLJI;
                    } else {
                        strOptString = c1520560pfi2.LJI.optString("bid");
                        if (strOptString == null) {
                            strOptString = "__hybrid_default";
                        }
                    }
                    map.put("jsb_bid", strOptString);
                    Map<String, String> map2 = c1520560pfi2.LJ;
                    C1521250pgp c1521250pgp = this.LIZ.LLJJI.LLJJIJI;
                    if (c1521250pgp != null) {
                        str4 = c1521250pgp.LJFF;
                    } else {
                        str4 = null;
                    }
                    map2.put("config_bid", str4);
                    LIZJ(c1520560pfi2);
                    C1521250pgp c1521250pgp2 = this.LIZ.LLJJI.LLJJIJI;
                    if (c1521250pgp2 != null) {
                        interfaceC1520860pgC = c1521250pgp2.LIZJ;
                    } else {
                        interfaceC1520860pgC = null;
                    }
                    C1520730pfz.LIZJ(c1520560pfi2, interfaceC1520860pgC);
                }
                if (c1520560pfi2 instanceof C1520340pfM) {
                    C1520340pfM c1520340pfM = (C1520340pfM) c1520560pfi2;
                    C1520350pfN c1520350pfN2 = c1520340pfM.LJIILIIL;
                    if (c1520350pfN2 != null && (jSONObject = c1520350pfN2.LJII) != null) {
                        C1521250pgp c1521250pgp3 = this.LIZ.LLJJI.LLJJIJI;
                        if (c1521250pgp3 != null) {
                            str3 = c1521250pgp3.LJI;
                        } else {
                            str3 = null;
                        }
                        C12868051u.LJI(jSONObject, "virtual_aid", str3);
                        C12868051u.LJI(jSONObject, "platform", 0);
                    }
                    C1521180pgi c1521180pgi2 = this.LIZ;
                    C1520290pfH.LIZ(c1521180pgi2.LLJJI, c1521180pgi2.LLJJIJIL);
                    C1520350pfN c1520350pfN3 = c1520340pfM.LJIILIIL;
                    if ((c1520350pfN3 == null || (str2 = c1520350pfN3.LIZ) == null || str2.length() == 0) && (c1520350pfN = c1520340pfM.LJIILIIL) != null) {
                        c1520350pfN.LIZ = this.LIZ.LLILZ;
                    }
                    C1521180pgi c1521180pgi3 = this.LIZ;
                    c1520340pfM.LJI = c1521180pgi3.LLJJIJIIJIL;
                    c1520340pfM.LJFF = c1521180pgi3.LLJJIJIL;
                    c1520340pfM.LJII = c1521180pgi3.LLJJI.LIZ();
                    c1520340pfM.LJ.put("jsb_bid", this.LIZ.LLJI);
                    Map<String, String> map3 = c1520340pfM.LJ;
                    C1521250pgp c1521250pgp4 = this.LIZ.LLJJI.LLJJIJI;
                    if (c1521250pgp4 == null || (str = c1521250pgp4.LJFF) == null) {
                        str = "";
                    }
                    map3.put("config_bid", str);
                    c1520340pfM.LIZJ = this.LIZ.LLJJI.LLILZIL;
                    LIZJ(c1520340pfM);
                    C1520730pfz.LIZJ(c1520340pfM, null);
                    C1514690pWF.LIZJ(EnumC1514740pWK.ReceivedCustom, this.LIZ.LLJJI.LLILZIL, c1520340pfM.LJIIIIZZ());
                }
            }

            public final void LIZJ(C1520560pfi c1520560pfi) {
                JSONObject jSONObject;
                C1521250pgp c1521250pgp = this.LIZ.LLJJI.LLJJIJI;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    List<AbstractC1039540d9s> list = this.LIZ.LLJJI.LLJZ;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (ArrayList) list) {
                        if (((AbstractC1039540d9s) obj).LIZIZ == EnumC992310bvh.Tea) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C12868051u.LJFF(jSONObject2, new JSONObject(((AbstractC1039540d9s) it2.next()).LIZ()));
                    }
                    c1520560pfi.LJFF(jSONObject2, "context_for_tea");
                    c1520560pfi.LJFF(this.LIZ.LLJIJIL, "oid");
                    c1520560pfi.LJFF(this.LIZ.LLJLILLLLZIIL, "webview_type");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1520960pgM.LIZIZ(th);
                }
                JSONObject jSONObject3 = c1520560pfi.LJFF.LJI;
                Object[] objArr = new Object[1];
                String str = null;
                if (c1521250pgp != null) {
                    jSONObject = c1521250pgp.LJIIIIZZ;
                } else {
                    jSONObject = null;
                }
                objArr[0] = jSONObject;
                C12868051u.LJFF(jSONObject3, objArr);
                C1521090pgZ c1521090pgZ = c1520560pfi.LJFF;
                if (c1521250pgp != null) {
                    str = c1521250pgp.LJI;
                }
                c1521090pgZ.LJFF = str;
            }

            @Override // X.InterfaceC1522240piQ
            public final /* bridge */ /* synthetic */ void LIZ(C1520560pfi c1520560pfi) {
            }
        };
    }

    public final C1521420ph6 LJIILL() {
        if (this.LLJL == null) {
            this.LLJL = new C1521420ph6(this.LLJJIJIL);
        }
        LJIILLIIL();
        return this.LLJL;
    }

    public final C1520220pfA LJIILLIIL() {
        if (this.LLJLIL == null) {
            C1520220pfA c1520220pfA = new C1520220pfA("perf");
            C1521190pgj c1521190pgj = C1521190pgj.LIZ;
            c1520220pfA.LJFF(C1521190pgj.LJIIJ, "parent_url");
            c1520220pfA.LJFF(Boolean.valueOf(C1521190pgj.LJIIJJI), "first_load");
            c1520220pfA.LIZJ();
            c1520220pfA.LIZLLL();
            this.LLJLIL = c1520220pfA;
        }
        return this.LLJLIL;
    }

    public final void LJIIZILJ() throws JSONException {
        if (this.LLJJJJLIIL) {
            return;
        }
        this.LLJJJJLIIL = true;
        Iterator<Map.Entry<String, JSONObject>> it2 = this.LLJLL.entrySet().iterator();
        while (true) {
            Map<String, Object> mapLJ = null;
            if (!it2.hasNext()) {
                break;
            }
            JSONObject value = it2.next().getValue();
            InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
            WebView webViewLJIIL = this.LLJJI.LJIIL();
            if (value != null) {
                mapLJ = C08HX.LJ(value);
            }
            webViewMonitorHelper.handleJSBPvV2(webViewLJIIL, mapLJ);
        }
        LJIILL().LJIIIIZZ = LIZLLL().LIZIZ(EnumC1521270pgr.ON_PAGE_SHOW_END, null);
        LJJ();
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF(this.LLJJIII, "clearNavigationData");
        LJIL();
        LJJ();
        LIZJ().LIZ(LJIILLIIL());
        LIZJ().LIZIZ();
        C1521500phE c1521500phE = C1521500phE.LIZ;
        WebView webViewLJIIL2 = this.LLJJI.LJIIL();
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        c1521500phE.LIZIZ(webViewLJIIL2, str);
        if (this.LLILZ.length() > 0) {
            C1521190pgj c1521190pgj = C1521190pgj.LIZ;
            C1521190pgj.LJIIIIZZ.LIZLLL(EnumC1521120pgc.WEB_LAST_URL.getKey(), this.LLILZ);
        }
        C1521190pgj c1521190pgj2 = C1521190pgj.LIZ;
        C1521190pgj.LJIIIIZZ.LIZLLL(EnumC1521120pgc.WEB_IS_FIRST_LOAD.getKey(), Boolean.FALSE);
        LJI();
    }

    public final void LJIL() throws JSONException {
        C789630UyH c789630UyH;
        C1521200pgk c1521200pgk = this.LLJJI;
        c1521200pgk.getClass();
        JSONObject jSONObject = new JSONObject();
        C12868051u.LJI(jSONObject, "attach_ts", c1521200pgk.LLJJIJIL.get(EnumC1521270pgr.ATTACHED));
        C12868051u.LJI(jSONObject, "detach_ts", c1521200pgk.LLJJIJIL.get(EnumC1521270pgr.DETACHED));
        C12868051u.LJI(jSONObject, "container_init_ts", c1521200pgk.LLJJIJIL.get(EnumC1521270pgr.CREATED));
        C12868051u.LJI(jSONObject, "container_reuse", Boolean.valueOf(c1521200pgk.LLJJJ > 1));
        C12868051u.LJI(jSONObject, "web_version", c1521200pgk.LLILZLL);
        C1521360ph0 c1521360ph0 = this.LLJJIJIL;
        c1521360ph0.getClass();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            C1520640pfq.LJIILJJIL(c1521360ph0.LJIILJJIL, next, C1520640pfq.LJIIIIZZ(next, jSONObject));
        }
        C1521360ph0 c1521360ph02 = this.LLJJIJIL;
        c1521360ph02.LIZJ = "web";
        c1521360ph02.LJIILIIL = C1521190pgj.LJIIIZ;
        c1521360ph02.LIZ = this.LLILZ;
        c1521360ph02.LJ = C1196780hFU.LIZ();
        C1521360ph0 c1521360ph03 = this.LLJJIJIL;
        c1521360ph03.LJIIL = this.LLJJIJI;
        c1521360ph03.LIZIZ = (String) this.LLILLJJLI.getValue();
        C1521360ph0 c1521360ph04 = this.LLJJIJIL;
        JSONObject jSONObject2 = new JSONObject();
        WebView webViewLJIIL = this.LLJJI.LJIIL();
        if (webViewLJIIL != null) {
            jSONObject2.put("use_ttweb", ((WebViewMonitorHelper) WebViewMonitorHelper.getInstance()).isTTWebViewOk(webViewLJIIL));
        }
        if (c1521360ph04.LJI == null) {
            c1521360ph04.LJI = new JSONObject();
        }
        C1520640pfq.LIZ(c1521360ph04.LJI, jSONObject2);
        WebView webViewLJIIL2 = this.LLJJI.LJIIL();
        if (webViewLJIIL2 != null) {
            C1521360ph0 c1521360ph05 = this.LLJJIJIL;
            Context context = webViewLJIIL2.getContext();
            c1521360ph05.getClass();
            Activity activityLIZ = C20663087p.LIZ(context);
            if (activityLIZ != null) {
                if (C1520380pfQ.LIZJ && (c789630UyH = C1520380pfQ.LIZLLL) != null) {
                    c789630UyH.LIZ(activityLIZ);
                }
                c1521360ph05.LIZLLL = activityLIZ.getClass().getName();
            }
        }
    }

    public final void LJJ() {
        C1520220pfA c1520220pfALJIILLIIL = LJIILLIIL();
        c1520220pfALJIILLIIL.LJII = this.LLJJJ;
        c1520220pfALJIILLIIL.LJIILJJIL = this.LLJJJIL;
        c1520220pfALJIILLIIL.LJFF = this.LLJJIJIL;
        c1520220pfALJIILLIIL.LJIILIIL = LJIILL().LJIILJJIL;
        c1520220pfALJIILLIIL.LIZLLL();
    }

    public C1521180pgi(C1521200pgk c1521200pgk) throws JSONException {
        super(c1521200pgk);
        this.LLJJI = c1521200pgk;
        this.LLJJIII = "NavigationDataManager";
        this.LLJJIJIIJIL = new JSONObject();
        this.LLJJIJIL = new C1521360ph0();
        this.LLJJJJ = 15;
        this.LLJJJJJIL = true;
        String str = "syswebview";
        this.LLJLILLLLZIIL = "syswebview";
        this.LLJLL = new ConcurrentHashMap<>();
        this.LLJLLIL = new ConcurrentHashMap<>();
        C1521950phx monitorContext = WebViewMonitorHelper.getInstance().getMonitorContext();
        c1521200pgk.LJIIL();
        monitorContext.getClass();
        C1521190pgj.LJIIIIZZ.LIZLLL(EnumC1521120pgc.WEB_CORE_TYPE.getKey(), "web");
        Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(c1521200pgk.LLJJJJJIL);
        for (String str2 : mapLJIIZILJ.keySet()) {
            Integer num = (Integer) mapLJIIZILJ.get(str2);
            if (num != null) {
                int iIntValue = num.intValue();
                C1521360ph0 c1521360ph0 = this.LLJJIJIL;
                C1520640pfq.LJIILJJIL(c1521360ph0.LJIILL, str2, Integer.valueOf(iIntValue));
            }
        }
        WebView webViewLJIIL = this.LLJJI.LJIIL();
        if (webViewLJIIL != null) {
            C1520380pfQ.LIZ.getClass();
            InterfaceC1514780pWO interfaceC1514780pWO = C1520380pfQ.LJIIIZ;
            if (interfaceC1514780pWO != null && interfaceC1514780pWO.isTTWebView(webViewLJIIL)) {
                str = "ttwebview";
            }
        }
        this.LLJLILLLLZIIL = str;
        LIZLLL().LIZLLL(EnumC1521110pgb.WEBVIEW_TYPE.getKey(), str);
        this.LLJJJ = this.LLJJI.LIZ();
        C1521200pgk c1521200pgk2 = this.LLJJI;
        c1521200pgk2.getClass();
        this.LLJJJIL = new C1491810ovL(c1521200pgk2.LLILZ);
        LJIL();
    }

    public final void LJIILJJIL(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        boolean z;
        C1521420ph6 c1521420ph6LJIILL = LJIILL();
        if (jSONObject != null) {
            c1521420ph6LJIILL.LIZIZ = new JSONObject();
            c1521420ph6LJIILL.LIZJ = new JSONObject();
            C1520640pfq.LIZ(c1521420ph6LJIILL.LIZIZ, jSONObject.optJSONObject("jsBase"));
            C1520640pfq.LIZ(c1521420ph6LJIILL.LIZJ, jSONObject.optJSONObject("jsInfo"));
        }
        if (!this.LLJJJJLIIL && jSONObject != null) {
            LJIILLIIL().LJI = jSONObject.optJSONObject("jsBase");
            LJIILLIIL().LJIILL = jSONObject.optJSONObject("jsInfo");
            LJIILLIIL().LIZLLL();
            int i = C2187451AjH.LIZ;
            String str = this.LLJJIII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("coverPerf ");
            sbLIZ.append(LJIILLIIL().hashCode());
            C1521730phb.LJFF(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        C1491690ov9 c1491690ov9LIZLLL = LIZLLL();
        if (c1491690ov9LIZLLL != null && jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("jsInfo")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("timing")) != null) {
            long jOptLong = jSONObjectOptJSONObject2.optLong("navigationStart");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Long lValueOf = Long.valueOf(jOptLong);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("web_timing");
            sbLIZ2.append("_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), lValueOf);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("web_timing");
            sbLIZ3.append("_redirect_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), Long.valueOf(jSONObjectOptJSONObject2.optLong("redirectStart")));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("web_timing");
            sbLIZ4.append("_redirect_end");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ4), Long.valueOf(jSONObjectOptJSONObject2.optLong("redirectEnd")));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("web_timing");
            sbLIZ5.append("_unload_event.start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ5), Long.valueOf(jSONObjectOptJSONObject2.optLong("unloadEventStart")));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("web_timing");
            sbLIZ6.append("_unload_event.end");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ6), Long.valueOf(jSONObjectOptJSONObject2.optLong("unloadEventStart")));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("web_timing");
            sbLIZ7.append("_fetch_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ7), Long.valueOf(jSONObjectOptJSONObject2.optLong("fetchStart")));
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("web_timing");
            sbLIZ8.append("_connect_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ8), Long.valueOf(jSONObjectOptJSONObject2.optLong("connectStart")));
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("web_timing");
            sbLIZ9.append("_secure_connection_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ9), Long.valueOf(jSONObjectOptJSONObject2.optLong("secureConnectionStart")));
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("web_timing");
            sbLIZ10.append("_connect_end");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ10), Long.valueOf(jSONObjectOptJSONObject2.optLong("connectEnd")));
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("web_timing");
            sbLIZ11.append("_domain_lookup_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ11), Long.valueOf(jSONObjectOptJSONObject2.optLong("domainLookupStart")));
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("web_timing");
            sbLIZ12.append("_domain_lookup_end");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ12), Long.valueOf(jSONObjectOptJSONObject2.optLong("domainLookupEnd")));
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("web_timing");
            sbLIZ13.append("_request_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ13), Long.valueOf(jSONObjectOptJSONObject2.optLong("requestStart")));
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("web_timing");
            sbLIZ14.append("_response_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ14), Long.valueOf(jSONObjectOptJSONObject2.optLong("responseStart")));
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append("web_timing");
            sbLIZ15.append("_response_end");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ15), Long.valueOf(jSONObjectOptJSONObject2.optLong("responseEnd")));
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append("web_timing");
            sbLIZ16.append("_dom_loading");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ16), Long.valueOf(jSONObjectOptJSONObject2.optLong("domLoading")));
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append("web_timing");
            sbLIZ17.append("_dom_parsed");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ17), Long.valueOf(jSONObjectOptJSONObject.optLong("domparse") + jOptLong));
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append("web_timing");
            sbLIZ18.append("_dom_ready");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ18), Long.valueOf(jSONObjectOptJSONObject.optLong("domready") + jOptLong));
            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
            sbLIZ19.append("web_timing");
            sbLIZ19.append("_dom_interactive");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ19), Long.valueOf(jSONObjectOptJSONObject2.optLong("domInteractive")));
            StringBuilder sbLIZ20 = C2188811AlT.LIZ();
            sbLIZ20.append("web_timing");
            sbLIZ20.append("_dom_content_loaded_event_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ20), Long.valueOf(jSONObjectOptJSONObject2.optLong("domContentLoadedEventStart")));
            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
            sbLIZ21.append("web_timing");
            sbLIZ21.append("_dom_content_loaded_event_end");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ21), Long.valueOf(jSONObjectOptJSONObject2.optLong("domContentLoadedEventEnd")));
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("web_timing");
            sbLIZ22.append("_dom_complete");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ22), Long.valueOf(jSONObjectOptJSONObject2.optLong("domComplete")));
            StringBuilder sbLIZ23 = C2188811AlT.LIZ();
            sbLIZ23.append("web_timing");
            sbLIZ23.append("_load_event_start");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ23), Long.valueOf(jSONObjectOptJSONObject2.optLong("loadEventStart")));
            StringBuilder sbLIZ24 = C2188811AlT.LIZ();
            sbLIZ24.append("web_timing");
            sbLIZ24.append("_load_event_end");
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ24), Long.valueOf(jSONObjectOptJSONObject2.optLong("loadEventEnd")));
            Long lValueOf2 = Long.valueOf(jSONObjectOptJSONObject.optLong("fp"));
            if (lValueOf2.longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long jLongValue = lValueOf2.longValue();
                StringBuilder sbLIZ25 = C2188811AlT.LIZ();
                sbLIZ25.append("web_timing");
                sbLIZ25.append("_fp");
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ25), Long.valueOf(jLongValue + jOptLong));
            }
            Long lValueOf3 = Long.valueOf(jSONObjectOptJSONObject.optLong("fcp"));
            if (lValueOf3.longValue() > 0) {
                long jLongValue2 = lValueOf3.longValue();
                StringBuilder sbLIZ26 = C2188811AlT.LIZ();
                sbLIZ26.append("web_timing");
                sbLIZ26.append("_fcp");
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ26), Long.valueOf(jLongValue2 + jOptLong));
            }
            Long lValueOf4 = Long.valueOf(jSONObjectOptJSONObject.optLong("fmp"));
            if (lValueOf4.longValue() > 0) {
                long jLongValue3 = lValueOf4.longValue();
                StringBuilder sbLIZ27 = C2188811AlT.LIZ();
                sbLIZ27.append("web_timing");
                sbLIZ27.append("_fmp");
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ27), Long.valueOf(jLongValue3 + jOptLong));
            }
            Long lValueOf5 = Long.valueOf(jSONObjectOptJSONObject.optLong("tti"));
            if (lValueOf5.longValue() > 0) {
                long jLongValue4 = lValueOf5.longValue();
                StringBuilder sbLIZ28 = C2188811AlT.LIZ();
                sbLIZ28.append("web_timing");
                sbLIZ28.append("_tti");
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ28), Long.valueOf(jLongValue4 + jOptLong));
            }
            Long lValueOf6 = Long.valueOf(jSONObjectOptJSONObject.optLong("ttfb"));
            if (lValueOf6.longValue() > 0) {
                long jLongValue5 = lValueOf6.longValue();
                StringBuilder sbLIZ29 = C2188811AlT.LIZ();
                sbLIZ29.append("web_timing");
                sbLIZ29.append("_ttfb");
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ29), Long.valueOf(jLongValue5 + jOptLong));
            }
            Long lValueOf7 = Long.valueOf(jSONObjectOptJSONObject.optLong("mpfid"));
            if (lValueOf7.longValue() > 0) {
                long jLongValue6 = lValueOf7.longValue();
                StringBuilder sbLIZ30 = C2188811AlT.LIZ();
                sbLIZ30.append("web_timing");
                sbLIZ30.append("_mpfid");
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ30), Long.valueOf(jLongValue6 + jOptLong));
            }
            Long lValueOf8 = Long.valueOf(jSONObjectOptJSONObject.optLong("actual_fmp"));
            if (lValueOf8.longValue() > 0) {
                linkedHashMap.put("user_fmp", Long.valueOf(jOptLong + lValueOf8.longValue()));
            }
            c1491690ov9LIZLLL.LJ(linkedHashMap);
        }
    }

    public final boolean LJIJ(String str) {
        List listLJJLIIIJILLIZJL;
        if (!this.LLJJJJJIL) {
            return false;
        }
        try {
            String host = UriProtector.parse(str).getHost();
            if (host != null) {
                listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(host, new String[]{e3.d}, 0, 6);
            } else {
                listLJJLIIIJILLIZJL = null;
            }
            String strLIZIZ = "";
            if (listLJJLIIIJILLIZJL != null) {
                int size = listLJJLIIIJILLIZJL.size();
                if (size >= 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) listLJJLIIIJILLIZJL.get(size - 2));
                    sbLIZ.append('.');
                    sbLIZ.append((String) listLJJLIIIJILLIZJL.get(size - 1));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = (String) C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL);
                }
            }
            if (strLIZIZ.length() > 0) {
                C1520380pfQ.LIZ.getClass();
                if (C1520380pfQ.LIZJ().LJIIIZ().contains(strLIZIZ)) {
                    this.LLJJJJJIL = true;
                    return true;
                }
            }
            this.LLJJJJJIL = false;
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
            this.LLJJJJJIL = false;
            return false;
        }
    }

    public final void LJIJI(long j) {
        this.LLJJLIIIJLLLLLLLZ = true;
        LJIILL().LJI = LIZLLL().LIZIZ(EnumC1521270pgr.APP_SDK_INJECTED, Long.valueOf(j));
        LJJ();
    }

    public C1521180pgi(C1521200pgk c1521200pgk, String str) {
        this(c1521200pgk);
        LJIIL(str);
    }

    public final void LJIJJ(String str, JSONObject jSONObject) throws InterruptedException {
        if (str != null && jSONObject != null) {
            String str2 = null;
            C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ(str, null);
            Map<String, String> map = c1520220pfALIZ.LJ;
            C1521250pgp c1521250pgp = this.LLJJI.LLJJIJI;
            if (c1521250pgp != null) {
                str2 = c1521250pgp.LJFF;
            }
            map.put("config_bid", str2);
            c1520220pfALIZ.LJFF = this.LLJJIJIL;
            c1520220pfALIZ.LJIILL = jSONObject.optJSONObject("jsInfo");
            c1520220pfALIZ.LJI = jSONObject.optJSONObject("jsBase");
            this.LLJILJILJ.LJI(c1520220pfALIZ, LIZLLL().LIZ);
            LIZJ().LIZ(c1520220pfALIZ);
            C1521420ph6 c1521420ph6LJIILL = LJIILL();
            if (!TextUtils.isEmpty(str)) {
                C1520640pfq.LJIIJJI(C1520640pfq.LJFF(str, c1521420ph6LJIILL.LJIILIIL) + 1, str, c1521420ph6LJIILL.LJIILIIL);
            }
            if (Intrinsics.LJFF(str, "js_exception")) {
                LIZIZ("js_exception", c1520220pfALIZ.LJIILL);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        LJIILL().LJIIJ = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(X.C1520220pfA r10, org.json.JSONObject r11) throws org.json.JSONException, java.lang.InterruptedException {
        /*
            r9 = this;
            java.lang.String r1 = r10.LIZ
            int r0 = r1.hashCode()
            java.lang.String r7 = "nativeError"
            java.lang.String r6 = "containerError"
            java.lang.String r5 = "blank"
            r4 = 1727072305(0x66f10831, float:5.691207E23)
            r3 = 831602183(0x31913e07, float:4.227107E-9)
            r2 = 93819220(0x5979154, float:1.4253357E-35)
            if (r0 == r2) goto L96
            if (r0 == r3) goto L88
            if (r0 != r4) goto L21
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L8e
        L21:
            X.0ph0 r0 = r9.LLJJIJIL
            r10.LJFF = r0
            X.0pf4 r8 = new X.0pf4
            java.lang.String r1 = r10.LIZ
            if (r11 != 0) goto L86
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L30:
            r8.<init>(r1, r0)
            r10.LJIILIIL = r8
            X.0pf2 r1 = r9.LLJILJILJ
            X.0ov9 r0 = r9.LIZLLL()
            java.lang.String r0 = r0.LIZ
            r1.LJI(r10, r0)
            X.0piJ r0 = r9.LIZJ()
            r0.LIZ(r10)
            X.0ph6 r1 = r9.LJIILL()
            java.lang.String r8 = r10.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L60
            org.json.JSONObject r0 = r1.LJIILIIL
            int r0 = X.C1520640pfq.LJFF(r8, r0)
            org.json.JSONObject r1 = r1.LJIILIIL
            int r0 = r0 + 1
            X.C1520640pfq.LJIIJJI(r0, r8, r1)
        L60:
            java.lang.String r1 = r10.LIZ
            int r0 = r1.hashCode()
            if (r0 == r2) goto L73
            if (r0 == r3) goto L7a
            if (r0 != r4) goto L72
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L80
        L72:
            return
        L73:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L80
            return
        L7a:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L72
        L80:
            java.lang.String r0 = r10.LIZ
            r9.LIZIZ(r0, r11)
            return
        L86:
            r0 = r11
            goto L30
        L88:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L21
        L8e:
            X.0ph6 r1 = r9.LJIILL()
            r0 = 2
            r1.LJIIJ = r0
            goto L21
        L96:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L21
            if (r11 == 0) goto Lad
            X.0ph6 r0 = r9.LJIILL()
            long r0 = r0.LIZLLL
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "enter_page_time"
            r11.putOpt(r0, r1)
        Lad:
            X.0pgk r0 = r9.LLJJI
            X.0pgH r0 = r0.LLJZIJLIL
            X.C1521130pgd.LIZ(r9, r0)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1521180pgi.LJIJJLI(X.0pfA, org.json.JSONObject):void");
    }

    @Override // X.AbstractC1521100pga
    public final void LJIILIIL(int i, String str, JSONObject jSONObject) throws JSONException {
        if (Intrinsics.LJFF(this.LLJLLIL.get(str), Boolean.TRUE)) {
            return;
        }
        JSONObject jSONObject2 = this.LLJLL.get(str);
        if (jSONObject2 != null) {
            int iOptInt = jSONObject2.optInt("stage", -1);
            if (i > iOptInt) {
                jSONObject2.putOpt("stage", Integer.valueOf(i));
                C12868051u.LJFF(jSONObject2, jSONObject);
            } else if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject2.has(next)) {
                        jSONObject2.putOpt(next, jSONObject.opt(next));
                    }
                }
            }
            C12868051u.LJI(jSONObject2, "stage", Integer.valueOf(Math.max(i, iOptInt)));
            this.LLJLL.put(str, jSONObject2);
        } else {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.LLJLL;
            JSONObject jSONObject3 = new JSONObject();
            C12868051u.LJI(jSONObject3, "stage", Integer.valueOf(i));
            C12868051u.LJFF(jSONObject3, jSONObject);
            concurrentHashMap.put(str, jSONObject3);
        }
        if (i == 300 && jSONObject2 != null && jSONObject2.has("jsb_status_code")) {
            WebViewMonitorHelper.getInstance().handleJSBPvV2(this.LLJJI.LJIIL(), C08HX.LJ(jSONObject2));
            this.LLJLL.put(str, null);
            this.LLJLLIL.put(str, Boolean.TRUE);
        }
    }
}
