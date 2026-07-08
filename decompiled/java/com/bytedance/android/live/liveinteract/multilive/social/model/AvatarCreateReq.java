package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes16.dex */
public final class AvatarCreateReq {

    @C09CT("applier")
    public Player applier;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("image_uri")
    public String imageUri = "";

    @C09CT("style_id")
    public long styleId;
}
