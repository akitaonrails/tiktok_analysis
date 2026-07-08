package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Spo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733420Spo {
    public static boolean LJFF() {
        int iLJ = 7;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("new_share_guide_daily_flip_limit", 7);
            if (iLJ < 0) {
                iLJ = Integer.MAX_VALUE;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZIZ();
        return C1238740iLA.LIZIZ().LIZ(0, "share_guide_show_times") < iLJ;
    }

    public static void LIZ() {
        int iLIZ = C1387310mCn.LIZ(System.currentTimeMillis());
        if (Keva.getRepo("coin_incentive_share_guide_keva").getInt("coin_incentive_share__guide_date_day", -1) != iLIZ) {
            Keva.getRepo("coin_incentive_share_guide_keva").storeInt("coin_incentive_share__guide_date_day", iLIZ);
            Keva.getRepo("coin_incentive_share_guide_keva").storeInt("coin_incentive_share_guide_show_times", 0);
        }
    }

    public static void LIZIZ() {
        int iLIZ = C1387310mCn.LIZ(System.currentTimeMillis());
        C19633311rf c19633311rfLIZIZ = C1238740iLA.LIZIZ();
        if (c19633311rfLIZIZ.LIZ(-1, "share_guide_date_day") != iLIZ) {
            c19633311rfLIZIZ.LJ("share_guide_date_day", iLIZ);
            c19633311rfLIZIZ.LJ("share_guide_show_times", 0);
        }
    }

    public static String LIZJ() {
        return C1238740iLA.LIZIZ().LIZIZ("last_share_type", "");
    }

    public static void LIZLLL(String str) {
        C1238740iLA.LIZIZ().LJFF("last_share_type", str);
    }

    public static boolean LJ(Boolean bool) {
        if (bool.booleanValue()) {
            return true;
        }
        int iLJ = 7;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("new_share_guide_daily_flip_limit", 7);
            if (iLJ < 0) {
                iLJ = Integer.MAX_VALUE;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ();
        if (Keva.getRepo("coin_incentive_share_guide_keva").getInt("coin_incentive_share_guide_show_times", 0) < iLJ) {
            return true;
        }
        return false;
    }
}
