package Y;

import X.C01C3;
import X.C01C5;
import X.C0IJT;
import X.C0JGR;
import X.C0KWU;
import X.C0KX8;
import X.C0UX6;
import X.C1161920gLG;
import X.C19EG;
import X.C354201Zc;
import X.C474500IjA;
import X.C500260Jjc;
import X.C766270U4b;
import android.view.View;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationDialog;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.interaction.pollandgiftvote.PollAndGiftVoteDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS40S0210000_7 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS40S0210000_7 aCListenerS40S0210000_7, View view) {
        LiveMode liveMode;
        DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) aCListenerS40S0210000_7.l0).LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.FQ2(DismissPreviewSettingDialogEvent.class);
        }
        C19EG c19egLJ = C500260Jjc.LJ(((BasePreviewSettingMainFragmentSheetInitializer) aCListenerS40S0210000_7.l0).LL.getContext());
        if (c19egLJ != null) {
            boolean z = aCListenerS40S0210000_7.z2;
            BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) aCListenerS40S0210000_7.l0;
            if (z) {
                IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
                if (iRoomFunctionService != null) {
                    iRoomFunctionService.TU(c19egLJ, basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI, "setting");
                }
            } else {
                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Sc2("setting", c19egLJ, basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI, false, "");
            }
        }
        C0JGR.z2.LJFF(Boolean.FALSE);
        C500260Jjc.LJIILIIL((View) aCListenerS40S0210000_7.l1);
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer2 = (BasePreviewSettingMainFragmentSheetInitializer) aCListenerS40S0210000_7.l0;
        basePreviewSettingMainFragmentSheetInitializer2.getClass();
        DataChannel dataChannel2 = basePreviewSettingMainFragmentSheetInitializer2.LLILLJJLI;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) != null) {
            C01C3.LIZJ(((BasePreviewSettingMainFragmentSheetInitializer) aCListenerS40S0210000_7.l0).LLILLJJLI, "setting", false, false, false, true, C354201Zc.LIZ(liveMode), 0);
        }
    }

    public static final void onClick$1(ACListenerS40S0210000_7 aCListenerS40S0210000_7, View view) {
        if (aCListenerS40S0210000_7.z2) {
            ((Function0) aCListenerS40S0210000_7.l0).invoke();
        } else {
            ((LiveStickerDonationDialog) aCListenerS40S0210000_7.l1).dismissAllowingStateLoss();
        }
    }

    public static final void onClick$2(ACListenerS40S0210000_7 aCListenerS40S0210000_7, View view) {
        DataChannel dataChannel = ((PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0).dataChannel;
        if (dataChannel != null && C01C5.LIZ(dataChannel)) {
            C0KWU.LJ(((PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0).dataChannel, "click", "quick_gift_vote");
        }
        PollAndGiftVoteDialog pollAndGiftVoteDialog = (PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0;
        C0KWU.LJFF(pollAndGiftVoteDialog.dataChannel, pollAndGiftVoteDialog.LLJJIII, "gift_poll", aCListenerS40S0210000_7.z2);
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        PollAndGiftVoteDialog pollAndGiftVoteDialog2 = (PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0;
        iBroadcastService.disableFunctionAccordingLevel(pollAndGiftVoteDialog2.dataChannel, AFwS237S0000000_7.get$arr$(295), new AwS373S0200000_7((View) aCListenerS40S0210000_7.l1, pollAndGiftVoteDialog2, 70), AFwS237S0000000_7.get$arr$(296), ((PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0).getString(2131843888), Boolean.TRUE);
    }

    public static final void onClick$3(ACListenerS40S0210000_7 aCListenerS40S0210000_7, View view) {
        C0KX8 c0kx8;
        DataChannel dataChannel = ((PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0).dataChannel;
        if (dataChannel != null && C01C5.LIZ(dataChannel)) {
            C0KWU.LJ(((PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0).dataChannel, "click", "text_gift_vote");
        }
        DataChannel dataChannel2 = ((PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0).dataChannel;
        boolean z = aCListenerS40S0210000_7.z2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_custom_gift_poll_entrance_click");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        C0KWU.LIZ(c474500IjALIZ, dataChannel2);
        c474500IjALIZ.LJJII("select_vote_panel", "request_page");
        C0UX6 c0ux6 = C0UX6.RED_DOT_LIVE_BROADCAST_CUSTOM_GIFT_VOTE;
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(RedDotExtensionKt.LJIILLIIL(c0ux6))) ? 1 : 0), "have_red_dot");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_grey");
        c474500IjALIZ.LIZ();
        PollAndGiftVoteDialog pollAndGiftVoteDialog = (PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0;
        int i = pollAndGiftVoteDialog.LLJJI;
        if (i != -1 && i != 3) {
            C766270U4b.LIZLLL(2131852589);
            return;
        }
        DataChannel dataChannel3 = pollAndGiftVoteDialog.dataChannel;
        if (dataChannel3 != null && (c0kx8 = (C0KX8) dataChannel3.gg0(LiveBanCapabilityChannel.class)) != null && c0kx8.LIZLLL) {
            C766270U4b.LIZLLL(2131844184);
            return;
        }
        RedDotExtensionKt.LIZ(c0ux6);
        RedDotExtensionKt.LJIILJJIL(c0ux6, ((View) aCListenerS40S0210000_7.l1).findViewById(R.id.t16), false);
        ((PollAndGiftVoteDialog) aCListenerS40S0210000_7.l0).MR();
    }

    public ACListenerS40S0210000_7(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
