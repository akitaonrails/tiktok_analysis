package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1780100wQK {
    public final int LIZ;
    public final VEVideoEncodeSettings LIZIZ;
    public final Map<VEVideoEncodeSettings.ENCODE_STANDARD, Integer> LIZJ;

    public final VEVideoEncodeSettings LIZ() {
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
        Map<VEVideoEncodeSettings.ENCODE_STANDARD, Integer> map = this.LIZJ;
        VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1;
        if (((HashMap) map).containsKey(encode_standard)) {
            Integer num = (Integer) ((HashMap) this.LIZJ).get(encode_standard);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hw_bytevc1 objMaxPixelCount= ");
            sbLIZ.append(num);
            sbLIZ.append(" settings.encodeStandard= ");
            sbLIZ.append(vEVideoEncodeSettings.encodeStandard);
            C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ));
            if (vEVideoEncodeSettings.encodeStandard == encode_standard.ordinal() && num != null) {
                VESize vESize = this.LIZIZ.outputSize;
                if (vESize.width * vESize.height > num.intValue()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("hw_bytevc1 change encode standard outputsize= ");
                    sbLIZ2.append(this.LIZIZ.outputSize.width);
                    sbLIZ2.append(" x ");
                    sbLIZ2.append(this.LIZIZ.outputSize.height);
                    C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ2));
                    vEVideoEncodeSettings.encodeStandard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
                }
            }
        }
        if (VEConfigCenter.getInstance().getValue("enable_android_hw_hdr_compile_support", false).booleanValue()) {
            vEVideoEncodeSettings.encodeStandard = encode_standard.ordinal();
        }
        if (TextUtils.isEmpty(this.LIZIZ.externalSettingsJsonStr)) {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            VEVideoEncodeSettings vEVideoEncodeSettings2 = this.LIZIZ;
            boolean z = vEVideoEncodeSettings2.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.isSupportHWEncoder = z;
            vEVideoCompileEncodeSettings.useHWEncoder = z;
            vEVideoCompileEncodeSettings.enableHwBufferEncode = vEVideoEncodeSettings2.enableHwBufferEncode;
            VERuntime.getInstance().enableTransitionKeyframe(this.LIZIZ.mTransitionKeyframeEnable);
            VERuntime.getInstance().setTransitionKeyFrameVersion(this.LIZIZ.mTransitionKeyFrameVersion);
            VERuntime.getInstance().setTransitionKeyFrameMode(this.LIZIZ.mTransitionKeyFrameMode);
            VERuntime.getInstance().setTransitionFrameCount(this.LIZIZ.mTransitionFrameCount);
            VEVideoHWEncodeSettings vEVideoHWEncodeSettings = vEVideoCompileEncodeSettings.mHWEncodeSetting;
            VEVideoEncodeSettings vEVideoEncodeSettings3 = this.LIZIZ;
            vEVideoHWEncodeSettings.mBitrate = vEVideoEncodeSettings3.bps;
            vEVideoHWEncodeSettings.mProfile = vEVideoEncodeSettings3.encodeProfile;
            vEVideoHWEncodeSettings.mGop = vEVideoEncodeSettings3.gopSize;
            vEVideoHWEncodeSettings.mCodecType = vEVideoEncodeSettings3.encodeStandard;
            vEVideoHWEncodeSettings.mHp_bitrate_ratio = vEVideoEncodeSettings3.hpBitrateRatio;
            vEVideoHWEncodeSettings.mFullHd_bitrate_ratio = vEVideoEncodeSettings3.fullHdBitrateRatio;
            vEVideoHWEncodeSettings.mSd_bitrate_ratio = vEVideoEncodeSettings3.sdBitrateRatio;
            vEVideoHWEncodeSettings.mH_fps_bitrate_ratio = vEVideoEncodeSettings3.highFpsBitrateRatio;
            vEVideoHWEncodeSettings.mHevc_bitrate_ratio = vEVideoEncodeSettings3.hevcBitrateRatio;
            vEVideoHWEncodeSettings.transition_bitrate_ratio = vEVideoEncodeSettings3.transitionBitrateRatio;
            vEVideoHWEncodeSettings.m2K_bitrate_ratio = vEVideoEncodeSettings3.m2kBitrateRatio;
            vEVideoHWEncodeSettings.m4K_bitrate_ratio = vEVideoEncodeSettings3.m4kBitrateRatio;
            double value = VEConfigCenter.getInstance().getValue("ve_record_hdr_bitrate_ratio", 1.0f);
            if (value != 1.0d) {
                this.LIZIZ.mHdr_bitrate_ratio = value;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("overrideWithUserConfig, get record HDR ratio from AB = ");
                sbLIZ3.append(this.LIZIZ.mHdr_bitrate_ratio);
                C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ3));
            }
            VEVideoHWEncodeSettings vEVideoHWEncodeSettings2 = vEVideoCompileEncodeSettings.mHWEncodeSetting;
            VEVideoEncodeSettings vEVideoEncodeSettings4 = this.LIZIZ;
            vEVideoHWEncodeSettings2.mHdr_bitrate_ratio = vEVideoEncodeSettings4.mHdr_bitrate_ratio;
            vEVideoHWEncodeSettings2.mQpMin = vEVideoEncodeSettings4.hwEncodeQpMin;
            vEVideoHWEncodeSettings2.mQpMax = vEVideoEncodeSettings4.hwEncodeQpMax;
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = vEVideoEncodeSettings4.bitrateMode.ordinal();
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            VEVideoEncodeSettings vEVideoEncodeSettings5 = this.LIZIZ;
            vEVideoSWEncodeSettings.mBps = vEVideoEncodeSettings5.bps;
            vEVideoSWEncodeSettings.mCrf = vEVideoEncodeSettings5.swCRF;
            vEVideoSWEncodeSettings.mQPOffset = vEVideoEncodeSettings5.swQPOffset;
            vEVideoSWEncodeSettings.mHFpsOffset = vEVideoEncodeSettings5.swHFpsOffset;
            vEVideoSWEncodeSettings.mByteVC1Crf = vEVideoEncodeSettings5.swByteVC1Crf;
            vEVideoSWEncodeSettings.mByteVC1HdrCrf = vEVideoEncodeSettings5.swByteVC1HdrCrf;
            vEVideoSWEncodeSettings.mSDCrfRatio = vEVideoEncodeSettings5.swSDCrfRatio;
            vEVideoSWEncodeSettings.mThreadCount = vEVideoEncodeSettings5.swThreadCount;
            vEVideoSWEncodeSettings.mMinQP = vEVideoEncodeSettings5.swMinQp;
            vEVideoSWEncodeSettings.mMaxQP = vEVideoEncodeSettings5.swMaxQp;
            vEVideoSWEncodeSettings.mFHDCrfRatio = vEVideoEncodeSettings5.swFHDCrfRatio;
            vEVideoSWEncodeSettings.mMaxRate = vEVideoEncodeSettings5.swMaxrate;
            vEVideoSWEncodeSettings.mPreset = vEVideoEncodeSettings5.swPreset;
            vEVideoSWEncodeSettings.mByteVC1Preset = vEVideoEncodeSettings5.swByteVC1Preset;
            vEVideoSWEncodeSettings.mProfile = vEVideoEncodeSettings5.encodeProfile;
            vEVideoSWEncodeSettings.mGop = vEVideoEncodeSettings5.gopSize;
            vEVideoEncodeSettings5.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            vEVideoEncodeSettings5.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings;
        } else {
            String str = this.LIZIZ.externalSettingsJsonStr;
            try {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("ServerExternalSettingsJsonStr = ");
                sbLIZ4.append(str);
                C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ4));
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "compile");
                boolean zOptBoolean = jSONObject.optBoolean("bytevc_remux_enable", false);
                VEVideoEncodeSettings vEVideoEncodeSettings6 = this.LIZIZ;
                vEVideoEncodeSettings6.enableByteVCRemuxVideo = zOptBoolean || vEVideoEncodeSettings6.enableByteVCRemuxVideo;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("parseExternalSettingsJsonStr enableByteVCRemuxVideo= ");
                sbLIZ5.append(this.LIZIZ.enableByteVCRemuxVideo);
                sbLIZ5.append(" bytevcRemuxEnable= ");
                sbLIZ5.append(zOptBoolean);
                sbLIZ5.append(" VEConfig_Enable= ");
                sbLIZ5.append(VEConfigCenter.getInstance().getValue("vesdk_use_bytevcremux_in_publish", false));
                C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ5));
                this.LIZIZ.mTransitionKeyframeEnable = jSONObject.optBoolean("transition_keyframe_enable", false);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("parseExternalSettingsJsonStr keyframe mTransitionKeyframeEnable=");
                sbLIZ6.append(this.LIZIZ.mTransitionKeyframeEnable);
                C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ6));
                VERuntime.getInstance().enableTransitionKeyframe(this.LIZIZ.mTransitionKeyframeEnable);
                this.LIZIZ.mTransitionKeyFrameVersion = jSONObject.optInt("transition_keyframe_version", -1);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("parseExternalSettingsJsonStr keyframe mTransitionKeyFrameVersion=");
                sbLIZ7.append(this.LIZIZ.mTransitionKeyFrameVersion);
                C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ7));
                VERuntime.getInstance().setTransitionKeyFrameVersion(this.LIZIZ.mTransitionKeyFrameVersion);
                this.LIZIZ.mTransitionKeyFrameMode = jSONObject.optInt("transition_keyframe_mode", 0);
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("parseExternalSettingsJsonStr keyframe mTransitionKeyframeMode=");
                sbLIZ8.append(this.LIZIZ.mTransitionKeyFrameMode);
                C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ8));
                VERuntime.getInstance().setTransitionKeyFrameMode(this.LIZIZ.mTransitionKeyFrameMode);
                this.LIZIZ.mTransitionFrameCount = jSONObject.optInt("transition_frame_count", 1);
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("parseExternalSettingsJsonStr mTransitionFrameCount=");
                sbLIZ9.append(this.LIZIZ.mTransitionFrameCount);
                C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ9));
                VERuntime.getInstance().setTransitionFrameCount(this.LIZIZ.mTransitionFrameCount);
                this.LIZIZ.mVideoCompileEncodeSetting = LIZLLL(jSONObject2);
                this.LIZIZ.mVideoWatermarkCompileEncodeSetting = LIZLLL(JSONObjectProtectorUtils.getJSONObject(jSONObject, "watermark_compile"));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("external json str parse error : ");
                sbLIZ10.append(e.getLocalizedMessage());
                C2484209oO.LIZJ("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ10));
            }
        }
        int value2 = VEConfigCenter.getInstance().getValue("ve_recorder_encode_gop_size", 0);
        if (this.LIZ == 1 && value2 > 0) {
            this.LIZIZ.gopSize = value2;
        }
        int i = VEConfigCenter.getInstance().getValue("ve_enable_render_encode_resolution_align4", false).booleanValue() ? 4 : 16;
        if (this.LIZ == 1) {
            this.LIZIZ.mResolutionAlign = i;
        }
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("exportVideoEncodeSettings = ");
        sbLIZ11.append(this.LIZIZ);
        C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ11));
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("exportVideoEncodeSettings.compile = ");
        sbLIZ12.append(this.LIZIZ.mVideoCompileEncodeSetting);
        C2484209oO.LJI("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ12));
        return this.LIZIZ;
    }

    public final void LIZIZ() {
        this.LIZIZ.encodeStandard = VEConfigCenter.getInstance().getValue("ve_compile_codec_type", 0);
        if (!VEConfigCenter.getInstance().getValue("veabtest_aboffline_performance", false).booleanValue()) {
            this.LIZJ.put(VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1, Integer.valueOf(VEConfigCenter.getInstance().getValue("ve_compile_hw_bytevc1_max_pixel_count", 8294400)));
        }
        this.LIZIZ.enableByteVCRemuxVideo = VEConfigCenter.getInstance().getValue("vesdk_use_bytevcremux_in_publish", false).booleanValue();
    }

    public C1780100wQK(int i) {
        this.LIZJ = new HashMap();
        this.LIZ = i;
        this.LIZIZ = new VEVideoEncodeSettings();
        LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0255 A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0278 A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029d A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c2 A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e7 A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030c A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0331 A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c2 A[Catch: JSONException -> 0x03e5, TRY_ENTER, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bb A[Catch: JSONException -> 0x03e5, TRY_ENTER, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2 A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0213 A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0234 A[Catch: JSONException -> 0x03e5, TryCatch #0 {JSONException -> 0x03e5, blocks: (B:3:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0041, B:12:0x004c, B:14:0x0050, B:16:0x005c, B:58:0x0164, B:60:0x0172, B:62:0x0184, B:64:0x0189, B:66:0x019c, B:67:0x019e, B:69:0x01a3, B:25:0x0076, B:27:0x0084, B:29:0x0096, B:31:0x009b, B:33:0x00ae, B:34:0x00b0, B:35:0x00b4, B:36:0x00c6, B:38:0x00d4, B:40:0x00e6, B:42:0x00ea, B:44:0x00fd, B:45:0x00ff, B:46:0x0103, B:47:0x0115, B:49:0x0123, B:51:0x0135, B:53:0x013a, B:55:0x014d, B:56:0x014f, B:57:0x0152, B:68:0x01a0, B:73:0x01bb, B:79:0x01e4, B:81:0x01f2, B:83:0x01f7, B:85:0x0203, B:86:0x0207, B:169:0x03ae, B:87:0x0209, B:89:0x0213, B:91:0x0218, B:93:0x0224, B:94:0x0228, B:168:0x03a4, B:95:0x022a, B:97:0x0234, B:99:0x0239, B:101:0x0245, B:102:0x0249, B:167:0x039a, B:103:0x024b, B:105:0x0255, B:107:0x025a, B:109:0x0266, B:110:0x026a, B:166:0x0390, B:111:0x026c, B:113:0x0278, B:115:0x027d, B:117:0x028b, B:118:0x028f, B:165:0x0384, B:119:0x0291, B:121:0x029d, B:123:0x02a2, B:125:0x02b0, B:126:0x02b4, B:164:0x0378, B:127:0x02b6, B:129:0x02c2, B:131:0x02c7, B:133:0x02d5, B:134:0x02d9, B:163:0x036c, B:135:0x02db, B:137:0x02e7, B:139:0x02ec, B:141:0x02fa, B:142:0x02fe, B:162:0x0361, B:143:0x0300, B:145:0x030c, B:147:0x0311, B:149:0x031f, B:150:0x0323, B:161:0x0356, B:151:0x0325, B:153:0x0331, B:155:0x0336, B:157:0x0344, B:158:0x0346, B:160:0x034b, B:159:0x0348, B:174:0x03c2, B:180:0x03de, B:175:0x03cb, B:177:0x03d6, B:179:0x03dc, B:181:0x03e1, B:74:0x01cc, B:76:0x01dc, B:78:0x01e2, B:170:0x03b8, B:13:0x004e, B:11:0x0044), top: B:186:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.vesdk.settings.VEVideoHWEncodeSettings LIZJ(org.json.JSONObject r23) {
        /*
            Method dump skipped, instruction units count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1780100wQK.LIZJ(org.json.JSONObject):com.ss.android.vesdk.settings.VEVideoHWEncodeSettings");
    }

    public final VEVideoCompileEncodeSettings LIZLLL(JSONObject jSONObject) {
        int i;
        long j;
        int i2;
        int iOrdinal;
        int i3;
        VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
        try {
            VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
            vEVideoCompileEncodeSettings.isSupportHWEncoder = vEVideoEncodeSettings.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.enableHwBufferEncode = vEVideoEncodeSettings.enableHwBufferEncode;
            String string = JSONObjectProtectorUtils.getString(jSONObject, "encode_mode");
            if ("unknown".equals(string) && this.LIZ == 2) {
                vEVideoCompileEncodeSettings.useHWEncoder = this.LIZIZ.isSupportHWEncoder;
            } else {
                vEVideoCompileEncodeSettings.useHWEncoder = "hw".equals(string);
            }
            VEVideoHWEncodeSettings vEVideoHWEncodeSettingsLIZJ = LIZJ(jSONObject);
            vEVideoCompileEncodeSettings.mHWEncodeSetting = vEVideoHWEncodeSettingsLIZJ;
            vEVideoHWEncodeSettingsLIZJ.mCodecType = this.LIZIZ.encodeStandard;
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ != 2 || JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "crf") != -1) {
                i = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "crf");
            } else {
                VEVideoEncodeSettings vEVideoEncodeSettings2 = this.LIZIZ;
                if (vEVideoEncodeSettings2.isSupportHWEncoder) {
                    i = vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf;
                } else {
                    i = vEVideoEncodeSettings2.swCRF;
                }
            }
            vEVideoSWEncodeSettings.mCrf = i;
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = 0.0d;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("qpoffset")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "qpoffset");
            }
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mHFpsOffset = 0.0d;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("hfpsoffset")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mHFpsOffset = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "hfpsoffset");
            }
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("bytevc1_crf")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mByteVC1Crf = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "bytevc1_crf");
            }
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("bytevc1_hdr_crf")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mByteVC1HdrCrf = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "bytevc1_hdr_crf");
            }
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mSDCrfRatio = 1.0d;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("sd_crf_ratio")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mSDCrfRatio = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "sd_crf_ratio");
            }
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mThreadCount = 6;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("thread_count")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mThreadCount = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "thread_count");
            }
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mMinQP = 15;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("minQp")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mMinQP = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "minQp");
            }
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxQP = 39;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("maxQp")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxQP = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "maxQp");
            }
            vEVideoCompileEncodeSettings.mSWEncodeSetting.mFHDCrfRatio = 1.0d;
            if (!JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("fhd_crf_ratio")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mFHDCrfRatio = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "fhd_crf_ratio");
            }
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings2 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ != 2 || JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "maxrate") != -1) {
                j = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "maxrate");
            } else {
                VEVideoEncodeSettings vEVideoEncodeSettings3 = this.LIZIZ;
                if (vEVideoEncodeSettings3.isSupportHWEncoder) {
                    j = vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate;
                } else {
                    j = vEVideoEncodeSettings3.swMaxrate;
                }
            }
            vEVideoSWEncodeSettings2.mMaxRate = j;
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings3 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ != 2 || JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "preset") != -1) {
                i2 = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "preset");
            } else {
                VEVideoEncodeSettings vEVideoEncodeSettings4 = this.LIZIZ;
                if (vEVideoEncodeSettings4.isSupportHWEncoder) {
                    i2 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset;
                } else {
                    i2 = vEVideoEncodeSettings4.swPreset;
                }
            }
            vEVideoSWEncodeSettings3.mPreset = i2;
            if (this.LIZIZ.encodeStandard == VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal() && this.LIZ == 2 && !JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw").isNull("preset")) {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mByteVC1Preset = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "preset");
            }
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings4 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ != 2 || !"unknown".equals(JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "profile"))) {
                iOrdinal = VEVideoEncodeProfile.valueOfString(JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "profile")).ordinal();
            } else {
                VEVideoEncodeSettings vEVideoEncodeSettings5 = this.LIZIZ;
                if (vEVideoEncodeSettings5.isSupportHWEncoder) {
                    iOrdinal = vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile;
                } else {
                    iOrdinal = vEVideoEncodeSettings5.encodeProfile;
                }
            }
            vEVideoSWEncodeSettings4.mProfile = iOrdinal;
            VEVideoSWEncodeSettings vEVideoSWEncodeSettings5 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
            if (this.LIZ != 2 || JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "gop") != -1) {
                i3 = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, "sw"), "gop");
            } else {
                VEVideoEncodeSettings vEVideoEncodeSettings6 = this.LIZIZ;
                if (vEVideoEncodeSettings6.isSupportHWEncoder) {
                    i3 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop;
                } else {
                    i3 = vEVideoEncodeSettings6.gopSize;
                }
            }
            vEVideoSWEncodeSettings5.mGop = i3;
            return vEVideoCompileEncodeSettings;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseJsonToSetting : external json str parse error : ");
            sbLIZ.append(e.getLocalizedMessage());
            C2484209oO.LIZJ("VEVideoEncodeSettings", C2188811AlT.LIZIZ(sbLIZ));
            return vEVideoCompileEncodeSettings;
        }
    }

    public final void LJ(int i) {
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
        vEVideoEncodeSettings.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        vEVideoEncodeSettings.bps = i;
    }

    public final void LJFF(VEVideoEncodeSettings.ENCODE_PROFILE encode_profile) {
        this.LIZIZ.encodeProfile = encode_profile.ordinal();
    }

    public final void LJI(VEVideoEncodeSettings.ENCODE_STANDARD encode_standard) {
        this.LIZIZ.encodeStandard = encode_standard.ordinal();
    }

    public final void LJII(int i) {
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
        vEVideoEncodeSettings.fps = i;
        vEVideoEncodeSettings.publishFps = -1;
    }

    public final void LJIIIIZZ(int i) {
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZIZ;
        vEVideoEncodeSettings.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        vEVideoEncodeSettings.swCRF = i;
    }

    public C1780100wQK(VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.LIZJ = new HashMap();
        this.LIZ = 1;
        this.LIZIZ = vEVideoEncodeSettings;
        LIZIZ();
    }

    public final void LJIIIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode, int i) {
        this.LIZIZ.bitrateMode = encode_bitrate_mode;
        int i2 = C1285070jXt.LIZ[encode_bitrate_mode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        this.LIZIZ.bps = i;
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CompileTime BUG. Unhandled enum value ");
                    sbLIZ.append(encode_bitrate_mode.toString());
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZIZ.swQP = i;
                return;
            }
            this.LIZIZ.swCRF = i;
            return;
        }
        this.LIZIZ.bps = i;
    }

    public final void LJIIJ(int i, int i2) {
        VESize vESize = this.LIZIZ.outputSize;
        vESize.width = i;
        vESize.height = i2;
    }
}
