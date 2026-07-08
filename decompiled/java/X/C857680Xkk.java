package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;

/* JADX INFO: renamed from: X.0Xkk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857680Xkk {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null && previewInfo.getPreviewVideoLength() != 0) {
            if (previewInfo.getPreviewVideoLength() >= 61000) {
                return true;
            }
            return false;
        }
        if (videoPublishEditModel.getVideoDurationFromVideoCutPage() >= 61000) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly) {
            if (!C298680BnG.LIZ()) {
                if (C298650BnD.LIZ()) {
                    if (!C1428470nHB.LLIIIJ(videoPublishEditModel) && !C1428470nHB.LLIFFJFJJ(videoPublishEditModel) && videoPublishEditModel.getTtStoryUploadModel() == null) {
                        return true;
                    }
                } else {
                    if (C1428470nHB.LLIIIJ(videoPublishEditModel) || C1428470nHB.LJJZZI(videoPublishEditModel) || C1428470nHB.LJZL(videoPublishEditModel) || C1428470nHB.LLIFFJFJJ(videoPublishEditModel) || videoPublishEditModel.getTtStoryUploadModel() != null) {
                        return false;
                    }
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
