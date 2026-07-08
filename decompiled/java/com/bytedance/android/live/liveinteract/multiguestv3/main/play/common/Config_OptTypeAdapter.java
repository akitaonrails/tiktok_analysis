package com.bytedance.android.live.liveinteract.multiguestv3.main.play.common;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class Config_OptTypeAdapter extends TypeAdapter<Config> {
    @Override // com.google.gson.TypeAdapter
    public final Config read(C09CU c09cu) {
        Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new Config(369, 492);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "width")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.width = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "height")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.height = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Config config) {
        Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("width");
        c09dl.LJJJJ(Integer.valueOf(config2.width));
        c09dl.LJIILLIIL("height");
        c09dl.LJJJJ(Integer.valueOf(config2.height));
        c09dl.LJII();
    }
}
