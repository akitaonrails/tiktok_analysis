package X;

import Y.AComparatorS26S0000000_7;
import com.bytedance.android.live.base.model.LiveSurveyState;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSurveyRecordReportConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.ReportConfig;
import com.bytedance.android.livesdk.survey.util.LiveOpenSurveyFcGroupSpitSetting;
import com.bytedance.android.strategy.StrategyApi;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.FrequencyGroup;
import webcast.api.room.StrategyData;

/* JADX INFO: renamed from: X.0IxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483410IxX implements InterfaceC483310IxN {
    public static final C483410IxX LIZ = new C483410IxX();
    public static final Keva LIZIZ = Keva.getRepo("repo_live_survey");

    @Override // X.InterfaceC483310IxN
    public final boolean LIZLLL() {
        Integer second = LIZIZ(4).getSecond();
        return second != null && second.intValue() == 1;
    }

    @Override // X.InterfaceC483310IxN
    public final List<LiveSurveyState> LIZJ() {
        ReportConfig config = LiveSurveyRecordReportConfig.INSTANCE.getConfig();
        int i = config.maxDay;
        int i2 = config.maxCount;
        long jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - ((long) (((i * 24) * 60) * 60));
        ArrayList arrayList = new ArrayList();
        Set<String> allKey = LIZIZ.getAllKey();
        if (allKey != null) {
            for (String str : allKey) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                if (lLJIILIIL != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    Iterator<T> it2 = LIZIZ.getStringSet(str, C08CX.INSTANCE).iterator();
                    while (it2.hasNext()) {
                        Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) it2.next());
                        if (lLJIILIIL2 != null) {
                            long jLongValue2 = lLJIILIIL2.longValue();
                            if (jLongValue2 >= jCurrentTimeMillis) {
                                arrayList.add(new LiveSurveyState(Long.valueOf(jLongValue), Long.valueOf(jLongValue2)));
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS26S0000000_7(3));
        }
        List listLL = C13LP.LL(arrayList, i2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLL) {
            if (hashSet.add(((LiveSurveyState) obj).surveyId)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final String LJI() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (LiveSurveyState liveSurveyState : (ArrayList) LIZJ()) {
            jSONObject.put(String.valueOf(liveSurveyState.surveyId), liveSurveyState.showTimestamp);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static void LJII(String str) {
        if (str != null && str.length() != 0) {
            Set<String> stringSet = LIZIZ.getStringSet(str, C08CX.INSTANCE);
            stringSet.add(String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            while (stringSet.size() > 10) {
                Iterator<T> it2 = stringSet.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (it2.hasNext()) {
                        long j = CastLongProtector.parseLong((String) next);
                        do {
                            Object next2 = it2.next();
                            long j2 = CastLongProtector.parseLong((String) next2);
                            if (j > j2) {
                                next = next2;
                                j = j2;
                            }
                        } while (it2.hasNext());
                    }
                    stringSet.remove(next);
                } else {
                    throw new NoSuchElementException();
                }
            }
            LIZIZ.storeStringSet(str, stringSet);
        }
    }

    @Override // X.InterfaceC483310IxN
    public final Pair<String, Integer> LIZIZ(int i) {
        C469620IbI.LIZ.getClass();
        StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(i, null, true, true, false);
        if (strategyDataLIZIZ != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (LiveOpenSurveyFcGroupSpitSetting.INSTANCE.getValue() && (!strategyDataLIZIZ.globalFrequencyGroup.isEmpty())) {
                for (Map.Entry<String, FrequencyGroup> entry : strategyDataLIZIZ.groupFrequency.entrySet()) {
                    String key = entry.getKey();
                    FrequencyGroup value = entry.getValue();
                    C483410IxX c483410IxX = LIZ;
                    long j = value.interval;
                    long j2 = value.maxCount;
                    c483410IxX.getClass();
                    if (LJFF(j, j2, key)) {
                        Iterator<String> it2 = value.groupNames.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                FrequencyGroup frequencyGroup = strategyDataLIZIZ.globalFrequencyGroup.get(it2.next());
                                if (frequencyGroup != null) {
                                    C483410IxX c483410IxX2 = LIZ;
                                    String str = frequencyGroup.groupName;
                                    long j3 = frequencyGroup.interval;
                                    long j4 = frequencyGroup.maxCount;
                                    c483410IxX2.getClass();
                                    if (!LJFF(j3, j4, str)) {
                                        break;
                                    }
                                }
                            } else {
                                linkedHashSet.add(key);
                                break;
                            }
                        }
                    }
                }
            } else {
                FrequencyGroup frequencyGroup2 = strategyDataLIZIZ.globalFrequency;
                if (frequencyGroup2 != null) {
                    C483410IxX c483410IxX3 = LIZ;
                    String str2 = frequencyGroup2.groupName;
                    long j5 = frequencyGroup2.interval;
                    long j6 = frequencyGroup2.maxCount;
                    c483410IxX3.getClass();
                    if (!LJFF(j5, j6, str2)) {
                        return new Pair<>("", 1);
                    }
                    for (Map.Entry<String, FrequencyGroup> entry2 : strategyDataLIZIZ.groupFrequency.entrySet()) {
                        FrequencyGroup value2 = entry2.getValue();
                        C483410IxX c483410IxX4 = LIZ;
                        String key2 = entry2.getKey();
                        long j7 = value2.interval;
                        long j8 = value2.maxCount;
                        c483410IxX4.getClass();
                        if (LJFF(j7, j8, key2)) {
                            linkedHashSet.add(entry2.getKey());
                        }
                    }
                } else {
                    return new Pair<>("", 4);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ.length() > 0) {
                return new Pair<>(strLJJLIIIJ, null);
            }
            return new Pair<>(strLJJLIIIJ, 2);
        }
        return new Pair<>("", 4);
    }

    @Override // X.InterfaceC483310IxN
    public final void LJ(int i, String str) {
        C480460Ism.LIZ().getClass();
        ((StrategyApi) C480460Ism.LIZLLL(StrategyApi.class)).strategyReport(i, 1, str).LJIILIIL(new C0UO0()).LJJLJ();
    }

    public static boolean LJFF(long j, long j2, String str) {
        Set<String> stringSet = LIZIZ.getStringSet(str, C08CX.INSTANCE);
        long jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - j;
        Iterator<String> it2 = stringSet.iterator();
        int i = 0;
        while (it2.hasNext()) {
            try {
                if (CastLongProtector.parseLong(it2.next()) > jCurrentTimeMillis) {
                    i++;
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (i >= j2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC483310IxN
    public final void LIZ(int i, Long l, String str) {
        String str2;
        if (str != null && str.length() != 0) {
            C469620IbI.LIZ.getClass();
            StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(i, null, true, true, false);
            if (strategyDataLIZIZ != null) {
                if (LiveOpenSurveyFcGroupSpitSetting.INSTANCE.getValue() && (!strategyDataLIZIZ.globalFrequencyGroup.isEmpty())) {
                    FrequencyGroup frequencyGroup = strategyDataLIZIZ.groupFrequency.get(str);
                    if (frequencyGroup != null) {
                        for (String str3 : frequencyGroup.groupNames) {
                            LIZ.getClass();
                            LJII(str3);
                        }
                    }
                    LIZ.getClass();
                    LJII(str);
                } else {
                    FrequencyGroup frequencyGroup2 = strategyDataLIZIZ.globalFrequency;
                    if (frequencyGroup2 != null && (str2 = frequencyGroup2.groupName) != null) {
                        LIZ.getClass();
                        LJII(str2);
                    }
                    LIZ.getClass();
                    LJII(str);
                }
            }
            if (l != null) {
                if (l.longValue() != 2 && l.longValue() != 3) {
                    if (l.longValue() == 4 || l.longValue() == 5) {
                        C483430IxZ c483430IxZ = C483430IxZ.LIZ;
                        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        Keva keva = C483390IxV.LIZIZ;
                        if (keva != null) {
                            keva.storeLong("last_light_survey_show_time", jCurrentTimeMillis);
                        }
                        C483430IxZ.LIZIZ.clear();
                        C483430IxZ.LIZJ.clear();
                        C483430IxZ.LIZLLL = 0L;
                        C483430IxZ.LJ.clear();
                        C483430IxZ.LJFF = 0L;
                        if (keva != null) {
                            keva.storeStringSet("fyp_aweme_set_since_last_light_survey", new LinkedHashSet());
                            keva.storeStringSet("fyp_live_card_set_since_last_light_survey", new LinkedHashSet());
                            keva.storeLong("fyp_live_card_duration_since_last_light_survey", 0L);
                            keva.storeStringSet("live_room_set_since_last_light_survey", new LinkedHashSet());
                            keva.storeLong("live_room_watch_duration_since_last_light_survey", 0L);
                        }
                    }
                } else {
                    C483420IxY c483420IxY = C483420IxY.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    Keva keva2 = C483390IxV.LIZIZ;
                    if (keva2 != null) {
                        keva2.storeLong("last_full_screen_survey_show_time", jCurrentTimeMillis2);
                    }
                    C483420IxY.LIZIZ.clear();
                    C483420IxY.LIZJ.clear();
                    C483420IxY.LIZLLL = 0L;
                    C483420IxY.LJ.clear();
                    C483420IxY.LJFF = 0L;
                    if (keva2 != null) {
                        keva2.storeStringSet("fyp_aweme_set_since_last_full_screen_survey", new LinkedHashSet());
                        keva2.storeStringSet("fyp_live_card_set_since_last_full_screen_survey", new LinkedHashSet());
                        keva2.storeLong("fyp_live_card_duration_since_last_full_screen_survey", 0L);
                        keva2.storeStringSet("live_room_set_since_last_full_screen_survey", new LinkedHashSet());
                        keva2.storeLong("live_room_watch_duration_since_last_full_screen_survey", 0L);
                    }
                }
            }
            C483440Ixa c483440Ixa = C483440Ixa.LIZ;
            long jCurrentTimeMillis3 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            Keva keva3 = C483390IxV.LIZIZ;
            if (keva3 != null) {
                keva3.storeLong("last_survey_show_time", jCurrentTimeMillis3);
            }
            C483440Ixa.LIZIZ.clear();
            C483440Ixa.LIZJ.clear();
            C483440Ixa.LIZLLL = 0L;
            C483440Ixa.LJ.clear();
            C483440Ixa.LJFF = 0L;
            if (keva3 != null) {
                keva3.storeStringSet("fyp_aweme_set_since_last_survey", new LinkedHashSet());
                keva3.storeStringSet("fyp_live_card_set_since_last_survey", new LinkedHashSet());
                keva3.storeLong("fyp_live_card_duration_since_last_survey", 0L);
                keva3.storeStringSet("live_room_set_since_last_survey", new LinkedHashSet());
                keva3.storeLong("live_room_watch_duration_since_last_survey", 0L);
            }
        }
    }
}
