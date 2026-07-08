package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0Mtk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C582980Mtk {
    public static final boolean LIZ(Aweme aweme) {
        Integer numValueOf;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            numValueOf = Integer.valueOf(imageList.size());
        } else {
            numValueOf = null;
        }
        if (aweme.getAwemeType() != 150 || numValueOf == null || numValueOf.intValue() <= 1) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme.getAwemeType() == 150 && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (!imageList.isEmpty()) && !C0B1V.LIZ()) {
            return true;
        }
        return false;
    }
}
