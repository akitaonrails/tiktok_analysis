package com.bytedance.android.live.liveinteract.cohost.playentity;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class DesignatedGiftConfig {

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_image_urls")
    public List<String> giftImageUrls;

    @C09CT("gift_name")
    public String giftName;

    public DesignatedGiftConfig() {
        this(0L, "", C1697810uHb.LJIIJJI("https://p16-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png", "https://p19-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png"));
    }

    public DesignatedGiftConfig(long j, String str, List<String> list) {
        this.giftId = j;
        this.giftName = str;
        this.giftImageUrls = list;
    }
}
