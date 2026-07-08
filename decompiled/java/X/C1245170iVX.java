package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfoWithCategory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0iVX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245170iVX {
    public static final AvatarMetaInfo LIZ(User user) {
        List<AvatarMetaInfoWithCategory> avatarMetaInfoList;
        Integer num;
        if (user == null || (avatarMetaInfoList = user.getAvatarMetaInfoList()) == null) {
            return null;
        }
        for (AvatarMetaInfoWithCategory avatarMetaInfoWithCategory : avatarMetaInfoList) {
            if (avatarMetaInfoWithCategory != null && (num = avatarMetaInfoWithCategory.avatarCategory) != null && num.intValue() == 1) {
                return avatarMetaInfoWithCategory.avatarMetaInfo;
            }
        }
        return null;
    }

    public static final boolean LIZIZ(User user, UrlModel urlModel) {
        List<String> urlList;
        AvatarMetaInfo avatarMetaInfoLIZ;
        if (urlModel != null) {
            urlList = urlModel.getUrlList();
        } else {
            urlList = null;
        }
        if (urlList == null || urlList.isEmpty() || !C1067920dte.LIZ() || user == null || (avatarMetaInfoLIZ = LIZ(user)) == null) {
            return false;
        }
        Integer num = avatarMetaInfoLIZ.avatarSource;
        int value = EnumC992830bwX.AIGC_PROFILE.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }
}
