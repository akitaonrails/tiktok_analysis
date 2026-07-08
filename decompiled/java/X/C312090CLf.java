package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312090CLf {
    public static final C312090CLf LIZ = new C312090CLf();

    public static boolean LIZ() {
        User currentUser;
        String uid;
        User currentUser2;
        IAccountUserService iAccountUserService = (IAccountUserService) ServiceManager.get().getService(IAccountUserService.class);
        if (!(iAccountUserService != null ? Intrinsics.LJFF(iAccountUserService.isCurUserOrgAccount(), Boolean.TRUE) : false)) {
            return iAccountUserService == null || !Intrinsics.LJFF(iAccountUserService.isOrgAccConvInterPeriod(), Boolean.TRUE);
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String uid2 = null;
        if (!(iUserService == null || (currentUser2 = iUserService.getCurrentUser()) == null || (uid2 = currentUser2.getUid()) == null || uid2.length() == 0)) {
            byte[] bArr = new byte[0];
            if (KevaImpl.getRepo("autofill_info", 1).getBytes(uid2, bArr).length != 0) {
                KevaImpl.getRepo("autofill_info", 1).storeBytes(uid2, bArr);
            }
        }
        IUserService iUserService2 = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService2 != null && (currentUser = iUserService2.getCurrentUser()) != null && (uid = currentUser.getUid()) != null && uid.length() != 0) {
            Keva repo = KevaImpl.getRepo("autofill_info", 1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uid);
            sbLIZ.append("payment");
            String string = repo.getString(C2188811AlT.LIZIZ(sbLIZ), "");
            if (string != null && string.length() != 0) {
                Keva repo2 = KevaImpl.getRepo("autofill_info", 1);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(uid);
                sbLIZ2.append("payment");
                repo2.storeString(C2188811AlT.LIZIZ(sbLIZ2), "");
            }
        }
        return false;
    }
}
