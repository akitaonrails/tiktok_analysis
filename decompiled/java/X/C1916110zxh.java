package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0zxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916110zxh {
    public static boolean LIZ() {
        Keva keva = C1916120zxi.LJI;
        if (keva.getBoolean("user_logged_in_atleast_once", false) || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || keva.getBoolean("is_consent_accepted", false)) {
            return true;
        }
        boolean z = C1916120zxi.LJIIIZ.LIZIZ().getBoolean("consent_acceptance_from_backup", false);
        boolean zContains = keva.contains("ug_should_show");
        int i = (zContains && keva.getBoolean("ug_record_found", false)) ? 1 : 0;
        boolean z2 = keva.getBoolean("ug_should_show", false);
        Boolean boolLIZLLL = C1514430pVp.LIZLLL();
        int i2 = !zContains ? -1 : (i == 0 || z2) ? 1 : 0;
        int i3 = (z || i2 == 0) ? 1 : 0;
        boolean z3 = keva.getBoolean("consent_once_shown", false);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i3, "did_agree_prev");
        c2344009Gk.LIZJ(boolLIZLLL.booleanValue() ? 1 : 0, "is_first_install");
        c2344009Gk.LIZJ(z ? 1 : 0, "has_consent_backup");
        c2344009Gk.LIZJ(i2, "consent_api_result");
        c2344009Gk.LIZJ(i, "record_found");
        c2344009Gk.LIZJ(z3 ? 1 : 0, "consent_once_shown");
        C20684815ws.LJIILLIIL("consent_decision", c2344009Gk.LIZ);
        if (C1916140zxk.LIZ()) {
            if (i != 0) {
                boolean z4 = !z2;
                if (z4) {
                    LIZJ().LJIILIIL(EnumC1876780ywG.APPROVE, EnumC1915980zxU.NUJ_CONSENT, "approve_device_consent_server_skip", null);
                }
                return z4;
            }
            if (z) {
                LIZJ().LJIILIIL(EnumC1876780ywG.APPROVE, EnumC1915980zxU.NUJ_CONSENT, "approve_device_consent_backup_skip", null);
                return true;
            }
        }
        return false;
    }

    @InterfaceC1294060jmO
    public static int LIZIZ() {
        Keva keva = C1916120zxi.LJI;
        if (!keva.contains("consent_reason")) {
            keva.storeInt("consent_reason", C10EU.LJIIIIZZ() ? 2 : ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode() ? 3 : keva.getBoolean("is_consent_accepted", false) ? 6 : keva.getBoolean("user_logged_in_atleast_once", false) ? 4 : ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? 1 : LIZ() ? 11 : LIZLLL() ? 10 : !LIZLLL() ? 7 : 0);
        }
        return keva.getInt("consent_reason", 0);
    }

    public static IPNSDeviceConsentService LIZJ() {
        return C1916120zxi.LJ.getValue();
    }

    public static boolean LIZLLL() {
        Keva keva = C1916120zxi.LJI;
        if (!keva.contains("have_passed_consent")) {
            keva.storeBoolean("have_passed_consent", LIZ() && !C10EU.LJIIIIZZ());
        }
        return keva.getBoolean("have_passed_consent", false) || (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !C10EU.LJIIIIZZ());
    }
}
