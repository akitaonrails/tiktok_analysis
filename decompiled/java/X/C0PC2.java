package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;

/* JADX INFO: renamed from: X.0PC2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PC2 {
    public static final boolean LIZ(SearchMixFeed searchMixFeed) {
        InterfaceC682650Qq7 top1SummaryCard;
        if ((searchMixFeed.getTop1SummaryCard() == null && searchMixFeed.getTop1MultiSummary() == null) || searchMixFeed.isNimble() || ((((top1SummaryCard = searchMixFeed.getTop1SummaryCard()) != null || (top1SummaryCard = searchMixFeed.getTop1MultiSummary()) != null) && top1SummaryCard.getHasNimbleCardInSearchResult()) || searchMixFeed.isNimble() || searchMixFeed.isOnlinePovCard() || searchMixFeed.isVisualSearchOnlinePovCard() || searchMixFeed.isNimbleContainerCard())) {
            return false;
        }
        return true;
    }
}
