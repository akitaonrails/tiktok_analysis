package X;

import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473360IhK implements InterfaceC473370IhL {
    public static final C473360IhK LIZ = new C473360IhK();

    public static final Pair LIZ(Map map) {
        C480460Ism.LIZ().getClass();
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feedCall("/webcast/feed/", 0L, "tiktok_friends_skylight", map).execute().LIZIZ;
        return new Pair(baseListResponse.data, baseListResponse.LIZLLL);
    }
}
