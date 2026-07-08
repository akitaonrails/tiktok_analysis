package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.api.game.GameDualDeviceDebugPicture;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0UsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewOnLongClickListenerC786000UsQ implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC786000UsQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC786000UsQ viewOnLongClickListenerC786000UsQ, View view) {
        C766270U4b.LJIIJJI("get a dual device picture!!");
        DataChannel dataChannel = ((C0TFB) viewOnLongClickListenerC786000UsQ.l0).LLILLL;
        if (dataChannel != null) {
            dataChannel.LC0(GameDualDeviceDebugPicture.class, Boolean.TRUE);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC786000UsQ viewOnLongClickListenerC786000UsQ, View view) {
        C766270U4b.LJIIJJI("get a dual device picture!!");
        DataChannel dataChannel = ((C0TFB) viewOnLongClickListenerC786000UsQ.l0).LLILLL;
        if (dataChannel != null) {
            dataChannel.LC0(GameDualDeviceDebugPicture.class, Boolean.TRUE);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC786000UsQ viewOnLongClickListenerC786000UsQ, View view) {
        String string;
        C0U22 c0u22 = ((C0U2M) viewOnLongClickListenerC786000UsQ.l0).LLILLJJLI;
        if (c0u22 == null || (string = c0u22.toString()) == null) {
            string = "";
        }
        C785230UrB c785230UrB = new C785230UrB(view);
        c785230UrB.LJIJJ = string;
        C1119700fFA.LIZIZ(new C785270UrF(c785230UrB));
        return true;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC786000UsQ viewOnLongClickListenerC786000UsQ, View view) {
        String json = GsonProtectorUtils.toJson(C293501Bt.LIZ(), ((C03A9) viewOnLongClickListenerC786000UsQ.l0).LLILLJJLI);
        C785230UrB c785230UrB = new C785230UrB(view);
        c785230UrB.LJIJJ = json;
        C1119700fFA.LIZIZ(new C785270UrF(c785230UrB));
        return true;
    }
}
