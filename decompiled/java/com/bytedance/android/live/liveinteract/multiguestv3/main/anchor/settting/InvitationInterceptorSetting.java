package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("invitation_interceptor_provider")
public final class InvitationInterceptorSetting {
    public static final int $stable = 0;
    public static final InvitationInterceptorSetting INSTANCE = new InvitationInterceptorSetting();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("invitation_interceptor_provider", DEFAULT);
    }
}
