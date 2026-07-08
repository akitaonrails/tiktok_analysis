package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.viewbinder;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiGuestMainColorConfig_OptTypeAdapter extends TypeAdapter<MultiGuestMainColorConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestMainColorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestMainColorConfig multiGuestMainColorConfig = new MultiGuestMainColorConfig(0.1f, 0.3f, 0.0f, 0.8f, 0.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1572124612:
                        if (strLJJJJ.equals("lightness_from")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestMainColorConfig.lightnessFrom = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -602995484:
                        if (strLJJJJ.equals("chroma_to")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestMainColorConfig.chromaTo = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 341514195:
                        if (strLJJJJ.equals("chroma_from")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestMainColorConfig.chromaFrom = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1441938317:
                        if (strLJJJJ.equals("lightness_to")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestMainColorConfig.lightnessTo = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1787798387:
                        if (strLJJJJ.equals("strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestMainColorConfig.strategy = (float) c09cu.LJJIL();
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
        return multiGuestMainColorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestMainColorConfig multiGuestMainColorConfig) {
        MultiGuestMainColorConfig multiGuestMainColorConfig2 = multiGuestMainColorConfig;
        if (multiGuestMainColorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("chroma_from");
        c09dl.LJJJJ(Float.valueOf(multiGuestMainColorConfig2.chromaFrom));
        c09dl.LJIILLIIL("chroma_to");
        c09dl.LJJJJ(Float.valueOf(multiGuestMainColorConfig2.chromaTo));
        c09dl.LJIILLIIL("lightness_from");
        c09dl.LJJJJ(Float.valueOf(multiGuestMainColorConfig2.lightnessFrom));
        c09dl.LJIILLIIL("lightness_to");
        c09dl.LJJJJ(Float.valueOf(multiGuestMainColorConfig2.lightnessTo));
        c09dl.LJIILLIIL("strategy");
        c09dl.LJJJJ(Float.valueOf(multiGuestMainColorConfig2.strategy));
        c09dl.LJII();
    }
}
