package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.api.LinkMicAudienceCancelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatGoLiveFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0bn5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class DialogInterfaceOnClickListenerC986970bn5 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
            case 5:
                onClick$5(this, dialogInterface, i);
                break;
            case 6:
                onClick$6(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC986970bn5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC986970bn5 dialogInterfaceOnClickListenerC986970bn5, DialogInterface dialogInterface, int i) {
        AbstractC923750a97 abstractC923750a97;
        dialogInterface.dismiss();
        DataChannel dataChannel = ((MultiGuestUserInfoFragment) dialogInterfaceOnClickListenerC986970bn5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C753820Thc.class, Boolean.TRUE);
        }
        ((MultiGuestUserInfoFragment) dialogInterfaceOnClickListenerC986970bn5.l0).rS(0L, "click", false);
        WeakReference<AbstractC923750a97> weakReference = ((MultiGuestUserInfoFragment) dialogInterfaceOnClickListenerC986970bn5.l0).mGuestPresenter;
        if (weakReference != null && (abstractC923750a97 = weakReference.get()) != null) {
            abstractC923750a97.cancel("leave_source_user_click_cancel");
        }
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC986970bn5 dialogInterfaceOnClickListenerC986970bn5, DialogInterface dialogInterface, int i) {
        AbstractC923750a97 abstractC923750a97;
        C924630aAX.LJJIJ(1);
        dialogInterface.dismiss();
        MultiGuestUserInfoFragment multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) dialogInterfaceOnClickListenerC986970bn5.l0;
        multiGuestUserInfoFragment.closeWay = "disconnect_icon";
        WeakReference<AbstractC923750a97> weakReference = multiGuestUserInfoFragment.mGuestPresenter;
        if (weakReference != null && (abstractC923750a97 = weakReference.get()) != null) {
            abstractC923750a97.exitInteractInNormalWay("leave_normally", false, 10002);
        }
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC986970bn5 dialogInterfaceOnClickListenerC986970bn5, DialogInterface dialogInterface, int i) {
        AbstractC923750a97 abstractC923750a97;
        dialogInterface.dismiss();
        WeakReference<AbstractC923750a97> weakReference = ((BaseMultiGuestLinkMicMatchFragment) dialogInterfaceOnClickListenerC986970bn5.l0).guestPresenter;
        if (weakReference != null && (abstractC923750a97 = weakReference.get()) != null) {
            abstractC923750a97.cancel("leave_source_user_click_cancel");
        }
        BaseMultiGuestLinkMicMatchFragment.bS((BaseMultiGuestLinkMicMatchFragment) dialogInterfaceOnClickListenerC986970bn5.l0, "click");
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC986970bn5 dialogInterfaceOnClickListenerC986970bn5, DialogInterface dialogInterface, int i) {
        C923650a8x c923650a8x;
        dialogInterface.dismiss();
        WeakReference<C923650a8x> weakReference = ((VoiceChatUserInfoFragment) dialogInterfaceOnClickListenerC986970bn5.l0).LLJJI;
        if (weakReference != null && (c923650a8x = weakReference.get()) != null) {
            c923650a8x.cancel("leave_source_user_click_cancel");
        }
        VoiceChatUserInfoFragment.VR((VoiceChatUserInfoFragment) dialogInterfaceOnClickListenerC986970bn5.l0, "click");
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC986970bn5 dialogInterfaceOnClickListenerC986970bn5, DialogInterface dialogInterface, int i) {
        C923650a8x c923650a8x;
        C924630aAX.LJJIJ(1);
        dialogInterface.dismiss();
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = (VoiceChatUserInfoFragment) dialogInterfaceOnClickListenerC986970bn5.l0;
        voiceChatUserInfoFragment.LLJLILLLLZIIL = "disconnect_icon";
        WeakReference<C923650a8x> weakReference = voiceChatUserInfoFragment.LLJJI;
        if (weakReference != null && (c923650a8x = weakReference.get()) != null) {
            c923650a8x.exitInteractInNormalWay("leave_normally", false, 10002);
        }
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC986970bn5 dialogInterfaceOnClickListenerC986970bn5, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        DataChannel dataChannel = ((C928050aG3) dialogInterfaceOnClickListenerC986970bn5.l0).LLILZ;
        if (dataChannel != null) {
            dataChannel.SX0(C753820Thc.class, Boolean.TRUE);
        }
        DataChannel dataChannel2 = ((C928050aG3) dialogInterfaceOnClickListenerC986970bn5.l0).LLILZ;
        if (dataChannel2 != null) {
            dataChannel2.LC0(LinkMicAudienceCancelEvent.class, Boolean.TRUE);
        }
        ((C928050aG3) dialogInterfaceOnClickListenerC986970bn5.l0).LIZ(0L, "click", false);
    }

    public static final void onClick$6(DialogInterfaceOnClickListenerC986970bn5 dialogInterfaceOnClickListenerC986970bn5, DialogInterface dialogInterface, int i) {
        int i2;
        dialogInterface.dismiss();
        VoiceChatGoLiveFragment voiceChatGoLiveFragment = (VoiceChatGoLiveFragment) dialogInterfaceOnClickListenerC986970bn5.l0;
        voiceChatGoLiveFragment.LLIZLLLIL = false;
        C923650a8x c923650a8x = voiceChatGoLiveFragment.LLIZ;
        if (c923650a8x != null) {
            Integer num = voiceChatGoLiveFragment.LLILZLL;
            if (num != null && num.intValue() == 1) {
                i2 = 10043;
            } else {
                i2 = 10044;
            }
            c923650a8x.exitInteractInNormalWay("leave_source_user_click_cancel_in_preview", false, i2);
        }
        C924660aAa.LJI(Boolean.FALSE, "voice", "click", "end_now");
    }
}
