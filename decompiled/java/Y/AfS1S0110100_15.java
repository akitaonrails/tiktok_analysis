package Y;

import X.C01EX;
import X.C09JN;
import X.C0UVC;
import X.C1C7U;
import X.C470590Icr;
import X.C501540Jlg;
import X.C921440a5O;
import X.C963140bAe;
import X.C974540bT2;
import X.C974930bTf;
import X.C975250bUB;
import X.C976120bVa;
import X.C976770bWd;
import X.InterfaceC919320a1y;
import android.content.Context;
import com.bytedance.android.live.liveinteract.api.OnlyPushRtcEngineAlreadyCloseChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.api.battle.BattleAcceptResponse;

/* JADX INFO: loaded from: classes16.dex */
public class AfS1S0110100_15 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

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
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS1S0110100_15 afS1S0110100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviteeViewModel@e3fd.requestAcceptApi$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C974540bT2.LJLLLL(afS1S0110100_15.z1, afS1S0110100_15.j2, c470590Icr, false, null, 0L, 56);
        ((C975250bUB) afS1S0110100_15.l0).LJIJ.setValue(C974930bTf.LIZ(new C974930bTf(null, null, null, null), (BattleAcceptResponse.ResponseData) c470590Icr.data, null, null, null, 14));
        C1C7U.LIZIZ("TeamMatchInviteeViewModel@e3fd.requestAcceptApi$1");
    }

    public static final void accept$1(AfS1S0110100_15 afS1S0110100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviteeViewModel@e3fd.requestAcceptApi$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJLLJ(afS1S0110100_15.z1, afS1S0110100_15.j2, th);
        C0UVC.LIZIZ(th);
        ((C975250bUB) afS1S0110100_15.l0).LJIJ.setValue(C974930bTf.LIZ(new C974930bTf(null, null, null, null), null, th, null, null, 13));
        C1C7U.LIZIZ("TeamMatchInviteeViewModel@e3fd.requestAcceptApi$2");
    }

    public static final void accept$2(AfS1S0110100_15 afS1S0110100_15, Object obj) {
        Context context;
        DataChannel dataChannel;
        C1C7U.LIZ("VoiceChatAnchorPresenter@f74d.requestUpdateSetting$2");
        Throwable th = (Throwable) obj;
        C01EX.LIZIZ(th, "update_setting", "change_layout", C963140bAe.LIZIZ() - afS1S0110100_15.j2);
        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) ((C921440a5O) afS1S0110100_15.l0).mView;
        if (interfaceC919320a1y != null) {
            context = interfaceC919320a1y.getContext();
        } else {
            context = null;
        }
        C501540Jlg.LIZLLL(context, th, 2131851936);
        if (afS1S0110100_15.z1 && (dataChannel = ((C921440a5O) afS1S0110100_15.l0).dataChannel) != null) {
            dataChannel.zW(OnlyPushRtcEngineAlreadyCloseChannel.class, "voice_chat_update_setting_failed");
        }
        C1C7U.LIZIZ("VoiceChatAnchorPresenter@f74d.requestUpdateSetting$2");
    }

    public static final void accept$3(AfS1S0110100_15 afS1S0110100_15, Object obj) {
        C1C7U.LIZ("TwoMatchInviteeViewModel@472.requestAcceptApi$dispose$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJLLJ(afS1S0110100_15.z1, afS1S0110100_15.j2, th);
        C0UVC.LIZIZ(th);
        ((C976120bVa) afS1S0110100_15.l0).LJIJ.setValue(C976770bWd.LIZ(new C976770bWd(null, null, null, null), null, th, null, null, 13));
        C1C7U.LIZIZ("TwoMatchInviteeViewModel@472.requestAcceptApi$dispose$2");
    }

    public AfS1S0110100_15(long j, Object obj, boolean z, int i) {
        this.$t = i;
        this.j2 = j;
        this.l0 = obj;
        this.z1 = z;
    }
}
