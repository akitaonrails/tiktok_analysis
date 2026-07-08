package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.experiment.CommentPollPublishConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0e6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075940e6a {
    public static final C1075940e6a LIZ = new C1075940e6a();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(126));
    public static final Map<String, Long> LIZJ = new LinkedHashMap();
    public static final Map<String, Integer> LIZLLL = new LinkedHashMap();

    public static Keva LIZLLL() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZ() {
        String strLIZIZ = LIZIZ();
        LIZJ.remove(strLIZIZ);
        LIZLLL.remove(strLIZIZ);
        LIZLLL().storeLong(LJFF(strLIZIZ), 0L);
        LIZLLL().storeBoolean(LIZJ(strLIZIZ), false);
    }

    public static String LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        return a0.LJJJIL(curUserId) ? "guest" : curUserId;
    }

    public static C050X LJ() {
        String strLIZIZ = LIZIZ();
        CommentPollPublishConfig commentPollPublishConfig = (CommentPollPublishConfig) C1344900l6O.LIZIZ.getValue();
        if (commentPollPublishConfig == null) {
            commentPollPublishConfig = C1344900l6O.LIZ;
        }
        int i = commentPollPublishConfig.tooltipLimitDays;
        String strLIZIZ2 = LIZIZ();
        Map<String, Integer> map = LIZLLL;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(strLIZIZ2) == null) {
            map.put(strLIZIZ2, Integer.valueOf(LIZLLL().getBoolean(LIZJ(strLIZIZ2), false) ? 1 : 0));
        }
        Integer num = (Integer) linkedHashMap.get(strLIZIZ2);
        boolean z = num != null && num.intValue() == 1;
        String strLIZIZ3 = LIZIZ();
        Map<String, Long> map2 = LIZJ;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
        long j = 0;
        if (linkedHashMap2.get(strLIZIZ3) == null) {
            map2.put(strLIZIZ3, Long.valueOf(LIZLLL().getLong(LJFF(strLIZIZ3), 0L)));
        }
        Long l = (Long) linkedHashMap2.get(strLIZIZ3);
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer numValueOf = Integer.valueOf(i);
        long jIntValue = numValueOf.intValue() > 0 ? ((long) numValueOf.intValue()) * 86400000 : 0L;
        if (jLongValue > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            if (jCurrentTimeMillis >= 0) {
                j = jCurrentTimeMillis;
            }
        }
        return new C050X(jLongValue, strLIZIZ, z, !z && i > 0 && (jLongValue <= 0 || j >= jIntValue));
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_poll_guide_ever_created_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_poll_guide_last_show_timestamp_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
