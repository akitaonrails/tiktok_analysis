package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.NoticeboardConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardConfigSetting_NoticeboardConfig_OptTypeAdapter extends TypeAdapter<NoticeboardConfigSetting.NoticeboardConfig> {
    public final Gson LIZ;

    public NoticeboardConfigSetting_NoticeboardConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final NoticeboardConfigSetting.NoticeboardConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NoticeboardConfigSetting.NoticeboardConfig noticeboardConfig = new NoticeboardConfigSetting.NoticeboardConfig("tos-alisg-i-yyebeh8z3m-sg/noticeboard_default_image_1.png", "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/noticeboard_default_image_1.png~tplv-0gv1ynv35u-image.image", 30000L, 2L, 0.0f, 0.4f, 0.3f, 1.0f, 0.0f, 8.0f, true, false, true, 0.85f, 1.15f, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2077031716:
                        if (strLJJJJ.equals("time_out")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.timeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1572124612:
                        if (strLJJJJ.equals("lightness_from")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.lightnessFrom = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1524947474:
                        if (strLJJJJ.equals("start_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.startRatio = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -602995484:
                        if (strLJJJJ.equals("chroma_to")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.chromaTo = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -102530683:
                        if (strLJJJJ.equals("context_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.contextFix = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 103785528:
                        if (strLJJJJ.equals("merge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.merge = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 341514195:
                        if (strLJJJJ.equals("chroma_from")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.chromaFrom = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 433978763:
                        if (strLJJJJ.equals("try_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.tryCount = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1239511283:
                        if (strLJJJJ.equals("playbook_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.playbookFix = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1371983623:
                        if (strLJJJJ.equals("recycle_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.recycleOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1441938317:
                        if (strLJJJJ.equals("lightness_to")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.lightnessTo = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1787798387:
                        if (strLJJJJ.equals("strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.strategy = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1873999451:
                        if (strLJJJJ.equals("stub_uri")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.stubUri = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1873999454:
                        if (strLJJJJ.equals("stub_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.stubUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1913538712:
                        if (strLJJJJ.equals("increase_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.increaseFix = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1950411687:
                        if (strLJJJJ.equals("end_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                noticeboardConfig.endRatio = (float) c09cu.LJJIL();
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
        return noticeboardConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NoticeboardConfigSetting.NoticeboardConfig noticeboardConfig) throws IOException {
        NoticeboardConfigSetting.NoticeboardConfig noticeboardConfig2 = noticeboardConfig;
        if (noticeboardConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("stub_uri");
        c09dl.LJJJJJ(noticeboardConfig2.stubUri);
        c09dl.LJIILLIIL("stub_url");
        c09dl.LJJJJJ(noticeboardConfig2.stubUrl);
        c09dl.LJIILLIIL("time_out");
        c09dl.LJJIZ(noticeboardConfig2.timeout);
        c09dl.LJIILLIIL("try_count");
        c09dl.LJJIZ(noticeboardConfig2.tryCount);
        c09dl.LJIILLIIL("chroma_from");
        c09dl.LJJJJ(Float.valueOf(noticeboardConfig2.chromaFrom));
        c09dl.LJIILLIIL("chroma_to");
        c09dl.LJJJJ(Float.valueOf(noticeboardConfig2.chromaTo));
        c09dl.LJIILLIIL("lightness_from");
        c09dl.LJJJJ(Float.valueOf(noticeboardConfig2.lightnessFrom));
        c09dl.LJIILLIIL("lightness_to");
        c09dl.LJJJJ(Float.valueOf(noticeboardConfig2.lightnessTo));
        c09dl.LJIILLIIL("strategy");
        c09dl.LJJJJ(Float.valueOf(noticeboardConfig2.strategy));
        c09dl.LJIILLIIL("merge");
        c09dl.LJJJJ(Float.valueOf(noticeboardConfig2.merge));
        c09dl.LJIILLIIL("increase_fix");
        c09dl.LJJJJJL(noticeboardConfig2.increaseFix);
        c09dl.LJIILLIIL("recycle_opt");
        c09dl.LJJJJJL(noticeboardConfig2.recycleOpt);
        c09dl.LJIILLIIL("context_fix");
        c09dl.LJJJJJL(noticeboardConfig2.contextFix);
        c09dl.LJIILLIIL("start_ratio");
        c09dl.LJJJJ(Float.valueOf(noticeboardConfig2.startRatio));
        c09dl.LJIILLIIL("end_ratio");
        c09dl.LJJJJ(Float.valueOf(noticeboardConfig2.endRatio));
        c09dl.LJIILLIIL("playbook_fix");
        c09dl.LJJJJJL(noticeboardConfig2.playbookFix);
        c09dl.LJII();
    }
}
