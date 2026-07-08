package com.bytedance.android.live.effect.board.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LocalLayout {

    @C09CT("h")
    public final float h;

    @C09CT("l")
    public final float l;

    @C09CT("t")
    public final float t;

    @C09CT("w")
    public final float w;

    public LocalLayout() {
        this(0.0f, 0.0f, 1.0f, 1.0f);
    }

    public LocalLayout(float f, float f2, float f3, float f4) {
        this.l = f;
        this.t = f2;
        this.w = f3;
        this.h = f4;
    }
}
