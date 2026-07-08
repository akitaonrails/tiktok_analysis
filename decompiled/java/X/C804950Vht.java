package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Vht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804950Vht {
    public static final C804950Vht LIZ = new C804950Vht();

    public static Keva LIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        return Keva.getRepo(C786410Ut5.j4("following_data_%s_repo", Arrays.copyOf(new Object[]{uid}, 1)));
    }

    public static void LIZIZ(long j) {
        Object c098200Yq;
        try {
            LIZ.getClass();
            LIZ().storeLong("key_following_feed_cache_time", j);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowingKevaStorage", "saveFeedCacheTime error", thM5exceptionOrNullimpl);
        }
    }

    public static void LIZJ(long j) {
        Object c098200Yq;
        try {
            LIZ.getClass();
            LIZ().storeLong("key_following_frequent_user_request_time", j);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowingKevaStorage", "saveFollowingFrequentUserRequestTime error", thM5exceptionOrNullimpl);
        }
    }
}
