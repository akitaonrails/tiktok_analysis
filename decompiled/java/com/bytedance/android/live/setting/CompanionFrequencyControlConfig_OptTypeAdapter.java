package com.bytedance.android.live.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CompanionFrequencyControlConfig_OptTypeAdapter extends TypeAdapter<CompanionFrequencyControlConfig> {
    @Override // com.google.gson.TypeAdapter
    public final CompanionFrequencyControlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CompanionFrequencyControlConfig companionFrequencyControlConfig = new CompanionFrequencyControlConfig(0L, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "window_size")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    companionFrequencyControlConfig.windowSize = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "limit_in_window")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    companionFrequencyControlConfig.limitInWindow = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return companionFrequencyControlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CompanionFrequencyControlConfig companionFrequencyControlConfig) throws IOException {
        CompanionFrequencyControlConfig companionFrequencyControlConfig2 = companionFrequencyControlConfig;
        if (companionFrequencyControlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("window_size");
        c09dl.LJJIZ(companionFrequencyControlConfig2.windowSize);
        c09dl.LJIILLIIL("limit_in_window");
        c09dl.LJJIZ(companionFrequencyControlConfig2.limitInWindow);
        c09dl.LJII();
    }
}
