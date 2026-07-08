package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qR8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549960qR8 extends AbstractC1549980qRA implements InterfaceC1550160qRS {
    public final List<String> LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public long LJIIJJI;
    public final C01GW LJIIL;
    public final List<InterfaceC1520860pgC> LJIILIIL;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJIILL(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        Iterator<String> itKeys;
        JSONObject jSONObject3;
        C1522100piC c1522100piCLIZ;
        String strOptString = jSONObject.optString("navigation_id");
        String strOptString2 = jSONObject.optString("ev_type");
        if (strOptString2 != null) {
            int i = 4;
            Map map = null;
            Double dValueOf = null;
            C1549960qR8 c1549960qR8 = this;
            switch (strOptString2.hashCode()) {
                case -1077756671:
                    if (strOptString2.equals("memory")) {
                        C1550000qRC c1550000qRCLJIIJ = c1549960qR8.LJIIJ();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("navigation_id", strOptString);
                        c1549960qR8.LJIIJJI(c1550000qRCLJIIJ, "hybrid_app_monitor_js_memory", jSONObject4, jSONObject.optJSONObject("event"), null);
                    }
                    break;
                case -270976012:
                    if (strOptString2.equals("performance_interval") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("event")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("navigation")) != null && (itKeys = jSONObjectOptJSONObject3.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Double dValueOf2 = Double.valueOf(jSONObjectOptJSONObject3.optDouble(next, 0.0d));
                            if (dValueOf2.doubleValue() > 0.0d && !((ArrayList) c1549960qR8.LJII).contains(next)) {
                                dValueOf2.doubleValue();
                                ((ArrayList) c1549960qR8.LJII).add(next);
                                C1550000qRC c1550000qRCLJIIJ2 = c1549960qR8.LJIIJ();
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("trigger", next);
                                jSONObject5.put("navigation_id", strOptString);
                                List<C1522070pi9> list = C1521350pgz.LIZ;
                                C1522080piA c1522080piALIZ = C1521350pgz.LIZ(EnumC1154990gA5.H5_TIMING);
                                if (c1522080piALIZ != null && (c1522100piCLIZ = c1522080piALIZ.LIZ(next, jSONObjectOptJSONObject3)) != null) {
                                    jSONObject3 = new JSONObject();
                                    jSONObject3.put(c1522100piCLIZ.LIZ, c1522100piCLIZ.LIZIZ);
                                } else {
                                    jSONObject3 = null;
                                }
                                c1549960qR8 = c1549960qR8;
                                c1549960qR8.LJIIJJI(c1550000qRCLJIIJ2, "hybrid_app_monitor_h5_timeline_event", jSONObject5, jSONObject3, null);
                            }
                        }
                        break;
                    }
                    break;
                case 101609:
                    if (strOptString2.equals("fps")) {
                        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("event");
                        if (jSONObjectOptJSONObject4 != null) {
                            dValueOf = Double.valueOf(jSONObjectOptJSONObject4.optDouble("fps"));
                        }
                        C1550000qRC c1550000qRCLJIIJ3 = c1549960qR8.LJIIJ();
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("navigation_id", strOptString);
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("fps", dValueOf);
                        c1549960qR8.LJIIJJI(c1550000qRCLJIIJ3, "hybrid_app_monitor_js_fps", jSONObject6, jSONObject7, null);
                    }
                    break;
                case 1669986551:
                    if (strOptString2.equals("static_error")) {
                        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("event");
                        C1550000qRC c1550000qRCLJIIJ4 = c1549960qR8.LJIIJ();
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("navigation_id", strOptString);
                        if (jSONObjectOptJSONObject5 != null) {
                            C1043700dGa.LIZ(jSONObject8, new C1549990qRB(UriProtector.parse(jSONObjectOptJSONObject5.optString("st_url")), "resource_", null, 4).getFormatData());
                        }
                        c1549960qR8.LJIIJJI(c1550000qRCLJIIJ4, "hybrid_app_monitor_load_resource_error", jSONObject8, null, null);
                    }
                    break;
                case 1837434847:
                    if (strOptString2.equals("static_performance") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("event")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("resources")) != null) {
                        int length = jSONArrayOptJSONArray.length();
                        int i2 = 0;
                        while (i2 < length) {
                            JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject6 != null) {
                                String strOptString3 = jSONObjectOptJSONObject6.optString("name");
                                C1550000qRC c1550000qRCLJIIJ5 = c1549960qR8.LJIIJ();
                                JSONObject jSONObject9 = new JSONObject();
                                jSONObject9.put("trigger", "on_load");
                                jSONObject9.put("navigation_id", strOptString);
                                C1043700dGa.LIZ(jSONObject9, new C1549990qRB(UriProtector.parse(strOptString3), "resource_", map, i).getFormatData());
                                List<C1522070pi9> list2 = C1521350pgz.LIZ;
                                C1522080piA c1522080piALIZ2 = C1521350pgz.LIZ(EnumC1154990gA5.H5_RESOURCE_TIMING);
                                if (c1522080piALIZ2 != null) {
                                    jSONObject2 = new JSONObject();
                                    Iterator<String> itKeys2 = jSONObjectOptJSONObject6.keys();
                                    while (itKeys2.hasNext()) {
                                        String next2 = itKeys2.next();
                                        Long lValueOf = Long.valueOf(jSONObjectOptJSONObject6.optLong(next2));
                                        if (lValueOf.longValue() != 0) {
                                            lValueOf.longValue();
                                            C1522100piC c1522100piCLIZ2 = c1522080piALIZ2.LIZ(next2, jSONObjectOptJSONObject6);
                                            if (c1522100piCLIZ2 != null) {
                                                jSONObject2.put(c1522100piCLIZ2.LIZ, c1522100piCLIZ2.LIZIZ);
                                            }
                                        }
                                    }
                                } else {
                                    jSONObject2 = null;
                                }
                                c1549960qR8.LJIIJJI(c1550000qRCLJIIJ5, "hybrid_app_monitor_load_resource_event", jSONObject9, jSONObject2, null);
                            }
                            i2++;
                            i = 4;
                            map = null;
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public final void LJI(Integer num, JSONObject jSONObject) {
        int iIntValue;
        InterfaceC1313120kH8 interfaceC1313120kH8 = (InterfaceC1313120kH8) this.LIZLLL.LIZ(InterfaceC1313120kH8.class);
        if (interfaceC1313120kH8 != null) {
            interfaceC1313120kH8.LJI(num, jSONObject);
        }
        if (Intrinsics.LJFF("ttmt_webview_timing_monitor_custom_service", "bd_hybrid_monitor_service_all_in_one")) {
            return;
        }
        try {
            LJIILL(jSONObject);
            for (InterfaceC1520860pgC interfaceC1520860pgC : (ArrayList) this.LJIILIIL) {
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                interfaceC1520860pgC.LIZ(iIntValue, jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1549960qR8(Uri uri, C1550020qRE c1550020qRE, Map<String, String> map) {
        super(uri, c1550020qRE, map);
        this.LJII = new ArrayList();
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJIIIIZZ = C452501pT.LIZ(enumC452301pR, new AwS567S0100000_23(this, 210));
        this.LJIIIZ = C452501pT.LIZ(enumC452301pR, new AwS567S0100000_23(this, 209));
        this.LJIIJ = C452501pT.LIZ(enumC452301pR, new AwS567S0100000_23(this, 211));
        this.LJIIL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 973));
        this.LJIILIIL = new ArrayList();
        new LinkedHashMap();
    }

    @Override // X.AbstractC1549980qRA
    public final void LJIIJJI(AbstractC1550060qRI abstractC1550060qRI, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            LJIILJJIL(abstractC1550060qRI, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILIIL(abstractC1550060qRI.getUrl(), "h5", e);
        }
    }

    public final void LJIILJJIL(AbstractC1550060qRI abstractC1550060qRI, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        String str2;
        JSONObject jSONObject4 = jSONObject;
        InterfaceC824360WVm interfaceC824360WVm = (InterfaceC824360WVm) this.LJIIL.getValue();
        WebView webView = (WebView) this.LJIIIIZZ.getValue();
        String url = abstractC1550060qRI.getUrl();
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        jSONObject4.put("type", "h5");
        if (this.LIZLLL.LIZ(InterfaceC1550100qRM.class) == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject4.put("is_fallback", str2);
        InterfaceC1550100qRM interfaceC1550100qRM = (InterfaceC1550100qRM) this.LIZLLL.LIZ(InterfaceC1550100qRM.class);
        if (interfaceC1550100qRM != null) {
            interfaceC1550100qRM.LJII();
            interfaceC1550100qRM.LJIIIZ();
        }
        C1043700dGa.LIZ(jSONObject4, abstractC1550060qRI.getFormatData());
        InterfaceC1550100qRM interfaceC1550100qRM2 = (InterfaceC1550100qRM) this.LIZLLL.LIZ(InterfaceC1550100qRM.class);
        if (interfaceC1550100qRM2 != null) {
            C1043700dGa.LIZ(jSONObject4, new C1549990qRB(interfaceC1550100qRM2.LJIIIIZZ().LLILLJJLI, "original_", null, 4).getFormatData());
        }
        String strJ3 = C786410Ut5.J3(jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            C1043700dGa.LIZ(jSONObject5, jSONObject2);
        }
        String strJ32 = C786410Ut5.J3(jSONObject5);
        JSONObject jSONObject6 = new JSONObject();
        if (jSONObject3 != null) {
            C1043700dGa.LIZ(jSONObject6, jSONObject3);
        }
        interfaceC824360WVm.customReport(webView, url, str, strJ3, strJ32, C786410Ut5.J3(jSONObject6), CardStruct.IStatusCode.DEFAULT);
    }
}
