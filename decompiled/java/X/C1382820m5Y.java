package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0m5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382820m5Y {
    public static final /* synthetic */ int LIZ = 0;

    public static UrlModel LIZ(ImageModel imageModel) {
        String str;
        int i;
        UrlModel urlModel = new UrlModel();
        List<String> urls = null;
        if (imageModel != null) {
            str = imageModel.mUri;
        } else {
            str = null;
        }
        urlModel.setUri(str);
        int i2 = 0;
        if (imageModel != null) {
            i = imageModel.height;
        } else {
            i = 0;
        }
        urlModel.setHeight(i);
        if (imageModel != null) {
            i2 = imageModel.width;
        }
        urlModel.setWidth(i2);
        if (imageModel != null) {
            urls = imageModel.getUrls();
        }
        urlModel.setUrlList(urls);
        return urlModel;
    }

    public static void LIZIZ(Room room, User user) {
        FollowInfo followInfo;
        Long lValueOf;
        com.bytedance.android.live.base.model.user.User owner = room.getOwner();
        if (owner != null && (followInfo = owner.getFollowInfo()) != null && (lValueOf = Long.valueOf(followInfo.getFollowStatus())) != null) {
            if (lValueOf.longValue() != 0 && lValueOf.longValue() != 1 && lValueOf.longValue() != 2) {
                if (lValueOf.longValue() == 3) {
                    user.setFollowerStatus(1);
                    return;
                }
                return;
            }
            user.setFollowStatus((int) lValueOf.longValue());
        }
    }
}
