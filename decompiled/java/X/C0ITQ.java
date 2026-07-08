package X;

import Y.AkS323S0200000_7;
import android.util.Pair;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ITQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ITQ implements InterfaceC466780ISe {
    public boolean LIZ = true;
    public boolean LIZIZ = true;
    public final C13E8<Long> LIZJ = new C13E8<>(2);

    @Override // X.InterfaceC466780ISe
    public final void LJ(EnterRoomConfig enterRoomConfig, boolean z) {
    }

    public final boolean LJFF() {
        return this.LIZJ.size() >= 2 && System.currentTimeMillis() - this.LIZJ.get(0).longValue() <= 30;
    }

    public final void LJI(BaseListResponse<FeedItem, FeedExtra> baseListResponse) {
        List<FeedItem> list = baseListResponse.data;
        if (list == null || list.isEmpty()) {
            if (this.LIZJ.size() == 2) {
                this.LIZJ.removeFirst();
            }
            this.LIZJ.addLast(Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // X.InterfaceC466780ISe
    public final void LIZ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2) {
        if (enterRoomConfig == null || enterRoomConfig2 == null) {
            return;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        roomsData.enterMethod = roomsData2.enterMethod;
        roomsData.enterFromMerge = roomsData2.enterFromMerge;
        enterRoomConfig2.drawParams = enterRoomConfig.drawParams;
        roomsData.gameLiveExtra = roomsData2.gameLiveExtra;
    }

    @Override // X.InterfaceC466780ISe
    public final C11O8 LIZIZ(long[] jArr, EnterRoomConfig enterRoomConfig) {
        return C466800ISg.LIZ(jArr);
    }

    @Override // X.InterfaceC466780ISe
    public final C11NZ<C0ITM<Pair<List<FeedItem>, FeedExtra>>> LIZJ(String str, C466790ISf c466790ISf, long j) {
        String str2;
        if (LJFF()) {
            return C11NZ.LJJIJLIJ(new Exception("request limit"));
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        if (this.LIZ) {
            str2 = "tikcast_game_drawer_inner_guessing_refresh";
        } else {
            str2 = "tikcast_game_drawer_inner_guessing_loadmore";
        }
        pairArr[0] = new kotlin.Pair("req_from", str2);
        pairArr[1] = new kotlin.Pair("max_time", CardStruct.IStatusCode.DEFAULT);
        pairArr[2] = new kotlin.Pair("draw_room_id", str);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C480460Ism.LIZ().getClass();
        return ((FeedApi) C480460Ism.LIZIZ(FeedApi.class)).feed(c466790ISf.LIZ, mapLJIIJ).LJJJJZI(new AkS323S0200000_7(this, c466790ISf, 6));
    }

    @Override // X.InterfaceC466780ISe
    public final C11NZ<C0ITM<Pair<List<FeedItem>, FeedExtra>>> LIZLLL(String str, C466790ISf c466790ISf, long j) {
        String str2;
        if (LJFF()) {
            return C11NZ.LJJIJLIJ(new Exception("request limit"));
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        if (this.LIZIZ) {
            str2 = "tikcast_game_drawer_inner_sub_feed_refresh";
        } else {
            str2 = "tikcast_game_drawer_inner_sub_feed_loadmore";
        }
        pairArr[0] = new kotlin.Pair("req_from", str2);
        pairArr[1] = new kotlin.Pair("max_time", CardStruct.IStatusCode.DEFAULT);
        pairArr[2] = new kotlin.Pair("draw_room_id", str);
        pairArr[3] = new kotlin.Pair("related_live_tag", "game_all");
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C480460Ism.LIZ().getClass();
        return ((FeedApi) C480460Ism.LIZIZ(FeedApi.class)).feed(c466790ISf.LIZ, mapLJIIJ).LJJJJZI(new AkS323S0200000_7(this, c466790ISf, 7));
    }
}
