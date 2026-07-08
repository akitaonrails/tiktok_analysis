package X;

import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import kotlin.jvm.internal.AwS129S1200000_13;

/* JADX INFO: renamed from: X.0WGS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WGS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
            strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = "";
        }
        C0WG6 c0wg6 = C0WG5.LIZIZ;
        C844470XAv.LIZ.getClass();
        C0WG5 c0wg5LIZ = c0wg6.LIZ(C844470XAv.LIZ());
        if (TextUtils.isEmpty(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId)) {
            return;
        }
        C20144713rx c20144713rx = new C20144713rx(939524365);
        C837720Wte.LIZ("Firebase", "setUserId", c20144713rx, new AwS129S1200000_13(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, c20144713rx, c0wg5LIZ, 3));
    }
}
