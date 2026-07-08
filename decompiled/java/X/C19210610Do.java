package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.10Do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19210610Do {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly && C1413370msp.LIZ.getBoolean("IS_PHOTO_PREVIEW_ON", true)) {
            return true;
        }
        return false;
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            int i = 0;
            for (SingleImageData singleImageData : imageList) {
                int i2 = i + 1;
                if (i >= 0) {
                    SingleImageData singleImageData2 = singleImageData;
                    if (i == 0) {
                        singleImageData2.setSubOnlyPhotoPreviewInfo(new SubOnlyPhotoPreviewInfo(true));
                    } else {
                        singleImageData2.setSubOnlyPhotoPreviewInfo(null);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C19210910Dr.LIZIZ(C19210710Dp.LIZ);
        C19210910Dr.LIZ(C10AX.LIZ);
    }

    public static boolean LIZIZ(int i, SingleImageData singleImageData, Set set) {
        int i2 = i - 1;
        int size = C15442062u.LJI(singleImageData, set).size();
        if (i2 >= 2 && size <= i2 - 1) {
            return true;
        }
        return false;
    }
}
