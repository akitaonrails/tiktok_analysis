package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0XPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848270XPl {
    public static SignificantUserInfo LIZ(User user) {
        String str;
        List<String> urlList;
        String uid = user.getUid();
        String shortId = user.getShortId();
        String uniqueId = user.getUniqueId();
        String nickname = user.getNickname();
        if (user.getAvatarThumb() == null || (urlList = user.getAvatarThumb().getUrlList()) == null || urlList.isEmpty()) {
            str = "";
        } else {
            str = (String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0);
        }
        String secUid = user.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        return new SignificantUserInfo(uid, shortId, uniqueId, nickname, str, secUid, "", "", "");
    }
}
