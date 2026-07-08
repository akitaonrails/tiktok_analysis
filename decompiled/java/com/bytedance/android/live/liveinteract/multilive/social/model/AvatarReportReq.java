package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarReportReq {

    @C09CT("applier")
    public Player applier;

    @C09CT("avatar_id")
    public long avatarId;

    @C09CT("avatar_owner_id")
    public long avatarOwnerId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("image_uri")
    public String imageUri = "";

    @C09CT("text")
    public String text = "";
}
