package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX INFO: renamed from: X.0ikv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254710ikv {
    public static final String LIZ;
    public static boolean LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append("/aweme/v1/user/");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = true;
    }

    public static User LIZ(String str, boolean z, String str2) {
        String str3;
        boolean zLJI = MethodIDManager.LJI(137214);
        C0XI4 c0xi4 = new C0XI4(str);
        if (LIZIZ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0xi4.LJ("is_cold_start", str3);
        LIZIZ = false;
        User user = (User) C1260090itb.LIZIZ.apiExecuteGetJSONObject(c0xi4.LJFF(), User.class, "user", z, str2, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return user;
    }

    public static String LIZIZ(String str, String str2, String str3, int i, Boolean bool, EnumC1254690ikt enumC1254690ikt) {
        int i2;
        Uri.Builder builderBuildUpon = UriProtector.parse(C0CQT.LIZJ).buildUpon();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
        String uniqueId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUniqueId();
        if ((!TextUtils.isEmpty(str2) && TextUtils.equals(curUserId, str2)) || ((!TextUtils.isEmpty(str) && TextUtils.equals(curSecUserId, str)) || (!TextUtils.isEmpty(str3) && TextUtils.equals(uniqueId, str3)))) {
            builderBuildUpon.path("/aweme/v1/user/profile/self/");
            if (enumC1254690ikt == null || enumC1254690ikt == EnumC1254690ikt.UNKNOWN) {
                builderBuildUpon.appendQueryParameter("scene_id", String.valueOf(EnumC1254690ikt.SELF_OLD.getSceneID()));
            }
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                Keva repo = Keva.getRepo("keva_repo_profile_component");
                if (C2277881EDy.LIZIZ.needShowCompleteProfileGuideBar()) {
                    C0TMQ.LIZ.getClass();
                    if (!repo.getBoolean(C0TMQ.LIZ("profile_page_complete_profile_guide_bar_has_click_close"), false) && repo.getInt(C0TMQ.LIZ("profile_page_complete_profile_guide_bar_show_times"), 0) < 3 && System.currentTimeMillis() - repo.getLong(C0TMQ.LIZ("profile_page_complete_profile_guide_bar_last_show_time"), 0L) > 2592000000L) {
                        builderBuildUpon.appendQueryParameter("need_pv", String.valueOf(true));
                    }
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            builderBuildUpon.path("/aweme/v1/user/profile/other/").appendQueryParameter("sec_user_id", str);
        } else if (!TextUtils.isEmpty(str2)) {
            builderBuildUpon.path("/aweme/v1/user/profile/other/").appendQueryParameter("user_id", str2);
        } else if (!TextUtils.isEmpty(str3)) {
            builderBuildUpon.path("/aweme/v1/user/profile/other/").appendQueryParameter("unique_id", str3);
        } else {
            builderBuildUpon.path("/aweme/v1/user/profile/other/");
        }
        if (bool.booleanValue()) {
            builderBuildUpon.appendQueryParameter("with_mutual", String.valueOf(true));
        }
        if (((AccountUserService) C0XQ7.LJFF()).LIZLLL()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        builderBuildUpon.appendQueryParameter("address_book_access", String.valueOf(i2));
        builderBuildUpon.appendQueryParameter("from", String.valueOf(i));
        if (enumC1254690ikt != null) {
            builderBuildUpon.appendQueryParameter("scene_id", String.valueOf(enumC1254690ikt.getSceneID()));
        }
        if (builderBuildUpon.toString().contains("/aweme/v1/user/profile/other/")) {
            int[] iArrLIZ = C422830Gi1.LIZ(102);
            String str4 = iArrLIZ[0] + "_" + iArrLIZ[1];
            int[] iArrLIZ2 = C422830Gi1.LIZ(OppoPermissionPopupMaskDelayExp.DEFAULT);
            String str5 = iArrLIZ2[0] + "_" + iArrLIZ2[1];
            builderBuildUpon.appendQueryParameter("user_avatar_shrink", str4);
            builderBuildUpon.appendQueryParameter("user_cover_shrink", str5);
        }
        return builderBuildUpon.toString();
    }
}
