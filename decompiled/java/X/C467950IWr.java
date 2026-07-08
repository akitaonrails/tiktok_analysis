package X;

import Y.AfS176S0100000_7;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0IWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467950IWr implements C0IZ7 {
    public boolean LIZ = true;
    public boolean LIZIZ = true;

    @Override // X.C0IZ7
    public final String LIZIZ() {
        return "tikcast_game_drawer_guessing_refresh";
    }

    @Override // X.C0IZ7
    public final String LJI() {
        return "tikcast_game_drawer_guessing_refresh";
    }

    @Override // X.C0IZ7
    public final void release() {
    }

    @Override // X.C0IZ7
    public final String LIZ() {
        return this.LIZ ? "tikcast_game_drawer_guessing_loadmore" : this.LIZIZ ? "tikcast_game_drawer_sub_feed_refresh" : "tikcast_game_drawer_sub_feed_loadmore";
    }

    @Override // X.C0IZ7
    public final String getUrl() {
        return C467890IWl.LIZ();
    }

    public static List LJII(List list, boolean z) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C00UG((FeedItem) it2.next(), z));
        }
        return arrayList;
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
        return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "tikcast_game_drawer_guessing_refresh", j2, j, map).LJJIJIIJIL(new AfS176S0100000_7(this, 294));
    }

    @Override // X.C0IZ7
    public final C11NZ<BaseListResponse<FeedItem, FeedExtra>> LJFF(long j, long j2, Map<String, String> map) {
        this.LIZ = true;
        this.LIZIZ = true;
        C480460Ism.LIZ().getClass();
        return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "tikcast_game_drawer_guessing_refresh", j2, j, map).LJJIJIIJIL(new AfS176S0100000_7(this, 295));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0IZ7
    public final C11NZ LIZLLL(Map map, long j, long j2, long j3) {
        Map map2;
        if (!this.LIZ) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("related_live_tag", "game_all");
            map2 = linkedHashMap;
        } else {
            map2 = map;
        }
        String strLIZ = LIZ();
        C480460Ism.LIZ().getClass();
        return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, strLIZ, j3, j2, (Map<String, String>) map2).LJJIJIIJIL(new AfS176S0100000_7(this, 296));
    }
}
