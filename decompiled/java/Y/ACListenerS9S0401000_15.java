package Y;

import X.AbstractC1143290frD;
import X.C0UTD;
import X.C1143300frE;
import X.C1161920gLG;
import X.C259800zU;
import X.C500260Jjc;
import X.C946850akN;
import X.C953550avB;
import X.C956720b0I;
import X.EnumC952890au7;
import X.EnumC971520bOA;
import X.InterfaceC928000aFy;
import X.InterfaceC953490av5;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLinkButtonSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS139S0201000_15;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS9S0401000_15 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS9S0401000_15 aCListenerS9S0401000_15, View view) {
        EnumC971520bOA enumC971520bOA;
        InterfaceC953490av5 interfaceC953490av5 = (InterfaceC953490av5) aCListenerS9S0401000_15.l0;
        if (interfaceC953490av5 != null) {
            NoticeboardTemplate noticeboardTemplate = ((C953550avB) aCListenerS9S0401000_15.l1).LIZ;
            String str = noticeboardTemplate.mediaNodeId;
            interfaceC953490av5.LIZLLL(aCListenerS9S0401000_15.i4, noticeboardTemplate.noticeboardTemplateId, str);
        }
        if (aCListenerS9S0401000_15.i4 == 1) {
            enumC971520bOA = EnumC971520bOA.SET_AS_PUBLIC;
        } else {
            enumC971520bOA = EnumC971520bOA.SET_AS_PRIVATE;
        }
        Long lValueOf = Long.valueOf(((C953550avB) aCListenerS9S0401000_15.l1).LIZ.noticeboardTemplateId);
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = (EnumC952890au7) aCListenerS9S0401000_15.l2;
        multiCanvasUtils.getClass();
        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "personal", MultiCanvasUtils.LJIIJJI(enumC952890au7), "in_spots");
        PopupWindow popupWindow = (PopupWindow) ((C259800zU) aCListenerS9S0401000_15.l3).element;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public static final void onClick$1(ACListenerS9S0401000_15 aCListenerS9S0401000_15, View view) {
        DataChannel dataChannel;
        if (((MultiGuestV3GuestBeInvitedDialog) aCListenerS9S0401000_15.l0).isGameLink && !LiveGameLinkButtonSetting.INSTANCE.isExperimentGroup() && (dataChannel = ((MultiGuestV3GuestBeInvitedDialog) aCListenerS9S0401000_15.l0).dataChannel) != null) {
            dataChannel.SX0(C956720b0I.class, null);
        }
        if (((InterfaceC928000aFy) aCListenerS9S0401000_15.l1).LIZ((C0UTD) aCListenerS9S0401000_15.l2, false)) {
            return;
        }
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("invite_issue_check", "replyAnchorWithAgree");
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = (MultiGuestV3GuestBeInvitedDialog) aCListenerS9S0401000_15.l0;
        if (multiGuestV3GuestBeInvitedDialog.showInOuterPage) {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null) {
                iHostAction.jumpLivePlayActivityClearTop(((MultiGuestV3GuestBeInvitedDialog) aCListenerS9S0401000_15.l0).getContext());
            }
            C500260Jjc.LJJLIIIJILLIZJL(new AwS139S0201000_15((MultiGuestV3GuestBeInvitedDialog) aCListenerS9S0401000_15.l0, (MultiGuestV3GuestBeInvitedDialog) aCListenerS9S0401000_15.i4, (int) aCListenerS9S0401000_15.l3, (Function0<Unit>) 5));
            return;
        }
        multiGuestV3GuestBeInvitedDialog.SR(aCListenerS9S0401000_15.i4);
        Function0 function0 = (Function0) aCListenerS9S0401000_15.l3;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS9S0401000_15(Object obj, InterfaceC953490av5 interfaceC953490av5, C953550avB c953550avB, int i, EnumC952890au7 enumC952890au7, C259800zU<PopupWindow> c259800zU) {
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = interfaceC953490av5;
        this.i4 = c953550avB;
        this.l2 = i;
        this.l3 = enumC952890au7;
    }
}
