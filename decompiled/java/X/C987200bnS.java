package X;

import Y.ARunnableS115S0100000_15;
import com.bytedance.android.live.liveinteract.linkroom.toolbarbehavior.ToolbarMultiGuestManageBehavior;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestBubbleShowEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987200bnS implements InterfaceC254900yh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC254900yh
    public final void x1(int i) {
        switch (this.$t) {
            case 0:
                x1$0(this, i);
                break;
            case 1:
                x1$1(this, i);
                break;
            case 2:
                x1$2(this, i);
                break;
            case 3:
                x1$3(this, i);
                break;
            case 4:
                x1$4(this, i);
                break;
            case 5:
                x1$5(this, i);
                break;
            case 6:
                x1$6(this, i);
                break;
            case 7:
                x1$7(this, i);
                break;
            case 8:
                x1$8(this, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                x1$9(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                x1$10(this, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                x1$11(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                x1$12(this, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                x1$13(this, i);
                break;
            case 14:
                x1$14(this, i);
                break;
            case 15:
                x1$15(this, i);
                break;
            case 16:
                x1$16(this, i);
                break;
        }
    }

    public C987200bnS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void x1$0(C987200bnS c987200bnS, int i) {
        if (i == 6) {
            ((ToolbarMultiGuestManageBehavior) c987200bnS.l0).LLJIJIL = true;
        }
    }

    public static final void x1$1(C987200bnS c987200bnS, int i) {
        C786410Ut5.LJLIIL(100L, C473410IhP.LIZ(), new ARunnableS115S0100000_15((C973600bRW) c987200bnS.l0, 121));
    }

    public static final void x1$10(C987200bnS c987200bnS, int i) {
        ((C934330aQB) c987200bnS.l0).LLJJJJ = false;
    }

    public static final void x1$11(C987200bnS c987200bnS, int i) {
        ((InterfaceC934510aQT) c987200bnS.l0).LIZIZ();
    }

    public static final void x1$12(C987200bnS c987200bnS, int i) {
        ((InterfaceC934490aQR) c987200bnS.l0).LIZIZ();
    }

    public static final void x1$13(C987200bnS c987200bnS, int i) {
        DataChannel dataChannel = ((C934320aQA) c987200bnS.l0).LLJJIJIIJIL;
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestBubbleShowEvent.class, null);
        }
    }

    public static final void x1$14(C987200bnS c987200bnS, int i) {
        ((C934320aQA) c987200bnS.l0).LLJLIL = false;
    }

    public static final void x1$15(C987200bnS c987200bnS, int i) {
        ((C934320aQA) c987200bnS.l0).LLJLILLLLZIIL = false;
    }

    public static final void x1$16(C987200bnS c987200bnS, int i) {
        Object objGg0;
        DataChannel dataChannel;
        C20441214yg.LJIIIZ("ToolbarMultiGuestBehavior", "[QC_BATCH_INVITE_V1] toolbar bubbleDismissed");
        C934320aQA c934320aQA = (C934320aQA) c987200bnS.l0;
        c934320aQA.LLJLLL = 0L;
        c934320aQA.LJIJJLI();
        DataChannel dataChannel2 = ((C934320aQA) c987200bnS.l0).LLJJIJIIJIL;
        if (dataChannel2 != null) {
            objGg0 = dataChannel2.gg0(MultiGuestBubbleShowEvent.class);
        } else {
            objGg0 = null;
        }
        if (!Intrinsics.LJFF(objGg0, "quick_connect_invite_click") && (dataChannel = ((C934320aQA) c987200bnS.l0).LLJJIJIIJIL) != null) {
            dataChannel.zW(MultiGuestBubbleShowEvent.class, "");
        }
    }

    public static final void x1$2(C987200bnS c987200bnS, int i) {
        C786410Ut5.LJLIIL(100L, C473410IhP.LIZ(), new ARunnableS115S0100000_15((C973600bRW) c987200bnS.l0, 122));
    }

    public static final void x1$3(C987200bnS c987200bnS, int i) {
        ((C973600bRW) c987200bnS.l0).LIZLLL = null;
    }

    public static final void x1$4(C987200bnS c987200bnS, int i) {
        DataChannel dataChannel = ((C944860ahA) c987200bnS.l0).LLJZ;
        if (dataChannel != null) {
            dataChannel.SX0(C956920b0c.class, Boolean.FALSE);
        }
    }

    public static final void x1$5(C987200bnS c987200bnS, int i) {
        C786410Ut5.LJLIIL(200L, C473410IhP.LIZ(), new ARunnableS115S0100000_15((C944860ahA) c987200bnS.l0, 149));
    }

    public static final void x1$6(C987200bnS c987200bnS, int i) {
        ((C944860ahA) c987200bnS.l0).getClass();
        C20441214yg.LJIIIZ("ToolbarCoHostBehavior", "nudge bubble dismiss");
        if (i == 6) {
            C944220ag8.LIZJ = true;
        }
    }

    public static final void x1$7(C987200bnS c987200bnS, int i) {
        ((C944860ahA) c987200bnS.l0).getClass();
        C20441214yg.LJIIIZ("ToolbarCoHostBehavior", "nudge bubble dismiss");
        if (i == 6) {
            C944220ag8.LIZJ = true;
        }
    }

    public static final void x1$8(C987200bnS c987200bnS, int i) {
        long j = C955580ayS.LIZIZ;
        if (j > 0) {
            ((C944860ahA) c987200bnS.l0).LJIL(j);
        }
    }

    public static final void x1$9(C987200bnS c987200bnS, int i) {
        ((MultiHostInviteListFragmentV2) c987200bnS.l0).LLJZ = false;
    }
}
