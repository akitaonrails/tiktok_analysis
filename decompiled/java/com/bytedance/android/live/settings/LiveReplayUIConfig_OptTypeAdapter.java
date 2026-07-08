package com.bytedance.android.live.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayUIConfig_OptTypeAdapter extends TypeAdapter<LiveReplayUIConfig> {
    public final Gson LIZ;

    public LiveReplayUIConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveReplayUIConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveReplayUIConfig liveReplayUIConfig = new LiveReplayUIConfig(false, 300L, 120L, 10, 10L, 24, 24, 150L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 31784043:
                        if (strLJJJJ.equals("init_clip_time_range")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveReplayUIConfig.initialSelectedZoneWithSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 806688363:
                        if (strLJJJJ.equals("playhead_hotspot_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveReplayUIConfig.playHeadHotspotWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 989652058:
                        if (strLJJJJ.equals("vibration_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveReplayUIConfig.vibrationTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1267993944:
                        if (strLJJJJ.equals("pic_num_in_screen")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveReplayUIConfig.picNumInScreen = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1358042303:
                        if (strLJJJJ.equals("max_clip_time_range")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveReplayUIConfig.screenWithTotalSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1751183999:
                        if (strLJJJJ.equals("handle_hotspot_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveReplayUIConfig.handleHotspotWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1825460190:
                        if (strLJJJJ.equals("min_total_seconds_in_screen")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveReplayUIConfig.minScreenWithTotalSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1928645743:
                        if (strLJJJJ.equals("ui_style_opti")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveReplayUIConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveReplayUIConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveReplayUIConfig liveReplayUIConfig) throws IOException {
        LiveReplayUIConfig liveReplayUIConfig2 = liveReplayUIConfig;
        if (liveReplayUIConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ui_style_opti");
        c09dl.LJJJJJL(liveReplayUIConfig2.enable);
        c09dl.LJIILLIIL("max_clip_time_range");
        c09dl.LJJIZ(liveReplayUIConfig2.screenWithTotalSeconds);
        c09dl.LJIILLIIL("init_clip_time_range");
        c09dl.LJJIZ(liveReplayUIConfig2.initialSelectedZoneWithSeconds);
        c09dl.LJIILLIIL("pic_num_in_screen");
        c09dl.LJJJJ(Integer.valueOf(liveReplayUIConfig2.picNumInScreen));
        c09dl.LJIILLIIL("vibration_time");
        c09dl.LJJIZ(liveReplayUIConfig2.vibrationTime);
        c09dl.LJIILLIIL("handle_hotspot_width");
        c09dl.LJJJJ(Integer.valueOf(liveReplayUIConfig2.handleHotspotWidth));
        c09dl.LJIILLIIL("playhead_hotspot_width");
        c09dl.LJJJJ(Integer.valueOf(liveReplayUIConfig2.playHeadHotspotWidth));
        c09dl.LJIILLIIL("min_total_seconds_in_screen");
        c09dl.LJJIZ(liveReplayUIConfig2.minScreenWithTotalSeconds);
        c09dl.LJII();
    }
}
