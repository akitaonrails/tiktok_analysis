package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfoWithCategory;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0iVW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245160iVW {
    public static final boolean LIZ(User user) {
        AvatarMetaInfo avatarMetaInfoLIZIZ;
        Integer num;
        if (user == null || (avatarMetaInfoLIZIZ = LIZIZ(user)) == null || (num = avatarMetaInfoLIZIZ.avatarChoice) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final AvatarMetaInfo LIZIZ(User user) {
        List<AvatarMetaInfoWithCategory> avatarMetaInfoList;
        Integer num;
        if (user == null || (avatarMetaInfoList = user.getAvatarMetaInfoList()) == null) {
            return null;
        }
        for (AvatarMetaInfoWithCategory avatarMetaInfoWithCategory : avatarMetaInfoList) {
            if (avatarMetaInfoWithCategory != null && (num = avatarMetaInfoWithCategory.avatarCategory) != null && num.intValue() == 7) {
                return avatarMetaInfoWithCategory.avatarMetaInfo;
            }
        }
        return null;
    }

    public static final boolean LIZJ(User user) {
        UrlModel urlModel;
        UrlModel urlModel2;
        AvatarSizeUrlStruct dynamicSocialAvatar;
        AvatarSizeUrlStruct socialAvatarWithoutBackground;
        AvatarSizeUrlStruct socialAvatarWithBackground;
        UrlModel urlModel3 = null;
        if (user != null && (socialAvatarWithBackground = user.getSocialAvatarWithBackground()) != null) {
            urlModel = socialAvatarWithBackground.avatarLarger;
        } else {
            urlModel = null;
        }
        if (LJ(urlModel)) {
            if (user != null && (socialAvatarWithoutBackground = user.getSocialAvatarWithoutBackground()) != null) {
                urlModel2 = socialAvatarWithoutBackground.avatarLarger;
            } else {
                urlModel2 = null;
            }
            if (LJ(urlModel2)) {
                if (user != null && (dynamicSocialAvatar = user.getDynamicSocialAvatar()) != null) {
                    urlModel3 = dynamicSocialAvatar.avatarLarger;
                }
                if (LJ(urlModel3)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZLLL(User user) {
        UrlModel urlModel;
        AvatarSizeUrlStruct dynamicSocialAvatar;
        AvatarSizeUrlStruct socialAvatarWithoutBackground;
        UrlModel urlModel2 = null;
        if (user != null && (socialAvatarWithoutBackground = user.getSocialAvatarWithoutBackground()) != null) {
            urlModel = socialAvatarWithoutBackground.avatarLarger;
        } else {
            urlModel = null;
        }
        if (LJ(urlModel)) {
            if (user != null && (dynamicSocialAvatar = user.getDynamicSocialAvatar()) != null) {
                urlModel2 = dynamicSocialAvatar.avatarLarger;
            }
            if (LJ(urlModel2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJ(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUri() == null || urlModel.getUri().length() <= 0) {
            return false;
        }
        return true;
    }
}
