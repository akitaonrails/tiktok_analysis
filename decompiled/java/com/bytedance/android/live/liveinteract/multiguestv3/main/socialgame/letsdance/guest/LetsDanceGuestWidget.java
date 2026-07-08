package com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.guest;

import X.C20441214yg;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceGuestMuteVideoEvent;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class LetsDanceGuestWidget extends LetsDanceBaseWidget<LetsDanceGuestViewModel> {
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C20441214yg.LIZIZ("LetsDanceGuestWidget", "onCreate");
        this.dataChannel.BQ2(this, MultiLetsDanceGuestMuteVideoEvent.class, new AwS594S0100000_15(this, 427));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseWidget
    public final Class<LetsDanceGuestViewModel> y1() {
        return LetsDanceGuestViewModel.class;
    }
}
