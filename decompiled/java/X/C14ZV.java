package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14ZV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FeedItemList LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14ZV(FeedItemList feedItemList) {
        super(0);
        this.LL = feedItemList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Aweme> items;
        List list;
        FeedSurveyConfig feedSurveyConfig;
        FeedItemList feedItemList = this.LL;
        if (feedItemList != null && (items = feedItemList.getItems()) != null && !items.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<Aweme> it2 = items.iterator();
            while (it2.hasNext()) {
                List<SurveyInfo> surveyInfos = it2.next().getSurveyInfos();
                if (surveyInfos == null) {
                    surveyInfos = new ArrayList<>();
                }
                C19719612Di.LJJI(surveyInfos, arrayList);
            }
            List listLJJJJLI = C13LP.LJJJJLI(arrayList);
            HashSet hashSet = new HashSet();
            ArrayList<SurveyInfo> arrayList2 = new ArrayList();
            for (Object obj : (ArrayList) listLJJJJLI) {
                if (hashSet.add(((SurveyInfo) obj).surveyKey)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, null, null, null, 0, null, AFwS274S0000000_30.get$arr$(246), 31);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    SurveyInfo surveyInfo = (SurveyInfo) it3.next();
                    C14ZW c14zw = C14ZW.LIZ;
                    String str = surveyInfo.surveyKey;
                    c14zw.getClass();
                    C14ZG c14zg = C14ZW.LIZIZ.get(str != null ? str : "");
                    if (c14zg == null || (feedSurveyConfig = c14zg.LJI) == null || (list = feedSurveyConfig.contentScopes) == null) {
                        list = C13BV.INSTANCE;
                    }
                    arrayList3.add(list);
                }
                String strLJJLIIIJ2 = C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList3), ",", null, null, 0, null, null, 62);
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (SurveyInfo surveyInfo2 : arrayList2) {
                    C14ZW c14zw2 = C14ZW.LIZ;
                    String str2 = surveyInfo2.surveyKey;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c14zw2.getClass();
                    C14ZG c14zg2 = C14ZW.LIZIZ.get(str2);
                    arrayList4.add(Integer.valueOf(c14zg2 != null ? c14zg2.LIZJ : -1));
                }
                String strLJJLIIIJ3 = C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList4), ",", null, null, 0, null, AFwS229S0000000_2.get$arr$(603), 30);
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(items, 10));
                Iterator<Aweme> it4 = items.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(Integer.valueOf(C14ZW.LIZIZ(it4.next())));
                }
                String strLJJLIIIJ4 = C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList5), ",", null, null, 0, null, AFwS229S0000000_2.get$arr$(602), 30);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("surveyIds", strLJJLIIIJ);
                c2344009Gk.LJIIIIZZ("style_group", strLJJLIIIJ3);
                c2344009Gk.LJIIIIZZ("option_style", strLJJLIIIJ4);
                c2344009Gk.LJIIIIZZ("content_scopes", strLJJLIIIJ2);
                C20684815ws.LJIILLIIL("with_survey_info", c2344009Gk.LIZ);
                FeedItemList feedItemList2 = this.LL;
                C20291714aZ c20291714aZ = C20291714aZ.LIZ;
                AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(feedItemList2, 311);
                c20291714aZ.getClass();
                C20291714aZ.LIZIZ(awS574S0100000_30);
            }
        }
        return Unit.LIZ;
    }
}
