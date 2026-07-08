package X;

import com.ss.android.common.applog.AppLog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.09DJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09DJ {
    public static final String LIZ() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String str = simpleDateFormat.format(Calendar.getInstance().getTime());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0CHQ.LIZ().getApplicationService().getClass();
        sbLIZ.append(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
