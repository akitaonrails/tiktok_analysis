package com.bytedance.android.live.publicscreen.impl.widget;

import X.C01GW;
import X.C1083910eJR;
import X.C1295960jpS;
import X.C19748612Om;
import X.C292401Bi;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import Y.ALAdapterS13S0100000_17;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.livesdk.dataChannel.LikeGuideEvent;
import com.bytedance.android.livesdk.dataChannel.StartClearScreenEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class InteractionLikeGuideWidget extends IPublicScreenContextWidget {
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new AwS561S0100000_17(this, 93));
    public final C01GW LLILLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 92));
    public ValueAnimator LLILZ;
    public ValueAnimator LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h0k;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ViewGroup viewGroup;
        this.LLILZLL = false;
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C19748612Om.LIZIZ(viewGroup);
        }
        x1();
        y1().cancelAnimation();
        C1083910eJR.LIZ(this.dataChannel, 2);
        hide();
    }

    public final void x1() {
        ValueAnimator valueAnimator = this.LLILZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILZ = null;
        ValueAnimator valueAnimator2 = this.LLILZIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLILZIL = null;
    }

    public final C1295960jpS y1() {
        return (C1295960jpS) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(this, 2));
        }
        y1().setAnimation(R.raw.tux_lottie_tux_gestures_only_tt_double_tap);
        y1().setRepeatCount(2);
        y1().addAnimatorListener(new ALAdapterS13S0100000_17(this, 7));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LikeGuideEvent.class, new AwS596S0100000_17(this, 76));
            dataChannel.BQ2(this, StartClearScreenEvent.class, new AwS596S0100000_17(this, 77));
        }
    }
}
