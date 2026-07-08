package X;

import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309030C9l extends C09AY implements Function0<Boolean> {
    public C309030C9l() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        boolean z = true;
        if (!TextUtils.isEmpty(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId) && !TextUtils.equals(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, CardStruct.IStatusCode.DEFAULT) && C0C64.LJIILLIIL().LJIJ(31744, 0, "real_time_report_of_new_user", false) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
