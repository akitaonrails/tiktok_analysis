package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdklib.apm6.http.DefaultTTNetImpl;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VCC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCC implements InterfaceC794060VCy {
    public static long LJJIII;
    public static IHttpService LJJIIJ;
    public static volatile String LJJIIJZLJL;
    public static final AtomicLong LJJIIZ = new AtomicLong(0);
    public Context LIZ;
    public JSONObject LIZIZ;
    public volatile long LIZJ;
    public volatile long LIZLLL;
    public volatile int LJ;
    public volatile int LJFF;
    public volatile JSONObject LJI;
    public volatile JSONObject LJII;
    public volatile int LJIIIZ;
    public volatile int LJIIJ;
    public volatile List<String> LJIIJJI;
    public volatile List<Pattern> LJIIL;
    public volatile List<String> LJIILIIL;
    public volatile List<Pattern> LJIILJJIL;
    public C0VCZ LJIILL;
    public Map<String, String> LJIILLIIL;
    public volatile boolean LJIJI;
    public final String LJIL;
    public boolean LJJ;
    public volatile long LJJI;
    public volatile long LJJIFFI;
    public volatile DefaultTTNetImpl LJIIIIZZ = new DefaultTTNetImpl();
    public final List<String> LJIIZILJ = new LinkedList();
    public volatile boolean LJIJ = true;
    public final C0VCI LJJII = new C0VCI(this);
    public volatile boolean LJIJJ = false;
    public final C0VCG LJIJJLI = new C0VCG();

    public final SharedPreferences LIZLLL() {
        Context context = this.LIZ;
        if (context == null) {
            return null;
        }
        String strLIZ = C08MW.LIZ(context);
        Context context2 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitor_config");
        sbLIZ.append(this.LJIL);
        sbLIZ.append(strLIZ);
        return C810670Vr7.LIZJ(context2, 0, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final JSONObject LJIILJJIL() {
        HashMap map = this.LJIILLIIL != null ? new HashMap(this.LJIILLIIL) : new HashMap();
        if (!TextUtils.isEmpty(LJJIIJZLJL)) {
            map.put("host_aid", LJJIIJZLJL);
        }
        map.put("sdk_version", String.valueOf(400));
        map.put("encrypt", "close");
        if (System.currentTimeMillis() - this.LJJI >= 604800000) {
            map.put("force_refresh", String.valueOf(1));
        }
        map.put("last_calculate_timestamp", String.valueOf(this.LJJI / 1000));
        map.put("last_full_calculate_timestamp", String.valueOf(this.LJJIFFI / 1000));
        return new JSONObject(map);
    }

    public final void LJIILLIIL() {
        if (this.LIZLLL < 600) {
            this.LIZLLL = 600L;
        }
        if (System.currentTimeMillis() - this.LIZJ <= this.LIZLLL * 1000 || !C786410Ut5.H3(this.LIZ)) {
            return;
        }
        synchronized (C0VCC.class) {
            try {
                this.LIZJ = System.currentTimeMillis();
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            C793980VCq.LIZ.LIZIZ(new ARunnableS113S0100000_13(this, 240));
        } catch (Throwable th) {
        }
    }

    public final void LJII() {
        SharedPreferences sharedPreferencesLIZLLL = LIZLLL();
        C0VCL c0vcl = null;
        String string = sharedPreferencesLIZLLL.getString("monitor_net_config", null);
        this.LIZJ = sharedPreferencesLIZLLL.getLong("monitor_configure_refresh_time", 0L);
        this.LJJI = sharedPreferencesLIZLLL.getLong("monitor_last_calculate_timestamp", 0L);
        this.LJJIFFI = sharedPreferencesLIZLLL.getLong("monitor_last_full_calculate_timestamp", 0L);
        boolean z = sharedPreferencesLIZLLL.getInt("monitor_config_update", 0) == 1;
        C793980VCq.LIZ.LIZ(this);
        if (!TextUtils.isEmpty(string)) {
            try {
                this.LJIJJ = true;
                JSONObject jSONObject = new JSONObject(string);
                if (!z) {
                    jSONObject.remove("report_host_new");
                }
                LJIILL(jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        IConfigManager iConfigManager = (IConfigManager) C792600V7i.LIZ(IConfigManager.class);
        if (iConfigManager != null) {
            iConfigManager.registerConfigListener(new InterfaceC792030V5d() { // from class: X.0VCB
                @Override // X.InterfaceC792030V5d
                public final void LIZ() {
                }

                @Override // X.InterfaceC792030V5d
                public final void LJFF(JSONObject jSONObject2, boolean z2) {
                    JSONObject jSONObjectOptJSONObject;
                    JSONObject jSONObjectOptJSONObject2;
                    JSONObject jSONObjectOptJSONObject3 = null;
                    if (jSONObject2 != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("general")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("slardar_api_settings")) != null) {
                        jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("report_setting");
                    }
                    int iOptInt = jSONObjectOptJSONObject3.optInt("compress_type", 2);
                    C793790VBx c793790VBx = C793920VCk.LIZ;
                    if (iOptInt == 2) {
                        if (System.currentTimeMillis() - C810670Vr7.LIZJ(C792190V5t.LIZIZ, 0, "dict_interval").getLong("force_zstd_timestamp", 0L) <= 3600000) {
                            c793790VBx.LIZIZ = 1;
                            return;
                        }
                    }
                    c793790VBx.LIZIZ = iOptInt;
                }
            });
        }
        LJIILLIIL();
        C0VCE c0vce = C793930VCl.LIZ;
        C08Q4 c08q4 = new C08Q4(C0VC5.LIZ);
        c0vce.LIZIZ = c08q4;
        String string2 = c08q4.LIZ.getString("rule", null);
        if (string2 != null) {
            try {
                C0VCL c0vclLIZ = C0VCL.LIZ(new JSONObject(string2));
                if (System.currentTimeMillis() < c0vclLIZ.LIZ) {
                    c0vcl = c0vclLIZ;
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        c0vce.LIZ(c0vcl, false);
    }

    public C0VCC(String str) {
        this.LJIL = str;
    }

    public final void LIZ(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aid", this.LJIL);
            C0VC1.LIZIZ(jSONObject2);
            jSONObject2.put("process_name", C08MV.LIZ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJJIII);
            sbLIZ.append("_");
            sbLIZ.append(LJJIIZ.getAndAdd(1L));
            jSONObject2.put("_debug_uuid", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put("_debug_self", jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC794060VCy
    public final void LIZIZ(long j) {
        if (this.LIZLLL <= 0) {
            return;
        }
        LJIILLIIL();
    }

    public final void LJ(C0VCF c0vcf) {
        JSONObject jSONObjectLIZIZ;
        if (this.LJIIIZ != 1 && !LJIIIIZZ(c0vcf.LJ, this.LJIIJJI, this.LJIIL) && (jSONObjectLIZIZ = c0vcf.LIZIZ(this.LJJII)) != null && jSONObjectLIZIZ.length() > 0) {
            C793910VCj.LIZ.LIZIZ(jSONObjectLIZIZ, CastLongProtector.parseLong(this.LJIL));
        }
    }

    public final void LJFF(C0VCF c0vcf) {
        JSONObject jSONObjectLIZIZ;
        if (!LJIIIIZZ(c0vcf.LJ, this.LJIIJJI, this.LJIIL) && C786410Ut5.H3(this.LIZ)) {
            if ((!LJIIIIZZ(c0vcf.LJ, this.LJIILIIL, this.LJIILJJIL) && this.LJIIJ == 0) || (jSONObjectLIZIZ = c0vcf.LIZIZ(this.LJJII)) == null) {
                return;
            }
            C793910VCj.LIZ.LIZIZ(jSONObjectLIZIZ, CastLongProtector.parseLong(this.LJIL));
        }
    }

    public final void LJIIL(C0VCJ c0vcj) {
        boolean zLJI = MethodIDManager.LJI(202287);
        try {
            String str = c0vcj.LIZIZ;
            if (this.LJI != null && !TextUtils.isEmpty(str) && this.LJI.opt(str) != null) {
                C793910VCj.LIZ.LIZIZ(c0vcj.LIZIZ(this.LJJII), CastLongProtector.parseLong(this.LJIL));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0117 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119 A[Catch: all -> 0x0221, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:10:0x0018, B:12:0x0020, B:13:0x002a, B:15:0x0032, B:16:0x0034, B:18:0x003c, B:19:0x0041, B:21:0x0049, B:23:0x004f, B:25:0x0056, B:27:0x005e, B:29:0x0066, B:31:0x006e, B:32:0x0072, B:34:0x0078, B:36:0x0080, B:37:0x0083, B:40:0x008a, B:42:0x0090, B:43:0x0095, B:45:0x00a4, B:46:0x00a6, B:48:0x00c0, B:49:0x00c2, B:50:0x00e5, B:52:0x00eb, B:56:0x00fa, B:39:0x0087, B:57:0x00fc, B:59:0x0106, B:63:0x010f, B:64:0x0111, B:68:0x0119, B:70:0x0121, B:71:0x0131, B:73:0x013b, B:75:0x0141, B:76:0x0153, B:78:0x0159, B:80:0x015f, B:82:0x016b, B:84:0x0175, B:85:0x0178, B:89:0x0180, B:90:0x0184, B:92:0x018a, B:94:0x0190, B:96:0x019b, B:98:0x01a5, B:99:0x01ac, B:103:0x01b4, B:104:0x01b8, B:106:0x01c2, B:107:0x01cb, B:109:0x01d1, B:111:0x01dd, B:115:0x01e6, B:116:0x01ea, B:118:0x01f4, B:119:0x01fd, B:121:0x0203, B:123:0x020f, B:127:0x021d, B:126:0x021a, B:113:0x01e2, B:101:0x01b0, B:87:0x017c, B:6:0x000e), top: B:135:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJIILL(org.json.JSONObject r11) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VCC.LJIILL(org.json.JSONObject):void");
    }

    public final void LJIIZILJ(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("code", -1);
        if (iOptInt == -1) {
            return;
        }
        SharedPreferences sharedPreferencesLIZLLL = LIZLLL();
        SharedPreferences.Editor editorEdit = sharedPreferencesLIZLLL.edit();
        if (iOptInt == 1) {
            this.LJJI = ((long) jSONObject.optInt("last_calculate_timestamp", 0)) * 1000;
            this.LJJIFFI = ((long) jSONObject.optInt("last_full_calculate_timestamp", 0)) * 1000;
            this.LIZJ = System.currentTimeMillis();
            editorEdit.putLong("monitor_configure_refresh_time", this.LIZJ);
            editorEdit.putLong("monitor_last_calculate_timestamp", this.LJJI);
            editorEdit.putLong("monitor_last_full_calculate_timestamp", this.LJJIFFI);
            editorEdit.putInt("monitor_config_update", 1);
            editorEdit.apply();
            return;
        }
        if (iOptInt == 0 || iOptInt == 2) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
            } else {
                String string = sharedPreferencesLIZLLL.getString("monitor_net_config", "");
                if (TextUtils.isEmpty(string)) {
                    string = "{}";
                }
                try {
                    jSONObjectOptJSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            try {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data_to_merge");
                if (jSONObjectOptJSONObject2 != null) {
                    C792450V6t.LIZLLL(jSONObjectOptJSONObject, jSONObjectOptJSONObject2);
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("data_to_delete");
                if (jSONObjectOptJSONObject3 != null) {
                    C792450V6t.LIZIZ(jSONObjectOptJSONObject, jSONObjectOptJSONObject3);
                }
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            this.LJJI = ((long) jSONObject.optInt("last_calculate_timestamp", 0)) * 1000;
            this.LJJIFFI = ((long) jSONObject.optInt("last_full_calculate_timestamp", 0)) * 1000;
            LJIILL(jSONObjectOptJSONObject);
            this.LIZJ = System.currentTimeMillis();
            editorEdit.putLong("monitor_configure_refresh_time", this.LIZJ);
            editorEdit.putString("monitor_net_config", C786410Ut5.J3(jSONObjectOptJSONObject));
            editorEdit.putLong("monitor_last_calculate_timestamp", this.LJJI);
            editorEdit.putLong("monitor_last_full_calculate_timestamp", this.LJJIFFI);
            editorEdit.putInt("monitor_config_update", 1);
            if (!this.LJIJJ) {
                this.LJIJJ = true;
                this.LJIJJLI.LIZ(this);
            }
            editorEdit.apply();
        }
    }

    public static byte[] LIZJ(byte[] bArr, Map<String, String> map) throws IOException {
        if (bArr.length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ((HashMap) map).put("Content-Encoding", "gzip");
                    return byteArray;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                gZIPOutputStream.close();
                throw th;
            }
        }
        return bArr;
    }

    public static boolean LJIIIIZZ(String str, List list, List list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C793950VCn.LIZ(list)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (str.contains((String) it2.next())) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!C793950VCn.LIZ(list2)) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (((Pattern) it3.next()).matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    public final void LJI(final Context context, final JSONObject jSONObject, final C0VCZ c0vcz) {
        if (this.LJIJI) {
            return;
        }
        this.LJIJI = true;
        LJJIII = System.currentTimeMillis();
        C0VCY.LIZ = C793940VCm.LIZ;
        C793990VCr c793990VCr = C793980VCq.LIZ;
        Runnable runnable = new Runnable() { // from class: X.0VCD
            public final void LIZ() {
                PackageInfo packageInfoY3;
                C0VCC c0vcc = this.LLILZ;
                Context context2 = context;
                JSONObject jSONObject2 = jSONObject;
                C0VCZ c0vcz2 = c0vcz;
                c0vcc.getClass();
                if (context2 != null && jSONObject2 != null) {
                    c0vcc.LJIJI = true;
                    c0vcc.LIZ = C786410Ut5.N3(context2);
                    c0vcc.LIZIZ = jSONObject2;
                    try {
                        jSONObject2.put("aid", c0vcc.LJIL);
                        c0vcc.LIZIZ.put("os", "Android");
                        c0vcc.LIZIZ.put("device_platform", "android");
                        c0vcc.LIZIZ.put("os_version", Build.VERSION.RELEASE);
                        c0vcc.LIZIZ.put("os_api", Build.VERSION.SDK_INT);
                        c0vcc.LIZIZ.put("device_model", Build.MODEL);
                        c0vcc.LIZIZ.put("device_brand", Build.BRAND);
                        c0vcc.LIZIZ.put("device_manufacturer", Build.MANUFACTURER);
                        c0vcc.LIZIZ.put("sdkmonitor_version", "2.0.42-rc.41");
                        c0vcc.LIZIZ.put("monitor_from", "sdk");
                        if (TextUtils.isEmpty(c0vcc.LIZIZ.optString("package_name"))) {
                            c0vcc.LIZIZ.put("package_name", context2.getPackageName());
                        }
                        if (TextUtils.isEmpty(c0vcc.LIZIZ.optString("version_name"))) {
                            packageInfoY3 = C786410Ut5.Y3(c0vcc.LIZ.getPackageManager(), c0vcc.LIZ.getPackageName(), 0);
                            c0vcc.LIZIZ.put("version_name", packageInfoY3.versionName);
                        } else {
                            packageInfoY3 = null;
                        }
                        if (TextUtils.isEmpty(c0vcc.LIZIZ.optString("version_code"))) {
                            if (packageInfoY3 == null) {
                                packageInfoY3 = C786410Ut5.Y3(c0vcc.LIZ.getPackageManager(), c0vcc.LIZ.getPackageName(), 0);
                            }
                            c0vcc.LIZIZ.put("version_code", packageInfoY3.versionCode);
                        }
                        c0vcc.LJIILL = c0vcz2;
                        if (c0vcz2 == null) {
                            c0vcc.LJIILL = new C0VCZ() { // from class: X.07Rn
                                @Override // X.C0VCZ
                                public final Map<String, String> getCommonParams() {
                                    return null;
                                }

                                @Override // X.C0VCZ
                                public final String getSessionId() {
                                    return null;
                                }
                            };
                        }
                        Map<String, String> commonParams = c0vcc.LJIILL.getCommonParams();
                        c0vcc.LJIILLIIL = commonParams;
                        if (commonParams == null) {
                            c0vcc.LJIILLIIL = new HashMap();
                        }
                        c0vcc.LJJ = TextUtils.equals(c0vcc.LJIILLIIL.get("oversea"), "1");
                        c0vcc.LJIILLIIL.put("aid", c0vcc.LJIL);
                        c0vcc.LJIILLIIL.put("device_id", c0vcc.LIZIZ.optString("device_id"));
                        c0vcc.LJIILLIIL.put("device_platform", "android");
                        c0vcc.LJIILLIIL.put("os", "Android");
                        c0vcc.LJIILLIIL.put("package_name", c0vcc.LIZIZ.optString("package_name"));
                        c0vcc.LJIILLIIL.put("channel", c0vcc.LIZIZ.optString("channel"));
                        c0vcc.LJIILLIIL.put("app_version", c0vcc.LIZIZ.optString("app_version"));
                        c0vcc.LJIILLIIL.put("sdkmonitor_version", "2.0.42-rc.41");
                        c0vcc.LJIILLIIL.put("minor_version", "1");
                        String strOptString = c0vcc.LIZIZ.optString("host_aid");
                        c0vcc.LJIILLIIL.put("host_aid", strOptString);
                        if (!TextUtils.isEmpty(strOptString)) {
                            C793590VBd.LJIIJ = CastLongProtector.parseLong(strOptString);
                        }
                        synchronized (C0VC5.class) {
                            if (C0VC5.LIZ == null) {
                                C0VC5.LIZ = context2;
                            }
                        }
                        Map<String, String> map = c0vcc.LJIILLIIL;
                        if (map != null && !map.isEmpty()) {
                            if (C0VC5.LIZJ == null) {
                                C0VC5.LIZJ = new HashMap();
                            }
                            ((HashMap) C0VC5.LIZJ).putAll(map);
                            ((HashMap) C0VC5.LIZJ).remove("aid");
                        }
                        C0VC5.LJ(c0vcc.LJIL, C1956807lW.LIZ(c0vcc.LIZIZ));
                        c0vcc.LJII();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (this.LLILZ.LJIJJ) {
                    C0VCC c0vcc2 = this.LLILZ;
                    c0vcc2.LJIJJLI.LIZ(c0vcc2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SDKMonitor@4056.init$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SDKMonitor@4056.init$3");
            }
        };
        C0VD0 c0vd0 = c793990VCr.LIZ;
        c0vd0.LIZIZ(Message.obtain(c0vd0.LIZLLL, runnable), Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public final void LJIIJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            C0VCJ c0vcj = new C0VCJ(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
            if (!this.LJIJJ) {
                this.LJIJJLI.LIZLLL(c0vcj);
            } else {
                C793980VCq.LIZ.LIZIZ(new C0VCT(this, c0vcj));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIILIIL(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            C0VCJ c0vcj = new C0VCJ(str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis());
            if (!this.LJIJJ) {
                this.LJIJJLI.LIZLLL(c0vcj);
            } else {
                C793980VCq.LIZ.LIZIZ(new C0VCT(this, c0vcj));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIIZ(long j, long j2, String str, String str2, int i) {
        try {
            C0VCF c0vcf = new C0VCF("api_error", j, j2, str, str2, i);
            if (!this.LJIJJ) {
                this.LJIJJLI.LIZJ(c0vcf);
            } else {
                C793980VCq.LIZ.LIZIZ(new ARunnableS82S0200000_13(this, c0vcf, 74));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIJJI(long j, long j2, String str, String str2, int i) {
        try {
            final C0VCF c0vcf = new C0VCF("api_all", j, j2, str, str2, i);
            if (!this.LJIJJ) {
                this.LJIJJLI.LIZJ(c0vcf);
            } else {
                C793980VCq.LIZ.LIZIZ(new Runnable() { // from class: X.0VCS
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SDKMonitor@4056.monitorSLA$1");
                        try {
                            this.LLILLJJLI.LJFF(c0vcf);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SDKMonitor@4056.monitorSLA$1");
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
