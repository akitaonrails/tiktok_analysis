package com.bytedance.android.live.effect.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class VideoSize {

    @C09CT("is_full_screen")
    public boolean isFullScreen;

    @C09CT("real_height")
    public int realHeight;

    @C09CT("real_width")
    public int realWidth;

    @C09CT("surface_height")
    public int surfaceHeight;

    @C09CT("surface_width")
    public int surfaceWidth;

    public VideoSize() {
        this(0, 0, 0, 0, true);
    }

    public VideoSize(int i, int i2, int i3, int i4, boolean z) {
        this.realWidth = i;
        this.surfaceWidth = i2;
        this.realHeight = i3;
        this.surfaceHeight = i4;
        this.isFullScreen = z;
    }
}
