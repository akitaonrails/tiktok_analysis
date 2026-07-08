package X;

import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0wQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780110wQL {
    public static VEVideoEncodeSettings LIZ(int i, int i2, int i3) {
        if (VEConfigCenter.getInstance().getValue("ve_reverse_opt_hw_encode", false).booleanValue()) {
            C1780100wQK c1780100wQK = new C1780100wQK(2);
            c1780100wQK.LJIIJ(i, i2);
            c1780100wQK.LIZIZ.resizeMode = i3;
            c1780100wQK.LJII(-1);
            VEVideoEncodeSettings vEVideoEncodeSettings = c1780100wQK.LIZIZ;
            vEVideoEncodeSettings.enableRemuxVideo = false;
            vEVideoEncodeSettings.enableRemuxVideoForRotation = false;
            vEVideoEncodeSettings.enableRemuxVideoForShoot = false;
            vEVideoEncodeSettings.mWatermarkParam = null;
            vEVideoEncodeSettings.hpBitrateRatio = 0.8d;
            vEVideoEncodeSettings.fullHdBitrateRatio = 1.25d;
            vEVideoEncodeSettings.sdBitrateRatio = 0.9d;
            vEVideoEncodeSettings.m2kBitrateRatio = 2.0d;
            vEVideoEncodeSettings.m4kBitrateRatio = 4.0d;
            vEVideoEncodeSettings.highFpsBitrateRatio = 1.4d;
            vEVideoEncodeSettings.transitionBitrateRatio = 1.5d;
            vEVideoEncodeSettings.mTransitionKeyframeEnable = true;
            vEVideoEncodeSettings.mTransitionKeyFrameMode = 2;
            vEVideoEncodeSettings.swPreset = VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
            VEVideoEncodeSettings vEVideoEncodeSettings2 = c1780100wQK.LIZIZ;
            vEVideoEncodeSettings2.swMaxrate = 0L;
            vEVideoEncodeSettings2.swMinQp = 20;
            vEVideoEncodeSettings2.swMaxQp = 35;
            vEVideoEncodeSettings2.isSupportHWEncoder = true;
            vEVideoEncodeSettings2.gopSize = 0;
            c1780100wQK.LJFF(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH);
            c1780100wQK.LJIIIIZZ(25);
            c1780100wQK.LJ(8500000);
            return c1780100wQK.LIZ();
        }
        if (VEConfigCenter.getInstance().getValue("ve_reverse_opt_sw_encode", false).booleanValue()) {
            C1780100wQK c1780100wQK2 = new C1780100wQK(2);
            c1780100wQK2.LJIIJ(i, i2);
            c1780100wQK2.LIZIZ.resizeMode = i3;
            c1780100wQK2.LJII(-1);
            VEVideoEncodeSettings vEVideoEncodeSettings3 = c1780100wQK2.LIZIZ;
            vEVideoEncodeSettings3.enableRemuxVideo = false;
            vEVideoEncodeSettings3.enableRemuxVideoForRotation = false;
            vEVideoEncodeSettings3.enableRemuxVideoForShoot = false;
            vEVideoEncodeSettings3.mWatermarkParam = null;
            vEVideoEncodeSettings3.hpBitrateRatio = 0.8d;
            vEVideoEncodeSettings3.fullHdBitrateRatio = 1.25d;
            vEVideoEncodeSettings3.sdBitrateRatio = 0.9d;
            vEVideoEncodeSettings3.m2kBitrateRatio = 2.0d;
            vEVideoEncodeSettings3.m4kBitrateRatio = 4.0d;
            vEVideoEncodeSettings3.highFpsBitrateRatio = 1.4d;
            vEVideoEncodeSettings3.transitionBitrateRatio = 1.5d;
            vEVideoEncodeSettings3.mTransitionKeyframeEnable = true;
            vEVideoEncodeSettings3.mTransitionKeyFrameMode = 2;
            vEVideoEncodeSettings3.swPreset = VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
            VEVideoEncodeSettings vEVideoEncodeSettings4 = c1780100wQK2.LIZIZ;
            vEVideoEncodeSettings4.swMaxrate = 0L;
            vEVideoEncodeSettings4.swMinQp = 20;
            vEVideoEncodeSettings4.swMaxQp = 35;
            vEVideoEncodeSettings4.isSupportHWEncoder = false;
            vEVideoEncodeSettings4.gopSize = 1;
            c1780100wQK2.LJFF(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE);
            c1780100wQK2.LJ(8500000);
            c1780100wQK2.LJIIIIZZ(25);
            return c1780100wQK2.LIZ();
        }
        C1780100wQK c1780100wQK3 = new C1780100wQK(2);
        c1780100wQK3.LJIIJ(i, i2);
        c1780100wQK3.LIZIZ.resizeMode = i3;
        c1780100wQK3.LJII(30);
        c1780100wQK3.LIZIZ.isSupportHWEncoder = false;
        c1780100wQK3.LJIIIIZZ(13);
        VEVideoEncodeSettings vEVideoEncodeSettings5 = c1780100wQK3.LIZIZ;
        vEVideoEncodeSettings5.gopSize = 1;
        vEVideoEncodeSettings5.mWatermarkParam = null;
        c1780100wQK3.LJFF(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE);
        VEVideoEncodeSettings.ENCODE_PRESET encode_preset = VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST;
        c1780100wQK3.LIZIZ.swPreset = encode_preset.ordinal();
        VEVideoEncodeSettings vEVideoEncodeSettings6 = c1780100wQK3.LIZIZ;
        vEVideoEncodeSettings6.enableRemuxVideo = false;
        vEVideoEncodeSettings6.enableRemuxVideoForRotation = false;
        return c1780100wQK3.LIZ();
    }
}
