package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* JADX INFO: loaded from: classes.dex */
public final class CreateInfoPerceptionMessage {

    @C09CT("access_type")
    public int accessType;

    @C09CT("detail_url")
    public String detailUrl;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("title")
    public String title = "";
}
