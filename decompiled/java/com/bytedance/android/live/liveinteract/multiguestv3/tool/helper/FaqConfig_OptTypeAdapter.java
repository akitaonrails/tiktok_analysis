package com.bytedance.android.live.liveinteract.multiguestv3.tool.helper;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class FaqConfig_OptTypeAdapter extends TypeAdapter<FaqConfig> {
    public final Gson LIZ;

    public FaqConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FaqConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FaqConfig faqConfig = new FaqConfig(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "show_region_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    faqConfig.showRegionList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "FAQ_uri")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    faqConfig.faqUri = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return faqConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FaqConfig faqConfig) {
        FaqConfig faqConfig2 = faqConfig;
        if (faqConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("show_region_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, faqConfig2.showRegionList, String.class);
        c09dl.LJIILLIIL("FAQ_uri");
        c09dl.LJJJJJ(faqConfig2.faqUri);
        c09dl.LJII();
    }
}
