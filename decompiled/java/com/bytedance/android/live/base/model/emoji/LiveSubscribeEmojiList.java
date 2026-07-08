package com.bytedance.android.live.base.model.emoji;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveSubscribeEmojiList {

    @C09CT("business_type")
    public final int businessType;

    @C09CT("emoji_list")
    public final List<LiveSubscribeEmojiModel> emojiModelList;

    @C09CT("preview_emoji")
    public final String previewEmoji;

    public LiveSubscribeEmojiList(int i, String str, List<LiveSubscribeEmojiModel> list) {
        this.businessType = i;
        this.previewEmoji = str;
        this.emojiModelList = list;
    }
}
