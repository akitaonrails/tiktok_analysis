package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class IconConfig_OptTypeAdapter extends TypeAdapter<IconConfig> {
    public final Gson LIZ;

    public IconConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final IconConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        IconConfig iconConfig = new IconConfig(null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "icon_name_to_url_map")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    iconConfig.iconNameToUrlMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return iconConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, IconConfig iconConfig) {
        IconConfig iconConfig2 = iconConfig;
        if (iconConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("icon_name_to_url_map");
        C473040Igo.LJ(this.LIZ, c09dl, iconConfig2.iconNameToUrlMap, String.class);
        c09dl.LJII();
    }
}
