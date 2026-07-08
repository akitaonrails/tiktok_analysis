package X;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.SortStatsTag;
import webcast.api.feed.SortStatsTags;

/* JADX INFO: renamed from: X.01q9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C456701q9 {
    public static final void LIZ(FeedItem feedItem, EnterRoomConfig enterRoomConfig) {
        String str;
        List<SortStatsTag> list;
        List<SortStatsTag> list2;
        List<SortStatsTag> list3;
        if (feedItem != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SortStatsTags sortStatsTags = feedItem.sortStatsTags;
            if (sortStatsTags != null && (list3 = sortStatsTags.forAppLog) != null) {
                for (SortStatsTag sortStatsTag : list3) {
                    linkedHashMap.put(sortStatsTag.key, sortStatsTag.value);
                }
            }
            if (!linkedHashMap.isEmpty()) {
                enterRoomConfig.mLogData.innerDrawSortStatsTag = linkedHashMap;
            }
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            SortStatsTags sortStatsTags2 = feedItem.sortStatsTags;
            if (sortStatsTags2 != null && (list2 = sortStatsTags2.forClientFunc) != null) {
                for (SortStatsTag sortStatsTag2 : list2) {
                    if (Intrinsics.LJFF(sortStatsTag2.key, "ttlive_survey_show_map")) {
                        str = sortStatsTag2.value;
                        break;
                    }
                }
                str = null;
            } else {
                str = null;
            }
            logData.innerDrawSortStatsClientFunc = str;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            SortStatsTags sortStatsTags3 = feedItem.sortStatsTags;
            if (sortStatsTags3 != null && (list = sortStatsTags3.forClientFunc) != null) {
                for (SortStatsTag sortStatsTag3 : list) {
                    linkedHashMap2.put(sortStatsTag3.key, sortStatsTag3.value);
                }
            }
            enterRoomConfig.mLogData.setInnerDrawSortStatsTagsForClientFun(linkedHashMap2);
        }
    }
}
