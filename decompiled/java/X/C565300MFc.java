package X;

import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565300MFc {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int i;
        if (videoPublishEditModel == null) {
            return;
        }
        CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
        if (videoPublishEditModel.isCutSameVideoType() && commonMobParamModel.originalUserSelectedPicCnt != -1 && (i = commonMobParamModel.originalUserSelectedVideoCnt) != -1) {
            c0lab.LIZ(i, "original_video_cnt");
            c0lab.LIZ(commonMobParamModel.originalUserSelectedPicCnt, "original_pic_cnt");
        } else {
            c0lab.LIZ(commonMobParamModel.originVideoCount, "original_video_cnt");
            c0lab.LIZ(commonMobParamModel.originPhotoCount, "original_pic_cnt");
        }
    }
}
