package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.profile.platform.base.data.IProfileDataCacheHelper;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.utils.ProfileStandardDataHelper;

/* JADX INFO: renamed from: X.0iaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248280iaY {
    public static final C1248280iaY LIZ = new C1248280iaY();
    public static String LIZIZ = "";

    public static void LIZ(String str, String str2) {
        IProfileDataCacheHelper profileStandardDataHelper;
        String str3;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("profile_attributes", LIZIZ);
        c2344009Gk.LJIIIIZZ("report_scene", "profile_text_error");
        c2344009Gk.LJIIIIZZ("error_msg", str);
        c2344009Gk.LJIIIIZZ("text_name", str2);
        Object objLIZ = C04TD.LIZ(IProfileDataCacheHelper.class, false);
        if (objLIZ != null) {
            profileStandardDataHelper = (IProfileDataCacheHelper) objLIZ;
        } else {
            profileStandardDataHelper = new ProfileStandardDataHelper();
        }
        ProfileUser profileUserLIZ = profileStandardDataHelper.LIZ();
        if (profileUserLIZ != null && (serverTimeExtra = profileUserLIZ.extra) != null) {
            str3 = serverTimeExtra.logid;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("log_id", str3);
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
    }
}
