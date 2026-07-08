package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.competition.game.panel.CatchBeansManagementPanelFragment;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.playing.TakeStagePlayingManageFragment;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.punish.TakeStagePunishManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.model.ShowMultiGuestAnchorListChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class DialogInterfaceOnCancelListenerC986960bn4 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
            case 4:
                onCancel$4(this, dialogInterface);
                break;
            case 5:
                onCancel$5(this, dialogInterface);
                break;
            case 6:
                onCancel$6(this, dialogInterface);
                break;
            case 7:
                onCancel$7(this, dialogInterface);
                break;
            case 8:
                onCancel$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onCancel$9(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onCancel$10(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC986960bn4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((TakeStagePlayingManageFragment) dialogInterfaceOnCancelListenerC986960bn4.l0).LLILZ.invoke(EnumC983140bgu.STAY, 0L);
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((TakeStagePlayingManageFragment) dialogInterfaceOnCancelListenerC986960bn4.l0).LLILZ.invoke(EnumC983140bgu.STAY, 0L);
    }

    public static final void onCancel$10(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((CatchBeansManagementPanelFragment) dialogInterfaceOnCancelListenerC986960bn4.l0).LLILZIL.invoke(EnumC983140bgu.STAY, 0L);
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((TakeStagePlayingManageFragment) dialogInterfaceOnCancelListenerC986960bn4.l0).LLILZ.invoke(EnumC983140bgu.STAY, 0L);
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((TakeStagePlayingManageFragment) dialogInterfaceOnCancelListenerC986960bn4.l0).LLILZ.invoke(EnumC983140bgu.STAY, 0L);
    }

    public static final void onCancel$4(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((TakeStagePunishManageFragment) dialogInterfaceOnCancelListenerC986960bn4.l0).LLILZIL.invoke(EnumC983140bgu.STAY, 0L);
    }

    public static final void onCancel$5(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC986960bn4.l0).invoke();
    }

    public static final void onCancel$6(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        C946060aj6 c946060aj6;
        C946050aj5 c946050aj5LIZIZ;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) dialogInterfaceOnCancelListenerC986960bn4.l0;
        multiLiveAsAnchorListDialogV2.getClass();
        C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", "dialog onCancel");
        DataChannel dataChannel = multiLiveAsAnchorListDialogV2.LLJI;
        if (dataChannel != null && (c946060aj6 = (C946060aj6) dataChannel.gg0(ShowMultiGuestAnchorListChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZIZ(2);
        }
    }

    public static final void onCancel$7(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((Function1) dialogInterfaceOnCancelListenerC986960bn4.l0).invoke(0);
    }

    public static final void onCancel$8(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((Function1) dialogInterfaceOnCancelListenerC986960bn4.l0).invoke(0);
        C973660bRc.LIZ.LJLJI(0, false, false, null);
    }

    public static final void onCancel$9(DialogInterfaceOnCancelListenerC986960bn4 dialogInterfaceOnCancelListenerC986960bn4, DialogInterface dialogInterface) {
        ((Function1) dialogInterfaceOnCancelListenerC986960bn4.l0).invoke(0);
        C973660bRc.LIZ.LJLJI(0, false, false, null);
    }
}
