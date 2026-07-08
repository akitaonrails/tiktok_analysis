package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget;

import X.InterfaceC941870acL;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseAigcWidget extends LiveWidget implements InterfaceC941870acL {
    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "aigc";
    }

    public void end() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            return Intrinsics.LJFF(dataChannel.gg0(AigcWallpaperStatus.class), Boolean.TRUE);
        }
        return false;
    }
}
