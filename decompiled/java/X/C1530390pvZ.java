package X;

import android.app.Application;
import com.bytedance.forest.Forest;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530390pvZ extends C09AY implements Function0<Forest> {
    public C1530390pvZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Forest invoke() {
        Application applicationLIZ = C1BWL.LIZ();
        C1553670qX7.LIZ.getClass();
        String strLIZIZ = C1553670qX7.LIZIZ();
        String strLIZ = C1553670qX7.LIZ();
        C844470XAv.LIZ.getClass();
        Long lValueOf = Long.valueOf(C844470XAv.LJIIJ);
        String strLIZJ = C844470XAv.LIZJ();
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
            strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = CardStruct.IStatusCode.DEFAULT;
        }
        C1533560q0g c1533560q0g = new C1533560q0g(strLIZIZ, new C1533570q0h(strLIZ, "offlineX", lValueOf, strLIZJ, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, C2222691Bz1.LIZ(), false, 192), C1697810uHb.LJIILJJIL("tt/webview/js_manage"));
        c1533560q0g.LJFF = "ForestProvider";
        c1533560q0g.LJI = true;
        return new Forest(applicationLIZ, c1533560q0g);
    }
}
