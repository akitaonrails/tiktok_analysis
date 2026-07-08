package X;

import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ids, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C471220Ids extends C2217421BqW implements Function1<C469770IbX, C0IZ7> {
    public C471220Ids(Object obj) {
        super(1, obj, C471280Idy.class, "createDataFlow", "createDataFlow(Lcom/bytedance/android/feed/api/DrawerExtraData;)Lcom/bytedance/android/livesdk/feed/drawerfeed/base/IDrawerDataFlow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0IZ7 invoke(C469770IbX c469770IbX) {
        this.receiver.getClass();
        return new C0IZ7() { // from class: X.0IWt
            public boolean LIZ = true;
            public boolean LIZIZ = true;
            public String LIZJ = "";

            @Override // X.C0IZ7
            public final String LIZ() {
                return "tikcast_game_drawer_same_title_drops_loadmore";
            }

            @Override // X.C0IZ7
            public final String LIZIZ() {
                return "tikcast_game_drawer_same_title_drops_refresh";
            }

            @Override // X.C0IZ7
            public final String LJI() {
                return "tikcast_game_drawer_same_title_drops_refresh";
            }

            @Override // X.C0IZ7
            public final void release() {
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
                this.LIZIZ = true;
                C480460Ism.LIZ().getClass();
                return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).drawerDropsFeed(C467890IWl.LIZ(), 0L, "tikcast_game_drawer_same_title_drops_refresh", "1111003", j, j2, map);
            }

            @Override // X.C0IZ7
            public final C11NZ<BaseListResponse<FeedItem, FeedExtra>> LJFF(long j, long j2, Map<String, String> map) {
                this.LIZ = true;
                this.LIZIZ = true;
                C480460Ism.LIZ().getClass();
                return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).drawerDropsFeed(C467890IWl.LIZ(), 0L, "tikcast_game_drawer_same_title_drops_refresh", "1111003", j, j2, map);
            }

            @Override // X.C0IZ7
            public final C11NZ LIZLLL(Map map, long j, long j2, long j3) {
                String str;
                if (this.LIZ) {
                    str = "tikcast_game_drawer_same_title_drops_loadmore";
                } else if (this.LIZIZ) {
                    this.LIZIZ = false;
                    str = "tikcast_game_drawer_other_title_drops_refresh";
                } else {
                    str = "tikcast_game_drawer_other_title_drops_loadmore";
                }
                this.LIZJ = str;
                C480460Ism.LIZ().getClass();
                return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).drawerDropsFeed(C467890IWl.LIZ(), 0L, this.LIZJ, "1111003", j2, j3, map);
            }
        };
    }
}
