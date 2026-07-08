package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06FO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06FO {
    public static final C06FO LIZ = new C06FO();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1318));

    public static long LIZ(StreakData streakData) {
        int i = C06FP.LIZ[C1567806Bw.LJIIIIZZ(streakData, false).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new C1954807lC();
                }
                return 0L;
            }
            return streakData.endAt;
        }
        return streakData.activeBefore;
    }

    public static EnumC1579606Gk LIZIZ(C06FO c06fo, StreakData streakData, int i) {
        C06FN c06fn;
        if ((i & 4) != 0) {
            new C06FQ(LIZ);
        }
        if ((i & 8) != 0) {
            c06fn = C06FN.LL;
        } else {
            c06fn = null;
        }
        if ((i & 16) != 0) {
            new C1564706Ar(LIZ);
        }
        c06fo.getClass();
        LIZ.getClass();
        if (streakData.streak != 0 && streakData.userStreak != null) {
            long jLongValue = ((Number) c06fn.invoke()).longValue();
            if (jLongValue >= streakData.endAt) {
                return EnumC1579606Gk.EXPIRED;
            }
            if (jLongValue >= streakData.activeBefore) {
                return EnumC1579606Gk.SECONDARY_ACTIVE;
            }
            if (streakData.activeStart <= jLongValue) {
                return EnumC1579606Gk.ACTIVE;
            }
            return EnumC1579606Gk.INVALID;
        }
        return EnumC1579606Gk.INVALID;
    }

    public static C354710DvR LIZJ(String str, int i, Function0 function0) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(str));
        long jLongValue = ((Number) function0.invoke()).longValue();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        calendar.setTimeInMillis(jLongValue * j);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        calendar.add(5, i);
        long timeInMillis = calendar.getTimeInMillis() / j;
        calendar.add(5, 1);
        return new C354710DvR(timeInMillis, calendar.getTimeInMillis() / j);
    }
}
