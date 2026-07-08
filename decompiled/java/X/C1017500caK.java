package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0caK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017500caK {
    public static final /* synthetic */ int LIZ = 0;

    public static C03IT LIZ(User user) {
        UrlModel avatarLarger;
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            avatarLarger = user.getAvatarMedium();
        } else if (user.getAvatarThumb() != null) {
            avatarLarger = user.getAvatarThumb();
        } else {
            if (user.getAvatarLarger() != null) {
                avatarLarger = user.getAvatarLarger();
            }
            return null;
        }
        if (avatarLarger != null) {
            return new C03IT(avatarLarger.getUrlList());
        }
        return null;
    }
}
