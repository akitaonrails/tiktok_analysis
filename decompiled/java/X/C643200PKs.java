package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.CollectionLive;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.MultiVideo;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1MultiSummary;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model.SearchPreciseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0PKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643200PKs {
    public static final String LJ(Aweme aweme) {
        HashMap<String, String> mobParams;
        String str;
        if (aweme == null || (mobParams = aweme.getMobParams()) == null || (str = mobParams.get("universal_rank")) == null) {
            return "";
        }
        return str;
    }

    public static final void LIZIZ(Aweme aweme, Integer num) {
        String string;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        LIZJ(aweme, string);
    }

    public static final void LIZJ(Aweme aweme, String str) {
        if (aweme == null || str == null) {
            return;
        }
        AwemeExtKt.appendMobParam(aweme, "universal_rank", str);
    }

    public static final C0PL1 LIZLLL(C0PG9 c0pg9, SearchMixFeed searchMixFeed) {
        C0PL2 c0pl2;
        int i = C0PEL.LIZ[c0pg9.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C0PL1.NO_SOURCE;
                }
                throw new C1954807lC();
            }
            if (searchMixFeed.universalRank != null && ((c0pl2 = searchMixFeed.insertType) == null || c0pl2 == C0PL2.OUT_SOURCE_REPLACE)) {
                return C0PL1.OUT_SOURCE_REPLACE;
            }
            return C0PL1.INNER_SOURCE_REPLACE;
        }
        return C0PL1.HIDE_DOC;
    }

    public static final void LJFF(SearchMixFeed searchMixFeed, Integer num) {
        Top1MultiSummary top1MultiSummary;
        List<MultiVideo> multiVideo;
        List<Aweme> list;
        List<Aweme> list2;
        List<Aweme> list3;
        List<MultiVideo> multiVideo2;
        List<Aweme> awemeList;
        List<Aweme> awemeList2;
        SingleLive singleLive;
        EComShopCardStruct eComShopCardStruct;
        searchMixFeed.universalRank = num;
        Aweme aweme = searchMixFeed.getAweme();
        if (aweme != null || (((singleLive = searchMixFeed.singleLive) != null && (aweme = singleLive.aweme) != null) || ((eComShopCardStruct = searchMixFeed.shopCard) != null && (aweme = eComShopCardStruct.liveEntity) != null))) {
            LIZIZ(aweme, num);
        }
        DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
        if (dynamicPatch != null && (awemeList2 = dynamicPatch.getAwemeList()) != null) {
            Iterator<Aweme> it2 = awemeList2.iterator();
            while (it2.hasNext()) {
                LIZIZ(it2.next(), num);
            }
        }
        TakoInfo bot = searchMixFeed.getBot();
        if (bot != null && (awemeList = bot.getAwemeList()) != null) {
            Iterator<Aweme> it3 = awemeList.iterator();
            while (it3.hasNext()) {
                LIZIZ(it3.next(), num);
            }
        }
        if ((searchMixFeed.getFeedType() == 203 || searchMixFeed.getFeedType() == 204) && (top1MultiSummary = searchMixFeed.getTop1MultiSummary()) != null && (multiVideo = top1MultiSummary.getMultiVideo()) != null) {
            Iterator<MultiVideo> it4 = multiVideo.iterator();
            while (it4.hasNext()) {
                List<Aweme> subVideos = it4.next().getSubVideos();
                if (subVideos != null) {
                    Iterator<Aweme> it5 = subVideos.iterator();
                    while (it5.hasNext()) {
                        LIZIZ(it5.next(), num);
                    }
                }
            }
        }
        Top1MultiSummary top1MultiSummary2 = searchMixFeed.getTop1MultiSummary();
        if (top1MultiSummary2 != null && (multiVideo2 = top1MultiSummary2.getMultiVideo()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(multiVideo2, 10));
            Iterator<MultiVideo> it6 = multiVideo2.iterator();
            while (it6.hasNext()) {
                it6.next();
                arrayList.add(Unit.LIZ);
            }
        }
        CollectionLive collectionLive = searchMixFeed.getCollectionLive();
        if (collectionLive != null && (list3 = collectionLive.lives) != null) {
            Iterator<Aweme> it7 = list3.iterator();
            while (it7.hasNext()) {
                LIZIZ(it7.next(), num);
            }
        }
        AggregatedVideo aggregatedVideo = searchMixFeed.getAggregatedVideo();
        if (aggregatedVideo != null && (list2 = aggregatedVideo.awemes) != null) {
            Iterator<Aweme> it8 = list2.iterator();
            while (it8.hasNext()) {
                LIZIZ(it8.next(), num);
            }
        }
        List<SearchUser> users = searchMixFeed.getUsers();
        if (users != null) {
            Iterator<SearchUser> it9 = users.iterator();
            while (it9.hasNext()) {
                List<Aweme> list4 = it9.next().awemeCards;
                if (list4 != null) {
                    Iterator<Aweme> it10 = list4.iterator();
                    while (it10.hasNext()) {
                        LIZIZ(it10.next(), num);
                    }
                }
            }
        }
        SearchPreciseAd preciseAd = searchMixFeed.getPreciseAd();
        if (preciseAd != null && (list = preciseAd.awemeCards) != null) {
            Iterator<Aweme> it11 = list.iterator();
            while (it11.hasNext()) {
                LIZIZ(it11.next(), num);
            }
        }
    }

    public static final void LIZ(C650460PfI c650460PfI, C646370PWx c646370PWx, Integer num) {
        String str;
        Integer num2;
        if (c646370PWx != null && (num2 = c646370PWx.LLJILJIL) != null) {
            num = num2;
        }
        c650460PfI.LJ("universal_rank", String.valueOf(num));
        if (c646370PWx != null && (str = c646370PWx.LLJILJILJ) != null) {
            c650460PfI.LJ("insert_type", str);
        }
    }
}
