package X;

import com.bytedance.keva.Keva;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Bqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217581Bqm {
    public static final C08CX LIZIZ = C08CX.INSTANCE;
    public static final C01GW<C2217581Bqm> LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(270));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(271));

    public final Keva LIZ() {
        return (Keva) this.LIZ.getValue();
    }

    public final int LIZIZ(String str) {
        int i = LIZ().getInt(C2217591Bqn.LJII(str), 0);
        if (i == 0) {
            return C2217591Bqn.LIZ().uidDailyMaxExposureLevel1;
        }
        return i;
    }

    public final void LIZJ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LIZ().getLong(C786410Ut5.j4("uid_%s_last_daily_reset_time", Arrays.copyOf(new Object[]{str}, 1)), 0L);
        if (jCurrentTimeMillis - j >= C2217591Bqn.LIZ().intervalMs || j == 0) {
            int i = LIZ().getInt(C2217591Bqn.LJIIIIZZ(str), 0) + 1;
            int iLIZIZ = LIZIZ(str);
            if (iLIZIZ == C2217591Bqn.LIZ().uidDailyMaxExposureLevel1 && i >= C2217591Bqn.LIZ().uidDailyMaxExposureLevel1) {
                LIZ().storeInt(C2217591Bqn.LJII(str), C2217591Bqn.LIZ().uidDailyMaxExposureLevel2);
                LIZ().storeInt(C2217591Bqn.LJIIIIZZ(str), 0);
            } else if (iLIZIZ == C2217591Bqn.LIZ().uidDailyMaxExposureLevel2 && i >= C2217591Bqn.LIZ().uidDailyMaxExposureLevel2) {
                LIZ().storeInt(C2217591Bqn.LJII(str), C2217591Bqn.LIZ().uidDailyMaxExposureLevel3);
                LIZ().storeInt(C2217591Bqn.LJIIIIZZ(str), 0);
            }
            LIZ().storeLong(C786410Ut5.j4("uid_%s_last_daily_reset_time", Arrays.copyOf(new Object[]{str}, 1)), jCurrentTimeMillis);
            LIZ().storeInt(C2217591Bqn.LJI(str), 0);
            LIZ().storeInt(C2217591Bqn.LJIIIIZZ(str), 0);
        }
    }

    public final void LIZLLL(String str, String str2) {
        LIZ().storeBoolean(C2217591Bqn.LIZLLL(str, str2), true);
        int i = LIZ().getInt(C2217591Bqn.LJ(str), 0) + 1;
        LIZ().storeInt(C2217591Bqn.LJ(str), i);
        if (i >= C2217591Bqn.LIZ().consecutiveItemExitThreshold) {
            LIZ().storeBoolean(C786410Ut5.j4("uid_%s_is_permanently_exited", Arrays.copyOf(new Object[]{str}, 1)), true);
        }
    }
}
