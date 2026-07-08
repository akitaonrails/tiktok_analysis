package X;

import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfoWithCategory;
import com.ss.android.ugc.profile.platform.base.data.Avatar;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ibx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249150ibx {
    public static final AvatarMetaInfo LIZ(ProfileUser profileUser) {
        UserProfileInfo userProfileInfo;
        Avatar avatar;
        List<AvatarMetaInfoWithCategory> avatarMetaInfoList;
        AvatarMetaInfoWithCategory next;
        Integer num;
        ProfileCommonInfo profileCommonInfo = profileUser.common;
        if (profileCommonInfo == null || (userProfileInfo = profileCommonInfo.getUserProfileInfo()) == null || (avatar = userProfileInfo.getAvatar()) == null || (avatarMetaInfoList = avatar.getAvatarMetaInfoList()) == null) {
            return null;
        }
        Iterator<AvatarMetaInfoWithCategory> it2 = avatarMetaInfoList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AvatarMetaInfoWithCategory avatarMetaInfoWithCategory = next;
                if (avatarMetaInfoWithCategory != null && (num = avatarMetaInfoWithCategory.avatarCategory) != null && num.intValue() == 7) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AvatarMetaInfoWithCategory avatarMetaInfoWithCategory2 = next;
        if (avatarMetaInfoWithCategory2 == null) {
            return null;
        }
        return avatarMetaInfoWithCategory2.avatarMetaInfo;
    }
}
