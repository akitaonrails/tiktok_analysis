package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import cs.bd.o.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2119008Rw extends a {
    public static volatile C2119008Rw LJI;
    public C0VCC LIZIZ;
    public boolean LIZJ = false;
    public final List<String> LIZLLL = Arrays.asList("https://mon.isnssdk.com/monitor/appmonitor/v2/settings", "https://i.isnssdk.com/monitor/appmonitor/v2/settings");
    public final List<String> LJ = Arrays.asList("https://mon.isnssdk.com/monitor/collect/", "https://i.isnssdk.com/monitor/collect/");
    public Context LJFF = null;

    public static C2119008Rw LJII() {
        if (LJI == null) {
            synchronized (C2119008Rw.class) {
                try {
                    if (LJI == null) {
                        LJI = new C2119008Rw();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    @Override // cs.bd.o.a
    public final void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C0VCC c0vcc = this.LIZIZ;
        if (c0vcc == null) {
            return;
        }
        c0vcc.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // cs.bd.o.a
    public final boolean LIZLLL(String str) {
        if (this.LIZJ) {
            return true;
        }
        Context context = this.LJFF;
        if (context == null) {
            context = C2110608Oq.LIZIZ.LIZ;
        }
        if (str != null) {
            try {
                if (!str.trim().isEmpty()) {
                    final JSONObject jSONObject = new JSONObject(str);
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "sdk_aid");
                    final String string2 = JSONObjectProtectorUtils.getString(jSONObject, "host_aid");
                    if (string.trim().isEmpty() || string2.trim().isEmpty()) {
                        return false;
                    }
                    SDKMonitorUtils.setConfigUrl(string, this.LIZLLL);
                    SDKMonitorUtils.setDefaultReportUrl(string, this.LJ);
                    jSONObject.remove("configURLs");
                    jSONObject.remove("reportURLs");
                    SDKMonitorUtils.initMonitor(context, string, jSONObject, new C0VCZ() { // from class: X.08Rd
                        @Override // X.C0VCZ
                        public final Map<String, String> getCommonParams() {
                            HashMap map = new HashMap();
                            JSONObject jSONObject2 = jSONObject;
                            if (jSONObject2 != null) {
                                try {
                                    map.put("oversea", JSONObjectProtectorUtils.getBoolean(jSONObject2, "oversea") ? "1" : CardStruct.IStatusCode.DEFAULT);
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    map.put("oversea", "1");
                                }
                            } else {
                                map.put("oversea", "1");
                            }
                            map.put("host_aid", string2);
                            return map;
                        }

                        @Override // X.C0VCZ
                        public final String getSessionId() {
                            return null;
                        }
                    });
                    C0VCC sDKMonitorUtils = SDKMonitorUtils.getInstance(string);
                    this.LIZIZ = sDKMonitorUtils;
                    if (sDKMonitorUtils == null) {
                        return false;
                    }
                    this.LIZJ = true;
                    return true;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    @Override // cs.bd.o.a
    public final void LJ(long j, long j2, String str, String str2, int i) {
        C0VCC c0vcc = this.LIZIZ;
        if (c0vcc == null) {
            return;
        }
        c0vcc.LJIIIZ(j, j2, str, str2, i);
    }

    @Override // cs.bd.o.a
    public final void LJFF(long j, long j2, String str, String str2, int i) {
        C0VCC c0vcc = this.LIZIZ;
        if (c0vcc == null) {
            return;
        }
        c0vcc.LJIIJJI(j, j2, str, str2, i);
    }

    public final boolean LJI(Context context, String str, String str2, String str3) {
        if (context == null) {
            return false;
        }
        this.LJFF = context;
        try {
            String packageName = context.getPackageName();
            String str4 = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionName;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host_aid", str2);
            jSONObject.put("device_id", str);
            jSONObject.put("channel", str3);
            jSONObject.put("app_version", str4);
            jSONObject.put("update_version_code", str4);
            jSONObject.put("package_name", packageName);
            jSONObject.put("sdk_aid", "4000");
            jSONObject.put("sdk_version", "v10.01.13-ov-android");
            jSONObject.put("oversea", true);
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            jSONObject.put("configURLs", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it3 = this.LJ.iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next());
            }
            jSONObject.put("reportURLs", jSONArray2);
            return LIZLLL(C786410Ut5.K3(4, jSONObject));
        } catch (PackageManager.NameNotFoundException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
