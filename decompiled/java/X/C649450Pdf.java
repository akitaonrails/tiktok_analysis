package X;

import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.QuoteBlock;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649450Pdf {
    public static final LinkedHashMap<String, QuoteBlock> LIZ(SearchMixFeed searchMixFeed) {
        List fusionBlockList;
        LinkedHashMap<String, QuoteBlock> linkedHashMap = null;
        if (!C654380Plc.LIZ().optPovReferenceGet) {
            return null;
        }
        InterfaceC682650Qq7 top1SummaryCard = searchMixFeed.getTop1SummaryCard();
        if ((top1SummaryCard != null || (top1SummaryCard = searchMixFeed.getTop1MultiSummary()) != null) && (fusionBlockList = top1SummaryCard.getFusionBlockList()) != null) {
            linkedHashMap = new LinkedHashMap<>();
            Iterator it2 = fusionBlockList.iterator();
            while (it2.hasNext()) {
                Map<String, QuoteBlock> quoteBlockMap = ((InterfaceC682670Qq9) it2.next()).getQuoteBlockMap();
                if (quoteBlockMap != null) {
                    linkedHashMap.putAll(quoteBlockMap);
                }
            }
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap<String, RefSource> LIZIZ(SearchMixFeed searchMixFeed) {
        List fusionBlockList;
        LinkedHashMap<String, RefSource> linkedHashMap = null;
        if (!C654380Plc.LIZ().optPovReferenceGet) {
            return null;
        }
        InterfaceC682650Qq7 top1SummaryCard = searchMixFeed.getTop1SummaryCard();
        if ((top1SummaryCard != null || (top1SummaryCard = searchMixFeed.getTop1MultiSummary()) != null) && (fusionBlockList = top1SummaryCard.getFusionBlockList()) != null) {
            linkedHashMap = new LinkedHashMap<>();
            Iterator it2 = fusionBlockList.iterator();
            while (it2.hasNext()) {
                LinkedHashMap<String, RefSource> refSourceMap = ((InterfaceC682670Qq9) it2.next()).getRefSourceMap();
                if (refSourceMap != null) {
                    linkedHashMap.putAll(refSourceMap);
                }
            }
        }
        return linkedHashMap;
    }
}
