package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0HXG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXG {
    public static final int LIZ(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            return imageList.size();
        }
        return 0;
    }
}
