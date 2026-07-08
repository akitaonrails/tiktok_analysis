package X;

import android.os.SystemClock;
import com.ss.android.deviceregister.DeviceRegisterManager;

/* JADX INFO: renamed from: X.0C9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309040C9m {
    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        sbLIZ.append('-');
        sbLIZ.append(SystemClock.uptimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
