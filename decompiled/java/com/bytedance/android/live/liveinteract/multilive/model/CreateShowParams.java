package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.MgTraceInfo;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: loaded from: classes.dex */
public final class CreateShowParams {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("mg_trace_info")
    public MgTraceInfo mgTraceInfo;

    @C09CT("room_id")
    public long roomId;

    @C09CT("show_config")
    public ShowConfig showConfig;

    @C09CT("show_users")
    public List<ListUser> showUsers = new ArrayList();

    public static final class ListUser {

        @C09CT("linkmic_id")
        public String linkmicId = "";

        @C09CT("order")
        public int order;

        @C09CT("user_id")
        public long userId;
    }
}
