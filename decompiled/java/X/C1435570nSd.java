package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.settings.VideoInvisibleWatermarkSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435570nSd {
    public static final C1435570nSd LIZ = new C1435570nSd();
    public static volatile String LIZIZ = "";

    public static void LIZIZ() {
        if (C2286708xd.LIZJ(LIZIZ)) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1407590mjV(C1435830nT3.LIZ().downloadRetryCnt, null), 3);
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1435830nT3.LIZ().businessId);
        sbLIZ.append(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        sbLIZ.append(C786410Ut5.j4("%06d", Arrays.copyOf(new Object[]{Integer.valueOf(AbstractC19994813Le.Default.nextInt(0, 1000000))}, 1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static VideoInvisibleWatermarkSettings LIZ(VideoPublishEditModel videoPublishEditModel) {
        VideoInvisibleWatermarkSettings videoInvisibleWatermarkSettings = new VideoInvisibleWatermarkSettings();
        String str = LIZIZ;
        String strLIZJ = LIZJ();
        videoPublishEditModel.creativeModel.privacySettingModel.fingerprintId = strLIZJ;
        videoInvisibleWatermarkSettings.watermarkStr = strLIZJ;
        videoInvisibleWatermarkSettings.algorithmName = C1435830nT3.LIZ().algorithmName;
        videoInvisibleWatermarkSettings.watermarkInterval = C306480Bzq.LIZ();
        videoInvisibleWatermarkSettings.algoVersion = C1435830nT3.LIZ().algoVersion;
        videoInvisibleWatermarkSettings.modelPath = str;
        videoInvisibleWatermarkSettings.pFlag = C1435830nT3.LIZ().pFlag;
        videoInvisibleWatermarkSettings.enableDelayInit = C1435830nT3.LIZ().enableDelayInit;
        C1421580n64 c1421580n64 = C1421580n64.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("model path is: ");
        sbLIZ.append(str);
        sbLIZ.append(", watermark str is: ");
        sbLIZ.append(strLIZJ);
        sbLIZ.append(". param set");
        C201955140j.LIZLLL(c1421580n64, "invisible_watermark", C2188811AlT.LIZIZ(sbLIZ));
        return videoInvisibleWatermarkSettings;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel, boolean z) {
        List listLJJLL;
        boolean zContainsAll;
        boolean z2;
        boolean z3;
        Object[] objArr = (Object[]) SettingsManager.LIZLLL().LJIIIIZZ("allowlist_for_aigc_fingerprint", String[].class, null);
        if (objArr == null || (listLJJLL = C13LQ.LJJLL(objArr)) == null) {
            listLJJLL = C13BV.INSTANCE;
        }
        C443120HZe<EnumC1446970nl1, List<String>, List<String>> c443120HZeLIZ = C1446930nkx.LIZ(videoPublishEditModel, new AwS35S0010000_22(z, 38));
        c443120HZeLIZ.getFirst();
        List<String> second = c443120HZeLIZ.getSecond();
        c443120HZeLIZ.getThird();
        Set setLLIIJLIL = C13LP.LLIIJLIL(second, videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setLLIIJLIL) {
            if (true ^ Intrinsics.LJFF(obj, "unknown")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            zContainsAll = false;
        } else {
            zContainsAll = listLJJLL.containsAll(arrayList);
        }
        if (videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLJI = C1436990nUv.LJI(videoPublishEditModel);
        if (!z2 && !zLJI) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean zLIZJ = C2286708xd.LIZJ(LIZIZ);
        if (videoPublishEditModel.getCreationMode() == 1 && C1171720gb4.LIZ() && z3 && zLIZJ && zContainsAll) {
            return true;
        }
        return false;
    }
}
