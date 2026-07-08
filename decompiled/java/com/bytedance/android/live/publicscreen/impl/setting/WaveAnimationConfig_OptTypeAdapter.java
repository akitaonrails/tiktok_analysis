package com.bytedance.android.live.publicscreen.impl.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class WaveAnimationConfig_OptTypeAdapter extends TypeAdapter<WaveAnimationConfig> {
    @Override // com.google.gson.TypeAdapter
    public final WaveAnimationConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WaveAnimationConfig waveAnimationConfig = new WaveAnimationConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "stay_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    waveAnimationConfig.stayDuration = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return waveAnimationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WaveAnimationConfig waveAnimationConfig) throws IOException {
        WaveAnimationConfig waveAnimationConfig2 = waveAnimationConfig;
        if (waveAnimationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("stay_duration");
        c09dl.LJJIZ(waveAnimationConfig2.stayDuration);
        c09dl.LJII();
    }
}
