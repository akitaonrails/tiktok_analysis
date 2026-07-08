package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PlaybookEditorConfig_OptTypeAdapter extends TypeAdapter<PlaybookEditorConfig> {
    public final Gson LIZ;

    public PlaybookEditorConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PlaybookEditorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PlaybookEditorConfig playbookEditorConfig = new PlaybookEditorConfig(null, null, 0, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -234340212) {
                    if (iHashCode != 1980077284) {
                        if (iHashCode == 1980077287 && strLJJJJ.equals("cover_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                playbookEditorConfig.defaultCoverUrl = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("cover_uri")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            playbookEditorConfig.defaultCoverUri = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("max_steps")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        playbookEditorConfig.maxSteps = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return playbookEditorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PlaybookEditorConfig playbookEditorConfig) {
        PlaybookEditorConfig playbookEditorConfig2 = playbookEditorConfig;
        if (playbookEditorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cover_uri");
        C473040Igo.LIZLLL(this.LIZ, c09dl, playbookEditorConfig2.defaultCoverUri, String.class);
        c09dl.LJIILLIIL("cover_url");
        C473040Igo.LIZLLL(this.LIZ, c09dl, playbookEditorConfig2.defaultCoverUrl, String.class);
        c09dl.LJIILLIIL("max_steps");
        c09dl.LJJJJ(Integer.valueOf(playbookEditorConfig2.maxSteps));
        c09dl.LJII();
    }
}
