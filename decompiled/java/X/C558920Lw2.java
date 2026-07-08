package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitCreationModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Lw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558920Lw2 {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.setVideoCoverPath("");
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.coverImagePath = "";
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        creativeModel.publishPreviewModel.firstFramePath = "";
        creativeModel.postPageModel.customCoverPath = "";
        videoPublishEditModel.setPreviewInfo(null);
        videoPublishEditModel.setMultiEditVideoRecordData(null);
        AIPortraitModel aIPortraitModel = videoPublishEditModel.creativeModel.aigcBusinessModel.aiPortraitModel;
        if (aIPortraitModel != null) {
            AIPortraitCreationModel aIPortraitCreationModel = aIPortraitModel.creationModel;
            if (aIPortraitCreationModel != null) {
                aIPortraitCreationModel.forceSaveDraft = true;
            }
            AIPortraitContextModel aIPortraitContextModel = aIPortraitModel.contextModel;
            if (aIPortraitContextModel != null) {
                aIPortraitContextModel.aigcEntranceInfo = AIGCEntranceInfo.LIZ(aIPortraitContextModel.aigcEntranceInfo, null, null, 0, null, null, false, false, false, null, AIGC.RefPageName.Profile.INSTANCE, null, null, null, null, false, false, 1047551);
            }
        }
    }
}
