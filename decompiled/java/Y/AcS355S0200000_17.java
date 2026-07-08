package Y;

import X.C1086790eO5;
import X.C1086830eO9;
import X.C1087470ePB;
import X.C1119410fEh;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.rank.impl.sticker.dialog.RankStickerPreviewFragment;
import com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AcS355S0200000_17 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS355S0200000_17 acS355S0200000_17, LiveDialog liveDialog) {
        C1087470ePB.LIZIZ((DataChannel) acS355S0200000_17.l0, (RoomNotifyMessage) acS355S0200000_17.l1, "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS355S0200000_17 acS355S0200000_17, LiveDialog liveDialog) {
        ((Function0) acS355S0200000_17.l0).invoke();
        liveDialog.dismiss();
        C1086790eO5.LIZIZ(((AbsPollWidget) acS355S0200000_17.l1).dataChannel, C1086830eO9.LIZ, 1);
    }

    public static final void LIZ$2(AcS355S0200000_17 acS355S0200000_17, LiveDialog liveDialog) {
        ((RankStickerPreviewFragment) acS355S0200000_17.l0).NR().setChecked(false);
        RankStickerPreviewFragment rankStickerPreviewFragment = (RankStickerPreviewFragment) acS355S0200000_17.l0;
        C1119410fEh.LJFF(rankStickerPreviewFragment.LL, (RankTypeV2) acS355S0200000_17.l1, rankStickerPreviewFragment.LLILLJJLI, "cancel", "switch_auto_set");
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS355S0200000_17 acS355S0200000_17, LiveDialog liveDialog) {
        RoomNotifyMessage roomNotifyMessage;
        ((Function0) acS355S0200000_17.l0).invoke();
        LivePrivilegeAnnouncementWidget livePrivilegeAnnouncementWidget = (LivePrivilegeAnnouncementWidget) acS355S0200000_17.l1;
        DataChannel dataChannel = livePrivilegeAnnouncementWidget.dataChannel;
        PrivilegeAdvanceMessage privilegeAdvanceMessage = livePrivilegeAnnouncementWidget.LLILLJJLI;
        if (privilegeAdvanceMessage != null) {
            roomNotifyMessage = privilegeAdvanceMessage.notify;
        } else {
            roomNotifyMessage = null;
        }
        C1087470ePB.LIZIZ(dataChannel, roomNotifyMessage, "yes");
        liveDialog.dismiss();
    }

    public AcS355S0200000_17(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
