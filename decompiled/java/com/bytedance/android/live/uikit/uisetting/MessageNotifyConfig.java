package com.bytedance.android.live.uikit.uisetting;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidConfig;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class MessageNotifyConfig implements Serializable {

    @C09CT("bubble_configs")
    public final Map<String, LiveMessagePlatformBubbleConfig> bubbleConfig;

    @C09CT("filtered_bubble_configs")
    public final Map<String, LiveMessagePlatformBubbleConfig> filteredBubbleConfig;

    @C09CT("filtered_red_dot_configs")
    public final Map<String, LiveMessagePlatformRedDotConfig> filteredRedDotConfig;

    @C09CT("avoid_rule_config")
    public final MsgNotifyAvoidConfig msgNotifyAvoidConfig;

    @C09CT("notice_avoid_config")
    public NotifyAvoidConfig noticeAvoidConfig;

    @C09CT("notice_fc_config")
    public NotifyFCConfig noticeFcConfig;

    @C09CT("red_dot_configs")
    public final Map<String, LiveMessagePlatformRedDotConfig> redDotConfig;

    @C09CT("refresh_ms")
    public long refreshMs;

    public final void setNoticeAvoidConfig(NotifyAvoidConfig notifyAvoidConfig) {
        this.noticeAvoidConfig = notifyAvoidConfig;
    }

    public final void setNoticeFcConfig(NotifyFCConfig notifyFCConfig) {
        this.noticeFcConfig = notifyFCConfig;
    }

    public final void setRefreshMs(long j) {
        this.refreshMs = j;
    }

    public MessageNotifyConfig(Map<String, LiveMessagePlatformBubbleConfig> map, Map<String, LiveMessagePlatformRedDotConfig> map2, Map<String, LiveMessagePlatformBubbleConfig> map3, Map<String, LiveMessagePlatformRedDotConfig> map4, MsgNotifyAvoidConfig msgNotifyAvoidConfig, NotifyAvoidConfig notifyAvoidConfig, NotifyFCConfig notifyFCConfig, long j) {
        this.bubbleConfig = map;
        this.redDotConfig = map2;
        this.filteredBubbleConfig = map3;
        this.filteredRedDotConfig = map4;
        this.msgNotifyAvoidConfig = msgNotifyAvoidConfig;
        this.noticeAvoidConfig = notifyAvoidConfig;
        this.noticeFcConfig = notifyFCConfig;
        this.refreshMs = j;
    }
}
