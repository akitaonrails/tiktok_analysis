package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451030nrZ {
    public static final boolean LJI(float f, float f2) {
        return 0.0f <= f && f <= 1.0f && 0.0f <= f2 && f2 <= 1.0f;
    }

    public static final boolean LJ(ImageAlbumData imageAlbumData) {
        List<SingleImageData> imageList = imageAlbumData.getImageList();
        if (!(imageList instanceof Collection) || !imageList.isEmpty()) {
            for (SingleImageData singleImageData : imageList) {
                List<StickerItemModel> stickers = singleImageData.getStickerInfo().getStickers();
                if (!(stickers instanceof Collection) || !stickers.isEmpty()) {
                    for (StickerItemModel stickerItemModel : stickers) {
                        if (stickerItemModel.isNormalInfoSticker() && LJI(stickerItemModel.currentOffsetX, LIZJ(stickerItemModel.currentOffsetY, singleImageData.getImageRatio(), imageAlbumData.getSurfaceData()))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJFF(ImageAlbumData imageAlbumData) {
        List<SingleImageData> imageList = imageAlbumData.getImageList();
        if (!(imageList instanceof Collection) || !imageList.isEmpty()) {
            for (SingleImageData singleImageData : imageList) {
                List<TextStickerData> listLJFF = C0F7U.LJFF(singleImageData, Intrinsics.LJFF(imageAlbumData.getUseTextNewEngineInMultiPhotoMode(), Boolean.TRUE));
                if (!(listLJFF instanceof Collection) || !listLJFF.isEmpty()) {
                    for (TextStickerData textStickerData : listLJFF) {
                        if (LJI(textStickerData.getX() / imageAlbumData.getSurfaceData().getSurfaceViewWidth(), LIZLLL(textStickerData, singleImageData.getImageRatio(), imageAlbumData.getSurfaceData()))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final float LIZ(TextStickerData textStickerData, float f, ImageSurfaceData imageSurfaceData) {
        float surfaceViewRatio = imageSurfaceData.getSurfaceViewRatio();
        C2488709p7 c2488709p7 = C2488709p7.LIZ;
        int surfaceViewWidth = imageSurfaceData.getSurfaceViewWidth();
        c2488709p7.getClass();
        return (textStickerData.getY() * (imageSurfaceData.getSurfaceViewHeight() - (r3 * 2))) + C2488709p7.LJFF(surfaceViewRatio, f, surfaceViewWidth);
    }

    public static final float LIZIZ(float f, float f2, ImageSurfaceData imageSurfaceData) {
        float surfaceViewRatio = imageSurfaceData.getSurfaceViewRatio();
        C2488709p7 c2488709p7 = C2488709p7.LIZ;
        int surfaceViewWidth = imageSurfaceData.getSurfaceViewWidth();
        c2488709p7.getClass();
        return ((f * (imageSurfaceData.getSurfaceViewHeight() - (r2 * 2))) + C2488709p7.LJFF(surfaceViewRatio, f2, surfaceViewWidth)) / imageSurfaceData.getSurfaceViewHeight();
    }

    public static final float LIZJ(float f, float f2, ImageSurfaceData imageSurfaceData) {
        float surfaceViewRatio = imageSurfaceData.getSurfaceViewRatio();
        C2488709p7 c2488709p7 = C2488709p7.LIZ;
        int surfaceViewWidth = imageSurfaceData.getSurfaceViewWidth();
        c2488709p7.getClass();
        return ((f * imageSurfaceData.getSurfaceViewHeight()) - C2488709p7.LJFF(surfaceViewRatio, f2, surfaceViewWidth)) / (imageSurfaceData.getSurfaceViewHeight() - (r2 * 2));
    }

    public static final float LIZLLL(TextStickerData textStickerData, float f, ImageSurfaceData imageSurfaceData) {
        float surfaceViewRatio = imageSurfaceData.getSurfaceViewRatio();
        C2488709p7 c2488709p7 = C2488709p7.LIZ;
        int surfaceViewWidth = imageSurfaceData.getSurfaceViewWidth();
        c2488709p7.getClass();
        return (textStickerData.getY() - C2488709p7.LJFF(surfaceViewRatio, f, surfaceViewWidth)) / (imageSurfaceData.getSurfaceViewHeight() - (r3 * 2));
    }
}
