package com.bytedance.android.live.effect.board.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class FadeParameters {

    @C09CT("direction")
    public int direction;

    @C09CT("duration")
    public float duration;

    @C09CT("endOpacity")
    public float endOpacity;

    @C09CT("expand")
    public int expand;

    @C09CT("opacity")
    public float opacity;

    @C09CT("startOpacity")
    public float startOpacity;

    @C09CT("subTextureIndex")
    public int subTextureIndex;

    public FadeParameters() {
        this(0, 1.0f, 1.0f, 0.3f, 1, 1, 1.0f);
    }

    public FadeParameters(int i, float f, float f2, float f3, int i2, int i3, float f4) {
        this.subTextureIndex = i;
        this.startOpacity = f;
        this.endOpacity = f2;
        this.duration = f3;
        this.expand = i2;
        this.direction = i3;
        this.opacity = f4;
    }
}
