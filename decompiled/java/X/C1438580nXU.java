package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1438580nXU {
    public static final C1438580nXU LIZ = new C1438580nXU();

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.commentSetting = C1439000nYA.LIZIZ(null);
        videoPublishEditModel.reactDuetSetting = C1439000nYA.LIZLLL(videoPublishEditModel, null);
        videoPublishEditModel.stitchSetting = C1439000nYA.LJI(videoPublishEditModel, null);
        videoPublishEditModel.creativeModel.privacySettingModel.allowCreateSticker = C1439000nYA.LJFF(videoPublishEditModel, null);
        videoPublishEditModel.creativeModel.privacySettingModel.allowShareToStory = C1439000nYA.LJ(videoPublishEditModel, null);
        videoPublishEditModel.creativeModel.privacySettingModel.contentReusePermission = C1439000nYA.LIZJ(videoPublishEditModel, null);
        videoPublishEditModel.creativeModel.privacySettingModel.allowAIRemix = C1439000nYA.LIZ(videoPublishEditModel, null);
        videoPublishEditModel.isPrivate = C1416310mxZ.LJJIIZI(videoPublishEditModel);
    }

    public static void LIZ(Bundle bundle, VideoPublishEditModel videoPublishEditModel) {
        bundle.putInt("is_private", videoPublishEditModel.isPrivate);
        bundle.putInt("comment_setting", videoPublishEditModel.commentSetting);
        bundle.putInt("duet_setting", videoPublishEditModel.reactDuetSetting);
        bundle.putInt("stitch_setting", videoPublishEditModel.stitchSetting);
        bundle.putInt("allow_sticker", videoPublishEditModel.creativeModel.privacySettingModel.allowCreateSticker);
        bundle.putInt("share_to_story", videoPublishEditModel.creativeModel.privacySettingModel.allowShareToStory);
        bundle.putInt("content_reuse_permission", videoPublishEditModel.creativeModel.privacySettingModel.contentReusePermission);
        bundle.putInt("allow_ai_remix", videoPublishEditModel.creativeModel.privacySettingModel.allowAIRemix);
    }
}
