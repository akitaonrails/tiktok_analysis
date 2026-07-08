package Y;

import X.C0IJT;
import X.C0UYG;
import X.C0UZP;
import X.C1161920gLG;
import X.C354201Zc;
import X.C474500IjA;
import X.C516680KOc;
import X.C781270Ukn;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class AcS21S0310000_12 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
        }
    }

    public static final void LIZ$0(AcS21S0310000_12 acS21S0310000_12, LiveDialog liveDialog) {
        String strLIZ;
        C0UYG c0uyg = (C0UYG) acS21S0310000_12.l0;
        c0uyg.LJII = false;
        c0uyg.LJ.rA().LJII(((C0UYG) acS21S0310000_12.l0).LIZJ);
        ((C0UYG) acS21S0310000_12.l0).LJ.rA().LJIIIZ();
        ((C0UYG) acS21S0310000_12.l0).LIZJ(CertProviderManagerKt.findCert("bpea-581", 1476788483));
        liveDialog.dismiss();
        Integer num = (Integer) acS21S0310000_12.l1;
        if (num != null && num.intValue() == 4) {
            C781270Ukn.LJIJJLI().Tn1(1);
        }
        if (acS21S0310000_12.z3) {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().getClass();
            C516680KOc.LIZ(true);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_close_live_dialog_click");
        c474500IjALIZ.LJIJJLI(((C0UYG) acS21S0310000_12.l0).LIZJ);
        LiveMode streamType = ((C0UYG) acS21S0310000_12.l0).LIZ.getStreamType();
        if (streamType != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJ(strLIZ);
        c474500IjALIZ.LJJII("end_live", "click_type");
        c474500IjALIZ.LJJII((Integer) acS21S0310000_12.l1, "popup_type");
        c474500IjALIZ.LJJIIZI((Map) acS21S0310000_12.l2);
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ$1(AcS21S0310000_12 acS21S0310000_12, LiveDialog liveDialog) {
        Map<String, String> map;
        AnchorPreFinishData.ConfirmBox confirmBox;
        VoiceChatBroadcastFragment voiceChatBroadcastFragment = (VoiceChatBroadcastFragment) acS21S0310000_12.l0;
        C0UZP.LIZ();
        voiceChatBroadcastFragment.zS();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LLJ();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LLJLL();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LJJZZI(((VoiceChatBroadcastFragment) acS21S0310000_12.l0).RR());
        liveDialog.dismiss();
        Integer num = (Integer) acS21S0310000_12.l1;
        if (num != null && num.intValue() == 4) {
            C781270Ukn.LJIJJLI().Tn1(1);
        }
        if (acS21S0310000_12.z3) {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().getClass();
            C516680KOc.LIZ(true);
        }
        Integer num2 = (Integer) acS21S0310000_12.l1;
        if (num2 != null && num2.intValue() == 17) {
            VoiceChatBroadcastFragment voiceChatBroadcastFragment2 = (VoiceChatBroadcastFragment) acS21S0310000_12.l0;
            int iIntValue = ((Integer) acS21S0310000_12.l1).intValue();
            AnchorPreFinishData anchorPreFinishData = (AnchorPreFinishData) acS21S0310000_12.l2;
            String str = null;
            if (anchorPreFinishData != null && (confirmBox = anchorPreFinishData.confirmBox) != null) {
                str = confirmBox.uniqueId;
            } else {
                if (anchorPreFinishData == null) {
                    map = null;
                }
                VoiceChatBroadcastFragment.GS(voiceChatBroadcastFragment2, "click", iIntValue, "end_live", str, map);
            }
            map = anchorPreFinishData.metricsMap;
            VoiceChatBroadcastFragment.GS(voiceChatBroadcastFragment2, "click", iIntValue, "end_live", str, map);
        }
    }

    public static final void LIZ$2(AcS21S0310000_12 acS21S0310000_12, LiveDialog liveDialog) {
        int iIntValue;
        Map<String, String> map;
        AnchorPreFinishData.ConfirmBox confirmBox;
        VoiceChatBroadcastFragment voiceChatBroadcastFragment = (VoiceChatBroadcastFragment) acS21S0310000_12.l0;
        boolean z = acS21S0310000_12.z3;
        Integer num = (Integer) acS21S0310000_12.l1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        voiceChatBroadcastFragment.yS(iIntValue, z);
        liveDialog.dismiss();
        Integer num2 = (Integer) acS21S0310000_12.l1;
        if (num2 != null && num2.intValue() == 4) {
            C781270Ukn.LJIJJLI().Tn1(0);
        }
        Integer num3 = (Integer) acS21S0310000_12.l1;
        if (num3 != null && num3.intValue() == 17) {
            VoiceChatBroadcastFragment voiceChatBroadcastFragment2 = (VoiceChatBroadcastFragment) acS21S0310000_12.l0;
            int iIntValue2 = ((Integer) acS21S0310000_12.l1).intValue();
            AnchorPreFinishData anchorPreFinishData = (AnchorPreFinishData) acS21S0310000_12.l2;
            String str = null;
            if (anchorPreFinishData != null && (confirmBox = anchorPreFinishData.confirmBox) != null) {
                str = confirmBox.uniqueId;
            } else {
                if (anchorPreFinishData == null) {
                    map = null;
                }
                VoiceChatBroadcastFragment.GS(voiceChatBroadcastFragment2, "click", iIntValue2, "cancel", str, map);
            }
            map = anchorPreFinishData.metricsMap;
            VoiceChatBroadcastFragment.GS(voiceChatBroadcastFragment2, "click", iIntValue2, "cancel", str, map);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AcS21S0310000_12(com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment r2, com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData r3, java.lang.Integer r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r2
            r0.z3 = r5
            r0.l1 = r4
            r0.l2 = r3
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.z3 = r5
            r0.l2 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AcS21S0310000_12.<init>(com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment, com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData, java.lang.Integer, boolean, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcS21S0310000_12(C0UYG c0uyg, C0UYG c0uyg2, Integer num, boolean z, Map<String, String> map) {
        this.$t = map;
        this.l0 = c0uyg;
        this.l1 = c0uyg2;
        this.z3 = num;
        this.l2 = z;
    }
}
