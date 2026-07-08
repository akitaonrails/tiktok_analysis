package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0lMT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354870lMT {
    public static final /* synthetic */ int LIZ = 0;

    public static C03IT LIZ(User user) {
        UrlModel avatarThumb;
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            avatarThumb = user.getAvatarMedium();
        } else if (user.getAvatarLarger() != null) {
            avatarThumb = user.getAvatarLarger();
        } else {
            if (user.getAvatarThumb() != null) {
                avatarThumb = user.getAvatarThumb();
            }
            return null;
        }
        if (avatarThumb != null) {
            return new C03IT(avatarThumb.getUrlList());
        }
        return null;
    }
}
