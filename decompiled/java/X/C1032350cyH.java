package X;

import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.ss.android.ugc.aweme.rich.reward.ImageItem;
import com.ss.android.ugc.aweme.rich.reward.ImagePostInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0cyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032350cyH {
    public static final boolean LIZ(GmtRewardAdModel gmtRewardAdModel) {
        ImagePostInfo imagePostInfo;
        List<ImageItem> list;
        Integer num = gmtRewardAdModel.awemeType;
        if (num == null || num.intValue() != 150 || (imagePostInfo = gmtRewardAdModel.imagePostInfo) == null || (list = imagePostInfo.images) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
