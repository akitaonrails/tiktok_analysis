package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestEmojiPositionModel {

    @C09CT("emo_size")
    public final int emojiSize;

    @C09CT("is_full_screen")
    public final int isFullScreen;

    @C09CT("start")
    public final int start;

    @C09CT("top")
    public final int top;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiGuestEmojiPositionModel)) {
            return false;
        }
        MultiGuestEmojiPositionModel multiGuestEmojiPositionModel = (MultiGuestEmojiPositionModel) obj;
        return this.emojiSize == multiGuestEmojiPositionModel.emojiSize && this.start == multiGuestEmojiPositionModel.start && this.top == multiGuestEmojiPositionModel.top && this.isFullScreen == multiGuestEmojiPositionModel.isFullScreen;
    }

    public final int hashCode() {
        return (((((this.emojiSize * 31) + this.start) * 31) + this.top) * 31) + this.isFullScreen;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestEmojiPositionModel(emojiSize=");
        sbLIZ.append(this.emojiSize);
        sbLIZ.append(", start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", isFullScreen=");
        sbLIZ.append(this.isFullScreen);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MultiGuestEmojiPositionModel(int i, int i2, int i3, int i4) {
        this.emojiSize = i;
        this.start = i2;
        this.top = i3;
        this.isFullScreen = i4;
    }
}
