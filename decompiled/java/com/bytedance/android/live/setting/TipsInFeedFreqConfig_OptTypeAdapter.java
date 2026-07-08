package com.bytedance.android.live.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TipsInFeedFreqConfig_OptTypeAdapter extends TypeAdapter<TipsInFeedFreqConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TipsInFeedFreqConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TipsInFeedFreqConfig tipsInFeedFreqConfig = new TipsInFeedFreqConfig(8, 1, 2, 50, 3, 16, 1, 16);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2109406058:
                        if (strLJJJJ.equals("per_tip_id_window_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tipsInFeedFreqConfig.perTipIdWindowInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1325335617:
                        if (strLJJJJ.equals("acu_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tipsInFeedFreqConfig.acuThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -720865868:
                        if (strLJJJJ.equals("per_tip_id_session_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tipsInFeedFreqConfig.perTipIdSessionLimit = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -120795337:
                        if (strLJJJJ.equals("per_tag_id_window_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tipsInFeedFreqConfig.perTagIdWindowInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 920795686:
                        if (strLJJJJ.equals("high_heat_quota")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tipsInFeedFreqConfig.highHeatQuota = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1121538356:
                        if (strLJJJJ.equals("low_heat_quota")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tipsInFeedFreqConfig.lowHeatQuota = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1914745584:
                        if (strLJJJJ.equals("window_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tipsInFeedFreqConfig.windowSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2123658389:
                        if (strLJJJJ.equals("per_tag_id_session_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tipsInFeedFreqConfig.perTagIdSessionLimit = c09cu.LJJIZ();
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
        return tipsInFeedFreqConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TipsInFeedFreqConfig tipsInFeedFreqConfig) {
        TipsInFeedFreqConfig tipsInFeedFreqConfig2 = tipsInFeedFreqConfig;
        if (tipsInFeedFreqConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("window_size");
        c09dl.LJJJJ(Integer.valueOf(tipsInFeedFreqConfig2.windowSize));
        c09dl.LJIILLIIL("high_heat_quota");
        c09dl.LJJJJ(Integer.valueOf(tipsInFeedFreqConfig2.highHeatQuota));
        c09dl.LJIILLIIL("low_heat_quota");
        c09dl.LJJJJ(Integer.valueOf(tipsInFeedFreqConfig2.lowHeatQuota));
        c09dl.LJIILLIIL("acu_threshold");
        c09dl.LJJJJ(Integer.valueOf(tipsInFeedFreqConfig2.acuThreshold));
        c09dl.LJIILLIIL("per_tip_id_session_limit");
        c09dl.LJJJJ(Integer.valueOf(tipsInFeedFreqConfig2.perTipIdSessionLimit));
        c09dl.LJIILLIIL("per_tip_id_window_interval");
        c09dl.LJJJJ(Integer.valueOf(tipsInFeedFreqConfig2.perTipIdWindowInterval));
        c09dl.LJIILLIIL("per_tag_id_session_limit");
        c09dl.LJJJJ(Integer.valueOf(tipsInFeedFreqConfig2.perTagIdSessionLimit));
        c09dl.LJIILLIIL("per_tag_id_window_interval");
        c09dl.LJJJJ(Integer.valueOf(tipsInFeedFreqConfig2.perTagIdWindowInterval));
        c09dl.LJII();
    }
}
