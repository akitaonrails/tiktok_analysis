package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarGetReq {

    @C09CT("applier")
    public Player applier;

    @C09CT("avatar_id")
    public long avatarId;

    @C09CT("avatar_owner_user_id")
    public long avatarOwnerUserId;

    @C09CT("common")
    public LinkCommon common;
}
