package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.socialavatar.view.SocialAvatarCameraActivity;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarMainActivity;

/* JADX INFO: renamed from: X.0HZB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZB extends C1619110sEf implements InterfaceC19330810jy {
    public final int[] LL = {110};

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        return null;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LL;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        Activity activityLIZ;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        if (!(activityLIZ instanceof SocialAvatarCameraActivity) && !(activityLIZ instanceof SocialAvatarMainActivity)) {
            return false;
        }
        return true;
    }
}
