package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.subscription.preview.photos.PhotoPreviewViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10Bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19206110Bv extends C2217421BqW implements Function0<Unit> {
    public C19206110Bv(Object obj) {
        super(0, obj, PhotoPreviewViewModel.class, "handleTurnOffClick", "handleTurnOffClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        PhotoPreviewViewModel photoPreviewViewModel = (PhotoPreviewViewModel) this.receiver;
        photoPreviewViewModel.vQ2("turn_off");
        C1413370msp.LIZ.storeBoolean("IS_PHOTO_PREVIEW_ON", false);
        AbstractC1868100yiG abstractC1868100yiG = ((C1675380thQ) photoPreviewViewModel.LLILLJJLI.getValue()).LIZ;
        if (abstractC1868100yiG instanceof C1868080yiE) {
            VideoPublishEditModel videoPublishEditModel = ((C1868080yiE) abstractC1868100yiG).LIZ;
            if (videoPublishEditModel != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
                Iterator<SingleImageData> it2 = imageList.iterator();
                while (it2.hasNext()) {
                    it2.next().setSubOnlyPhotoPreviewInfo(new SubOnlyPhotoPreviewInfo(false));
                }
            }
            C19210910Dr.LIZ(C10AS.LIZ);
        } else if (abstractC1868100yiG instanceof C1868090yiF) {
            C10C1 c10c1 = new C10C1(((C1868090yiF) abstractC1868100yiG).LIZ, null, false);
            C2252321DDq c2252321DDq = photoPreviewViewModel.LL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C1675380thQ.LIZ((C1675380thQ) value, null, null, null, null, null, false, true, 63)));
            photoPreviewViewModel.xQ2(c10c1, C19970913Bz.LLILZIL);
        }
        return Unit.LIZ;
    }
}
