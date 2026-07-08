package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SendStageReactionReq {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("reaction_resource")
    public StageReactionResource reactionResource;

    @C09CT("room_id")
    public long roomId;

    @C09CT("to_reaction_user_ids")
    public List<Long> toReactionUserIds = new ArrayList();
}
