package com.bytedance.android.live.liveinteract.multimatch.widget;

import X.AbstractC1136060ffY;
import X.AbstractC963500bBE;
import X.AbstractC963510bBF;
import X.AnonymousClass0031;
import X.C013C;
import X.C09JN;
import X.C0J1N;
import X.C0K04;
import X.C0KVU;
import X.C0QSJ;
import X.C0TW5;
import X.C1087790ePh;
import X.C11JF;
import X.C11RD;
import X.C1300300jwS;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C156000ik;
import X.C1697810uHb;
import X.C1999007sK;
import X.C20441214yg;
import X.C20483515Dd;
import X.C2074808Aw;
import X.C2074908Ax;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.C500260Jjc;
import X.C500400Jjq;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C754570Tip;
import X.C784440Upu;
import X.C786410Ut5;
import X.C914590ZuL;
import X.C915200ZvK;
import X.C915530Zvr;
import X.C915980Zwa;
import X.C918130a03;
import X.C925610aC7;
import X.C930940aKi;
import X.C943850afX;
import X.C946803n0;
import X.C948770anT;
import X.C950360aq2;
import X.C954460awe;
import X.C955540ayO;
import X.C960280b62;
import X.C962520b9e;
import X.C962950bAL;
import X.C970660bMm;
import X.C973580bRU;
import X.C973590bRV;
import X.C973660bRc;
import X.C973890bRz;
import X.C974020bSC;
import X.C974050bSF;
import X.C974060bSG;
import X.C974080bSI;
import X.C974150bSP;
import X.C974160bSQ;
import X.C974180bSS;
import X.C974210bSV;
import X.C974450bSt;
import X.C974500bSy;
import X.C974540bT2;
import X.C974870bTZ;
import X.C974990bTl;
import X.C975230bU9;
import X.C975500bUa;
import X.C975550bUf;
import X.C975600bUk;
import X.C975680bUs;
import X.C976020bVQ;
import X.C976160bVe;
import X.C976340bVw;
import X.C976380bW0;
import X.C977620bY0;
import X.C977630bY1;
import X.C979690bbL;
import X.C986510bmL;
import X.EnumC1102740eno;
import X.EnumC1102750enp;
import X.EnumC1998907sJ;
import X.EnumC919170a1j;
import X.EnumC943760afO;
import X.EnumC962960bAM;
import X.EnumC964170bCJ;
import X.EnumC973450bRH;
import X.EnumC973640bRa;
import X.EnumC974070bSH;
import X.EnumC974510bSz;
import X.EnumC975850bV9;
import X.EnumC976510bWD;
import X.InterfaceC1097170eep;
import X.InterfaceC1103130eoR;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC687730QyJ;
import X.InterfaceC915230ZvN;
import X.InterfaceC919320a1y;
import X.InterfaceC955780aym;
import X.InterfaceC973730bRj;
import X.InterfaceC974170bSR;
import X.InterfaceC974880bTa;
import X.InterfaceC975520bUc;
import X.InterfaceC975870bVB;
import Y.ARunnableS115S0100000_15;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.HostWithGuestsModeChangeEvent;
import com.bytedance.android.live.liveinteract.api.MatchPlaybookCapabilityShowEvent;
import com.bytedance.android.live.liveinteract.api.MultiMatchAnchorWidgetLoadedEvent;
import com.bytedance.android.live.liveinteract.api.MultiMatchAnchorWidgetLoadedValueChannel;
import com.bytedance.android.live.liveinteract.api.MultiMatchAnchorWidgetUnLoadedEvent;
import com.bytedance.android.live.liveinteract.api.event.ShowMatchPanelForQuickMatchEvent;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiate;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import com.bytedance.android.live.liveinteract.matchv2.connection.util.FriendRankQuickMatchInviteInfoChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostPunishPermissionChannel;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchPermissionData;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchResumeEvent;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchScope;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.VirtualTicketCrossRoomIconAttachChannel;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.VirtualTicketCrossRoomIconDetachAllChannel;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.VirtualTicketCrossRoomIconDismissChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkMicIconMutex;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookAutoRunTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchResumeFix;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMultiGuestIconDisappearFix;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviterPanelLynxConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveQuickBattleRegisterUserListChangedMessageInSingleLive;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS155S0101000_15;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS480S0200000_15;
import kotlin.jvm.internal.AwS55S0310000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.jvm.internal.AwS80S1300000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiMatchAnchorWidget extends MatchBaseWidget implements InterfaceC974880bTa, InterfaceC919320a1y, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJJJ = 0;
    public C975500bUa LLJI;
    public C976020bVQ LLJIJIL;
    public final C974870bTZ LLJILJIL;
    public final C973580bRU LLJILJILJ;
    public final C973590bRV LLJILLL;
    public boolean LLJJ;
    public final C974990bTl LLJJI;
    public final C970660bMm LLJJIII;
    public final Object LLJJIJI;
    public C11JF LLJJIJIIJIL;
    public final C974050bSF LLJJIJIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MatchScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0a;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MatchScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MatchScope.class);
        return arrayList;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void F1() {
        C20441214yg.LIZIZ("MultiMatchWidget", "destroy match engine");
        super.onUnload();
        C975500bUa c975500bUa = this.LLJI;
        if (c975500bUa != null) {
            c975500bUa.LJIIZILJ();
        }
        this.LLJI = null;
        this.LLJILJIL.detachView();
        this.LLJJI.LIZLLL();
        C915980Zwa.LJFF().tj2();
        C976160bVe.LIZJ();
        C1300300jwS.LIZ.LJFF();
    }

    public final void G1() {
        C20441214yg.LIZIZ("MultiMatchWidget", "destroyCompetitionEngine");
        C976020bVQ c976020bVQ = this.LLJIJIL;
        if (c976020bVQ != null) {
            c976020bVQ.LJI();
        }
        this.LLJIJIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H1() {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget.H1():void");
    }

    @Override // X.InterfaceC974880bTa
    public final boolean HJ1() {
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLJILJILJ.LLILLJJLI;
        return interfaceC1103130eoR != null && interfaceC1103130eoR.getVisibility() == 0;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void LJ() {
        C20441214yg.LIZIZ("MultiMatchWidget", "onMicRoomStart, refuse or cancel match|take_stage invitation");
        C975500bUa c975500bUa = this.LLJI;
        if (c975500bUa != null) {
            InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
            if (interfaceC975520bUc != null) {
                interfaceC975520bUc.LJ();
            }
            C975680bUs c975680bUs = c975500bUa.LJFF;
            if (c975680bUs != null) {
                c975680bUs.LJ();
            }
        }
        C976020bVQ c976020bVQ = this.LLJIJIL;
        if (c976020bVQ != null) {
            c976020bVQ.LJIIJ();
        }
        this.LLJJI.LIZLLL();
    }

    public final void U1() {
        C11JF c11jf = this.LLJJIJIIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJIIJIL = null;
        C975500bUa c975500bUa = this.LLJI;
        if (c975500bUa != null) {
            c975500bUa.LJIIZILJ();
        }
        this.LLJI = null;
        G1();
        C974450bSt c974450bSt = C973890bRz.LIZ;
        C973890bRz.LJIIIZ = EnumC919170a1j.UNKNOWN;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDetachWidget() {
        C20441214yg.LIZIZ("MultiMatchWidget", "onDetachWidget");
        if (LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            H1();
            G1();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        C20441214yg.LIZIZ("MultiMatchWidget", "onUnload");
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.zQ2(this.LLJJIJI);
        }
        C1087790ePh.LIZJ();
        if (LinkMicPlaybookAutoRunTechSwitchSetting.INSTANCE.isEnable() && (dataChannel2 = this.dataChannel) != null) {
            dataChannel2.zW(MultiMatchAnchorWidgetLoadedValueChannel.class, Boolean.FALSE);
        }
        if (LiveQuickBattleRegisterUserListChangedMessageInSingleLive.INSTANCE.isEnable() && (dataChannel = this.dataChannel) != null) {
            dataChannel.FQ2(MultiMatchAnchorWidgetUnLoadedEvent.class);
        }
        C20483515Dd.LIZLLL(true);
        if (LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            return;
        }
        super.onUnload();
        H1();
        F1();
        G1();
    }

    public final void Q1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiMatchAnchorWidget init, datachannel = ");
        sbLIZ.append(this.dataChannel);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJI = new C975500bUa(this);
        C915980Zwa.LJI().LJIIL(this.LLJJIII);
        this.LLJILJIL.attachView(this);
    }

    public final boolean V1() {
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        boolean z = false;
        boolean zLJIJI = interfaceC975870bVBLJFF != null ? interfaceC975870bVBLJFF.LJIJI() : false;
        List list = (List) ((C0TW5) y1(C977630bY1.class)).LIZJ.getValue();
        int size = list != null ? list.size() : 0;
        boolean zIsEnabled = LiveMatchInviterPanelLynxConfigSetting.INSTANCE.isEnabled();
        if (zIsEnabled && !zLJIJI) {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("friendRankPanelDecision,isLynxEnabled=");
        sbLIZ.append(zIsEnabled);
        sbLIZ.append(",hostCount=");
        sbLIZ.append(size);
        sbLIZ.append(",isInFallback=");
        sbLIZ.append(zLJIJI);
        sbLIZ.append(",useCombinedPanel=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0bMm] */
    public MultiMatchAnchorWidget(View view) {
        super(view);
        this.LLJILJIL = new C974870bTZ();
        C973580bRU c973580bRU = new C973580bRU(this);
        C20441214yg.LIZIZ("MultiMatchWidget", "matchIconBehavior constructor");
        c973580bRU.LLIZ = this;
        this.LLJILJILJ = c973580bRU;
        C973590bRV c973590bRV = new C973590bRV(this);
        C20441214yg.LIZIZ("MultiMatchWidget", "plazaIconBehavior constructor");
        c973590bRV.LLIZ = this;
        this.LLJILLL = c973590bRV;
        this.LLJJI = new C974990bTl();
        this.LLJJIII = new InterfaceC915230ZvN() { // from class: X.0bMm
            @Override // X.InterfaceC915230ZvN
            public final String scene() {
                return "scene_match_widget";
            }
        };
        this.LLJJIJI = new Object();
        this.LLJJIJIL = new C974050bSF(this);
    }

    @Override // X.InterfaceC974880bTa
    public final void H0(C960280b62 c960280b62) {
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            return;
        }
        C975500bUa c975500bUa = this.LLJI;
        if (c975500bUa != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveMatchManager onCancelAutoMatchEvent, scene: ");
            sbLIZ.append(c960280b62.LIZ);
            C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
            if (interfaceC975520bUc != null) {
                interfaceC975520bUc.H0(c960280b62);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onCancelAutoMatchEvent, scene: ");
        sbLIZ2.append(c960280b62.LIZ);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void J1(boolean z) {
        if (this.LLJIJIL != null && !z) {
            C20441214yg.LIZIZ("MultiMatchWidget", "doCreatedTakeTheStageView, reuse old competitionDelegate");
            return;
        }
        C20441214yg.LIZIZ("MultiMatchWidget", "doCreatedTakeTheStageView, create new competitionDelegate");
        U1();
        C976020bVQ c976020bVQ = new C976020bVQ(this);
        this.LLJIJIL = c976020bVQ;
        c976020bVQ.LJIILIIL = this.LLJJIJIL;
    }

    @Override // X.InterfaceC974880bTa
    public final void NO2(int i) {
        C914590ZuL c914590ZuL;
        long id;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMatchGuideClicked, noticeType = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 6) {
            C915980Zwa.LJI().LJIIJ().LJ(EnumC973640bRa.INDIVIDUAL_GUIDE.getValue());
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            c914590ZuL = (C914590ZuL) dataChannel.gg0(CoHostPunishPermissionChannel.class);
        } else {
            c914590ZuL = null;
        }
        if (!C915980Zwa.LJIIIZ().Jf() && !C915980Zwa.LJI().LJIIJ().LIZ() && c914590ZuL != null && c914590ZuL.LIZ) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C925610aC7.LIZ(this.dataChannel, id, null, null, new AwS155S0101000_15(this, i, 2), true, this.context);
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LLFII(EnumC973450bRH.IN_PUNISHED, EnumC974510bSz.CAPSULE, 12);
            return;
        }
        O1(i);
    }

    public final void O1(int i) {
        EnumC973640bRa enumC973640bRa;
        boolean z;
        String str;
        EnumC974070bSH enumC974070bSH;
        C013C c013c = new C013C();
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        C974020bSC c974020bSC = new C974020bSC(this, i, c013c);
        C973660bRc c973660bRc = C973660bRc.LIZ;
        if (i == 6) {
            enumC973640bRa = EnumC973640bRa.INDIVIDUAL_GUIDE;
        } else {
            enumC973640bRa = EnumC973640bRa.PK_GUIDE;
        }
        String value = enumC973640bRa.getValue();
        if (C915980Zwa.LJII().LLILZLL(true).size() > 2) {
            z = true;
        } else {
            z = false;
        }
        if (!C915980Zwa.LJFF().co0()) {
            C915980Zwa.LIZIZ().JV1(false).isPlayingIncludeResult();
        }
        C973660bRc.LIZ.LJL(value, z, C915980Zwa.LJI().LIZ().LJIILLIIL());
        c013c.element = true;
        if (i == 7) {
            str = "catch_bean_capsule_guide";
        } else {
            str = "pk_guide";
        }
        if (i == 7) {
            enumC974070bSH = EnumC974070bSH.MATCH_CREATED_SOURCE_CATCH_BEAN_GUIDE;
        } else {
            enumC974070bSH = EnumC974070bSH.MATCH_CREATED_SOURCE_MATCH_GUIDE;
        }
        P1(enumC974070bSH, enumC919170a1jXB0.getType(), new C974060bSG(this, str, i, true, enumC974070bSH, enumC919170a1jXB0, Integer.valueOf(i), null, null, false, 3584), c974020bSC);
    }

    public final void R1(boolean z) {
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("role_type", "anchor", jSONObject);
        C0K04.LIZLLL(z ? 1 : 0, "show", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(z ? 1 : 0, "show", jSONObject2);
        C0K04.LJFF("role_type", "anchor", jSONObject2);
        C974540bT2.LLII(c974540bT2, "battle_icon_show", jSONObject, jSONObject2, null, 24);
        if (z) {
            if (LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptMatchButton()) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.LC0(LinkMicIconMutex.class, new Runnable() { // from class: X.0ZxX
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MultiMatchAnchorWidget@7009.notifyLinkMicIconMutex$1");
                            try {
                                C20441214yg.LJIIIZ("MultiMatchWidget", "onMatchPermission: LinkMicIconMutex");
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MultiMatchAnchorWidget@7009.notifyLinkMicIconMutex$1");
                        }
                    });
                    return;
                }
                return;
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.LC0(LinkMicIconMutex.class, new ARunnableS115S0100000_15(this, 80));
            return;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.LC0(LinkMicIconMutex.class, new ARunnableS115S0100000_15(this, 81));
        }
        C974540bT2.LLFII(EnumC973450bRH.ANCHOR_NO_COHOST_PERMISSION, null, 14);
    }

    @Override // X.InterfaceC974880bTa
    public final void SR0(C975600bUk c975600bUk) {
        EnumC1998907sJ enumC1998907sJ;
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            return;
        }
        if (C915530Zvr.LIZ[c975600bUk.LIZJ.ordinal()] == 1) {
            C976020bVQ c976020bVQ = this.LLJIJIL;
            if (c976020bVQ != null) {
                c976020bVQ.LJI();
                this.LLJIJIL = null;
            }
            M1(EnumC974070bSH.MATCH_CREATED_SOURCE_SINGLE_ROOM_INVITE, EnumC919170a1j.MATCH_TYPE_1V1, false);
            boolean zLJFF = C2074808Aw.LJFF();
            if (zLJFF && V1()) {
                enumC1998907sJ = EnumC1998907sJ.COMBINED;
            } else {
                enumC1998907sJ = EnumC1998907sJ.TWO_MATCH;
            }
            if (enumC1998907sJ == EnumC1998907sJ.COMBINED) {
                ((C0TW5) y1(C977630bY1.class)).LIZ(this.dataChannel);
                ((C977630bY1) y1(C977630bY1.class)).LJJIIJ(c975600bUk, new AwS55S0310000_15(this, c975600bUk, zLJFF, enumC1998907sJ, 1));
                return;
            } else {
                ((C0TW5) y1(C977620bY0.class)).LIZ(this.dataChannel);
                ((C977620bY0) y1(C977620bY0.class)).LJIL(c975600bUk, new AwS55S0310000_15(this, c975600bUk, zLJFF, enumC1998907sJ, 2));
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LauncherDispatchCallback, error, result.resultType=");
        sbLIZ.append(c975600bUk.LIZJ);
        C20441214yg.LJ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0bS9] */
    @Override // X.InterfaceC974880bTa
    public final void WH0(final AbstractC1136060ffY abstractC1136060ffY) {
        int i;
        Integer numValueOf;
        Integer numValueOf2;
        CompetitionInitiateInfo competitionInitiateInfo;
        int i2;
        int type;
        int type2;
        int type3;
        BattleSetting battleSetting;
        Long lValueOf;
        C20441214yg.LIZIZ("MultiMatchWidget", "onReceiveBattleMessage");
        boolean z = abstractC1136060ffY instanceof LinkMicBattleMessage;
        Integer numValueOf3 = null;
        Long lValueOf2 = null;
        if (z) {
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) abstractC1136060ffY;
            if (linkMicBattleMessage.action == 12) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("intercept punish score update in anchor widget, currentBattleId=");
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf2 != null) {
                    lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(", messageBattleId=");
                sbLIZ.append(linkMicBattleMessage.battleId);
                C20441214yg.LJIIIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
                DataChannel dataChannel = this.dataChannel;
                InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf22 != null) {
                    lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL());
                }
                AnonymousClass0031.LIZ(linkMicBattleMessage, dataChannel, lValueOf2, "anchor_widget");
                return;
            }
        }
        ?? r6 = new InterfaceC974170bSR() { // from class: X.0bS9
            @Override // X.InterfaceC974170bSR
            public final void LIZ(C974140bSO c974140bSO) {
            }

            @Override // X.InterfaceC974170bSR
            public final void LIZIZ(C974100bSK c974100bSK) {
            }

            public final void LIZJ(C974160bSQ c974160bSQ) {
                boolean z2;
                boolean z3;
                C975500bUa c975500bUa;
                C975500bUa c975500bUa2;
                LinkMicBattleMessage linkMicBattleMessage2;
                C975500bUa c975500bUa3;
                boolean z4;
                C976020bVQ c976020bVQ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LauncherDispatchCallback, result.resultType=");
                sbLIZ2.append(c974160bSQ.LIZIZ);
                C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ2));
                AbstractC1136060ffY abstractC1136060ffY2 = abstractC1136060ffY;
                boolean z5 = false;
                if (!(abstractC1136060ffY2 instanceof LinkMicBattleMessage) ? !(!(abstractC1136060ffY2 instanceof CompetitionMessage) || ((CompetitionMessage) abstractC1136060ffY2).type != 1) : ((LinkMicBattleMessage) abstractC1136060ffY2).action == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InterfaceC974370bSl interfaceC974370bSlO20 = C915980Zwa.LIZ().o20();
                if (interfaceC974370bSlO20.LIZJ(c974160bSQ.LIZIZ, C918130a03.LIZ(Integer.valueOf(interfaceC974370bSlO20.LIZIZ())), false, c974160bSQ.LIZJ) && z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("messageResult, forceCreate:");
                sbLIZ3.append(z3);
                sbLIZ3.append(". isInviteMessage:");
                sbLIZ3.append(z2);
                C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ3));
                switch (C917400Zys.LIZ[c974160bSQ.LIZIZ.ordinal()]) {
                    case 1:
                        MultiMatchAnchorWidget multiMatchAnchorWidget = this;
                        C976020bVQ c976020bVQ2 = multiMatchAnchorWidget.LLJIJIL;
                        if (c976020bVQ2 != null) {
                            c976020bVQ2.LJI();
                            multiMatchAnchorWidget.LLJIJIL = null;
                        }
                        if (abstractC1136060ffY instanceof LinkMicBattleMessage) {
                            MultiMatchAnchorWidget multiMatchAnchorWidget2 = this;
                            boolean z6 = multiMatchAnchorWidget2.LLJI instanceof C975500bUa;
                            multiMatchAnchorWidget2.M1(EnumC974070bSH.MATCH_CREATED_SOURCE_RECEIVE_INVITE, EnumC919170a1j.MATCH_TYPE_1V1, z3);
                            if (!z6 && (this.LLJI instanceof C975500bUa)) {
                                z5 = true;
                            }
                            MultiMatchAnchorWidget multiMatchAnchorWidget3 = this;
                            if ((!multiMatchAnchorWidget3.LLJJ || z5 || z3) && (c975500bUa = multiMatchAnchorWidget3.LLJI) != null) {
                                c975500bUa.LJIJJLI((LinkMicBattleMessage) abstractC1136060ffY);
                            }
                        }
                        break;
                    case 2:
                        MultiMatchAnchorWidget multiMatchAnchorWidget4 = this;
                        C976020bVQ c976020bVQ3 = multiMatchAnchorWidget4.LLJIJIL;
                        if (c976020bVQ3 != null) {
                            c976020bVQ3.LJI();
                            multiMatchAnchorWidget4.LLJIJIL = null;
                        }
                        if (abstractC1136060ffY instanceof LinkMicBattleMessage) {
                            MultiMatchAnchorWidget multiMatchAnchorWidget5 = this;
                            boolean z7 = multiMatchAnchorWidget5.LLJI instanceof C975500bUa;
                            multiMatchAnchorWidget5.M1(EnumC974070bSH.MATCH_CREATED_SOURCE_RECEIVE_INVITE, EnumC919170a1j.MATCH_TYPE_2V2, z3);
                            if (!z7 && (this.LLJI instanceof C975500bUa)) {
                                z5 = true;
                            }
                            MultiMatchAnchorWidget multiMatchAnchorWidget6 = this;
                            if ((!multiMatchAnchorWidget6.LLJJ || z5 || z3) && (c975500bUa2 = multiMatchAnchorWidget6.LLJI) != null) {
                                c975500bUa2.LJIJJLI((LinkMicBattleMessage) abstractC1136060ffY);
                            }
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                        MultiMatchAnchorWidget multiMatchAnchorWidget7 = this;
                        C976020bVQ c976020bVQ4 = multiMatchAnchorWidget7.LLJIJIL;
                        if (c976020bVQ4 != null) {
                            c976020bVQ4.LJI();
                            multiMatchAnchorWidget7.LLJIJIL = null;
                        }
                        MultiMatchAnchorWidget multiMatchAnchorWidget8 = this;
                        boolean z8 = multiMatchAnchorWidget8.LLJI instanceof C975500bUa;
                        multiMatchAnchorWidget8.M1(EnumC974070bSH.MATCH_CREATED_SOURCE_RECEIVE_INVITE, c974160bSQ.LIZIZ, z3);
                        if (!z8 && (this.LLJI instanceof C975500bUa)) {
                            z5 = true;
                        }
                        MultiMatchAnchorWidget multiMatchAnchorWidget9 = this;
                        if (!multiMatchAnchorWidget9.LLJJ || z5 || z3) {
                            AbstractC1136060ffY abstractC1136060ffY3 = abstractC1136060ffY;
                            if ((abstractC1136060ffY3 instanceof LinkMicBattleMessage) && (linkMicBattleMessage2 = (LinkMicBattleMessage) abstractC1136060ffY3) != null && (c975500bUa3 = multiMatchAnchorWidget9.LLJI) != null) {
                                c975500bUa3.LJIJJLI(linkMicBattleMessage2);
                                break;
                            }
                        }
                        break;
                    case 5:
                    case 6:
                        MultiMatchAnchorWidget multiMatchAnchorWidget10 = this;
                        if (multiMatchAnchorWidget10.LLJIJIL != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        multiMatchAnchorWidget10.J1(z3);
                        if ((!z4 && this.LLJIJIL != null) || z3) {
                            AbstractC1136060ffY abstractC1136060ffY4 = abstractC1136060ffY;
                            if ((abstractC1136060ffY4 instanceof CompetitionMessage) && abstractC1136060ffY4 != null && (c976020bVQ = this.LLJIJIL) != null) {
                                c976020bVQ.LJIIJJI(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY4));
                                break;
                            }
                        }
                        break;
                    default:
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("LauncherDispatchCallback, error, result.resultType=");
                        sbLIZ4.append(c974160bSQ.LIZIZ);
                        C20441214yg.LJ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ4));
                        break;
                }
            }
        };
        this.LLJJI.getClass();
        if (z) {
            LinkMicBattleMessage linkMicBattleMessage2 = (LinkMicBattleMessage) abstractC1136060ffY;
            if (linkMicBattleMessage2 != null && (battleSetting = linkMicBattleMessage2.battleSetting) != null) {
                i2 = battleSetting.inviteType;
            } else {
                i2 = 0;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dispatchMessageEntrance");
            sbLIZ2.append(", is LinkMicBattleMessage");
            C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ2));
            if (!C974990bTl.LJIIJJI(i2, true)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("dispatchMessageEntrance");
                sbLIZ3.append(", is LinkMicBattleMessage, return by shouldDispatchMessage=false");
                C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            if (linkMicBattleMessage2.action == 1) {
                List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                C915980Zwa.LJII().LJJJJLL(linkMicBattleMessage2.leagueInfoMap);
                BattleSetting battleSetting2 = linkMicBattleMessage2.battleSetting;
                if (battleSetting2 != null) {
                    type3 = battleSetting2.battleType;
                } else {
                    type3 = EnumC919170a1j.UNKNOWN.getType();
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("dispatchMessageEntrance");
                sbLIZ4.append(", action=ACTION_INVITE, listUser.size=");
                sbLIZ4.append(listLLILZLL.size());
                sbLIZ4.append(", matchType=");
                sbLIZ4.append(type3);
                C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ4));
                r6.LIZJ(new C974160bSQ(listLLILZLL, C918130a03.LIZ(Integer.valueOf(type3)), i2));
            }
            if (linkMicBattleMessage2.action == 7) {
                List<C954460awe> listLLILZLL2 = C915980Zwa.LJII().LLILZLL(true);
                BattleSetting battleSetting3 = linkMicBattleMessage2.battleSetting;
                if (battleSetting3 != null) {
                    type2 = battleSetting3.battleType;
                } else {
                    type2 = EnumC919170a1j.UNKNOWN.getType();
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("dispatchMessageEntrance");
                sbLIZ5.append(", action=ACTION_ACCEPT, listUser.size=");
                sbLIZ5.append(listLLILZLL2.size());
                sbLIZ5.append(", matchType=");
                sbLIZ5.append(type2);
                C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ5));
                r6.LIZJ(new C974160bSQ(listLLILZLL2, C918130a03.LIZ(Integer.valueOf(type2)), 0));
            }
            if (linkMicBattleMessage2.action != 4) {
                return;
            }
            BattleSetting battleSetting4 = linkMicBattleMessage2.battleSetting;
            if ((battleSetting4 != null && battleSetting4.inviteType == 4) || C974500bSy.LIZIZ(linkMicBattleMessage2)) {
                List<C954460awe> listLLILZLL3 = C915980Zwa.LJII().LLILZLL(true);
                BattleSetting battleSetting5 = linkMicBattleMessage2.battleSetting;
                if (battleSetting5 != null) {
                    type = battleSetting5.battleType;
                } else {
                    type = EnumC919170a1j.UNKNOWN.getType();
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("dispatchMessageEntrance");
                sbLIZ6.append(", action=ACTION_OPEN, listUser.size=");
                sbLIZ6.append(listLLILZLL3.size());
                sbLIZ6.append(", matchType=");
                sbLIZ6.append(type);
                C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ6));
                r6.LIZJ(new C974160bSQ(listLLILZLL3, C918130a03.LIZ(Integer.valueOf(type)), 0));
                return;
            }
            return;
        }
        if (abstractC1136060ffY instanceof CompetitionMessage) {
            CompetitionMessage competitionMessage = (CompetitionMessage) abstractC1136060ffY;
            CompetitionInitiate competitionInitiate = competitionMessage.initiate;
            if (competitionInitiate != null && (competitionInitiateInfo = competitionInitiate.initiateInfo) != null) {
                i = competitionInitiateInfo.initiateType;
            } else {
                i = 0;
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("dispatchMessageEntrance");
            sbLIZ7.append(", is CompetitionMessage");
            C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ7));
            if (!C974990bTl.LJIIJJI(i, false)) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("dispatchMessageEntrance");
                sbLIZ8.append(", is CompetitionMessage, return by shouldDispatchMessage=false");
                C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ8));
                return;
            }
            if (competitionMessage.type == 1) {
                List<C954460awe> listLLILZLL4 = C915980Zwa.LJII().LLILZLL(true);
                C962950bAL c962950bAL = EnumC962960bAM.Companion;
                CompetitionCommon competitionCommon = competitionMessage.bizCommon;
                if (competitionCommon != null) {
                    numValueOf2 = Integer.valueOf(competitionCommon.type);
                } else {
                    numValueOf2 = null;
                }
                c962950bAL.getClass();
                EnumC919170a1j enumC919170a1jLJFF = C962950bAL.LJFF(C962950bAL.LIZIZ(numValueOf2));
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("dispatchMessageEntrance");
                sbLIZ9.append(", action=INITIATE, listUser.size=");
                sbLIZ9.append(listLLILZLL4.size());
                sbLIZ9.append(", matchType=");
                sbLIZ9.append(enumC919170a1jLJFF);
                C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ9));
                r6.LIZJ(new C974160bSQ(listLLILZLL4, enumC919170a1jLJFF, i));
            }
            if (competitionMessage.type != 2) {
                return;
            }
            List<C954460awe> listLLILZLL5 = C915980Zwa.LJII().LLILZLL(true);
            C962950bAL c962950bAL2 = EnumC962960bAM.Companion;
            CompetitionCommon competitionCommon2 = competitionMessage.bizCommon;
            if (competitionCommon2 != null) {
                numValueOf = Integer.valueOf(competitionCommon2.type);
            } else {
                numValueOf = null;
            }
            c962950bAL2.getClass();
            EnumC919170a1j enumC919170a1jLJFF2 = C962950bAL.LJFF(C962950bAL.LIZIZ(numValueOf));
            CompetitionReply competitionReply = competitionMessage.reply;
            if (competitionReply != null && competitionReply.replyType == 1) {
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("dispatchMessageEntrance");
                sbLIZ10.append(", action=REPLY_ACCEPT, listUser.size=");
                sbLIZ10.append(listLLILZLL5.size());
                sbLIZ10.append(", matchType=");
                sbLIZ10.append(enumC919170a1jLJFF2);
                C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ10));
                r6.LIZJ(new C974160bSQ(listLLILZLL5, enumC919170a1jLJFF2, 0));
                return;
            }
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("dispatchMessageEntrance");
            sbLIZ11.append(", action=REPLY_OTHERS, action=");
            CompetitionReply competitionReply2 = competitionMessage.reply;
            if (competitionReply2 != null) {
                numValueOf3 = Integer.valueOf(competitionReply2.replyType);
            }
            sbLIZ11.append(numValueOf3);
            sbLIZ11.append(" , listUser.size=");
            sbLIZ11.append(listLLILZLL5.size());
            sbLIZ11.append(", matchType=");
            sbLIZ11.append(enumC919170a1jLJFF2);
            C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ11));
            return;
        }
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("dispatchMessageEntrance");
        sbLIZ12.append(", unknow message = ");
        sbLIZ12.append(abstractC1136060ffY);
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ12));
    }

    @Override // X.InterfaceC974880bTa
    public final void X2(C974180bSS c974180bSS) {
        InterfaceC975520bUc interfaceC975520bUc;
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            return;
        }
        C975500bUa c975500bUa = this.LLJI;
        if (c975500bUa != null && (interfaceC975520bUc = c975500bUa.LJ) != null) {
            interfaceC975520bUc.X2(c974180bSS);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAutoMatchEvent, scene: ");
        sbLIZ.append(c974180bSS.LIZ);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC974880bTa
    public final void YN2(C974150bSP c974150bSP) {
        Pair pair;
        long jLongValue;
        Pair pair2;
        long jLongValue2;
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            return;
        }
        if (C915530Zvr.LIZ[c974150bSP.LIZ.ordinal()] == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBattleCancelRequestEvent, event=");
            sbLIZ.append(c974150bSP);
            C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
            Object obj = null;
            if (C2074808Aw.LJFF() && C2074908Ax.LIZ.get().LIZLLL == EnumC1998907sJ.COMBINED) {
                C977630bY1 c977630bY1 = (C977630bY1) y1(C977630bY1.class);
                c977630bY1.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cancel invitation , request = ");
                sbLIZ2.append(c974150bSP);
                C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                long j = c974150bSP.LIZIZ;
                int i = C976340bVw.LIZJ[C974080bSI.LIZ(Integer.valueOf(c974150bSP.LIZLLL.LIZ)).ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        pair2 = new Pair(null, EnumC976510bWD.UNKNOWN);
                    } else {
                        Iterator it2 = ((LinkedHashMap) c977630bY1.LJJIL).entrySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (((Number) ((Map.Entry) next).getValue()).longValue() == j) {
                                obj = next;
                                break;
                            }
                        }
                        Map.Entry entry = (Map.Entry) obj;
                        if (entry != null) {
                            jLongValue2 = ((Number) entry.getKey()).longValue();
                        } else {
                            jLongValue2 = c977630bY1.LJJIJLIJ;
                        }
                        pair2 = new Pair(Long.valueOf(jLongValue2), EnumC976510bWD.CANCEL_FROM_JSB);
                    }
                } else {
                    pair2 = new Pair(Long.valueOf(c977630bY1.LJJIJLIJ), EnumC976510bWD.CANCEL_BUTTON);
                }
                Long l = (Long) pair2.getFirst();
                EnumC976510bWD enumC976510bWD = (EnumC976510bWD) pair2.getSecond();
                if (l == null) {
                    C20441214yg.LJ("CombinedMatchInviterViewModel", "cancelInvitation for targetUid: " + j + ", found null battleId");
                    return;
                }
                C20441214yg.LIZIZ("CombinedMatchInviterViewModel", "cancelInvitation for targetUid: " + j + ", found battleId: " + l);
                c977630bY1.LJJI(l.longValue(), false, enumC976510bWD, Long.valueOf(j), 5, Integer.valueOf(c974150bSP.LIZLLL.LIZ), c974150bSP.LIZJ);
                return;
            }
            C977620bY0 c977620bY0 = (C977620bY0) y1(C977620bY0.class);
            c977620bY0.getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cancel invitation , request = ");
            sbLIZ3.append(c974150bSP);
            C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ3));
            long j2 = c974150bSP.LIZIZ;
            int i2 = C976380bW0.LIZ[C974080bSI.LIZ(Integer.valueOf(c974150bSP.LIZLLL.LIZ)).ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    pair = new Pair(null, EnumC976510bWD.UNKNOWN);
                } else {
                    Iterator it3 = ((LinkedHashMap) c977620bY0.LJJIJ).entrySet().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (((Number) ((Map.Entry) next2).getValue()).longValue() == j2) {
                            obj = next2;
                            break;
                        }
                    }
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (entry2 != null) {
                        jLongValue = ((Number) entry2.getKey()).longValue();
                    } else {
                        jLongValue = c977620bY0.LJJII;
                    }
                    pair = new Pair(Long.valueOf(jLongValue), EnumC976510bWD.CANCEL_FROM_JSB);
                }
            } else {
                pair = new Pair(Long.valueOf(c977620bY0.LJJII), EnumC976510bWD.CANCEL_BUTTON);
            }
            Long l2 = (Long) pair.getFirst();
            EnumC976510bWD enumC976510bWD2 = (EnumC976510bWD) pair.getSecond();
            if (l2 == null) {
                C20441214yg.LJ("TwoMatchInviterViewModel", "cancelInvitation for targetUid: " + j2 + ", found null battleId");
                return;
            }
            C20441214yg.LIZIZ("TwoMatchInviterViewModel", "cancelInvitation for targetUid: " + j2 + ", found battleId: " + l2);
            c977620bY0.LJIJ(l2.longValue(), false, enumC976510bWD2, j2, 5, Integer.valueOf(c974150bSP.LIZLLL.LIZ), c974150bSP.LIZJ);
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("LauncherDispatchCallback, error, result.resultType=");
        sbLIZ4.append(c974150bSP.LIZ);
        C20441214yg.LJ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ4));
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C20441214yg.LIZIZ("MultiMatchWidget", "MultiMatchAnchorWidget onInit,");
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Fragment fragmentLIZ;
        DataChannel dataChannel;
        InterfaceC974880bTa interfaceC974880bTa;
        C975550bUf c975550bUf;
        super.onLoad(objArr);
        C20483515Dd.LJ(true);
        C20441214yg.LIZIZ("MultiMatchWidget", "MultiMatchAnchorWidget onLoad,");
        LiveDirectMatchSetting liveDirectMatchSetting = LiveDirectMatchSetting.INSTANCE;
        if (!liveDirectMatchSetting.isEnabled()) {
            Q1();
        }
        C20441214yg.LIZIZ("MultiMatchWidget", "onLoad");
        C975500bUa c975500bUa = this.LLJI;
        if (c975500bUa != null) {
            MatchBaseWidget matchBaseWidget = c975500bUa.LIZ;
            if (matchBaseWidget.context != null && (c975550bUf = c975500bUa.LJI) != null) {
                c975550bUf.LJ(matchBaseWidget);
            }
        }
        C915980Zwa.LIZ().HG2(new C986510bmL(this.dataChannel, C915980Zwa.LJFF(), C915980Zwa.LIZIZ(), C915980Zwa.LJII()));
        if (liveDirectMatchSetting.isEnabled()) {
            this.LLJILJILJ.LLIZ = this;
            this.LLJILLL.LLIZ = this;
            C975500bUa c975500bUa2 = this.LLJI;
            if (c975500bUa2 != null) {
                c975500bUa2.LJIIL();
            }
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.may);
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) {
            fragmentLIZ = C946803n0.LIZ(getView());
        }
        Boolean bool = null;
        if (fragmentLIZ != null) {
            C723850SaN.LIZ(fragmentLIZ, false, null, new AwS368S0200000_2(fragmentLIZ, this, 137), 3);
        }
        EnumC1102750enp.INTERACTION_PK.load(this.dataChannel, this.LLJILJILJ);
        EnumC1102740eno.load$default(EnumC1102740eno.INTERACTIVE_PLAZA, this.dataChannel, this.LLJILLL, false, 4, null);
        if (LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptMatchButton()) {
            C943850afX.LIZ(this.LLJILJILJ.LLILLJJLI, new ARunnableS115S0100000_15(this, 173), EnumC943760afO.PK, true);
            C943850afX.LIZ(this.LLJILLL.LLILLL, new ARunnableS115S0100000_15(this, 174), EnumC943760afO.PLAZA, true);
        } else {
            this.LLJILJILJ.LIZLLL(8);
            this.LLJILLL.LJIIJJI(8);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.DQ2(VirtualTicketCrossRoomIconAttachChannel.class, this.LLJJIJI, new AwS594S0100000_15(this, 970));
            dataChannel2.CQ2(VirtualTicketCrossRoomIconDetachAllChannel.class, this.LLJJIJI, AFwS250S0000000_15.get$arr$(213));
            dataChannel2.CQ2(VirtualTicketCrossRoomIconDismissChannel.class, this.LLJJIJI, AFwS250S0000000_15.get$arr$(214));
        }
        if (LiveMatchResumeFix.INSTANCE.isEnabled()) {
            C974870bTZ c974870bTZ = this.LLJILJIL;
            DataChannel dataChannel3 = c974870bTZ.dataChannel;
            if (dataChannel3 != null) {
                bool = (Boolean) dataChannel3.gg0(MatchPermissionData.class);
            }
            if (C500260Jjc.LJJJI(bool) && (interfaceC974880bTa = (InterfaceC974880bTa) c974870bTZ.mView) != null) {
                interfaceC974880bTa.ys0(true);
            }
        }
        if (LiveMultiGuestIconDisappearFix.INSTANCE.isEnabled()) {
            R1(C973890bRz.LJFF);
        }
        C973890bRz.LJIIIIZZ(0, "create");
        ((C0J1N) C784440Upu.LIZ().LJ(C974210bSV.class).LIZJ(C11RD.LJ(this))).LIZJ(new C09JN() { // from class: X.0bSU
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                InterfaceC973730bRj interfaceC973730bRjYf2;
                C1C7U.LIZ("MultiMatchAnchorWidget@7009.onLoad$2");
                C974210bSV c974210bSV = (C974210bSV) obj;
                if (!TextUtils.equals(c974210bSV.LIZ, "start_rematch")) {
                    Object obj2 = null;
                    if (TextUtils.equals("start_match", c974210bSV.LIZ)) {
                        if (C915980Zwa.LJII().LLLLJ() == EnumC955820ayq.COHOST_MODE_SCREEN_SHARE) {
                            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853126));
                            C974540bT2 c974540bT2 = C974540bT2.LIZ;
                            C974540bT2.LLFII(EnumC973450bRH.COHOST_MODE_SCREEN_SHARE, EnumC974510bSz.ICON, 12);
                        } else if (!C915980Zwa.LJFF().fA2() && !C915980Zwa.LIZIZ().JV1(false).isInConnectingProcess()) {
                            if (!Intrinsics.LJFF(c974210bSV.LJFF, "playbook_match") && (C915980Zwa.LJFF().co0() || C915980Zwa.LIZIZ().JV1(false).isPlayingIncludeResult())) {
                                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842776));
                            } else if (Intrinsics.LJFF(c974210bSV.LJFF, "playbook_match") || !C915980Zwa.LJFF().mz1()) {
                                C973890bRz.LIZ.LJIIJ = true;
                                C974250bSZ c974250bSZ = c974210bSV.LIZJ;
                                if (c974250bSZ != null) {
                                    long j = c974250bSZ.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("event.startMatchEventModel?.giftId = ");
                                    sbLIZ.append(j);
                                    C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
                                    List listLIZLLL = C973890bRz.LIZLLL();
                                    if (listLIZLLL != null) {
                                        Iterator it2 = listLIZLLL.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            Object next = it2.next();
                                            if (((GiftMode) next).giftId == j) {
                                                obj2 = next;
                                                break;
                                            }
                                        }
                                        GiftMode giftMode = (GiftMode) obj2;
                                        if (giftMode != null && (interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false)) != null) {
                                            GiftModeMeta giftModeMeta = new GiftModeMeta();
                                            giftModeMeta.giftId = j;
                                            giftModeMeta.giftNameKey = giftMode.giftName;
                                            giftModeMeta.giftIconImage = giftMode.giftIconImage;
                                            interfaceC973730bRjYf2.LJLI(giftModeMeta);
                                        }
                                    }
                                }
                                InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                                if (interfaceC975870bVBLJFF != null) {
                                    interfaceC975870bVBLJFF.LIZJ();
                                    for (Map.Entry entry : ((LinkedHashMap) c974210bSV.LJIILLIIL).entrySet()) {
                                        interfaceC975870bVBLJFF.LJIIJJI().put(entry.getKey(), entry.getValue());
                                    }
                                }
                                if (c974210bSV.LJIIJJI) {
                                    InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
                                    if (interfaceC975810bV5LIZLLL != null) {
                                        interfaceC975810bV5LIZLLL.LJIIJJI(c974210bSV.LJIIJ, true);
                                    }
                                    C915980Zwa.LJI().LJI().LJIIJJI(c974210bSV.LJIIJ);
                                }
                                InterfaceC975870bVB interfaceC975870bVBLJFF2 = C915980Zwa.LJI().LJFF();
                                if (interfaceC975870bVBLJFF2 != null) {
                                    interfaceC975870bVBLJFF2.LJI(c974210bSV.LJIIL);
                                }
                                InterfaceC975870bVB interfaceC975870bVBLJFF3 = C915980Zwa.LJI().LJFF();
                                if (interfaceC975870bVBLJFF3 != null) {
                                    interfaceC975870bVBLJFF3.LJII(c974210bSV.LJIIZILJ);
                                }
                                this.LL.S1(c974210bSV.LJFF, new C979690bbL(c974210bSV.LIZIZ, c974210bSV.LJI, c974210bSV.LJII));
                            }
                        } else {
                            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851645));
                        }
                    } else if (TextUtils.equals(c974210bSV.LIZ, "open_entrance")) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onLoad, Open panel entrance to match type ");
                        sbLIZ2.append(c974210bSV.LJIIIIZZ.LIZ);
                        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ2));
                        if (c974210bSV.LJIIIZ) {
                            this.LL.S1(c974210bSV.LJFF, null);
                        } else {
                            AwS480S0200000_15 awS480S0200000_15 = new AwS480S0200000_15(c974210bSV, this.LL, 1);
                            String str = c974210bSV.LJFF;
                            C974230bSX c974230bSX = c974210bSV.LJIIIIZZ;
                            if ((!c974230bSX.LIZIZ || !c974230bSX.LIZ.isOpenEntranceDirectInviteType()) && !c974210bSV.LJIIIIZZ.LJ) {
                                z = false;
                            } else {
                                z = true;
                            }
                            MultiMatchAnchorWidget.T1(this.LL, str, null, awS480S0200000_15, c974210bSV.LJIIIIZZ.LIZ, z, 2);
                        }
                    }
                }
                C1C7U.LIZIZ("MultiMatchAnchorWidget@7009.onLoad$2");
            }
        });
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            C975230bU9.LJII(dataChannel4, this, new AwS629S0100000_15(this, 46));
        }
        if (C948770anT.LJ()) {
            DataChannelGlobal.LLILZ.BQ2(this, this, HostWithGuestsModeChangeEvent.class, new AwS594S0100000_15(this, 525));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.BQ2(this, MatchPlaybookCapabilityShowEvent.class, new AwS594S0100000_15(this, 526));
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.FQ2(MultiMatchAnchorWidgetLoadedEvent.class);
        }
        if (LinkMicPlaybookAutoRunTechSwitchSetting.INSTANCE.isEnable() && (dataChannel = this.dataChannel) != null) {
            dataChannel.zW(MultiMatchAnchorWidgetLoadedValueChannel.class, Boolean.TRUE);
        }
        C1300300jwS.LIZ.LJ(this.dataChannel);
    }

    @Override // X.InterfaceC974880bTa
    public final void tN(AbstractC963500bBE abstractC963500bBE) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleCompetitionAction, ");
        sbLIZ.append(abstractC963500bBE);
        C20441214yg.LJIIIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC963500bBE instanceof AbstractC963510bBF) {
            AbstractC963510bBF abstractC963510bBF = (AbstractC963510bBF) abstractC963500bBE;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initFromCompetitionAction, ");
            sbLIZ2.append(abstractC963510bBF);
            C20441214yg.LJIIIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ2));
            EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(Integer.valueOf(abstractC963510bBF.LIZIZ));
            AwS480S0200000_15 awS480S0200000_15 = new AwS480S0200000_15(this, abstractC963510bBF, 4);
            String strLIZIZ = abstractC963510bBF.LIZIZ();
            EnumC974070bSH enumC974070bSH = EnumC974070bSH.MATCH_CREATED_SOURCE_COMPETITION_PLATFORM_ACTION;
            P1(enumC974070bSH, enumC919170a1jLIZ.getType(), new C974060bSG(this, strLIZIZ, 0, false, enumC974070bSH, enumC919170a1jLIZ, null, null, abstractC963510bBF, false, 2816), awS480S0200000_15);
            return;
        }
        C976020bVQ c976020bVQ = this.LLJIJIL;
        if (c976020bVQ == null) {
            return;
        }
        c976020bVQ.LJIIL(abstractC963500bBE);
    }

    @Override // X.InterfaceC974880bTa
    public final void tT0(ShowMatchPanelForQuickMatchEvent showMatchPanelForQuickMatchEvent) {
        EnumC964170bCJ enumC964170bCJY2;
        ShowMatchPanelForQuickMatchEvent.ShowMatchPanelForQuickMatchUser showMatchPanelForQuickMatchUser = showMatchPanelForQuickMatchEvent.selfTeamUser;
        ShowMatchPanelForQuickMatchEvent.ShowMatchPanelForQuickMatchUser showMatchPanelForQuickMatchUser2 = showMatchPanelForQuickMatchEvent.rivalTeamUser;
        GiftGalleryBadgeInfo giftGalleryBadgeInfo = showMatchPanelForQuickMatchUser.badge;
        GiftGalleryBadgeInfo giftGalleryBadgeInfo2 = showMatchPanelForQuickMatchUser2.badge;
        C954460awe c954460awe = new C954460awe(showMatchPanelForQuickMatchUser.userId, showMatchPanelForQuickMatchUser.roomId);
        String str = showMatchPanelForQuickMatchUser.displayId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = showMatchPanelForQuickMatchUser.nickname;
        ImageModel imageModel = new ImageModel();
        imageModel.setUrls(showMatchPanelForQuickMatchUser.avatarUrls);
        c954460awe.LJIJJ = new C754570Tip(str, str3, imageModel);
        c954460awe.LJJIII = giftGalleryBadgeInfo;
        C954460awe c954460awe2 = new C954460awe(showMatchPanelForQuickMatchUser2.userId, showMatchPanelForQuickMatchUser2.roomId);
        String str4 = showMatchPanelForQuickMatchUser2.displayId;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = showMatchPanelForQuickMatchUser2.nickname;
        ImageModel imageModel2 = new ImageModel();
        imageModel2.setUrls(showMatchPanelForQuickMatchUser2.avatarUrls);
        c954460awe2.LJIJJ = new C754570Tip(str4, str5, imageModel2);
        c954460awe2.LJJIII = giftGalleryBadgeInfo2;
        List listLJIIJJI = C1697810uHb.LJIIJJI(c954460awe, c954460awe2);
        loop0: while (true) {
            AtomicReference<C1999007sK> atomicReference = C2074908Ax.LIZ;
            C1999007sK c1999007sK = atomicReference.get();
            C1999007sK c1999007sKLIZ = C1999007sK.LIZ(c1999007sK, null, false, null, C13LP.LLIIII(listLJIIJJI), null, null, null, 238);
            while (!atomicReference.compareAndSet(c1999007sK, c1999007sKLIZ)) {
                if (atomicReference.get() != c1999007sK) {
                    break;
                }
            }
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(c954460awe);
        List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(c954460awe2);
        loop2: while (true) {
            AtomicReference<C1999007sK> atomicReference2 = C2074908Ax.LIZ;
            C1999007sK c1999007sK2 = atomicReference2.get();
            C1999007sK c1999007sKLIZ2 = C1999007sK.LIZ(c1999007sK2, null, false, null, null, C13LP.LLIIII(listLJIILJJIL), C13LP.LLIIII(listLJIILJJIL2), null, 158);
            while (!atomicReference2.compareAndSet(c1999007sK2, c1999007sKLIZ2)) {
                if (atomicReference2.get() != c1999007sK2) {
                    break;
                }
            }
        }
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        EnumC964170bCJ enumC964170bCJY22 = null;
        if (interfaceC975870bVBLJFF != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIILJJIL2, 10));
            Iterator it2 = listLJIILJJIL2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((C954460awe) it2.next()).LJ));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).longValue() != 0) {
                    arrayList2.add(obj);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ.length() <= 0) {
                strLJJLIIIJ = null;
            }
            interfaceC975870bVBLJFF.LJIIZILJ(strLJJLIIIJ);
        }
        if (giftGalleryBadgeInfo != null && giftGalleryBadgeInfo2 != null) {
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(Long.valueOf(showMatchPanelForQuickMatchEvent.selfTeamUser.userId), giftGalleryBadgeInfo), new Pair(Long.valueOf(showMatchPanelForQuickMatchEvent.rivalTeamUser.userId), giftGalleryBadgeInfo2));
            loop6: while (true) {
                AtomicReference<C1999007sK> atomicReference3 = C2074908Ax.LIZ;
                C1999007sK c1999007sK3 = atomicReference3.get();
                C1999007sK c1999007sKLIZ3 = C1999007sK.LIZ(c1999007sK3, null, false, null, null, null, null, C2097608Jq.LJIIZILJ(mapLJIIIIZZ), 126);
                while (!atomicReference3.compareAndSet(c1999007sK3, c1999007sKLIZ3)) {
                    if (atomicReference3.get() != c1999007sK3) {
                        break;
                    }
                }
            }
        }
        String str6 = showMatchPanelForQuickMatchEvent.enterFrom;
        if (str6 != null) {
            str2 = str6;
        }
        C955540ayO c955540ayOLIZ = C915200ZvK.LIZ(Integer.valueOf(showMatchPanelForQuickMatchEvent.inviteType));
        String strValueOf = String.valueOf(showMatchPanelForQuickMatchEvent.rivalTeamUser.userId);
        String strValueOf2 = String.valueOf(showMatchPanelForQuickMatchEvent.rivalTeamUser.secUserId);
        String strValueOf3 = String.valueOf(showMatchPanelForQuickMatchEvent.rivalTeamUser.roomId);
        ShowMatchPanelForQuickMatchEvent.ShowMatchPanelForQuickMatchUser showMatchPanelForQuickMatchUser3 = showMatchPanelForQuickMatchEvent.rivalTeamUser;
        C0KVU.LIZIZ(showMatchPanelForQuickMatchUser3.displayId, showMatchPanelForQuickMatchUser3.nickname);
        ShowMatchPanelForQuickMatchEvent.ShowMatchPanelForQuickMatchUser showMatchPanelForQuickMatchUser4 = showMatchPanelForQuickMatchEvent.rivalTeamUser;
        List list = showMatchPanelForQuickMatchUser4.avatarUrls;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        C950360aq2 c950360aq2 = new C950360aq2(strValueOf, strValueOf2, strValueOf3, c955540ayOLIZ, list, null, null, false, str2, String.valueOf(showMatchPanelForQuickMatchUser4.channelId), 5, null, null, null, null, new C500400Jjq(5), 123648);
        EnumC974070bSH enumC974070bSH = EnumC974070bSH.MATCH_CREATED_SOURCE_SINGLE_ROOM_INVITE;
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1V1;
        M1(enumC974070bSH, enumC919170a1j, false);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FriendRankQuickMatchInviteInfoChannel.class, c950360aq2);
        }
        if (V1()) {
            if (!a0.LJJJIL(str2)) {
                C915980Zwa.LJI().LJIIJ().LJ(str2);
            }
            C2074808Aw.LJII();
            C977630bY1 c977630bY1 = (C977630bY1) y1(C977630bY1.class);
            c977630bY1.LIZ(this.dataChannel);
            c977630bY1.LJJIIJZLJL(enumC919170a1j);
            C156000ik.LIZ(new AwS80S1300000_15(c977630bY1, this, new AwS664S0100000_15(this, 15), str2, 6));
            return;
        }
        C975500bUa c975500bUa = this.LLJI;
        if (!(c975500bUa instanceof C975500bUa) || c975500bUa == null) {
            return;
        }
        if (!a0.LJJJIL(str2)) {
            C915980Zwa.LJI().LJIIJ().LJ(str2);
        }
        C2074808Aw.LJII();
        InterfaceC975520bUc interfaceC975520bUcLJIIJJI = c975500bUa.LJIIJJI();
        if (interfaceC975520bUcLJIIJJI != null) {
            interfaceC975520bUcLJIIJJI.k3(enumC919170a1j);
        }
        InterfaceC975520bUc interfaceC975520bUcLJIIJJI2 = c975500bUa.LJIIJJI();
        if (interfaceC975520bUcLJIIJJI2 != null) {
            enumC964170bCJY2 = interfaceC975520bUcLJIIJJI2.Y2();
        } else {
            enumC964170bCJY2 = null;
        }
        if (enumC964170bCJY2 == EnumC964170bCJ.NONE) {
            InterfaceC975520bUc interfaceC975520bUcLJIIJJI3 = c975500bUa.LJIIJJI();
            if (interfaceC975520bUcLJIIJJI3 == null) {
                return;
            }
            interfaceC975520bUcLJIIJJI3.r3(EnumC964170bCJ.PREPARING, EnumC975850bV9.INVITER_FROM_FRIEND_RANK, null, null);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startFriendRankQuickMatch ignored, currentStatus=");
        InterfaceC975520bUc interfaceC975520bUcLJIIJJI4 = c975500bUa.LJIIJJI();
        if (interfaceC975520bUcLJIIJJI4 != null) {
            enumC964170bCJY22 = interfaceC975520bUcLJIIJJI4.Y2();
        }
        sbLIZ.append(enumC964170bCJY22);
        C20441214yg.LJIIL("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC974880bTa
    public final void ys0(boolean z) {
        C973890bRz.LJFF = z;
        if (z && C915980Zwa.LJII().LJIL()) {
            EnumC974070bSH enumC974070bSH = EnumC974070bSH.MATCH_CREATED_SOURCE_RESUME;
            C974060bSG c974060bSG = new C974060bSG(this, null, 0, false, enumC974070bSH, C915980Zwa.LJII().LJIJI(), null, null, null, false, 3840);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start ensure match viewCreated ,from resume , clickParams = ");
            sbLIZ.append(c974060bSG);
            C20441214yg.LJ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
            P1(enumC974070bSH, EnumC919170a1j.UNKNOWN.getType(), c974060bSG, null);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.FQ2(MatchResumeEvent.class);
            }
        }
        if (!LiveMultiGuestIconDisappearFix.INSTANCE.isEnabled()) {
            R1(z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void E1(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserLeft, leaveReason=");
        sbLIZ.append(j);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        C975500bUa c975500bUa = this.LLJI;
        if (c975500bUa != null) {
            InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
            if (interfaceC975520bUc != null) {
                interfaceC975520bUc.LJFF(j, str);
            }
            C975680bUs c975680bUs = c975500bUa.LJFF;
            if (c975680bUs != null) {
                c975680bUs.LJFF(j, str);
            }
        }
        C976020bVQ c976020bVQ = this.LLJIJIL;
        if (c976020bVQ != null) {
            c976020bVQ.LJIILJJIL(j, str);
        }
    }

    public final void I1(EnumC974070bSH enumC974070bSH, int i) {
        M1(enumC974070bSH, C918130a03.LIZ(Integer.valueOf(i)), false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchMatchArchCreated, source=");
        sbLIZ.append(enumC974070bSH);
        sbLIZ.append(", matchType=");
        sbLIZ.append(i);
        sbLIZ.append(", newArchValid = ");
        sbLIZ.append(this.LLJJ);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S1(String str, C979690bbL c979690bbL) {
        EnumC919170a1j enumC919170a1jXB0;
        T tLJJIJIIJI;
        InterfaceC975870bVB interfaceC975870bVBLJFF;
        if (!Intrinsics.LJFF(str, "playbook_match") && (interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF()) != null) {
            interfaceC975870bVBLJFF.LJII(false);
        }
        if (C915980Zwa.LJFF().RY(false) != EnumC964170bCJ.NONE) {
            enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        } else {
            enumC919170a1jXB0 = EnumC919170a1j.UNKNOWN;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matchStatus = ");
        sbLIZ.append(C915980Zwa.LJFF().RY(false));
        C20441214yg.LJ("ClickType", C2188811AlT.LIZIZ(sbLIZ));
        boolean zLJFF = Intrinsics.LJFF(str, "match_mode_select_panel");
        C259800zU c259800zU = new C259800zU();
        if (zLJFF) {
            tLJJIJIIJI = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
        } else {
            tLJJIJIIJI = str;
        }
        c259800zU.element = tLJJIJIIJI;
        T1(this, str, c979690bbL, new AwS480S0200000_15(c259800zU, this, zLJFF, 0), enumC919170a1jXB0, false, 16);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void B1(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkMicFinish, finishReason=");
        sbLIZ.append(i);
        sbLIZ.append(", detailedCode=");
        sbLIZ.append(i2);
        sbLIZ.append(", abnormalDisconnectReason=");
        sbLIZ.append(abnormalDisconnectReason);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        C975500bUa c975500bUa = this.LLJI;
        if (c975500bUa != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLinkMicFinish matchEngine null = ");
            if (c975500bUa.LJ == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ2.append(z);
            C20441214yg.LJ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
            if (interfaceC975520bUc != null) {
                interfaceC975520bUc.LJIIIIZZ(i, i2, abnormalDisconnectReason);
            }
            C975680bUs c975680bUs = c975500bUa.LJFF;
            if (c975680bUs != null) {
                c975680bUs.LJIIIIZZ(i, i2, abnormalDisconnectReason);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onLinkMicFinish -->");
            sbLIZ3.append(i);
            C20441214yg.LJ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ3));
            C975680bUs c975680bUs2 = c975500bUa.LJFF;
            if (c975680bUs2 != null) {
                c975680bUs2.LJII(203L);
            }
            InterfaceC975520bUc interfaceC975520bUc2 = c975500bUa.LJ;
            if (interfaceC975520bUc2 != null) {
                interfaceC975520bUc2.LJII(203L);
            }
            C975550bUf c975550bUf = c975500bUa.LJI;
            if (c975550bUf != null) {
                c975550bUf.LIZIZ();
            }
            c975500bUa.LJIIIZ();
        }
        C976020bVQ c976020bVQ = this.LLJIJIL;
        if (c976020bVQ != null) {
            c976020bVQ.LJIIIZ(i, i2, abnormalDisconnectReason);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void C1(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        Integer numValueOf;
        C20441214yg.LIZIZ("pk_interrupt", "onHostsListChanged ");
        C975500bUa c975500bUa = this.LLJI;
        if (c975500bUa != null) {
            c975500bUa.LJIJ(list, list2, customLinkMessage);
        }
        C976020bVQ c976020bVQ = this.LLJIJIL;
        if (c976020bVQ != null) {
            c976020bVQ.LJIIIIZZ(list, list2, customLinkMessage);
        }
        Integer numValueOf2 = Integer.valueOf(list.size());
        if (list2 != null) {
            numValueOf = Integer.valueOf(((ArrayList) list2).size());
        } else {
            numValueOf = null;
        }
        if (!Intrinsics.LJFF(numValueOf2, numValueOf)) {
            this.LLJJI.LIZJ(true);
            LinkDialog linkDialog = this.LLJJI.LIZ;
            if (linkDialog != null) {
                linkDialog.dismiss();
            }
        }
    }

    public final void M1(EnumC974070bSH enumC974070bSH, EnumC919170a1j enumC919170a1j, boolean z) {
        long j;
        if (this.dataChannel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doCreatedNewArchMatchView, dataChannel is ");
            sbLIZ.append(this.dataChannel);
            C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("doCreatedNewArchMatchView, source=");
        sbLIZ2.append(enumC974070bSH);
        sbLIZ2.append(", matchType=");
        sbLIZ2.append(enumC919170a1j);
        sbLIZ2.append(", newArchValid=");
        sbLIZ2.append(this.LLJJ);
        sbLIZ2.append(", forceCreate=");
        sbLIZ2.append(z);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LLJI == null || z) {
            C20441214yg.LIZIZ("MultiMatchWidget", "doCreatedNewArchMatchView, create new matchWidgetDelegate");
            U1();
            this.LLJI = new C975500bUa(this);
        }
        C975500bUa c975500bUa = this.LLJI;
        if ((c975500bUa instanceof C975500bUa) && c975500bUa != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("dispatch matchType = ");
            sbLIZ3.append(enumC919170a1j);
            sbLIZ3.append(" from = ");
            sbLIZ3.append(enumC974070bSH);
            C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ3));
            if (C915980Zwa.LJFF().xB0() == enumC919170a1j) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("dispatchMatchTypeFromEntrance, currentMatchType == matchType, matchType = ");
                sbLIZ4.append(enumC919170a1j);
                C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ4));
            } else {
                InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
                if (interfaceC975520bUc != null) {
                    interfaceC975520bUc.k3(enumC919170a1j);
                }
            }
        }
        C973890bRz.LJIIIZ = enumC919170a1j;
        if (enumC919170a1j == EnumC919170a1j.MATCH_TYPE_1V1) {
            InterfaceC955780aym interfaceC955780aymLJIIJ = C915980Zwa.LJI().LJIIJ();
            if (C915980Zwa.LJII().LLILZLL(true).size() == 2) {
                j = ((C954460awe) ListProtector.get(C915980Zwa.LJII().LLILZLL(true), 1)).LJ;
            } else {
                j = 0;
            }
            interfaceC955780aymLJIIJ.LJJJJZ(j);
        }
        if (!this.LLJJ) {
            C20441214yg.LIZIZ("MultiMatchWidget", "doCreatedNewArchMatchView, onMatchProcessStarted");
            this.LLJJ = true;
            C975500bUa c975500bUa2 = this.LLJI;
            if ((c975500bUa2 instanceof C975500bUa) && c975500bUa2 != null) {
                c975500bUa2.LJIJJ(C500260Jjc.LJJLIIIIJ(this.dataChannel), enumC974070bSH);
            }
            C975500bUa c975500bUa3 = this.LLJI;
            if ((c975500bUa3 instanceof C975500bUa) && c975500bUa3 != null) {
                c975500bUa3.LJIIIIZZ = this.LLJJIJIL;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P1(final X.EnumC974070bSH r13, int r14, final X.C974060bSG r15, final X.InterfaceC1631620sYq r16) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget.P1(X.0bSH, int, X.0bSG, X.0sYq):boolean");
    }

    public static void T1(MultiMatchAnchorWidget multiMatchAnchorWidget, String str, C979690bbL c979690bbL, InterfaceC1631620sYq interfaceC1631620sYq, EnumC919170a1j enumC919170a1j, boolean z, int i) {
        EnumC974070bSH enumC974070bSH;
        String str2;
        boolean z2;
        boolean z3 = z;
        C979690bbL c979690bbL2 = c979690bbL;
        if ((i & 2) != 0) {
            c979690bbL2 = null;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        multiMatchAnchorWidget.getClass();
        if (C915980Zwa.LJII().LLILZLL(true).size() == 2) {
            C973660bRc.LJJZ = "match_invite";
        } else if (C915980Zwa.LJII().LLILZLL(true).size() == 4) {
            C973660bRc.LJJZ = "team_cohost";
        }
        if (Intrinsics.LJFF(str, "match_mode_select_panel")) {
            enumC974070bSH = EnumC974070bSH.MATCH_CREATE_SOURCE_MODE_SELECT;
        } else {
            enumC974070bSH = EnumC974070bSH.MATCH_CREATED_SOURCE_ICON_CLICK;
        }
        C973660bRc c973660bRc = C973660bRc.LIZ;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (C915980Zwa.LJII().LLILZLL(true).size() > 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C915980Zwa.LJFF().co0()) {
            C915980Zwa.LIZIZ().JV1(false).isPlayingIncludeResult();
        }
        C973660bRc.LIZ.LJL(str2, z2, C915980Zwa.LJI().LIZ().LJIILLIIL());
        DataChannel dataChannel = multiMatchAnchorWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C962520b9e.class, c979690bbL2);
        }
        multiMatchAnchorWidget.P1(enumC974070bSH, enumC919170a1j.getType(), new C974060bSG(multiMatchAnchorWidget, str, 0, false, enumC974070bSH, enumC919170a1j, null, c979690bbL2, null, z3, 1280), interfaceC1631620sYq);
    }
}
