package X;

import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Idt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C471230Idt extends C2217421BqW implements Function1<C469770IbX, C0IZ7> {
    public C471230Idt(Object obj) {
        super(1, obj, C471290Idz.class, "createDataFlow", "createDataFlow(Lcom/bytedance/android/feed/api/DrawerExtraData;)Lcom/bytedance/android/livesdk/feed/drawerfeed/base/IDrawerDataFlow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0IZ7 invoke(C469770IbX c469770IbX) {
        this.receiver.getClass();
        return new C0IZ7() { // from class: X.0IWo
            @Override // X.C0IZ7
            public final String LIZ() {
                return "tiktok_live_game_drawer";
            }

            @Override // X.C0IZ7
            public final String LIZIZ() {
                return "tiktok_live_game_drawer";
            }

            @Override // X.C0IZ7
            public final void LJ(List<FeedItem> list, FeedExtra feedExtra) {
            }

            @Override // X.C0IZ7
            public final String LJI() {
                return "tiktok_live_game_drawer";
            }

            @Override // X.C0IZ7
            public final void release() {
            }

            @Override // X.C0IZ7
            public final String getUrl() {
                return C467890IWl.LIZ();
            }

            @Override // X.C0IZ7
            public final C11NZ<BaseListResponse<FeedItem, FeedExtra>> LIZJ(long j, long j2, Map<String, String> map) {
                C480460Ism.LIZ().getClass();
                return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "tiktok_live_game_drawer", j2, j, map);
            }

            @Override // X.C0IZ7
            public final C11NZ<BaseListResponse<FeedItem, FeedExtra>> LJFF(long j, long j2, Map<String, String> map) {
                C480460Ism.LIZ().getClass();
                return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "tiktok_live_game_drawer", j2, j, map);
            }

            @Override // X.C0IZ7
            public final C11NZ LIZLLL(Map map, long j, long j2, long j3) {
                C480460Ism.LIZ().getClass();
                return ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "tiktok_live_game_drawer", j3, j2, (Map<String, String>) map);
            }
        };
    }
}
