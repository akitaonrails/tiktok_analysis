package com.bytedance.android.live.uikit.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.live.uikit.setting.LivePanelFrameworkSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePanelFrameworkSetting_AllowItem_OptTypeAdapter extends TypeAdapter<LivePanelFrameworkSetting.AllowItem> {
    public final Gson LIZ;

    public LivePanelFrameworkSetting_AllowItem_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePanelFrameworkSetting.AllowItem read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePanelFrameworkSetting.AllowItem allowItem = new LivePanelFrameworkSetting.AllowItem();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                allowItem.enable = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -995427962:
                        if (strLJJJJ.equals("params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                allowItem.params = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 116079:
                        if (strLJJJJ.equals("url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                allowItem.url = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 96965648:
                        if (strLJJJJ.equals("extra")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                allowItem.extra = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1298183146:
                        if (strLJJJJ.equals("panel_page")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                allowItem.panelPage = c09cu.LJJJZ();
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
        return allowItem;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePanelFrameworkSetting.AllowItem allowItem) {
        LivePanelFrameworkSetting.AllowItem allowItem2 = allowItem;
        if (allowItem2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("panel_page");
        c09dl.LJJJJJ(allowItem2.panelPage);
        c09dl.LJIILLIIL("url");
        c09dl.LJJJJJ(allowItem2.url);
        c09dl.LJIILLIIL("params");
        C473040Igo.LJ(this.LIZ, c09dl, allowItem2.params, String.class);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJ(allowItem2.enable);
        c09dl.LJIILLIIL("extra");
        C473040Igo.LJ(this.LIZ, c09dl, allowItem2.extra, String.class);
        c09dl.LJII();
    }
}
