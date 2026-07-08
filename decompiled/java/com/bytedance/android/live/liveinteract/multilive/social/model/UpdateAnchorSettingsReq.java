package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateAnchorSettingsReq {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("room_id")
    public long roomId;

    @C09CT("share_recording_to_guests_status")
    public int shareRecordingToGuestsStatus;
}
