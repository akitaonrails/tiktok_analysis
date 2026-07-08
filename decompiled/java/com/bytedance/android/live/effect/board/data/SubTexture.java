package com.bytedance.android.live.effect.board.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SubTexture {

    @C09CT("localLayout")
    public final LocalLayout localLayout;

    @C09CT("opacity")
    public float opacity;

    @C09CT("renderCacheKey")
    public String renderCacheKey;

    public SubTexture() {
        this("", new LocalLayout(0.0f, 0.0f, 1.0f, 1.0f), 1.0f);
    }

    public SubTexture(String str, LocalLayout localLayout, float f) {
        this.renderCacheKey = str;
        this.localLayout = localLayout;
        this.opacity = f;
    }
}
