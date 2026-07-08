package com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.guest;

import X.C013C;
import X.C01GW;
import X.C1555540qa8;
import X.C20441214yg;
import X.C307001Gy;
import X.C497740JfY;
import X.C748880TZe;
import X.C782110Um9;
import X.C786410Ut5;
import X.C919690a2Z;
import X.C922680a7O;
import X.C925080aBG;
import X.C925710aCH;
import X.C925770aCN;
import X.C926930aEF;
import X.C927600aFK;
import X.C929810aIt;
import X.C934690aQl;
import X.EnumC926600aDi;
import X.InterfaceC1106030et7;
import X.InterfaceC517220KQe;
import X.InterfaceC665370Q7z;
import X.InterfaceC743640TFa;
import X.InterfaceC923600a8s;
import Y.AcS354S0200000_15;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveSucceedEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestReservationDiffPkEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS2S1111000_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestV3GuestReservationWidget extends BaseMultiGuestV3GuestWidget {
    public final FrameLayout LL;
    public C922680a7O LLILLJJLI;
    public MultiLiveGuestUserInfoDialog LLILLL;
    public C925710aCH LLILZ;
    public EnumC926600aDi LLILZIL = EnumC926600aDi.SEND_RESERVATION;
    public C925770aCN LLILZLL;

    @Override // X.InterfaceC926810aE3
    public final void LLIIIL() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hsx;
    }

    @Override // X.InterfaceC926810aE3
    public final void n(boolean z, boolean z2) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC923600a8s
    public final InterfaceC665370Q7z F3() {
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            return C1555540qa8.LJ(frameLayout);
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC923600a8s
    public final void YX1() {
        FragmentManager fragmentManager;
        MultiGuestUserInfoFragment multiGuestUserInfoFragment;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.LLILLL;
        if (multiLiveGuestUserInfoDialog == null || !multiLiveGuestUserInfoDialog.isShowing()) {
            C922680a7O c922680a7O = this.LLILLJJLI;
            this.LLILZ = new C925710aCH(null, c922680a7O != null ? c922680a7O.room : null, false, null, 0, this.dataChannel);
            x1();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
                return;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
            C925770aCN c925770aCN = this.LLILZLL;
            c927600aFKLIZ.getClass();
            if (!C927600aFK.LJIILJJIL(c925770aCN) || this.LLILZIL != EnumC926600aDi.SEND_RESERVATION) {
                MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLL;
                if (multiLiveGuestUserInfoDialog2 != null) {
                    multiLiveGuestUserInfoDialog2.show(fragmentManager, "MultiLiveGuestUserInfoDialog");
                    return;
                }
                return;
            }
            if (InterfaceC1106030et7.M5.LIZIZ().booleanValue()) {
                if (this.LLILLL == null || getContext() == null) {
                    return;
                }
                MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog3 = this.LLILLL;
                Fragment fragmentNR = multiLiveGuestUserInfoDialog3 != null ? multiLiveGuestUserInfoDialog3.NR() : null;
                if (!(fragmentNR instanceof MultiGuestUserInfoFragment) || (multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) fragmentNR) == null) {
                    return;
                }
                multiGuestUserInfoFragment.gS(getContext());
                return;
            }
            final C013C c013c = new C013C();
            C782110Um9 c782110Um9 = new C782110Um9(this.context);
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131841201);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131841200));
            c782110Um9.LJIILIIL(2131841218, new AcS354S0200000_15(c013c, this, 16));
            c782110Um9.LJIIJ(2131841111, new InterfaceC743640TFa() { // from class: X.0aDD
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            liveDialogLIZ.setCanceledOnTouchOutside(false);
            liveDialogLIZ.LJLILLLLZI(new InterfaceC517220KQe() { // from class: X.0Tgw
                @Override // X.InterfaceC517220KQe
                public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ht_, viewGroup, false);
                    C20744116Fj c20744116Fj = (C20744116Fj) viewTd.findViewById(R.id.oxk);
                    c20744116Fj.setChecked(true);
                    c013c.element = c20744116Fj.isChecked();
                    c20744116Fj.setText(C497740JfY.LJIJI(2131842126));
                    C786410Ut5.z7(c20744116Fj, new C785990UsP(c013c, 29));
                    return viewTd;
                }
            });
            C786410Ut5.E4(liveDialogLIZ);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        C922680a7O c922680a7O = this.LLILLJJLI;
        if (c922680a7O != null) {
            c922680a7O.detachView();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLL;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing() && (multiLiveGuestUserInfoDialog = this.LLILLL) != null) {
            multiLiveGuestUserInfoDialog.dismiss();
        }
        this.LLILLL = null;
        C934690aQl.LIZ.LIZIZ();
        super.onDestroy();
    }

    public final void x1() {
        if (this.LLILZLL == null) {
            this.LLILZLL = new C925770aCN(-1, 1, 0, false, 0, false, 0, 0L, null, 0L, null, 8188);
        }
        this.LLILZIL = C929810aIt.LIZ() ? EnumC926600aDi.RESERVING : EnumC926600aDi.SEND_RESERVATION;
        this.LLILLL = C926930aEF.LIZ(MultiLiveGuestUserInfoDialog.Companion, this.dataChannel, this.LLILZ, new WeakReference(this.LLILLJJLI), this.LLILZIL, this.LLILZLL, null, 1, false, 160);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            this.LLILLJJLI = new C922680a7O(room, this.dataChannel, this);
        }
        C922680a7O c922680a7O = this.LLILLJJLI;
        if (c922680a7O != null) {
            c922680a7O.attachView((InterfaceC923600a8s) this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(LinkInRoomGuestReserveSucceedEvent.class, this, new AwS594S0100000_15(this, 421));
            dataChannel2.CQ2(LinkInRoomGuestReserveFailedEvent.class, this, new AwS594S0100000_15(this, 422));
            dataChannel2.CQ2(MultiGuestReservationDiffPkEvent.class, this, new AwS594S0100000_15(this, 423));
        }
    }

    public MultiGuestV3GuestReservationWidget(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    @Override // X.InterfaceC926810aE3
    public final void LLLLLLZZ(String str, boolean z) {
        boolean z2;
        int iIntValue;
        Integer numValueOf;
        MultiGuestDataHolder multiGuestDataHolder;
        MultiGuestDataHolder multiGuestDataHolder2;
        MultiGuestDataHolder multiGuestDataHolder3;
        Long l;
        Long l2;
        C922680a7O c922680a7O = this.LLILLJJLI;
        if (c922680a7O != null) {
            AwS2S1111000_15 awS2S1111000_15 = new AwS2S1111000_15(c922680a7O, str, 1);
            MultiGuestDataHolder multiGuestDataHolder4 = c922680a7O.getMultiGuestDataHolder();
            boolean z3 = true;
            if (multiGuestDataHolder4 != null && (l2 = multiGuestDataHolder4.LJJL) != null && l2.longValue() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str2 = null;
            if (!z2 && (((multiGuestDataHolder = c922680a7O.getMultiGuestDataHolder()) != null && multiGuestDataHolder.LJJJLL == -1) || (((multiGuestDataHolder2 = c922680a7O.getMultiGuestDataHolder()) != null && multiGuestDataHolder2.LJJJLL == 0) || (multiGuestDataHolder3 = c922680a7O.getMultiGuestDataHolder()) == null || Integer.valueOf(multiGuestDataHolder3.LJJJLL) == null))) {
                MultiLiveUserSettings multiLiveUserSettings = c922680a7O.room.multiLiveUserSettings;
                if (multiLiveUserSettings == null || !multiLiveUserSettings.isMultiGuestPermissionInfoAudienceSideNotNull()) {
                    z3 = false;
                }
                if (z3) {
                    C20441214yg.LIZIZ("MultiGuestV3GuestReservationPresenter", "handleHasNoPermission");
                    MultiGuestDataHolder multiGuestDataHolder5 = c922680a7O.getMultiGuestDataHolder();
                    if (multiGuestDataHolder5 != null) {
                        l = multiGuestDataHolder5.LJJL;
                    } else {
                        l = null;
                    }
                    MultiGuestDataHolder multiGuestDataHolder6 = c922680a7O.getMultiGuestDataHolder();
                    if (multiGuestDataHolder6 != null) {
                        str2 = multiGuestDataHolder6.LJJLI;
                    }
                    C919690a2Z c919690a2Z = new C919690a2Z(0, l, str2);
                    InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) c922680a7O.mView;
                    if (interfaceC923600a8s != null) {
                        interfaceC923600a8s.tF2(c919690a2Z);
                        return;
                    }
                    return;
                }
                C20441214yg.LIZIZ("MultiGuestV3GuestReservationPresenter", "handlePermissionInfoIsNullForSafe");
                boolean z4 = C925080aBG.LIZ;
                C925080aBG.LIZLLL(c922680a7O.room, c922680a7O.LL, (InterfaceC923600a8s) c922680a7O.mView, 0, false, null, null, new AwS451S0200000_15(c922680a7O, awS2S1111000_15, 15), null);
                return;
            }
            MultiGuestDataHolder multiGuestDataHolder7 = c922680a7O.getMultiGuestDataHolder();
            if (multiGuestDataHolder7 != null && (numValueOf = Integer.valueOf(multiGuestDataHolder7.LJJJLL)) != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 2;
            }
            awS2S1111000_15.invoke(Integer.valueOf(iIntValue));
        }
    }
}
