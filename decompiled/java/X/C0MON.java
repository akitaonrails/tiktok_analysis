package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0MON, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MON {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(VideoPublishEditModel videoPublishEditModel, ImageAlbumData imageAlbumData) {
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        ImageAlbumData imageAlbumData2 = imageAlbumData;
        if (videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay() && C566870MLd.LIZ(videoPublishEditModel.creativeModel.onThisDayData)) {
            if ((imageAlbumData2 != null || (imageAlbumData2 = videoPublishEditModel.getImageAlbumData()) != null) && (imageList = imageAlbumData2.getImageList()) != null) {
                for (SingleImageData singleImageData : imageList) {
                    if (singleImageData.getStickerInfoNewEngine() == null) {
                        ImageStickerInfoNewEngine imageStickerInfoNewEngine = new ImageStickerInfoNewEngine(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
                        imageStickerInfoNewEngine.getTextStickerModels().addAll(videoPublishEditModel.creativeModel.stickerModel.textStickerModels);
                        singleImageData.setStickerInfoNewEngine(imageStickerInfoNewEngine);
                    }
                }
            }
            videoPublishEditModel.setImageAlbumData(imageAlbumData2);
            FrameLayout.LayoutParams layoutParamsLJII = C1450870nrJ.LJII();
            C0MOG c0mog = C576250Mit.LLJJIJIIJIL;
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            int i = layoutParamsLJII.width;
            int i2 = layoutParamsLJII.height;
            c0mog.getClass();
            if (creativeModel.onThisDayData.isFromOnThisDay() && creativeModel.onThisDayData.getNeedAdjustStickers() && C566870MLd.LIZ(creativeModel.onThisDayData) && i > 0 && i2 > 0) {
                ImageAlbumData imageAlbumData3 = creativeModel.imageAlbumModel;
                if (imageAlbumData3 != null && (imageList2 = imageAlbumData3.getImageList()) != null) {
                    for (SingleImageData singleImageData2 : imageList2) {
                        ImageStickerInfoNewEngine stickerInfoNewEngine = singleImageData2.getStickerInfoNewEngine();
                        if (stickerInfoNewEngine != null) {
                            SrcImageInfo srcImageInfo = singleImageData2.getSrcImageInfo();
                            if (srcImageInfo.getWidth() > 0 && srcImageInfo.getHeight() > 0) {
                                float width = srcImageInfo.getWidth() / srcImageInfo.getHeight();
                                C0MOG c0mog2 = C576250Mit.LLJJIJIIJIL;
                                int textStyle = creativeModel.onThisDayData.getTextStyle();
                                ArrayList arrayList = new ArrayList(stickerInfoNewEngine.getTextStickerModels());
                                int i3 = (int) (i / width);
                                if (i2 <= i3) {
                                    i3 = i2;
                                }
                                c0mog2.getClass();
                                stickerInfoNewEngine.setTextStickerModels(new CopyOnWriteArrayList<>(C0MOG.LIZ(textStyle, i, arrayList, i2, i, i3)));
                            }
                        }
                    }
                }
                creativeModel.onThisDayData.setNeedAdjustStickers(false);
            }
        }
    }
}
