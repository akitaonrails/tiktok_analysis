package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0TI1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TI1 {
    public static boolean LIZ() {
        IUserService iUserService;
        User currentUser;
        String uid;
        if (!((Boolean) C289440BWc.LIZIZ.getValue()).booleanValue() || ComplianceServiceProvider.LJIJJ().LJJIIZ() || (iUserService = (IUserService) ServiceManager.get().getService(IUserService.class)) == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("story_thought_permission_default_friends_toast_shown_");
        sbLIZ.append(uid);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva repo = Keva.getRepo("story_thought");
        if (repo.getBoolean(strLIZIZ, false)) {
            return false;
        }
        repo.storeBoolean(strLIZIZ, true);
        return true;
    }
}
