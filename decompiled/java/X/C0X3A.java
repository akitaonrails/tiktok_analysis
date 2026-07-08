package X;

import Y.ACallableS420S0100000_13;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0X3A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X3A {
    public static String LIZ(User user) {
        if (user == null) {
            return "";
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            if (user.getShortId() == null) {
                return "";
            }
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    public static C15O7<Bundle> LIZIZ(Bundle bundle) {
        if (!C1150504el.LIZ().LJIIIIZZ("cold_boot_login_success_to_signup_destroy")) {
            C1150504el.LIZ().LIZLLL("cold_boot_login_success_to_signup_destroy", false);
        }
        if (!C1150504el.LIZ().LJIIIIZZ("cold_boot_query_user_sync_duration")) {
            C1150504el.LIZ().LIZLLL("cold_boot_query_user_sync_duration", false);
        }
        C15O7<Bundle> c15o7LJ = C15O7.LIZJ(new ACallableS420S0100000_13(bundle, 11)).LJ(new C854740Xg0(bundle, 5), C15O7.LJIIIIZZ, null);
        if (!C1150504el.LIZ().LJIIIZ("cold_boot_query_user_sync_duration")) {
            C1150504el.LIZ().LJI("cold_boot_query_user_sync_duration", false);
        }
        return c15o7LJ;
    }
}
