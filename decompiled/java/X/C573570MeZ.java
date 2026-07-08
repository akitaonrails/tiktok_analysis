package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0MeZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573570MeZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(338));

    public static boolean LIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (LIZ() && videoPublishEditModel.creativeModel.imageEditModel.isVideoChildPageFromImage) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        if (!LIZ() || !C1428470nHB.LIZIZ(videoPublishEditModel) || videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay()) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && (((imageAlbumData = videoPublishEditModel.getImageAlbumData()) == null || !imageAlbumData.isSinglePhotoUsingImageEditFramework()) && videoPublishEditModel.creativeModel.aigcBusinessModel.aiPortraitModel == null)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (LIZ() && C1444940nhk.LJII(videoPublishEditModel.creativeModel.canvasVideoData) && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
            return true;
        }
        return false;
    }

    public static boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        if (LIZJ(videoPublishEditModel) && !C1428470nHB.LJJJJJL(videoPublishEditModel.creativeModel)) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (!creativeModel.photoModeTemplateData.isTemplateFromAnchor && !creativeModel.imageEffectTemplateData.isTemplateFromAnchor) {
                return true;
            }
            return false;
        }
        return false;
    }
}
