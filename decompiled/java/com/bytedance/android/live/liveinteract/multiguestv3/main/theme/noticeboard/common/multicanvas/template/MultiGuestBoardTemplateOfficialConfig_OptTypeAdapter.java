package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestBoardTemplateOfficialConfig_OptTypeAdapter extends TypeAdapter<MultiGuestBoardTemplateOfficialConfig> {
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestBoardTemplateOfficialConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestBoardTemplateOfficialConfig multiGuestBoardTemplateOfficialConfig = new MultiGuestBoardTemplateOfficialConfig(2000L, 500L, 999L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1739322610) {
                    if (iHashCode != -1219864436) {
                        if (iHashCode == 2069166375 && strLJJJJ.equals("max_edit_text")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestBoardTemplateOfficialConfig.maxEditText = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("tos_mill_second_internal")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            multiGuestBoardTemplateOfficialConfig.tosMillSecondInternal = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("render_mill_second_internal")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestBoardTemplateOfficialConfig.renderMillSecondInternal = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return multiGuestBoardTemplateOfficialConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestBoardTemplateOfficialConfig multiGuestBoardTemplateOfficialConfig) throws IOException {
        MultiGuestBoardTemplateOfficialConfig multiGuestBoardTemplateOfficialConfig2 = multiGuestBoardTemplateOfficialConfig;
        if (multiGuestBoardTemplateOfficialConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("render_mill_second_internal");
        c09dl.LJJIZ(multiGuestBoardTemplateOfficialConfig2.renderMillSecondInternal);
        c09dl.LJIILLIIL("tos_mill_second_internal");
        c09dl.LJJIZ(multiGuestBoardTemplateOfficialConfig2.tosMillSecondInternal);
        c09dl.LJIILLIIL("max_edit_text");
        c09dl.LJJIZ(multiGuestBoardTemplateOfficialConfig2.maxEditText);
        c09dl.LJII();
    }
}
