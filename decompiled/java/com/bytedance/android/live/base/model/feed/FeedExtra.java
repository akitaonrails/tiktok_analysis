package com.bytedance.android.live.base.model.feed;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.n;
import java.util.List;
import webcast.api.feed.LiveTab;
import webcast.data.NearbyTabConfig;

/* JADX INFO: loaded from: classes.dex */
public class FeedExtra extends Extra {

    @C09CT("banner")
    public FeedBannerContainer bannerContainer;

    @C09CT("cost")
    public long cost;

    @C09CT("hashtag_text")
    public String hashtag_text;

    @C09CT("log_pb")
    public n jsonLogPb;

    @C09CT("max_time")
    public long maxTime;

    @C09CT("min_time")
    public long minTime;

    @C09CT("nearby_tab_config")
    public NearbyTabConfig nearbyTabConfig;
    public String passThroughText;
    public transient LogPb protoLogPb;

    @C09CT("req_id")
    public String reqId;

    @C09CT("style")
    public int style;

    @C09CT("tabs")
    public List<LiveTab> tabs;

    @C09CT("total")
    public int total;

    @C09CT("unread_extra")
    public String unreadExtra;

    @C09CT("exit_guide_music")
    public String exitGuideMusic = "";

    @C09CT("search_id")
    public String searchId = "";

    @C09CT("request_source")
    public String requestSource = "";

    @C09CT("no_result_reason")
    public String noResultReason = "";

    @C09CT("ocean_req_info")
    public String oceanReqInfo = "";

    @C09CT("exit_guide")
    public String exitGuide = "";

    public static final class LogPb {

        @C09CT("impr_id")
        public String content;

        @C09CT("session_id")
        public long sessionId;
    }

    public n getLogPb() {
        if (this.protoLogPb == null) {
            return this.jsonLogPb;
        }
        n nVarLJIILIIL = GsonProtectorUtils.toJsonTree(new Gson(), this.protoLogPb).LJIILIIL();
        this.jsonLogPb = nVarLJIILIIL;
        this.protoLogPb = null;
        return nVarLJIILIIL;
    }

    public String getHashtag_text() {
        return this.hashtag_text;
    }

    public void setHashtag_text(String str) {
        this.hashtag_text = str;
    }
}
