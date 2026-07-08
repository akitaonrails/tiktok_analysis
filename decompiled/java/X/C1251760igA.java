package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0igA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251760igA {
    public static final C1251760igA LIZ = new C1251760igA();
    public static String LIZIZ = C0XQ7.LJFF().getCurUserId();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(811));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(809));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(810));

    public static ProfileUser LIZ(String str, boolean z) {
        ProfileUser profileUserLIZIZ;
        ProfileUser profileUserLIZIZ2;
        boolean z2;
        if (str == null) {
            return null;
        }
        if (!Intrinsics.LJFF(LIZIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            ((IUserProfilePreload) LIZJ.getValue()).clearCache();
            LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        }
        User userLIZ = C1251770igB.LIZ(str);
        if (userLIZ != null) {
            if (userLIZ.getFollowerCount() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                userLIZ.setFollowerCount(-1);
            } else if (userLIZ != null) {
            }
            if (userLIZ.getFollowingCount() == 0) {
                userLIZ.setFollowingCount(-1);
            }
            if (userLIZ.getTotalFavorited() == 0 || userLIZ.getFollowerCount() == -1 || userLIZ.getFollowingCount() == -1) {
                userLIZ.setTotalFavorited(-1L);
            }
        }
        if (C299880BpC.LIZ() && userLIZ != null) {
            userLIZ.isShowMessageEntrance = true;
        }
        C01GW c01gw = LIZLLL;
        ProfileUser profileUser = (ProfileUser) ((LruCache) c01gw.getValue()).get(str);
        if (profileUser != null) {
            if (userLIZ != null && ((userLIZ.isAccuratePrivateAccount() && userLIZ.getFollowStatus() < 1) || userLIZ.isBlocked() || userLIZ.isBlock)) {
                ((LruCache) c01gw.getValue()).remove(str);
                if (C2549809yy.LIZ != 1) {
                    return null;
                }
                ((IUserProfilePreload) LIZJ.getValue()).LJI(true);
                if (z) {
                    profileUserLIZIZ2 = (ProfileUser) LJ.getValue();
                } else {
                    C1250160ida.LIZ.getClass();
                    profileUserLIZIZ2 = C1250160ida.LIZIZ("load_page_model_preload", false);
                }
                return LIZIZ(userLIZ, profileUserLIZIZ2);
            }
            ((IUserProfilePreload) LIZJ.getValue()).LJI(false);
            return profileUser;
        }
        ((IUserProfilePreload) LIZJ.getValue()).LJI(true);
        if (z) {
            profileUserLIZIZ = (ProfileUser) LJ.getValue();
        } else {
            C1250160ida.LIZ.getClass();
            profileUserLIZIZ = C1250160ida.LIZIZ("load_page_model_preload", false);
        }
        return LIZIZ(userLIZ, profileUserLIZIZ);
    }

    public static ProfileUser LIZIZ(User user, ProfileUser profileUser) {
        try {
            C1251850igJ c1251850igJ = C1251850igJ.LIZ;
            AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(711);
            c1251850igJ.getClass();
            return C1251850igJ.LJIILIIL(user, profileUser, false, aFwS257S0000000_19);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            C1251850igJ.LIZ.getClass();
            n nVar = C1251850igJ.LIZJ;
            c1250680ieQ.getClass();
            C1250680ieQ.LJ(nVar, e);
            C1250160ida.LIZ.getClass();
            return C1250160ida.LIZJ;
        }
    }
}
