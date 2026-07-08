package X;

import android.os.Build;
import com.ss.android.common.applog.AppLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0dfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059370dfr {
    public static Map<String, String> LIZ(List<String> list) {
        HashMap map = new HashMap();
        C844470XAv.LIZ.getClass();
        map.put("appVersion", C844470XAv.LIZJ());
        map.put("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        map.put("netType", C786410Ut5.c3(C844470XAv.LIZ()));
        String str = C844470XAv.LJ;
        if (str == null) {
            str = null;
        }
        map.put("appName", str);
        map.put("aid", String.valueOf(C844470XAv.LJIIJ));
        map.put("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        map.put("versionCode", String.valueOf(C844470XAv.LIZIZ()));
        map.put("channel", C844470XAv.LJIILL);
        map.put("os_version", Build.VERSION.RELEASE);
        map.put("device_platform", "android");
        map.put("ironManSupported", String.valueOf(C988700bps.LIZ.LIZIZ().checkMiniAppEnable(C844470XAv.LIZ())));
        map.put("prefetch_enable", "1");
        map.put("device_type", Build.MODEL);
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                map.remove(it2.next());
            }
        }
        return map;
    }
}
