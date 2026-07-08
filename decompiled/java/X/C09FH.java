package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.api.bean.ProfileTabStoreData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09FH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09FH {
    public static final C09FH LIZ = new C09FH();

    public static ProfileTabStoreData LIZ() {
        try {
            LIZ.getClass();
            String string = LIZIZ().getString((String) C1952007kk.LIZ.getValue(), "");
            if (string == null || string.length() == 0) {
                return null;
            }
            ProfileTabStoreData profileTabStoreData = (ProfileTabStoreData) JsonParseUtils.LIZLLL(ProfileTabStoreData.class, string);
            if (profileTabStoreData == null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("ProfileNoticeCountInfoDataCache", "get profile data: is profile tab clicked: null, count: null");
                return profileTabStoreData;
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get profile data: is profile tab clicked: ");
            sbLIZ.append(profileTabStoreData.isProfileTabClicked);
            sbLIZ.append(", count: ");
            sbLIZ.append(profileTabStoreData.totalCount);
            C1720106oR.LJI("ProfileNoticeCountInfoDataCache", C2188811AlT.LIZIZ(sbLIZ));
            return profileTabStoreData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("ProfileNoticeCountInfoDataCache", "getProfileTabNoticeCountData error", thM5exceptionOrNullimpl);
            }
            return null;
        }
    }

    public static Keva LIZIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        return Keva.getRepo(C786410Ut5.j4("profile_data_%s_repo_v2", Arrays.copyOf(new Object[]{uid}, 1)));
    }

    public static void LIZJ(ProfileTabStoreData profileTabStoreData) {
        Object c098200Yq;
        try {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("store profile data, is profile tab clicked: ");
            sbLIZ.append(profileTabStoreData.isProfileTabClicked);
            sbLIZ.append(", count: ");
            sbLIZ.append(profileTabStoreData.totalCount);
            C1720106oR.LJI("ProfileNoticeCountInfoDataCache", C2188811AlT.LIZIZ(sbLIZ));
            LIZ.getClass();
            LIZIZ().storeString((String) C1952007kk.LIZ.getValue(), JsonParseUtils.LJ(profileTabStoreData));
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
            C1720106oR.LIZIZ("ProfileNoticeCountInfoDataCache", "storeProfileTabNoticeCountData", thM5exceptionOrNullimpl);
        }
    }

    public static void LIZLLL(boolean z) {
        ProfileTabStoreData profileTabStoreDataLIZ = LIZ();
        if (profileTabStoreDataLIZ == null) {
            LIZJ(new ProfileTabStoreData(false, 0));
        } else {
            profileTabStoreDataLIZ.isProfileTabClicked = z;
            LIZJ(profileTabStoreDataLIZ);
        }
    }
}
