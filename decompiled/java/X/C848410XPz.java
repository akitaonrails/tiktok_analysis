package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0XPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848410XPz {
    public static UrlModel LIZ(User user) {
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            return user.getAvatarMedium();
        }
        if (user.getAvatarThumb() != null) {
            return user.getAvatarThumb();
        }
        if (user.getAvatarLarger() == null) {
            return null;
        }
        return user.getAvatarLarger();
    }
}
