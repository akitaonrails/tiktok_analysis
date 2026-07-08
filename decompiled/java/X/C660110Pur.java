package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0Pur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660110Pur {
    public static final C660110Pur LIZ = new C660110Pur();

    public static String LIZ(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        String string;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || (string = Integer.valueOf(imageList.size()).toString()) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return string;
    }
}
