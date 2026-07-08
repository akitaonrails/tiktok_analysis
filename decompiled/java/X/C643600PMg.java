package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643600PMg extends AbstractC666280QBm<C0PN8, SearchMixFeed> {
    public final ConcurrentHashSet<String> LLIZLLLIL = new ConcurrentHashSet<>();

    @Override // X.C1260870iur
    public final void LJIILJJIL() {
        List<SearchMixFeed> items;
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) this.LL;
        if (abstractC1255880imo != null && (items = abstractC1255880imo.getItems()) != null) {
            for (SearchMixFeed searchMixFeed : items) {
                searchMixFeed.setIsEntrance(false);
                searchMixFeed.setIsAggregatedVideoHistoryEntrance(false);
                searchMixFeed.setEntryVideoId("");
            }
        }
        super.LJIILJJIL();
    }

    @Override // X.AbstractC666280QBm
    public final List<Aweme> LJIJJ() {
        C0QDL c0qdlLIZLLL;
        List<Aweme> listLJFF;
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) this.LL;
        List<Aweme> listLJJI = C0PN8.LJJI(abstractC1255880imo != null ? abstractC1255880imo.getItems() : null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJJI) {
            if (!this.LLIZLLLIL.contains(((Aweme) obj).getAid())) {
                arrayList.add(obj);
            }
        }
        List<Aweme> arrayList2 = new ArrayList<>(arrayList);
        if (C0BRM.LIZIZ()) {
            C644490PPr.LIZ.getClass();
            if (!C644490PPr.LJIIIIZZ) {
                ISearchSurvey iSearchSurveyLIZ = C0QF5.LIZ();
                if (iSearchSurveyLIZ != null && (c0qdlLIZLLL = iSearchSurveyLIZ.LIZLLL()) != null && (listLJFF = c0qdlLIZLLL.LJFF(arrayList2)) != null) {
                    arrayList2 = listLJFF;
                }
                return new ArrayList(arrayList2);
            }
        }
        return arrayList2;
    }

    @Override // X.AbstractC666280QBm
    public final List<SearchMixFeed> LJIJJLI() {
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) this.LL;
        if (abstractC1255880imo != null) {
            return abstractC1255880imo.getItems();
        }
        return null;
    }

    @Override // X.C1260870iur
    public final void LJIIJ(AbstractC666100QAu abstractC666100QAu) {
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) abstractC666100QAu;
        super.LJIIJ(abstractC1255880imo);
        abstractC1255880imo.onModelBound();
    }

    @Override // X.AbstractC666280QBm
    public final String LJIJI(SearchMixFeed searchMixFeed) {
        Aweme aweme;
        SearchMixFeed searchMixFeed2 = searchMixFeed;
        if (searchMixFeed2 != null && (aweme = searchMixFeed2.getAweme()) != null) {
            return C735370Ssx.LIZJ(aweme);
        }
        return "";
    }
}
