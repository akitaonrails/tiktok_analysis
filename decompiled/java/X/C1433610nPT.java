package X;

import Y.ACallableS61S1100000_8;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0nPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433610nPT {
    public static final PublishModel LIZ(Bundle bundle) {
        NowsShootModel nowsShootModel;
        EnumC1405170mfb enumC1405170mfb;
        Integer numIsBatchSub;
        StoryShootModel storyShootModel;
        String string = bundle.getString("shoot_way", "");
        boolean z = bundle.getBoolean("publish_retry", false);
        int i = bundle.getInt("publish_permission", -1);
        boolean z2 = bundle.getBoolean("isEditSave", false);
        boolean z3 = bundle.getBoolean("isEditPrePublish", false);
        if (bundle.containsKey("extra_video_publish_args")) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) bundle.getSerializable("extra_video_publish_args");
            int i2 = bundle.getInt("video_type", 0);
            int i3 = bundle.getInt("pre_publish_type", 0);
            if (!videoPublishEditModel.getCreativeInfo().isValid()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VideoPublishEditModel NullCreationId shootWay:");
                sbLIZ.append(videoPublishEditModel.mShootWay);
                C1433730nPf.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ));
                videoPublishEditModel.setCreativeInfo(new CreativeInfo(null, 0, null, 7, null));
            }
            String creationId = videoPublishEditModel.getCreationId();
            if (bundle.getBoolean("com.ss.android.ugc.aweme.intent.extra.EXTRA_NOW_PUBLISH", false)) {
                nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
            } else {
                nowsShootModel = null;
            }
            if (z) {
                enumC1405170mfb = EnumC1405170mfb.RETRY_BY_USER;
            } else {
                enumC1405170mfb = EnumC1405170mfb.NOT_RETRY;
            }
            PublishModel publishModel = new PublishModel(string, creationId, i3, enumC1405170mfb, i2, i, LIZIZ(videoPublishEditModel), videoPublishEditModel, nowsShootModel, bundle.getBoolean("publish_story_mode", false), C1428470nHB.LJJIIJZLJL(videoPublishEditModel), bundle.getBoolean("fromTTEPEffectPreview", false), z2, z3, false, false, bundle.getString("extra_expect_publish_task_id", null), bundle.getBoolean("extra_disable_progress_view", false), (StoryGroupPublishModel) bundle.getParcelable("extra_story_group_model"), null, false);
            if (C290670BaL.LIZ()) {
                CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                if (creativeModel != null && (storyShootModel = creativeModel.storyModel) != null) {
                    numIsBatchSub = storyShootModel.isBatchSub();
                } else {
                    numIsBatchSub = null;
                }
                publishModel.isBatchSub = numIsBatchSub;
            }
            publishModel.LIZLLL = (PublishFailureReason) bundle.getParcelable("retry_reason");
            return publishModel;
        }
        throw new AssertionError("publish service not supported this publish");
    }

    public static final List LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        int imageCurrentIndex;
        SrcImageInfo srcImageInfo;
        String path;
        String strLJII;
        String str = "";
        List listSingletonList = Collections.singletonList("");
        if (videoPublishEditModel instanceof VideoPublishEditModel) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            if (c0mh8.LJ(videoPublishEditModel, -1) && (strLJII = c0mh8.LJII(videoPublishEditModel, -1)) != null) {
                return Collections.singletonList(strLJII);
            }
            if ((!videoPublishEditModel.isMvThemeVideoType() || C1428470nHB.LJJZZI(videoPublishEditModel)) && !videoPublishEditModel.isMultiVideoEdit()) {
                String validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath();
                if (validVideoCoverPath != null) {
                    return Collections.singletonList(validVideoCoverPath);
                }
                if (!C1428470nHB.LJJZZI(videoPublishEditModel)) {
                    return listSingletonList;
                }
                ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                    CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
                    if (coverPublishModel != null) {
                        imageCurrentIndex = coverPublishModel.getImageCurrentIndex();
                    } else {
                        imageCurrentIndex = 0;
                    }
                    SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(imageCurrentIndex, imageList);
                    if (singleImageData != null && (srcImageInfo = singleImageData.getSrcImageInfo()) != null && (path = srcImageInfo.getPath()) != null) {
                        str = path;
                    }
                }
                if (!C2286708xd.LIZJ(str)) {
                    return listSingletonList;
                }
                return Collections.singletonList(str);
            }
            String strLJJLIIIJILLIZJL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIJILLIZJL(videoPublishEditModel.getCreativeInfo());
            List listSingletonList2 = Collections.singletonList(strLJJLIIIJILLIZJL);
            C15O7.LIZJ(new ACallableS61S1100000_8(videoPublishEditModel, strLJJLIIIJILLIZJL, 4));
            return listSingletonList2;
        }
        return listSingletonList;
    }
}
