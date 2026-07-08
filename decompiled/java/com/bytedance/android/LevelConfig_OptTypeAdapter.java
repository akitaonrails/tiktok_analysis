package com.bytedance.android;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelConfig_OptTypeAdapter extends TypeAdapter<LevelConfig> {
    public final Gson LIZ;

    public LevelConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LevelConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LevelConfig levelConfig = new LevelConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 107348) {
                    if (iHashCode != 108104) {
                        if (iHashCode == 3202466 && strLJJJJ.equals("high")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelConfig.high = (LevelPair) this.LIZ.LJIIJ(LevelPair.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("mid")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            levelConfig.mid = (LevelPair) this.LIZ.LJIIJ(LevelPair.class).read(c09cu);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("low")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        levelConfig.low = (LevelPair) this.LIZ.LJIIJ(LevelPair.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return levelConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LevelConfig levelConfig) {
        LevelConfig levelConfig2 = levelConfig;
        if (levelConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("high");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(LevelPair.class);
        typeAdapterLJIIJ.write(c09dl, levelConfig2.high);
        c09dl.LJIILLIIL("mid");
        typeAdapterLJIIJ.write(c09dl, levelConfig2.mid);
        c09dl.LJIILLIIL("low");
        typeAdapterLJIIJ.write(c09dl, levelConfig2.low);
        c09dl.LJII();
    }
}
