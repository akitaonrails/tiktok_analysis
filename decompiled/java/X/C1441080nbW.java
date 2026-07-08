package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.ReuseEffectTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441080nbW {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        PhotoTemplateAsset photoTemplateAsset = videoPublishEditModel.creativeModel.imageEffectTemplateData.templateAsset;
        if (photoTemplateAsset != null && photoTemplateAsset.getGenerateNewImage() && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() > 1) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                ReuseEffectTemplateInfo reuseEffectTemplateInfo = it2.next().getReuseEffectTemplateInfo();
                if (reuseEffectTemplateInfo != null && reuseEffectTemplateInfo.getNeedReuseImageEffectTemplate()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LIZJ(Context context, VideoPublishEditModel videoPublishEditModel) {
        if (LIZIZ(videoPublishEditModel)) {
            if (context != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131829972);
                C1390380mHk.LIZJ(context, 1079, creativeToastBuilder);
                return true;
            }
            return true;
        }
        return false;
    }
}
