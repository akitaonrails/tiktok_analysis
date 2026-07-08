package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.UUID;

/* JADX INFO: renamed from: X.0CGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310750CGb {
    public static final String LIZ() {
        if (!(!((Boolean) C107900az.LIZ.getValue()).booleanValue())) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null) {
            strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = "";
        }
        sbLIZ.append(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        sbLIZ.append(UUID.randomUUID());
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d A[PHI: r1
      0x011d: PHI (r1v10 java.lang.String) = (r1v8 java.lang.String), (r1v12 java.lang.String) binds: [B:64:0x0104, B:59:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(X.C669560QOc r7, java.lang.String r8, com.ss.android.ugc.aweme.search.model.SearchResultParam r9) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310750CGb.LIZIZ(X.0QOc, java.lang.String, com.ss.android.ugc.aweme.search.model.SearchResultParam):java.lang.String");
    }
}
