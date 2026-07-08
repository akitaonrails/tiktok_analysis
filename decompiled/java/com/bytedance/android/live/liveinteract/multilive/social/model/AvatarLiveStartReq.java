package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes16.dex */
public final class AvatarLiveStartReq {

    @C09CT("applier")
    public Player applier;

    @C09CT("avatar_id")
    public long avatarId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("pre_avatar_id")
    public long preAvatarId;

    @C09CT("pre_avatar_live_second")
    public long preAvatarLiveSecond;
}
