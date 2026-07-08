package X;

import com.bytedance.ies.nle.editor_jni.NLEVideoCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEVideoHWEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEVideoSWEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEWaterMarkPosition;
import com.bytedance.ies.nle.editor_jni.NLE_ENCODE_BITRATE_MODE;
import com.bytedance.ies.nle.editor_jni.NLE_ENCODE_PRESET;
import com.bytedance.ies.nle.editor_jni.NLE_ENCODE_PROFILE;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWaterMarkPosition;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoEncodePreset;
import com.ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0wK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776260wK8 {
    public static final NLE_ENCODE_BITRATE_MODE LIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode) {
        int i = C1778400wNa.LJ[encode_bitrate_mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return NLE_ENCODE_BITRATE_MODE.NLE_ENCODE_BITRATE_ABR;
                    }
                    return NLE_ENCODE_BITRATE_MODE.NLE_ENCODE_BITRATE_VBR;
                }
                return NLE_ENCODE_BITRATE_MODE.NLE_ENCODE_BITRATE_QP;
            }
            return NLE_ENCODE_BITRATE_MODE.NLE_ENCODE_BITRATE_CRF;
        }
        return NLE_ENCODE_BITRATE_MODE.NLE_ENCODE_BITRATE_ABR;
    }

    public static final float LIZIZ(ROTATE_DEGREE rotate_degree) {
        int i = C1778400wNa.LJIIJ[rotate_degree.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return 0.0f;
                }
                return 90.0f;
            }
            return 180.0f;
        }
        return 270.0f;
    }

    public static final NLEVideoCompileEncodeSettings LIZJ(VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings) {
        NLE_ENCODE_PRESET nle_encode_preset;
        NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings = new NLEVideoCompileEncodeSettings();
        nLEVideoCompileEncodeSettings.setUseHWEncoder(vEVideoCompileEncodeSettings.useHWEncoder);
        nLEVideoCompileEncodeSettings.setEnableHwBufferEncode(vEVideoCompileEncodeSettings.enableHwBufferEncode);
        nLEVideoCompileEncodeSettings.setIsSupportHWEncoder(vEVideoCompileEncodeSettings.isSupportHWEncoder);
        VEVideoHWEncodeSettings vEVideoHWEncodeSettings = vEVideoCompileEncodeSettings.mHWEncodeSetting;
        NLEVideoHWEncodeSettings nLEVideoHWEncodeSettings = new NLEVideoHWEncodeSettings();
        nLEVideoHWEncodeSettings.setMBitrate(vEVideoHWEncodeSettings.mBitrate);
        nLEVideoHWEncodeSettings.setMProfile(LIZLLL(VEVideoEncodeProfile.values()[vEVideoHWEncodeSettings.mProfile]));
        nLEVideoHWEncodeSettings.setMHp_bitrate_ratio((float) vEVideoHWEncodeSettings.mHp_bitrate_ratio);
        nLEVideoHWEncodeSettings.setMFullHd_bitrate_ratio((float) vEVideoHWEncodeSettings.mFullHd_bitrate_ratio);
        nLEVideoHWEncodeSettings.setMSd_bitrate_ratio((float) vEVideoHWEncodeSettings.mSd_bitrate_ratio);
        nLEVideoHWEncodeSettings.setMH_fps_bitrate_ratio((float) vEVideoHWEncodeSettings.mH_fps_bitrate_ratio);
        nLEVideoHWEncodeSettings.setTransition_bitrate_ratio((float) vEVideoHWEncodeSettings.transition_bitrate_ratio);
        nLEVideoHWEncodeSettings.setM2K_bitrate_ratio((float) vEVideoHWEncodeSettings.m2K_bitrate_ratio);
        nLEVideoHWEncodeSettings.setM4K_bitrate_ratio((float) vEVideoHWEncodeSettings.m4K_bitrate_ratio);
        nLEVideoHWEncodeSettings.setMGop(vEVideoHWEncodeSettings.mGop);
        nLEVideoHWEncodeSettings.setMCodecType(vEVideoHWEncodeSettings.mCodecType);
        nLEVideoHWEncodeSettings.setMQpMin(vEVideoHWEncodeSettings.mQpMin);
        nLEVideoHWEncodeSettings.setMQpMax(vEVideoHWEncodeSettings.mQpMax);
        nLEVideoCompileEncodeSettings.setMHWEncodeSetting(nLEVideoHWEncodeSettings);
        VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
        NLEVideoSWEncodeSettings nLEVideoSWEncodeSettings = new NLEVideoSWEncodeSettings();
        nLEVideoSWEncodeSettings.setMCrf(vEVideoSWEncodeSettings.mCrf);
        nLEVideoSWEncodeSettings.setMQPOffset(vEVideoSWEncodeSettings.mQPOffset);
        nLEVideoSWEncodeSettings.setMBps(vEVideoSWEncodeSettings.mBps);
        nLEVideoSWEncodeSettings.setMBitrateMode(LIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.values()[vEVideoSWEncodeSettings.mBitrateMode]));
        switch (C1778400wNa.LJFF[VEVideoEncodePreset.values()[vEVideoSWEncodeSettings.mPreset].ordinal()]) {
            case 1:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_FAST;
                break;
            case 2:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_FASTER;
                break;
            case 3:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_MEDIUM;
                break;
            case 4:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_PLACEBO;
                break;
            case 5:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_SLOW;
                break;
            case 6:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_SLOWER;
                break;
            case 7:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_SUPERFAST;
                break;
            case 8:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_VERYFAST;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_VERYSLOW;
                break;
            default:
                nle_encode_preset = NLE_ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST;
                break;
        }
        nLEVideoSWEncodeSettings.setMPreset(nle_encode_preset);
        nLEVideoSWEncodeSettings.setMProfile(LIZLLL(VEVideoEncodeProfile.values()[vEVideoSWEncodeSettings.mProfile]));
        nLEVideoCompileEncodeSettings.setMSWEncodeSetting(nLEVideoSWEncodeSettings);
        return nLEVideoCompileEncodeSettings;
    }

    public static final NLE_ENCODE_PROFILE LIZLLL(VEVideoEncodeProfile vEVideoEncodeProfile) {
        int i = C1778400wNa.LIZJ[vEVideoEncodeProfile.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return NLE_ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
                    }
                    return NLE_ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
                }
                return NLE_ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
            }
            return NLE_ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        }
        return NLE_ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings LJ(com.ss.android.vesdk.VEVideoEncodeSettings r11) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1776260wK8.LJ(com.ss.android.vesdk.VEVideoEncodeSettings):com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings");
    }

    public static final NLEWaterMarkPosition LJFF(VEWaterMarkPosition vEWaterMarkPosition) {
        int i = C1778400wNa.LJII[vEWaterMarkPosition.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return NLEWaterMarkPosition.TL_BR;
                        }
                        return NLEWaterMarkPosition.TR;
                    }
                    return NLEWaterMarkPosition.TL_BR;
                }
                return NLEWaterMarkPosition.TL;
            }
            return NLEWaterMarkPosition.BR;
        }
        return NLEWaterMarkPosition.BL;
    }
}
