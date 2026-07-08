package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.subscription.preview.photos.PhotoPreviewViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10Bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19206010Bu extends C2217421BqW implements Function0<Unit> {
    public C19206010Bu(Object obj) {
        super(0, obj, PhotoPreviewViewModel.class, "handleConfirmClick", "handleConfirmClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList2;
        PhotoPreviewViewModel photoPreviewViewModel = (PhotoPreviewViewModel) this.receiver;
        photoPreviewViewModel.vQ2("confirm");
        C1413370msp.LIZ.storeBoolean("IS_PHOTO_PREVIEW_ON", true);
        AbstractC1868100yiG abstractC1868100yiG = ((C1675380thQ) photoPreviewViewModel.LLILLJJLI.getValue()).LIZ;
        int i = 0;
        if (abstractC1868100yiG instanceof C1868080yiE) {
            VideoPublishEditModel videoPublishEditModel = ((C1868080yiE) abstractC1868100yiG).LIZ;
            if (videoPublishEditModel != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList2 = imageAlbumData.getImageList()) != null) {
                for (SingleImageData singleImageData : imageList2) {
                    singleImageData.setSubOnlyPhotoPreviewInfo(new SubOnlyPhotoPreviewInfo(singleImageData.getId() != null && C13LP.LJJJJ(singleImageData.getId(), ((C1675380thQ) photoPreviewViewModel.LLILLJJLI.getValue()).LIZLLL)));
                }
            }
        } else if (abstractC1868100yiG instanceof C1868090yiF) {
            Aweme aweme = ((C1868090yiF) abstractC1868100yiG).LIZ;
            InterfaceC1664410tPj<String> interfaceC1664410tPj = ((C1675380thQ) photoPreviewViewModel.LLILLJJLI.getValue()).LIZLLL;
            ArrayList arrayList = null;
            if (aweme != null && (((photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) || (imageList = C13BV.INSTANCE) != null)) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    PhotoModeImageUrlModel photoModeImageUrlModel2 = photoModeImageUrlModel;
                    arrayList2.add(photoModeImageUrlModel2.copy(photoModeImageUrlModel2.displayImageNoWatermark, photoModeImageUrlModel2.ownerWatermarkImage, photoModeImageUrlModel2.userWatermarkImage, photoModeImageUrlModel2.thumbnail, photoModeImageUrlModel2.bitrateImages, photoModeImageUrlModel2.aspectFillThreshold, photoModeImageUrlModel2.dynamicImage, photoModeImageUrlModel2.translatedDisplayImage, photoModeImageUrlModel2.ocrLanguage, photoModeImageUrlModel2.altText, photoModeImageUrlModel2.livePhotoStruct, new SubscriptionInfo(Boolean.valueOf(interfaceC1664410tPj.contains(PhotoPreviewViewModel.wQ2(i, photoModeImageUrlModel2.thumbnail.getUri()))))));
                    i = i2;
                }
                arrayList = arrayList2;
            }
            C10C1 c10c1 = new C10C1(aweme, arrayList, true);
            C2252321DDq c2252321DDq = photoPreviewViewModel.LL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C1675380thQ.LIZ((C1675380thQ) value, null, null, null, null, null, true, false, 95)));
            photoPreviewViewModel.xQ2(c10c1, interfaceC1664410tPj);
        }
        C19210910Dr.LIZ(C10AX.LIZ);
        return Unit.LIZ;
    }
}
