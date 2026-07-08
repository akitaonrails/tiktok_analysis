package X;

import Y.ARunnableS18S1200000_13;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B90, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B90 implements C1B67 {
    public static volatile C1B90 LJ;
    public static volatile boolean LJFF;
    public C1B93 LIZ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public long LIZLLL;

    public static C1B90 LIZ() {
        if (LJ == null) {
            synchronized (C1B90.class) {
                try {
                    if (LJ == null) {
                        LJ = new C1B90();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public final void LIZJ() {
        C1B93 c1b93 = this.LIZ;
        if (c1b93 == null) {
            throw new IllegalArgumentException("config is null");
        }
        if (c1b93.getContext() == null) {
            throw new IllegalArgumentException("context is null");
        }
        if (TextUtils.isEmpty(this.LIZ.getAid())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aid ");
            sbLIZ.append(this.LIZ.getAid());
            sbLIZ.append(" is invalid");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            this.LIZIZ = this.LIZ.getDeviceId();
            this.LIZLLL = this.LIZ.getUpdateVersionCode();
            this.LIZJ = this.LIZ.getAid();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_id", this.LIZ.getDeviceId());
            jSONObject.put("host_aid", this.LIZ.getAid());
            jSONObject.put("channel", this.LIZ.getChannel());
            jSONObject.put("app_version", this.LIZ.getAppVersionName());
            jSONObject.put("update_version_code", String.valueOf(this.LIZ.getUpdateVersionCode()));
            jSONObject.put("package_name", this.LIZ.getPackageName());
            jSONObject.put("oversea", "1");
            String[] monitorHosts = this.LIZ.getMonitorHosts();
            if (monitorHosts == null || monitorHosts.length <= 0) {
                SDKMonitorUtils.setConfigUrl("2993", Arrays.asList(C1796430wqf.LIZ));
                SDKMonitorUtils.setDefaultReportUrl("2993", Arrays.asList(C1796430wqf.LIZIZ));
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (String str : monitorHosts) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("https://");
                    sbLIZ2.append(str);
                    sbLIZ2.append("/monitor/appmonitor/v2/settings");
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("https://");
                    sbLIZ3.append(str);
                    sbLIZ3.append("/monitor/collect/");
                    arrayList2.add(C2188811AlT.LIZIZ(sbLIZ3));
                }
                SDKMonitorUtils.setConfigUrl("2993", arrayList);
                SDKMonitorUtils.setDefaultReportUrl("2993", arrayList2);
            }
            SDKMonitorUtils.initMonitor(this.LIZ.getContext(), "2993", jSONObject, new C0VCZ() { // from class: X.1B92
                @Override // X.C0VCZ
                public final String getSessionId() {
                    return null;
                }

                @Override // X.C0VCZ
                public final Map<String, String> getCommonParams() {
                    HashMap map = new HashMap();
                    map.put("host_aid", String.valueOf(this.LIZ.LIZ.getAid()));
                    map.put("oversea", "1");
                    return map;
                }
            });
            LJFF = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL(JSONObject jSONObject) {
        String strValueOf;
        try {
            if (TextUtils.isEmpty(jSONObject.optString("app_id"))) {
                jSONObject.put("app_id", this.LIZJ);
            }
            if (TextUtils.isEmpty(jSONObject.optString("device_id"))) {
                jSONObject.put("device_id", this.LIZIZ);
                String str = this.LIZIZ;
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                    strValueOf = String.valueOf(CastLongProtector.valueOf(str).longValue() % 100);
                } else {
                    strValueOf = "";
                }
                jSONObject.put("device_id_postfix", strValueOf);
            }
            if (jSONObject.optInt("update_version") == 0) {
                jSONObject.put("update_version", this.LIZLLL);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.C1B67
    public final void LIZIZ(String str, JSONObject jSONObject) {
        int iOptInt;
        try {
            if (!LJFF) {
                synchronized (C1B90.class) {
                    try {
                        if (!LJFF) {
                            LIZJ();
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            LIZLLL(jSONObject);
            if (!TextUtils.isEmpty(jSONObject.optString("event_page"))) {
                SDKMonitorUtils.getInstance("2993").LJIIJ(str, jSONObject, null, null);
            }
            C1B91 c1b91LIZ = C1B91.LIZ();
            c1b91LIZ.getClass();
            if (("download_db".equals(str) || (iOptInt = jSONObject.optInt("download_status", 0)) == -3 || iOptInt == -4 || iOptInt == -1 || iOptInt == -2) && C2199661B7c.LJIILJJIL()) {
                if (C2199671B7d.LJIJJLI()) {
                    C2199681B7e.LJI().submit(new ARunnableS18S1200000_13(jSONObject, c1b91LIZ, str, 13));
                } else {
                    c1b91LIZ.LIZJ(str, jSONObject);
                }
            }
        } catch (Throwable th) {
        }
    }
}
