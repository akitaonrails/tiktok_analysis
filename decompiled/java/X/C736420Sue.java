package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Sue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736420Sue {
    public static EnumC736410Sud LIZ(User user) {
        if (user != null) {
            if (user.getFollowerStatus() == 1) {
                return EnumC736410Sud.MUTUAL;
            }
            return EnumC736410Sud.SINGLE;
        }
        return null;
    }
}
