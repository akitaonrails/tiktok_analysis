package X;

import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0igP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251910igP {
    public static final boolean LIZ(User user) {
        GeneralPermission generalPermission;
        if (!user.isBlock && (((generalPermission = user.getGeneralPermission()) == null || generalPermission.getFollowToastType() != 1) && !user.isUserCancelled() && !user.isGeoBlocked())) {
            C1251920igQ c1251920igQ = EnumC1252760ihm.Companion;
            int i = user.audienceControlViewerMode;
            c1251920igQ.getClass();
            if (C1251920igQ.LIZ(i) == EnumC1252760ihm.UNKNOWN && !C10EU.LJIILL(user, false)) {
                return false;
            }
        }
        return true;
    }
}
