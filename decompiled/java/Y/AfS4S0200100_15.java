package Y;

import X.AbstractC962030b8r;
import X.C01EX;
import X.C09JN;
import X.C0UVC;
import X.C176600m4;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C470590Icr;
import X.C915490Zvn;
import X.C915980Zwa;
import X.C916150Zwr;
import X.C917300Zyi;
import X.C917310Zyj;
import X.C917320Zyk;
import X.C919310a1x;
import X.C921440a5O;
import X.C925150aBN;
import X.C946050aj5;
import X.C946060aj6;
import X.C958790b3d;
import X.C963140bAe;
import X.C970920bNC;
import X.C974560bT4;
import X.C981360be2;
import X.C981670beX;
import X.C981960bf0;
import X.C982220bfQ;
import X.C982440bfm;
import X.C982460bfo;
import X.C983820bi0;
import X.EnumC918790a17;
import X.EnumC919170a1j;
import X.EnumC982970bgd;
import X.EnumC982990bgf;
import X.InterfaceC937900aVw;
import X.InterfaceC954180awC;
import X.InterfaceC954910axN;
import X.InterfaceC983620bhg;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigV2Setting;
import com.bytedance.android.livesdk.model.SharedBgStatusChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import org.json.JSONException;

/* JADX INFO: loaded from: classes16.dex */
public class AfS4S0200100_15 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
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
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS4S0200100_15 r31, java.lang.Object r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS4S0200100_15.accept$0(Y.AfS4S0200100_15, java.lang.Object):void");
    }

    public static final void accept$1(AfS4S0200100_15 afS4S0200100_15, Object obj) {
        C1C7U.LIZ("TakeStagePlayingCoordinatorAnchor@341b.requestSwitchTurn$3");
        Throwable th = (Throwable) obj;
        C974560bT4 c974560bT4 = (C974560bT4) afS4S0200100_15.l0;
        long j = afS4S0200100_15.j2;
        c974560bT4.LJIIJJI(th);
        AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "select_uid", Long.valueOf(j), true);
        c974560bT4.LJIJJLI("switch_turn_failed");
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
        Context context = ((C981960bf0) afS4S0200100_15.l1).LIZ.context;
        PlaybookUtilKt.LJIIL(th);
        C915490Zvn.LIZ(enumC919170a1j, context, th);
        C20441214yg.LJ("TakeStagePlayingCoordinatorAnchor", "handleSwitchTurn, fail");
        C1C7U.LIZIZ("TakeStagePlayingCoordinatorAnchor@341b.requestSwitchTurn$3");
    }

    public static final void accept$2(AfS4S0200100_15 afS4S0200100_15, Object obj) {
        C946060aj6 c946060aj6XQ2;
        C946050aj5 c946050aj5LIZIZ;
        C1C7U.LIZ("MultiGuestSharedBgAnchorViewModel@72.onSelectedSharedBg$result$2");
        Throwable th = (Throwable) obj;
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "onSelectSharedBg, update settings fail");
        C176600m4.LIZJ(new AwS559S0100000_15(th, 360));
        Function0 function0 = (Function0) afS4S0200100_15.l0;
        if (function0 != null) {
            function0.invoke();
        }
        DataChannel dataChannel = ((MultiGuestSharedBgAnchorViewModel) afS4S0200100_15.l1).LL;
        if (dataChannel != null && (c946060aj6XQ2 = MultiGuestSharedBgAnchorViewModel.xQ2(dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6XQ2.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZLLL("update setting fail");
        }
        DataChannel dataChannel2 = ((MultiGuestSharedBgAnchorViewModel) afS4S0200100_15.l1).LL;
        if (dataChannel2 != null) {
            dataChannel2.LC0(SharedBgStatusChangeEvent.class, null);
        }
        C01EX.LIZIZ(th, "change_sahred_bg", "change_sahred_bg", C963140bAe.LIZIZ() - afS4S0200100_15.j2);
        C1C7U.LIZIZ("MultiGuestSharedBgAnchorViewModel@72.onSelectedSharedBg$result$2");
    }

    public static final void accept$3(AfS4S0200100_15 afS4S0200100_15, Object obj) {
        C1C7U.LIZ("CompetitionTimerManager@5b2f.startInterval$1");
        ((C983820bi0) afS4S0200100_15.l0).LIZIZ(afS4S0200100_15.j2, ((Long) obj).longValue(), (TimeUnit) afS4S0200100_15.l1);
        C1C7U.LIZIZ("CompetitionTimerManager@5b2f.startInterval$1");
    }

    public static final void accept$4(AfS4S0200100_15 afS4S0200100_15, Object obj) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        C1C7U.LIZ("VoiceChatAnchorPresenter@f74d.requestUpdateSetting$1");
        C20441214yg.LIZIZ("VoiceChatAnchorPresenter", "requestUpdateSetting success");
        C01EX.LIZLLL(C963140bAe.LIZIZ() - afS4S0200100_15.j2, "update_setting", ((BaseResponse) obj).LIZIZ, "change_layout");
        ((C921440a5O) afS4S0200100_15.l0).getClass();
        C20441214yg.LIZIZ("VoiceChatAnchorPresenter", "switchLayout");
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJJJJIZL(LivesdkLinkmicVoiceChatLayoutConfigV2Setting.INSTANCE.getValue(), false, false, true, false, new C916150Zwr());
        }
        boolean z = false;
        if (C925150aBN.LJJIII()) {
            EnumC918790a17 enumC918790a17 = EnumC918790a17.DEFAULT_MODE;
            if (((MultiLiveAnchorPanelSettings) afS4S0200100_15.l1).allowRequestFromOthers == 3) {
                z = true;
            }
            C917300Zyi.LIZ(enumC918790a17, z, true);
        } else {
            EnumC918790a17 enumC918790a172 = EnumC918790a17.DEFAULT_MODE;
            if (((MultiLiveAnchorPanelSettings) afS4S0200100_15.l1).allowViewerReq == 3) {
                z = true;
            }
            C917300Zyi.LIZ(enumC918790a172, z, true);
        }
        EnumC918790a17 enumC918790a173 = EnumC918790a17.DEFAULT_MODE;
        C917320Zyk.LIZIZ(enumC918790a173);
        if (C925150aBN.LJJIII()) {
            C917310Zyj.LIZ(enumC918790a173);
        }
        C1C7U.LIZIZ("VoiceChatAnchorPresenter@f74d.requestUpdateSetting$1");
    }

    public static final void accept$5(AfS4S0200100_15 afS4S0200100_15, Object obj) {
        C1C7U.LIZ("CatchBeansInviterCoordinator@5d96.competitionInitiate$4");
        Throwable th = (Throwable) obj;
        ((C974560bT4) afS4S0200100_15.l0).LJJIJ(th, System.currentTimeMillis() - afS4S0200100_15.j2, ((C981670beX) afS4S0200100_15.l1).LJJJJI());
        C0UVC.LIZIZ(th);
        ((C981670beX) afS4S0200100_15.l1).LJJJJLL(th);
        C1C7U.LIZIZ("CatchBeansInviterCoordinator@5d96.competitionInitiate$4");
    }

    public static final void accept$6(AfS4S0200100_15 afS4S0200100_15, Object obj) {
        C1C7U.LIZ("TakeStageInviterCoordinator@dae5.requestInviteApi$dispose$3");
        Throwable th = (Throwable) obj;
        InterfaceC954910axN.LIZ.getClass();
        C958790b3d.LIZJ(th, null);
        ((C974560bT4) afS4S0200100_15.l0).LJJIJ(th, System.currentTimeMillis() - afS4S0200100_15.j2, ((C981360be2) afS4S0200100_15.l1).LJJJJI());
        C0UVC.LIZIZ(th);
        ((C981360be2) afS4S0200100_15.l1).LJJJJJL(th);
        C1C7U.LIZIZ("TakeStageInviterCoordinator@dae5.requestInviteApi$dispose$3");
    }

    public static final void accept$7(AfS4S0200100_15 afS4S0200100_15, Object obj) {
        boolean z;
        C1C7U.LIZ("CompetitionAudienceIdentifyHelper@d607.onHandleAudienceSEI$2");
        C982460bfo c982460bfoLJIIIZ = C982440bfm.LJIIIZ((C470590Icr) obj);
        ((C970920bNC) afS4S0200100_15.l0).LJJIIJ("audience_sei_engine");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHandleAudienceSEI");
        sbLIZ.append(", infoResult = ");
        sbLIZ.append(c982460bfoLJIIIZ);
        C20441214yg.LJIIIZ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onHandleAudienceSEI");
        sbLIZ2.append(", newSEICompetitionId=");
        sbLIZ2.append(afS4S0200100_15.j2);
        sbLIZ2.append(", serverCompetitionId=");
        sbLIZ2.append(c982460bfoLJIIIZ.LIZJ.LIZJ);
        sbLIZ2.append(", is same = ");
        if (afS4S0200100_15.j2 == c982460bfoLJIIIZ.LIZJ.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ2.append(z);
        C20441214yg.LIZIZ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ2));
        if (afS4S0200100_15.j2 != c982460bfoLJIIIZ.LIZJ.LIZJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onHandleAudienceSEI");
            sbLIZ3.append(", return by newSEICompetitionId and serverCompetitionId is diff");
            C20441214yg.LJ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ3));
            ((InterfaceC983620bhg) afS4S0200100_15.l1).LIZJ(EnumC982970bgd.SCENE_SEI, EnumC982990bgf.FAIL_REASON_ID_INVALID);
        } else if (!C982220bfQ.LIZ("onHandleAudienceSEI", c982460bfoLJIIIZ.LJ)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onHandleAudienceSEI");
            sbLIZ4.append(", return by checkCanTransitStatusForAudience = false case2");
            C20441214yg.LJ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ4));
            ((InterfaceC983620bhg) afS4S0200100_15.l1).LIZJ(EnumC982970bgd.SCENE_SEI, EnumC982990bgf.FAIL_REASON_STATUS_INVALID);
        } else {
            InterfaceC983620bhg interfaceC983620bhg = (InterfaceC983620bhg) afS4S0200100_15.l1;
            EnumC982970bgd enumC982970bgd = EnumC982970bgd.SCENE_SEI;
            interfaceC983620bhg.LIZIZ(enumC982970bgd, c982460bfoLJIIIZ);
            ((InterfaceC983620bhg) afS4S0200100_15.l1).LIZ(enumC982970bgd);
        }
        C1C7U.LIZIZ("CompetitionAudienceIdentifyHelper@d607.onHandleAudienceSEI$2");
    }

    public AfS4S0200100_15(C983820bi0 c983820bi0, TimeUnit timeUnit, int i) {
        this.$t = i;
        this.l0 = c983820bi0;
        this.j2 = 1L;
        this.l1 = timeUnit;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS4S0200100_15(long r2, X.C981960bf0 r4, X.C974560bT4 r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto Lf
            r0 = r1
            r0.l0 = r5
            r0.j2 = r2
            r0.l1 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r5
            r0.j2 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS4S0200100_15.<init>(long, X.0bf0, X.0bT4, int):void");
    }

    public AfS4S0200100_15(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.j2 = j;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
