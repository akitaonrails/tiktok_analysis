package com.bytedance.android;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LevelPair_OptTypeAdapter extends TypeAdapter<LevelPair> {
    @Override // com.google.gson.TypeAdapter
    public final LevelPair read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LevelPair levelPair = new LevelPair();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "score")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    levelPair.score = (float) c09cu.LJJIL();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "delay_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    levelPair.delayTime = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return levelPair;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LevelPair levelPair) {
        LevelPair levelPair2 = levelPair;
        if (levelPair2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("score");
        c09dl.LJJJJ(Float.valueOf(levelPair2.score));
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJJJ(Integer.valueOf(levelPair2.delayTime));
        c09dl.LJII();
    }
}
