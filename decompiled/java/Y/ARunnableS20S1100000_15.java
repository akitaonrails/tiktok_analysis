package Y;

import X.AbstractC962030b8r;
import X.C1105630esT;
import X.C12ES;
import X.C158B;
import X.C1C7U;
import X.C20441214yg;
import X.C20689515xd;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917910Zzh;
import X.C930540aK4;
import X.C939710aYr;
import X.C939720aYs;
import X.C940240aZi;
import X.C946230ajN;
import X.C955440ayE;
import X.C960890b71;
import X.C963140bAe;
import X.C974480bSw;
import X.C974540bT2;
import X.C974600bT8;
import X.C975960bVK;
import X.C977380bXc;
import X.InterfaceC943880afa;
import X.InterfaceC975810bV5;
import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLikeScoreCompensationEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class ARunnableS20S1100000_15 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((C960890b71) this.l1).LLLFF = C158B.LIZ();
        C960890b71 c960890b71 = (C960890b71) this.l1;
        String str = this.s0;
        c960890b71.getClass();
        C955440ayE c955440ayE = new C955440ayE();
        long jLIZ = C158B.LIZ();
        long j = c960890b71.LLJZIJLIL;
        long j2 = c960890b71.LLL;
        long j3 = j2 - j;
        long j4 = c960890b71.LLLF;
        long j5 = j4 - j2;
        long j6 = c960890b71.LLLFF;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "page_name", "cohost_panel", true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "page_enter_from", C955440ayE.LJJIJ(c955440ayE), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "start_type", String.valueOf(3), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "start_to_now", Long.valueOf(jLIZ - j), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "init_stage_cost", Long.valueOf(j3), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "full_data_mount_stage_cost", Long.valueOf(j5), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "full_page_render_stage_cost", Long.valueOf(j6 - j4), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "full_page_fp_cost", Long.valueOf(j6 - j), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "data_source", str, true);
        c955440ayE.LJIJJLI("full_page_meaningful_rendered");
    }

    public final void LIZ$2() {
        Object tag = ((C939710aYr) this.l1).getNetworkStateImageView().getTag(R.id.hig);
        if (!(tag instanceof Integer)) {
            tag = null;
        }
        boolean zLJJJJIZL = C500260Jjc.LJJJJIZL(((C939710aYr) this.l1).getNetworkStateImageView());
        if (C939710aYr.LJJII(((C939710aYr) this.l1).getNickNameFromXml(), ((C939710aYr) this.l1).getFollowStatusV1FromXml()) || C939710aYr.LJJII(((C939710aYr) this.l1).getFollowStatusV1FromXml(), ((C939710aYr) this.l1).getOnlinePlayerMuteFromXml()) || (C917910Zzh.LIZ(C930540aK4.LIZJ()) && tag != null)) {
            if (zLJJJJIZL) {
                C786410Ut5.LLJJJJJIL(((C939710aYr) this.l1).getNetworkStateImageView(), 8);
                ((C939710aYr) this.l1).LLJJIJIIJIL = true;
                return;
            }
            return;
        }
        if (!((C939710aYr) this.l1).LLJJIJIIJIL || Intrinsics.LJFF(this.s0, "showLiveShowOrder")) {
            return;
        }
        C939710aYr c939710aYr = (C939710aYr) this.l1;
        if (c939710aYr.LLJJIJIIJIL) {
            C12ES.LJIILL(0, c939710aYr.getNetworkStateImageView());
            C939710aYr c939710aYr2 = (C939710aYr) this.l1;
            c939710aYr2.LLJJIJIIJIL = false;
            HandlerHook.viewPost(c939710aYr2.getNetworkStateImageView(), new ARunnableS115S0100000_15((C939710aYr) this.l1, 214));
        }
    }

    public final void LIZ$1() {
        DataChannel dataChannel;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C975960bVK c975960bVK = ((C977380bXc) this.l1).LLIZLLLIL;
        String strValueOf = String.valueOf(c975960bVK != null ? Long.valueOf(c975960bVK.LJ) : null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append(',');
        sbLIZ.append(currentUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z = Intrinsics.LJFF("pass", this.s0) && ((interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL()) == null || !interfaceC975810bV5LIZLLL.LJ()) && ((LinkedHashMap) C974540bT2.LJJIII).get(strLIZIZ) == null;
        if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableScoreTrack() && z) {
            long jLIZJ = C963140bAe.LIZJ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = C946230ajN.LJIIIIZZ;
            C974600bT8 c974600bT8 = new C974600bT8(0L, jLIZJ, jLIZJ, jElapsedRealtime, jElapsedRealtime, j, j);
            Map<String, List<C974600bT8>> map = C974540bT2.LJJIII;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c974600bT8);
            map.put(strLIZIZ, arrayList);
            if (((ArrayList) C974540bT2.LJJIIJ).contains(strLIZIZ)) {
                C974540bT2.LJJIII(0L, strLIZIZ, true, false);
            }
            if (((ArrayList) C974480bSw.LIZJ).contains(strLIZIZ)) {
                C974540bT2.LJJIII(0L, strLIZIZ, false, false);
            }
        }
        C977380bXc c977380bXc = (C977380bXc) this.l1;
        if (c977380bXc.LLIZ && z) {
            DataChannel dataChannel2 = c977380bXc.LLILLL;
            if (dataChannel2 != null && C500260Jjc.LJIJI(dataChannel2) && (dataChannel = ((C977380bXc) this.l1).LLILLL) != null) {
                dataChannel.FQ2(BattleLikeScoreCompensationEvent.class);
            }
            C977380bXc c977380bXc2 = (C977380bXc) this.l1;
            c977380bXc2.LLIZ = false;
            c977380bXc2.LIZ(false);
        }
    }

    public static final void run$0(ARunnableS20S1100000_15 aRunnableS20S1100000_15) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aRunnableS20S1100000_15.l1;
        String str = aRunnableS20S1100000_15.s0;
        linkControlWidget.getClass();
        C1C7U.LIZ("LinkControlWidget@1079.unLoadWidget$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unLoadWidget, source=");
        sbLIZ.append(str);
        sbLIZ.append(", start, after post, mLinkCrossRoomWidget=");
        sbLIZ.append(linkControlWidget.LLIZ);
        C20441214yg.LJIIIZ("LinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC943880afa interfaceC943880afa = linkControlWidget.LLJILLL;
        if (interfaceC943880afa != null) {
            interfaceC943880afa.LIZ(linkControlWidget.LLIZ);
        }
        InterfaceC943880afa interfaceC943880afa2 = linkControlWidget.LLJILLL;
        if (interfaceC943880afa2 != null) {
            interfaceC943880afa2.LIZIZ();
        }
        linkControlWidget.LLIZ = null;
        C1C7U.LIZIZ("LinkControlWidget@1079.unLoadWidget$1L");
    }

    public static final void run$1(ARunnableS20S1100000_15 aRunnableS20S1100000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiCoHostUpgradeListPresenter@7661.displayRivalsSection$2");
        try {
            aRunnableS20S1100000_15.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiCoHostUpgradeListPresenter@7661.displayRivalsSection$2");
    }

    public static final void run$2(ARunnableS20S1100000_15 aRunnableS20S1100000_15) {
        boolean zLIZ;
        C1C7U.LIZ("BaseMultiGuestV3Mask@1640.updateTicketCountWithOutAnimation$1");
        try {
            C1105630esT c1105630esT = ((C939720aYs) aRunnableS20S1100000_15.l1).onlineTicket;
            C1105630esT c1105630esT2 = null;
            if (c1105630esT == null) {
                c1105630esT = null;
            }
            if (c1105630esT.getParent() != null) {
                C1105630esT c1105630esT3 = ((C939720aYs) aRunnableS20S1100000_15.l1).onlineTicket;
                if (c1105630esT3 == null) {
                    c1105630esT3 = null;
                }
                c1105630esT3.setText(aRunnableS20S1100000_15.s0);
                C1105630esT c1105630esT4 = ((C939720aYs) aRunnableS20S1100000_15.l1).onlineTicket;
                if (c1105630esT4 == null) {
                    c1105630esT4 = null;
                }
                C786410Ut5.rd(c1105630esT4, 0.0f);
                C1105630esT c1105630esT5 = ((C939720aYs) aRunnableS20S1100000_15.l1).onlineTicket;
                if (c1105630esT5 != null) {
                    c1105630esT2 = c1105630esT5;
                }
                C12ES.LJIILL(0, c1105630esT2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseMultiGuestV3Mask@1640.updateTicketCountWithOutAnimation$1");
    }

    public static final void run$3(ARunnableS20S1100000_15 aRunnableS20S1100000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestCreateAvatarFragment@ace6.transferOriginalPicture$upload$2");
        try {
            C20689515xd c20689515xd = ((MultiGuestCreateAvatarFragment) aRunnableS20S1100000_15.l1).LLILZ;
            if (c20689515xd != null) {
                c20689515xd.setOriginPath(aRunnableS20S1100000_15.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestCreateAvatarFragment@ace6.transferOriginalPicture$upload$2");
    }

    public static final void run$4(ARunnableS20S1100000_15 aRunnableS20S1100000_15) {
        boolean zLIZ;
        C1C7U.LIZ("InteractiveLikeComponent@28b1.onResult$1");
        try {
            aRunnableS20S1100000_15.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractiveLikeComponent@28b1.onResult$1");
    }

    public static final void run$5(ARunnableS20S1100000_15 aRunnableS20S1100000_15) {
        boolean zLIZ;
        C1C7U.LIZ("ScoreBizViewElement@17eb.updateTicketCountWithOutAnimation$1");
        try {
            C1105630esT c1105630esT = ((C940240aZi) aRunnableS20S1100000_15.l1).LLJILJIL;
            C1105630esT c1105630esT2 = null;
            if (c1105630esT == null) {
                c1105630esT = null;
            }
            if (c1105630esT.getParent() != null) {
                C1105630esT c1105630esT3 = ((C940240aZi) aRunnableS20S1100000_15.l1).LLJILJIL;
                if (c1105630esT3 == null) {
                    c1105630esT3 = null;
                }
                c1105630esT3.setText(aRunnableS20S1100000_15.s0);
                C1105630esT c1105630esT4 = ((C940240aZi) aRunnableS20S1100000_15.l1).LLJILJIL;
                if (c1105630esT4 == null) {
                    c1105630esT4 = null;
                }
                C786410Ut5.rd(c1105630esT4, 0.0f);
                C1105630esT c1105630esT5 = ((C940240aZi) aRunnableS20S1100000_15.l1).LLJILJIL;
                if (c1105630esT5 != null) {
                    c1105630esT2 = c1105630esT5;
                }
                C12ES.LJIILL(0, c1105630esT2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScoreBizViewElement@17eb.updateTicketCountWithOutAnimation$1");
    }

    public static final void run$6(ARunnableS20S1100000_15 aRunnableS20S1100000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestV3GuestMask@c123.checkNickNameWidthIsEnough$runnable$1");
        try {
            aRunnableS20S1100000_15.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestV3GuestMask@c123.checkNickNameWidthIsEnough$runnable$1");
    }

    public ARunnableS20S1100000_15(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
