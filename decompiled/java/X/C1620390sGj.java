package X;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.common.CommonInfoForClient;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0sGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1620390sGj implements InterfaceC1487280oo2 {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ ComposePbAndJson LLILLJJLI;

    public /* synthetic */ C1620390sGj(ComposePbAndJson composePbAndJson, Integer num) {
        this.LL = num;
        this.LLILLJJLI = composePbAndJson;
    }

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        C1620470sGr c1620470sGr;
        String str;
        Integer num = this.LL;
        ComposePbAndJson composePbAndJson = this.LLILLJJLI;
        C1620570sH1 c1620570sH1 = (C1620570sH1) obj;
        SystemClock.elapsedRealtime();
        try {
            C592002So c592002So = new C592002So(c1620570sH1.status_code, null, null, c1620570sH1.has_more, c1620570sH1.aweme_list, null, null, null, null, null, null, null, new ArrayList(), c1620570sH1.status_msg, null, new ArrayList(), null, null, null, null, null, null, null, new ArrayList(), null, null, null, null, null, null, null, null, null, new ArrayList(), null);
            FeedItemList feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(c592002So, null);
            if (num != null) {
                if (feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                    feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
                    C714102qZ c714102qZ = c1620570sH1.log_pb;
                    if (c714102qZ != null) {
                        composePbAndJson.setRequestId(c714102qZ.impr_id);
                    }
                    c1620470sGr = c1620570sH1.common_info_for_client;
                    if (c1620470sGr != null && ((str = c1620470sGr.user_high_active_time) != null || c1620470sGr.region_high_active_time != null)) {
                        feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.commonInfoForClient = new CommonInfoForClient(str, c1620470sGr.region_high_active_time);
                    }
                }
            } else if (feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                c1620470sGr = c1620570sH1.common_info_for_client;
                if (c1620470sGr != null) {
                    feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.commonInfoForClient = new CommonInfoForClient(str, c1620470sGr.region_high_active_time);
                }
            }
            SystemClock.elapsedRealtime();
            return feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("errMsg", Log.getStackTraceString(th));
            C794420VEi.LIZIZ("service_monitor", "log_bean_copy_convert_error", c2241008qG.LJ());
            C1516320pYs c1516320pYs = new C1516320pYs(th);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", c1516320pYs);
            C1AF0.LJ(c1516320pYs);
            return new FeedItemList();
        }
    }
}
