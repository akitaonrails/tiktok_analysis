package com.bytedance.android.live.uikit.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.live.uikit.setting.LivePanelFrameworkSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePanelFrameworkSetting_PanelFrameworkConfig_OptTypeAdapter extends TypeAdapter<LivePanelFrameworkSetting.PanelFrameworkConfig> {
    public final Gson LIZ;

    public LivePanelFrameworkSetting_PanelFrameworkConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePanelFrameworkSetting.PanelFrameworkConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePanelFrameworkSetting.PanelFrameworkConfig panelFrameworkConfig = new LivePanelFrameworkSetting.PanelFrameworkConfig(new ArrayList(), new ArrayList(), false, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1341953068:
                        if (strLJJJJ.equals("allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                panelFrameworkConfig.allowList = C473040Igo.LIZ(this.LIZ, c09cu, LivePanelFrameworkSetting.AllowItem.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -112693371:
                        if (strLJJJJ.equals("enable_default")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                panelFrameworkConfig.enableLivePanelFramework = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 65428978:
                        if (strLJJJJ.equals("guide_page")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                panelFrameworkConfig.guidePage = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1286305040:
                        if (strLJJJJ.equals("block_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                panelFrameworkConfig.blockList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
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
        return panelFrameworkConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePanelFrameworkSetting.PanelFrameworkConfig panelFrameworkConfig) throws IOException {
        LivePanelFrameworkSetting.PanelFrameworkConfig panelFrameworkConfig2 = panelFrameworkConfig;
        if (panelFrameworkConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, panelFrameworkConfig2.allowList, LivePanelFrameworkSetting.AllowItem.class);
        c09dl.LJIILLIIL("block_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, panelFrameworkConfig2.blockList, String.class);
        c09dl.LJIILLIIL("enable_default");
        c09dl.LJJJJJL(panelFrameworkConfig2.enableLivePanelFramework);
        c09dl.LJIILLIIL("guide_page");
        c09dl.LJJJJJ(panelFrameworkConfig2.guidePage);
        c09dl.LJII();
    }
}
