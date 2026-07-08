package com.bytedance.android.live.effect.board.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BoardSize {

    @C09CT("h")
    public float h;

    @C09CT("w")
    public float w;

    public BoardSize() {
        this(0.3f, 0.3f);
    }

    public BoardSize(float f, float f2) {
        this.w = f;
        this.h = f2;
    }
}
