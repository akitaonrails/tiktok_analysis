package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1BYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206741BYi {
    public static int LJ;
    public static final C2206741BYi LIZ = new C2206741BYi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2206731BYh());
    public static boolean LIZJ = true;
    public static final ConcurrentHashMap<String, Long> LIZLLL = new ConcurrentHashMap<>();
    public static final C01GW LJFF = C452501pT.LIZIZ(new C2206771BYl());
    public static final C01GW LJI = C452501pT.LIZIZ(new C0CGP());

    public static boolean LIZJ() {
        try {
            if (C1387260mCi.LIZ().iterationPeriods <= 0) {
                return false;
            }
            C1E95 c1e95 = C1E95.LIZIZ;
            return !c1e95.LJIIZILJ() && c1e95.LJJIIJZLJL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static C2206761BYk LIZ() {
        return (C2206761BYk) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        if (!LIZJ()) {
            return false;
        }
        long j = C1387260mCi.LIZ().iterationPeriods;
        long jLIZLLL = C2206721BYg.LIZLLL();
        if (jLIZLLL == 0 || j == 0 || LIZLLL() || (System.currentTimeMillis() - jLIZLLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < j) {
            return false;
        }
        int i = Calendar.getInstance().get(11);
        if (i == 0) {
            i = 24;
        }
        int i2 = i - 1;
        if (C2206721BYg.LIZIZ().size() >= i2 && C2206721BYg.LIZ().size() >= i2) {
            try {
                int i3 = CastIntegerProtector.parseInt((String) C2206721BYg.LIZIZ().get(i2));
                double d = CastDoubleProtector.parseDouble((String) C2206721BYg.LIZ().get(i2));
                if (i3 < C1387260mCi.LIZ().effectivePlayCount) {
                    return false;
                }
                int i4 = C1387260mCi.LIZ().adjustDirection;
                double dLJIIIIZZ = C2179771ASp.LJIIIIZZ();
                if (d >= 0.0d && d <= 1.0d) {
                    if (i4 == 1) {
                        return d < dLJIIIIZZ && d <= ((double) ((Number) LJI.getValue()).floatValue());
                    }
                    if (i4 == 2 && d != dLJIIIIZZ) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static boolean LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = C1387260mCi.LIZ().resetIntervalSeconds;
        long jLIZLLL = C2206721BYg.LIZLLL();
        return j > 0 && jLIZLLL != 0 && (jCurrentTimeMillis - jLIZLLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) > j;
    }

    public static void LJ() {
        if (LIZ() == null) {
            return;
        }
        LIZ().LIZ = System.currentTimeMillis();
        Collections.fill(LIZ().LIZIZ, CardStruct.IStatusCode.DEFAULT);
        Collections.fill(LIZ().LIZJ, "-1");
        Collections.fill(LIZ().LIZLLL, CardStruct.IStatusCode.DEFAULT);
        Collections.fill(LIZ().LJ, "-1");
        C2206721BYg.LJ(LIZ().LIZ);
        LJI(LIZ());
    }

    public static void LJFF() {
        long jLIZLLL = C2206721BYg.LIZLLL();
        long j = C1387260mCi.LIZ().iterationPeriods;
        if (j <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jLIZLLL == 0) {
            LIZ().LIZ = jCurrentTimeMillis;
            C2206721BYg.LJ(LIZ().LIZ);
            return;
        }
        long j2 = jCurrentTimeMillis - jLIZLLL;
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        if (j2 / j3 >= ((long) 2) * j) {
            long j4 = jCurrentTimeMillis - (j * j3);
            if (j4 > 1000000000000L) {
                LIZ().LIZ = j4;
                C2206721BYg.LJ(j4);
            }
        }
    }

    public static void LJI(C2206761BYk c2206761BYk) {
        int i = C1387260mCi.LIZ().saveDataInterval;
        int i2 = LJ;
        LJ = i2 + 1;
        if (i2 % i == 0) {
            C2206721BYg.LIZJ().storeStringArray("phase1NPV", (String[]) c2206761BYk.LIZIZ.toArray(new String[0]));
            C2206721BYg.LIZJ().storeStringArray("phase1AvgVol", (String[]) c2206761BYk.LIZJ.toArray(new String[0]));
            C2206721BYg.LIZJ().storeStringArray("phase2NPV", (String[]) c2206761BYk.LIZLLL.toArray(new String[0]));
            C2206721BYg.LIZJ().storeStringArray("phase2AvgVol", (String[]) c2206761BYk.LJ.toArray(new String[0]));
        }
    }

    public static void LJII(double d, int i) {
        if (i >= 0 && i <= 24) {
            try {
                int i2 = CastIntegerProtector.parseInt(LIZ().LIZIZ.get(i));
                double d2 = CastDoubleProtector.parseDouble(LIZ().LIZJ.get(i));
                int i3 = i2 + 1;
                ListProtector.set(LIZ().LIZIZ, i, String.valueOf(i3));
                if (d2 == -1.0d) {
                    ListProtector.set(LIZ().LIZJ, i, String.valueOf(d));
                } else {
                    ListProtector.set(LIZ().LIZJ, i, C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((((double) i2) * d2) + d) / ((double) i3))}, 1)));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJIIIIZZ(double d, int i) {
        if (i >= 0 && i <= 24) {
            try {
                int i2 = CastIntegerProtector.parseInt(LIZ().LIZLLL.get(i));
                double d2 = CastDoubleProtector.parseDouble(LIZ().LJ.get(i));
                int i3 = i2 + 1;
                ListProtector.set(LIZ().LIZLLL, i, String.valueOf(i3));
                if (d2 == -1.0d) {
                    ListProtector.set(LIZ().LJ, i, String.valueOf(d));
                } else {
                    ListProtector.set(LIZ().LJ, i, C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((((double) i2) * d2) + d) / ((double) i3))}, 1)));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
