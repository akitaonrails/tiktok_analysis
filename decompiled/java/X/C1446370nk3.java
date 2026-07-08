package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.wavepublish.utils.mapper.PublishProgressMapperConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0nk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446370nk3 {
    public static PublishProgressMapperConfig LIZ(VideoPublishEditModel videoPublishEditModel) {
        PublishProgressMapperConfig publishProgressMapperConfig;
        List<SingleImageData> imageList;
        LivePhotoPreviewMode livePhotoPreviewMode;
        LivePhotoPreviewMode livePhotoPreviewMode2;
        if (!C1428470nHB.LJJZZI(videoPublishEditModel)) {
            publishProgressMapperConfig = (PublishProgressMapperConfig) C2263511Dif.LIZIZ.getValue();
        } else {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
                for (SingleImageData singleImageData : imageList) {
                    SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
                    if (srcLiveInfo != null) {
                        livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode();
                    } else {
                        livePhotoPreviewMode = null;
                    }
                    if (livePhotoPreviewMode != LivePhotoPreviewMode.LIVE_PHOTO) {
                        SrcLiveVideoInfo srcLiveInfo2 = singleImageData.getSrcLiveInfo();
                        if (srcLiveInfo2 != null) {
                            livePhotoPreviewMode2 = srcLiveInfo2.getLivePhotoPreviewMode();
                        } else {
                            livePhotoPreviewMode2 = null;
                        }
                        if (livePhotoPreviewMode2 == LivePhotoPreviewMode.LOOP) {
                        }
                    }
                    publishProgressMapperConfig = (PublishProgressMapperConfig) C2263501Die.LIZIZ.getValue();
                }
                publishProgressMapperConfig = (PublishProgressMapperConfig) C2263491Did.LIZIZ.getValue();
            } else {
                publishProgressMapperConfig = (PublishProgressMapperConfig) C2263491Did.LIZIZ.getValue();
            }
        }
        if (!publishProgressMapperConfig.getEnabled()) {
            return null;
        }
        return publishProgressMapperConfig;
    }
}
