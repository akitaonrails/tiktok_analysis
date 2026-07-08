package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.01I3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01I3 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (15 <= str.length()) {
            return str.substring(0, 15);
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("safeSubstring StringIndexOutOfBoundsException: startIndex=");
        sbLIZ.append(0);
        sbLIZ.append(", endIndex=");
        sbLIZ.append(15);
        sbLIZ.append(", length=");
        sbLIZ.append(str.length());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZLLL("MultiGuestV3ModeratorToastHelper", strLIZIZ);
        return str;
    }

    public static void LJ(int i, String str) {
        if (C930540aK4.LJIL(UserService.getInstance().user().LJIJJLI())) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("MultiGuestV3ModeratorToastHelper", "tryShowMuteDelayToastForAudience");
            C766270U4b.LJII(i, str);
        }
    }

    public static void LIZLLL(int i, String str, String str2) {
        Pair pair;
        String string;
        if (str.length() + str2.length() > 30) {
            pair = new Pair(LIZ(str), LIZ(str2));
        } else {
            pair = new Pair(str, str2);
        }
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII != null && (string = contextLJII.getString(i, pair.getFirst(), pair.getSecond())) != null) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("formatText=");
            sbLIZ.append(string);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LIZ("MultiGuestV3ModeratorToastHelper", strLIZIZ);
            C766270U4b.LJIIJJI(string);
        }
    }

    public static void LIZIZ(int i, String str, User user, User user2) {
        C01FD.LIZ(str);
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestV3ModeratorToastHelper", "showAnchorReceiveModeratorOperateToastByUser");
        if (user != null && user2 != null) {
            String strLIZ = C0KVU.LIZ(user);
            String str2 = "";
            if (strLIZ == null) {
                strLIZ = "";
            }
            String strLIZ2 = C0KVU.LIZ(user2);
            if (strLIZ2 != null) {
                str2 = strLIZ2;
            }
            LIZLLL(i, strLIZ, str2);
        }
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        C01FD.LIZ(str);
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("MultiGuestV3ModeratorToastHelper", "showAnchorReceiveModeratorOperateToastByUserName");
        LIZLLL(i, str2, str3);
    }
}
