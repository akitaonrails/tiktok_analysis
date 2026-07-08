package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CVL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CVL {
    public static int LIZLLL;
    public static AnonymousClass0956 LJI;
    public static final C0CVL LIZ = new C0CVL();
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static int LJ = -1;
    public static String LJFF = "";

    public static String LIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        return (curUser == null || (uid = curUser.getUid()) == null) ? "" : uid;
    }

    public static void LIZJ(String str) {
        Object c098200Yq;
        if (LIZIZ != LIZLLL && str.length() != 0 && Intrinsics.LJFF(str, LIZ())) {
            try {
                LIZIZ = LIZLLL;
                LIZJ = LJ;
                LIZ.getClass();
                Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
                repo.storeInt(C786410Ut5.j4("%s_notice_num_count", Arrays.copyOf(new Object[]{LIZ()}, 1)), LIZIZ);
                repo.storeInt(C786410Ut5.j4("%s_conv_num_count", Arrays.copyOf(new Object[]{LIZ()}, 1)), LIZJ);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cache, noticeCount: ");
                sbLIZ.append(LIZIZ);
                C1720106oR.LJI("RedDotCacheHelper", C2188811AlT.LIZIZ(sbLIZ));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("RedDotCacheHelper", "updateCache", thM5exceptionOrNullimpl);
            }
        }
    }

    public static void LIZIZ(int i, int i2, int i3) {
        int i4;
        if (C0BM7.LIZIZ() && i >= 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (i2 == LIZIZ) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            c2344009Gk.LIZJ(i4, "is_equal");
            c2344009Gk.LIZJ(i2, "new_count");
            c2344009Gk.LIZJ(LIZIZ, "last_count");
            c2344009Gk.LIZJ(i3, "new_conv_count");
            c2344009Gk.LIZJ(LIZJ, "last_conv_count");
            c2344009Gk.LIZJ(i, "source");
            C20684815ws.LJIILLIIL("update_unread_count_from_loading", c2344009Gk.LIZ);
            LIZJ = i3;
        }
    }
}
