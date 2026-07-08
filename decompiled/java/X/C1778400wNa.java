package X;

import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEWaterMarkPosition;
import com.bytedance.ies.nle.editor_jni.NLE_COMPILE_TYPE;
import com.bytedance.ies.nle.editor_jni.NLE_ENCODE_BITRATE_MODE;
import com.bytedance.ies.nle.editor_jni.NLE_ENCODE_PRESET;
import com.bytedance.ies.nle.editor_jni.NLE_ENCODE_PROFILE;
import com.bytedance.ies.nle.editor_jni.NLE_ENCODE_STANDARD;
import com.bytedance.ies.nle.editor_jni.NLE_GET_FRAME_FLAGS;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWaterMarkPosition;
import com.ss.android.vesdk.settings.VEVideoEncodePreset;
import com.ss.android.vesdk.settings.VEVideoEncodeProfile;

/* JADX INFO: renamed from: X.0wNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1778400wNa {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;
    public static final /* synthetic */ int[] LJ;
    public static final /* synthetic */ int[] LJFF;
    public static final /* synthetic */ int[] LJI;
    public static final /* synthetic */ int[] LJII;
    public static final /* synthetic */ int[] LJIIIIZZ;
    public static final /* synthetic */ int[] LJIIIZ;
    public static final /* synthetic */ int[] LJIIJ;
    public static final /* synthetic */ int[] LJIIJJI;

    static {
        VEEditor.VEState.values();
        try {
            VEEditor.VEState.PREPARED.ordinal();
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            VEEditor.VEState.STARTED.ordinal();
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            VEEditor.VEState.PAUSED.ordinal();
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            VEEditor.VEState.SEEKING.ordinal();
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            VEEditor.VEState.STOPPED.ordinal();
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            VEEditor.VEState.IDLE.ordinal();
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        int[] iArr = new int[NLEPlayerState.values().length];
        try {
            iArr[NLEPlayerState.PREPARED.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[NLEPlayerState.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[NLEPlayerState.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[NLEPlayerState.SEEKING.ordinal()] = 4;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[NLEPlayerState.STOPPED.ordinal()] = 5;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[NLEPlayerState.IDLE.ordinal()] = 6;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        LIZ = iArr;
        NLESeekFlag.values();
        try {
            NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek.ordinal();
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            NLESeekFlag.EDITOR_SEEK_FLAG_OnGoing.ordinal();
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateInOut.ordinal();
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateIn.ordinal();
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateOut.ordinal();
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        NLE_ENCODE_STANDARD.values();
        try {
            NLE_ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            NLE_ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal();
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            NLE_ENCODE_STANDARD.ENCODE_STANDARD_MPEG4.ordinal();
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        int[] iArr2 = new int[VEVideoEncodeSettings.ENCODE_STANDARD.values().length];
        try {
            iArr2[VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal()] = 1;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        try {
            iArr2[VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal()] = 2;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        try {
            iArr2[VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_MPEG4.ordinal()] = 3;
        } catch (NoSuchFieldError e23) {
            TryCatchGuardChecker.doCheck(e23);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[VEVideoEncodeProfile.values().length];
        try {
            iArr3[VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e24) {
            TryCatchGuardChecker.doCheck(e24);
        }
        try {
            iArr3[VEVideoEncodeProfile.ENCODE_PROFILE_BASELINE.ordinal()] = 2;
        } catch (NoSuchFieldError e25) {
            TryCatchGuardChecker.doCheck(e25);
        }
        try {
            iArr3[VEVideoEncodeProfile.ENCODE_PROFILE_HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError e26) {
            TryCatchGuardChecker.doCheck(e26);
        }
        try {
            iArr3[VEVideoEncodeProfile.ENCODE_PROFILE_MAIN.ordinal()] = 4;
        } catch (NoSuchFieldError e27) {
            TryCatchGuardChecker.doCheck(e27);
        }
        LIZJ = iArr3;
        int[] iArr4 = new int[VEVideoEncodeSettings.ENCODE_PROFILE.values().length];
        try {
            iArr4[VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e28) {
            TryCatchGuardChecker.doCheck(e28);
        }
        try {
            iArr4[VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE.ordinal()] = 2;
        } catch (NoSuchFieldError e29) {
            TryCatchGuardChecker.doCheck(e29);
        }
        try {
            iArr4[VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError e30) {
            TryCatchGuardChecker.doCheck(e30);
        }
        try {
            iArr4[VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN.ordinal()] = 4;
        } catch (NoSuchFieldError e31) {
            TryCatchGuardChecker.doCheck(e31);
        }
        LIZLLL = iArr4;
        NLE_ENCODE_PROFILE.values();
        try {
            NLE_ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        } catch (NoSuchFieldError e32) {
            TryCatchGuardChecker.doCheck(e32);
        }
        try {
            NLE_ENCODE_PROFILE.ENCODE_PROFILE_BASELINE.ordinal();
        } catch (NoSuchFieldError e33) {
            TryCatchGuardChecker.doCheck(e33);
        }
        try {
            NLE_ENCODE_PROFILE.ENCODE_PROFILE_HIGH.ordinal();
        } catch (NoSuchFieldError e34) {
            TryCatchGuardChecker.doCheck(e34);
        }
        try {
            NLE_ENCODE_PROFILE.ENCODE_PROFILE_MAIN.ordinal();
        } catch (NoSuchFieldError e35) {
            TryCatchGuardChecker.doCheck(e35);
        }
        int[] iArr5 = new int[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.values().length];
        try {
            iArr5[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR.ordinal()] = 1;
        } catch (NoSuchFieldError e36) {
            TryCatchGuardChecker.doCheck(e36);
        }
        try {
            iArr5[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal()] = 2;
        } catch (NoSuchFieldError e37) {
            TryCatchGuardChecker.doCheck(e37);
        }
        try {
            iArr5[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal()] = 3;
        } catch (NoSuchFieldError e38) {
            TryCatchGuardChecker.doCheck(e38);
        }
        try {
            iArr5[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR.ordinal()] = 4;
        } catch (NoSuchFieldError e39) {
            TryCatchGuardChecker.doCheck(e39);
        }
        LJ = iArr5;
        NLE_ENCODE_BITRATE_MODE.values();
        try {
            NLE_ENCODE_BITRATE_MODE.NLE_ENCODE_BITRATE_ABR.ordinal();
        } catch (NoSuchFieldError e40) {
            TryCatchGuardChecker.doCheck(e40);
        }
        try {
            NLE_ENCODE_BITRATE_MODE.NLE_ENCODE_BITRATE_CRF.ordinal();
        } catch (NoSuchFieldError e41) {
            TryCatchGuardChecker.doCheck(e41);
        }
        try {
            NLE_ENCODE_BITRATE_MODE.NLE_ENCODE_BITRATE_QP.ordinal();
        } catch (NoSuchFieldError e42) {
            TryCatchGuardChecker.doCheck(e42);
        }
        try {
            NLE_ENCODE_BITRATE_MODE.NLE_ENCODE_BITRATE_VBR.ordinal();
        } catch (NoSuchFieldError e43) {
            TryCatchGuardChecker.doCheck(e43);
        }
        int[] iArr6 = new int[VEVideoEncodePreset.values().length];
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_FAST.ordinal()] = 1;
        } catch (NoSuchFieldError e44) {
            TryCatchGuardChecker.doCheck(e44);
        }
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_FASTER.ordinal()] = 2;
        } catch (NoSuchFieldError e45) {
            TryCatchGuardChecker.doCheck(e45);
        }
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError e46) {
            TryCatchGuardChecker.doCheck(e46);
        }
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_PLACEBO.ordinal()] = 4;
        } catch (NoSuchFieldError e47) {
            TryCatchGuardChecker.doCheck(e47);
        }
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_SLOW.ordinal()] = 5;
        } catch (NoSuchFieldError e48) {
            TryCatchGuardChecker.doCheck(e48);
        }
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_SLOWER.ordinal()] = 6;
        } catch (NoSuchFieldError e49) {
            TryCatchGuardChecker.doCheck(e49);
        }
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_SUPERFAST.ordinal()] = 7;
        } catch (NoSuchFieldError e50) {
            TryCatchGuardChecker.doCheck(e50);
        }
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_ULTRAFAST.ordinal()] = 8;
        } catch (NoSuchFieldError e51) {
            TryCatchGuardChecker.doCheck(e51);
        }
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_VERYFAST.ordinal()] = 9;
        } catch (NoSuchFieldError e52) {
            TryCatchGuardChecker.doCheck(e52);
        }
        try {
            iArr6[VEVideoEncodePreset.ENCODE_LEVEL_VERYSLOW.ordinal()] = 10;
        } catch (NoSuchFieldError e53) {
            TryCatchGuardChecker.doCheck(e53);
        }
        LJFF = iArr6;
        int[] iArr7 = new int[VEVideoEncodeSettings.ENCODE_PRESET.values().length];
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_FAST.ordinal()] = 1;
        } catch (NoSuchFieldError e54) {
            TryCatchGuardChecker.doCheck(e54);
        }
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_FASTER.ordinal()] = 2;
        } catch (NoSuchFieldError e55) {
            TryCatchGuardChecker.doCheck(e55);
        }
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError e56) {
            TryCatchGuardChecker.doCheck(e56);
        }
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_PLACEBO.ordinal()] = 4;
        } catch (NoSuchFieldError e57) {
            TryCatchGuardChecker.doCheck(e57);
        }
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_SLOW.ordinal()] = 5;
        } catch (NoSuchFieldError e58) {
            TryCatchGuardChecker.doCheck(e58);
        }
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_SLOWER.ordinal()] = 6;
        } catch (NoSuchFieldError e59) {
            TryCatchGuardChecker.doCheck(e59);
        }
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_SUPERFAST.ordinal()] = 7;
        } catch (NoSuchFieldError e60) {
            TryCatchGuardChecker.doCheck(e60);
        }
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal()] = 8;
        } catch (NoSuchFieldError e61) {
            TryCatchGuardChecker.doCheck(e61);
        }
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_VERYFAST.ordinal()] = 9;
        } catch (NoSuchFieldError e62) {
            TryCatchGuardChecker.doCheck(e62);
        }
        try {
            iArr7[VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_VERYSLOW.ordinal()] = 10;
        } catch (NoSuchFieldError e63) {
            TryCatchGuardChecker.doCheck(e63);
        }
        LJI = iArr7;
        NLE_ENCODE_PRESET.values();
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_FAST.ordinal();
        } catch (NoSuchFieldError e64) {
            TryCatchGuardChecker.doCheck(e64);
        }
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_FASTER.ordinal();
        } catch (NoSuchFieldError e65) {
            TryCatchGuardChecker.doCheck(e65);
        }
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_MEDIUM.ordinal();
        } catch (NoSuchFieldError e66) {
            TryCatchGuardChecker.doCheck(e66);
        }
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_PLACEBO.ordinal();
        } catch (NoSuchFieldError e67) {
            TryCatchGuardChecker.doCheck(e67);
        }
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_SLOW.ordinal();
        } catch (NoSuchFieldError e68) {
            TryCatchGuardChecker.doCheck(e68);
        }
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_SLOWER.ordinal();
        } catch (NoSuchFieldError e69) {
            TryCatchGuardChecker.doCheck(e69);
        }
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_SUPERFAST.ordinal();
        } catch (NoSuchFieldError e70) {
            TryCatchGuardChecker.doCheck(e70);
        }
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        } catch (NoSuchFieldError e71) {
            TryCatchGuardChecker.doCheck(e71);
        }
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_VERYFAST.ordinal();
        } catch (NoSuchFieldError e72) {
            TryCatchGuardChecker.doCheck(e72);
        }
        try {
            NLE_ENCODE_PRESET.ENCODE_LEVEL_VERYSLOW.ordinal();
        } catch (NoSuchFieldError e73) {
            TryCatchGuardChecker.doCheck(e73);
        }
        NLEWaterMarkPosition.values();
        try {
            NLEWaterMarkPosition.BL.ordinal();
        } catch (NoSuchFieldError e74) {
            TryCatchGuardChecker.doCheck(e74);
        }
        try {
            NLEWaterMarkPosition.BR.ordinal();
        } catch (NoSuchFieldError e75) {
            TryCatchGuardChecker.doCheck(e75);
        }
        try {
            NLEWaterMarkPosition.TL.ordinal();
        } catch (NoSuchFieldError e76) {
            TryCatchGuardChecker.doCheck(e76);
        }
        try {
            NLEWaterMarkPosition.TL_BR.ordinal();
        } catch (NoSuchFieldError e77) {
            TryCatchGuardChecker.doCheck(e77);
        }
        try {
            NLEWaterMarkPosition.TR.ordinal();
        } catch (NoSuchFieldError e78) {
            TryCatchGuardChecker.doCheck(e78);
        }
        int[] iArr8 = new int[VEWaterMarkPosition.values().length];
        try {
            iArr8[VEWaterMarkPosition.BL.ordinal()] = 1;
        } catch (NoSuchFieldError e79) {
            TryCatchGuardChecker.doCheck(e79);
        }
        try {
            iArr8[VEWaterMarkPosition.BR.ordinal()] = 2;
        } catch (NoSuchFieldError e80) {
            TryCatchGuardChecker.doCheck(e80);
        }
        try {
            iArr8[VEWaterMarkPosition.TL.ordinal()] = 3;
        } catch (NoSuchFieldError e81) {
            TryCatchGuardChecker.doCheck(e81);
        }
        try {
            iArr8[VEWaterMarkPosition.TL_BR.ordinal()] = 4;
        } catch (NoSuchFieldError e82) {
            TryCatchGuardChecker.doCheck(e82);
        }
        try {
            iArr8[VEWaterMarkPosition.TR.ordinal()] = 5;
        } catch (NoSuchFieldError e83) {
            TryCatchGuardChecker.doCheck(e83);
        }
        LJII = iArr8;
        int[] iArr9 = new int[VEVideoEncodeSettings.COMPILE_TYPE.values().length];
        try {
            iArr9[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4.ordinal()] = 1;
        } catch (NoSuchFieldError e84) {
            TryCatchGuardChecker.doCheck(e84);
        }
        try {
            iArr9[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_GIF.ordinal()] = 2;
        } catch (NoSuchFieldError e85) {
            TryCatchGuardChecker.doCheck(e85);
        }
        try {
            iArr9[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_HIGH_GIF.ordinal()] = 3;
        } catch (NoSuchFieldError e86) {
            TryCatchGuardChecker.doCheck(e86);
        }
        try {
            iArr9[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_PNG.ordinal()] = 4;
        } catch (NoSuchFieldError e87) {
            TryCatchGuardChecker.doCheck(e87);
        }
        try {
            iArr9[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_JPEG.ordinal()] = 5;
        } catch (NoSuchFieldError e88) {
            TryCatchGuardChecker.doCheck(e88);
        }
        try {
            iArr9[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_WEBP.ordinal()] = 6;
        } catch (NoSuchFieldError e89) {
            TryCatchGuardChecker.doCheck(e89);
        }
        LJIIIIZZ = iArr9;
        NLE_COMPILE_TYPE.values();
        try {
            NLE_COMPILE_TYPE.COMPILE_TYPE_MP4.ordinal();
        } catch (NoSuchFieldError e90) {
            TryCatchGuardChecker.doCheck(e90);
        }
        try {
            NLE_COMPILE_TYPE.COMPILE_TYPE_GIF.ordinal();
        } catch (NoSuchFieldError e91) {
            TryCatchGuardChecker.doCheck(e91);
        }
        try {
            NLE_COMPILE_TYPE.COMPILE_TYPE_HIGH_GIF.ordinal();
        } catch (NoSuchFieldError e92) {
            TryCatchGuardChecker.doCheck(e92);
        }
        try {
            NLE_COMPILE_TYPE.COMPILE_TYPE_PNG.ordinal();
        } catch (NoSuchFieldError e93) {
            TryCatchGuardChecker.doCheck(e93);
        }
        try {
            NLE_COMPILE_TYPE.COMPILE_TYPE_JPEG.ordinal();
        } catch (NoSuchFieldError e94) {
            TryCatchGuardChecker.doCheck(e94);
        }
        try {
            NLE_COMPILE_TYPE.COMPILE_TYPE_WEBP.ordinal();
        } catch (NoSuchFieldError e95) {
            TryCatchGuardChecker.doCheck(e95);
        }
        NLE_GET_FRAME_FLAGS.values();
        try {
            NLE_GET_FRAME_FLAGS.NLE_GET_FRAMES_MODE_NORMAL.ordinal();
        } catch (NoSuchFieldError e96) {
            TryCatchGuardChecker.doCheck(e96);
        }
        try {
            NLE_GET_FRAME_FLAGS.NLE_GET_FRAMES_MODE_NOEFFECT.ordinal();
        } catch (NoSuchFieldError e97) {
            TryCatchGuardChecker.doCheck(e97);
        }
        int[] iArr10 = new int[VEEditor.GET_FRAMES_FLAGS.values().length];
        try {
            iArr10[VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e98) {
            TryCatchGuardChecker.doCheck(e98);
        }
        try {
            iArr10[VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT.ordinal()] = 2;
        } catch (NoSuchFieldError e99) {
            TryCatchGuardChecker.doCheck(e99);
        }
        LJIIIZ = iArr10;
        int[] iArr11 = new int[ROTATE_DEGREE.values().length];
        try {
            iArr11[ROTATE_DEGREE.ROTATE_90.ordinal()] = 1;
        } catch (NoSuchFieldError e100) {
            TryCatchGuardChecker.doCheck(e100);
        }
        try {
            iArr11[ROTATE_DEGREE.ROTATE_180.ordinal()] = 2;
        } catch (NoSuchFieldError e101) {
            TryCatchGuardChecker.doCheck(e101);
        }
        try {
            iArr11[ROTATE_DEGREE.ROTATE_270.ordinal()] = 3;
        } catch (NoSuchFieldError e102) {
            TryCatchGuardChecker.doCheck(e102);
        }
        LJIIJ = iArr11;
        int[] iArr12 = new int[EnumC1464490oDH.values().length];
        try {
            iArr12[EnumC1464490oDH.VIDEO_OUT_RATIO_1_1.ordinal()] = 1;
        } catch (NoSuchFieldError e103) {
            TryCatchGuardChecker.doCheck(e103);
        }
        try {
            iArr12[EnumC1464490oDH.VIDEO_OUT_RATIO_4_3.ordinal()] = 2;
        } catch (NoSuchFieldError e104) {
            TryCatchGuardChecker.doCheck(e104);
        }
        try {
            iArr12[EnumC1464490oDH.VIDEO_OUT_RATIO_3_4.ordinal()] = 3;
        } catch (NoSuchFieldError e105) {
            TryCatchGuardChecker.doCheck(e105);
        }
        try {
            iArr12[EnumC1464490oDH.VIDEO_OUT_RATIO_16_9.ordinal()] = 4;
        } catch (NoSuchFieldError e106) {
            TryCatchGuardChecker.doCheck(e106);
        }
        try {
            iArr12[EnumC1464490oDH.VIDEO_OUT_RATIO_9_16.ordinal()] = 5;
        } catch (NoSuchFieldError e107) {
            TryCatchGuardChecker.doCheck(e107);
        }
        LJIIJJI = iArr12;
        NLETrackType.values();
        try {
            NLETrackType.VIDEO.ordinal();
        } catch (NoSuchFieldError e108) {
            TryCatchGuardChecker.doCheck(e108);
        }
        try {
            NLETrackType.AUDIO.ordinal();
        } catch (NoSuchFieldError e109) {
            TryCatchGuardChecker.doCheck(e109);
        }
    }
}
