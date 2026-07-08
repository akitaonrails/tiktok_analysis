package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource;

/* JADX INFO: renamed from: X.0HZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZ5 implements InterfaceC586170Myt {
    public static final C0HZ5 LL = new C0HZ5();

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String uid;
        SocialAvatarEntranceDynamicDataSource socialAvatarEntranceDynamicDataSource = SocialAvatarEntranceDynamicDataSource.LL;
        C1910890zpH c1910890zpHLIZLLL = socialAvatarEntranceDynamicDataSource.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarEntranceDynamicDataSource addLoginOrLogoutListener get type as ");
        sbLIZ.append(i);
        sbLIZ.append(", success is ");
        sbLIZ.append(z);
        sbLIZ.append(", loginReasonType as ");
        sbLIZ.append(0);
        sbLIZ.append(", user as ");
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        c1910890zpHLIZLLL.LIZ("DynamicEntranceSetting", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (i == 1 || i == 2 || i == 3) {
                ((C11PQ) SocialAvatarEntranceDynamicDataSource.LLJILLL.getValue()).onNext(new C0HI2(false, false));
                socialAvatarEntranceDynamicDataSource.LJ(true);
                SocialAvatarEntranceDynamicDataSource.LLILZIL.set(false);
            }
        }
    }
}
