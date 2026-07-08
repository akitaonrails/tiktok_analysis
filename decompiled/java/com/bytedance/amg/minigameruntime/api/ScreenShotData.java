package com.bytedance.amg.minigameruntime.api;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class ScreenShotData {
    public final int height;
    public final ByteBuffer pixels;
    public final int width;

    public ScreenShotData(int i, int i2, ByteBuffer byteBuffer) {
        this.width = i;
        this.height = i2;
        this.pixels = byteBuffer;
    }
}
