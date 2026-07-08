package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveRoomRechargeAgreementConfigSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRoomEnableNewDisclaimerView;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;

/* JADX INFO: renamed from: X.0x66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806000x66 {
    public static boolean LIZ() {
        LiveRoomRechargeAgreementConfigSetting liveRoomRechargeAgreementConfigSetting = LiveRoomRechargeAgreementConfigSetting.INSTANCE;
        LiveRechargeAgreementConfig value = liveRoomRechargeAgreementConfigSetting.getValue();
        if (value == null) {
            value = liveRoomRechargeAgreementConfigSetting.getDEFAULT();
        }
        return value.isShowRechargeLawInUS || (LiveRoomEnableNewDisclaimerView.INSTANCE.getValue() && value.isShowRechargeLawInRegion);
    }
}
