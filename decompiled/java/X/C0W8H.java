package X;

import Y.ARunnableS2S2100000_3;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W8H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8H {
    public static final String LIZ = Build.BRAND;
    public static final String LIZIZ = Build.DEVICE;
    public static final String LIZJ = Build.VERSION.RELEASE;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final String LJII;
    public static final String LJIIIIZZ;

    static {
        try {
            LJFF = (String) C0W8I.LIZ();
            LIZLLL = String.valueOf(1233);
            LJII = "musical_ly";
            C844470XAv.LIZ.getClass();
            LJ = C844470XAv.LJIILL;
            C307350C2z.LIZ().LJIIIIZZ();
            LJI = "46.0.1";
            C307350C2z.LIZ().LIZLLL();
            LJIIIIZZ = String.valueOf(2024600010);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static String LIZ(String str, String str2) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_type", "service_monitor");
        jSONObject.put("service", str);
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("stack_info", str2);
        jSONArray.put(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        String str3 = LJIIIIZZ;
        jSONObject2.put("version_code", str3);
        String str4 = Build.MODEL;
        jSONObject2.put("origin_device_model", str4);
        String str5 = LJFF;
        jSONObject2.put("device_id", str5);
        jSONObject2.put("update_version_code", str3);
        jSONObject2.put("aid", LIZLLL);
        jSONObject2.put("device_platform", "android");
        jSONObject2.put("os_version", LIZJ);
        jSONObject2.put("channel", LJ);
        jSONObject2.put("package_name", LJII);
        jSONObject2.put("os", "Android");
        jSONObject2.put("device_model", str4);
        jSONObject2.put("device_brand", Build.BRAND);
        String str6 = LJI;
        jSONObject2.put("version_name", str6);
        jSONObject2.put("app_version", str6);
        jSONObject2.put("device_manufacturer", Build.MANUFACTURER);
        jSONObject2.put("insert_time", System.currentTimeMillis());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("data", jSONArray);
        jSONObject3.put("header", jSONObject2);
        jSONObject3.put("api_time", System.currentTimeMillis());
        jSONObject3.put("device_id", str5);
        return C786410Ut5.J3(jSONObject3);
    }

    public static void LIZIZ(String str, String str2, InterfaceC2156608ce interfaceC2156608ce) {
        String strLIZ;
        try {
            strLIZ = LIZ(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strLIZ = "";
        }
        C2156708cf.LIZ.execute(new ARunnableS2S2100000_3("https://mon-boot.tiktokv.com/monitor/collect/custom_monitor/?device_id=" + LJFF + "&aid=" + LIZLLL + "&channel=" + LJ + "&app_version=" + LJI + "&app_name=" + LJII + "&version_code=" + LJIIIIZZ + "&os_version=" + LIZJ + "&device_type=" + LIZIZ + "&bundle_name=" + LIZ + "&device_platform=android", strLIZ, interfaceC2156608ce, 1));
    }
}
