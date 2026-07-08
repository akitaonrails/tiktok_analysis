package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;

/* JADX INFO: loaded from: classes.dex */
public final class LetViewerSingResp {

    @C09CT("applier_ext_info")
    public RTCExtraInfo applierExtInfo;

    @C09CT("applier_link_mic_id")
    public String applierLinkMicId = "";

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("is_only_add_song")
    public boolean isOnlyAddSong;

    @C09CT("multi_guest_resp_extra")
    public BizApplyResponse multiGuestRespExtra;
}
