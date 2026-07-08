package Y;

import X.C0IJT;
import X.C1161920gLG;
import X.C2097608Jq;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C766270U4b;
import X.DialogC1393760mNC;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService;
import com.bytedance.android.livesdk.game.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.router.SmartRouter;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS55S1200000_12 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void onClick$0(ACListenerS55S1200000_12 aCListenerS55S1200000_12, View view) {
        Long lValueOf;
        RoomAuthStatus roomAuthStatus;
        ((ScreenRecordStatusWidget) aCListenerS55S1200000_12.l1).LLILZIL.invoke();
        Room room = ((ScreenRecordStatusWidget) aCListenerS55S1200000_12.l1).LL;
        if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.chatSubOnly) {
            Context context = ((TextView) aCListenerS55S1200000_12.l2).getContext();
            Object[] objArr = {aCListenerS55S1200000_12.s0};
            if (context != null || (context = C497740JfY.LJII()) != null) {
                C766270U4b.LJIIIZ(context, context.getString(2131843094, objArr));
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_switch_game_notice");
        c474500IjALIZ.LJJ("screen_share");
        c474500IjALIZ.LJII(((ScreenRecordStatusWidget) aCListenerS55S1200000_12.l1).LLILLJJLI);
        Room room2 = ((ScreenRecordStatusWidget) aCListenerS55S1200000_12.l1).LL;
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJIJIIJI(lValueOf);
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$1(ACListenerS55S1200000_12 aCListenerS55S1200000_12, View view) {
        if (((RoomCreateInfo) aCListenerS55S1200000_12.l1).LIZIZ()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_donation_click");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ((BasePreviewSettingMainFragment) aCListenerS55S1200000_12.l2));
            c474500IjALIZ.LJIILJJIL("live_take_page");
            c474500IjALIZ.LJJII(aCListenerS55S1200000_12.s0, "powered_by");
            c474500IjALIZ.LIZ();
            ((IDonationStickerOuterService) C1161920gLG.LIZJ(IDonationStickerOuterService.class)).Mo2(((BasePreviewSettingMainFragment) aCListenerS55S1200000_12.l2).getContext(), 0, C2097608Jq.LJIIIIZZ(new Pair("variable_height", "60%"), new Pair("height", "60%"), new Pair("enable_simplified_live_donation", "1")));
            DataChannel dataChannelLJ = C475510Ikn.LJ((BasePreviewSettingMainFragment) aCListenerS55S1200000_12.l2);
            if (dataChannelLJ != null) {
                dataChannelLJ.FQ2(DismissPreviewSettingDialogEvent.class);
            }
        }
    }

    public static final void onClick$2(ACListenerS55S1200000_12 aCListenerS55S1200000_12, View view) {
        Function0 function0 = (Function0) aCListenerS55S1200000_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
        SmartRouter.buildRoute(((DialogC1393760mNC) aCListenerS55S1200000_12.l2).getContext(), aCListenerS55S1200000_12.s0).open();
    }

    public ACListenerS55S1200000_12(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
