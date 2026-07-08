package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipMixNetCacheConfig;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameMixCacheCardConfig;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameMixCacheConfig;
import com.bytedance.scene.Scene;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game_station.GameDetailHotHashtagResponse;
import webcast.api.game_station.GameDetailTranslateResponse;
import webcast.api.game_station.GameDetailVideosResponse;
import webcast.api.game_station.GameDetailVideosTabResponse;
import webcast.api.game_station.GameRegisterResponse;
import webcast.api.game_station.LiveFeedResponse;

/* JADX INFO: renamed from: X.0z4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881950z4b implements GameDetailPageApi {
    public int LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1881930z4Z());

    public C1881950z4b(int i) {
        this.LIZ = i;
    }

    public final boolean LIZ(String str) {
        GameMixCacheConfig config = GameLivePartnershipMixNetCacheConfig.INSTANCE.getConfig();
        if (!config.enable.contains(Integer.valueOf(this.LIZ))) {
            return false;
        }
        List<GameMixCacheCardConfig> list = config.cardConfig;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (GameMixCacheCardConfig gameMixCacheCardConfig : list) {
                if (Intrinsics.LJFF(gameMixCacheCardConfig.cardClass, str) && gameMixCacheCardConfig.enable) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi
    public final AbstractC19484711Kz<C470590Icr<GameDetailVideosResponse.ResponseData>> requestAnchorGameDetailVideos(final Map<String, String> map) {
        if (!LIZ("videos_card")) {
            C480460Ism.LIZ().getClass();
            return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestAnchorGameDetailVideos(map);
        }
        InterfaceC2098308Jx<C470590Icr<GameDetailVideosResponse.ResponseData>> interfaceC2098308Jx = new InterfaceC2098308Jx<C470590Icr<GameDetailVideosResponse.ResponseData>>(map) { // from class: X.0z4f
            public final Map<String, String> LIZ;

            @Override // X.InterfaceC2098308Jx
            public final String getPath() {
                return "/game_station/game_detail_videos/";
            }

            @Override // X.InterfaceC2098308Jx
            public final AbstractC19484711Kz<C470590Icr<GameDetailVideosResponse.ResponseData>> LIZ() {
                C480460Ism.LIZ().getClass();
                return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestAnchorGameDetailVideos(this.LIZ);
            }

            @Override // X.InterfaceC2098308Jx
            public final String getRequestId() {
                return C2098108Jv.LIZ(this);
            }

            @Override // X.InterfaceC2098308Jx
            public final Map<String, String> getParams() {
                return this.LIZ;
            }

            {
                this.LIZ = map;
            }
        };
        ((Set) this.LIZIZ.getValue()).add(C2098108Jv.LIZ(interfaceC2098308Jx));
        return C23218097w.LIZ(interfaceC2098308Jx);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi
    public final AbstractC19484711Kz<C470590Icr<GameDetailVideosTabResponse.ResponseData>> requestGameDetailVideosTab(final String str, final String str2) {
        if (!LIZ("videos_card")) {
            C480460Ism.LIZ().getClass();
            return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestGameDetailVideosTab(str, str2).LJJIII(2L).LJJIJIIJI(C11S5.LIZ());
        }
        InterfaceC2098308Jx<C470590Icr<GameDetailVideosTabResponse.ResponseData>> interfaceC2098308Jx = new InterfaceC2098308Jx<C470590Icr<GameDetailVideosTabResponse.ResponseData>>(str, str2) { // from class: X.0z4d
            public final String LIZ;
            public final String LIZIZ;

            @Override // X.InterfaceC2098308Jx
            public final Map<String, String> getParams() {
                return C2097608Jq.LJIIIIZZ(new Pair("game_id", this.LIZ), new Pair("game_tag_id", this.LIZIZ));
            }

            @Override // X.InterfaceC2098308Jx
            public final String getPath() {
                return "/game_station/game_detail/videos/tab/";
            }

            @Override // X.InterfaceC2098308Jx
            public final AbstractC19484711Kz<C470590Icr<GameDetailVideosTabResponse.ResponseData>> LIZ() {
                C480460Ism.LIZ().getClass();
                return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestGameDetailVideosTab(this.LIZ, this.LIZIZ).LJJIII(2L).LJJIJIIJI(C11S5.LIZ());
            }

            @Override // X.InterfaceC2098308Jx
            public final String getRequestId() {
                return C2098108Jv.LIZ(this);
            }

            {
                this.LIZ = str;
                this.LIZIZ = str2;
            }
        };
        ((Set) this.LIZIZ.getValue()).add(C2098108Jv.LIZ(interfaceC2098308Jx));
        return C23218097w.LIZ(interfaceC2098308Jx);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi
    public final AbstractC19484711Kz<C470590Icr<GameDetailHotHashtagResponse.ResponseData>> requestAnchorGameDetailHashTags(String str, String str2, int i, int i2) {
        C480460Ism.LIZ().getClass();
        return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestAnchorGameDetailHashTags(str, str2, i, i2);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi
    public final AbstractC19484711Kz<C470590Icr<GameDetailTranslateResponse.ResponseData>> requestGameDetailTranslate(long j, long j2, String str, String str2) {
        C480460Ism.LIZ().getClass();
        return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestGameDetailTranslate(j, j2, str, str2);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi
    public final AbstractC19484711Kz<String> requestEsportsMatchList(String str, long j, int i, int i2, int i3) {
        C480460Ism.LIZ().getClass();
        return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestEsportsMatchList(str, j, i, i2, i3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi
    public final AbstractC19484711Kz<C470590Icr<LiveFeedResponse.ResponseData>> requestLiveFeed(final String str, final String str2, final int i, final int i2, final String str3, final int i3, final String str4) {
        if (!LIZ("live_card")) {
            C480460Ism.LIZ().getClass();
            return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestLiveFeed(str, str2, i, i2, str3, i3, str4);
        }
        InterfaceC2098308Jx<C470590Icr<LiveFeedResponse.ResponseData>> interfaceC2098308Jx = new InterfaceC2098308Jx<C470590Icr<LiveFeedResponse.ResponseData>>(i, str, i2, str2, str3, i3, str4) { // from class: X.0z4e
            public final String LIZ;
            public final String LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public final String LJ;
            public final int LJFF;
            public final String LJI;

            @Override // X.InterfaceC2098308Jx
            public final Map<String, String> getParams() {
                return C2097608Jq.LJIIIIZZ(new Pair("game_tag_id", this.LIZ), new Pair("author_id", this.LIZIZ), new Pair(Scene.SCENE_SERVICE, String.valueOf(this.LIZJ)), new Pair("pull_type", String.valueOf(this.LIZLLL)), new Pair("game_id", this.LJ), new Pair("live_tab_type", String.valueOf(this.LJFF)), new Pair("req_from", this.LJI));
            }

            @Override // X.InterfaceC2098308Jx
            public final String getPath() {
                return "/game_station/game_detail/live_feed/";
            }

            @Override // X.InterfaceC2098308Jx
            public final AbstractC19484711Kz<C470590Icr<LiveFeedResponse.ResponseData>> LIZ() {
                C480460Ism.LIZ().getClass();
                return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestLiveFeed(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
            }

            @Override // X.InterfaceC2098308Jx
            public final String getRequestId() {
                return C2098108Jv.LIZ(this);
            }

            {
                this.LIZ = str;
                this.LIZIZ = str2;
                this.LIZJ = i;
                this.LIZLLL = i2;
                this.LJ = str3;
                this.LJFF = i3;
                this.LJI = str4;
            }
        };
        ((Set) this.LIZIZ.getValue()).add(C2098108Jv.LIZ(interfaceC2098308Jx));
        return C23218097w.LIZ(interfaceC2098308Jx);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi
    public final AbstractC19484711Kz<C470590Icr<GameRegisterResponse.ResponseData>> requestGameStationRegister(int i, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C480460Ism.LIZ().getClass();
        return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestGameStationRegister(i, str, z, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi
    public final AbstractC19484711Kz<C470590Icr<RawGameDetailHomeResponse$ResponseData>> requestAnchorGameDetailHomeV2(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (!GameLivePartnershipMixNetCacheConfig.INSTANCE.getConfig().enable.contains(Integer.valueOf(i))) {
            C480460Ism.LIZ().getClass();
            return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestAnchorGameDetailHomeV2(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10).LJJIII(2L).LJJIJIIJI(C11S5.LIZ());
        }
        C1881940z4a c1881940z4a = new C1881940z4a(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        ((Set) this.LIZIZ.getValue()).add(C2098108Jv.LIZ(c1881940z4a));
        return C23218097w.LIZ(c1881940z4a);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi
    public final AbstractC19484711Kz<C470590Icr<RawGameDetailHomeResponse$ResponseData>> requestGameDetailHomeV2DataByKey(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        C480460Ism.LIZ().getClass();
        return ((GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class)).requestGameDetailHomeV2DataByKey(str, i, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }
}
