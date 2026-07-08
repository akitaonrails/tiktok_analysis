package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;

/* JADX INFO: renamed from: X.0LBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538990LBx {
    public static final C2344009Gk LIZ(C2344009Gk c2344009Gk, VideoPublishEditModel videoPublishEditModel) {
        long previewVideoLength;
        if (videoPublishEditModel == null) {
            return c2344009Gk;
        }
        c2344009Gk.LJFF("creation_id", videoPublishEditModel.getCreationId());
        c2344009Gk.LJFF("shoot_way", videoPublishEditModel.mShootWay);
        c2344009Gk.LJFF("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c2344009Gk.LJFF("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null) {
            previewVideoLength = previewInfo.getPreviewVideoLength();
        } else {
            previewVideoLength = 0;
        }
        c2344009Gk.LIZLLL(previewVideoLength, "creation_duration");
        return c2344009Gk;
    }
}
