package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes32.dex */
public final class TextHeaderInputInfo_OptTypeAdapter extends TypeAdapter<TextHeaderInputInfo> {
    public final Gson LIZ;

    public TextHeaderInputInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TextHeaderInputInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TextHeaderInputInfo textHeaderInputInfo = new TextHeaderInputInfo(32, 2, true, 2.0f, true, 18.0f, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1969157475:
                        if (strLJJJJ.equals("max_char_count_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderInputInfo.maxCharCountLimit = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1595790828:
                        if (strLJJJJ.equals("add_default_shadow_when_no_stroke")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderInputInfo.addDefaultShadowWhenNoStroke = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -933045011:
                        if (strLJJJJ.equals("fix_text_header_display_bug")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderInputInfo.fixTextHeaderDisplayBug = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 80192231:
                        if (strLJJJJ.equals("not_measure_by_self")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderInputInfo.notMeasureBySelf = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 664355593:
                        if (strLJJJJ.equals("stroke_multiple_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderInputInfo.strokeMultipleSize = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 988819810:
                        if (strLJJJJ.equals("fix_selection_direction")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderInputInfo.fixSelectionDirection = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1197825328:
                        if (strLJJJJ.equals("max_lines_count_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderInputInfo.maxLinesCountLimit = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2020981239:
                        if (strLJJJJ.equals("recommend_default_max_text_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textHeaderInputInfo.recommendDefMaxTextSize = (float) c09cu.LJJIL();
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
        return textHeaderInputInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TextHeaderInputInfo textHeaderInputInfo) throws IOException {
        TextHeaderInputInfo textHeaderInputInfo2 = textHeaderInputInfo;
        if (textHeaderInputInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max_char_count_limit");
        c09dl.LJJJJ(Integer.valueOf(textHeaderInputInfo2.maxCharCountLimit));
        c09dl.LJIILLIIL("max_lines_count_limit");
        c09dl.LJJJJ(Integer.valueOf(textHeaderInputInfo2.maxLinesCountLimit));
        c09dl.LJIILLIIL("not_measure_by_self");
        c09dl.LJJJJJL(textHeaderInputInfo2.notMeasureBySelf);
        c09dl.LJIILLIIL("stroke_multiple_size");
        c09dl.LJJJJ(Float.valueOf(textHeaderInputInfo2.strokeMultipleSize));
        c09dl.LJIILLIIL("fix_selection_direction");
        c09dl.LJJJJJL(textHeaderInputInfo2.fixSelectionDirection);
        c09dl.LJIILLIIL("recommend_default_max_text_size");
        c09dl.LJJJJ(Float.valueOf(textHeaderInputInfo2.recommendDefMaxTextSize));
        c09dl.LJIILLIIL("fix_text_header_display_bug");
        c09dl.LJJJJJL(textHeaderInputInfo2.fixTextHeaderDisplayBug);
        c09dl.LJIILLIIL("add_default_shadow_when_no_stroke");
        c09dl.LJJJJJL(textHeaderInputInfo2.addDefaultShadowWhenNoStroke);
        c09dl.LJII();
    }
}
