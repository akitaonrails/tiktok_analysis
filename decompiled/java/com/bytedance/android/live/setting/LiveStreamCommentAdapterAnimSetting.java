package com.bytedance.android.live.setting;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_stream_comment_adapter_anim")
public final class LiveStreamCommentAdapterAnimSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStreamCommentAdapterAnimSetting INSTANCE = new LiveStreamCommentAdapterAnimSetting();
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(21));

    private final boolean getSolidifyValue() {
        return ((Boolean) solidifyValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_stream_comment_adapter_anim") ? getSolidifyValue() : SettingsManager.INSTANCE.getBooleanValue("live_stream_comment_adapter_anim", DEFAULT);
    }
}
