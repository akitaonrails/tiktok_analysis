package com.bytedance.android.live.liveinteract.competition.widget;

import X.C03H5;
import X.C0QSJ;
import X.C0ZP4;
import X.C1091250eVH;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C176600m4;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C20441214yg;
import X.C2188811AlT;
import X.C673150Qan;
import X.C687700QyG;
import X.C736680Sv4;
import X.C915500Zvo;
import X.C915980Zwa;
import X.C945320ahu;
import X.C950220apo;
import X.C954460awe;
import X.C955400ayA;
import X.C969470bKr;
import X.C969540bKy;
import X.C970400bMM;
import X.C970480bMU;
import X.C970520bMY;
import X.C970530bMZ;
import X.C970560bMc;
import X.C970750bMv;
import X.C970920bNC;
import X.C973690bRf;
import X.C973910bS1;
import X.C974540bT2;
import X.C976020bVQ;
import X.C981480beE;
import X.C982440bfm;
import X.C982460bfo;
import X.EnumC919170a1j;
import X.EnumC970440bMQ;
import X.EnumC974260bSa;
import X.EnumC982520bfu;
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
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchScope;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLowEndOptimizationSettings;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.NativeAllocatorOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CompetitionAudienceWidget extends MatchBaseWidget implements InterfaceC970770bMx, InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJJ = 0;
    public final C970750bMv LLJI;
    public Room LLJIJIL;
    public C976020bVQ LLJILJIL;
    public C970480bMU LLJILJILJ;
    public final C969540bKy LLJILLL;

    @Override // X.InterfaceC970770bMx
    public final boolean CB0(BattleInfoResponse battleInfoResponse) {
        return false;
    }

    @Override // X.InterfaceC970770bMx
    public final void Sa0(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MatchScope.class});
    }

    @Override // X.InterfaceC970770bMx
    public final void d1() {
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
        return 0;
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

    @Override // X.InterfaceC970770bMx
    public final void se(LinkMicBattleMessage linkMicBattleMessage) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC970770bMx
    public final C969470bKr getViewModel() {
        return (C969470bKr) y1(C969470bKr.class);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        EnumC974260bSa enumC974260bSaJV1 = C915980Zwa.LIZIZ().JV1(false);
        if (enumC974260bSaJV1.compareTo(EnumC974260bSa.NONE) > 0 && enumC974260bSaJV1.compareTo(EnumC974260bSa.FINISH) < 0) {
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
            C955400ayA.LJJJJZ = c981480beEM91 != null ? c981480beEM91.LJIIIZ : 0L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cacheIsCompetitionOpponent, lastCompetitionId = ");
            sbLIZ.append(C955400ayA.LJJJJZ);
            sbLIZ.append(", lastCoHostAnchorId = ");
            sbLIZ.append(C955400ayA.LJJJJLI);
            C20441214yg.LJIIIZ("CoHostAppLog", C2188811AlT.LIZIZ(sbLIZ));
            C973690bRf c973690bRf = C973690bRf.LIZ;
            C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
            c973690bRf.LJIJI(c981480beEM912 != null ? c981480beEM912.LJIIIZ : 0L, this.LLJIJIL);
            C981480beE c981480beEM913 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM913 != null) {
                new C970920bNC().LJJII(c981480beEM913.LJJIJ.LIZIZ(), true);
            }
        }
        this.LLJILJILJ = null;
        DataChannelGlobal.LLILZ.zQ2(this);
        this.LLJI.detachView();
        C976020bVQ c976020bVQ = this.LLJILJIL;
        if (c976020bVQ != null) {
            c976020bVQ.LJI();
        }
        this.LLJILJIL = null;
        if (LiveMatchLowEndOptimizationSettings.INSTANCE.isExtraBufferEnabled()) {
            NativeAllocatorOptimizer.doSetExtraGraphicBuffer(C176600m4.LIZ(), 1);
        }
        this.LL = null;
        super.onUnload();
        C915980Zwa.LJI().LJ(this.LLJILLL);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0bKy] */
    public CompetitionAudienceWidget(View view) {
        super(view);
        this.LLJI = new C970750bMv(false);
        this.LLJILLL = new InterfaceC915230ZvN() { // from class: X.0bKy
            @Override // X.InterfaceC915230ZvN
            public final String scene() {
                return "scene_competition_widget";
            }
        };
    }

    public final void F1(EnumC919170a1j enumC919170a1j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchLauncherBizType, matchType: ");
        sbLIZ.append(enumC919170a1j);
        C20441214yg.LIZIZ("CompetitionAudienceWidget", C2188811AlT.LIZIZ(sbLIZ));
        int i = C915500Zvo.LIZ[enumC919170a1j.ordinal()];
        if (i != 1 && i != 2) {
            C976020bVQ c976020bVQ = this.LLJILJIL;
            if (c976020bVQ != null) {
                c976020bVQ.LJI();
            }
            this.LLJILJIL = null;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dispatchLauncherBizType, error, result.resultType=");
            sbLIZ2.append(enumC919170a1j);
            C20441214yg.LJ("CompetitionAudienceWidget", C2188811AlT.LIZIZ(sbLIZ2));
        } else if (this.LLJILJIL == null) {
            this.LLJILJIL = new C976020bVQ(this);
        }
        if (this.LLJILJIL == null) {
            C974540bT2.LIZ.LJLLLLLL(-101, null);
        }
    }

    @Override // X.InterfaceC970770bMx
    public final void J32(CompetitionMessage competitionMessage) {
        C970520bMY c970520bMY = new C970520bMY(new AwS594S0100000_15(this, 744), this, competitionMessage);
        C970480bMU c970480bMU = this.LLJILJILJ;
        if (c970480bMU != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatchCompetitionMessageEntrance");
            sbLIZ.append(": Dispatch competition start message entrance");
            C20441214yg.LIZIZ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ));
            if (competitionMessage.type != EnumC982520bfu.START.getType()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("dispatchCompetitionMessageEntrance");
                sbLIZ2.append(": Message is not start message");
                C20441214yg.LJ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            Object value = c970480bMU.LJI.getValue();
            AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(c970520bMY, (C970520bMY<CompetitionMessage>) 55);
            value.getClass();
            CompetitionCommon competitionCommon = competitionMessage.bizCommon;
            if (competitionCommon == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("identify");
                sbLIZ3.append(": bizCommon is empty");
                C20441214yg.LJ("CompetitionStartMessageIdentifier", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            if (competitionCommon.channelId != C915980Zwa.LJI().LJIIJ().getChannelId()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("identify");
                sbLIZ4.append(": channelId has changed");
                C20441214yg.LJ("CompetitionStartMessageIdentifier", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            long j = competitionCommon.competitionId;
            if (j == 0) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("identify");
                sbLIZ5.append(": competitionId is empty ");
                C20441214yg.LJ("CompetitionStartMessageIdentifier", C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
            if (C973910bS1.LIZIZ(C950220apo.LIZLLL(), j)) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("identify");
                sbLIZ6.append(": competitionId is expired: ");
                sbLIZ6.append(j);
                C20441214yg.LJ("CompetitionStartMessageIdentifier", C2188811AlT.LIZIZ(sbLIZ6));
                return;
            }
            awS629S0100000_15.invoke(competitionMessage, 0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        Room room2;
        RoomLinkInfo linkMicInfo;
        CompetitionInfo competitionInfo;
        super.onLoad(objArr);
        C915980Zwa.LJI().LJIIL(this.LLJILLL);
        this.LLJI.attachView(this);
        DataChannel dataChannel = this.dataChannel;
        C1091250eVH c1091250eVH = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJIJIL = room;
        View view = this.LL;
        if (view != null) {
            c1091250eVH = (C1091250eVH) view.findViewById(R.id.may);
        }
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
        this.LLJILJILJ = new C970480bMU();
        if (this.LLJILJIL != null && (room2 = this.LLJIJIL) != null && (linkMicInfo = room2.getLinkMicInfo()) != null && (competitionInfo = linkMicInfo.competitionInfo) != null) {
            C982460bfo c982460bfoLIZLLL = C982440bfm.LIZLLL(competitionInfo);
            C976020bVQ c976020bVQ = this.LLJILJIL;
            if (c976020bVQ != null) {
                EnumC970440bMQ.BATTLE_INFO_SCENE_ENTER_ROOM.getType();
                c976020bVQ.LIZJ(c982460bfoLIZLLL);
            }
        }
    }

    @Override // X.InterfaceC970770bMx
    public final void zf2(CompetitionInfo competitionInfo) {
        C970400bMM c970400bMM = new C970400bMM(new AwS594S0100000_15(this, 743), this, competitionInfo);
        C970480bMU c970480bMU = this.LLJILJILJ;
        if (c970480bMU != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatchCompetitionRoomEnterEntrance");
            sbLIZ.append(": Dispatch competition info room enter entrance");
            C20441214yg.LIZIZ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ));
            if (!C915980Zwa.LIZIZ().JV1(false).isIdle()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("dispatchCompetitionRoomEnterEntrance");
                sbLIZ2.append(": return by status is not idle, status=");
                sbLIZ2.append(C915980Zwa.LIZIZ().JV1(false));
                C20441214yg.LJ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            ((C970560bMc) c970480bMU.LJ.getValue()).LIZ(this, competitionInfo, new AwS629S0100000_15(c970400bMM, (C970400bMM<CompetitionInfo>) 56));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void D1(C945320ahu c945320ahu, String str) {
        if (c945320ahu == null) {
            return;
        }
        C970530bMZ c970530bMZ = new C970530bMZ(new AwS381S0200000_15(this, c945320ahu, 27), this, c945320ahu, false);
        C970480bMU c970480bMU = this.LLJILJILJ;
        if (c970480bMU != null) {
            c970480bMU.LIZ(c970530bMZ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void C1(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        C976020bVQ c976020bVQ = this.LLJILJIL;
        if (c976020bVQ != null) {
            c976020bVQ.LJIIIIZZ(list, list2, customLinkMessage);
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
