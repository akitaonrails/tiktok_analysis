package com.bytedance.android.feed.api;

import X.C09SO;
import X.C0X9S;
import X.C11NZ;
import X.EnumC1846380y9E;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501320pAg;
import X.InterfaceC2174708fZ;
import X.InterfaceC519150KXp;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface FeedApi {
    @InterfaceC519150KXp(enableTag = "feed_sub")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> drawerDropsFeed(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("channel_id") String str3, @InterfaceC1501070pAH("draw_room_id") long j2, @InterfaceC1501070pAH("draw_room_owner_id") long j3, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "top_live_first_fetch")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("is_draw") long j2, @InterfaceC1501070pAH("draw_room_id") long j3, @InterfaceC1501070pAH("draw_room_owner_id") long j4, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "esports_feed")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("draw_room_owner_id") long j2, @InterfaceC1501070pAH("draw_room_id") long j3, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "game_tab_feed")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("draw_room_id") long j2, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "top_live_first_fetch")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("channel_id") String str3, @InterfaceC1501070pAH("is_draw") long j2, @InterfaceC1501070pAH("draw_room_id") long j3, @InterfaceC1501070pAH("draw_room_owner_id") long j4, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "feed_sub")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("ec_template_id") String str3, @InterfaceC1501070pAH("draw_room_id") long j2, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "feed_sub")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("channel_id") String str3, @InterfaceC1501070pAH("draw_room_id") String str4, @InterfaceC1501070pAH("draw_room_owner_id") String str5, @InterfaceC1501070pAH("hashtag_id") long j2, @InterfaceC1501070pAH("style") long j3, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "normal_feed")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "feed_sub")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("draw_room_id") String str3, @InterfaceC1501070pAH("related_live_tag") String str4, @InterfaceC1501070pAH("count") int i);

    @InterfaceC519150KXp(enableTag = "normal_feed")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "feed_skylight")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C0X9S<BaseListResponse<FeedItem, FeedExtra>> feedCall(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "feed_sub")
    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feedSub(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("draw_room_owner_id") long j2, @InterfaceC1501070pAH("channel_id") String str3, @InterfaceC1501070pAH("related_live_tag") String str4, @InterfaceC1501070pAH("draw_room_id") long j3, @InterfaceC1501130pAN Map<String, String> map);

    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC519150KXp(enableTag = "draw_room_list_feed")
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> feedV2(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC1501150pAP Map<String, String> map2);

    @InterfaceC1501160pAQ
    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(2)
    @InterfaceC519150KXp(enableTag = "draw_room_list_feed")
    @InterfaceC1501290pAd(4)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> highLevelFeed(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map);

    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(2)
    @InterfaceC519150KXp(enableTag = "draw_room_list_feed")
    @InterfaceC1501290pAd(4)
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> highLevelFeedV2(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC1501150pAP Map<String, String> map2);
}
