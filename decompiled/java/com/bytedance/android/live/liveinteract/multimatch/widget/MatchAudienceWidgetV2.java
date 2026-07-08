package com.bytedance.android.live.liveinteract.multimatch.widget;

import X.C03H5;
import X.C0J3L;
import X.C0K04;
import X.C0PEM;
import X.C0QSJ;
import X.C0ZP4;
import X.C1091250eVH;
import X.C1161920gLG;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1300300jwS;
import X.C15438062q;
import X.C158B;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C20441214yg;
import X.C20483515Dd;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C473410IhP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C673150Qan;
import X.C687700QyG;
import X.C736680Sv4;
import X.C914560ZuI;
import X.C915980Zwa;
import X.C917460Zyy;
import X.C918130a03;
import X.C945320ahu;
import X.C950220apo;
import X.C954460awe;
import X.C955010axX;
import X.C956040azC;
import X.C963860bBo;
import X.C969470bKr;
import X.C970290bMB;
import X.C970390bML;
import X.C970400bMM;
import X.C970430bMP;
import X.C970450bMR;
import X.C970480bMU;
import X.C970520bMY;
import X.C970530bMZ;
import X.C970630bMj;
import X.C970650bMl;
import X.C970750bMv;
import X.C970760bMw;
import X.C970840bN4;
import X.C972440bPe;
import X.C973660bRc;
import X.C973890bRz;
import X.C974450bSt;
import X.C974540bT2;
import X.C975500bUa;
import X.C975550bUf;
import X.C975960bVK;
import X.EnumC919170a1j;
import X.EnumC964170bCJ;
import X.EnumC970440bMQ;
import X.EnumC975300bUG;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC915230ZvN;
import X.InterfaceC970770bMx;
import X.InterfaceC973730bRj;
import X.InterfaceC975520bUc;
import Y.ARunnableS48S0300000_15;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.AdjustVideoInteractStreamBottomEvent;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.MatchAudienceWidgetLoaded;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchScope;
import com.bytedance.android.live.room.PadMultiScreenWidthChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.dataChannel.LiveStartEnterRoomTimeStampForMatch;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionLayoutNewEventSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCheckBattleInfoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLowEndOptimizationSettings;
import com.bytedance.android.livesdk.model.linksetting.LinkmicUser;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.linkmic.common.CohostTypeLayoutExtra;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchAudienceWidgetV2 extends MatchBaseWidget implements InterfaceC970770bMx, InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJJJIL = 0;
    public C0J3L LLJI;
    public final C970750bMv LLJIJIL;
    public Room LLJILJIL;
    public final IMultiHostService LLJILJILJ;
    public C975500bUa LLJILLL;
    public EnumC964170bCJ LLJJ;
    public boolean LLJJI;
    public final C970650bMl LLJJIII;
    public final C970480bMU LLJJIJI;
    public C945320ahu LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;

    @Override // X.InterfaceC970770bMx
    public final void J32(CompetitionMessage competitionMessage) {
    }

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

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0f;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MatchScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MatchScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
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

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final boolean z1() {
        return true;
    }

    @Override // X.InterfaceC970770bMx
    public final void zf2(CompetitionInfo competitionInfo) {
    }

    @Override // X.InterfaceC970770bMx
    public final void d1() {
        InterfaceC975520bUc interfaceC975520bUc;
        C975500bUa c975500bUa = this.LLJILLL;
        if (c975500bUa == null || (interfaceC975520bUc = c975500bUa.LJ) == null) {
            return;
        }
        interfaceC975520bUc.d1();
    }

    @Override // X.InterfaceC970770bMx
    public final C969470bKr getViewModel() {
        return (C969470bKr) y1(C969470bKr.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUnload() {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.widget.MatchAudienceWidgetV2.onUnload():void");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0bMl] */
    public MatchAudienceWidgetV2(C0J3L c0j3l) {
        super(null);
        this.LLJI = c0j3l;
        this.LLJIJIL = new C970750bMv(true);
        this.LLJILJILJ = C915980Zwa.LJII();
        this.LLJJ = EnumC964170bCJ.NONE;
        UUID.randomUUID().toString();
        this.LLJJIII = new InterfaceC915230ZvN() { // from class: X.0bMl
            @Override // X.InterfaceC915230ZvN
            public final String scene() {
                return "scene_match_widget";
            }
        };
        this.LLJJIJI = new C970480bMU();
    }

    @Override // X.InterfaceC970770bMx
    public final boolean CB0(BattleInfoResponse battleInfoResponse) {
        C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", "onWindowStateReadyWithBattleInfo");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("battleInfo.map: ");
        sbLIZ.append(battleInfoResponse.leagueInfoMap);
        sbLIZ.append(", ");
        sbLIZ.append(battleInfoResponse.leagueInfoMap.keySet());
        sbLIZ.append(", ");
        sbLIZ.append(battleInfoResponse.leagueScoreInfoMap.keySet());
        C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ));
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        if (!battleInfoResponse.leagueInfoMap.isEmpty()) {
            for (C954460awe c954460awe : listLLILZLL) {
                c954460awe.LJJIII = battleInfoResponse.leagueInfoMap.get(Long.valueOf(c954460awe.LJ));
                if (battleInfoResponse.leagueScoreInfoMap.get(Long.valueOf(c954460awe.LJ)) != null) {
                    c954460awe.LJJIIJ = battleInfoResponse.leagueScoreInfoMap.get(Long.valueOf(c954460awe.LJ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" user");
                sbLIZ2.append(c954460awe.hashCode());
                sbLIZ2.append(" update league info ");
                sbLIZ2.append(c954460awe.LJJIII);
                sbLIZ2.append(", scoreMap");
                sbLIZ2.append(c954460awe.LJJIIJ);
                C20441214yg.LJIIIZ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        C970400bMM c970400bMM = new C970400bMM(new AwS594S0100000_15(this, 965), this, battleInfoResponse);
        C970480bMU c970480bMU = this.LLJJIJI;
        c970480bMU.getClass();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("dispatchMatchRoomEnterEntrance");
        sbLIZ3.append(": Dispatch battle info room enter entrance, params = ");
        sbLIZ3.append(c970400bMM);
        C20441214yg.LIZIZ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ3));
        C970630bMj c970630bMj = (C970630bMj) c970480bMU.LIZ.getValue();
        AwS451S0200000_15 awS451S0200000_15 = new AwS451S0200000_15(c970480bMU, c970400bMM, 13);
        c970630bMj.getClass();
        if (C970760bMw.LIZIZ(battleInfoResponse)) {
            C20441214yg.LIZIZ("MatchBattleInfoIdentifier", "Battle info identify success");
            awS451S0200000_15.invoke(battleInfoResponse, Integer.valueOf(EnumC970440bMQ.BATTLE_INFO_SCENE_ENTER_ROOM.getType()));
            return true;
        }
        C20441214yg.LIZIZ("MatchBattleInfoIdentifier", "Battle info identify failed");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("retryCheckBattleInfo");
        sbLIZ4.append(": Retry request and check battle info");
        C20441214yg.LIZIZ("MatchBattleInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ4));
        C473410IhP.LIZJ(new ARunnableS48S0300000_15(c970630bMj, this, awS451S0200000_15, 8), ((long) LiveMatchAudienceCheckBattleInfoSetting.INSTANCE.getEnterRetryDuration()) * 2000);
        return true;
    }

    public final void H1(String str) {
        if (this.LLJILLL == null) {
            this.LLJILLL = new C975500bUa(this);
        }
        if (!this.LLJJI) {
            C975500bUa c975500bUa = this.LLJILLL;
            if ((c975500bUa instanceof C975500bUa) && c975500bUa != null) {
                c975500bUa.LJIJJ(C500260Jjc.LJJLIIIIJ(this.dataChannel), null);
            }
        }
        this.LLJJI = true;
    }

    @Override // X.InterfaceC970770bMx
    public final void Sa0(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage) {
        long j;
        int iIntValue;
        EnumC970440bMQ enumC970440bMQ;
        BattleSetting battleSettingLJIILIIL;
        C970390bML c970390bML = new C970390bML(new AwS594S0100000_15(this, 964), this, linkMicBattleArmiesMessage);
        C970480bMU c970480bMU = this.LLJJIJI;
        C970450bMR c970450bMR = (C970450bMR) c970480bMU.LIZJ.getValue();
        AwS451S0200000_15 awS451S0200000_15 = new AwS451S0200000_15(c970390bML, c970480bMU, 11);
        c970450bMR.getClass();
        BattleSetting battleSetting = linkMicBattleArmiesMessage.battleSettings;
        long j2 = 0;
        if (battleSetting != null) {
            j = battleSetting.startTimeMs;
        } else {
            j = 0;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf2.LJIILIIL()) != null) {
            j2 = battleSettingLJIILIIL.startTimeMs;
        }
        if (j > j2) {
            Integer num = c970450bMR.LIZ.get(Long.valueOf(linkMicBattleArmiesMessage.battleId));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue < 1) {
                if (linkMicBattleArmiesMessage.triggerReason == EnumC975300bUG.KEEP_ALIVE.getValue()) {
                    enumC970440bMQ = EnumC970440bMQ.BATTLE_INFO_SCENE_HEART_BEAT;
                } else {
                    enumC970440bMQ = EnumC970440bMQ.BATTLE_INFO_SCENE_ARMIES_FALLBACK;
                }
                int type = enumC970440bMQ.getType();
                long j3 = linkMicBattleArmiesMessage.battleId;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestBattleInfo");
                sbLIZ.append(", start request battle/info, scene = ");
                sbLIZ.append(type);
                sbLIZ.append(", battleId = ");
                sbLIZ.append(j3);
                C20441214yg.LIZIZ("MatchArmiesMessageIdentifier", C2188811AlT.LIZIZ(sbLIZ));
                C970760bMw.LIZ(this, j3, type, new AwS381S0200000_15(c970450bMR, awS451S0200000_15, 123), new AwS594S0100000_15(c970450bMR, 888));
                c970450bMR.LIZ.put(Long.valueOf(linkMicBattleArmiesMessage.battleId), 1);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        Room room2;
        int i;
        long j;
        long jLongValue;
        BattleInfoResponse battleInfoResponse;
        int i2;
        Boolean boolValueOf;
        C975550bUf c975550bUf;
        RoomLinkInfo linkMicInfo;
        BattleInfoResponse battleInfoResponse2;
        BattleSetting battleSetting;
        boolean z2;
        ArrayList arrayList;
        int size;
        boolean z3;
        List<C954460awe> list;
        List<C954460awe> list2;
        SeiAppData seiAppData;
        List<SeiRegion> list3;
        LinkmicUser next;
        List<C954460awe> listLJJLI;
        LiveSeiStruct liveSeiStruct;
        RoomLinkInfo linkMicInfo2;
        BattleInfoResponse battleInfoResponse3;
        BattleSetting battleSetting2;
        View viewFindViewById;
        C963860bBo c963860bBo;
        int i3;
        int i4;
        RoomLinkInfo linkMicInfo3;
        BattleInfoResponse battleInfoResponse4;
        BattleSetting battleSetting3;
        attachAndShow();
        super.onLoad(objArr);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postValue(MatchWidgetLoaded, scenario = ");
        sbLIZ.append(this.LLJI.name());
        C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", "postValue(MatchWidgetLoaded, true");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(MatchAudienceWidgetLoaded.class, Boolean.TRUE);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJILJIL = room;
        C915980Zwa.LJI().LJIIL(this.LLJJIII);
        C973890bRz.LJIIIIZZ(0, "create");
        this.LLJILLL = new C975500bUa(this);
        C20483515Dd.LJ(false);
        C970290bMB c970290bMB = C970290bMB.LIZ;
        C158B.LIZ();
        C914560ZuI.LIZ = this;
        C1300300jwS.LIZ.LJ(this.dataChannel);
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, BattleStateChannel.class, new AwS594S0100000_15(this, 966));
        }
        this.LLJJIJIL = 0;
        this.LLJJJ = 0;
        C0J3L c0j3l = this.LLJI;
        C0J3L c0j3l2 = C0J3L.ENTER_ROOM;
        if (c0j3l == c0j3l2) {
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                c963860bBo = (C963860bBo) dataChannel4.gg0(AdjustVideoInteractStreamBottomEvent.class);
            } else {
                c963860bBo = null;
            }
            Room room3 = this.LLJILJIL;
            if (room3 != null && (linkMicInfo3 = room3.getLinkMicInfo()) != null && (battleInfoResponse4 = linkMicInfo3.battleInfo) != null && (battleSetting3 = battleInfoResponse4.setting) != null) {
                i3 = battleSetting3.battleType;
            } else {
                i3 = 0;
            }
            G1(C918130a03.LIZ(Integer.valueOf(i3)), "room_enter");
            if (c963860bBo != null) {
                int i5 = c963860bBo.LIZIZ;
                if (i5 >= 0 && (i4 = c963860bBo.LIZJ) >= 0) {
                    this.LLJJIJIL = i5;
                    this.LLJJJ = i4 - i5;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MatchSeiHeight, Initial bottom event = topMargin = ");
                    sbLIZ2.append(c963860bBo.LIZIZ);
                    sbLIZ2.append(" , bottom = ");
                    sbLIZ2.append(c963860bBo.LIZJ);
                    C20441214yg.LJ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ2));
                    C975500bUa c975500bUa = this.LLJILLL;
                    if (c975500bUa != null) {
                        c975500bUa.LJII(Integer.valueOf(this.LLJJIJIL - ((int) C497740JfY.LIZIZ(23.0f))), Integer.valueOf(this.LLJJJ));
                    }
                }
                F1(c963860bBo, (Float) this.dataChannel.gg0(PadMultiScreenWidthChannel.class));
            }
            DataChannel dataChannel5 = this.dataChannel;
            if (dataChannel5 != null) {
                dataChannel5.BQ2(this, PadMultiScreenWidthChannel.class, new AwS594S0100000_15(this, 967));
            }
            DataChannel dataChannel6 = this.dataChannel;
            if (dataChannel6 != null) {
                dataChannel6.BQ2(this, AdjustVideoInteractStreamBottomEvent.class, new AwS594S0100000_15(this, 968));
            }
        }
        this.LLJIJIL.attachView(this);
        if (InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled && (viewFindViewById = findViewById(R.id.o36)) != null) {
            viewFindViewById.setTag("biz_gameplay_view_p");
        }
        if (this.LLJI == c0j3l2) {
            DataChannel dataChannel7 = this.dataChannel;
            if (dataChannel7 == null || (room2 = (Room) dataChannel7.gg0(RoomChannel.class)) == null) {
                room2 = new Room();
            }
            Room room4 = this.LLJILJIL;
            if (room4 != null && (linkMicInfo2 = room4.getLinkMicInfo()) != null && (battleInfoResponse3 = linkMicInfo2.battleInfo) != null && (battleSetting2 = battleInfoResponse3.setting) != null) {
                i = battleSetting2.battleType;
            } else {
                i = 0;
            }
            G1(C918130a03.LIZ(Integer.valueOf(i)), "room_enter");
            C975500bUa c975500bUa2 = this.LLJILLL;
            if ((c975500bUa2 instanceof C975500bUa) && c975500bUa2 != null) {
                C945320ahu c945320ahu = this.LLJJIJIIJIL;
                Room room5 = this.LLJILJIL;
                C975960bVK c975960bVKLJIIJ = c975500bUa2.LJIIJ(false);
                if (c975960bVKLJIIJ != null) {
                    if (c945320ahu != null && (liveSeiStruct = c945320ahu.LIZ) != null) {
                        seiAppData = liveSeiStruct.LIZ;
                    } else {
                        seiAppData = null;
                    }
                    if (room5 == null) {
                        listLJJLI = C915980Zwa.LJII().LJJLI();
                    } else {
                        List<LinkmicUser> listLJIIIIZZ = C950220apo.LJIIIIZZ(room5);
                        if (seiAppData != null && (list3 = seiAppData.grids) != null && !list3.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            List<SeiRegion> list4 = seiAppData.grids;
                            if (list4 != null) {
                                int size2 = list4.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    for (SeiRegion seiRegion : list4) {
                                        if (i6 == seiRegion.position) {
                                            arrayList2.add(seiRegion);
                                        }
                                    }
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                String str = ((SeiRegion) it2.next()).uidStr;
                                if (str != null) {
                                    Iterator<LinkmicUser> it3 = listLJIIIIZZ.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next = it3.next();
                                            if (Intrinsics.LJFF(str, next.linkMicIdStr)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    LinkmicUser linkmicUser = next;
                                    if (linkmicUser != null) {
                                        new C954460awe(linkmicUser.userId, linkmicUser.roomId);
                                        room5.getLinkMicInfo();
                                        arrayList3.add(new C954460awe(linkmicUser.userId, linkmicUser.roomId));
                                    }
                                }
                            }
                            boolean zIsEmpty = arrayList3.isEmpty();
                            listLJJLI = arrayList3;
                            if (zIsEmpty) {
                                listLJJLI = C915980Zwa.LJII().LJJLI();
                            }
                        } else {
                            listLJJLI = C915980Zwa.LJII().LJJLI();
                        }
                    }
                    c975960bVKLJIIJ.LJJJLL = listLJJLI;
                    z2 = false;
                } else {
                    z2 = false;
                }
                C975960bVK c975960bVKLJIIJ2 = c975500bUa2.LJIIJ(z2);
                if (c975960bVKLJIIJ2 != null && (list2 = c975960bVKLJIIJ2.LJJJLL) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<C954460awe> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(Long.valueOf(it4.next().LJ));
                    }
                } else {
                    arrayList = null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("update list size when enter room = ");
                if (arrayList != null) {
                    size = arrayList.size();
                } else {
                    size = 0;
                }
                sbLIZ3.append(size);
                C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ3));
                C975960bVK c975960bVKLJIIJ3 = c975500bUa2.LJIIJ(false);
                if (c975960bVKLJIIJ3 != null && (list = c975960bVKLJIIJ3.LJJJLL) != null && list.size() >= 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                if (boolValueOf2 != null && !boolValueOf2.booleanValue()) {
                    return;
                }
            }
            Room room6 = this.LLJILJIL;
            if (room6 != null && (linkMicInfo = room6.getLinkMicInfo()) != null && (battleInfoResponse2 = linkMicInfo.battleInfo) != null && (battleSetting = battleInfoResponse2.setting) != null) {
                j = battleSetting.battleId;
            } else {
                j = 0;
            }
            C974450bSt c974450bSt = C973890bRz.LIZ;
            if (C500260Jjc.LJJJI(C973890bRz.LJII(Long.valueOf(j)))) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("this room battle info expired, not correct!!!, ");
                sbLIZ4.append(j);
                sbLIZ4.append(", overedBattleIds = ");
                sbLIZ4.append(C973890bRz.LJIILL);
                C20441214yg.LJ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            RoomLinkInfo linkMicInfo4 = room2.getLinkMicInfo();
            if (linkMicInfo4 != null && (battleInfoResponse = linkMicInfo4.battleInfo) != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("battleInfo.map: ");
                sbLIZ5.append(battleInfoResponse.leagueInfoMap);
                sbLIZ5.append(", ");
                sbLIZ5.append(battleInfoResponse.leagueInfoMap.keySet());
                sbLIZ5.append(", ");
                sbLIZ5.append(battleInfoResponse.leagueScoreInfoMap.keySet());
                C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ5));
                BattleSetting battleSetting4 = battleInfoResponse.setting;
                if (battleSetting4 != null) {
                    i2 = battleSetting4.battleType;
                } else {
                    i2 = 0;
                }
                G1(C918130a03.LIZ(Integer.valueOf(i2)), "room_enter");
                if (this.LLJILLL == null) {
                    HashMap map = new HashMap();
                    map.put("battle_type", Integer.valueOf(i2));
                    map.put(Scene.SCENE_SERVICE, "handleBattleInfo");
                }
                if (this.LLJJI) {
                    C975500bUa c975500bUa3 = this.LLJILLL;
                    if (c975500bUa3 != null) {
                        c975500bUa3.LJIL(battleInfoResponse, EnumC970440bMQ.BATTLE_INFO_SCENE_ENTER_ROOM.getType());
                    }
                } else {
                    C975500bUa c975500bUa4 = this.LLJILLL;
                    if (c975500bUa4 != null) {
                        EnumC970440bMQ enumC970440bMQLIZ = C970430bMP.LIZ(0);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Audience handle battleInfo scene = ");
                        sbLIZ6.append(enumC970440bMQLIZ);
                        C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ6));
                        InterfaceC975520bUc interfaceC975520bUc = c975500bUa4.LJ;
                        if (interfaceC975520bUc != null) {
                            boolValueOf = Boolean.valueOf(interfaceC975520bUc.o3(battleInfoResponse, C970430bMP.LIZ(0)));
                        } else {
                            boolValueOf = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf) && (c975550bUf = c975500bUa4.LJI) != null) {
                            c975550bUf.LJI(new C970840bN4(battleInfoResponse), C970430bMP.LIZ(0));
                        }
                    }
                }
                C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", "onBattleInfoReady");
                List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                if (!battleInfoResponse.leagueInfoMap.isEmpty()) {
                    for (C954460awe c954460awe : listLLILZLL) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("battleInfo.map: ");
                        sbLIZ7.append(battleInfoResponse.leagueInfoMap);
                        sbLIZ7.append(", ");
                        sbLIZ7.append(battleInfoResponse.leagueInfoMap.keySet());
                        sbLIZ7.append(", ");
                        sbLIZ7.append(battleInfoResponse.leagueScoreInfoMap.keySet());
                        C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ7));
                        c954460awe.LJJIII = battleInfoResponse.leagueInfoMap.get(Long.valueOf(c954460awe.LJ));
                        if (battleInfoResponse.leagueScoreInfoMap.get(Long.valueOf(c954460awe.LJ)) != null) {
                            c954460awe.LJJIIJ = battleInfoResponse.leagueScoreInfoMap.get(Long.valueOf(c954460awe.LJ));
                        }
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append(" user");
                        sbLIZ8.append(c954460awe.hashCode());
                        sbLIZ8.append(" update league info ");
                        sbLIZ8.append(c954460awe.LJJIII);
                        sbLIZ8.append(", scoreMap");
                        sbLIZ8.append(c954460awe.LJJIIJ);
                        C20441214yg.LJIIIZ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ8));
                    }
                }
            }
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            JSONObject jSONObject = new JSONObject();
            Long l = (Long) DataChannelGlobal.LLILZ.gg0(LiveStartEnterRoomTimeStampForMatch.class);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            C0K04.LJ("duration", C158B.LIZ() - jLongValue, jSONObject);
            C974540bT2.LLIIZ(c974540bT2, "match_audience_load_duration", jSONObject, null, null, false, null, 60);
        } else if (LiveDirectMatchSetting.INSTANCE.isEnabled() && (this.LLJILLL instanceof C975500bUa)) {
            C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", "matchViewDelegate is LiveMatchManager");
            C975500bUa c975500bUa5 = this.LLJILLL;
            if ((c975500bUa5 instanceof C975500bUa) && c975500bUa5 != null) {
                c975500bUa5.LJIIL();
            }
        }
        C1091250eVH c1091250eVH = (C1091250eVH) findViewById(R.id.maz);
        LiveMatchLowEndOptimizationSettings liveMatchLowEndOptimizationSettings = LiveMatchLowEndOptimizationSettings.INSTANCE;
        if (liveMatchLowEndOptimizationSettings.isEnabled() && liveMatchLowEndOptimizationSettings.isPowerUpRequestLayoutEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (c1091250eVH != null) {
            c1091250eVH.setEnableSizeChange(z);
            c1091250eVH.setEnableFixedSize(z);
        }
    }

    @Override // X.InterfaceC970770bMx
    public final void se(LinkMicBattleMessage linkMicBattleMessage) {
        C955010axX c955010axXI30;
        C956040azC c956040azCLJI;
        CohostTypeLayoutExtra cohostTypeLayoutExtra;
        C970520bMY c970520bMY = new C970520bMY(new AwS381S0200000_15(this, linkMicBattleMessage, 141), this, linkMicBattleMessage);
        C970480bMU c970480bMU = this.LLJJIJI;
        c970480bMU.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchMatchMessageEntrance");
        sbLIZ.append(": Dispatch match open message entrance");
        C20441214yg.LIZIZ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ));
        if (linkMicBattleMessage.action != 4) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dispatchMatchMessageEntrance");
            sbLIZ2.append(": Message is not open message");
            C20441214yg.LJ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (!C950220apo.LJIJI() && (c955010axXI30 = C915980Zwa.LJII().i30()) != null && (c956040azCLJI = c955010axXI30.LJI()) != null && (cohostTypeLayoutExtra = c956040azCLJI.LIZLLL) != null && cohostTypeLayoutExtra.disableMatchComponent) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("dispatchMatchMessageEntrance");
            sbLIZ3.append(": ignore open message in enlarge layout, wait sei to load match component");
            C20441214yg.LJ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        Object value = c970480bMU.LIZIZ.getValue();
        AwS451S0200000_15 awS451S0200000_15 = new AwS451S0200000_15(c970480bMU, (C970480bMU) c970520bMY, (C970520bMY<LinkMicBattleMessage>) 12);
        value.getClass();
        C20441214yg.LIZIZ("MatchOpenMessageIdentifier", "Open message identify success");
        awS451S0200000_15.invoke(Unit.LIZ, Integer.valueOf(EnumC970440bMQ.BATTLE_INFO_SCENE_OPEN_RESULT.getType()));
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void D1(C945320ahu c945320ahu, String str) {
        if (c945320ahu == null) {
            return;
        }
        this.LLJJIJI.LIZ(new C970530bMZ(new AwS594S0100000_15(this, 522), this, c945320ahu, true));
    }

    public final void F1(C963860bBo c963860bBo, Float f) {
        int iLIZIZ;
        if (c963860bBo == null) {
            return;
        }
        boolean z = true;
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).XM(null) != 1) {
            return;
        }
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(3.0f);
        int i = -iLIZIZ2;
        int iLIZIZ3 = ((c963860bBo.LIZLLL + c963860bBo.LJ) + ((int) C497740JfY.LIZIZ(375.0f))) - C497740JfY.LJIIZILJ();
        if (i > iLIZIZ3 || iLIZIZ3 > iLIZIZ2) {
            z = false;
        }
        if (c963860bBo.LIZLLL <= 0 && (c963860bBo.LJ <= 0 || c963860bBo.LJ < C497740JfY.LJIIZILJ())) {
            return;
        }
        float fFloatValue = 0.0f;
        if (z) {
            int i2 = c963860bBo.LIZLLL;
            float f2 = 375;
            if (f != null) {
                fFloatValue = f.floatValue();
            }
            iLIZIZ = i2 + ((int) C497740JfY.LIZIZ((f2 - fFloatValue) / 2));
        } else {
            int i3 = c963860bBo.LIZLLL;
            if (f != null) {
                fFloatValue = f.floatValue() / 2;
            }
            iLIZIZ = i3 - ((int) C497740JfY.LIZIZ(fFloatValue));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeMatchViewWidthForPad adjustMatchWidthAccordingToSei:");
        sbLIZ.append(iLIZIZ);
        sbLIZ.append(", event:");
        sbLIZ.append(c963860bBo);
        C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ));
        C975500bUa c975500bUa = this.LLJILLL;
        if (c975500bUa != null) {
            c975500bUa.LJIIIIZZ(Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ));
        }
    }

    public final void G1(EnumC919170a1j enumC919170a1j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchLauncherMatchArch, matchType: ");
        sbLIZ.append(enumC919170a1j);
        sbLIZ.append(", scene = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ));
        int i = C917460Zyy.LIZ[enumC919170a1j.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            C975500bUa c975500bUa = this.LLJILLL;
            if (c975500bUa != null) {
                c975500bUa.LJIIZILJ();
            }
            this.LLJILLL = null;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dispatchLauncherMatchArch, error, result.resultType=");
            sbLIZ2.append(enumC919170a1j);
            C20441214yg.LJ("MultiMatchAudienceWidgeV2", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            H1(str);
        }
        if (this.LLJILLL == null) {
            C974540bT2.LIZ.LJLLLLLL(-3, null);
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C972440bPe(C973660bRc.LIZ, new int[]{1, 2, 3, 4, 7, 8, 9}, null), 3);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void C1(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        C975500bUa c975500bUa = this.LLJILLL;
        if (c975500bUa != null) {
            c975500bUa.LJIJ(list, list2, customLinkMessage);
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
