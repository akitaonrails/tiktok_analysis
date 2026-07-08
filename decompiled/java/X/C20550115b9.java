package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertCardTypeFreqFixConfig;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertConfig;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15b9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20550115b9 {
    public static final C20550115b9 LIZ = new C20550115b9();
    public static String LIZIZ = C0XQ7.LJFF().getCurUserId();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0TS8());
    public static final ConcurrentHashSet<String> LIZLLL = new ConcurrentHashSet<>();
    public static final C01GW LJ = C452501pT.LIZIZ(new C20550315bB());

    public static Map LIZLLL() {
        return (Map) LIZJ.getValue();
    }

    public static Keva LJII() {
        return (Keva) LJ.getValue();
    }

    public static String LJIIJJI() {
        if (TextUtils.isEmpty(LIZIZ) || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, LIZIZ)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('_');
        sbLIZ.append(LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(int i) {
        int iLLLLL = C1ER1.LIZIZ.LLLLL(i);
        String strLJ = LJ(iLLLLL, "shown_dislike_times_");
        int iLIZJ = LIZJ(iLLLLL) + 1;
        LJII().storeInt(strLJ, iLIZJ);
        LIZLLL().put(strLJ, Integer.valueOf(iLIZJ));
    }

    public static int LIZIZ(int i) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_cool_down_client_");
        if (LIZLLL().containsKey(strLJ) && (LIZLLL().get(strLJ) instanceof Integer)) {
            return ((Integer) LIZLLL().get(strLJ)).intValue();
        }
        int i2 = LJII().getInt(strLJ, -1);
        LIZLLL().put(strLJ, Integer.valueOf(i2));
        return i2;
    }

    public static int LIZJ(int i) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_dislike_times_");
        if (LIZLLL().containsKey(strLJ) && (LIZLLL().get(strLJ) instanceof Integer)) {
            return ((Integer) LIZLLL().get(strLJ)).intValue();
        }
        int i2 = LJII().getInt(strLJ, 0);
        LIZLLL().put(strLJ, Integer.valueOf(i2));
        return i2;
    }

    public static long LJFF(int i) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_cool_down_server_");
        if (LIZLLL().containsKey(strLJ) && (LIZLLL().get(strLJ) instanceof Long)) {
            return ((Long) LIZLLL().get(strLJ)).longValue();
        }
        long j = LJII().getLong(strLJ, 0L);
        LIZLLL().put(strLJ, Long.valueOf(j));
        return j;
    }

    public static int LJI(int i) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "left_show_count_");
        if (LIZLLL().containsKey(strLJ) && (LIZLLL().get(strLJ) instanceof Integer)) {
            return ((Integer) LIZLLL().get(strLJ)).intValue();
        }
        int i2 = LJII().getInt(strLJ, 0);
        LIZLLL().put(strLJ, Integer.valueOf(i2));
        return i2;
    }

    public static int LJIIIIZZ(int i) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_flow_index_");
        if (LIZLLL().containsKey(strLJ) && (LIZLLL().get(strLJ) instanceof Integer)) {
            return ((Integer) LIZLLL().get(strLJ)).intValue();
        }
        return 0;
    }

    public static long LJIIIZ(int i) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_millis_");
        if (LIZLLL().containsKey(strLJ) && (LIZLLL().get(strLJ) instanceof Long)) {
            return ((Long) LIZLLL().get(strLJ)).longValue();
        }
        long j = LJII().getLong(strLJ, 0L);
        LIZLLL().put(strLJ, Long.valueOf(j));
        return j;
    }

    public static int LJIIJ(int i) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_skip_times_");
        if (LIZLLL().containsKey(strLJ) && (LIZLLL().get(strLJ) instanceof Integer)) {
            return ((Integer) LIZLLL().get(strLJ)).intValue();
        }
        int i2 = LJII().getInt(strLJ, 0);
        LIZLLL().put(strLJ, Integer.valueOf(i2));
        return i2;
    }

    public static void LJIILIIL(int i) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_skip_times_");
        LJII().storeInt(strLJ, 0);
        LIZLLL().put(strLJ, 0);
    }

    public static String LJ(int i, String str) {
        Map<Integer, CardShowInfo> map;
        CardShowInfo cardShowInfo;
        String strLJIIJJI = "";
        if (C1867050ygZ.LIZ()) {
            Integer numValueOf = Integer.valueOf(i);
            FeedCardInsertConfig feedCardInsertConfigLIZ = C20551415bM.LIZ();
            Boolean boolValueOf = null;
            if (feedCardInsertConfigLIZ != null && (map = feedCardInsertConfigLIZ.cardInfo) != null && (cardShowInfo = map.get(numValueOf)) != null) {
                boolValueOf = Boolean.valueOf(cardShowInfo.isUidFrequency);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(i);
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                strLJIIJJI = LJIIJJI();
            }
            sbLIZ.append(strLJIIJJI);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(i);
        if (C20681215wI.LIZ.contains(Integer.valueOf(i))) {
            strLJIIJJI = LJIIJJI();
        }
        sbLIZ2.append(strLJIIJJI);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJIILJJIL(int i, int i2) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_cool_down_client_");
        LJII().storeInt(strLJ, i2);
        LIZLLL().put(strLJ, Integer.valueOf(i2));
    }

    public static void LJIILL(int i, int i2) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "left_show_count_");
        LJII().storeInt(strLJ, i2);
        LIZLLL().put(strLJ, Integer.valueOf(i2));
    }

    public static void LJIILLIIL(int i, long j) {
        String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_millis_");
        LJII().storeLong(strLJ, j);
        LIZLLL().put(strLJ, Long.valueOf(j));
    }

    public static void LJIJ(C20550215bA c20550215bA, String str) {
        if (c20550215bA == null) {
            return;
        }
        if (str != null) {
            ConcurrentHashSet<String> concurrentHashSet = LIZLLL;
            if (concurrentHashSet.contains(str)) {
                return;
            } else {
                concurrentHashSet.add(str);
            }
        }
        LJIIZILJ(c20550215bA.LIZ, c20550215bA.LIZIZ, c20550215bA.LIZJ, c20550215bA.LIZLLL);
    }

    public static void LJIIZILJ(int i, int i2, CardShowInfo cardShowInfo, CardInsertResultInfo cardInsertResultInfo) {
        int i3;
        if (cardShowInfo != null && cardInsertResultInfo != null && i == cardInsertResultInfo.cardType && cardInsertResultInfo.cardInsertStatus == 20000) {
            int i4 = cardShowInfo.intervalMaxShowCount;
            if (i4 > 1) {
                if (i2 > 1) {
                    i3 = i2 - 1;
                } else {
                    i3 = 1;
                }
                LIZLLL().put(LJ(C1ER1.LIZIZ.LLLLL(i), "shown_flow_index_"), Integer.valueOf(i3));
                int iLJI = LJI(i);
                if (iLJI == i4) {
                    LJIILLIIL(i, System.currentTimeMillis());
                }
                LJIILL(i, iLJI - 1);
            } else {
                LJIILLIIL(i, System.currentTimeMillis());
            }
            if (C1867050ygZ.LIZ()) {
                C1ER1 c1er1 = C1ER1.LIZIZ;
                String strLJ = LJ(c1er1.LLLLL(i), "shown_cool_down_server_");
                long jCurrentTimeMillis = System.currentTimeMillis();
                LJII().storeLong(strLJ, jCurrentTimeMillis);
                LIZLLL().put(strLJ, Long.valueOf(jCurrentTimeMillis));
                int iLLLLL = c1er1.LLLLL(i);
                String strLJ2 = LJ(iLLLLL, "shown_skip_times_");
                int iLJIIJ = LJIIJ(iLLLLL) + 1;
                LJII().storeInt(strLJ2, iLJIIJ);
                LIZLLL().put(strLJ2, Integer.valueOf(iLJIIJ));
            }
        }
    }

    public static EnumC20550015b8 LJIIL(C0TRR c0trr, int i, Integer num, CardShowInfo cardShowInfo, CardInsertResultInfo cardInsertResultInfo) {
        boolean z;
        Map<Integer, CardShowInfo> map;
        CardShowInfo cardShowInfo2;
        if (cardShowInfo == null) {
            return EnumC20550015b8.STATE_FREQ_PARAM_INVALID;
        }
        if (c0trr != null) {
            C01GW c01gw = C20550415bC.LIZIZ;
            if (((FeedCardInsertCardTypeFreqFixConfig) c01gw.getValue()).enable && c0trr.LIZIZ() == 0 && !((FeedCardInsertCardTypeFreqFixConfig) c01gw.getValue()).whitelist.contains(Integer.valueOf(i))) {
                if (i > 0) {
                    c0trr.LIZIZ.add(Integer.valueOf(i));
                }
            } else {
                c0trr.LIZ = false;
            }
        }
        if (cardInsertResultInfo != null && ((cardInsertResultInfo.cardInsertStatus == 30001 || cardInsertResultInfo.cardInsertStatus == 40000 || cardInsertResultInfo.cardInsertStatus == 40002) && cardShowInfo.LIZ)) {
            return EnumC20550015b8.STATE_FREQ_SUCCESS;
        }
        long j = ((long) cardShowInfo.timeInterval) * 3600000;
        int i2 = cardShowInfo.intervalMaxShowCount;
        int i3 = cardShowInfo.negativeSkipMaxTime;
        int i4 = cardShowInfo.negativeDislikeMaxTimes;
        int i5 = cardShowInfo.negativeTimeInterval;
        if (C1867050ygZ.LIZ()) {
            Integer numValueOf = Integer.valueOf(i);
            FeedCardInsertConfig feedCardInsertConfigLIZ = C20551415bM.LIZ();
            Boolean boolValueOf = null;
            if (feedCardInsertConfigLIZ != null && (map = feedCardInsertConfigLIZ.cardInfo) != null && (cardShowInfo2 = map.get(numValueOf)) != null) {
                boolValueOf = Boolean.valueOf(cardShowInfo2.isAvoidBackupFrequency);
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && num != null) {
                int iLJIIIIZZ = LJIIIIZZ(i);
                if (cardShowInfo.flowIndex == num.intValue() || (iLJIIIIZZ >= 0 && num.intValue() - iLJIIIIZZ >= cardShowInfo.flowInterval)) {
                    return EnumC20550015b8.STATE_FREQ_SUCCESS;
                }
                return EnumC20550015b8.STATE_FREQ_BATCH_INTERVAL_MISS;
            }
        } else if (C20681215wI.LIZIZ.contains(Integer.valueOf(i))) {
            int iLJIIIIZZ2 = LJIIIIZZ(i);
            int i6 = cardShowInfo.flowIndex;
            if ((num != null && i6 == num.intValue()) || (iLJIIIIZZ2 >= 0 && num != null && num.intValue() - iLJIIIIZZ2 >= cardShowInfo.flowInterval)) {
                return EnumC20550015b8.STATE_FREQ_SUCCESS;
            }
            return EnumC20550015b8.STATE_FREQ_BATCH_INTERVAL_MISS;
        }
        if (C1867050ygZ.LIZ()) {
            if (i5 > 0 || i5 == -1) {
                if (i3 > 0 && LJIIJ(i) >= i3) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i4 > 0 && LIZJ(i) >= i4) || z) {
                    if (i5 == -1) {
                        return EnumC20550015b8.STATE_FREQ_NEGATIVE_COOLDOWN;
                    }
                    if (i5 > 0) {
                        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - LJFF(i)) > i5 * 60 * 60) {
                            LJIILIIL(i);
                            String strLJ = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_dislike_times_");
                            LJII().storeInt(strLJ, 0);
                            LIZLLL().put(strLJ, 0);
                        } else {
                            return EnumC20550015b8.STATE_FREQ_NEGATIVE_COOLDOWN;
                        }
                    }
                }
            }
            if (LIZIZ(i) == 0) {
                return EnumC20550015b8.STATE_FREQ_NEGATIVE_COOLDOWN;
            }
            if (LIZIZ(i) > 0) {
                if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - LJFF(i)) > LIZIZ(i) * 60 * 60) {
                    String strLJ2 = LJ(C1ER1.LIZIZ.LLLLL(i), "shown_cool_down_client_");
                    LJII().storeInt(strLJ2, -1);
                    LIZLLL().put(strLJ2, -1);
                } else {
                    return EnumC20550015b8.STATE_FREQ_NEGATIVE_COOLDOWN;
                }
            }
        }
        if (j > 0 && i2 > 0) {
            if (num != null && i2 == 1) {
                if (num.intValue() != cardShowInfo.flowIndex) {
                    return EnumC20550015b8.STATE_FREQ_BATCH_COUNT_MISS;
                }
            }
            long jLJIIIZ = LJIIIZ(i);
            if (i2 > 1) {
                if (num != null && num.intValue() < cardShowInfo.flowIndex) {
                    return EnumC20550015b8.STATE_FREQ_BATCH_COUNT_MISS;
                }
                if (System.currentTimeMillis() - jLJIIIZ >= j) {
                    LJIILL(i, i2);
                    return EnumC20550015b8.STATE_FREQ_SUCCESS;
                }
                if (LJI(i) <= 0) {
                    return EnumC20550015b8.STATE_FREQ_REACHED_MAX_COUNT;
                }
                int iLJIIIIZZ3 = LJIIIIZZ(i);
                if (iLJIIIIZZ3 > 0 && num != null && num.intValue() - iLJIIIIZZ3 < cardShowInfo.flowInterval) {
                    return EnumC20550015b8.STATE_FREQ_BATCH_INTERVAL_MISS;
                }
                return EnumC20550015b8.STATE_FREQ_SUCCESS;
            }
            if (System.currentTimeMillis() - jLJIIIZ >= j) {
                return EnumC20550015b8.STATE_FREQ_SUCCESS;
            }
            return EnumC20550015b8.STATE_FREQ_TIME_INTERVAL_MISS;
        }
        return EnumC20550015b8.STATE_FREQ_PARAM_INVALID;
    }
}
