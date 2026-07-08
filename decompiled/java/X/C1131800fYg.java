package X;

import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayAnimationDowngradeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131800fYg {
    public static final C1131800fYg LIZ = new C1131800fYg();
    public static volatile boolean LIZIZ;

    public static boolean LIZIZ() {
        return C781880Ulm.LIZIZ || C1101370elb.LIZ.LJIILJJIL("live_gift_overload_downgrade_tray_animation_enable") || LiveGiftTrayAnimationDowngradeTestSetting.INSTANCE.isEnabled();
    }

    public static boolean LIZ(DataChannel dataChannel) {
        boolean z;
        C1077790e9Z c1077790e9Z;
        if (ScalableDowngradeSetting.disableGiftTrayAnim() && dataChannel != null && (c1077790e9Z = (C1077790e9Z) dataChannel.gg0(LowDevicePerfScalableChannel.class)) != null && c1077790e9Z.LIZIZ.ordinal() <= EnumC1087640ePS.LEVEL_CRITICAL.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        if (LIZIZ()) {
            return true;
        }
        return z;
    }
}
