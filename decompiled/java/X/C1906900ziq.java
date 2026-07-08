package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0ziq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906900ziq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(49));

    public static final User LIZ(List<? extends User> list) {
        User user;
        boolean z = false;
        if (list != null && list.size() == 1) {
            z = true;
        }
        if (!z || (user = (User) C13LP.LJJJLL(list)) == null || user.getMatchedFriendStruct() == null) {
            return null;
        }
        return user;
    }

    public static final Pair<User, EnumC055700Ih> LIZIZ(List<? extends User> list, boolean z) {
        User userLIZ;
        if (!z || list == null || (userLIZ = LIZ(list)) == null) {
            return null;
        }
        return new Pair<>(userLIZ, EnumC055700Ih.SEPARATE_MATCHED_FRIEND);
    }
}
