package com.bytedance.android.live.effect.livegoal;

import X.C786410Ut5;
import Y.ARunnableS112S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.LiveGoalDialogShow;
import com.bytedance.android.live.effect.api.LiveGoalHighLightEvent;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveGoalEffectWidget extends LiveWidget {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public boolean LLILZLL = true;
    public boolean LLIZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h6p;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void x1() {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLILLL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        this.LLIZ = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        this.LL = view != null ? view.findViewById(R.id.iuq) : null;
        View view2 = getView();
        this.LLILLJJLI = view2 != null ? view2.findViewById(R.id.yc5) : null;
        View view3 = getView();
        this.LLILLL = view3 != null ? view3.findViewById(R.id.cfj) : null;
        View view4 = this.LLILLJJLI;
        if (view4 != null) {
            C786410Ut5.T4(view4, 0.0f);
        }
        View view5 = this.LLILLL;
        if (view5 != null) {
            C786410Ut5.T4(view5, 0.0f);
        }
        View view6 = getView();
        this.LLILZ = view6 != null ? view6.findViewById(R.id.yaj) : null;
        View view7 = getView();
        this.LLILZIL = view7 != null ? view7.findViewById(R.id.cdv) : null;
        View view8 = getView();
        if (view8 != null) {
            HandlerHook.viewPost(view8, new ARunnableS112S0100000_12(this, 16));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveGoalHighLightEvent.class, new AwS591S0100000_12(this, 83));
            dataChannel.BQ2(this, LiveGoalOverlayEvent.class, new AwS591S0100000_12(this, 84));
            dataChannel.CQ2(LiveGoalDialogShow.class, this, new AwS591S0100000_12(this, 85));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 16));
        }
    }
}
