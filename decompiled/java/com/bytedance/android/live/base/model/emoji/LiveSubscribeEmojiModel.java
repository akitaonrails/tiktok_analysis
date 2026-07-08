package com.bytedance.android.live.base.model.emoji;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveSubscribeEmojiModel {

    @C09CT("business_type")
    public final int businessType;

    @C09CT("preview_emoji")
    public final String previewEmoji;

    public LiveSubscribeEmojiModel(int i, String str) {
        this.businessType = i;
        this.previewEmoji = str;
    }
}
