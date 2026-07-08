package com.bytedance.android.live.publicscreen.impl.caption;

import X.C497740JfY;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.CaptionTextTouchEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTopInvadeEvent;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class CaptionTextDeleteTopWidget extends LiveRecyclableWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxt;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.contentView.setBackgroundColor(C497740JfY.LJFF(R.color.a2o));
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        findViewById(R.id.xop);
        findViewById(R.id.dca);
        findViewById(R.id.dcb);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.dataChannel.BQ2(this, CaptionTopInvadeEvent.class, new AwS596S0100000_17(this, 63));
        this.dataChannel.BQ2(this, CaptionTextTouchEvent.class, new AwS596S0100000_17(this, 64));
        hide();
    }
}
