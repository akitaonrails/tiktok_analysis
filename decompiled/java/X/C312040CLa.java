package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312040CLa {
    public static final C312040CLa LIZ = new C312040CLa();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5528));

    public static int LIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static boolean LIZIZ() {
        if (LIZ() == 0) {
            return false;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        return (LIZ() == 1 || LIZ() == 2) ? curUser.getFollowingCount() <= 0 : LIZ() == 3 && curUser.getFriendCount() <= 0;
    }
}
