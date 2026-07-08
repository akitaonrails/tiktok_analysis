package com.bytedance.android.live.setting;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_stream_pdp_panel_adapter")
public final class LiveStreamPdpPanelAdapterSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStreamPdpPanelAdapterSetting INSTANCE = new LiveStreamPdpPanelAdapterSetting();
    public static final C01GW settings$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(23));

    public static /* synthetic */ void getSettings$annotations() {
    }

    public static final boolean getSettings() {
        return ((Boolean) settings$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getSettings();
    }
}
