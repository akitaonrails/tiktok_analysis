package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Suf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736430Suf {
    public static EnumC736410Sud LIZ(User user) {
        boolean z;
        if (user != null) {
            if (user.getFollowerStatus() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (user == null || (user.getFollowStatus() != 0 && user.getFollowStatus() != 4)) {
                    return EnumC736410Sud.MUTUAL;
                }
            } else if (user != null) {
            }
            if (user.getFollowerStatus() != 1 && (user.getFollowStatus() == 0 || user.getFollowStatus() == 4)) {
                return EnumC736410Sud.NO_RELATION;
            }
        }
        return EnumC736410Sud.SINGLE;
    }
}
