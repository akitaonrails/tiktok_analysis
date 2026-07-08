package com.bytedance.android;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_send_button_opt")
public final class LiveCommentSendButtonOptSetting {
    public static final int ALL = 3;
    public static final int COMMENT_IME_SEND_BUTTON_OPT = 2;
    public static final int COMMENT_SEND_BUTTON_OPT = 1;
    public static final int DEFAULT = 0;
    public static final LiveCommentSendButtonOptSetting INSTANCE = new LiveCommentSendButtonOptSetting();

    public static final boolean enableCommentImeSendButtonOpt() {
        return (INSTANCE.getValue() & 2) == 2;
    }

    public static final boolean enableCommentSendButtonOpt() {
        return (INSTANCE.getValue() & 1) == 1;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_comment_send_button_opt", DEFAULT);
    }
}
