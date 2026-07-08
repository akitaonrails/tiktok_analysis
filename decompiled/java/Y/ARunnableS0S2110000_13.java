package Y;

import X.C0VZK;
import X.C0WPS;
import X.C0XO2;
import X.C0XO3;
import X.C1551330qTL;
import X.C1C7U;
import X.C805400Vic;
import X.C848040XOo;
import X.EnumC797980VSa;
import com.bytedance.scene.Scene;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS0S2110000_13 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S2110000_13 aRunnableS0S2110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("UserModuleStore@20c9.asyncUpdateUserInfo$1");
        try {
            C848040XOo c848040XOo = C848040XOo.LIZ;
            C0XO2 c0xo2 = (C0XO2) aRunnableS0S2110000_13.l2;
            String str = aRunnableS0S2110000_13.s0;
            String str2 = aRunnableS0S2110000_13.s1;
            boolean z = aRunnableS0S2110000_13.z3;
            c848040XOo.getClass();
            C848040XOo.LIZJ(c0xo2, str, str2, z);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UserModuleStore@20c9.asyncUpdateUserInfo$1");
    }

    public static final void run$1(ARunnableS0S2110000_13 aRunnableS0S2110000_13) throws JSONException {
        String str = aRunnableS0S2110000_13.s0;
        C805400Vic c805400Vic = (C805400Vic) aRunnableS0S2110000_13.l2;
        String str2 = aRunnableS0S2110000_13.s1;
        boolean z = aRunnableS0S2110000_13.z3;
        C1C7U.LIZ("RaspRouterInterceptor@fd49.report$1L");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("risk_id", str);
        }
        if (c805400Vic != null) {
            String str3 = c805400Vic.LIZ;
            if (str3 != null) {
                jSONObject.put("router", str3);
            }
            String str4 = c805400Vic.LIZLLL;
            if (str4 != null) {
                jSONObject.put("host", str4);
            }
            String str5 = c805400Vic.LIZJ;
            if (str5 != null) {
                jSONObject.put("scheme", str5);
            }
            String str6 = c805400Vic.LJFF;
            if (str6 != null) {
                jSONObject.put("path", str6);
            }
            Map<String, String> map = c805400Vic.LJI;
            if (map != null && (!map.isEmpty())) {
                if (z) {
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
        jSONObject.put(Scene.SCENE_SERVICE, str2);
        C0VZK.LIZJ("rasp_risk_router", jSONObject);
        C1C7U.LIZIZ("RaspRouterInterceptor@fd49.report$1L");
    }

    public static final void run$2(ARunnableS0S2110000_13 aRunnableS0S2110000_13) {
        String str = aRunnableS0S2110000_13.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS0S2110000_13.l2;
        String str2 = aRunnableS0S2110000_13.s1;
        boolean z = aRunnableS0S2110000_13.z3;
        C1C7U.LIZ("AsyncGetLogDataRunnable@f222.com_ss_ttvideoengine_log_AsyncGetLogDataRunnable__run$___twin___$1L");
        C0WPS.instance.addMergeEvent(str, jSONObject, str2, z);
        C1C7U.LIZIZ("AsyncGetLogDataRunnable@f222.com_ss_ttvideoengine_log_AsyncGetLogDataRunnable__run$___twin___$1L");
    }

    public static final void run$3(ARunnableS0S2110000_13 aRunnableS0S2110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ResLoadUtilsNew@422c.getChannelPath$3");
        try {
            C1551330qTL c1551330qTL = C1551330qTL.LIZ;
            String str = aRunnableS0S2110000_13.s0;
            String str2 = aRunnableS0S2110000_13.s1;
            long jLongValue = ((Long) aRunnableS0S2110000_13.l2).longValue();
            EnumC797980VSa enumC797980VSa = EnumC797980VSa.GET_PATH;
            boolean z = aRunnableS0S2110000_13.z3;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1551330qTL.getClass();
            C1551330qTL.LJIIIZ(str, str2, jLongValue, enumC797980VSa, z, jCurrentTimeMillis, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ResLoadUtilsNew@422c.getChannelPath$3");
    }

    public ARunnableS0S2110000_13(C0XO3 c0xo3, boolean z, int i) {
        this.$t = i;
        this.l2 = c0xo3;
        this.s0 = "async refresh passport user info";
        this.s1 = "account_info";
        this.z3 = z;
    }

    public ARunnableS0S2110000_13(C805400Vic c805400Vic, String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = c805400Vic;
        this.s1 = str2;
        this.z3 = true;
    }

    public ARunnableS0S2110000_13(String str, Object obj, boolean z, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = obj;
        this.z3 = z;
    }
}
