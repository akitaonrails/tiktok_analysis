package com.bytedance.android.live.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GlobalFreqControlConfig_OptTypeAdapter extends TypeAdapter<GlobalFreqControlConfig> {
    public final Gson LIZ;

    public GlobalFreqControlConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GlobalFreqControlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GlobalFreqControlConfig globalFreqControlConfig = new GlobalFreqControlConfig(0, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1823549445) {
                    if (iHashCode != -1325335617) {
                        if (iHashCode == -693248403 && strLJJJJ.equals("high_heat")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                globalFreqControlConfig.highAcu = (AcuConfig) this.LIZ.LJIIJ(AcuConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("acu_threshold")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            globalFreqControlConfig.acuThreshold = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("low_heat")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        globalFreqControlConfig.lowAcu = (AcuConfig) this.LIZ.LJIIJ(AcuConfig.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return globalFreqControlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GlobalFreqControlConfig globalFreqControlConfig) {
        GlobalFreqControlConfig globalFreqControlConfig2 = globalFreqControlConfig;
        if (globalFreqControlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("acu_threshold");
        c09dl.LJJJJ(Integer.valueOf(globalFreqControlConfig2.acuThreshold));
        c09dl.LJIILLIIL("low_heat");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(AcuConfig.class);
        typeAdapterLJIIJ.write(c09dl, globalFreqControlConfig2.lowAcu);
        c09dl.LJIILLIIL("high_heat");
        typeAdapterLJIIJ.write(c09dl, globalFreqControlConfig2.highAcu);
        c09dl.LJII();
    }
}
