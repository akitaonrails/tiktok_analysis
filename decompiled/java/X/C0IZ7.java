package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0IZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0IZ7 {
    String LIZ();

    String LIZIZ();

    C11NZ<BaseListResponse<FeedItem, FeedExtra>> LIZJ(long j, long j2, Map<String, String> map);

    C11NZ LIZLLL(Map map, long j, long j2, long j3);

    void LJ(List<FeedItem> list, FeedExtra feedExtra);

    C11NZ<BaseListResponse<FeedItem, FeedExtra>> LJFF(long j, long j2, Map<String, String> map);

    String LJI();

    String getUrl();

    void release();
}
