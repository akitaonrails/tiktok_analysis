package com.bytedance.android.live.publicscreen.impl.api.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;

/* JADX INFO: loaded from: classes18.dex */
public final class AutoTranslateParams {

    @C09CT("anchor_id")
    public final long anchorId;

    @C09CT("room_id")
    public final long roomId;

    @C09CT("sec_anchor_id")
    public final String secAnchorId;

    @C09CT("texts")
    public final MGetTranslationRequest.Text[] texts;

    public AutoTranslateParams(long j, long j2, String str, MGetTranslationRequest.Text[] textArr) {
        this.roomId = j;
        this.anchorId = j2;
        this.secAnchorId = str;
        this.texts = textArr;
    }
}
