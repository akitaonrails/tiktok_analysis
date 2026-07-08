package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W8I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8I {
    public static final C0W8I LIZ = new C0W8I();

    public static final CharSequence LIZ() {
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        return (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null || strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId.length() == 0) ? "-1" : strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
    }

    public static boolean LIZIZ() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZJ();
    }

    public static boolean LIZJ() {
        C0I0B.LJFF.LIZJ();
        return TextUtils.equals(C894660Z7w.LIZIZ(), "local_test");
    }

    public static final boolean LIZLLL(Long l) {
        if (C1317805Ds.LIZ(l)) {
            return false;
        }
        long jLIZJ = C461720I8s.LIZJ();
        if (l == null || jLIZJ != l.longValue()) {
            return false;
        }
        return true;
    }

    public static void LJ(String str, String str2, Map map) {
        JSONObject jSONObject = new JSONObject();
        if (!map.isEmpty()) {
            try {
                if (TextUtils.isEmpty(null)) {
                    jSONObject.put("service", str);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    sbLIZ.append((String) null);
                    jSONObject.put("service", C2188811AlT.LIZIZ(sbLIZ));
                }
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                C793770VBv.LJ(str2, jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
