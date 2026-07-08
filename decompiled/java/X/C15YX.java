package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourSettings;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15YX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15YX {
    public static SleepHourSettings LIZJ;
    public static final C15YX LIZ = new C15YX();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20539215Yo());
    public static long LIZLLL = -1;

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static SleepHourSettings LIZJ() {
        Object c098200Yq;
        if (LIZJ == null) {
            try {
                Keva kevaLIZ = LIZ();
                C20536115Xj.LIZ.getClass();
                String string = kevaLIZ.getString(C20536115Xj.LJI("sleep_hour_meditation_settings"), null);
                if (C1533950q1J.LJ(string)) {
                    C1227904rF.LIZ.getClass();
                    c098200Yq = (SleepHourSettings) C1227904rF.LIZIZ(string, SleepHourSettings.class);
                } else {
                    c098200Yq = new SleepHourSettings(true, 0L, 0, 0);
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            SleepHourSettings sleepHourSettings = new SleepHourSettings(true, 0L, 0, 0);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = sleepHourSettings;
            }
            LIZJ = (SleepHourSettings) c098200Yq;
        }
        return LIZJ;
    }

    public static long LIZLLL() {
        if (LIZLLL == -1) {
            C20536115Xj.LIZ.getClass();
            String strLJI = C20536115Xj.LJI("usage_in_sleep_hour");
            long j = LIZ().getLong(strLJI, -1L);
            if (j != -1) {
                LIZLLL = j;
            } else {
                long j2 = LIZ().getLong("usage_in_sleep_hour", 0L);
                LIZLLL = j2;
                if (j2 > 0 && !Intrinsics.LJFF(strLJI, "usage_in_sleep_hour")) {
                    LIZ().storeLong(strLJI, j2);
                    LIZ().erase("usage_in_sleep_hour");
                }
            }
        }
        return LIZLLL;
    }

    public static int LIZIZ() {
        int iLJ = LJ();
        Keva kevaLIZ = LIZ();
        C20536115Xj.LIZ.getClass();
        int i = kevaLIZ.getInt(C20536115Xj.LJI("sleep_hour_daily_cadence_day"), 0);
        int i2 = LIZ().getInt(C20536115Xj.LJI("sleep_hour_daily_cadence_count"), 0);
        if (i == iLJ) {
            return i2;
        }
        return 0;
    }

    public static int LJ() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(1) * 10000) + ((calendar.get(2) + 1) * 100) + calendar.get(5);
    }

    public static void LJFF(SleepHourSettings sleepHourSettings) {
        if (Intrinsics.LJFF(LIZJ, sleepHourSettings)) {
            return;
        }
        LIZJ = sleepHourSettings;
        if (sleepHourSettings == null) {
            Keva kevaLIZ = LIZ();
            C20536115Xj.LIZ.getClass();
            kevaLIZ.erase(C20536115Xj.LJI("sleep_hour_meditation_settings"));
        } else {
            Keva kevaLIZ2 = LIZ();
            C20536115Xj.LIZ.getClass();
            String strLJI = C20536115Xj.LJI("sleep_hour_meditation_settings");
            C1227904rF.LIZ.getClass();
            kevaLIZ2.storeString(strLJI, C1227904rF.LJI(sleepHourSettings));
        }
    }

    public static void LJI(long j) {
        if (j != LIZLLL) {
            LIZLLL = j;
            Keva kevaLIZ = LIZ();
            C20536115Xj.LIZ.getClass();
            kevaLIZ.storeLong(C20536115Xj.LJI("usage_in_sleep_hour"), j);
        }
    }
}
