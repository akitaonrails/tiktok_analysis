package Y;

import X.C013C;
import X.C0J1R;
import X.C0UO0;
import X.C1087470ePB;
import X.C1116230f9Z;
import X.C1116360f9m;
import X.C1119210fEN;
import X.C1119410fEh;
import X.C1151150g3t;
import X.C1161920gLG;
import X.C1802410x0J;
import X.InterfaceC1106030et7;
import X.InterfaceC743640TFa;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.rank.impl.sticker.dialog.RankStickerPreviewFragment;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.RankStickerAutoSwitchChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AcS188S0300000_17 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 4:
                LIZ$4(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS188S0300000_17 acS188S0300000_17, LiveDialog liveDialog) {
        ((Function0) acS188S0300000_17.l0).invoke();
        C1087470ePB.LIZIZ((DataChannel) acS188S0300000_17.l1, (RoomNotifyMessage) acS188S0300000_17.l2, "yes");
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS188S0300000_17 acS188S0300000_17, LiveDialog liveDialog) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) acS188S0300000_17.l0, (Uri) acS188S0300000_17.l1);
        C1151150g3t c1151150g3t = C1151150g3t.LIZ;
        C1802410x0J c1802410x0J = (C1802410x0J) acS188S0300000_17.l2;
        c1151150g3t.getClass();
        C1151150g3t.LIZ("contact_us", c1802410x0J);
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS188S0300000_17 acS188S0300000_17, LiveDialog liveDialog) {
        C1119410fEh.LJFF((DataChannel) acS188S0300000_17.l0, (RankTypeV2) acS188S0300000_17.l1, (RankTypeV2) acS188S0300000_17.l2, "cancel", "switch_show");
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS188S0300000_17 acS188S0300000_17, LiveDialog liveDialog) {
        C1119210fEN c1119210fEN = C1119210fEN.LIZ;
        boolean z = ((C013C) acS188S0300000_17.l0).element;
        c1119210fEN.getClass();
        InterfaceC1106030et7.C9.LJFF(Boolean.valueOf(z));
        C1119210fEN.LJI(((RankStickerPreviewFragment) acS188S0300000_17.l1).LLILLJJLI, true);
        RankStickerPreviewFragment rankStickerPreviewFragment = (RankStickerPreviewFragment) acS188S0300000_17.l1;
        DataChannel dataChannel = rankStickerPreviewFragment.LL;
        if (dataChannel != null) {
            dataChannel.LC0(RankStickerAutoSwitchChangeEvent.class, rankStickerPreviewFragment.LLILLJJLI);
        }
        RankStickerPreviewFragment rankStickerPreviewFragment2 = (RankStickerPreviewFragment) acS188S0300000_17.l1;
        C1119410fEh.LJFF(rankStickerPreviewFragment2.LL, (RankTypeV2) acS188S0300000_17.l2, rankStickerPreviewFragment2.LLILLJJLI, "switch", "switch_auto_set");
        liveDialog.dismiss();
    }

    public static final void LIZ$4(AcS188S0300000_17 acS188S0300000_17, LiveDialog liveDialog) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1116230f9Z c1116230f9Z = (C1116230f9Z) acS188S0300000_17.l0;
        StarCommentViewModel starCommentViewModel = c1116230f9Z.LLILLL;
        if (starCommentViewModel != null) {
            starCommentViewModel.LLIZLLLIL = ((C1116360f9m) acS188S0300000_17.l1).LIZ.LL;
        }
        Room roomLJI = c1116230f9Z.LJI();
        if (roomLJI != null) {
            C1116230f9Z c1116230f9Z2 = (C1116230f9Z) acS188S0300000_17.l0;
            C1116360f9m c1116360f9m = (C1116360f9m) acS188S0300000_17.l1;
            c1116230f9Z2.LJFF(c1116360f9m, roomLJI, ((C013C) acS188S0300000_17.l2).element).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(c1116230f9Z2.LL)).LJJLL(new AfS5S0200100_17(jElapsedRealtime, c1116230f9Z2, c1116360f9m, 6), new AfS5S0200100_17(jElapsedRealtime, c1116230f9Z2, c1116360f9m, 7));
        }
        liveDialog.dismiss();
    }

    public AcS188S0300000_17(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
