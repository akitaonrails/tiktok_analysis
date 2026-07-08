package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431220nLc {
    public static final /* synthetic */ int LIZ = 0;

    public static final SynthetiseResult LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        SynthetiseResult synthetiseResult = new SynthetiseResult();
        synthetiseResult.setSyntheticStartTime(new C1404680meo(0));
        synthetiseResult.draftHardEncode = videoPublishEditModel.getHardEncode();
        if (str == null) {
            str = videoPublishEditModel.getOutputFile();
        }
        synthetiseResult.outputFile = str;
        synthetiseResult.needRecode = C1439880nZa.LJIIIIZZ(videoPublishEditModel);
        synthetiseResult.flags |= 1;
        SettingsManager.LIZLLL().getClass();
        synthetiseResult.isEnableFpsSet = SettingsManager.LIZ("enable_synthetic_fps_set", true);
        synthetiseResult.editPreviewInfo = videoPublishEditModel.getPreviewInfo();
        synthetiseResult.isFastImport = videoPublishEditModel.isFastImport();
        synthetiseResult.isFastImportForLog = C1428470nHB.LJJLIIIJ(videoPublishEditModel);
        synthetiseResult.isTTStory = videoPublishEditModel.isStoryEditMode();
        synthetiseResult.segmentCount = videoPublishEditModel.segmentCounts();
        synthetiseResult.hasSubtitle = videoPublishEditModel.hasSubtitle();
        return synthetiseResult;
    }
}
