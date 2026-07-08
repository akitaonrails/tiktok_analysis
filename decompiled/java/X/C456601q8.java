package X;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.LinkedHashMap;
import java.util.List;
import webcast.api.feed.SortStatsTag;
import webcast.api.feed.SortStatsTags;

/* JADX INFO: renamed from: X.01q8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C456601q8 {
    public static final void LIZ(FeedItem feedItem, EnterRoomConfig enterRoomConfig) {
        List<SortStatsTag> list;
        if (feedItem != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SortStatsTags sortStatsTags = feedItem.sortStatsTags;
            if (sortStatsTags != null && (list = sortStatsTags.forAppLog) != null) {
                for (SortStatsTag sortStatsTag : list) {
                    linkedHashMap.put(sortStatsTag.key, sortStatsTag.value);
                }
            }
            if (!linkedHashMap.isEmpty()) {
                enterRoomConfig.mLogData.innerDrawSortStatsTag = linkedHashMap;
            }
        }
    }
}
