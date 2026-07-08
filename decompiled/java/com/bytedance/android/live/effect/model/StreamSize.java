package com.bytedance.android.live.effect.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class StreamSize {

    @C09CT("surface_height")
    public int surfaceHeight;

    @C09CT("surface_width")
    public int surfaceWidth;

    @C09CT("video_height")
    public int videoHeight;

    @C09CT("video_width")
    public int videoWidth;

    public StreamSize() {
        this(0, 0, 0, 0);
    }

    public StreamSize(int i, int i2, int i3, int i4) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        this.videoWidth = i3;
        this.videoHeight = i4;
    }
}
