package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.0XVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849920XVu {
    public static final C849920XVu LIZ = new C849920XVu();
    public static final List<String> LIZIZ;
    public static final List<Collection<String>> LIZJ;
    public static final Keva LIZLLL;

    static {
        String[] strArr = new String[4];
        ISocialFriendsService iSocialFriendsService = (ISocialFriendsService) PluggableExtentionKt.pluggableSpi$default(ISocialFriendsService.class, false, false, false, 14, null);
        strArr[0] = iSocialFriendsService != null ? iSocialFriendsService.LIZLLL() : null;
        ISocialFriendsService iSocialFriendsService2 = (ISocialFriendsService) PluggableExtentionKt.pluggableSpi$default(ISocialFriendsService.class, false, false, false, 14, null);
        strArr[1] = iSocialFriendsService2 != null ? iSocialFriendsService2.LJ() : null;
        IRecommendUsersService iRecommendUsersService = (IRecommendUsersService) PluggableExtentionKt.pluggableSpi$default(IRecommendUsersService.class, false, false, false, 14, null);
        strArr[2] = iRecommendUsersService != null ? iRecommendUsersService.LJ() : null;
        ISocialFriendsService iSocialFriendsService3 = (ISocialFriendsService) PluggableExtentionKt.pluggableSpi$default(ISocialFriendsService.class, false, false, false, 14, null);
        strArr[3] = iSocialFriendsService3 != null ? iSocialFriendsService3.LIZ() : null;
        List<String> listLJJJJLI = C13LP.LJJJJLI(C0X45.of((Object[]) strArr));
        LIZIZ = listLJJJJLI;
        LIZJ = C1697810uHb.LJIILJJIL(listLJJJJLI, C0X45.of((Object[]) new String[]{"cla_popup_task"}));
        LIZLLL = Keva.getRepo("new_user_dialog_clean_repo");
    }

    public static String LIZ(String str) {
        String curSecUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        C0XQ7.LJ();
        if (C0XQ7.LIZ.LJIIJ().isLogin()) {
            curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
        } else {
            curSecUserId = "";
        }
        sbLIZ.append(curSecUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
