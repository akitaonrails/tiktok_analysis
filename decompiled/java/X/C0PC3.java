package X;

import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PC3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PC3 {
    public static final List<ImageData> LIZ(SearchMixFeed searchMixFeed) {
        List fusionBlockList;
        InterfaceC682650Qq7 top1SummaryCard = searchMixFeed.getTop1SummaryCard();
        if ((top1SummaryCard != null || (top1SummaryCard = searchMixFeed.getTop1MultiSummary()) != null) && (fusionBlockList = top1SummaryCard.getFusionBlockList()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = fusionBlockList.iterator();
            while (it2.hasNext()) {
                List<ImageData> subImages = ((InterfaceC682670Qq9) it2.next()).getSubImages();
                if (subImages == null) {
                    subImages = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(subImages, arrayList);
            }
            return arrayList;
        }
        return null;
    }

    public static final boolean LIZIZ(SearchMixFeed searchMixFeed) {
        InterfaceC682650Qq7 top1SummaryCard = searchMixFeed.getTop1SummaryCard();
        if (top1SummaryCard == null) {
            top1SummaryCard = searchMixFeed.getTop1MultiSummary();
        }
        if (top1SummaryCard == null || !top1SummaryCard.isExpandStyle()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(SearchMixFeed searchMixFeed) {
        InterfaceC682650Qq7 top1SummaryCard = searchMixFeed.getTop1SummaryCard();
        if (top1SummaryCard == null && (top1SummaryCard = searchMixFeed.getTop1MultiSummary()) == null) {
            return false;
        }
        return Intrinsics.LJFF(top1SummaryCard.isMixTop1(), Boolean.TRUE);
    }

    public static final boolean LIZLLL(SearchMixFeed searchMixFeed) {
        if (((Number) C079U.LIZ.getValue()).intValue() == 1) {
            InterfaceC682650Qq7 top1SummaryCard = searchMixFeed.getTop1SummaryCard();
            if ((top1SummaryCard != null || (top1SummaryCard = searchMixFeed.getTop1MultiSummary()) != null) && !top1SummaryCard.isExpandStyle()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJ(SearchMixFeed searchMixFeed) {
        InterfaceC682650Qq7 top1SummaryCard;
        if (searchMixFeed.getTop1SummaryCard() == null && searchMixFeed.getTop1MultiSummary() == null) {
            return false;
        }
        if ((!searchMixFeed.isNimble() && (((top1SummaryCard = searchMixFeed.getTop1SummaryCard()) == null && (top1SummaryCard = searchMixFeed.getTop1MultiSummary()) == null) || !top1SummaryCard.getHasNimbleCardInSearchResult())) || searchMixFeed.isVisualSearchOnlinePovCard() || searchMixFeed.isOnlinePovCard() || searchMixFeed.isNimbleContainerCard()) {
            return false;
        }
        return true;
    }
}
