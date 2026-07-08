package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;

/* JADX INFO: renamed from: X.0mF0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388680mF0 {
    public static String LIZ(IMUser iMUser) {
        List<String> urlList;
        String uri;
        UrlModel avatarThumb = iMUser.getAvatarThumb();
        if (avatarThumb == null || (uri = avatarThumb.getUri()) == null) {
            UrlModel avatarThumb2 = iMUser.getAvatarThumb();
            if (avatarThumb2 != null && (urlList = avatarThumb2.getUrlList()) != null) {
                return (String) C13LP.LJJJLL(urlList);
            }
            return null;
        }
        return uri;
    }
}
