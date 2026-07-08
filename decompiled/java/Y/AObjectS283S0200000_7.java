package Y;

import X.C0IEW;
import X.C0II5;
import X.C0II6;
import X.C0KBR;
import X.C0S4J;
import X.C1106110etF;
import X.C1113800f5e;
import X.C1209120hZO;
import X.C1210880hcE;
import X.C1440005kM;
import X.C2188811AlT;
import X.C464260IIm;
import X.C464280IIo;
import X.C464800IKo;
import X.EnumC1105670esX;
import X.InterfaceC481170Itv;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.dynamicstrategy.PanelStateEvent;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePromoteCardGestureOptimize;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS283S0200000_7 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS283S0200000_7 aObjectS283S0200000_7) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS283S0200000_7.l0;
        C0IEW c0iew = (C0IEW) aObjectS283S0200000_7.l1;
        String str = LivePlayFragment._pnsPageId;
        C0II5 c0ii5NS = livePlayFragment.NS();
        if (c0ii5NS == C0II5.EXIT_EXTRA_CARD) {
            C464260IIm c464260IIm = livePlayFragment.m0;
            if (c464260IIm != null) {
                c464260IIm.LIZJ();
                C1113800f5e.LJIIIIZZ = true;
            }
            C464280IIo c464280IIo = livePlayFragment.n0;
            if (c464280IIo != null) {
                c464280IIo.LJIIZILJ();
            }
        } else if (c0ii5NS == C0II5.EXTRA_CARD) {
            C464280IIo c464280IIo2 = livePlayFragment.n0;
            if (c464280IIo2 != null) {
                c464280IIo2.LIZJ();
            }
            C464260IIm c464260IIm2 = livePlayFragment.m0;
            if (c464260IIm2 != null) {
                c464260IIm2.LJIILL();
                C1113800f5e.LJIIIIZZ = false;
                LiveExtraCardFrequencyManager.LIZ.LJFF(livePlayFragment.m0.LJI);
            }
        } else {
            C464260IIm c464260IIm3 = livePlayFragment.m0;
            if (c464260IIm3 != null) {
                c464260IIm3.LIZJ();
                C1113800f5e.LJIIIIZZ = true;
            }
            C464280IIo c464280IIo3 = livePlayFragment.n0;
            if (c464280IIo3 != null) {
                c464280IIo3.LIZJ();
            }
        }
        if (c0ii5NS != C0II5.EXTRA_CARD || !LivePromoteCardGestureOptimize.INSTANCE.enable()) {
            c0iew.LLJJJ(C0II6.LIVE_SURVEY_CARD);
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS283S0200000_7 aObjectS283S0200000_7) {
        C1209120hZO c1209120hZO = (C1209120hZO) aObjectS283S0200000_7.l0;
        Aweme aweme = (Aweme) aObjectS283S0200000_7.l1;
        C0S4J c0s4j = c1209120hZO.LIZ.e;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove current live, aid=");
        sbLIZ.append(aweme.getAid());
        c0s4j.LJIIJ("BaseListFragmentPanel", C2188811AlT.LIZIZ(sbLIZ));
        C1440005kM.LIZ(new C1210880hcE(c1209120hZO.LIZ.getEventType(), "FUNCTION_FROM_DEFAULT", "live_kick_off", aweme));
        c1209120hZO.LIZ.e0();
        return null;
    }

    public static final Object invoke$2(AObjectS283S0200000_7 aObjectS283S0200000_7) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS283S0200000_7.l0;
        DialogFragment dialogFragment = (DialogFragment) aObjectS283S0200000_7.l1;
        c1106110etF.LLJIJIL.zW(ToolBarShareVisibleChannel.class, Boolean.FALSE);
        C464800IKo.LIZ.LJIIZILJ(dialogFragment);
        c1106110etF.LLJIJIL.LC0(PanelStateEvent.class, new C0KBR(false, EnumC1105670esX.SHARE, 0));
        InterfaceC481170Itv interfaceC481170Itv = c1106110etF.LLLIIII;
        if (interfaceC481170Itv != null) {
            interfaceC481170Itv.LIZJ();
        }
        c1106110etF.LLLIIII = null;
        return Unit.LIZ;
    }

    public AObjectS283S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
