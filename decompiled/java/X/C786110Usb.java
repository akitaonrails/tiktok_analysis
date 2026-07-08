package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterGuideOpt;
import com.bytedance.android.livesdk.model.message.AILiveSummaryMessage;
import com.bytedance.android.livesdk.model.message.InteractiveEffectMessage;
import com.bytedance.android.livesdk.model.message.RealTimePerformancePageMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.AILiveSummary;

/* JADX INFO: renamed from: X.0Usb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786110Usb implements OnMessageListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        switch (this.$t) {
            case 0:
                onMessage$0(this, iMessage);
                break;
            case 1:
                onMessage$1(this, iMessage);
                break;
            case 2:
                onMessage$2(this, iMessage);
                break;
            case 3:
                onMessage$3(this, iMessage);
                break;
        }
    }

    public C786110Usb(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onMessage$0(C786110Usb c786110Usb, IMessage iMessage) {
        int iLIZ;
        if (iMessage instanceof InteractiveEffectMessage) {
            InteractiveEffectMessage interactiveEffectMessage = (InteractiveEffectMessage) iMessage;
            try {
                n nVar = new n();
                nVar.LJJIIJ("interface", "onMessage");
                nVar.LJJIIJ("request_url", "interactiveEffects_data");
                nVar.LJJIII(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                nVar.LJJIIJ("body", interactiveEffectMessage.triggerData);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("passIM:");
                sbLIZ.append(nVar);
                C20441214yg.LIZIZ("InteractiveE#sendIM", C2188811AlT.LIZIZ(sbLIZ));
                if (((VideoWidget) c786110Usb.l0).LLILZLL != null) {
                    if (C781270Ukn.LJI().getEffectMessageHandler() != null) {
                        C781270Ukn.LJI().getEffectMessageHandler();
                        iLIZ = C768430UCj.LIZ();
                    } else {
                        iLIZ = 1000000;
                    }
                    ((VideoWidget) c786110Usb.l0).LLILZLL.sendEffectMsg(40, 102, iLIZ, nVar.toString());
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LIZIZ("InteractiveE#parseIM", interactiveEffectMessage.triggerData);
            }
        }
    }

    public static final void onMessage$1(C786110Usb c786110Usb, IMessage iMessage) {
        AILiveSummary aILiveSummary;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) c786110Usb.l0;
        absAudienceInteractionFragment.getClass();
        if ((iMessage instanceof AILiveSummaryMessage) && (aILiveSummary = ((AILiveSummaryMessage) iMessage).aiLiveSummary) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(absAudienceInteractionFragment.LLJILJIL.getId());
            sbLIZ.append("");
            C1440005kM.LIZ(new C741370T6h(aILiveSummary, C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public static final void onMessage$2(C786110Usb c786110Usb, IMessage iMessage) {
        if ((iMessage instanceof RoomMessage) && Intrinsics.LJFF(((RoomMessage) iMessage).scene, "living_post_highlight_guide")) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("living_post_highlight_guide");
            c474500IjALIZ.LJIJJLI(((LiveBroadcastFragment) c786110Usb.l0).getDataChannel());
            c474500IjALIZ.LIZ();
        }
    }

    public static final void onMessage$3(C786110Usb c786110Usb, IMessage iMessage) {
        if ((iMessage instanceof RealTimePerformancePageMessage) && ((RealTimePerformancePageMessage) iMessage).type == 1 && LiveCenterGuideOpt.INSTANCE.enable() && C781520UlC.LJIIJJI(C751980Tee.LIZJ(((C781300Ukq) c786110Usb.l0).LIZ))) {
            C486790J7d.LIZLLL(new ARunnableS112S0100000_12((C781300Ukq) c786110Usb.l0, 367), null, Mp4ScreenVideoLoadTimeout.CONTROL);
        }
    }
}
