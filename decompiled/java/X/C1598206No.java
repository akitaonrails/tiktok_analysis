package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06No, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1598206No {
    public static final C1598206No LIZ = new C1598206No();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(829));

    public static Keva LIZJ() {
        return (Keva) LIZIZ.getValue();
    }

    public static int LIZ() {
        Keva kevaLIZJ = LIZJ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action_bar_live_button_click_count");
        sbLIZ.append(curUserId);
        return kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static int LIZIZ() {
        Keva kevaLIZJ = LIZJ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action_bar_live_button_show_times");
        sbLIZ.append(curUserId);
        return kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static void LJ() {
        Keva kevaLIZJ = LIZJ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        int iLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action_bar_live_button_click_count");
        sbLIZ.append(curUserId);
        kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ), iLIZ + 1);
    }

    public static void LJFF() {
        Keva kevaLIZJ = LIZJ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action_bar_live_button_click_time");
        sbLIZ.append(curUserId);
        kevaLIZJ.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
    }

    public static int LIZLLL(C1598206No c1598206No) {
        c1598206No.getClass();
        Keva kevaLIZJ = LIZJ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c1598206No.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open_live_dialog_show_times");
        sbLIZ.append(curUserId);
        return kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static void LJI(boolean z) {
        Keva kevaLIZJ = LIZJ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fix_action_bar_live_button_position");
        sbLIZ.append(curUserId);
        kevaLIZJ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }
}
