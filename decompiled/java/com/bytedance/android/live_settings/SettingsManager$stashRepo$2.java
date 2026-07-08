package com.bytedance.android.live_settings;

import X.C09AY;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public final class SettingsManager$stashRepo$2 extends C09AY implements Function0<Keva> {
    public SettingsManager$stashRepo$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Keva invoke() {
        return KevaImpl.getRepo("live_setting_increment_config_repo", 0);
    }
}
