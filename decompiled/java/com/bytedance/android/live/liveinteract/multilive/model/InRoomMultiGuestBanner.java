package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes16.dex */
public final class InRoomMultiGuestBanner {

    @C09CT("Action")
    public BannerAction action;

    @C09CT("content")
    public BannerContentMultiGuest content;

    @C09CT("end_time")
    public long endTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("name")
    public String name = "";

    @C09CT("start_time")
    public long startTime;
}
