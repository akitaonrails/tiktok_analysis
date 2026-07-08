package X;

import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0ipp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257750ipp {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(User user) {
        if (user.isAccuratePrivateAccount() || LIZIZ(user)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(User user) {
        GeneralPermission generalPermission;
        if (user != null) {
            if (user.isUserCancelled() || (((generalPermission = user.getGeneralPermission()) != null && generalPermission.getFollowToastType() == 1) || user.isBlock || user.isGeoBlocked() || user.isBlocked())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
