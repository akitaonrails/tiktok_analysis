package com.bytedance.android.live.liveinteract.multihost.biz.link;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiSourceLayoutConfig_OptTypeAdapter extends TypeAdapter<MultiSourceLayoutConfig> {
    public final Gson LIZ;

    public MultiSourceLayoutConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiSourceLayoutConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiSourceLayoutConfig multiSourceLayoutConfig = new MultiSourceLayoutConfig(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "landscape_layout")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    multiSourceLayoutConfig.landscapeLayout = C473040Igo.LIZJ(this.LIZ, c09cu, Integer.TYPE, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "portrait_layout")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    multiSourceLayoutConfig.portraitLayout = C473040Igo.LIZJ(this.LIZ, c09cu, Integer.TYPE, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return multiSourceLayoutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiSourceLayoutConfig multiSourceLayoutConfig) {
        MultiSourceLayoutConfig multiSourceLayoutConfig2 = multiSourceLayoutConfig;
        if (multiSourceLayoutConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("landscape_layout");
        C473040Igo.LJ(this.LIZ, c09dl, multiSourceLayoutConfig2.landscapeLayout, String.class);
        c09dl.LJIILLIIL("portrait_layout");
        C473040Igo.LJ(this.LIZ, c09dl, multiSourceLayoutConfig2.portraitLayout, String.class);
        c09dl.LJII();
    }
}
