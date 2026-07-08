package X;

import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.116X, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C116X implements InterfaceC19882712qn<SearchSugChallengeList, AVSearchChallengeList> {
    public static AVSearchChallengeList LIZ(SearchSugChallengeList searchSugChallengeList) {
        ArrayList arrayListLIZ;
        String imprId;
        String info;
        String wordsSource;
        String queryId = null;
        if (searchSugChallengeList == null) {
            return null;
        }
        AVSearchChallengeList aVSearchChallengeList = new AVSearchChallengeList();
        List<AVChallenge> list = searchSugChallengeList.items;
        if (list == null) {
            arrayListLIZ = new ArrayList();
        } else {
            arrayListLIZ = C19881612qc.LIZ(C19881612qc.LIZLLL(list, new InterfaceC19882712qn<AVChallenge, AVSearchChallenge>() { // from class: X.112F
                public static final /* synthetic */ int LL = 0;

                @Override // X.InterfaceC19882712qn
                public final AVSearchChallenge apply(AVChallenge aVChallenge) {
                    AVChallenge aVChallenge2 = aVChallenge;
                    if (aVChallenge2 == null) {
                        return null;
                    }
                    AVSearchChallenge aVSearchChallenge = new AVSearchChallenge();
                    aVSearchChallenge.challenge = aVChallenge2;
                    return aVSearchChallenge;
                }
            }));
        }
        aVSearchChallengeList.items = arrayListLIZ;
        aVSearchChallengeList.keyword = searchSugChallengeList.keyword;
        LogPbBean logPbBean = new LogPbBean(null);
        LogPbBean logPbBean2 = searchSugChallengeList.logPb;
        if (logPbBean2 != null) {
            imprId = logPbBean2.getImprId();
        } else {
            imprId = null;
        }
        logPbBean.setImprId(imprId);
        aVSearchChallengeList.logPb = logPbBean;
        aVSearchChallengeList.isMatch = searchSugChallengeList.isMatch;
        RecommendWordMob recommendWordMob = new RecommendWordMob();
        com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob2 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob2 != null) {
            info = recommendWordMob2.getInfo();
        } else {
            info = null;
        }
        recommendWordMob.setInfo(info);
        com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob3 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob3 != null) {
            wordsSource = recommendWordMob3.getWordsSource();
        } else {
            wordsSource = null;
        }
        recommendWordMob.setWordsSource(wordsSource);
        com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob4 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob4 != null) {
            queryId = recommendWordMob4.getQueryId();
        }
        recommendWordMob.setQueryId(queryId);
        aVSearchChallengeList.recommendWordMob = recommendWordMob;
        return aVSearchChallengeList;
    }

    @Override // X.InterfaceC19882712qn
    public final /* bridge */ /* synthetic */ AVSearchChallengeList apply(SearchSugChallengeList searchSugChallengeList) {
        return LIZ(searchSugChallengeList);
    }
}
