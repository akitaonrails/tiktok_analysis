package X;

import android.util.LruCache;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.survey.FrequencyGroup;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.14aV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20291314aV {
    public static final C20291314aV LIZ = new C20291314aV();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20293014am());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C20293214ao());
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static final LruCache<String, Long> LJ = new LruCache<>(64);
    public static final C01GW LJFF = C452501pT.LIZIZ(new C20293514ar());
    public static final C01GW LJI = C452501pT.LIZIZ(new C20293314ap());
    public static final C20293414aq LJII = new C20293414aq("Frequency");
    public static final HashSet<String> LJIIIIZZ = new HashSet<>();

    public static boolean LIZ() {
        return ((Boolean) LJI.getValue()).booleanValue();
    }

    public static ISurveyDebuggerService LIZIZ() {
        return (ISurveyDebuggerService) LJFF.getValue();
    }

    public static Keva LIZLLL() {
        return (Keva) LIZIZ.getValue();
    }

    public static long LIZJ(String str) {
        LruCache<String, Long> lruCache = LJ;
        Long l = lruCache.get(str);
        if (l != null) {
            return l.longValue();
        }
        long j = LIZLLL().getLong(str, 0L);
        lruCache.put(str, Long.valueOf(j));
        return j;
    }

    public static String LJ(Aweme aweme) {
        String mainSurveyKey;
        String str;
        if (C14Z4.LIZ(aweme) == C14Z0.LIVE_TYPE) {
            str = "live";
        } else {
            if (aweme != null) {
                mainSurveyKey = AwemeExtKt.getMainSurveyKey(aweme);
            } else {
                mainSurveyKey = null;
            }
            if (C20292414ag.LIZJ(mainSurveyKey)) {
                str = "prompt_feedback";
            } else {
                str = "common";
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("short_internal_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJFF(C14ZG c14zg) {
        ISurveyDebuggerService iSurveyDebuggerServiceLIZIZ = LIZIZ();
        if (iSurveyDebuggerServiceLIZIZ != null) {
            iSurveyDebuggerServiceLIZIZ.isOpen();
        }
        Integer num = c14zg.LJIIIIZZ;
        if (num == null) {
            return false;
        }
        num.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("max_submit_times_");
        sbLIZ.append(c14zg.LIZ);
        if (LIZLLL().getInt(C2188811AlT.LIZIZ(sbLIZ), 0) < c14zg.LJIIIIZZ.intValue()) {
            return false;
        }
        return true;
    }

    public static boolean LJI(C14ZG c14zg) {
        ISurveyDebuggerService iSurveyDebuggerServiceLIZIZ = LIZIZ();
        if (iSurveyDebuggerServiceLIZIZ != null) {
            iSurveyDebuggerServiceLIZIZ.isOpen();
        }
        Integer num = c14zg.LJII;
        if (num == null) {
            return false;
        }
        num.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("max_unsubmitted_display_times_");
        sbLIZ.append(c14zg.LIZ);
        if (LIZLLL().getInt(C2188811AlT.LIZIZ(sbLIZ), 0) < c14zg.LJII.intValue()) {
            return false;
        }
        return true;
    }

    public static boolean LJII(String str) {
        HashSet<String> hashSet = LIZLLL;
        if (hashSet.contains(str)) {
            C20293414aq c20293414aq = LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("has submit: ");
            sbLIZ.append(hashSet);
            c20293414aq.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20291314aV.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static boolean LJIIIZ(String str) {
        boolean z;
        boolean z2;
        FeedSurveyConfig feedSurveyConfig;
        List<FrequencyGroup> list;
        boolean z3;
        ISurveyDebuggerService iSurveyDebuggerServiceLIZIZ = LIZIZ();
        if (iSurveyDebuggerServiceLIZIZ != null) {
            iSurveyDebuggerServiceLIZIZ.isOpen();
        }
        if (LIZJ(str) > System.currentTimeMillis()) {
            z = true;
        } else {
            z = false;
        }
        C1488870oqb.LIZ.getClass();
        C14ZW.LIZ.getClass();
        C14ZG c14zg = C14ZW.LIZIZ.get(str);
        if (c14zg != null && (feedSurveyConfig = c14zg.LJI) != null && (list = feedSurveyConfig.frequencyGroup) != null) {
            if (!list.isEmpty()) {
                for (FrequencyGroup frequencyGroup : list) {
                    C1488870oqb.LIZ.getClass();
                    if (!C1488870oqb.LIZ(frequencyGroup)) {
                        z3 = false;
                        break;
                    }
                }
                z3 = true;
                z2 = !z3;
            } else {
                z3 = true;
                z2 = !z3;
            }
        } else {
            z2 = false;
        }
        C20293414aq c20293414aq = LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[inFrequencyControl]: ");
        sbLIZ.append(z);
        sbLIZ.append(", long:");
        sbLIZ.append(z);
        c20293414aq.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if ((!z && !z2) || !LIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(FeedSurveyConfig feedSurveyConfig) {
        String str;
        boolean z;
        List<FrequencyGroup> list;
        boolean z2;
        FeedSurvey feedSurvey;
        if (feedSurveyConfig == null || (feedSurvey = feedSurveyConfig.fixedSurvey) == null || (str = feedSurvey.surveyKey) == null) {
            str = "";
        }
        boolean zLJIIJJI = LJIIJJI(str, "none");
        C1488870oqb.LIZ.getClass();
        if (feedSurveyConfig != null && (list = feedSurveyConfig.frequencyGroup) != null) {
            if (!list.isEmpty()) {
                for (FrequencyGroup frequencyGroup : list) {
                    C1488870oqb.LIZ.getClass();
                    if (!C1488870oqb.LIZ(frequencyGroup)) {
                        z2 = false;
                        break;
                    }
                }
                z2 = true;
                z = !z2;
            } else {
                z2 = true;
                z = !z2;
            }
        } else {
            z = false;
        }
        C20293414aq c20293414aq = LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[inFrequencyControl]: ");
        sbLIZ.append(zLJIIJJI);
        sbLIZ.append(", long:");
        sbLIZ.append(zLJIIJJI);
        c20293414aq.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if ((!zLJIIJJI && !z) || !LIZ()) {
            return false;
        }
        return true;
    }

    public static void LJIIL(String str) {
        LIZLLL.add(str);
        C20293414aq c20293414aq = LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("record submit: ");
        sbLIZ.append(str);
        c20293414aq.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIILJJIL(Aweme aweme) {
        String mainSurveyKey;
        String mainSurveyKey2;
        C1488870oqb.LIZ.getClass();
        C14ZW.LIZ.getClass();
        C1488870oqb.LIZIZ(C14ZW.LJI(aweme));
        C14ZG c14zgLJI = C14ZW.LJI(aweme);
        if (c14zgLJI == null) {
            return;
        }
        long j = c14zgLJI.LJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20291914ab.LIZ.getClass();
        C20291914ab.LIZIZ();
        String str = "";
        if (aweme == null || (mainSurveyKey = AwemeExtKt.getMainSurveyKey(aweme)) == null) {
            mainSurveyKey = "";
        }
        ((Keva) LIZJ.getValue()).storeLong(mainSurveyKey, System.currentTimeMillis());
        if (j != 0) {
            if (aweme != null && (mainSurveyKey2 = AwemeExtKt.getMainSurveyKey(aweme)) != null) {
                str = mainSurveyKey2;
            }
            String strLJ = LJ(aweme);
            C20293414aq c20293414aq = LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[setNextTime] longKey:");
            sbLIZ.append(str);
            sbLIZ.append(", shortKey:");
            sbLIZ.append(strLJ);
            c20293414aq.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), aweme);
            LJIILIIL((j * 1000) + jCurrentTimeMillis, str);
            LJIILIIL(jCurrentTimeMillis + 600000, strLJ);
            LJIILL(c14zgLJI.LJFF);
        }
    }

    public static void LJIILL(Map map) {
        if (map == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            C20293414aq c20293414aq = LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[setRelationNextTime] key:");
            sbLIZ.append(str);
            sbLIZ.append(", interval:");
            sbLIZ.append(jLongValue);
            c20293414aq.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            LIZ.getClass();
            LJIILIIL((jLongValue * 1000) + jCurrentTimeMillis, str);
        }
    }

    public static boolean LJIIJJI(String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        ISurveyDebuggerService iSurveyDebuggerServiceLIZIZ;
        ISurveyDebuggerService iSurveyDebuggerServiceLIZIZ2 = LIZIZ();
        if (iSurveyDebuggerServiceLIZIZ2 != null) {
            iSurveyDebuggerServiceLIZIZ2.isOpen();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLIZJ = LIZJ(str);
        if (jCurrentTimeMillis < jLIZJ) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = !z;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C01GW c01gw = LIZJ;
        if (jCurrentTimeMillis2 - ((Keva) c01gw.getValue()).getLong(str, 0L) > 1209600000) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = !z2;
        if (C1129404bM.LIZIZ.containsKey(str) && z5 && (iSurveyDebuggerServiceLIZIZ = LIZIZ()) != null) {
            iSurveyDebuggerServiceLIZIZ.isOpen();
            z3 = true;
        } else {
            z3 = false;
        }
        long j = ((Keva) c01gw.getValue()).getLong(str, 0L);
        C20291714aZ c20291714aZ = C20291714aZ.LIZ;
        C20292114ad c20292114ad = new C20292114ad(j, jLIZJ, z, str, str2);
        c20291714aZ.getClass();
        C20291714aZ.LIZIZ(c20292114ad);
        if (z4 && z5) {
            LJII.LJIIIZ("[inLongFrequencyControl] not inLongInterval, but shouldShowSurveyDoubleCheck == false");
            C20291714aZ.LIZIZ(new C20292014ac(str, str2, j, jLIZJ));
        }
        if (!z && !z3) {
            return false;
        }
        return true;
    }

    public static void LJIILIIL(long j, String str) {
        long jMax = Math.max(j, LIZJ(str));
        LIZLLL().storeLong(str, jMax);
        LJ.put(str, Long.valueOf(jMax));
    }
}
