package X;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.092I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C092I {
    public static C092M LIZJ;
    public static C0VCC LIZLLL;
    public static final C092I LIZ = new C092I();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static String LJ = "";

    public static JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C092M c092m = LIZJ;
        if (c092m == null) {
            c092m = null;
        }
        jSONObject.put("device_id", c092m.LIZJ);
        C092M c092m2 = LIZJ;
        if (c092m2 == null) {
            c092m2 = null;
        }
        jSONObject.put("host_aid", c092m2.LIZIZ);
        jSONObject.put("sdk_version", LJ);
        C092M c092m3 = LIZJ;
        if (c092m3 == null) {
            c092m3 = null;
        }
        jSONObject.put("channel", c092m3.LIZLLL);
        C092M c092m4 = LIZJ;
        if (c092m4 == null) {
            c092m4 = null;
        }
        jSONObject.put("app_version", c092m4.LJ);
        C092M c092m5 = LIZJ;
        if (c092m5 == null) {
            c092m5 = null;
        }
        jSONObject.put("update_version_code", c092m5.LJFF);
        C092M c092m6 = LIZJ;
        jSONObject.put("package_name", (c092m6 != null ? c092m6 : null).LJI);
        return jSONObject;
    }

    public static void LJ(int i, long j) throws JSONException {
        if (!LIZIZ.get()) {
            return;
        }
        String str = C092K.LJ.get(Integer.valueOf(i));
        if (str == null) {
            str = "Unknown error";
        }
        C0VCC c0vcc = LIZLLL;
        if (c0vcc == null) {
            c0vcc = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("err_code", i);
        jSONObject.put("err_msg", str);
        c0vcc.LJIIJ("keystore_status", jSONObject, new JSONObject().put("cost", j), null);
    }

    public static void LIZIZ(int i, int i2, long j) throws JSONException {
        if (!LIZIZ.get()) {
            return;
        }
        String str = C092K.LIZLLL.get(Integer.valueOf(i));
        if (str == null) {
            str = "Unknown error";
        }
        C0VCC c0vcc = LIZLLL;
        if (c0vcc == null) {
            c0vcc = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("err_code", i);
        jSONObject.put("err_msg", str);
        jSONObject.put("type", i2);
        c0vcc.LJIIJ("decryption_status", jSONObject, new JSONObject().put("cost", j), null);
    }

    public static void LIZJ(int i, int i2, long j) throws JSONException {
        if (!LIZIZ.get()) {
            return;
        }
        String str = C092K.LIZJ.get(Integer.valueOf(i));
        if (str == null) {
            str = "Unknown error";
        }
        C0VCC c0vcc = LIZLLL;
        if (c0vcc == null) {
            c0vcc = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("err_code", i);
        jSONObject.put("err_msg", str);
        jSONObject.put("type", i2);
        c0vcc.LJIIJ("encryption_status", jSONObject, new JSONObject().put("cost", j), null);
    }

    public static void LJFF(int i, int i2, int i3, long j) throws JSONException {
        if (!LIZIZ.get()) {
            return;
        }
        String str = C092K.LIZIZ.get(Integer.valueOf(i));
        if (str == null) {
            str = "Unknown error";
        }
        C0VCC c0vcc = LIZLLL;
        if (c0vcc == null) {
            c0vcc = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("err_code", i);
        jSONObject.put("err_msg", str);
        jSONObject.put("type", i2);
        jSONObject.put("attempt", i3);
        c0vcc.LJIIJ("key_validation_status", jSONObject, new JSONObject().put("cost", j), null);
    }

    public static void LIZLLL(int i, int i2, int i3, long j, String str, String str2) throws JSONException {
        if (!LIZIZ.get()) {
            return;
        }
        String str3 = C092K.LIZ.get(Integer.valueOf(i));
        if (str3 != null) {
            str2 = str3;
        }
        C0VCC c0vcc = LIZLLL;
        if (c0vcc == null) {
            c0vcc = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", str);
        jSONObject.put("err_code", i);
        jSONObject.put("err_msg", str2);
        jSONObject.put("type", i2);
        jSONObject.put("attempt", i3);
        c0vcc.LJIIJ("key_agreement_status", jSONObject, new JSONObject().put("cost", j), null);
    }
}
