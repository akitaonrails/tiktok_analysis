package com.bytedance.android.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class QuickEmojiConfig {
    public static final TypeAdapter ADAPTER = new QuickEmojiConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("quick_comment_forbidden")
    public boolean isForbidQuickComment;

    @C09CT("show_emoji_send")
    public boolean isShowEmojiSend;

    @C09CT("quick_emoji_position")
    public int quickEmojiPosition;

    public final int getQuickEmojiPosition() {
        return this.quickEmojiPosition;
    }

    public final boolean isForbidQuickComment() {
        return this.isForbidQuickComment;
    }

    public final boolean isShowEmojiSend() {
        return this.isShowEmojiSend;
    }

    public final void setForbidQuickComment(boolean z) {
        this.isForbidQuickComment = z;
    }

    public final void setQuickEmojiPosition(int i) {
        this.quickEmojiPosition = i;
    }

    public final void setShowEmojiSend(boolean z) {
        this.isShowEmojiSend = z;
    }
}
