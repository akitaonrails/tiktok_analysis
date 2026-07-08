package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601510rmH extends C09AY implements Function0<JSONObject> {
    public final /* synthetic */ FeedItemList LL;
    public final /* synthetic */ C1601460rmC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601510rmH(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
        super(0);
        this.LL = feedItemList;
        this.LLILLJJLI = c1601460rmC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() {
        List<Aweme> items;
        long jCurrentTimeMillis = System.currentTimeMillis();
        FeedItemList feedItemList = this.LL;
        int size = 0;
        boolean z = feedItemList != null && (feedItemList.isFromColdCache || feedItemList.isFromLocalCache);
        String str = feedItemList != null && feedItemList.isFromColdCache ? "cold_boot_cache" : (feedItemList == null || !feedItemList.isFromLocalCache) ? null : "local_cache";
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("log_id", feedItemList != null ? feedItemList.getRequestId() : null);
        pairArr[1] = new Pair("is_success", 1);
        FeedItemList feedItemList2 = this.LL;
        if (feedItemList2 != null && (items = feedItemList2.getItems()) != null) {
            size = items.size();
        }
        pairArr[2] = new Pair("items_count", Integer.valueOf(size));
        pairArr[3] = new Pair("is_from_cache", Boolean.valueOf(z));
        pairArr[4] = new Pair("session_number", Integer.valueOf(this.LLILLJJLI.LJJJJ));
        pairArr[5] = new Pair("cache_source", str);
        pairArr[6] = new Pair("request_method", this.LLILLJJLI.LJJIZ);
        pairArr[7] = new Pair("enter_from", "homepage_hot");
        C1601590rmP c1601590rmP = this.LLILLJJLI.LJJJ;
        pairArr[8] = new Pair("total_duration", Long.valueOf(jCurrentTimeMillis - (c1601590rmP != null ? c1601590rmP.LIZ : jCurrentTimeMillis)));
        return C591500NHw.LIZ(pairArr);
    }
}
