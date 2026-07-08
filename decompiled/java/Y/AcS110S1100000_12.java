package Y;

import X.C01C7;
import X.C0IJT;
import X.C0IQG;
import X.C0UFJ;
import X.C0UFN;
import X.C2097608Jq;
import X.C23250099c;
import X.C474500IjA;
import X.C475510Ikn;
import X.C771910UPt;
import X.C780930UkF;
import X.InterfaceC743640TFa;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.panel.LiveEnhanceDialogFragment;
import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesEditFragmentSheet;
import com.bytedance.android.livesdk.broadcast.RestartLiveEvent;
import com.bytedance.android.livesdk.game.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AcS110S1100000_12 implements InterfaceC743640TFa {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 5:
                LIZ$5(this, liveDialog);
                break;
            case 6:
                LIZ$6(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS110S1100000_12 acS110S1100000_12, LiveDialog liveDialog) {
        DataChannel dataChannelLJ = C475510Ikn.LJ((LiveMuteRulesEditFragmentSheet) acS110S1100000_12.l1);
        if (dataChannelLJ != null) {
            C01C7.LIZ(dataChannelLJ, "livesdk_comment_mute_rule_add_confirm_click", C2097608Jq.LJIIJ(new Pair("word", acS110S1100000_12.s0), new Pair("mute_duration", String.valueOf(((LiveMuteRulesEditFragmentSheet) acS110S1100000_12.l1).LLLIIII.LIZ))));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LiveMuteRulesEditFragmentSheet) acS110S1100000_12.l1), null, null, new C0IQG((LiveMuteRulesEditFragmentSheet) acS110S1100000_12.l1, liveDialog, null), 3);
    }

    public static final void LIZ$1(AcS110S1100000_12 acS110S1100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C771910UPt c771910UPt = C771910UPt.LIZ;
        String str = acS110S1100000_12.s0;
        c771910UPt.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_add_birth_popup_window_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "request_page");
        c474500IjALIZ.LJJII("cancel", "click_type");
        c474500IjALIZ.LIZ();
        Function0 function0 = (Function0) acS110S1100000_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$2(AcS110S1100000_12 acS110S1100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C0UFJ c0ufj = C0UFJ.LIZ;
        C0UFJ.LIZIZ(((C0UFN) acS110S1100000_12.l1).getDataChannel(), 0, acS110S1100000_12.s0);
    }

    public static final void LIZ$3(AcS110S1100000_12 acS110S1100000_12, LiveDialog liveDialog) {
        ((LiveEnhanceDialogFragment) acS110S1100000_12.l1).NR(acS110S1100000_12.s0, "click", "wait");
        liveDialog.dismiss();
    }

    public static final void LIZ$4(AcS110S1100000_12 acS110S1100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ScreenRecordStatusWidget screenRecordStatusWidget = (ScreenRecordStatusWidget) acS110S1100000_12.l1;
        String str = acS110S1100000_12.s0;
        screenRecordStatusWidget.getClass();
        ScreenRecordStatusWidget.x1(2, str);
    }

    public static final void LIZ$5(AcS110S1100000_12 acS110S1100000_12, LiveDialog liveDialog) {
        DataChannel dataChannel = ((C780930UkF) acS110S1100000_12.l1).LIZ;
        if (dataChannel != null) {
            dataChannel.FQ2(RestartLiveEvent.class);
        }
        liveDialog.dismiss();
        C780930UkF c780930UkF = (C780930UkF) acS110S1100000_12.l1;
        String str = acS110S1100000_12.s0;
        c780930UkF.getClass();
        C780930UkF.LIZIZ("restart", str);
    }

    public static final void LIZ$6(AcS110S1100000_12 acS110S1100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C780930UkF c780930UkF = (C780930UkF) acS110S1100000_12.l1;
        String str = acS110S1100000_12.s0;
        c780930UkF.getClass();
        C780930UkF.LIZIZ("cancel", str);
    }

    public AcS110S1100000_12(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
