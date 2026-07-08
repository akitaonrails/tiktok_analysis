package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B91, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B91 {
    public static volatile C1B91 LIZIZ;
    public volatile EnumC994200byk LIZ = EnumC994200byk.NOT_INIT;

    public static C1B91 LIZ() {
        if (LIZIZ == null) {
            synchronized (C1B91.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1B91();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(Context context) {
        try {
            String[] strArr = C1796430wqf.LIZ;
            String[] strArr2 = C1796430wqf.LIZIZ;
            if (Boolean.TRUE == null) {
                return;
            }
            String string = Integer.toString(2891);
            JSONObject jSONObject = new JSONObject();
            C1B93 c1b93 = C1B90.LIZ().LIZ;
            if (c1b93 == null) {
                return;
            }
            jSONObject.put("device_id", c1b93.getDeviceId());
            jSONObject.put("channel", c1b93.getChannel());
            jSONObject.put("app_version", c1b93.getAppVersionName());
            jSONObject.put("update_version_code", c1b93.getUpdateVersionCode());
            jSONObject.put("package_name", c1b93.getPackageName());
            jSONObject.put("oversea", "1");
            SDKMonitorUtils.setConfigUrl(string, Arrays.asList(strArr));
            SDKMonitorUtils.setDefaultReportUrl(string, Arrays.asList(strArr2));
            SDKMonitorUtils.initMonitor(context, string, jSONObject, new C0VCZ() { // from class: X.1B94
                @Override // X.C0VCZ
                public final Map<String, String> getCommonParams() {
                    return null;
                }

                @Override // X.C0VCZ
                public final String getSessionId() {
                    return null;
                }
            });
            this.LIZ = EnumC994200byk.HAS_INIT;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZJ(String str, JSONObject jSONObject) {
        synchronized (this) {
            try {
                if (this.LIZ == EnumC994200byk.NOT_INIT) {
                    LIZIZ(C2199681B7e.LJFF());
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (jSONObject != null) {
            try {
                try {
                    jSONObject.put("monitor_version", 1);
                    if (TextUtils.isEmpty(jSONObject.optString("sdk_app_id"))) {
                        jSONObject.put("sdk_app_id", 2891);
                    }
                    if (TextUtils.isEmpty(jSONObject.optString("event_page"))) {
                        jSONObject.put("event_page", "UNKNOWN");
                    }
                } catch (Throwable th) {
                }
            } catch (Throwable th2) {
                return;
            }
        }
        if (this.LIZ == EnumC994200byk.HAS_INIT) {
            if (str.equals("download_failed")) {
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "download_fail");
                SDKMonitorUtils.getInstance(Integer.toString(2891)).LJIIJ("download_common", jSONObject, null, null);
            }
            SDKMonitorUtils.getInstance(Integer.toString(2891)).LJIIJ(str, jSONObject, null, null);
        }
    }
}
