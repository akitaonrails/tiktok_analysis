package X;

import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.profile.IMHostApiIUserProfilePreload;

/* JADX INFO: renamed from: X.0Yeb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879350Yeb {
    public static final C879350Yeb LIZ = new C879350Yeb();

    public static void LIZ(String str, String str2, String str3) {
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str, null, "im_local_db");
        if (iMUserLJIIL != null) {
            IMHostApiIUserProfilePreload.LIZ.getClass();
            IMHostApiIUserProfilePreload value = C879360Yec.LIZIZ.getValue();
            if (value != null) {
                IMUser.Companion.getClass();
                value.LIZ(C2201941BFw.LJII(iMUserLJIIL));
            }
        }
        if (str != null && str.length() != 0) {
            C0I0B.LJFF.LIZJ();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C894660Z7w.LIZ(), "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", str);
            smartRouteBuildRoute.withParam("sec_user_id", C069P.LIZ().LIZLLL().LIZ(str));
            smartRouteBuildRoute.withParam("extra_previous_page_position", "card_head");
            smartRouteBuildRoute.withParam("previous_page", str3);
            smartRouteBuildRoute.withParam("enter_method", str2);
            smartRouteBuildRoute.withParam("extra_from_pre_page", "message");
            smartRouteBuildRoute.withParam("enter_from", str3);
            smartRouteBuildRoute.open();
        }
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        boolean z = false;
        if (str != null && str.length() != 0) {
            C0I0B.LJFF.LIZJ();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C894660Z7w.LIZ(), "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", str);
            IMContactApi.LIZ.getClass();
            smartRouteBuildRoute.withParam("sec_user_id", C069P.LIZ().LIZLLL().LIZ(str));
            smartRouteBuildRoute.withParam("enter_method", str3);
            if (str4 != null) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("conversation_id", str4, bundle);
                smartRouteBuildRoute.withParam("bundle", bundle);
            }
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (z) {
                smartRouteBuildRoute.withParam("extra_previous_page_position", "card_head");
                smartRouteBuildRoute.withParam("previous_page", "message");
                smartRouteBuildRoute.withParam("enter_from", "chat");
                smartRouteBuildRoute.withParam("extra_from_pre_page", "message");
            } else {
                smartRouteBuildRoute.withParam("previous_page_position", "other_places");
                smartRouteBuildRoute.withParam("extra_from_pre_page", str2);
                smartRouteBuildRoute.withParam("enter_from", str2);
            }
            smartRouteBuildRoute.open();
        }
    }
}
