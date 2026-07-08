package com.bytedance.android.live.pin.widget;

import X.AbstractC1109720ez4;
import X.AbstractC1109730ez5;
import X.C01GW;
import X.C1097140eem;
import X.C1109560eyo;
import X.C1109600eys;
import X.C1109830ezF;
import X.C1109850ezH;
import X.C1151780g4u;
import X.C1161920gLG;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1819620xS4;
import X.C292401Bi;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC325470CpN;
import X.InterfaceC1090080eTO;
import X.InterfaceC1097170eep;
import X.InterfaceC1111870f2X;
import X.InterfaceC1112060f2q;
import Y.ARunnableS117S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.publicscreen.api.MainScreenPinnedWidgetLoadedChannel;
import com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenPinOptimizeSetting;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class MainScreenCommentPinnedWidget extends BaseCommentPinnedWidget {
    public InterfaceC1090080eTO LLJJJJ;
    public AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> LLJJJJJIL;
    public final C01GW LLJJIJIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 70));
    public final C01GW LLJJJ = C292401Bi.LIZ(new AwS561S0100000_17(this, 72));
    public final C01GW LLJJJIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 71));
    public final C01GW LLJJJJLIIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 73));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h3j;
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final int H1() {
        return (int) C497740JfY.LIZIZ(20.0f);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void I1() {
        Fragment parentFragment = this.widgetCallback.getFragment().getParentFragment();
        if (parentFragment != null) {
            InterfaceC1090080eTO interfaceC1090080eTOSq1 = ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).sq1(parentFragment, this.dataChannel);
            this.LLJJJJ = interfaceC1090080eTOSq1;
            if (interfaceC1090080eTOSq1 != null) {
                interfaceC1090080eTOSq1.init();
            }
            InterfaceC1090080eTO interfaceC1090080eTO = this.LLJJJJ;
            if (interfaceC1090080eTO == null || interfaceC1090080eTO.DD0() == null) {
                C500260Jjc.LJIILIIL(S1());
                C500260Jjc.LLFFF((View) this.LLJJJIL.getValue());
            }
            InterfaceC1090080eTO interfaceC1090080eTO2 = this.LLJJJJ;
            if (interfaceC1090080eTO2 != null) {
                interfaceC1090080eTO2.MJ1((Observer) this.LLJJJJLIIL.getValue());
            }
        }
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final AbstractC1109730ez5 J1() {
        return new AbstractC1109730ez5() { // from class: X.0eek
        };
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void L1() {
        Fragment fragment;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null || fragment.getActivity() == null) {
            return;
        }
        this.LLILZIL = (PinMessageViewModel) ViewModelProviders.of(interfaceC1097170eep.getFragment()).get(PinMessageViewModel.class);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void P1() {
        InterfaceC1090080eTO interfaceC1090080eTO = this.LLJJJJ;
        if ((interfaceC1090080eTO == null || interfaceC1090080eTO.DD0() == null) && C500260Jjc.LJJJI((Boolean) this.dataChannel.gg0(CommentPinWidgetVisibility.class))) {
            this.dataChannel.zW(CommentPinWidgetVisibility.class, Boolean.FALSE);
        }
    }

    public final C1097140eem S1() {
        return (C1097140eem) this.LLJJJ.getValue();
    }

    public final void T1() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ConstraintProperty constraintPropertyById;
        int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
        int iLJIIIZ = LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() ? C497740JfY.LJIIIZ(R.dimen.atz) : iLIZIZ;
        LayeredElementContext layeredElementContext = getLayeredElementContext();
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(getId())) != null) {
            constraintPropertyById.margin(6, iLIZIZ);
            constraintPropertyById.margin(7, iLJIIIZ);
            constraintPropertyById.apply();
            return;
        }
        View view = this.contentView;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(iLIZIZ);
        marginLayoutParams.setMarginEnd(iLJIIIZ);
        View view2 = this.contentView;
        if (view2 != null) {
            C786410Ut5.W5(view2, marginLayoutParams);
        }
        View view3 = this.contentView;
        if (view3 != null) {
            view3.requestLayout();
        }
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final C1109830ezF B1() {
        C1097140eem c1097140eemA1 = A1();
        if (!(c1097140eemA1 instanceof ViewGroup) || c1097140eemA1 == null) {
            return null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.context), LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() ? R.layout.h2f : R.layout.h2e, c1097140eemA1, false);
        c1097140eemA1.addView(viewTd);
        PinMessageViewModel pinMessageViewModel = this.LLILZIL;
        return new C1109830ezF(viewTd, pinMessageViewModel != null ? pinMessageViewModel.LL : null, false);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final C1109850ezH C1() {
        C1097140eem c1097140eemA1 = A1();
        if (!(c1097140eemA1 instanceof ViewGroup) || c1097140eemA1 == null) {
            return null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.context), LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() ? R.layout.h2h : R.layout.h2g, c1097140eemA1, false);
        c1097140eemA1.addView(viewTd);
        PinMessageViewModel pinMessageViewModel = this.LLILZIL;
        return new C1109850ezH(viewTd, pinMessageViewModel != null ? pinMessageViewModel.LL : null, false);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void M1(C1109560eyo c1109560eyo) {
        ImageModel imageModel;
        C1324720kZq c1324720kZq = (C1324720kZq) this.LLJJIJIL.getValue();
        if (c1109560eyo != null && (imageModel = c1109560eyo.LIZIZ) != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIIL = new C1151780g4u(c1324720kZq, 1);
            c1324610kZfLJIIIZ.LJJI(c1324720kZq);
            return;
        }
        C786410Ut5.LLJJIII(c1324720kZq, 8);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void N1(C1109600eys<? extends InterfaceC1111870f2X> c1109600eys) {
        show();
        InterfaceC1090080eTO interfaceC1090080eTO = this.LLJJJJ;
        if (interfaceC1090080eTO != null && interfaceC1090080eTO.DD0() != null && c1109600eys.LIZLLL == 0 && (c1109600eys.LIZ() instanceof InterfaceC1112060f2q)) {
            if (((InterfaceC1112060f2q) c1109600eys.LIZ()).LLIL()) {
                InterfaceC1090080eTO interfaceC1090080eTO2 = this.LLJJJJ;
                if (interfaceC1090080eTO2 != null) {
                    interfaceC1090080eTO2.T51(EnumC325470CpN.STAR_SELF_COMMENT);
                    return;
                }
                return;
            }
            InterfaceC1090080eTO interfaceC1090080eTO3 = this.LLJJJJ;
            if (interfaceC1090080eTO3 == null) {
                return;
            }
            interfaceC1090080eTO3.T51(EnumC325470CpN.STAR_OTHER_COMMENT);
        }
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void O1(C1109600eys<? extends InterfaceC1111870f2X> c1109600eys) {
        InterfaceC1090080eTO interfaceC1090080eTO;
        show();
        InterfaceC1090080eTO interfaceC1090080eTO2 = this.LLJJJJ;
        if (interfaceC1090080eTO2 != null && interfaceC1090080eTO2.DD0() != null && c1109600eys.LIZLLL == 0 && (interfaceC1090080eTO = this.LLJJJJ) != null) {
            interfaceC1090080eTO.T51(EnumC325470CpN.PIN_COMMENT);
        }
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        View view;
        C500260Jjc.LJIILIIL(S1());
        C500260Jjc.LLFFF((View) this.LLJJJIL.getValue());
        super.onLoad(objArr);
        T1();
        if (LivePublicScreenPinOptimizeSetting.INSTANCE.isEnabled() && (view = this.contentView) != null) {
            HandlerHook.viewPost(view, new ARunnableS117S0100000_17(this, 34));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(MainScreenPinnedWidgetLoadedChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void z1(boolean z) {
        super.z1(true);
        AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez4 = this.LLJJJJJIL;
        if (abstractC1109720ez4 != null && !abstractC1109720ez4.N5().LLLIZZ) {
            abstractC1109720ez4.N5().LJJLIIJ(true);
        }
    }
}
