package com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget;

import X.C20441214yg;
import X.C917720ZzO;
import X.InterfaceC941870acL;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.KaraokeStateChannel;
import com.bytedance.android.live.effect.api.KaraokeStopEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.recordv2.PlayRecordConfigSettingV2;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseKaraokeWidget extends LiveWidget implements InterfaceC941870acL {
    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "karaoke";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC941870acL
    public final void end() {
        C20441214yg.LIZIZ("BaseKaraokeWidget", "ILinkMicAbility#end");
        DataChannelGlobal.LLILZ.GQ2(KaraokeStopEvent.class);
    }

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        if (PlayRecordConfigSettingV2.INSTANCE.enable()) {
            return Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(KaraokeStateChannel.class), Boolean.TRUE);
        }
        C917720ZzO.LIZ.getClass();
        return C917720ZzO.LIZJ() && Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(KaraokeStateChannel.class), Boolean.TRUE);
    }
}
