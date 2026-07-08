package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dS9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050870dS9 {
    public static final C1050870dS9 LIZ = new C1050870dS9();

    public static boolean LIZ(User user) {
        IAccountUserService iAccountUserServiceLJFF;
        User curUser;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "disable_search_live_tag", true) == 1) {
            return false;
        }
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            if (!((ILiveOuterService) objPluggableSpi$default).U4().LIZIZ(user) && (user == null || !user.isSecret() || !user.isLive() || !C1492170ovv.LIZ() || (iAccountUserServiceLJFF = C0XQ7.LJFF()) == null || (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) == null || !Intrinsics.LJFF(user.getUid(), curUser.getUid()))) {
                return false;
            }
            return true;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
