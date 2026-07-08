package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0PpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656630PpF {
    public static final void LIZ(Aweme aweme, C654720PmA c654720PmA) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null) {
            int width = urlModel.getWidth();
            String str = CardStruct.IStatusCode.DEFAULT;
            if (width == 0) {
                c654720PmA.LJ("is_first_photo_standard_size", CardStruct.IStatusCode.DEFAULT);
            } else {
                if (urlModel.getHeight() / urlModel.getWidth() >= 1.3333334f) {
                    c654720PmA.LJ("is_first_photo_standard_size", "1");
                    return;
                }
                if (Math.abs((urlModel.getHeight() / urlModel.getWidth()) - (1 / C1913107eT.LJII())) < 0.01d) {
                    str = "1";
                }
                c654720PmA.LJ("is_first_photo_standard_size", str);
            }
        }
    }
}
