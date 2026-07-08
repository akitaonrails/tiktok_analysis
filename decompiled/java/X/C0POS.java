package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import java.util.List;

/* JADX INFO: renamed from: X.0POS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0POS {
    public static final C0POS LIZ = new C0POS();

    public static void LIZ(SearchMixFeedList searchMixFeedList) {
        ISearchAdPreloadModule iSearchAdPreloadModule;
        List<SearchMixFeed> list;
        List<SearchMixFeed> list2 = searchMixFeedList.mItems;
        if (list2 != null && !list2.isEmpty() && (iSearchAdPreloadModule = (ISearchAdPreloadModule) PluggableExtentionKt.pluggableSpi$default(ISearchAdPreloadModule.class, false, false, false, 14, null)) != null && (list = searchMixFeedList.mItems) != null) {
            for (SearchMixFeed searchMixFeed : list) {
                Aweme aweme = searchMixFeed.getAweme();
                if (aweme == null) {
                    SingleLive singleLive = searchMixFeed.singleLive;
                    if (singleLive != null) {
                        aweme = singleLive.aweme;
                    } else {
                        aweme = null;
                    }
                }
                iSearchAdPreloadModule.LIZLLL(searchMixFeed.getFeedType(), aweme);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r12) {
        /*
            java.util.List<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> r0 = r12.mItems
            r5 = 1
            if (r0 == 0) goto L93
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L93
            java.util.List<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> r0 = r12.mItems
            java.util.Iterator r6 = r0.iterator()
        L11:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r4 = r6.next()
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r4 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r4
            int r1 = r4.getFeedType()
            r0 = 106(0x6a, float:1.49E-43)
            r12 = 0
            if (r1 == r0) goto L71
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L74
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L6e
            r0 = 116(0x74, float:1.63E-43)
            if (r1 != r0) goto L91
            X.0PK8 r3 = X.C0PK8.BRAND_HYBRID_AD
        L34:
            if (r3 == 0) goto L91
            java.lang.String r1 = X.C655390PnF.LIZIZ(r4, r3)
            if (r1 != 0) goto L3e
            java.lang.String r1 = ""
        L3e:
            java.lang.Class<com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule> r7 = com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule.class
            r8 = 0
            r11 = 14
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule r0 = (com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule) r0
            if (r0 == 0) goto L6b
            X.0Pqf r0 = r0.LIZLLL()
            if (r0 == 0) goto L6b
            X.0PP8 r2 = r0.LJIILL(r1, r5)
            if (r2 == 0) goto L6c
            X.0POT r1 = r2.LIZLLL(r3)
        L5d:
            X.0PnG r0 = X.C655390PnF.LIZ(r4, r3)
            if (r2 == 0) goto L11
            if (r1 == 0) goto L67
            X.0Qwe r12 = r1.LIZ
        L67:
            r2.LJIILL(r0, r12)
            goto L11
        L6b:
            r2 = r12
        L6c:
            r1 = r12
            goto L5d
        L6e:
            X.0PK8 r3 = X.C0PK8.SINGLE_AD
            goto L34
        L71:
            X.0PK8 r3 = X.C0PK8.MULTI_AD
            goto L34
        L74:
            com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct r0 = r4.multiAdCard
            if (r0 == 0) goto L82
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.awemeList
            if (r0 == 0) goto L82
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L91
        L82:
            com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct r2 = r4.multiAdCard
            if (r2 == 0) goto L91
            X.0R12 r1 = X.C0R12.LIZIZ
            java.util.List<? extends java.util.Map<?, ?>> r0 = r2.awemeListRaw
            java.util.List r0 = r1.LJJIFFI(r0)
            r2.setAwemeList(r0)
        L91:
            return
        L92:
            return
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0POS.LIZIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList):void");
    }
}
