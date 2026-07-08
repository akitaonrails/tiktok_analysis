package com.bytedance.android.live.broadcast.preview;

import X.C1148240fzC;
import X.C13LE;
import X.C13LQ;
import X.C19719912Dl;
import X.C500260Jjc;
import X.C770220UJg;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.PreviewECommerceGrowthTaskWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNoPermissionDisplayButtonList;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNoPermissionDisplaySwitch;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PreviewWidget extends LiveWidget {
    public final boolean LL = true;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public void C1() {
        this.LLILLL = true;
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZIZ(C13LE.LIZ(getClass()));
    }

    public void D1() {
        this.LLILLL = false;
    }

    public void onHide() {
    }

    public void onShow() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public String y1() {
        return "";
    }

    public boolean z1() {
        return !(this instanceof PreviewECommerceGrowthTaskWidget);
    }

    public final boolean A1() {
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel != null ? dataChannel.gg0(LiveModeChannel.class) : null) == LiveMode.THIRD_PARTY;
    }

    public final boolean B1() {
        DataChannel dataChannel = this.dataChannel;
        return (dataChannel != null ? dataChannel.gg0(LiveModeChannel.class) : null) == LiveMode.VIDEO;
    }

    public final boolean F1() {
        if (LiveNoPermissionDisplaySwitch.INSTANCE.enable() && Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), Boolean.TRUE)) {
            return !C13LQ.LJIILLIIL(y1(), LiveNoPermissionDisplayButtonList.INSTANCE.getValue());
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void hide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(getClass());
        C770220UJg.LJ.put(c19719912DlLIZ, Boolean.FALSE);
        C770220UJg.LJFF(c19719912DlLIZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(getClass());
        C770220UJg.LJ.put(c19719912DlLIZ, Boolean.TRUE);
        C770220UJg.LJI(c19719912DlLIZ);
    }

    public void E1() {
        C500260Jjc.LJIILIIL(getView());
        if (this instanceof BannerWidget) {
            return;
        }
        if (z1()) {
            show();
        } else {
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        E1();
        C1();
    }

    public boolean x1() {
        return this.LL;
    }
}
