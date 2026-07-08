package Y;

import X.C09JN;
import X.C1095920eco;
import X.C1161920gLG;
import X.C1C7U;
import X.C259800zU;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData;

/* JADX INFO: loaded from: classes13.dex */
public class AfS1S1200100_12 implements C09JN {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S1200100_12 afS1S1200100_12, Object obj) {
        C1C7U.LIZ("FansClubAnchorEntranceController@473.entranceClickOperation$1$2");
        if (!TextUtils.isEmpty(afS1S1200100_12.s0)) {
            Context context = ((ViewGroup) afS1S1200100_12.l1).getContext();
            if (context != null) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, afS1S1200100_12.s0);
            }
        } else if (afS1S1200100_12.j3 == 0) {
            ((C1095920eco) afS1S1200100_12.l2).LJIJ((ViewGroup) afS1S1200100_12.l1);
        } else {
            C1095920eco.LJIIZILJ((ViewGroup) afS1S1200100_12.l1);
        }
        C1C7U.LIZIZ("FansClubAnchorEntranceController@473.entranceClickOperation$1$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS1S1200100_12 afS1S1200100_12, Object obj) {
        C1C7U.LIZ("LiveBroadcastFragment@d956.showAdvancedDialog$2");
        ((LiveBroadcastFragment) afS1S1200100_12.l1).ZS((String) ((C259800zU) afS1S1200100_12.l2).element, afS1S1200100_12.s0, afS1S1200100_12.j3, (AnchorPreFinishData) ((BaseResponse) obj).data);
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.showAdvancedDialog$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS1S1200100_12 afS1S1200100_12, Object obj) {
        C1C7U.LIZ("LiveBroadcastFragment@d956.showAdvancedDialog$4");
        ((LiveBroadcastFragment) afS1S1200100_12.l1).ZS((String) ((C259800zU) afS1S1200100_12.l2).element, afS1S1200100_12.s0, afS1S1200100_12.j3, (AnchorPreFinishData) ((BaseResponse) obj).data);
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.showAdvancedDialog$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r1 I:Y.AfS1S1200100_12) (LINE:83886080) Y.AfS1S1200100_12.$t int, block:B:2:0x0000 */
    public AfS1S1200100_12(Object obj, LiveBroadcastFragment liveBroadcastFragment, C259800zU<String> c259800zU, String str, long j) {
        int i;
        this.$t = i;
        this.l1 = obj;
        this.l2 = liveBroadcastFragment;
        this.s0 = c259800zU;
        this.j3 = str;
    }
}
