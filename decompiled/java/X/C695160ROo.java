package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ROo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695160ROo {
    public static final Pair<String, String> LIZ(User user) {
        String str;
        List<String> urlList;
        if (user == null) {
            return null;
        }
        UrlModel avatarMedium = user.getAvatarMedium();
        if (avatarMedium != null && (urlList = avatarMedium.getUrlList()) != null) {
            str = (String) C13LP.LJJJLZIJ(0, urlList);
        } else {
            str = null;
        }
        String uid = user.getUid();
        if (uid == null || a0.LJJJIL(uid) || str == null || a0.LJJJIL(str)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uid=");
        sbLIZ.append(uid);
        sbLIZ.append(", nickname=");
        sbLIZ.append(user.getNickname());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            return null;
        }
        return new Pair<>(str, strLIZIZ);
    }
}
