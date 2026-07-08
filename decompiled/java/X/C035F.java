package X;

import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfoWithCategory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.035F, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035F {
    public static final AvatarMetaInfo LIZ(User user) {
        Integer num;
        List<AvatarMetaInfoWithCategory> avatarMetaInfoList = user.getAvatarMetaInfoList();
        if (avatarMetaInfoList != null) {
            for (AvatarMetaInfoWithCategory avatarMetaInfoWithCategory : avatarMetaInfoList) {
                if (avatarMetaInfoWithCategory != null && (num = avatarMetaInfoWithCategory.avatarCategory) != null && num.intValue() == 7) {
                    return avatarMetaInfoWithCategory.avatarMetaInfo;
                }
            }
            return null;
        }
        return null;
    }
}
