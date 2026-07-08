package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.mix.game.api.GameFeedMixApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.api.game.FeedItemList;
import webcast.api.game.FeedRequestParams;
import webcast.api.game.FeedResponse;

/* JADX INFO: renamed from: X.0Cya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331180Cya {
    public static final /* synthetic */ C331180Cya LIZ = new C331180Cya();
    public static final GameFeedMixApi LIZIZ;

    static {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        sbLIZ.append((iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null) ? null : interfaceC20673515v3K4.LLIIIJ());
        LIZIZ = (GameFeedMixApi) iRetrofitFactory.createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(GameFeedMixApi.class);
    }

    public static C11O8 LIZ(FeedRequestParams feedRequestParams) {
        Map<String, Object> map = C1338270kvh.LIZ;
        return LIZIZ.requestBottomBarFeed(feedRequestParams).LJL(C11S5.LIZ()).LJJLIIIJJIZ(1L).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0Dd1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                ?? arrayList;
                boolean z;
                FeedResponse.ResponseData responseData;
                FeedResponse.ResponseData responseData2;
                FeedItemList feedItemList;
                List<String> list;
                User user;
                BaseResponse baseResponse = (BaseResponse) obj;
                Gson gson = ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson();
                FeedResponse feedResponse = (FeedResponse) baseResponse.data;
                if (feedResponse != null && (responseData2 = feedResponse.data) != null && (feedItemList = responseData2.items) != null && (list = feedItemList.awemeDetails) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Aweme aweme = (Aweme) GsonProtectorUtils.fromJson(gson, it2.next(), Aweme.class);
                        if (AwemeSaaSExtKt.isLive(aweme)) {
                            LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                            if (newLiveRoomDataExt != null) {
                                user = newLiveRoomDataExt.owner;
                            } else {
                                user = null;
                            }
                            aweme.setAuthor(user);
                        }
                        arrayList.add(aweme);
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                FeedResponse feedResponse2 = (FeedResponse) baseResponse.data;
                if (feedResponse2 != null && (responseData = feedResponse2.data) != null) {
                    z = responseData.hasMore;
                } else {
                    z = false;
                }
                return new C331140CyW(z, arrayList);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}
