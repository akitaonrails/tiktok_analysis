package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0SfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726870SfF implements InterfaceC1259300isK {
    public static final C726870SfF LIZ = new C726870SfF();
    public static final Keva LIZIZ = Keva.getRepo("STORY_ARCHIVE_GUIDE_REPO");

    public static String LIZJ() {
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("STORY_ARCHIVE_GUIDE_");
        sbLIZ.append(uid);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1259300isK
    public final void LIZ() {
        LIZIZ.storeBoolean(LIZJ(), false);
    }

    @Override // X.InterfaceC1259300isK
    public final boolean LIZIZ() {
        if (!C1601110rld.LIZ()) {
            return false;
        }
        Keva keva = LIZIZ;
        if (keva.contains(LIZJ())) {
            return keva.getBoolean(LIZJ(), false);
        }
        return true;
    }
}
