package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883390Yl7 implements C0YUG {
    public static final C883390Yl7 LIZ = new C883390Yl7();

    public static final String LIZJ() {
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
        return strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId == null ? "" : strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId;
    }

    public static final String LIZIZ() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpiForReal(I18nServiceApi.class);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            C0I0B.LJFF.LIZJ();
            String strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C894660Z7w.LIZ());
            if (strLJIILJJIL != null) {
                return strLJIILJJIL;
            }
        }
        return "";
    }

    @Override // X.C0YUG
    public final String LIZ() {
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ == null) {
            return "";
        }
        iMHostApiLIZ.LJIIJ();
        return "https://im-va.tiktokv.com/";
    }

    @Override // X.C0YUG
    public final int getAppId() {
        C0I0B.LJFF.LIZJ();
        return C2213981Bky.LIZIZ.getAppId();
    }

    @Override // X.C0YUG
    public final String getChannel() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZIZ();
    }

    @Override // X.C0YUG
    public final long getVersionCode() {
        C0I0B.LJFF.LIZJ();
        return C2213981Bky.LIZIZ.getVersionCode();
    }

    @Override // X.C0YUG
    public final boolean isDebug() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZJ();
    }

    @Override // X.C0YUG
    public final boolean isLocalTest() {
        C0I0B.LJFF.LIZJ();
        return Intrinsics.LJFF(C894660Z7w.LIZIZ(), "local_test");
    }

    @Override // X.C0YUG
    public final String getDeviceId() {
        return C0W8I.LIZ().toString();
    }
}
