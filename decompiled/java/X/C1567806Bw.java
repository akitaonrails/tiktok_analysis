package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1567806Bw {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(557));

    public static final long LJI() {
        return System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static final long LIZ(StreakData streakData) {
        C06FO.LIZ.getClass();
        return streakData.endAt * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static final int LIZIZ(String str) {
        if (str.length() != 0 && !a0.LJJIIZI(str, ":", false)) {
            return AbstractC1711506n3.LIZIZ;
        }
        return AbstractC1711506n3.LIZ;
    }

    public static final C06G4 LIZJ(String str) {
        if (LIZIZ(str) == AbstractC1711506n3.LIZ) {
            return C06G4.USER;
        }
        return C06G4.CONVERSATION;
    }

    public static final boolean LIZLLL(StreakData streakData) {
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC1579606Gk.ACTIVE, EnumC1579606Gk.SECONDARY_ACTIVE);
        if (streakData != null) {
            enumC1579606GkLJIIIIZZ = LJIIIIZZ(streakData, false);
        } else {
            enumC1579606GkLJIIIIZZ = null;
        }
        return C13LP.LJJJJ(enumC1579606GkLJIIIIZZ, listLJIIJJI);
    }

    public static final boolean LJ(StreakData streakData) {
        long jLJI = LJI();
        if (streakData.remainRestoreCnt <= 0 || streakData.restoreAvailableTime < jLJI || C1697810uHb.LJIIJJI(EnumC1579606Gk.ACTIVE, EnumC1579606Gk.SECONDARY_ACTIVE).contains(C06FO.LIZIZ(C06FO.LIZ, streakData, 30))) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(StreakData streakData) {
        if (!LIZLLL(streakData) && !LJ(streakData)) {
            return false;
        }
        return true;
    }

    public static final int LJII(StreakData streakData) {
        Integer num = streakData.level;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final EnumC1579606Gk LJIIIIZZ(StreakData streakData, boolean z) {
        return C06FO.LIZIZ(C06FO.LIZ, streakData, 28);
    }
}
