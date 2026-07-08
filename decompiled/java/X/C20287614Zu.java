package X;

import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.14Zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20287614Zu {
    public static final /* synthetic */ int LIZ = 0;

    public static C2252061DCq LIZ(String str, String str2, SurveyInfo surveyInfo) {
        long j;
        boolean z;
        Long lValueOf = null;
        if (str == null || str2 == null) {
            return null;
        }
        C2252051DCp.LIZ.getClass();
        C2252061DCq c2252061DCqLIZJ = C2252051DCp.LIZJ(str, str2);
        if (c2252061DCqLIZJ == null) {
            C2252061DCq c2252061DCq = new C2252061DCq(str2);
            ((CopyOnWriteArrayList) c2252061DCq.LJJJLL).add(EnumC20290114aJ.SKIP);
            return c2252061DCq;
        }
        long jLongValue = 0;
        if (surveyInfo != null) {
            j = surveyInfo.surveyStayTimeSum;
        } else {
            j = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = c2252061DCqLIZJ.LJJIIZI;
        if (l != null) {
            jLongValue = l.longValue();
        }
        long j2 = j + (jCurrentTimeMillis - jLongValue);
        if (surveyInfo != null) {
            surveyInfo.setSurveyStayTimeSum(j2);
        }
        if (j2 < 3000) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<EnumC20290114aJ> list = c2252061DCqLIZJ.LJJJLL;
            EnumC20290114aJ enumC20290114aJ = EnumC20290114aJ.SKIP;
            if (!((CopyOnWriteArrayList) list).contains(enumC20290114aJ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[step 2.1.3.3.3 getAppointedTrackInfo] isSkipAction true, add skip action, start time ");
                sbLIZ.append(c2252061DCqLIZJ.LJJIIZI);
                sbLIZ.append(", surveyStayTimeSum ");
                if (surveyInfo != null) {
                    lValueOf = Long.valueOf(surveyInfo.surveyStayTimeSum);
                }
                sbLIZ.append(lValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                ((CopyOnWriteArrayList) c2252061DCqLIZJ.LJJJLL).add(enumC20290114aJ);
                return c2252061DCqLIZJ;
            }
        } else {
            List<EnumC20290114aJ> list2 = c2252061DCqLIZJ.LJJJLL;
            EnumC20290114aJ enumC20290114aJ2 = EnumC20290114aJ.SKIP;
            if (((CopyOnWriteArrayList) list2).contains(enumC20290114aJ2) && C0BPJ.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[step 2.1.3.3.3 getAppointedTrackInfo] isSkipAction false, remove skip action, start time ");
                sbLIZ2.append(c2252061DCqLIZJ.LJJIIZI);
                sbLIZ2.append(", surveyStayTimeSum ");
                if (surveyInfo != null) {
                    lValueOf = Long.valueOf(surveyInfo.surveyStayTimeSum);
                }
                sbLIZ2.append(lValueOf);
                C2188811AlT.LIZIZ(sbLIZ2);
                ((CopyOnWriteArrayList) c2252061DCqLIZJ.LJJJLL).remove(enumC20290114aJ2);
                return c2252061DCqLIZJ;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[step 2.1.3.3.3 getAppointedTrackInfo] not change skip action, start time ");
        sbLIZ3.append(c2252061DCqLIZJ.LJJIIZI);
        sbLIZ3.append(", surveyStayTimeSum ");
        if (surveyInfo != null) {
            lValueOf = Long.valueOf(surveyInfo.surveyStayTimeSum);
        }
        sbLIZ3.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ3);
        return c2252061DCqLIZJ;
    }
}
