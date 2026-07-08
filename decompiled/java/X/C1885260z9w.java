package X;

import com.bytedance.android.livesdk.game.model.FeedItemList;
import com.bytedance.android.livesdk.game.model.ItemInfo;
import com.bytedance.android.livesdk.game.model.ItemStatisticsInfo;
import com.bytedance.android.livesdk.game.model.UrlInfo;
import com.bytedance.android.livesdk.game.model.VideoInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0z9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885260z9w {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1885340zA4());

    public static List LIZ(FeedItemList feedItemList) {
        List<ItemInfo> list;
        ItemStatisticsInfo itemStatisticsInfo;
        List list2;
        if (feedItemList != null && (list = feedItemList.items) != null) {
            ArrayList arrayList = new ArrayList();
            for (ItemInfo itemInfo : list) {
                VideoInfo videoInfo = itemInfo.videoInfo;
                if (videoInfo != null && (itemStatisticsInfo = itemInfo.statisticsInfo) != null) {
                    UrlInfo urlInfo = videoInfo.videoCover;
                    if (urlInfo == null || (list2 = urlInfo.urlList) == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    arrayList.add(new C1104220eqC(list2, itemStatisticsInfo.diggCountFmt, videoInfo.desc, itemInfo.id));
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
