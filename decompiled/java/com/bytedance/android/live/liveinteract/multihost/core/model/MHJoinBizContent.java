package com.bytedance.android.live.liveinteract.multihost.core.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestSetting;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PopupStateChangeContent;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.List;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: loaded from: classes.dex */
public final class MHJoinBizContent {
    public PopupStateChangeContent LIZIZ;
    public Integer LIZLLL;

    @C09CT("ab_test_setting")
    public List<CohostABTestSetting> abTestSetting;

    @C09CT("biz_extra")
    public JoinGroupMessageExtra bizExtra;

    @C09CT("dialog")
    public PerceptionDialogInfo dialog;

    @C09CT("from_room_age_restricted")
    public int fromRoomAgeRestricted;

    @C09CT("from_tag")
    public RivalExtraInfo.Tag fromTag;

    @C09CT("matched_preference_tag")
    public int matchedPreferenceTag;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("tagV2")
    public TagV2 tagV2;
    public String LIZ = "";
    public String LIZJ = "";
}
