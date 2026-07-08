package X;

import android.app.Application;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.regression_test.OpenAuditOfflineService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WS3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WS3 {
    public static void LIZ(Application application) {
        OpenAuditOfflineService openAuditOfflineService;
        C2407009bw.LIZ();
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && (openAuditOfflineService = (OpenAuditOfflineService) PluggableExtentionKt.pluggableSpi$default(OpenAuditOfflineService.class, false, false, false, 8, null)) != null) {
            DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            openAuditOfflineService.LIZ();
            openAuditOfflineService.init();
        }
    }
}
