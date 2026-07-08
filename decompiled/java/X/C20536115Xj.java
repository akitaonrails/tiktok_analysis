package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingMissionStatus;
import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHoursAdditionalSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepStreakStatus;
import com.ss.android.ugc.aweme.compliance.api.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20536115Xj {
    public static final C20536115Xj LIZ = new C20536115Xj();
    public static final Keva LIZIZ = Keva.getRepo("protection_repo_cache");
    public static SleepHourConfigSettings LIZJ;
    public static UserDetailsInfoBean LIZLLL;
    public static DoNotDisturbSettings LJ;
    public static DoNotDisturbSettings LJFF;
    public static List<ScreenTimeManagementDaySetting> LJI;
    public static SleepHoursAdditionalSettings LJII;
    public static DigitalWellbeingMissionStatus LJIIIIZZ;

    static {
        if (C297270Bkz.LIZ()) {
            IPNSProtectionDataLayerServiceFactory iPNSProtectionDataLayerServiceFactory = (IPNSProtectionDataLayerServiceFactory) PluggableExtentionKt.pluggableSpi$default(IPNSProtectionDataLayerServiceFactory.class, false, false, false, 14, null);
            C15Y9 c15y9LIZJ = iPNSProtectionDataLayerServiceFactory != null ? iPNSProtectionDataLayerServiceFactory.LIZJ() : null;
            C817503Hh c817503Hh = C817503Hh.LL;
            C2238608ps c2238608ps = C2107508Nl.LIZ;
            C23250099c.LIZLLL(c817503Hh, c2238608ps, null, new C20535915Xh(c15y9LIZJ, null), 2);
            C23250099c.LIZLLL(c817503Hh, c2238608ps, null, new C15XZ(c15y9LIZJ, null), 2);
            C23250099c.LIZLLL(c817503Hh, c2238608ps, null, new C20535315Xb(c15y9LIZJ, null), 2);
            C23250099c.LIZLLL(c817503Hh, c2238608ps, null, new C20535515Xd(c15y9LIZJ, null), 2);
            C23250099c.LIZLLL(c817503Hh, c2238608ps, null, new C15XJ(c15y9LIZJ, null), 2);
            C23250099c.LIZLLL(c817503Hh, c2238608ps, null, new C20535715Xf(c15y9LIZJ, null), 2);
            C23250099c.LIZLLL(c817503Hh, c2238608ps, null, new C15XH(c15y9LIZJ, null), 2);
            C23250099c.LIZLLL(c817503Hh, c2238608ps, null, new C15XW(c15y9LIZJ, null), 2);
        }
    }

    public static DoNotDisturbSettings LIZ() {
        if (LJ == null) {
            try {
                LJ = (DoNotDisturbSettings) C08JS.LIZ(LIZIZ.getString(LJI("do_not_disturb_settings"), null), DoNotDisturbSettings.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJ = new DoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0);
            }
        }
        return LJ;
    }

    public static DigitalWellbeingMissionStatus LIZIZ() {
        if (LJIIIIZZ == null) {
            String string = LIZIZ.getString(LJI("dw_missions_status"), null);
            try {
                C1227904rF.LIZ.getClass();
                LJIIIIZZ = (DigitalWellbeingMissionStatus) C1227904rF.LIZIZ(string, DigitalWellbeingMissionStatus.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIIIIZZ = new DigitalWellbeingMissionStatus(new SleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE);
            }
        }
        return LJIIIIZZ;
    }

    public static List LIZJ() {
        if (LJI == null) {
            try {
                LJI = C13LQ.LJJLL((Object[]) C7740030o.LIZ().getGson().LJII(LIZIZ.getString(LJI("screen_time_management_week_settings"), null), ScreenTimeManagementDaySetting[].class));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LJI;
    }

    public static SleepHourConfigSettings LIZLLL() {
        if (LIZJ == null) {
            try {
                LIZJ = (SleepHourConfigSettings) C08JS.LIZ(LIZIZ.getString(LJI("night_screen_time_status"), null), SleepHourConfigSettings.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZJ;
    }

    public static SleepHoursAdditionalSettings LJ() {
        if (LJII == null) {
            try {
                LJII = (SleepHoursAdditionalSettings) C08JS.LIZ(LIZIZ.getString(LJI("sleep_hour_settings"), null), SleepHoursAdditionalSettings.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJII = new SleepHoursAdditionalSettings(0L, 0L, 0, 0, "");
            }
        }
        return LJII;
    }

    public static DoNotDisturbSettings LJFF() {
        if (LJFF == null) {
            try {
                LJFF = (DoNotDisturbSettings) C08JS.LIZ(LIZIZ.getString(LJI("system_mute_settings"), null), DoNotDisturbSettings.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJFF = new DoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0);
            }
        }
        return LJFF;
    }

    public static UserDetailsInfoBean LJII() {
        if (LIZLLL == null) {
            try {
                LIZLLL = (UserDetailsInfoBean) C08JS.LIZ(LIZIZ.getString(LJI("user_detail_info"), ""), UserDetailsInfoBean.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZLLL;
    }

    public static String LJI(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId != null && curUserId.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(curUserId);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LJIIIIZZ(DoNotDisturbSettings doNotDisturbSettings) {
        LJ = doNotDisturbSettings;
        if (doNotDisturbSettings == null) {
            LIZIZ.erase(LJI("do_not_disturb_settings"));
        } else {
            LIZIZ.storeString(LJI("do_not_disturb_settings"), C08JS.LIZLLL(doNotDisturbSettings));
        }
    }

    public static void LJIIIZ(DigitalWellbeingMissionStatus digitalWellbeingMissionStatus) {
        LJIIIIZZ = digitalWellbeingMissionStatus;
        if (digitalWellbeingMissionStatus == null) {
            LIZIZ.erase(LJI("dw_missions_status"));
            return;
        }
        Keva keva = LIZIZ;
        String strLJI = LJI("dw_missions_status");
        C1227904rF.LIZ.getClass();
        keva.storeString(strLJI, C1227904rF.LJI(digitalWellbeingMissionStatus));
    }

    public static void LJIIJ(List list) {
        LJI = list;
        if (list == null) {
            LIZIZ.erase(LJI("screen_time_management_week_settings"));
        } else {
            LIZIZ.storeString(LJI("screen_time_management_week_settings"), C08JS.LIZLLL(list));
        }
    }

    public static void LJIIJJI(SleepHourConfigSettings sleepHourConfigSettings) {
        LIZJ = sleepHourConfigSettings;
        if (sleepHourConfigSettings == null) {
            LIZIZ.erase(LJI("night_screen_time_status"));
        } else {
            LIZIZ.storeString(LJI("night_screen_time_status"), C08JS.LIZLLL(sleepHourConfigSettings));
        }
    }

    public static void LJIIL(SleepHoursAdditionalSettings sleepHoursAdditionalSettings) {
        LJII = sleepHoursAdditionalSettings;
        if (sleepHoursAdditionalSettings == null) {
            LIZIZ.erase(LJI("sleep_hour_settings"));
        } else {
            LIZIZ.storeString(LJI("sleep_hour_settings"), C08JS.LIZLLL(sleepHoursAdditionalSettings));
        }
    }

    public static void LJIILIIL(DoNotDisturbSettings doNotDisturbSettings) {
        LJFF = doNotDisturbSettings;
        if (doNotDisturbSettings == null) {
            LIZIZ.erase(LJI("system_mute_settings"));
        } else {
            LIZIZ.storeString(LJI("system_mute_settings"), C08JS.LIZLLL(doNotDisturbSettings));
        }
    }

    public static void LJIILJJIL(UserDetailsInfoBean userDetailsInfoBean) {
        if (Intrinsics.LJFF(userDetailsInfoBean, LIZLLL)) {
            return;
        }
        LIZLLL = userDetailsInfoBean;
        if (userDetailsInfoBean == null) {
            LIZIZ.erase(LJI("user_detail_info"));
        } else {
            LIZIZ.storeString(LJI("user_detail_info"), C08JS.LIZLLL(userDetailsInfoBean));
        }
    }
}
