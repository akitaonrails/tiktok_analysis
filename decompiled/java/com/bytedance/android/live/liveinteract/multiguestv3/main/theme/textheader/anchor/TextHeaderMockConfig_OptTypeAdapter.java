package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class TextHeaderMockConfig_OptTypeAdapter extends TypeAdapter<TextHeaderMockConfig> {
    public final Gson LIZ;

    public TextHeaderMockConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TextHeaderMockConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TextHeaderMockConfig textHeaderMockConfig = new TextHeaderMockConfig(false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1540079750:
                        if (strLJJJJ.equals("font_mock")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderMockConfig.fontMock = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -839993053:
                        if (strLJJJJ.equals("key_board_mock")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderMockConfig.keyBoardMock = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -423400067:
                        if (strLJJJJ.equals("remove_guide_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderMockConfig.removeGuideLimit = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -363578113:
                        if (strLJJJJ.equals("data_mock")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderMockConfig.dataMock = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return textHeaderMockConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TextHeaderMockConfig textHeaderMockConfig) throws IOException {
        TextHeaderMockConfig textHeaderMockConfig2 = textHeaderMockConfig;
        if (textHeaderMockConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("data_mock");
        c09dl.LJJJJJL(textHeaderMockConfig2.dataMock);
        c09dl.LJIILLIIL("remove_guide_limit");
        c09dl.LJJJJJL(textHeaderMockConfig2.removeGuideLimit);
        c09dl.LJIILLIIL("font_mock");
        c09dl.LJJJJJL(textHeaderMockConfig2.fontMock);
        c09dl.LJIILLIIL("key_board_mock");
        c09dl.LJJJJJL(textHeaderMockConfig2.keyBoardMock);
        c09dl.LJII();
    }
}
