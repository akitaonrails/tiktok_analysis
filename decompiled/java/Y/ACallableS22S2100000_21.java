package Y;

import X.C08JS;
import X.C1360750lVx;
import X.C1387280mCk;
import X.C1387300mCm;
import X.C1697810uHb;
import X.C1C7U;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2276471E8n;
import X.C735080SsU;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.api.FeedPagination;
import com.ss.android.ugc.aweme.detail.api.FeedPaginationControl;
import com.ss.android.ugc.aweme.detail.api.UpvoteApi;
import com.ss.android.ugc.aweme.detail.api.UpvoteFeedListResponse;
import com.ss.android.ugc.aweme.detail.api.UpvoteFeedStruct;
import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public class ACallableS22S2100000_21 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS22S2100000_21 aCallableS22S2100000_21) throws ExecutionException, InterruptedException {
        Integer numValueOf;
        long j;
        FeedPagination feedPagination;
        ArrayList<UpvoteFeedStruct> arrayList;
        C1C7U.LIZ("RepostAwemeModel@9678.fetchUpvoteList$1");
        String strLIZLLL = C08JS.LIZLLL(((C1360750lVx) aCallableS22S2100000_21.l2).LL);
        C1387300mCm c1387300mCm = C1387300mCm.LIZIZ;
        String strLIZLLL2 = C08JS.LIZLLL(c1387300mCm.LIZIZ(((C1360750lVx) aCallableS22S2100000_21.l2).mListQueryType));
        String strLIZLLL3 = C08JS.LIZLLL(C1697810uHb.LJIIJJI(aCallableS22S2100000_21.s0, aCallableS22S2100000_21.s1));
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchUpvoteList, query type: ");
        sbLIZ.append(((C1360750lVx) aCallableS22S2100000_21.l2).mListQueryType);
        sbLIZ.append(", feedPaginationControl: ");
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(", viewedAids: ");
        sbLIZ.append(strLIZLLL2);
        sbLIZ.append(", topTwoUpvotes: ");
        sbLIZ.append(strLIZLLL3);
        c2276471E8n.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ));
        UpvoteFeedListResponse upvoteFeedListResponse = UpvoteApi.LIZIZ.getUpvoteFeedList(strLIZLLL, strLIZLLL2, strLIZLLL3).get();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("upvoteFeedListResponse: size: ");
        if (upvoteFeedListResponse != null && (arrayList = upvoteFeedListResponse.upvoteFeedList) != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        c2276471E8n.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ2));
        c1387300mCm.LIZJ();
        FeedPaginationControl feedPaginationControl = ((C1360750lVx) aCallableS22S2100000_21.l2).LL;
        if (upvoteFeedListResponse != null && (feedPagination = upvoteFeedListResponse.pagination) != null) {
            j = feedPagination.cursor;
        } else {
            j = 0;
        }
        feedPaginationControl.setCursor(j);
        C1C7U.LIZIZ("RepostAwemeModel@9678.fetchUpvoteList$1");
        return upvoteFeedListResponse;
    }

    public static final Object call$1(ACallableS22S2100000_21 aCallableS22S2100000_21) {
        C1C7U.LIZ("PhotoSharePackage@3555.mobShareCount$1");
        C1387280mCk c1387280mCk = new C1387280mCk();
        c1387280mCk.LIZ = ((Aweme) aCallableS22S2100000_21.l2).getAid();
        c1387280mCk.LIZIZ = 1;
        c1387280mCk.LJ = ((Aweme) aCallableS22S2100000_21.l2).getAwemeType();
        c1387280mCk.LJI = 1;
        c1387280mCk.LJII = aCallableS22S2100000_21.s0;
        String str = aCallableS22S2100000_21.s1;
        if (str != null) {
            c1387280mCk.LJJIJ = str;
        }
        AwemeStatsApi.LIZ(c1387280mCk.LIZ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSharePackage@3555.mobShareCount$1");
        return unit;
    }

    public static final Object call$2(ACallableS22S2100000_21 aCallableS22S2100000_21) {
        String logExtra;
        Long adId;
        C1C7U.LIZ("CommentLogger@c1c.mobShareCount$1");
        C1387280mCk c1387280mCk = new C1387280mCk();
        c1387280mCk.LIZ = ((Aweme) aCallableS22S2100000_21.l2).getAid();
        c1387280mCk.LIZIZ = 1;
        c1387280mCk.LJ = ((Aweme) aCallableS22S2100000_21.l2).getAwemeType();
        c1387280mCk.LJI = 1;
        c1387280mCk.LJII = aCallableS22S2100000_21.s0;
        if (AwemeExtKt.isMonetizationTraffic((Aweme) aCallableS22S2100000_21.l2)) {
            Context contextLIZ = C20642515q3.LIZ();
            AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData((Aweme) aCallableS22S2100000_21.l2);
            Long creativeId = null;
            if (monetizationData != null) {
                logExtra = monetizationData.getLogExtra();
            } else {
                logExtra = null;
            }
            AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData((Aweme) aCallableS22S2100000_21.l2);
            if (monetizationData2 != null) {
                adId = monetizationData2.getAdId();
            } else {
                adId = null;
            }
            String strValueOf = String.valueOf(adId);
            AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData((Aweme) aCallableS22S2100000_21.l2);
            if (monetizationData3 != null) {
                creativeId = monetizationData3.getCreativeId();
            }
            C735080SsU.LIZIZ(contextLIZ, logExtra, strValueOf, String.valueOf(creativeId), c1387280mCk);
        } else {
            String str = aCallableS22S2100000_21.s1;
            if (str != null) {
                c1387280mCk.LJJIJ = str;
            }
        }
        try {
            AwemeStatsApi.LIZ(c1387280mCk.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLogger@c1c.mobShareCount$1");
        return unit;
    }

    public ACallableS22S2100000_21(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
