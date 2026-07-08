package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0XUS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XUS {
    public static TPUserInfo LIZ(User user) {
        String str;
        String strLIZ = C0X3A.LIZ(user);
        if (user.getAvatarThumb() != null && user.getAvatarThumb().getUrlList() != null && !user.getAvatarThumb().getUrlList().isEmpty()) {
            str = (String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0);
        } else {
            str = "";
        }
        return new TPUserInfo(strLIZ, str);
    }
}
