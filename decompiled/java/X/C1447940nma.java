package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447940nma {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            return imageList.size();
        }
        return 0;
    }

    public static int LIZIZ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        int i = 0;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && !imageList.isEmpty()) {
            Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
            i = 0;
            while (it2.hasNext()) {
                SubscriptionInfo subscriptionInfo = it2.next().subscriptionInfo;
                if (subscriptionInfo != null && Intrinsics.LJFF(subscriptionInfo.isPreview(), Boolean.TRUE) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static int LIZJ(VideoPublishEditModel videoPublishEditModel) {
        return LIZLLL(videoPublishEditModel).size();
    }

    public static Set LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        if (videoPublishEditModel != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
            ArrayList arrayList = new ArrayList();
            for (SingleImageData singleImageData : imageList) {
                SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo = singleImageData.getSubOnlyPhotoPreviewInfo();
                if (subOnlyPhotoPreviewInfo != null && subOnlyPhotoPreviewInfo.isPreview()) {
                    arrayList.add(singleImageData);
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            if (setLLIIJI != null) {
                return setLLIIJI;
            }
        }
        return C08CX.INSTANCE;
    }
}
