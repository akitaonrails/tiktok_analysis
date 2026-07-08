package com.bytedance.android.live.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FrequencyConfig {
    public static final TypeAdapter ADAPTER = new FrequencyConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("default_frequency_control_key_config")
    public CompanionFrequencyControlConfig defaultFrequencyControlConfig;

    @C09CT("global_frequency_control")
    public GlobalFreqControlConfig globalConfig;

    @C09CT("message_type_configs")
    public MessageTypeConfig messageTypeConfig;

    public FrequencyConfig() {
        this(null, null, null);
    }

    public FrequencyConfig(MessageTypeConfig messageTypeConfig, GlobalFreqControlConfig globalFreqControlConfig, CompanionFrequencyControlConfig companionFrequencyControlConfig) {
        this.messageTypeConfig = messageTypeConfig;
        this.globalConfig = globalFreqControlConfig;
        this.defaultFrequencyControlConfig = companionFrequencyControlConfig;
    }
}
