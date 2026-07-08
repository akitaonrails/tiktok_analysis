package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.CommonAladdin;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0PLR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLR {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(65280, 1048336);
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(65280, 1048336);
    public static final Set<Integer> LIZJ = C13LQ.LJLIIL(new Integer[]{70, 72, 62, 555, 2});

    public static final TakoSearchCarryInItem LIZ(SearchMixFeed searchMixFeed) {
        if (searchMixFeed.isTako()) {
            return C0Q7F.LIZ(searchMixFeed.getBot());
        }
        InterfaceC682650Qq7 top1SummaryCard = searchMixFeed.getTop1SummaryCard();
        if (top1SummaryCard == null) {
            top1SummaryCard = searchMixFeed.getTop1MultiSummary();
        }
        if (top1SummaryCard == null) {
            return null;
        }
        InterfaceC682650Qq7 top1SummaryCard2 = searchMixFeed.getTop1SummaryCard();
        if (top1SummaryCard2 == null && (top1SummaryCard2 = searchMixFeed.getTop1MultiSummary()) == null) {
            return null;
        }
        try {
            if (C14TF.LIZIZ.LJIIIZ()) {
                return C682640Qq6.LIZ(top1SummaryCard2, false);
            }
            return C682640Qq6.LIZIZ(top1SummaryCard2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final boolean LIZIZ(SearchMixFeed searchMixFeed) {
        String str;
        CommonAladdin commonAladdin;
        if (searchMixFeed != null && (commonAladdin = searchMixFeed.getCommonAladdin()) != null) {
            str = commonAladdin.activityLevel;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            return true;
        }
        return false;
    }
}
