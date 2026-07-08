package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Sui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736460Sui {
    public static final EnumC736410Sud LIZ(User user) {
        boolean z;
        if (user != null) {
            if (user.getFollowerStatus() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (user.getFollowStatus() != 0 && user.getFollowStatus() != 4) {
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

    public static final boolean LIZIZ(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(User user) {
        try {
            return user.getUid().equals(C0XQ7.LJFF().getCurUserId());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
