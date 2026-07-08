package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.profile.business.ur.utils.SocialAvatarUserInfoCache;

/* JADX INFO: renamed from: X.0HYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442910HYj {
    public static final MutableLiveData<SocialAvatarUserInfoCache> LIZ;
    public static boolean LIZIZ;
    public static final MutableLiveData LIZJ;

    static {
        MutableLiveData<SocialAvatarUserInfoCache> mutableLiveData = new MutableLiveData<>();
        LIZ = mutableLiveData;
        LIZJ = mutableLiveData;
    }

    public static Integer LIZ() {
        AvatarMetaInfo avatarMetaInfo;
        SocialAvatarUserInfoCache value = LIZ.getValue();
        if (value == null || (avatarMetaInfo = value.socialAvatarMetaInfo) == null) {
            return null;
        }
        return avatarMetaInfo.avatarChoice;
    }

    public static AvatarSizeUrlStruct LIZIZ() {
        SocialAvatarUserInfoCache value = LIZ.getValue();
        if (value != null) {
            return value.avatarWithBackground;
        }
        return null;
    }

    public static boolean LIZJ() {
        AvatarSizeUrlStruct avatarSizeUrlStructLIZIZ;
        SocialAvatarUserInfoCache value;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checking cache info - avatar info: ");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(", avatar choice: ");
        sbLIZ.append(LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        C442860HYe.LIZ.getClass();
        return (!C442860HYe.LIZ() || LIZ() == null || (avatarSizeUrlStructLIZIZ = LIZIZ()) == null || avatarSizeUrlStructLIZIZ.avatarMedium == null || (value = LIZ.getValue()) == null || value.staticAvatar == null) ? false : true;
    }

    public static void LIZLLL(int i) {
        AvatarMetaInfo avatarMetaInfoCopy;
        AvatarMetaInfo avatarMetaInfo;
        MutableLiveData<SocialAvatarUserInfoCache> mutableLiveData = LIZ;
        SocialAvatarUserInfoCache value = mutableLiveData.getValue();
        SocialAvatarUserInfoCache socialAvatarUserInfoCache = null;
        if (value != null && (avatarMetaInfo = value.socialAvatarMetaInfo) != null) {
            avatarMetaInfoCopy = avatarMetaInfo.copy(avatarMetaInfo.avatarSource, Integer.valueOf(i), avatarMetaInfo.socialAvatarBackgroundTag, avatarMetaInfo.socialAvatarExpressionTag, avatarMetaInfo.socialAvatarID);
        } else {
            avatarMetaInfoCopy = null;
        }
        SocialAvatarUserInfoCache value2 = mutableLiveData.getValue();
        if (value2 != null) {
            socialAvatarUserInfoCache = new SocialAvatarUserInfoCache(value2.avatarWithBackground, value2.avatarWithoutBackground, value2.dynamicAvatar, avatarMetaInfoCopy, value2.staticAvatar);
        }
        mutableLiveData.setValue(socialAvatarUserInfoCache);
    }
}
