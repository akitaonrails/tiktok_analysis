package com.bytedance.android.live.effect.board.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BoardPos {

    @C09CT("x")
    public float x;

    @C09CT("y")
    public float y;

    public BoardPos() {
        this(0.5f, 0.5f);
    }

    public BoardPos(float f, float f2) {
        this.x = f;
        this.y = f2;
    }
}
