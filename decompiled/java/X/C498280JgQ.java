package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0JgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498280JgQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(BadgeStruct badgeStruct, long j, long j2) {
        boolean z;
        boolean z2;
        C1095140ebY c1095140ebYUw0;
        Object obj;
        Long lValueOf;
        if (UserService.getInstance().user().getCurrentUserId() == j2) {
            z = true;
        } else {
            z = false;
        }
        if (j == j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        Integer numValueOf = null;
        if (iFansClubService != null) {
            c1095140ebYUw0 = iFansClubService.uw0();
        } else {
            c1095140ebYUw0 = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_badge_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(C0IUA.LIZJ), "online_user");
        c474500IjALIZ.LJJII("comment_area", "show_place");
        String str = "anchor";
        if (z) {
            obj = "anchor";
        } else {
            obj = "user";
        }
        c474500IjALIZ.LJJII(obj, "user_type");
        if (!z2) {
            str = "user";
        }
        c474500IjALIZ.LJJII(str, "to_user_type");
        c474500IjALIZ.LJJII("fans_club_level", "privilege_scenario");
        if (c1095140ebYUw0 != null) {
            numValueOf = Integer.valueOf(c1095140ebYUw0.LJ);
            lValueOf = Long.valueOf(c1095140ebYUw0.LIZ);
        } else {
            lValueOf = null;
        }
        C191100oP.LIZ(c474500IjALIZ, badgeStruct, z, z2, numValueOf, lValueOf, false);
        c474500IjALIZ.LIZ();
    }
}
