package com.bytedance.android.live.publicscreen.impl.widget;

import X.C0IJ7;
import X.C1161920gLG;
import X.C20441214yg;
import X.C486790J7d;
import X.C781550UlF;
import X.InterfaceC1097170eep;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.pin.widget.LandscapeCommentPinnedWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.IsFromLandscapeData;
import com.bytedance.android.livesdk.dataChannel.IsFromPortraitData;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenXmlLayerOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LandscapePublicScreenWidget extends PublicScreenWidget {
    @Override // X.InterfaceC1112050f2p
    public final boolean fu() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void A1() {
        C781550UlF c781550UlF = this.LLJLLIL.LIZ;
        if (c781550UlF != null) {
            c781550UlF.setHasFixedSize(true);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        super.onInit(objArr);
        if (LivePublicScreenXmlLayerOptSetting.INSTANCE.enablePreLoadOpt(false)) {
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Qq1(false, false);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        LiveRecyclableWidget.RecyclableWidgetCallback recyclableWidgetCallback;
        IPublicScreenContextWidget iPublicScreenContextWidget;
        super.onLoad(recycleSource, objArr);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(IsFromPortraitData.class), Boolean.TRUE)) {
            hide();
            C20441214yg.LJIIIZ("Portrait2LandscapeAnimationInit", "set PublicScreenWidget invisible");
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.zW(IsFromPortraitData.class, Boolean.FALSE);
            }
        } else {
            show();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.zW(IsFromLandscapeData.class, Boolean.TRUE);
        }
        enableSubWidgetManager(new WidgetCreateTimeUtil(null), C486790J7d.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C0IJ7.LIZLLL(getContext()));
        if (this.LLJJJJJIL != null && ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).qD(this.LLJJJJJIL)) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if ((interfaceC1097170eep instanceof LiveRecyclableWidget.RecyclableWidgetCallback) && (recyclableWidgetCallback = (LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC1097170eep) != null && (iPublicScreenContextWidget = (IPublicScreenContextWidget) recyclableWidgetCallback.load(R.id.qhj, LandscapeCommentPinnedWidget.class, true)) != null) {
                iPublicScreenContextWidget.LL = this.LLJILJILJ.LLLJL;
            }
        }
    }
}
