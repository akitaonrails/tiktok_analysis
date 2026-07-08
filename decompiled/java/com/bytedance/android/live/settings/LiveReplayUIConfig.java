package com.bytedance.android.live.settings;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayUIConfig {
    public static final TypeAdapter ADAPTER = new LiveReplayUIConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ui_style_opti")
    public boolean enable;

    @C09CT("handle_hotspot_width")
    public int handleHotspotWidth;

    @C09CT("init_clip_time_range")
    public long initialSelectedZoneWithSeconds;

    @C09CT("min_total_seconds_in_screen")
    public long minScreenWithTotalSeconds;

    @C09CT("pic_num_in_screen")
    public int picNumInScreen;

    @C09CT("playhead_hotspot_width")
    public int playHeadHotspotWidth;

    @C09CT("max_clip_time_range")
    public long screenWithTotalSeconds;

    @C09CT("vibration_time")
    public long vibrationTime;

    public LiveReplayUIConfig() {
        this(false, 300L, 120L, 10, 10L, 24, 24, 150L);
    }

    public LiveReplayUIConfig(boolean z, long j, long j2, int i, long j3, int i2, int i3, long j4) {
        this.enable = z;
        this.screenWithTotalSeconds = j;
        this.initialSelectedZoneWithSeconds = j2;
        this.picNumInScreen = i;
        this.vibrationTime = j3;
        this.handleHotspotWidth = i2;
        this.playHeadHotspotWidth = i3;
        this.minScreenWithTotalSeconds = j4;
    }
}
