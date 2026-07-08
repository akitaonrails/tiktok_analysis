package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.net.DefaultTTNetImpl;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792400V6o {
    public static Context LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJIILIIL;
    public static long LJIILJJIL;
    public static String LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static boolean LJIJ;
    public static List<String> LJIJJ;
    public static String LJIJJLI;
    public static C792410V6p LJIL;
    public static JSONObject LJFF = new JSONObject();
    public static InterfaceC792440V6s LJI = new InterfaceC792440V6s() { // from class: X.0V6r
        @Override // X.InterfaceC792440V6s
        public final String getSessionId() {
            return null;
        }

        @Override // X.InterfaceC792440V6s
        public final long getUid() {
            return 0L;
        }

        @Override // X.InterfaceC792440V6s
        public final Map<String, String> getCommonParams() {
            return Collections.emptyMap();
        }
    };
    public static Map<String, String> LJII = Collections.emptyMap();
    public static IHttpService LJIIIIZZ = new DefaultTTNetImpl();
    public static long LJIIIZ = -1;
    public static volatile int LJIIJ = -1;
    public static boolean LJIIJJI = true;
    public static final boolean LJIIL = true;
    public static final boolean LJIJI = true;
    public static boolean LJJ = false;
    public static InterfaceC792020V5c LJJI = null;
    public static volatile String LJJIFFI = "";

    public static String LIZIZ() {
        if (TextUtils.isEmpty(LJIILL)) {
            LJIILL = C08MZ.LIZ(Process.myPid());
        }
        return LJIILL;
    }

    public static long LIZJ() {
        if (LJIILJJIL == 0) {
            LJIILJJIL = System.currentTimeMillis();
        }
        return LJIILJJIL;
    }

    public static String LIZLLL() {
        Context context = LIZ;
        return context == null ? "" : context.getPackageName();
    }

    public static synchronized C792410V6p LJ() {
        return LJIL;
    }

    public static synchronized Map<String, String> LJFF() {
        Map<String, String> queryParams;
        InterfaceC792020V5c interfaceC792020V5c = LJJI;
        if (interfaceC792020V5c == null || (queryParams = interfaceC792020V5c.getQueryParams()) == null || queryParams.size() <= 0) {
            return LJII;
        }
        HashMap map = new HashMap(LJII);
        map.putAll(queryParams);
        return map;
    }

    public static long LJI() {
        if (LJIIIZ == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            LJIIIZ = jCurrentTimeMillis;
            LJIILJJIL = jCurrentTimeMillis;
        }
        return LJIIIZ;
    }

    public static boolean LJIIIIZZ() {
        return LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIZ() {
        /*
            boolean r0 = X.C792400V6o.LJIILLIIL
            r3 = 1
            if (r0 == 0) goto L6
            return r3
        L6:
            android.content.Context r0 = X.C792400V6o.LIZ
            if (r0 != 0) goto Lf
            boolean r0 = LJIIJ()
            return r0
        Lf:
            java.lang.String r2 = LIZIZ()
            r1 = 0
            if (r2 == 0) goto L30
            java.lang.String r0 = ":"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L23
            X.C792400V6o.LJIILLIIL = r1
        L20:
            boolean r0 = X.C792400V6o.LJIILLIIL
            return r0
        L23:
            android.content.Context r0 = X.C792400V6o.LIZ
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L30
            goto L31
        L30:
            r3 = 0
        L31:
            X.C792400V6o.LJIILLIIL = r3
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C792400V6o.LJIIIZ():boolean");
    }

    public static boolean LJIIJ() {
        String strLIZIZ;
        return LJIILLIIL || (strLIZIZ = LIZIZ()) == null || !strLIZIZ.contains(":");
    }

    public static String LJII(long j) {
        long j2 = j - LJIILJJIL;
        if (j2 < 30000) {
            return "0 - 30s";
        }
        if (j2 < 60000) {
            return "30s - 1min";
        }
        if (j2 < 120000) {
            return "1min - 2min";
        }
        if (j2 < 300000) {
            return "2min - 5min";
        }
        if (j2 < 600000) {
            return "5min - 10min";
        }
        if (j2 < 1800000) {
            return "10min - 30min";
        }
        if (j2 < 3600000) {
            return "30min - 1h";
        }
        return "1h - ";
    }

    public static synchronized void LJIIJJI(InterfaceC792440V6s interfaceC792440V6s) {
        LJI = interfaceC792440V6s;
        Map<String, String> commonParams = interfaceC792440V6s.getCommonParams();
        LJII = commonParams;
        if (commonParams == null) {
            LJII = new HashMap();
        }
        if (!LJII.containsKey("aid")) {
            LJII.put("aid", LJFF.optString("aid"));
        }
        if (!LJII.containsKey("app_id")) {
            LJII.put("app_id", LJFF.optString("aid"));
        }
        if (!LJII.containsKey("device_id")) {
            LJII.put("device_id", LJFF.optString("device_id"));
        }
        if (!LJII.containsKey("device_platform")) {
            LJII.put("device_platform", "android");
        }
        LJII.put("os", "Android");
        if (!LJII.containsKey("update_version_code")) {
            LJII.put("update_version_code", LJFF.optString("update_version_code"));
        }
        if (!LJII.containsKey("version_code")) {
            LJII.put("version_code", LJFF.optString("version_code"));
        }
        if (!LJII.containsKey("channel")) {
            LJII.put("channel", LJFF.optString("channel"));
        }
        if (!LJII.containsKey("os_api")) {
            Map<String, String> map = LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Build.VERSION.SDK_INT);
            sbLIZ.append("");
            map.put("os_api", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (LJIIIIZZ() && !LJII.containsKey("_log_level")) {
            LJII.put("_log_level", "debug");
        }
        if (LJIL == null) {
            LJIL = new C792410V6p();
        }
        LJIL.LJIIIIZZ = new HashMap(LJII);
    }

    public static synchronized void LJIIL(JSONObject jSONObject) {
        PackageInfo packageInfoY3;
        try {
            if (LJIL == null) {
                LJIL = new C792410V6p();
            }
            jSONObject.put("os", "Android");
            jSONObject.put("device_platform", "android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("process_name", C08MZ.LIZ(Process.myPid()));
            jSONObject.put("sid", LJI());
            jSONObject.put("phone_startup_time", LIZJ());
            jSONObject.put("verify_info", C2404209bU.LIZ());
            jSONObject.put("rom_version", C2162508db.LIZ());
            if (!jSONObject.has("version_name")) {
                packageInfoY3 = C786410Ut5.Y3(LIZ.getPackageManager(), LIZ.getPackageName(), 0);
                jSONObject.put("version_name", packageInfoY3.versionName);
            } else {
                packageInfoY3 = null;
            }
            if (TextUtils.isEmpty(jSONObject.optString("app_version"))) {
                jSONObject.put("app_version", jSONObject.optString("version_name"));
            }
            if (!jSONObject.has("version_code")) {
                if (packageInfoY3 == null) {
                    packageInfoY3 = C786410Ut5.Y3(LIZ.getPackageManager(), LIZ.getPackageName(), 0);
                }
                jSONObject.put("version_code", packageInfoY3.versionCode);
            }
            if (TextUtils.isEmpty(jSONObject.optString("package"))) {
                jSONObject.put("package", LIZ.getPackageName());
            }
            jSONObject.put("monitor_version", "5.0.21.12-rc.30");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C792410V6p c792410V6p = LJIL;
        jSONObject.optString("process_name");
        c792410V6p.getClass();
        LJIL.LIZIZ = jSONObject.optString("device_id");
        try {
            int i = JSONObjectProtectorUtils.getInt(jSONObject, "aid");
            LJIL.LIZ = i;
            C793590VBd.LJIIIZ = i;
            LJIL.LIZJ = jSONObject.optString("channel");
            if (jSONObject.has("update_version_code")) {
                if (jSONObject.get("update_version_code") instanceof String) {
                    LJIL.LIZLLL = CastIntegerProtector.valueOf(jSONObject.optString("update_version_code")).intValue();
                } else {
                    LJIL.LIZLLL = jSONObject.optInt("update_version_code");
                }
            }
            if (jSONObject.has("version_name")) {
                LJIL.LJ = jSONObject.optString("version_name");
            }
            if (jSONObject.has("manifest_version_code")) {
                if (jSONObject.get("manifest_version_code") instanceof String) {
                    LJIL.LJFF = CastIntegerProtector.valueOf(jSONObject.optString("manifest_version_code")).intValue();
                } else {
                    LJIL.LJFF = jSONObject.optInt("manifest_version_code");
                }
            }
            if (jSONObject.has("version_code")) {
                if (jSONObject.get("version_code") instanceof String) {
                    C792410V6p c792410V6p2 = LJIL;
                    CastIntegerProtector.valueOf(jSONObject.optString("version_code")).intValue();
                    c792410V6p2.getClass();
                } else {
                    C792410V6p c792410V6p3 = LJIL;
                    jSONObject.optInt("version_code");
                    c792410V6p3.getClass();
                }
            }
            if (jSONObject.has("app_version")) {
                LJIL.LJI = jSONObject.optString("app_version");
            }
            C792410V6p c792410V6p4 = LJIL;
            C2404209bU.LIZ();
            c792410V6p4.getClass();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LJIL.LJII = C0V3O.LIZIZ(jSONObject);
        LJFF = jSONObject;
    }

    public static void LIZ(String str, String str2) {
        JSONObject jSONObject = LJFF;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
