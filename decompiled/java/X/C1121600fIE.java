package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0fIE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121600fIE {
    public static final Keva LIZ = Keva.getRepo("match_item");

    public static boolean LIZLLL() {
        return LIZ.getBoolean(LIZIZ(), false);
    }

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bag_page_shown_");
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bag_show_entrance_");
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_virtual_ticket_first_obtain_red_dot_seen_");
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
