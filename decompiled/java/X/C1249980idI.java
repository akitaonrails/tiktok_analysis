package X;

import com.ss.android.ugc.aweme.reddot.RedDotService;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarCenterComponent;

/* JADX INFO: renamed from: X.0idI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249980idI {
    public static final EnumC1584360rKc LIZ;
    public static final String LIZIZ;
    public static boolean LIZJ;
    public static int LIZLLL;
    public static int LJ;

    static {
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.PROFILE;
        LIZ = enumC1584360rKc;
        LIZIZ = C1250890iel.LIZ(enumC1584360rKc, EnumC1253890ijb.NUMBER, "switch_account");
    }

    public static void LIZLLL() {
        RedDotService.LIZ.getClass();
        RedDotService redDotServiceLIZ = C04R9.LIZ();
        if (redDotServiceLIZ != null) {
            redDotServiceLIZ.LIZJ(new C1255560imI("switch_account", ProfileNavBarCenterComponent.LLLIIII ? "nav_switch_account" : "info_switch_account", LIZ, new C1255500imC(LIZLLL), EnumC1255080ilW.PROFILE, EnumC2009107tx.CLICK_NOT_DISAPPEAR));
        }
        LIZJ = true;
    }

    public static void LIZIZ() {
        if (C283610B9r.LIZ() && LIZJ && LIZLLL > 0) {
            RedDotService.LIZ.getClass();
            RedDotService redDotServiceLIZ = C04R9.LIZ();
            if (redDotServiceLIZ != null) {
                redDotServiceLIZ.LJFF(LIZIZ, ProfileNavBarCenterComponent.LLLIIII ? "nav_switch_account" : "info_switch_account");
            }
            RedDotService redDotServiceLIZ2 = C04R9.LIZ();
            if (redDotServiceLIZ2 != null) {
                redDotServiceLIZ2.LIZLLL(LIZIZ);
            }
        }
    }

    public static void LIZJ() {
        if (C283610B9r.LIZ() && LIZJ && LIZLLL > 0) {
            RedDotService.LIZ.getClass();
            RedDotService redDotServiceLIZ = C04R9.LIZ();
            if (redDotServiceLIZ != null) {
                redDotServiceLIZ.LJFF(LIZIZ, ProfileNavBarCenterComponent.LLLIIII ? "nav_switch_account" : "info_switch_account");
            }
            RedDotService redDotServiceLIZ2 = C04R9.LIZ();
            if (redDotServiceLIZ2 != null) {
                redDotServiceLIZ2.LIZIZ(LIZIZ, EnumC1250000idK.LOGOUT);
            }
            LIZJ = false;
        }
    }

    public static void LIZ(int i) {
        if (!C283610B9r.LIZ()) {
            return;
        }
        LIZLLL = i;
        if (!LIZJ && i > 0) {
            LIZLLL();
        }
    }
}
