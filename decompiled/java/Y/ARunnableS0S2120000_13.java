package Y;

import X.C0VZK;
import X.C1C7U;
import X.C295401Cm;
import X.C805400Vic;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS0S2120000_13 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S2120000_13 aRunnableS0S2120000_13) throws JSONException {
        Object obj;
        Object obj2 = aRunnableS0S2120000_13.s0;
        C805400Vic c805400Vic = (C805400Vic) aRunnableS0S2120000_13.l2;
        String str = aRunnableS0S2120000_13.s1;
        boolean z = aRunnableS0S2120000_13.z3;
        boolean z2 = aRunnableS0S2120000_13.z4;
        C1C7U.LIZ("RASPWebRouterAction@f02a.report$1L");
        JSONObject jSONObject = new JSONObject();
        if (obj2 != null) {
            jSONObject.put("risk_id", obj2);
        }
        if (c805400Vic != null) {
            Object obj3 = c805400Vic.LIZ;
            if (obj3 != null) {
                jSONObject.put("url", obj3);
            }
            Object obj4 = c805400Vic.LIZLLL;
            if (obj4 != null) {
                jSONObject.put("host", obj4);
            }
            Object obj5 = c805400Vic.LIZJ;
            if (obj5 != null) {
                jSONObject.put("scheme", obj5);
            }
            Object obj6 = c805400Vic.LJFF;
            if (obj6 != null) {
                jSONObject.put("path", obj6);
            }
            Map<String, String> map = c805400Vic.LJI;
            if (map != null && (!map.isEmpty())) {
                if (z2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.put(it2.next().getKey(), "");
                    }
                    jSONObject.put("querys", linkedHashMap);
                } else {
                    jSONObject.put("querys", map);
                }
            }
        }
        C805400Vic c805400VicLIZIZ = C295401Cm.LIZIZ(str);
        if (c805400VicLIZIZ != null && (obj = c805400VicLIZIZ.LJ) != null) {
            jSONObject.put("referer_host", obj);
        }
        jSONObject.put("seclink_installed", z ? 1 : 0);
        C0VZK.LIZJ("rasp_risk_webview", jSONObject);
        C1C7U.LIZIZ("RASPWebRouterAction@f02a.report$1L");
    }

    public static final void run$1(ARunnableS0S2120000_13 aRunnableS0S2120000_13) throws JSONException {
        Object obj;
        Object obj2 = aRunnableS0S2120000_13.s0;
        C805400Vic c805400Vic = (C805400Vic) aRunnableS0S2120000_13.l2;
        String str = aRunnableS0S2120000_13.s1;
        boolean z = aRunnableS0S2120000_13.z3;
        boolean z2 = aRunnableS0S2120000_13.z4;
        C1C7U.LIZ("RaspNavigationInterceptor@2bca.report$1L");
        JSONObject jSONObject = new JSONObject();
        if (obj2 != null) {
            jSONObject.put("risk_id", obj2);
        }
        if (c805400Vic != null) {
            Object obj3 = c805400Vic.LIZ;
            if (obj3 != null) {
                jSONObject.put("url", obj3);
            }
            Object obj4 = c805400Vic.LIZLLL;
            if (obj4 != null) {
                jSONObject.put("host", obj4);
            }
            Object obj5 = c805400Vic.LIZJ;
            if (obj5 != null) {
                jSONObject.put("scheme", obj5);
            }
            Object obj6 = c805400Vic.LJFF;
            if (obj6 != null) {
                jSONObject.put("path", obj6);
            }
            Map<String, String> map = c805400Vic.LJI;
            if (map != null && (!map.isEmpty())) {
                if (z2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.put(it2.next().getKey(), "");
                    }
                    jSONObject.put("querys", linkedHashMap);
                } else {
                    jSONObject.put("querys", map);
                }
            }
        }
        C805400Vic c805400VicLIZIZ = C295401Cm.LIZIZ(str);
        if (c805400VicLIZIZ != null && (obj = c805400VicLIZIZ.LJ) != null) {
            jSONObject.put("referer_host", obj);
        }
        jSONObject.put("seclink_installed", z ? 1 : 0);
        C0VZK.LIZJ("rasp_risk_webview", jSONObject);
        C1C7U.LIZIZ("RaspNavigationInterceptor@2bca.report$1L");
    }

    public ARunnableS0S2120000_13(C805400Vic c805400Vic, String str, String str2, boolean z, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = c805400Vic;
        this.s1 = str2;
        this.z3 = z;
        this.z4 = true;
    }

    public ARunnableS0S2120000_13(C805400Vic c805400Vic, String str, String str2, boolean z, boolean z2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = c805400Vic;
        this.s1 = str2;
        this.z3 = z;
        this.z4 = z2;
    }
}
