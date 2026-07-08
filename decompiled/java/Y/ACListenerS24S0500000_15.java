package Y;

import X.AbstractC962220b9A;
import X.C013C;
import X.C1161920gLG;
import X.C12ES;
import X.C16F5;
import X.C20515815Po;
import X.C2097608Jq;
import X.C259800zU;
import X.C439101nJ;
import X.C497740JfY;
import X.C782110Um9;
import X.C784440Upu;
import X.C786410Ut5;
import X.C936170aT9;
import X.C953550avB;
import X.C955400ayA;
import X.C955540ayO;
import X.C955590ayT;
import X.EnumC952890au7;
import X.InterfaceC743640TFa;
import X.InterfaceC953490av5;
import X.InterfaceC962270b9F;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostSearchCloseKeyBoard;
import com.bytedance.android.live.room.DismissUserProfileEvent;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS24S0500000_15 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS24S0500000_15 aCListenerS24S0500000_15, View view) {
        String strLJIJI;
        if (((C953550avB) aCListenerS24S0500000_15.l0).LIZ.privateStatus == 1) {
            strLJIJI = C497740JfY.LJIJI(2131854945);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131854944);
        }
        C782110Um9 c782110Um9 = new C782110Um9(((View) aCListenerS24S0500000_15.l1).getContext());
        c782110Um9.LJIIZILJ(2131854946);
        c782110Um9.LJIIIZ(strLJIJI);
        c782110Um9.LJIILIIL(2131854966, new AcS187S0300000_15((C953550avB) aCListenerS24S0500000_15.l0, (InterfaceC953490av5) aCListenerS24S0500000_15.l3, (EnumC952890au7) aCListenerS24S0500000_15.l4, 7));
        c782110Um9.LJIIJ(2131854971, new InterfaceC743640TFa() { // from class: X.0av4
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        PopupWindow popupWindow = (PopupWindow) ((C259800zU) aCListenerS24S0500000_15.l2).element;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public static final void onClick$1(ACListenerS24S0500000_15 aCListenerS24S0500000_15, View view) {
        C936170aT9 c936170aT9 = (C936170aT9) aCListenerS24S0500000_15.l0;
        if (c936170aT9 != null && c936170aT9.LIZ()) {
            C936170aT9 c936170aT92 = (C936170aT9) aCListenerS24S0500000_15.l0;
            if (c936170aT92.LJIIIZ && c936170aT92.LIZ()) {
                c936170aT92.LJIIIZ = false;
                c936170aT92.LIZJ();
            }
            C16F5 c16f5 = (C16F5) aCListenerS24S0500000_15.l1;
            if (c16f5 != null) {
                C12ES.LJIILL(0, c16f5);
            }
            C20515815Po c20515815Po = (C20515815Po) aCListenerS24S0500000_15.l2;
            if (c20515815Po != null) {
                C12ES.LJIILL(0, c20515815Po);
            }
            C439101nJ.LJI((LiveIconView) aCListenerS24S0500000_15.l3);
            C16F5 c16f52 = (C16F5) aCListenerS24S0500000_15.l4;
            if (c16f52 != null) {
                C439101nJ.LJI(c16f52);
            }
        }
    }

    public static final void onClick$2(ACListenerS24S0500000_15 aCListenerS24S0500000_15, View view) {
        String str;
        IDebugService iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
        if (iDebugService != null) {
            iDebugService.aq();
        }
        DataChannel dataChannel = ((InterfaceC962270b9F) aCListenerS24S0500000_15.l0).getDataChannel();
        if (dataChannel != null) {
            dataChannel.FQ2(CoHostSearchCloseKeyBoard.class);
        }
        if (Intrinsics.LJFF(((C955590ayT) aCListenerS24S0500000_15.l1).LJI, C955540ayO.LIZJ)) {
            str = "mutual_follow";
        } else if (((C013C) aCListenerS24S0500000_15.l2).element) {
            str = "search_stranger";
        } else if (Intrinsics.LJFF(((C955590ayT) aCListenerS24S0500000_15.l1).LJI, C955540ayO.LJJIJIIJIL)) {
            str = "cohost_history";
        } else {
            str = "recommend";
        }
        C784440Upu.LIZ().LIZIZ(new DismissUserProfileEvent());
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        UserProfileEvent userProfileEvent = new UserProfileEvent((User) aCListenerS24S0500000_15.l3);
        C955590ayT c955590ayT = (C955590ayT) aCListenerS24S0500000_15.l1;
        userProfileEvent.coHostEnable = true;
        userProfileEvent.linkInRoomEnable = false;
        userProfileEvent.roomId = c955590ayT.LJ.getId();
        userProfileEvent.currentHasMultiCoHostPermission = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12();
        userProfileEvent.mSource = str;
        userProfileEvent.mClickUserPosition = "connection_list";
        C955400ayA c955400ayA = C955400ayA.LIZ;
        userProfileEvent.trackExtra = C2097608Jq.LJI(new Pair("invitee_list", C955400ayA.LJJLI(c955590ayT.LJI.LIZ, false)));
        userProfileEvent.extraParams = C2097608Jq.LJI(new Pair("invitee_list", C955400ayA.LJJLI(c955590ayT.LJI.LIZ, false)));
        userProfileEvent.clickModule = "link_invite_list";
        c784440UpuLIZ.LIZIZ(userProfileEvent);
        ((AbstractC962220b9A) aCListenerS24S0500000_15.l4).LIZLLL((C955590ayT) aCListenerS24S0500000_15.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS24S0500000_15(Object obj, C953550avB c953550avB, View view, C259800zU<PopupWindow> c259800zU, InterfaceC953490av5 interfaceC953490av5, EnumC952890au7 enumC952890au7) {
        this.$t = enumC952890au7;
        this.l0 = obj;
        this.l1 = c953550avB;
        this.l2 = view;
        this.l3 = c259800zU;
        this.l4 = interfaceC953490av5;
    }
}
