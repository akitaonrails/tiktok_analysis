package X;

import Y.AfS176S0100000_7;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Idg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C471100Idg extends C2217421BqW implements Function1<C469770IbX, C0IZ7> {
    public C471100Idg(Object obj) {
        super(1, obj, C471250Idv.class, "createDataFlow", "createDataFlow(Lcom/bytedance/android/feed/api/DrawerExtraData;)Lcom/bytedance/android/livesdk/feed/drawerfeed/base/IDrawerDataFlow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0IZ7 invoke(C469770IbX c469770IbX) {
        this.receiver.getClass();
        return new C0IZ7() { // from class: X.0IWp
            public boolean LIZ = true;

            @Override // X.C0IZ7
            public final String LIZIZ() {
                return "tikcast_game_enter_auto_drawer_sub_feed";
            }

            @Override // X.C0IZ7
            public final String LJI() {
                return "tikcast_game_drawer_sub_feed_refresh";
            }

            @Override // X.C0IZ7
            public final void release() {
            }

            @Override // X.C0IZ7
            public final String LIZ() {
                return this.LIZ ? "tikcast_game_drawer_sub_feed_loadmore" : "drawer_loadmore";
            }

            @Override // X.C0IZ7
            public final String getUrl() {
                return C467890IWl.LIZ();
            }

            @Override // X.C0IZ7
            public final void LJ(List<FeedItem> list, FeedExtra feedExtra) {
                if (this.LIZ) {
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.isEmpty() || !feedExtra.hasMore) {
                        FeedItem feedItem = new FeedItem();
                        feedItem.type = 1005;
                        feedItem.setRoom(new Room());
                        arrayList.add(feedItem);
                        feedExtra.hasMore = true;
                        this.LIZ = false;
                    }
                }
            }

            @Override // X.C0IZ7
            public final C11NZ<BaseListResponse<FeedItem, FeedExtra>> LIZJ(long j, long j2, Map<String, String> map) {
                this.LIZ = true;
                C480460Ism.LIZ().getClass();
                return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feedSub(C467890IWl.LIZ(), 0L, "tikcast_game_enter_auto_drawer_sub_feed", j2, "1111008", "game_all", j, map).LJJIJIIJIL(new AfS176S0100000_7(this, 285));
            }

            @Override // X.C0IZ7
            public final C11NZ<BaseListResponse<FeedItem, FeedExtra>> LJFF(long j, long j2, Map<String, String> map) {
                this.LIZ = true;
                C480460Ism.LIZ().getClass();
                return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feedSub(C467890IWl.LIZ(), 0L, "tikcast_game_drawer_sub_feed_refresh", j2, "1111008", "game_all", j, map).LJJIJIIJIL(new AfS176S0100000_7(this, 286));
            }

            @Override // X.C0IZ7
            public final C11NZ LIZLLL(Map map, long j, long j2, long j3) {
                if (this.LIZ) {
                    C480460Ism.LIZ().getClass();
                    return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feedSub(C467890IWl.LIZ(), 0L, "tikcast_game_drawer_sub_feed_loadmore", j3, "1111008", "game_all", j2, map);
                }
                C480460Ism.LIZ().getClass();
                return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), j, "drawer_loadmore", j2, (Map<String, String>) map);
            }
        };
    }
}
