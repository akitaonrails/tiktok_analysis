package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0mLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392850mLj {
    public static final boolean LIZ(User user) {
        Integer numValueOf;
        if (user != null && (numValueOf = Integer.valueOf(user.getFollowStatus())) != null) {
            if (numValueOf.intValue() == 2) {
                return true;
            }
            if (numValueOf.intValue() == 1) {
                C1610870s1N.LIZ.getClass();
                return C1610870s1N.LIZIZ();
            }
            return false;
        }
        return false;
    }
}
