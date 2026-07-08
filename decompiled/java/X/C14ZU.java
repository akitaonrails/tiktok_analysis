package X;

import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14ZU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZU extends C09AY implements Function0<Map<String, String>> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14ZU(List<String> list, int i) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        Question[] questionArr;
        Question question;
        Integer numValueOf;
        Iterable iterable;
        FeedSurveyConfig feedSurveyConfig;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("survey_ids", C13LP.LJJLIIIJ(this.LL, ",", null, null, 0, null, null, 62));
        List<String> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C14ZW.LIZ.getClass();
            ConcurrentHashMap<String, C14ZG> concurrentHashMap = C14ZW.LIZIZ;
            if (str == null) {
                str = "";
            }
            C14ZG c14zg = concurrentHashMap.get(str);
            if (c14zg == null || (feedSurveyConfig = c14zg.LJI) == null || (iterable = feedSurveyConfig.contentScopes) == null) {
                iterable = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable, arrayList);
        }
        c2344009Gk.LJIIIIZZ("content_scopes", C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList), ",", null, null, 0, null, null, 62));
        List<String> list2 = this.LL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (String str2 : list2) {
            C14ZW.LIZ.getClass();
            C14ZG c14zg2 = C14ZW.LIZIZ.get(str2);
            arrayList2.add(Integer.valueOf(c14zg2 != null ? c14zg2.LIZJ : -1));
        }
        c2344009Gk.LJIIIIZZ("survey_style_groups", C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList2), ",", null, null, 0, null, null, 62));
        List<String> list3 = this.LL;
        ArrayList arrayList3 = new ArrayList();
        for (String str3 : list3) {
            C14ZW.LIZ.getClass();
            FeedSurvey feedSurveyLJFF = C14ZW.LJFF(str3);
            if (feedSurveyLJFF != null && (questionArr = feedSurveyLJFF.questions) != null && (question = (Question) C13LQ.LJJIFFI(questionArr)) != null && (numValueOf = Integer.valueOf(question.type)) != null) {
                arrayList3.add(numValueOf);
            }
        }
        c2344009Gk.LJIIIIZZ("option_style", C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList3), ",", null, null, 0, null, null, 62));
        c2344009Gk.LIZJ(this.LLILLJJLI, "video_play_count");
        return c2344009Gk.LIZ;
    }
}
