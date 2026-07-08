package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0PL6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PL6 {
    public static final String LIZ(Aweme aweme) {
        boolean z;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        if (aweme != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && awemeRawAdLJJIJLIJ.isSoftAd) {
            z = true;
        } else {
            z = false;
        }
        if (z || aweme == null || AwemeExtKt.isPseudoAd(aweme)) {
            return null;
        }
        return C587350N1x.LIZ(aweme);
    }

    public static final String LIZIZ(SearchMixFeed searchMixFeed) {
        InterfaceC682650Qq7 top1SummaryCard;
        List fusionBlockList;
        Object next;
        String snippet;
        if ((!C13LP.LJJJJ(searchMixFeed.docType, C1697810uHb.LJIIJJI(105, 223))) && (((top1SummaryCard = searchMixFeed.getTop1SummaryCard()) != null || (top1SummaryCard = searchMixFeed.getTop1MultiSummary()) != null) && (fusionBlockList = top1SummaryCard.getFusionBlockList()) != null)) {
            Iterator it2 = fusionBlockList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC682670Qq9 interfaceC682670Qq9 = (InterfaceC682670Qq9) next;
                    Integer type = interfaceC682670Qq9.getType();
                    if (type == null || type.intValue() != 7) {
                        Integer type2 = interfaceC682670Qq9.getType();
                        if (type2 == null || type2.intValue() != 1) {
                            if (C123100dR.LIZ(interfaceC682670Qq9.getProcessedSummary()) || C123100dR.LIZ(interfaceC682670Qq9.getSnippet())) {
                                break;
                            }
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC682670Qq9 interfaceC682670Qq92 = (InterfaceC682670Qq9) next;
            if (interfaceC682670Qq92 != null) {
                if (C123100dR.LIZ(interfaceC682670Qq92.getProcessedSummary())) {
                    snippet = interfaceC682670Qq92.getProcessedSummary();
                } else {
                    if (!C123100dR.LIZ(interfaceC682670Qq92.getSnippet())) {
                        return "";
                    }
                    snippet = interfaceC682670Qq92.getSnippet();
                }
                if (snippet != null) {
                    return snippet;
                }
            }
        }
        return "";
    }
}
