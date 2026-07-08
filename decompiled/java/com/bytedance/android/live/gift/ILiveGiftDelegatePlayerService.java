package com.bytedance.android.live.gift;

import X.C006A;
import X.InterfaceC2280931EPr;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes18.dex */
public interface ILiveGiftDelegatePlayerService extends C006A {
    Object buildDelegateGiftPlayListener(InterfaceC2280931EPr interfaceC2280931EPr);

    void clearMasks(Object obj);

    Object createLiveGiftPlayController(Context context, LifecycleOwner lifecycleOwner, Object obj, ViewGroup viewGroup);

    View getAlphaView(Object obj);

    /* bridge */ /* synthetic */ void onInit();

    void releasePlayer(Object obj, Object obj2, ViewGroup viewGroup);

    void setAutoReleaseParam(Object obj, boolean z);

    void setImageMask(Object obj, String str, Bitmap bitmap, float f);

    void setKeepLastFrame(Object obj, boolean z);

    void setLoopParam(Object obj, boolean z);

    void setMute(Object obj, boolean z);

    void setTransparentType(Object obj, int i);

    Object start(Object obj, String str, long j);

    void stop(Object obj);

    void tryCancel(Object obj);
}
