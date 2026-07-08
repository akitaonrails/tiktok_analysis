package X;

import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0IWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467900IWm implements C0IZ7 {
    public boolean LIZ = true;

    @Override // X.C0IZ7
    public final String LIZIZ() {
        return "enter_auto_vertical_game";
    }

    @Override // X.C0IZ7
    public final String LJI() {
        return "vertical_game_refresh";
    }

    @Override // X.C0IZ7
    public final void release() {
    }

    @Override // X.C0IZ7
    public final String LIZ() {
        return this.LIZ ? "vertical_game_loadmore" : "vertical_game_no_more";
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
        return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "enter_auto_vertical_game", j, map);
    }

    @Override // X.C0IZ7
    public final C11NZ<BaseListResponse<FeedItem, FeedExtra>> LJFF(long j, long j2, Map<String, String> map) {
        this.LIZ = true;
        C480460Ism.LIZ().getClass();
        return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "vertical_game_refresh", j, map);
    }

    @Override // X.C0IZ7
    public final C11NZ LIZLLL(Map map, long j, long j2, long j3) {
        if (this.LIZ) {
            C480460Ism.LIZ().getClass();
            return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), j, "vertical_game_loadmore", j2, (Map<String, String>) map);
        }
        C480460Ism.LIZ().getClass();
        return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), j, "vertical_game_no_more", j2, (Map<String, String>) map);
    }
}
