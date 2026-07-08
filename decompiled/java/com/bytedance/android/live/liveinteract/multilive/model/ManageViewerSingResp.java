package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ManageViewerSingResp {

    @C09CT("applier")
    public Player applier;

    @C09CT("applier_pos")
    public MicPositionData applierPos;

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("is_invoke_linkmic")
    public boolean isInvokeLinkmic;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("permiter_ext_info")
    public RTCExtraInfo permiterExtInfo;

    @C09CT("permiter_link_mic_id")
    public String permiterLinkMicId = "";

    @C09CT("applier_link_mic_id")
    public String applierLinkMicId = "";

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions = new ArrayList();

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos = new ArrayList();

    @C09CT("spot_list")
    public List<SpotInfo> spotList = new ArrayList();
}
