package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.06Nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1598106Nn {
    public static boolean LIZ() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "show_live_entrance_with_position_control", true) != 1) {
            return true;
        }
        Keva kevaLIZJ = C1598206No.LIZJ();
        C0I0B c0i0b = C0I0B.LJFF;
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fix_action_bar_live_button_position");
        sbLIZ.append(curUserId);
        if (kevaLIZJ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            return true;
        }
        if (C1598206No.LIZIZ() > 3) {
            if (C1598206No.LIZ() < 3) {
                return false;
            }
            C1598206No.LJI(true);
            return true;
        }
        Keva kevaLIZJ2 = C1598206No.LIZJ();
        String curUserId2 = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        String str = curUserId2 != null ? curUserId2 : "";
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("action_bar_live_button_click_time");
        sbLIZ2.append(str);
        if (kevaLIZJ2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L) != 0) {
            C1598206No.LJI(true);
        }
        return true;
    }
}
