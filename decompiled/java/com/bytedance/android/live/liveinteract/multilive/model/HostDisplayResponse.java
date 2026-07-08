package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class HostDisplayResponse {

    @C09CT("data")
    public ResponseData data;

    /* JADX INFO: loaded from: classes16.dex */
    public static final class DisplayInfo {

        @C09CT("host_type")
        public long hostType;

        @C09CT("host_icon_background_url")
        public String hostIconBackgroundUrl = "";

        @C09CT("host_icon_url")
        public String hostIconUrl = "";

        @C09CT("host_color")
        public String hostColor = "";

        @C09CT("icon_link_url")
        public String iconLinkUrl = "";
    }

    public static final class ResponseData {

        @C09CT("display_info")
        public DisplayInfo displayInfo;
    }
}
