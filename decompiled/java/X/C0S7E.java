package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0S7E, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S7E {
    public static final int LIZ(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            return imageList.size();
        }
        return 0;
    }
}
