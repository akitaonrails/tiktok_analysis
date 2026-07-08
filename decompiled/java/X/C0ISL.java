package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveWbcSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.SortStatsTag;
import webcast.api.feed.SortStatsTags;

/* JADX INFO: renamed from: X.0ISL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ISL {
    public static void LIZ(FeedItem feedItem, EnterRoomConfig enterRoomConfig) {
        List<SortStatsTag> list;
        SortStatsTag next;
        if (LiveWbcSetting.INSTANCE.enablePassThrough()) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            SortStatsTags sortStatsTags = feedItem.sortStatsTags;
            String str = null;
            if (sortStatsTags != null && (list = sortStatsTags.forClientFunc) != null) {
                Iterator<SortStatsTag> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.key, "whitebox_tag")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                SortStatsTag sortStatsTag = next;
                if (sortStatsTag != null) {
                    str = sortStatsTag.value;
                }
            }
            roomsData.wbcTag = str;
        }
    }
}
