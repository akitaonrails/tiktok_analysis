package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;
import tikcast.linkmic.common.MgTraceInfo;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public final class EnlargeScreenManageParams {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("guest_user_id")
    public long guestUserId;

    @C09CT("is_reject_enlarge_screen")
    public int isRejectEnlargeScreen;

    @C09CT("mg_trace_info")
    public MgTraceInfo mgTraceInfo;

    @C09CT("operate_user_id")
    public long operateUserId;

    @C09CT("operated_position")
    public PosIdentity operatedPosition;

    @C09CT("replaced_pos")
    public List<PosIdentity> replacedPos;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("linkmic_id")
    public String linkmicId = "";

    @C09CT("layout_id")
    public String layoutId = "";

    @C09CT("target_position")
    public String targetPosition = "";
}
