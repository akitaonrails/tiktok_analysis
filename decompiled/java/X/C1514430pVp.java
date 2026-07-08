package X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514430pVp {
    public static volatile Boolean LIZ;
    public static C0N1G LIZIZ;
    public static final Object LIZJ = new Object();
    public static boolean LIZLLL = false;
    public static EnumC1584370rKd LJ = EnumC1584370rKd.FEED;
    public static long LJFF = -1;

    public static long LIZ() {
        return Keva.getRepo("repo_new_version_journey").getLong("key_first_launch_time", 0L);
    }

    public static String LIZJ() {
        return LJ.name();
    }

    public static Boolean LIZLLL() {
        Boolean bool;
        synchronized (LIZJ) {
            try {
                if (LIZ == null) {
                    LJ();
                }
                bool = LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return bool;
    }

    public static boolean LJ() {
        C844470XAv.LIZ.getClass();
        if (C844470XAv.LIZ() == null) {
            return false;
        }
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "prefs_feed_check");
        boolean z = sharedPreferencesLIZJ.getBoolean("key_first_launch", true);
        if (LIZ == null) {
            LIZ = Boolean.valueOf(z);
        }
        if (LIZ.booleanValue()) {
            Keva.getRepo("repo_story_cold_start").storeBoolean("key_new_user", true);
        }
        sharedPreferencesLIZJ.edit().putBoolean("key_first_launch", false).apply();
        Keva repo = Keva.getRepo("repo_new_version_journey");
        if (repo.getLong("key_first_launch_time", 0L) == 0) {
            repo.storeLong("key_first_launch_time", System.currentTimeMillis());
        }
        C1150504el.LIZ().LJIJJLI = LIZ.booleanValue();
        return LIZ.booleanValue();
    }

    public static String LIZIZ() {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            return activityLJFF.getClass().getSimpleName();
        }
        return null;
    }

    public static void LJFF(EnumC1584370rKd enumC1584370rKd) {
        LJ = enumC1584370rKd;
        C0N1G c0n1g = LIZIZ;
        if (c0n1g != null) {
            c0n1g.getClass();
            if (C0N1E.LIZ && EnumC1584370rKd.FEED != enumC1584370rKd) {
                C0N1E.LIZIZ("2", null);
            }
        }
    }
}
