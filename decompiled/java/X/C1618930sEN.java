package X;

import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;

/* JADX INFO: renamed from: X.0sEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618930sEN {
    public static String LIZIZ = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
    public static C1618930sEN LIZJ;
    public final Keva LIZ;

    public C1618930sEN() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inbox_moving_reminder");
        sbLIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
