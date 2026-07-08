package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class PlayRecordConfig_OptTypeAdapter extends TypeAdapter<PlayRecordConfig> {
    public final Gson LIZ;

    public PlayRecordConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PlayRecordConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PlayRecordConfig playRecordConfig = new PlayRecordConfig(true, false, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1421272810) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 321853174 && strLJJJJ.equals("first_check_gift")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                playRecordConfig.firstCheckGift = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            playRecordConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("validate")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        playRecordConfig.validate = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return playRecordConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PlayRecordConfig playRecordConfig) throws IOException {
        PlayRecordConfig playRecordConfig2 = playRecordConfig;
        if (playRecordConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(playRecordConfig2.enable);
        c09dl.LJIILLIIL("validate");
        c09dl.LJJJJJL(playRecordConfig2.validate);
        c09dl.LJIILLIIL("first_check_gift");
        c09dl.LJJJJJL(playRecordConfig2.firstCheckGift);
        c09dl.LJII();
    }
}
