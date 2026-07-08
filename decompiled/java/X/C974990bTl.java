package X;

import Y.AfS109S0300000_15;
import Y.AfS65S0400000_15;
import android.content.DialogInterface;
import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchPermissionData;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptExtraSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviterPanelGuideSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AFwS338S0000000_15;
import kotlin.jvm.internal.AwS144S0400000_15;
import kotlin.jvm.internal.AwS202S0000000_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS76S0500000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974990bTl {
    public static final /* synthetic */ int LJII = 0;
    public LinkDialog LIZ;
    public LinkDialog LIZIZ;
    public LinkDialog LIZJ;
    public C11JF LIZLLL;
    public boolean LJ;
    public C11JF LJFF;
    public MultiMatchPrepareResponse LJI;

    public final void LIZLLL() {
        LinkDialog linkDialog = this.LIZ;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        this.LIZ = null;
        LinkDialog linkDialog2 = this.LIZIZ;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
        this.LIZIZ = null;
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = null;
        this.LJ = false;
        C11JF c11jf2 = this.LJFF;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LJFF = null;
    }

    public static void LIZ(C974060bSG c974060bSG) {
        if (!Intrinsics.LJFF(c974060bSG.LIZJ, "playbook_match")) {
            return;
        }
        boolean z = false;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && interfaceC973730bRjYf2.LJJJJI()) {
            z = true;
        }
        C918250a0F.LIZ(z);
    }

    public static boolean LJFF(C974060bSG c974060bSG) {
        Boolean bool;
        DataChannel dataChannel;
        if (LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptMatchButton()) {
            LiveWidget liveWidget = c974060bSG.LIZIZ;
            if (liveWidget != null && (dataChannel = liveWidget.dataChannel) != null) {
                bool = (Boolean) dataChannel.gg0(MatchPermissionData.class);
            } else {
                bool = null;
            }
            return C500260Jjc.LJJJI(bool);
        }
        return true;
    }

    public final void LIZJ(boolean z) {
        Boolean boolValueOf;
        if (z) {
            LinkDialog linkDialog = this.LIZIZ;
            if (linkDialog != null) {
                boolValueOf = Boolean.valueOf(linkDialog.isVisible());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C766270U4b.LIZLLL(2131853338);
            }
        }
        LinkDialog linkDialog2 = this.LIZIZ;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
    }

    public static boolean LJIIJJI(int i, boolean z) {
        boolean z2;
        boolean z3;
        if (i == 2) {
            z2 = true;
        } else {
            z2 = false;
            if (i == 6) {
                z3 = true;
            }
            if (z2 && !z3) {
                if (z) {
                    C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
                    if (c981480beEM91 != null && c981480beEM91.LJIIIZ > 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("shouldDispatchMessage");
                        sbLIZ.append(", isMatchMsg=");
                        sbLIZ.append(z);
                        sbLIZ.append(", return false by competition isInProcess=true");
                        C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
                        return false;
                    }
                } else {
                    InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf2 != null && interfaceC973730bRjYf2.LJJJJJL() > 0 && C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.INVITED) >= 0 && C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.DRAW) <= 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("shouldDispatchMessage");
                        sbLIZ2.append(", isMatchMsg=");
                        sbLIZ2.append(z);
                        sbLIZ2.append(", return false by match isInProcess=true");
                        C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ2));
                        return false;
                    }
                }
                return true;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("shouldDispatchMessage");
            sbLIZ3.append(", isMatchMsg=");
            sbLIZ3.append(z);
            sbLIZ3.append(", return true as isTeamPairInvitation=");
            sbLIZ3.append(z2);
            sbLIZ3.append(", isRematchGuideInvitation=");
            sbLIZ3.append(z3);
            C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ3));
            return true;
        }
        z3 = false;
        if (z2) {
        }
        StringBuilder sbLIZ32 = C2188811AlT.LIZ();
        sbLIZ32.append("shouldDispatchMessage");
        sbLIZ32.append(", isMatchMsg=");
        sbLIZ32.append(z);
        sbLIZ32.append(", return true as isTeamPairInvitation=");
        sbLIZ32.append(z2);
        sbLIZ32.append(", isRematchGuideInvitation=");
        sbLIZ32.append(z3);
        C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ32));
        return true;
    }

    public final void LJIIIZ(C974060bSG c974060bSG, List list) {
        EnumC919170a1j enumC919170a1j;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        EnumC919170a1j enumC919170a1j2;
        DataChannel dataChannel3;
        EnumC973640bRa enumC973640bRa;
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", "go to new arch");
        EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
        EnumC974260bSa enumC974260bSaJV1 = C915980Zwa.LIZIZ().JV1(false);
        if (c974060bSG.LJ) {
            InterfaceC955780aym interfaceC955780aymLJIIJ = C915980Zwa.LJI().LJIIJ();
            Integer num = c974060bSG.LJII;
            if (num != null && num.intValue() == 6) {
                enumC973640bRa = EnumC973640bRa.INDIVIDUAL_GUIDE;
            } else {
                enumC973640bRa = EnumC973640bRa.PK_GUIDE;
            }
            interfaceC955780aymLJIIJ.LJ(enumC973640bRa.getValue());
        } else {
            String str = c974060bSG.LIZJ;
            if (str != null && str.length() > 0 && enumC964170bCJRY != EnumC964170bCJ.INVITED && enumC974260bSaJV1 != EnumC974260bSa.INVITED) {
                C915980Zwa.LJI().LJIIJ().LJ(str);
            }
        }
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(new AwS224S0300000_15(this, c974060bSG, list, 32), 607);
        LinkDialog linkDialog = this.LIZ;
        if (linkDialog != null && linkDialog.isVisible()) {
            return;
        }
        if (c974060bSG.LJIIIZ != null) {
            C20441214yg.LIZIZ("CompetitionAnchorLauncher", "showModeGuideDialogIfNeed, disable for competitionInitAction");
            awS594S0100000_15.invoke(EnumC919170a1j.UNKNOWN);
            return;
        }
        if (InterfaceC1106030et7.P4.LIZIZ().intValue() >= LiveMatchInviterPanelGuideSetting.INSTANCE.getMaxCount()) {
            awS594S0100000_15.invoke(EnumC919170a1j.UNKNOWN);
            return;
        }
        if (Intrinsics.LJFF(c974060bSG.LIZJ, "pk_icon") && C163000js.LIZ() && InterfaceC1106030et7.N4.LIZIZ().intValue() < 1) {
            C20441214yg.LIZIZ("CompetitionAnchorLauncher", "showModeGuideDialogIfNeed, showing AI commentary guide dialog once fragment shows");
            awS594S0100000_15.invoke(EnumC919170a1j.UNKNOWN);
            return;
        }
        if (!(!Intrinsics.LJFF(InterfaceC960800b6s.LLJLLIL.LIZIZ(), C930540aK4.LJIIJ()))) {
            awS594S0100000_15.invoke(EnumC919170a1j.UNKNOWN);
            return;
        }
        if (LJFF(c974060bSG) && LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable() && !C975140bU0.LIZ(EnumC962960bAM.MATCH_1V1, c974060bSG.LIZJ)) {
            C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.K4;
            if (c20337914i1.LIZIZ().intValue() <= 0) {
                if (C915980Zwa.LJII().LLILZLL(true).size() == 2) {
                    enumC919170a1j2 = EnumC919170a1j.MATCH_TYPE_1V1;
                } else {
                    enumC919170a1j2 = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
                }
                LiveWidget liveWidget = c974060bSG.LIZIZ;
                if (liveWidget != null && (dataChannel3 = liveWidget.dataChannel) != null) {
                    C0N59 c0n59 = C0N59.ICY_CLASH;
                    AwS594S0100000_15 awS594S0100000_152 = new AwS594S0100000_15(awS594S0100000_15, 599);
                    LinkDialog linkDialog2 = new LinkDialog(liveWidget);
                    EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TYPE_MATCH_MODE_GUIDE;
                    C975020bTo c975020bTo = new C975020bTo();
                    c975020bTo.LIZIZ = awS594S0100000_152;
                    c975020bTo.LIZJ = enumC919170a1j2;
                    c975020bTo.LIZLLL = c0n59;
                    linkDialog2.LLILZIL = enumC977660bY4;
                    linkDialog2.LLILZLL = c975020bTo;
                    this.LIZ = linkDialog2;
                    C957750b1x.LIZ(dataChannel3, linkDialog2, "TAG_CompetitionAnchorLauncher_DIALOG");
                }
                c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
                C975230bU9.LJFF();
                return;
            }
        }
        EnumC962960bAM enumC962960bAM = EnumC962960bAM.TAKE_THE_STAGE;
        if (!C975140bU0.LIZ(enumC962960bAM, c974060bSG.LIZJ)) {
            C20337914i1<Integer> c20337914i12 = InterfaceC960800b6s.LLJZIJLIL;
            if (c20337914i12.LIZIZ().intValue() <= 0) {
                LJI(c974060bSG, 2L, awS594S0100000_15);
                c20337914i12.LJFF(Integer.valueOf(c20337914i12.LIZIZ().intValue() + 1));
                C975230bU9.LJFF();
                return;
            }
        }
        if (LJFF(c974060bSG) && C915980Zwa.LJII().LLILZLL(true).size() >= 3 && !C975140bU0.LIZ(EnumC962960bAM.MATCH_1VN, c974060bSG.LIZJ)) {
            C20337914i1<Integer> c20337914i13 = InterfaceC980390bcT.Ia;
            if (c20337914i13.LIZIZ().intValue() <= 0) {
                if (C915980Zwa.LJII().LLILZLL(true).size() < 3) {
                    C20441214yg.LIZIZ("CompetitionAnchorLauncher", "tryShow1vNMatchGuideDialog, new 1vN is not enable");
                } else {
                    EnumC919170a1j enumC919170a1j3 = EnumC919170a1j.MATCH_TYPE_1VN;
                    LiveWidget liveWidget2 = c974060bSG.LIZIZ;
                    if (liveWidget2 != null && (dataChannel2 = liveWidget2.dataChannel) != null) {
                        AwS594S0100000_15 awS594S0100000_153 = new AwS594S0100000_15(awS594S0100000_15, 608);
                        C0N59 c0n592 = C0N59.NONE;
                        LinkDialog linkDialog3 = new LinkDialog(liveWidget2);
                        EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.TYPE_MATCH_MODE_GUIDE;
                        C975020bTo c975020bTo2 = new C975020bTo();
                        c975020bTo2.LIZIZ = awS594S0100000_153;
                        c975020bTo2.LIZJ = enumC919170a1j3;
                        c975020bTo2.LIZLLL = c0n592;
                        linkDialog3.LLILZIL = enumC977660bY42;
                        linkDialog3.LLILZLL = c975020bTo2;
                        this.LIZ = linkDialog3;
                        C957750b1x.LIZ(dataChannel2, linkDialog3, "TAG_CompetitionAnchorLauncher_DIALOG");
                    }
                    c20337914i13.LJFF(Integer.valueOf(c20337914i13.LIZIZ().intValue() + 1));
                    C975230bU9.LJFF();
                    return;
                }
            }
        }
        if (C915980Zwa.LJII().LLILZLL(true).size() == 2) {
            if (!LiveMatchBeansSettings.INSTANCE.isAnchorEnabled()) {
                C20441214yg.LIZIZ("CompetitionAnchorLauncher", "tryShowCatchBeansMatchGuideDialog, Catch Beans is not enabled");
            } else if (!C975140bU0.LIZ(EnumC962960bAM.CATCH_BEANS, c974060bSG.LIZJ)) {
                C20337914i1<Integer> c20337914i14 = InterfaceC1106030et7.Q4;
                if (c20337914i14.LIZIZ().intValue() <= 0) {
                    LiveWidget liveWidget3 = c974060bSG.LIZIZ;
                    if (liveWidget3 != null) {
                        AwS594S0100000_15 awS594S0100000_154 = new AwS594S0100000_15(awS594S0100000_15, 597);
                        Integer numValueOf = Integer.valueOf(c974060bSG.LIZLLL);
                        LinkDialog linkDialog4 = new LinkDialog(liveWidget3);
                        EnumC977660bY4 enumC977660bY43 = EnumC977660bY4.CATCH_BEANS_MODE_GUIDE;
                        C975040bTq c975040bTq = new C975040bTq();
                        c975040bTq.LIZIZ = awS594S0100000_154;
                        c975040bTq.LIZJ = numValueOf;
                        linkDialog4.LLILZIL = enumC977660bY43;
                        linkDialog4.LLILZLL = c975040bTq;
                        this.LIZ = linkDialog4;
                        C957750b1x.LIZ(liveWidget3.dataChannel, linkDialog4, "TAG_CompetitionAnchorLauncher_DIALOG");
                    }
                    c20337914i14.LJFF(Integer.valueOf(c20337914i14.LIZIZ().intValue() + 1));
                    C975230bU9.LJFF();
                    return;
                }
            }
        }
        if (!C975140bU0.LIZ(enumC962960bAM, c974060bSG.LIZJ)) {
            C20337914i1<Integer> c20337914i15 = InterfaceC960800b6s.LLJZ;
            if (c20337914i15.LIZIZ().intValue() <= 0) {
                LJI(c974060bSG, 0L, awS594S0100000_15);
                c20337914i15.LJFF(Integer.valueOf(c20337914i15.LIZIZ().intValue() + 1));
                C975230bU9.LJFF();
                return;
            }
        }
        if (LJFF(c974060bSG) && !C975140bU0.LIZ(EnumC962960bAM.MATCH_1V1, c974060bSG.LIZJ)) {
            C20337914i1<Integer> c20337914i16 = InterfaceC980390bcT.Ga;
            if (c20337914i16.LIZIZ().intValue() <= 0) {
                if (C915980Zwa.LJII().LLILZLL(true).size() == 2) {
                    enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1V1;
                } else {
                    enumC919170a1j = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
                }
                LiveWidget liveWidget4 = c974060bSG.LIZIZ;
                if (liveWidget4 != null && (dataChannel = liveWidget4.dataChannel) != null) {
                    AwS594S0100000_15 awS594S0100000_155 = new AwS594S0100000_15(awS594S0100000_15, 601);
                    C0N59 c0n593 = C0N59.NONE;
                    LinkDialog linkDialog5 = new LinkDialog(liveWidget4);
                    EnumC977660bY4 enumC977660bY44 = EnumC977660bY4.TYPE_MATCH_MODE_GUIDE;
                    C975020bTo c975020bTo3 = new C975020bTo();
                    c975020bTo3.LIZIZ = awS594S0100000_155;
                    c975020bTo3.LIZJ = enumC919170a1j;
                    c975020bTo3.LIZLLL = c0n593;
                    linkDialog5.LLILZIL = enumC977660bY44;
                    linkDialog5.LLILZLL = c975020bTo3;
                    this.LIZ = linkDialog5;
                    C957750b1x.LIZ(dataChannel, linkDialog5, "TAG_CompetitionAnchorLauncher_DIALOG");
                }
                c20337914i16.LJFF(Integer.valueOf(c20337914i16.LIZIZ().intValue() + 1));
                C975230bU9.LJFF();
                return;
            }
        }
        awS594S0100000_15.invoke(EnumC919170a1j.UNKNOWN);
    }

    public final void LJIIL(C974060bSG c974060bSG, MultiMatchPrepareResponse multiMatchPrepareResponse) {
        LiveWidget liveWidget;
        MatchBaseWidget matchBaseWidget;
        String str;
        EnumC977660bY4 enumC977660bY4;
        LinkDialog linkDialog = this.LIZJ;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LIZJ;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TYPE_TWO_MATCH_INVITER) {
                return;
            }
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        if (c974060bSG != null) {
            liveWidget = c974060bSG.LIZIZ;
        } else {
            liveWidget = null;
        }
        if ((liveWidget instanceof MatchBaseWidget) && (matchBaseWidget = (MatchBaseWidget) liveWidget) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (multiMatchPrepareResponse == null || (str = multiMatchPrepareResponse.ruleGuideUrl) == null) {
                str = "";
            }
            LinkDialog linkDialogLIZLLL = C977650bY3.LIZLLL(matchBaseWidget, matchBaseWidget, str, C978520bZS.LJFF(), null, null, AFwS338S0000000_15.get$arr$(5), null, null, false, "pk_icon_1v1_not_available", c974060bSG.LJIIIIZZ, 432);
            C957750b1x.LIZ(matchBaseWidget.dataChannel, linkDialogLIZLLL, "TwoMatchInviteDialog");
            this.LIZJ = linkDialogLIZLLL;
            linkDialogLIZLLL.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0bTp
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C20441214yg.LIZIZ("CompetitionAnchorLauncher", "show1V1MatchPanelDirectly teamMate dialog dismiss callback");
                }
            });
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LIZ.LJJLIIIIJ(EnumC974650bTD.CLICKICON, null, System.currentTimeMillis() - jCurrentTimeMillis);
        }
    }

    public final void LIZIZ(LiveWidget liveWidget, Function0<Unit> function0, Function0<Unit> function02) {
        DataChannel dataChannelProvideDataChannel;
        C954460awe next;
        String str;
        String str2;
        Room room;
        int i;
        DataChannel dataChannel;
        C11JF c11jf;
        MultiMatchPrepareResponse multiMatchPrepareResponse = this.LJI;
        if (multiMatchPrepareResponse == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkMatchPermission");
            sbLIZ.append(", return by response == null");
            C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
            function0.invoke();
            return;
        }
        if (liveWidget != null) {
            dataChannelProvideDataChannel = liveWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannelProvideDataChannel);
        if (roomLJJLIIIIJ != null) {
            roomLJJLIIIIJ.getOwnerUserId();
        }
        ArrayList arrayList = new ArrayList();
        Map<Long, Integer> map = multiMatchPrepareResponse.anchorsPermission;
        if (map != null) {
            for (Map.Entry<Long, Integer> entry : map.entrySet()) {
                if (entry.getValue().intValue() == EnumC308780C8m.NoGiftPermission.getState() || entry.getValue().intValue() == EnumC308780C8m.UnknownType.getState()) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        if (arrayList.size() <= 0) {
            if (multiMatchPrepareResponse.punishedAnchor == 0) {
                function0.invoke();
                return;
            }
            C020W c020w = new C020W(function02, function0, (Function0<Unit>) 21);
            C11JF c11jf2 = this.LIZLLL;
            if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LIZLLL) != null) {
                c11jf.dispose();
            }
            if (liveWidget == null || (dataChannel = liveWidget.dataChannel) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
                room = new Room();
            }
            long j = multiMatchPrepareResponse.punishedAnchor;
            if (j == room.getOwnerUserId()) {
                i = 17;
            } else {
                i = 18;
            }
            C480460Ism.LIZ().getClass();
            this.LIZLLL = (C11JF) ((LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class)).requestViolation(i, room.getId(), j).LJIILIIL(new C0UO0()).LJJZ(new C516701zp(this, liveWidget, c020w, 3), new C516201zk(c020w, 120), new InterfaceC781210Ukh() { // from class: X.0bTy
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                }
            });
            C974490bSx.LJJIFFI(new C974490bSx(), EnumC973450bRH.IN_PUNISHED.getReason(), null, String.valueOf(j), 6);
            return;
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i2 + 1;
            if (i2 >= 0) {
                long jLongValue = ((Number) obj).longValue();
                Iterator<C954460awe> it2 = listLLILZLL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LJ == jLongValue) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C954460awe c954460awe = next;
                if (c954460awe != null) {
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    C754570Tip c754570Tip = c954460awe.LJIJJ;
                    if (c754570Tip != null) {
                        str = c754570Tip.LIZ;
                        str2 = c754570Tip.LIZIZ;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    sb.append(C0KVU.LIZIZ(str, str2));
                    i3++;
                }
                i2 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C766270U4b.LJII(2131843064, sb);
        C974490bSx.LJJIFFI(new C974490bSx(), EnumC973450bRH.NO_GIFT_PERMISSION.getReason(), sb.toString(), null, 10);
        function02.invoke();
    }

    public final void LJI(C974060bSG c974060bSG, long j, AwS594S0100000_15 awS594S0100000_15) {
        LiveWidget liveWidget = c974060bSG.LIZIZ;
        if (liveWidget != null) {
            AwS594S0100000_15 awS594S0100000_152 = new AwS594S0100000_15(awS594S0100000_15, 603);
            LinkDialog linkDialog = new LinkDialog(liveWidget);
            EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TAKE_THE_STAGE_GUIDE;
            C975050bTr c975050bTr = new C975050bTr();
            c975050bTr.LIZIZ = j;
            c975050bTr.LIZJ = awS594S0100000_152;
            linkDialog.LLILZIL = enumC977660bY4;
            linkDialog.LLILZLL = c975050bTr;
            this.LIZ = linkDialog;
            C957750b1x.LIZ(liveWidget.dataChannel, linkDialog, "TAG_CompetitionAnchorLauncher_DIALOG");
        }
    }

    public final void LJIIJ(LiveWidget liveWidget, Function2 function2, Function1 function1) {
        long channelId = C915980Zwa.LJII().getChannelId();
        if (channelId == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestMatchPrepareApi");
            sbLIZ.append(", prepare api error channel id is empty");
            C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
            C974490bSx.LJJIFFI(new C974490bSx(), EnumC973450bRH.PREPARE_CHANNEL_ID_INVALID.getReason(), null, null, 14);
            return;
        }
        if (this.LJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestMatchPrepareApi");
            sbLIZ2.append(", prepare isPreparingProcessing = true");
            C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LJ = true;
        if (C973510bRN.LIZIZ()) {
            C973510bRN.LIZLLL("requestMatchPrepareApi", new C973500bRM(this, function2, function1), false, 4);
            C955650ayZ.LIZJ(false);
            return;
        }
        new C974490bSx().LJIJJLI("prepare_request");
        C974490bSx c974490bSx = new C974490bSx();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).prepareMultiMatchPb(channelId).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(liveWidget))).LIZ(new AfS65S0400000_15(this, c974490bSx, liveWidget, function2, 0), new AfS109S0300000_15(this, c974490bSx, function1, 10));
        C955650ayZ.LIZJ(false);
    }

    public final void LJII(C974060bSG c974060bSG, EnumC919170a1j enumC919170a1j, MultiMatchPrepareResponse multiMatchPrepareResponse, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open choose mode , matchType = ");
        sbLIZ.append(enumC919170a1j);
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIIZZ(this, c974060bSG.LIZIZ, c974060bSG.LIZJ, null, new C974130bSN(c974060bSG, enumC919170a1j, this, list, multiMatchPrepareResponse), new AwS202S0000000_15(0), multiMatchPrepareResponse, enumC919170a1j, c974060bSG.LJIIIIZZ, 4);
    }

    public final void LJIILJJIL(C974060bSG c974060bSG, EnumC919170a1j enumC919170a1j, MultiMatchPrepareResponse multiMatchPrepareResponse, List list) {
        MatchBaseWidget matchBaseWidget;
        C961300b7g.LIZ.getClass();
        if (C961300b7g.LJII("match_combined_inviter_dialog")) {
            C961300b7g.LIZ("match_combined_inviter_dialog");
        }
        LiveWidget liveWidget = c974060bSG.LIZIZ;
        if ((liveWidget instanceof MatchBaseWidget) && (matchBaseWidget = (MatchBaseWidget) liveWidget) != null) {
            ((C977630bY1) matchBaseWidget.y1(C977630bY1.class)).LJJIIJZLJL(enumC919170a1j);
            C961300b7g.LJIIIZ(matchBaseWidget.dataChannel, C978150bYr.LIZ(matchBaseWidget, new C978090bYl(AFwS285S0000000_2.get$arr$(36)), new AwS76S0500000_15(c974060bSG, this, enumC919170a1j, multiMatchPrepareResponse, list, 3), AFwS338S0000000_15.get$arr$(6), AFwS203S0000000_15.get$arr$(196), AFwS203S0000000_15.get$arr$(198), AFwS203S0000000_15.get$arr$(199), new AwS76S0500000_15(c974060bSG, this, enumC919170a1j, multiMatchPrepareResponse, list, 4), false, null, EnumC974980bTk.INVITE, null, false, false, null, 63488));
        }
    }

    public static final void LJIILIIL(C974060bSG c974060bSG, C974990bTl c974990bTl, EnumC919170a1j enumC919170a1j, MultiMatchPrepareResponse multiMatchPrepareResponse, List list) {
        c974990bTl.getClass();
        LIZ(c974060bSG);
        if (!C915980Zwa.LIZIZ().Dn0().isTakeTheStage() && !C915980Zwa.LIZIZ().Dn0().isCatchBean()) {
            if (multiMatchPrepareResponse != null || LiveMatchTakeStageOptExtraSetting.INSTANCE.isEnable()) {
                c974990bTl.LIZIZ(c974060bSG.LIZIZ, new AwS144S0400000_15(c974060bSG, enumC919170a1j, multiMatchPrepareResponse, list, 4), AFwS203S0000000_15.get$arr$(195));
                return;
            }
            return;
        }
        c974990bTl.LJIILJJIL(c974060bSG, EnumC919170a1j.UNKNOWN, multiMatchPrepareResponse, list);
    }

    public final void LJ(C974060bSG c974060bSG, List<C954460awe> list, MultiMatchPrepareResponse multiMatchPrepareResponse, EnumC919170a1j enumC919170a1j, long j, boolean z) {
        EnumC919170a1j enumC919170a1j2;
        if (list.size() == 2 && Intrinsics.LJFF(c974060bSG.LIZJ, "catch_bean_capsule_guide") && c974060bSG.LIZLLL == 7) {
            LIZIZ(c974060bSG.LIZIZ, new AwS259S0300000_15(c974060bSG, (C974060bSG) list, (List<C954460awe>) multiMatchPrepareResponse, (MultiMatchPrepareResponse) 27), AFwS203S0000000_15.get$arr$(188));
            return;
        }
        AbstractC963510bBF abstractC963510bBF = c974060bSG.LJIIIZ;
        if (list.size() >= 2 && abstractC963510bBF != null) {
            LIZIZ(c974060bSG.LIZIZ, new AwS144S0400000_15(c974060bSG, (C974060bSG) list, (List<C954460awe>) abstractC963510bBF, (AbstractC963510bBF) multiMatchPrepareResponse, (MultiMatchPrepareResponse) 3), AFwS203S0000000_15.get$arr$(190));
            return;
        }
        LIZ(c974060bSG);
        EnumC919170a1j enumC919170a1j3 = EnumC919170a1j.UNKNOWN;
        if (enumC919170a1j == enumC919170a1j3 && c974060bSG.LJI != enumC919170a1j3 && Intrinsics.LJFF(c974060bSG.LIZJ, "full_screen") && (enumC919170a1j = c974060bSG.LJI) == (enumC919170a1j2 = EnumC919170a1j.MATCH_TYPE_2V2)) {
            if (list.size() == 3) {
                enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1VN;
            } else {
                enumC919170a1j = enumC919170a1j2;
            }
        }
        LJII(c974060bSG, enumC919170a1j, multiMatchPrepareResponse, list);
        new C974490bSx().LJJIII(SystemClock.uptimeMillis() - j, C915980Zwa.LJI().LJIIJ().LJJIJIIJI(), z);
    }

    public static void LJIIIIZZ(C974990bTl c974990bTl, LiveWidget liveWidget, String str, EnumC962960bAM enumC962960bAM, InterfaceC1631630sYr interfaceC1631630sYr, Function0 function0, MultiMatchPrepareResponse multiMatchPrepareResponse, EnumC919170a1j enumC919170a1j, C979690bbL c979690bbL, int i) {
        boolean z;
        LinkDialog linkDialog;
        C979690bbL c979690bbL2 = c979690bbL;
        EnumC919170a1j enumC919170a1j2 = enumC919170a1j;
        DataChannel dataChannel = null;
        if ((i & 4) != 0) {
            enumC962960bAM = null;
        }
        if ((i & 64) != 0) {
            enumC919170a1j2 = EnumC919170a1j.UNKNOWN;
        }
        if ((i & 128) != 0) {
            c979690bbL2 = null;
        }
        LinkDialog linkDialog2 = c974990bTl.LIZIZ;
        boolean z2 = true;
        if (linkDialog2 != null) {
            EnumC977660bY4 enumC977660bY4 = linkDialog2.LLILZIL;
            if (enumC977660bY4 == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.COMPETITION_MODE_CHOOSE_FRAGMENT && linkDialog2.isVisible()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("present Choose Mode view, selectType = ");
                sbLIZ.append(enumC919170a1j2);
                C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        LinkDialog linkDialog3 = c974990bTl.LIZIZ;
        if (linkDialog3 != null && linkDialog3.isVisible() && (linkDialog = c974990bTl.LIZIZ) != null) {
            linkDialog.dismiss();
        }
        if (enumC919170a1j2 != EnumC919170a1j.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        if (liveWidget == null || liveWidget.dataChannel == null) {
            return;
        }
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", "prepare create competition mode choose dialog");
        C975010bTn c975010bTn = new C975010bTn(c974990bTl, interfaceC1631630sYr);
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(function0, (Function0<Unit>) 574);
        AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(197);
        if (multiMatchPrepareResponse == null) {
            z2 = false;
        }
        LinkDialog linkDialog4 = new LinkDialog(liveWidget);
        EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.COMPETITION_MODE_CHOOSE_FRAGMENT;
        C975200bU6 c975200bU6 = new C975200bU6();
        c975200bU6.LIZIZ = c975010bTn;
        c975200bU6.LIZJ = awS559S0100000_15;
        c975200bU6.LIZLLL = aFwS203S0000000_15;
        c975200bU6.LJ = enumC919170a1j2;
        c975200bU6.LJFF = z;
        c975200bU6.LJI = z2;
        c975200bU6.LJII = c979690bbL2;
        c975200bU6.LJIIIIZZ = str;
        c975200bU6.LJIIIZ = enumC962960bAM;
        linkDialog4.LLILZIL = enumC977660bY42;
        linkDialog4.LLILZLL = c975200bU6;
        c974990bTl.LIZIZ = linkDialog4;
        linkDialog4.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(function0, 13));
        LinkDialog linkDialog5 = c974990bTl.LIZIZ;
        if (linkDialog5 == null) {
            return;
        }
        if (liveWidget != null) {
            dataChannel = liveWidget.dataChannel;
        }
        C957750b1x.LIZ(dataChannel, linkDialog5, "TAG_CompetitionAnchorLauncher_DIALOG");
    }
}
