package com.bytedance.android.live.gift;

import X.AbstractC986140blk;
import X.C006A;
import android.content.Context;

/* JADX INFO: loaded from: classes16.dex */
public interface IGiftAudioPlayer extends C006A {
    void init(Context context);

    /* bridge */ /* synthetic */ void onInit();

    void pause();

    void release();

    void setListener(AbstractC986140blk abstractC986140blk);

    void setVolume(float f);

    void start();

    void stop();
}
