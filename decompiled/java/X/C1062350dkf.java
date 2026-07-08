package X;

import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062350dkf {
    public static Long LIZ(User user) {
        AvatarDecoration avatarDecorationLIZIZ;
        if (user != null && (avatarDecorationLIZIZ = LIZIZ(user)) != null) {
            return Long.valueOf(avatarDecorationLIZIZ.getId());
        }
        return null;
    }

    public static AvatarDecoration LIZIZ(User user) {
        C0XQ7.LJ();
        User curUser = C0XQ7.LIZ.LJIIJ().getCurUser();
        if (Intrinsics.LJFF(user.getUid(), curUser.getUid())) {
            user = curUser;
        }
        return user.getAvatarDecoration();
    }
}
