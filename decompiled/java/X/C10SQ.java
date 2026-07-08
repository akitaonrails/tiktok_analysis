package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.step.tts.TTSConditionHelper;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10SQ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SQ {
    public static void LIZ(String str) {
        IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ;
        String strLJ;
        String strLJFF;
        IPluginService iPluginService;
        C19254610Um c19254610Um = C19254610Um.LIZIZ;
        c19254610Um.LJJIL().LJII();
        c19254610Um.LJJIL().LIZLLL(str);
        if (C123100dR.LIZ(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            IAppsflyerApi iAppsflyerApi = (IAppsflyerApi) PluggableExtentionKt.pluggableSpi$default(IAppsflyerApi.class, false, false, false, 14, null);
            if (iAppsflyerApi != null) {
                strLJ = iAppsflyerApi.LJ();
            } else {
                strLJ = null;
            }
            if (C123100dR.LIZ(strLJ)) {
                IAppsflyerApi iAppsflyerApi2 = (IAppsflyerApi) PluggableExtentionKt.pluggableSpi$default(IAppsflyerApi.class, false, false, false, 14, null);
                if (iAppsflyerApi2 != null) {
                    strLJFF = iAppsflyerApi2.LJFF();
                } else {
                    strLJFF = null;
                }
                if (Intrinsics.LJFF(strLJFF, "tts") && (iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null)) != null) {
                    iPluginService.startPluginRequest(null, null, Boolean.FALSE, true, 103);
                }
            }
        }
        TTSConditionHelper.LIZ.getClass();
        TTSConditionHelper.LIZ();
        if (C294580Bge.LIZ() && (iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ()) != null) {
            iPNSConsentConfigServiceLJIIIZ.LJ(null, null);
        }
    }
}
