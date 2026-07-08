package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XC2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XC2 {
    public static volatile C0XC2 LIZIZ;
    public final Map<String, Map<String, C0XCG>> LIZ = new ConcurrentHashMap();

    public static C0XC2 LIZJ() {
        if (LIZIZ == null) {
            synchronized (C0XC2.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0XC2();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final C0XCD LIZ(int i) {
        Map concurrentHashMap = (Map) ((ConcurrentHashMap) this.LIZ).get(String.valueOf(i));
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
        }
        if (concurrentHashMap.get("activate") == null) {
            concurrentHashMap.put("activate", new C0XCD());
            ((ConcurrentHashMap) this.LIZ).put(String.valueOf(i), concurrentHashMap);
        }
        return (C0XCD) concurrentHashMap.get("activate");
    }

    public final C0XCB LIZIZ(String str) {
        Map concurrentHashMap = (Map) ((ConcurrentHashMap) this.LIZ).get(str);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
        }
        if (concurrentHashMap.get("dSign") == null) {
            concurrentHashMap.put("dSign", new C0XCB());
            ((ConcurrentHashMap) this.LIZ).put(str, concurrentHashMap);
        }
        return (C0XCB) concurrentHashMap.get("dSign");
    }

    public final C0XCM LIZLLL(int i) {
        Map concurrentHashMap = (Map) ((ConcurrentHashMap) this.LIZ).get(String.valueOf(i));
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
        }
        if (concurrentHashMap.get("params") == null) {
            concurrentHashMap.put("params", new C0XCM());
            ((ConcurrentHashMap) this.LIZ).put(String.valueOf(i), concurrentHashMap);
        }
        return (C0XCM) concurrentHashMap.get("params");
    }

    public final C0XCA LJ(int i) {
        Map concurrentHashMap = (Map) ((ConcurrentHashMap) this.LIZ).get(String.valueOf(i));
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
        }
        if (concurrentHashMap.get("register") == null) {
            concurrentHashMap.put("register", new C0XCA());
            ((ConcurrentHashMap) this.LIZ).put(String.valueOf(i), concurrentHashMap);
        }
        return (C0XCA) concurrentHashMap.get("register");
    }

    public static void LJFF(C844770XBz c844770XBz, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.optString("device_id_str"))) {
            z = true;
        } else {
            z = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(jSONObject.optString("install_id"));
        boolean zIsEmpty2 = TextUtils.isEmpty(jSONObject.optString("device_id"));
        try {
            jSONObject3.put("reqeust_did_success", z);
            jSONObject3.put("empty_iid", zIsEmpty);
            jSONObject3.put("empty_did", zIsEmpty2);
            C0WV4 c0wv4 = C0WV3.LIZIZ;
            if (c0wv4 != null && !c0wv4.LJII) {
                jSONObject3.put("gaid_sys_call_ts", c0wv4.LIZIZ - c0wv4.LIZ);
                jSONObject3.put("gaid_file_load_ts", c0wv4.LIZLLL - c0wv4.LIZJ);
                jSONObject3.put("gaid_save_ts", c0wv4.LJFF - c0wv4.LJ);
                jSONObject3.put("dr_gaid", (Object) null);
                jSONObject3.put("support_gaid", !c0wv4.LJI);
                c0wv4.LJII = true;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((C2210711Bfh) c844770XBz.LJJII).LIZ("did_fetch_result", jSONObject3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("did_fetch_result, ");
        sbLIZ.append(jSONObject3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC844900XCm interfaceC844900XCm = C844830XCf.LIZIZ;
        if (interfaceC844900XCm != null) {
            interfaceC844900XCm.LIZLLL(strLIZIZ, null);
        }
    }
}
