package X;

import Y.AfS142S0000000_23;
import Y.AkS158S0000000_23;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.survey.FrequencyGroup;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488870oqb {
    public static final C1488870oqb LIZ = new C1488870oqb();
    public static final ConcurrentHashMap<String, List<Long>> LIZIZ = new ConcurrentHashMap<>();
    public static final Keva LIZJ = Keva.getRepo("survey_frequency");

    public static boolean LIZ(FrequencyGroup frequencyGroup) {
        Integer numValueOf;
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("outOfFrequencyControl, groupName=");
        sbLIZ.append(frequencyGroup.groupName);
        sbLIZ.append(", count=");
        sbLIZ.append(frequencyGroup.count);
        sbLIZ.append(", interval=");
        sbLIZ.append(frequencyGroup.interval);
        sbLIZ.append(", cacheSize=");
        ConcurrentHashMap<String, List<Long>> concurrentHashMap = LIZIZ;
        List<Long> list = concurrentHashMap.get(frequencyGroup.groupName);
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", list=");
        sbLIZ.append(concurrentHashMap.get(frequencyGroup.groupName));
        C2188811AlT.LIZIZ(sbLIZ);
        List<Long> list2 = concurrentHashMap.get(frequencyGroup.groupName);
        if (list2 != null) {
            size = list2.size();
        } else {
            size = Integer.MIN_VALUE;
        }
        if (size < frequencyGroup.count) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(C14ZG c14zg) {
        FeedSurveyConfig feedSurveyConfig;
        List<FrequencyGroup> list;
        if (c14zg != null && (feedSurveyConfig = c14zg.LJI) != null && (list = feedSurveyConfig.frequencyGroup) != null) {
            System.currentTimeMillis();
            C11NZ.LJJJJIZL(list).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS158S0000000_23(1)).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS142S0000000_23(2));
        }
    }
}
