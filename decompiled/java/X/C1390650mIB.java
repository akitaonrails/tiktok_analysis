package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.newusermode.INewUserModeService;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mIB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390650mIB {
    public static final C1390650mIB LIZ = new C1390650mIB();
    public static int LIZIZ = -1;
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1390670mID());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1390680mIE());
    public static final C01GW LJ = C452501pT.LIZIZ(new C04T5());
    public static String LJFF = "unknown";

    public static boolean LIZ() {
        return (((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false) || ComplianceServiceProvider.LJJIII().LJ() || ((AccountUserService) C0XQ7.LJFF()).LIZ()) ? false : true;
    }

    public static void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report popup_monitor_status close, and previous: ");
        sbLIZ.append(LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LIZIZ == 3) {
            return;
        }
        LIZIZ = 3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(3, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("action", "close");
        C20684815ws.LJIILLIIL("popup_monitor_status", c2344009Gk.LIZ);
    }

    public static void LJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report popup_monitor_status: ");
        sbLIZ.append(i);
        sbLIZ.append(", and previous: ");
        sbLIZ.append(LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LIZIZ == i) {
            return;
        }
        LIZIZ = i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("action", "start");
        C20684815ws.LJIILLIIL("popup_monitor_status", c2344009Gk.LIZ);
    }

    public static void LIZLLL(long j, String str, String str2, String str3) {
        String str4;
        Map<String, String> mapLJIIIIZZ = ((IScreenshotService) LIZJ.getValue()).LJIIIIZZ();
        if (C849850XVn.LIZIZ.LIZJ().LJJ("")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            Iterator<T> it2 = C1390760mIM.LIZ.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(next, str)) {
                    if (next != null && (str4 = C1390760mIM.LIZ.get(next)) != null) {
                        str = str4;
                    }
                }
            }
            c2344009Gk.LJIIIIZZ("element_label", str);
            c2344009Gk.LIZLLL(j, "duration");
            c2344009Gk.LJIIIIZZ("trigger_id", str2);
            c2344009Gk.LJIIIIZZ("group_id", mapLJIIIIZZ.get("group_id"));
            if (TextUtils.isEmpty(str3)) {
                str3 = mapLJIIIIZZ.get("enter_from");
            }
            c2344009Gk.LJIIIIZZ("enter_from", str3);
            C20684815ws.LJIILLIIL("popup_stay_time", c2344009Gk.LIZ);
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("element_label", str);
        c2344009Gk2.LIZLLL(j, "duration");
        c2344009Gk2.LJIIIIZZ("trigger_id", str2);
        c2344009Gk2.LJIIIIZZ("group_id", mapLJIIIIZZ.get("group_id"));
        if (TextUtils.isEmpty(str3)) {
            str3 = mapLJIIIIZZ.get("enter_from");
        }
        c2344009Gk2.LJIIIIZZ("enter_from", str3);
        C20684815ws.LJIILLIIL("popup_stay_time", c2344009Gk2.LIZ);
    }

    public static void LIZIZ(String str, boolean z, String str2, C1390660mIC c1390660mIC, EnumC1390310mHd enumC1390310mHd, String str3) {
        int i;
        int i2;
        Map<String, String> mapLJIIIIZZ = ((IScreenshotService) LIZJ.getValue()).LJIIIIZZ();
        if (!LIZ()) {
            return;
        }
        if (C1390550mI1.LIZJ(str, enumC1390310mHd)) {
            enumC1390310mHd.toString();
            return;
        }
        if (C1390550mI1.LIZ.onlyRegression) {
            enumC1390310mHd.toString();
            return;
        }
        String str4 = "true";
        if (C849850XVn.LIZIZ.LIZJ().LJJ("")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("rule_id", C1390550mI1.LIZ.ruleId);
            c2344009Gk.LJIIIIZZ("rule_title", C1390550mI1.LIZ.ruleTitle);
            c2344009Gk.LJIIIIZZ("element_type", enumC1390310mHd.getValue());
            Iterator<T> it2 = C1390760mIM.LIZ.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(next, str)) {
                    if (next == null || (str = C1390760mIM.LIZ.get(next)) == null) {
                        break;
                    }
                }
            }
            String str5 = str;
            c2344009Gk.LJIIIIZZ("element_label", str5);
            if (Intrinsics.LJFF(LJFF, "unknown") && enumC1390310mHd == EnumC1390310mHd.POPUP) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_unknown_popup");
            c2344009Gk.LIZJ(c1390660mIC.LIZ, "is_login");
            c2344009Gk.LIZJ(c1390660mIC.LIZJ, "current_vv");
            c2344009Gk.LIZJ(c1390660mIC.LIZIZ, "current_fyp_vv");
            c2344009Gk.LIZJ(c1390660mIC.LJ, "current_day");
            c2344009Gk.LIZJ(c1390660mIC.LJFF, "is_in_fyp");
            c2344009Gk.LIZJ(((INewUserModeService) LIZLLL.getValue()).LIZLLL(), "cold_launch_count");
            c2344009Gk.LIZJ(c1390660mIC.LJI, "is_within_nvv");
            c2344009Gk.LIZJ(c1390660mIC.LJII, "is_within_ndays");
            c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII, "from_start_to_current_duration");
            c2344009Gk.LJIIIIZZ("enter_from", mapLJIIIIZZ.get("enter_from"));
            c2344009Gk.LJIIIIZZ("click_type", str2);
            if (!z) {
                str4 = "false";
            }
            c2344009Gk.LJIIIIZZ("click_positive", str4);
            c2344009Gk.LJIIIIZZ("trigger_id", str3);
            C20684815ws.LJIILLIIL("popup_monitor_click", c2344009Gk.LIZ);
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("rule_id", C1390550mI1.LIZ.ruleId);
        c2344009Gk2.LJIIIIZZ("rule_title", C1390550mI1.LIZ.ruleTitle);
        c2344009Gk2.LJIIIIZZ("element_type", enumC1390310mHd.getValue());
        c2344009Gk2.LJIIIIZZ("element_label", str);
        if (Intrinsics.LJFF(LJFF, "unknown") && enumC1390310mHd == EnumC1390310mHd.POPUP) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk2.LIZJ(i, "is_unknown_popup");
        c2344009Gk2.LIZJ(c1390660mIC.LIZ, "is_login");
        c2344009Gk2.LIZJ(c1390660mIC.LIZJ, "current_vv");
        c2344009Gk2.LIZJ(c1390660mIC.LIZIZ, "current_fyp_vv");
        c2344009Gk2.LIZJ(c1390660mIC.LJ, "current_day");
        c2344009Gk2.LIZJ(c1390660mIC.LJFF, "is_in_fyp");
        c2344009Gk2.LIZJ(((INewUserModeService) LIZLLL.getValue()).LIZLLL(), "cold_launch_count");
        c2344009Gk2.LIZJ(c1390660mIC.LJI, "is_within_nvv");
        c2344009Gk2.LIZJ(c1390660mIC.LJII, "is_within_ndays");
        c2344009Gk2.LIZLLL(SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII, "from_start_to_current_duration");
        c2344009Gk2.LJIIIIZZ("enter_from", mapLJIIIIZZ.get("enter_from"));
        c2344009Gk2.LJIIIIZZ("click_type", str2);
        if (!z) {
            str4 = "false";
        }
        c2344009Gk2.LJIIIIZZ("click_positive", str4);
        c2344009Gk2.LJIIIIZZ("trigger_id", str3);
        C20684815ws.LJIILLIIL("popup_monitor_click", c2344009Gk2.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.String r26, X.EnumC1390310mHd r27, X.C1390660mIC r28, java.lang.String r29, int r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1390650mIB.LJFF(java.lang.String, X.0mHd, X.0mIC, java.lang.String, int, java.lang.String):void");
    }
}
