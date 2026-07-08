package com.bytedance.android.live;

import X.C500260Jjc;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_quick_emoji_setting")
public final class LiveCommentQuickEmojiSetting {
    public static final LiveCommentQuickEmojiSetting INSTANCE = new LiveCommentQuickEmojiSetting();
    public static final QuickEmojiConfig DEFAULT = new QuickEmojiConfig();

    private final QuickEmojiConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        QuickEmojiConfig quickEmojiConfig = DEFAULT;
        QuickEmojiConfig quickEmojiConfig2 = (QuickEmojiConfig) settingsManager.getValueSafely("live_comment_quick_emoji_setting", quickEmojiConfig);
        return quickEmojiConfig2 != null ? quickEmojiConfig2 : quickEmojiConfig;
    }

    public static final boolean quickEmojiBottom() {
        return INSTANCE.getValue().getQuickEmojiPosition() == 2;
    }

    public static final boolean quickEmojiTop() {
        return INSTANCE.getValue().getQuickEmojiPosition() == 1;
    }

    public static final boolean isForbidQuickComment(Room room) {
        Boolean boolValueOf;
        if (INSTANCE.getValue().isForbidQuickComment()) {
            if (room != null) {
                boolValueOf = Boolean.valueOf(room.showEmojiList);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean showQuickEmoji(Room room) {
        Boolean boolValueOf;
        if (INSTANCE.getValue().getQuickEmojiPosition() > 0) {
            if (room != null) {
                boolValueOf = Boolean.valueOf(room.showEmojiList);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
