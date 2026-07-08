package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411680mq6 {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                if (it2.next().getCollageInfo() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        int currentPreviewIndex;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        boolean z = false;
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return null;
        }
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData2 != null) {
            currentPreviewIndex = imageAlbumData2.getCurrentPreviewIndex();
        } else {
            currentPreviewIndex = 0;
        }
        SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(currentPreviewIndex, imageList);
        if (singleImageData == null) {
            return null;
        }
        if (singleImageData.getCollageInfo() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
