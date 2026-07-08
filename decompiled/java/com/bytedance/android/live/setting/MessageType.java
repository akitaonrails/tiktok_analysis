package com.bytedance.android.live.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageType {
    public static final TypeAdapter ADAPTER;

    @C09CT("per_message_frequency")
    public int threshold;

    static {
        NormalGson.singleton();
        ADAPTER = new MessageType_OptTypeAdapter();
    }

    public MessageType() {
        this(0);
    }

    public MessageType(int i) {
        this.threshold = i;
    }
}
