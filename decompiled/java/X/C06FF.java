package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.06FF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06FF implements C06F6 {
    public static final C06FF LL = new C06FF();
    public static final Map<String, Set<String>> LLILLJJLI = new LinkedHashMap();

    public static void LIZ(C06H2 c06h2) {
        Map<String, Set<String>> map = LLILLJJLI;
        synchronized (map) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c06h2.getValue());
                sbLIZ.append("_2");
                map.remove(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C06F6
    public final void r80(StreakData streakData, String str) {
        List<Long> list;
        long jLongValue;
        boolean z;
        long timeInMillis;
        String string;
        C0I0B.LJFF.LIZIZ();
        int iLJ = C13LZ.LJ(((Number) C101100Zt.LIZ.getValue()).intValue(), 0, 100);
        if (iLJ != 0) {
            if (iLJ != 100) {
                if (C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, 100)) > iLJ) {
                    return;
                }
            }
            try {
                String str2 = streakData.timeZoneId;
                if (str2 != null && (list = streakData.dayBeginArray) != null && !list.isEmpty()) {
                    int i = streakData.streak;
                    long jLJI = C1567806Bw.LJI();
                    List<Long> list2 = streakData.dayBeginArray;
                    if (list2 != null) {
                        jLongValue = ((Number) C13LP.LJJLIIIJJI(list2)).longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (jLJI <= jLongValue) {
                        if (((Number) C06DH.LIZ.getValue()).intValue() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z2 = !z;
                        if (z2) {
                            long j = 120;
                            timeInMillis = (jLJI / j) * j;
                        } else {
                            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(str2));
                            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                            calendar.setTimeInMillis(jLJI * j2);
                            calendar.set(11, 0);
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            timeInMillis = calendar.getTimeInMillis() / j2;
                        }
                        Pair pairLIZIZ = C1567906Bx.LIZIZ(list, timeInMillis, z2, str2);
                        boolean zBooleanValue = ((Boolean) pairLIZIZ.getFirst()).booleanValue();
                        List list3 = (List) pairLIZIZ.getSecond();
                        Pair[] pairArr = new Pair[7];
                        pairArr[0] = new Pair("timezone", str2);
                        pairArr[1] = new Pair("server_day_begin_list", list.toString());
                        if (list3 == null || (string = list3.toString()) == null) {
                            string = "";
                        }
                        pairArr[2] = new Pair("client_day_begin_list", string);
                        pairArr[3] = new Pair("streak_days", String.valueOf(i));
                        pairArr[4] = new Pair("current_begin_time", String.valueOf(timeInMillis));
                        pairArr[5] = new Pair("conversation_id", streakData.convId);
                        pairArr[6] = new Pair("is_valid", String.valueOf(zBooleanValue));
                        C20684815ws.LJIILLIIL("streak_timezone_check_monitor", C2097608Jq.LJIIJ(pairArr));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    public static boolean LJ(C06H2 c06h2, int i, String str) {
        Map<String, Set<String>> map = LLILLJJLI;
        synchronized (map) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c06h2.getValue());
                sbLIZ.append('_');
                sbLIZ.append(i);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Set<String> linkedHashSet = (Set) ((LinkedHashMap) map).get(strLIZIZ);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    map.put(strLIZIZ, linkedHashSet);
                }
                if (linkedHashSet.contains(str)) {
                    return false;
                }
                linkedHashSet.add(str);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(C06FF c06ff, String str, int i, boolean z, String str2, C06H2 c06h2) {
        String strValueOf;
        C0I0B.LJFF.LIZIZ();
        c06ff.getClass();
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(C06FE.CONVERSATION_ID.getValue(), str);
        pairArr[1] = new Pair(C06FE.CONVERSATION_TYPE.getValue(), String.valueOf(C1567806Bw.LIZIZ(str)));
        pairArr[2] = new Pair(C06FE.ENTER_FROM.getValue(), c06h2.getValue());
        String value = C06FE.STREAK_COUNT.getValue();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(i);
        }
        pairArr[3] = new Pair(value, strValueOf);
        String value2 = C06FE.IS_EXPIRED.getValue();
        if (z) {
            str3 = "1";
        }
        pairArr[4] = new Pair(value2, str3);
        pairArr[5] = new Pair(C06FE.PANEL_TYPE.getValue(), str2);
        C20684815ws.LJIILLIIL("streak_panel_show", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LIZLLL(C06FF c06ff, String str, StreakData streakData, boolean z, C06H2 c06h2, boolean z2) {
        String strValueOf;
        String str2;
        C0I0B.LJFF.LIZIZ();
        c06ff.getClass();
        if (!z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(z);
            if (!LJ(c06h2, 2, C2188811AlT.LIZIZ(sbLIZ))) {
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(!z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        Map<String, Set<String>> map = LLILLJJLI;
        synchronized (map) {
            try {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(c06h2.getValue());
                sbLIZ3.append('_');
                sbLIZ3.append(2);
                Set set = (Set) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ3));
                if (set != null) {
                    set.remove(strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(C06FE.CONVERSATION_ID.getValue(), str);
        pairArr[1] = new Pair(C06FE.CONVERSATION_TYPE.getValue(), String.valueOf(C1567806Bw.LIZIZ(str)));
        pairArr[2] = new Pair(C06FE.ENTER_FROM.getValue(), c06h2.getValue());
        String value = C06FE.STREAK_COUNT.getValue();
        if (C1567806Bw.LIZLLL(streakData)) {
            strValueOf = String.valueOf(streakData.streak);
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair(value, strValueOf);
        pairArr[4] = new Pair(C06FE.STREAK_LEVEL.getValue(), String.valueOf(C1567806Bw.LJII(streakData)));
        String value2 = C06FE.IS_GREY.getValue();
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair(value2, str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C066Y.LIZ(C066Y.LIZIZ, mapLJIIJ, str, C13LQ.LJLIIL(new String[]{"streak_cnt", "is_grey"}), streakData, 8);
        C20684815ws.LJIILLIIL("streak_counter_show", mapLJIIJ);
    }

    public static void LIZJ(C06FF c06ff, String str, int i, String str2, String str3, Boolean bool, Integer num, String str4, int i2) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        String str5 = str4;
        Integer num2 = num;
        Boolean bool2 = bool;
        if ((i2 & 16) != 0) {
            bool2 = null;
        }
        if ((i2 & 32) != 0) {
            num2 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        c06ff.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C06FG(interfaceC1493505szLIZIZ, str, i, str2, str3, bool2, num2, str5, null), 3);
    }
}
