package com.bytedance.android.live.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageTypeConfig {
    public static final TypeAdapter ADAPTER = new MessageTypeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("comment")
    public MessageType commentFreq;

    @C09CT("follow")
    public MessageType followFreq;

    @C09CT("gift")
    public MessageType giftFreq;

    @C09CT("others")
    public MessageType othersFreq;

    @C09CT("share")
    public MessageType shareFreq;

    public MessageTypeConfig() {
        this(null, null, null, null, null);
    }

    public MessageTypeConfig(MessageType messageType, MessageType messageType2, MessageType messageType3, MessageType messageType4, MessageType messageType5) {
        this.giftFreq = messageType;
        this.shareFreq = messageType2;
        this.followFreq = messageType3;
        this.commentFreq = messageType4;
        this.othersFreq = messageType5;
    }
}
