package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.mediacodec.TEAvcEncoder;
import com.ss.android.ugc.aweme.creative.compileconfig.ab.SmartSynthesisUploadSettings;
import com.ss.android.ugc.aweme.creative.model.publish.SmartCodecMobDataModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.ugc.gamora.editor.smartsynthesis.SmartSynthesisModelPath;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0na7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440210na7 {
    public static final /* synthetic */ int LIZ = 0;

    public static SmartSynthesisUploadSettings LIZJ() {
        return (SmartSynthesisUploadSettings) C1440250naB.LIZIZ.getValue();
    }

    public static String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        SmartCodecMobDataModel smartCodecMobDataModel;
        String str;
        if (videoPublishEditModel == null || (smartCodecMobDataModel = videoPublishEditModel.creativeModel.commonMobModel.smartCodecMobDataModel) == null || (str = smartCodecMobDataModel.notUseSmartCodecReason) == null) {
            return "unknown";
        }
        return str;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        SmartCodecMobDataModel smartCodecMobDataModel;
        if (videoPublishEditModel != null && (smartCodecMobDataModel = videoPublishEditModel.creativeModel.commonMobModel.smartCodecMobDataModel) != null) {
            return smartCodecMobDataModel.isUseSmartCodec;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings vEVideoEncodeSettings) {
        Pair pair;
        double d;
        String str;
        String str2;
        videoPublishEditModel.creativeModel.commonMobModel.smartCodecMobDataModel.isUseSmartCodec = false;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_smart_synthesis", true, false)) {
            SmartCodecMobDataModel smartCodecMobDataModel = videoPublishEditModel.creativeModel.commonMobModel.smartCodecMobDataModel;
            smartCodecMobDataModel.isUseSmartCodec = false;
            smartCodecMobDataModel.notUseSmartCodecReason = "not_hit_experiment";
            C1440220na8.LIZIZ("SmartSynthesisSetting -> disable smart Synthesis");
            return;
        }
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
        if (uploadSpeedInfo == null) {
            uploadSpeedInfo = new UploadSpeedInfo(-6L, "", -6L, -6L, -1);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("test speed: curSpeed=");
        sbLIZ.append(uploadSpeedInfo.getSpeed());
        C1440220na8.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("speed settings: max=(");
        sbLIZ2.append(LIZJ().maxSpeed);
        sbLIZ2.append(", min=");
        sbLIZ2.append(LIZJ().minSpeed);
        C1440220na8.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (LIZJ().maxSpeed > 0 && LIZJ().minSpeed > 0) {
            if (uploadSpeedInfo.getSpeed() <= 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("get speed info error: ");
                sbLIZ3.append(uploadSpeedInfo.getSpeed());
                C1440220na8.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                pair = new Pair(0, "speed_not_found");
            } else if (uploadSpeedInfo.getSpeed() >= LIZJ().maxSpeed) {
                C1440220na8.LIZIZ("not use smart codec, >= max");
                pair = new Pair(0, "not_meet_speed");
            } else if (uploadSpeedInfo.getSpeed() <= LIZJ().minSpeed) {
                C1440220na8.LIZIZ("use smart codec but delta vmaf");
                pair = new Pair(2, "");
            } else {
                C1440220na8.LIZIZ("use smart codec");
                pair = new Pair(1, "");
            }
        } else {
            C1440220na8.LIZIZ("speed settings invalid");
            pair = new Pair(0, "speed_setting_invalid");
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        String str3 = (String) pair.getSecond();
        if (iIntValue == 0) {
            videoPublishEditModel.creativeModel.commonMobModel.smartCodecMobDataModel.notUseSmartCodecReason = str3;
            return;
        }
        if (iIntValue == 2) {
            d = LIZJ().deltaVmaf;
        } else {
            d = 0.0d;
        }
        if (vEVideoEncodeSettings.getEncodeStandard() == VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal() || (((Boolean) C0A7M.LIZ.getValue()).booleanValue() && vEVideoEncodeSettings.getEncodeStandard() == VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal())) {
            C1440220na8 c1440220na8 = C1440220na8.LIZ;
            VESize videoRes = vEVideoEncodeSettings.getVideoRes();
            c1440220na8.getClass();
            int iMin = Math.min(videoRes.width, videoRes.height);
            int iMax = Math.max(videoRes.width, videoRes.height);
            Iterator<Integer> it2 = C1440220na8.LIZJ.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int iIntValue2 = it2.next().intValue();
                C1440220na8.LIZ.getClass();
                if (iMin > 0) {
                    int iIntValue3 = ((Number) C0A7N.LIZ.getValue()).intValue();
                    int i2 = iIntValue2 - iIntValue3;
                    if (iMin <= iIntValue2 + iIntValue3 && i2 <= iMin) {
                        if (i >= 0) {
                            int iIntValue4 = ((Number) ListProtector.get(C1440220na8.LIZLLL, i)).intValue();
                            if (iMax > 0) {
                                int iIntValue5 = ((Number) C0A7N.LIZ.getValue()).intValue();
                                int i3 = iIntValue4 - iIntValue5;
                                if (iMax > iIntValue4 + iIntValue5 || i3 > iMax) {
                                    break;
                                }
                                if (!C1440220na8.LIZ()) {
                                    C1440220na8.LIZIZ("SmartSynthesisModelFetcher -> getPathList smart compile model is invalid return");
                                } else {
                                    C01GW c01gw = C1440220na8.LIZIZ;
                                    SmartSynthesisModelPath smartSynthesisModelPath = (SmartSynthesisModelPath) c01gw.getValue();
                                    if (smartSynthesisModelPath == null || (str = smartSynthesisModelPath.smartcodec) == null) {
                                        str = "";
                                    }
                                    List<Integer> list = C1440220na8.LIZJ;
                                    String strLIZJ = C1440220na8.LIZJ(((Number) ListProtector.get(list, i)).intValue(), str);
                                    SmartSynthesisModelPath smartSynthesisModelPath2 = (SmartSynthesisModelPath) c01gw.getValue();
                                    if (smartSynthesisModelPath2 == null || (str2 = smartSynthesisModelPath2.statics) == null) {
                                        str2 = "";
                                    }
                                    String strLIZJ2 = C1440220na8.LIZJ(((Number) ListProtector.get(list, i)).intValue(), str2);
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("isValid: videoSmartPath:");
                                    LinkedHashMap linkedHashMap = (LinkedHashMap) C1440220na8.LJ;
                                    sbLIZ4.append((String) linkedHashMap.get(strLIZJ));
                                    sbLIZ4.append(" \nvideoStaticPath: ");
                                    sbLIZ4.append((String) linkedHashMap.get(strLIZJ2));
                                    C1440220na8.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                                    List listLJIJI = C13LQ.LJIJI(new String[]{linkedHashMap.get(strLIZJ), linkedHashMap.get(strLIZJ2)});
                                    if (((ArrayList) listLJIJI).size() == 2 && listLJIJI != null && !listLJIJI.isEmpty()) {
                                        SmartCodecMobDataModel smartCodecMobDataModel2 = videoPublishEditModel.creativeModel.commonMobModel.smartCodecMobDataModel;
                                        smartCodecMobDataModel2.isUseSmartCodec = true;
                                        smartCodecMobDataModel2.notUseSmartCodecReason = "";
                                        TEAvcEncoder.setSmartCodecPath(listLJIJI, (float) d);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                i++;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("resolution (");
            sbLIZ5.append(videoRes.width);
            sbLIZ5.append('x');
            sbLIZ5.append(videoRes.height);
            sbLIZ5.append(") do not support smartSetting, deviation=");
            sbLIZ5.append(((Number) C0A7N.LIZ.getValue()).intValue());
            C1440220na8.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5));
            videoPublishEditModel.creativeModel.commonMobModel.smartCodecMobDataModel.notUseSmartCodecReason = "no_model_not_found";
            TEAvcEncoder.setSmartCodecPath(null);
            C1440220na8.LIZIZ("do not support smartSetting");
            return;
        }
        videoPublishEditModel.creativeModel.commonMobModel.smartCodecMobDataModel.notUseSmartCodecReason = "encode_not_h264";
        TEAvcEncoder.setSmartCodecPath(null);
        C1440220na8.LIZIZ("do not support smartSetting");
    }
}
