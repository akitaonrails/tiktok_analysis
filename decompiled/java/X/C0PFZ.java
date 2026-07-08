package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PFZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PFZ {
    public static final C0PFZ LIZ = new C0PFZ();
    public static final IAwemeService LIZIZ = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
    public static final IRequestIdService LIZJ = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
    public static final Set<String> LIZLLL = C13LQ.LJLIIL(new String[]{"sounds", "hashtags", "effects", "related_search"});

    public static boolean LIZ(SearchMixFeed searchMixFeed) {
        if (searchMixFeed == null) {
            return false;
        }
        InterfaceC682650Qq7 top1SummaryCard = searchMixFeed.getTop1SummaryCard();
        if ((top1SummaryCard == null && (top1SummaryCard = searchMixFeed.getTop1MultiSummary()) == null) || !Intrinsics.LJFF(top1SummaryCard.isMixTop1(), Boolean.TRUE) || C0PH8.LJFF(searchMixFeed, C0NMY.GENERAL_SEARCH, C651290Pgd.LIZLLL(), false) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PFZ.LIZJ(java.util.List):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r9, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r10) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PFZ.LIZIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed):boolean");
    }

    public static int LIZLLL(int i, boolean z, List list) {
        if (z) {
            i = 0;
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AwemeBizExtKt.setRank((Aweme) it2.next(), i);
                i++;
            }
        }
        return i;
    }
}
