package com.bytedance.android.live.publicscreen.impl.widget;

import X.C0IJ7;
import X.C1109770ez9;
import X.C1161920gLG;
import X.C21648719nx;
import X.C439101nJ;
import X.C486790J7d;
import X.C500260Jjc;
import X.C751980Tee;
import X.C781520UlC;
import X.C781550UlF;
import X.InterfaceC1085480eLy;
import X.InterfaceC1097170eep;
import Y.ARunnableS112S0100000_12;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.DismissInputDialogEvent;
import com.bytedance.android.livesdk.dataChannel.IsFromLandscapeData;
import com.bytedance.android.livesdk.dataChannel.IsFromPortraitData;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAnchorFadingEdgeSetting;
import com.bytedance.android.livesdk.livesetting.LivePublicScreenUiConfigAudienceFadingEdgeSetting;
import com.bytedance.android.livesdk.livesetting.game.LiveOrientationPerceptionOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenClickCloseKeyboardSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenXmlLayerOptSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.IAnimatableWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PortraitPublicScreenWidget extends PublicScreenWidget implements IAnimatableWidget {
    public GestureDetector LLLF;
    public InterfaceC1085480eLy LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public ExtendedScreenGuideWidget LLLI;

    @Override // X.InterfaceC1112050f2p
    public final boolean fu() {
        return true;
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

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.InterfaceC1112050f2p
    public final void BE2() {
        super.BE2();
        ExtendedScreenGuideWidget extendedScreenGuideWidget = this.LLLI;
        if (extendedScreenGuideWidget != null) {
            extendedScreenGuideWidget.hide();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.InterfaceC1112050f2p
    public final void KB() {
        super.KB();
        ExtendedScreenGuideWidget extendedScreenGuideWidget = this.LLLI;
        if (extendedScreenGuideWidget != null) {
            extendedScreenGuideWidget.show();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void animateHide() {
        IAnimatableWidget.DefaultImpls.animateHide(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void animateShow() {
        IAnimatableWidget.DefaultImpls.animateShow(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void cancelHideAnimation() {
        IAnimatableWidget.DefaultImpls.cancelHideAnimation(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void cancelShowAnimation() {
        IAnimatableWidget.DefaultImpls.cancelShowAnimation(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        IAnimatableWidget.DefaultImpls.onHideAnimationEnd(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationStart() {
        IAnimatableWidget.DefaultImpls.onHideAnimationStart(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationEnd() {
        IAnimatableWidget.DefaultImpls.onShowAnimationEnd(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        IAnimatableWidget.DefaultImpls.onShowAnimationStart(this);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.InterfaceC1112050f2p
    public final void LLJZ(MotionEvent motionEvent) {
        InterfaceC1085480eLy interfaceC1085480eLy;
        View.OnTouchListener onTouchListenerLJJ;
        GestureDetector gestureDetector;
        if (motionEvent != null && (gestureDetector = this.LLLF) != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.LLLFFI && (interfaceC1085480eLy = this.LLLFF) != null && (onTouchListenerLJJ = interfaceC1085480eLy.LJJ()) != null) {
            onTouchListenerLJJ.onTouch(getView(), motionEvent);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        int iLIZ;
        super.onInit(objArr);
        this.LLLF = new GestureDetector(this.context, new C21648719nx() { // from class: X.0eOV
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_like_long_press");
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJII("like", "action_type");
                c474500IjALIZ.LIZ();
                return super.onDoubleTap(motionEvent);
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (LivePublicScreenClickCloseKeyboardSetting.INSTANCE.blankCanCloseKeyboard(C500260Jjc.LJIIZILJ(this.LL.dataChannel))) {
                    PortraitPublicScreenWidget portraitPublicScreenWidget = this.LL;
                    if (portraitPublicScreenWidget.LLLFFI) {
                        portraitPublicScreenWidget.dataChannel.FQ2(DismissInputDialogEvent.class);
                        return true;
                    }
                }
                return super.onSingleTapUp(motionEvent);
            }
        });
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            iLIZ = C439101nJ.LIZ(LivePublicScreenUiConfigAnchorFadingEdgeSetting.INSTANCE.getValue());
        } else {
            iLIZ = C439101nJ.LIZ(LivePublicScreenUiConfigAudienceFadingEdgeSetting.INSTANCE.getValue());
        }
        C781550UlF c781550UlF = this.LLJLLIL.LIZ;
        if (c781550UlF != null) {
            c781550UlF.setFadingEdgeLength(iLIZ);
        }
        this.LLJLLL.setFadingEdgeLength(iLIZ);
        boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(this.dataChannel);
        if (LivePublicScreenXmlLayerOptSetting.INSTANCE.enablePreLoadOpt(zLJIIZILJ)) {
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Qq1(zLJIIZILJ, true);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        this.LLLFZ = false;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget;
        LiveRecyclableWidget.RecyclableWidgetCallback recyclableWidgetCallback;
        LiveRecyclableWidget.RecyclableWidgetCallback recyclableWidgetCallback2;
        IPublicScreenContextWidget iPublicScreenContextWidget;
        LiveRecyclableWidget.RecyclableWidgetCallback recyclableWidgetCallback3;
        IPublicScreenContextWidget iPublicScreenContextWidget2;
        super.onLoad(recycleSource, objArr);
        DataChannel dataChannel = this.dataChannel;
        boolean z = false;
        if (C500260Jjc.LJIIZILJ(dataChannel) && !C500260Jjc.LJJIZ(dataChannel) && !C781520UlC.LIZJ(C751980Tee.LIZJ(dataChannel))) {
            enableSubWidgetManager();
            this.LLLI = (ExtendedScreenGuideWidget) this.subWidgetManager.load(R.id.f726jem, ExtendedScreenGuideWidget.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, LiveExtendedScreenStatus.class, new AwS596S0100000_17(this, 78));
            dataChannel2.EQ2(this, KeyboardStatusChannel.class, new AwS596S0100000_17(this, 79));
        }
        Object objGg0 = null;
        enableSubWidgetManager(new WidgetCreateTimeUtil(null), C486790J7d.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C0IJ7.LIZLLL(getContext()));
        if (C500260Jjc.LJJJIL(this.dataChannel) || (this.LLJJJJJIL != null && ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).qD(this.LLJJJJJIL))) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if ((interfaceC1097170eep instanceof LiveRecyclableWidget.RecyclableWidgetCallback) && (recyclableWidgetCallback = (LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC1097170eep) != null && (mainScreenCommentPinnedWidget = (MainScreenCommentPinnedWidget) recyclableWidgetCallback.load(R.id.qhj, MainScreenCommentPinnedWidget.class, true)) != null) {
                mainScreenCommentPinnedWidget.LL = this.LLJILJILJ.LLLJL;
            } else {
                mainScreenCommentPinnedWidget = null;
            }
            this.LLJ = mainScreenCommentPinnedWidget;
        }
        C1109770ez9 c1109770ez9 = this.LLJILJILJ.LLLJL;
        if (!c1109770ez9.LJI && c1109770ez9.LJFF()) {
            InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
            if ((interfaceC1097170eep2 instanceof LiveRecyclableWidget.RecyclableWidgetCallback) && (recyclableWidgetCallback3 = (LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC1097170eep2) != null && (iPublicScreenContextWidget2 = (IPublicScreenContextWidget) recyclableWidgetCallback3.load(R.id.j5k, GreetingAnimWidget.class, true)) != null) {
                iPublicScreenContextWidget2.LL = this.LLJILJILJ.LLLJL;
            }
        }
        if (!this.LLJILJILJ.LLLJL.LJI) {
            InterfaceC1097170eep interfaceC1097170eep3 = this.widgetCallback;
            if ((interfaceC1097170eep3 instanceof LiveRecyclableWidget.RecyclableWidgetCallback) && (recyclableWidgetCallback2 = (LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC1097170eep3) != null && (iPublicScreenContextWidget = (IPublicScreenContextWidget) recyclableWidgetCallback2.load(R.id.mnu, InteractionLikeGuideWidget.class, true)) != null) {
                iPublicScreenContextWidget.LL = this.LLJILJILJ.LLLJL;
            }
        }
        this.LLLFF = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(this.LLJJJJJIL.getId());
        if (LiveOrientationPerceptionOptSetting.INSTANCE.enable()) {
            if (recycleSource == RecycleSource.FROM_CONFIG_CHANGE) {
                z = true;
            }
            objGg0 = Boolean.valueOf(z);
        } else {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                objGg0 = dataChannel3.gg0(IsFromLandscapeData.class);
            }
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(objGg0, bool)) {
            IAnimatableWidget.DefaultImpls.animateShow(this);
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.zW(IsFromLandscapeData.class, Boolean.FALSE);
            }
        } else {
            show();
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.zW(IsFromPortraitData.class, bool);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.InterfaceC1112050f2p
    public final void cr1(int i, int i2, boolean z) {
        super.cr1(i, i2, z);
        if (!this.LLLFZ) {
            this.LLLFZ = true;
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 473));
            }
        }
    }
}
