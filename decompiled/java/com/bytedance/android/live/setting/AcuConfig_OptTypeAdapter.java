package com.bytedance.android.live.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AcuConfig_OptTypeAdapter extends TypeAdapter<AcuConfig> {
    @Override // com.google.gson.TypeAdapter
    public final AcuConfig read(C09CU c09cu) {
        AcuConfig acuConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            acuConfig = new AcuConfig(0, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "window_messages")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        acuConfig.window = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "max_show_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        acuConfig.maxCount = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return acuConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AcuConfig acuConfig) {
        AcuConfig acuConfig2 = acuConfig;
        if (acuConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("window_messages");
        c09dl.LJJJJ(Integer.valueOf(acuConfig2.window));
        c09dl.LJIILLIIL("max_show_count");
        c09dl.LJJJJ(Integer.valueOf(acuConfig2.maxCount));
        c09dl.LJII();
    }
}
