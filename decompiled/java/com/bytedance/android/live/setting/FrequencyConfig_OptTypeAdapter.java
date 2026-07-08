package com.bytedance.android.live.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FrequencyConfig_OptTypeAdapter extends TypeAdapter<FrequencyConfig> {
    public final Gson LIZ;

    public FrequencyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FrequencyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FrequencyConfig frequencyConfig = new FrequencyConfig(null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1919013212) {
                    if (iHashCode != 1479516741) {
                        if (iHashCode == 1724571614 && strLJJJJ.equals("global_frequency_control")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                frequencyConfig.globalConfig = (GlobalFreqControlConfig) this.LIZ.LJIIJ(GlobalFreqControlConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("default_frequency_control_key_config")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            frequencyConfig.defaultFrequencyControlConfig = (CompanionFrequencyControlConfig) this.LIZ.LJIIJ(CompanionFrequencyControlConfig.class).read(c09cu);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("message_type_configs")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        frequencyConfig.messageTypeConfig = (MessageTypeConfig) this.LIZ.LJIIJ(MessageTypeConfig.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return frequencyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FrequencyConfig frequencyConfig) {
        FrequencyConfig frequencyConfig2 = frequencyConfig;
        if (frequencyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("message_type_configs");
        this.LIZ.LJIIJ(MessageTypeConfig.class).write(c09dl, frequencyConfig2.messageTypeConfig);
        c09dl.LJIILLIIL("global_frequency_control");
        this.LIZ.LJIIJ(GlobalFreqControlConfig.class).write(c09dl, frequencyConfig2.globalConfig);
        c09dl.LJIILLIIL("default_frequency_control_key_config");
        this.LIZ.LJIIJ(CompanionFrequencyControlConfig.class).write(c09dl, frequencyConfig2.defaultFrequencyControlConfig);
        c09dl.LJII();
    }
}
