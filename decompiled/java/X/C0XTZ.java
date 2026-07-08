package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0XTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XTZ {
    public static CommonUserInfo LIZ() {
        return new CommonUserInfo("", "", "", null, null, null);
    }

    public static CommonUserInfo LIZIZ(User user, CommonUserInfo commonUserInfo) {
        String uniqueId;
        String str;
        Integer num;
        String str2 = "";
        if (TextUtils.isEmpty(user.getUniqueId())) {
            uniqueId = user.getShortId();
            if (uniqueId == null) {
                uniqueId = "";
            }
        } else {
            uniqueId = user.getUniqueId();
        }
        if (user.getAvatarThumb() == null || user.getAvatarThumb().getUrlList() == null || user.getAvatarThumb().getUrlList().isEmpty()) {
            str = "";
        } else {
            str = (String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0);
        }
        String str3 = null;
        if (commonUserInfo != null && commonUserInfo.avatarExpires != null) {
            str = commonUserInfo.avatarUrl;
        }
        String secUid = user.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        String nickname = user.getNickname();
        if (nickname != null) {
            str2 = nickname;
        }
        if (commonUserInfo != null) {
            str3 = commonUserInfo.avatarUri;
            num = commonUserInfo.avatarExpires;
        } else {
            num = null;
        }
        return new CommonUserInfo(uniqueId, str, secUid, str2, str3, num);
    }
}
