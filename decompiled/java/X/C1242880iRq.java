package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0iRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242880iRq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, C19EG c19eg, User user, C1255030ilR c1255030ilR) {
        String groupId;
        String str;
        int i;
        if (c19eg != null) {
            Aweme awemeLJFF = C740740T3w.LJFF(c19eg);
            if (awemeLJFF == null || (groupId = awemeLJFF.getGroupId()) == null) {
                groupId = "";
            }
            if (view == null) {
                return;
            }
            C1242890iRr c1242890iRr = new C1256530inr(c19eg, view, c1255030ilR.LL, user, groupId, null, null, 448).LJII;
            c1242890iRr.getClass();
            C1232140iAW c1232140iAW = C1232140iAW.LIZ;
            User user2 = c1242890iRr.LIZ.LIZJ;
            if (user2 != null) {
                str = user2.naviId;
            } else {
                str = null;
            }
            if (str != null) {
                i = 1;
            } else {
                i = 0;
            }
            c1232140iAW.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "photo");
            c2344009Gk.LJIIIIZZ("enter_method", "share_panel");
            c2344009Gk.LIZJ(i, "old_is_avatar");
            C20684815ws.LJIILLIIL("replace_profile_photo", c2344009Gk.LIZ);
            C1255650imR c1255650imR = c1242890iRr.LIZ.LJI;
            if (c1255650imR != null) {
                c1255650imR.LJIILJJIL(0);
            }
        }
    }
}
