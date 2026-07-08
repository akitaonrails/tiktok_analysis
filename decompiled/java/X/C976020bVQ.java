package X;

import Y.ARunnableS115S0100000_15;
import Y.ARunnableS84S0200000_15;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.event.TakeTheStageGiftPanelChannel;
import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.TakeTheStageBizExtra;
import com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent;
import com.bytedance.android.live.liveinteract.competition.game.playing.CatchBeansPlayingCoordinatorAnchor;
import com.bytedance.android.live.liveinteract.competition.takestage.event.TakeStageSwitchTurnEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleCohostJoiningEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageAtmosphereAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageDurationListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageV2FixEndTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLynxConfigSetting;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS155S0110000_15;
import kotlin.jvm.internal.AwS249S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS55S0310000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bVQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976020bVQ implements InterfaceC978010bYd {
    public final MatchBaseWidget LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public DataChannel LIZJ;
    public final boolean LIZLLL;
    public final C976200bVi LJ;
    public C974710bTJ LJFF;
    public final C976610bWN LJI;
    public final C976830bWj LJII;
    public final C975550bUf LJIIIIZZ;
    public C981580beO LJIIIZ;
    public C981480beE LJIIJ;
    public InterfaceC976620bWO LJIIJJI;
    public C976640bWQ LJIIL;
    public C974050bSF LJIILIIL;
    public final C976630bWP LJIILJJIL;

    public final void LJI() {
        InterfaceC954180awC interfaceC954180awCLJIIIZ;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", "CompetitionAnchorAudienceManager_onDestroy");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detachInternal, source=");
        sbLIZ.append("onDestroy");
        C20441214yg.LJ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
        long type = Intrinsics.LJFF("onDestroy", "onBizTypeChange") ? C00BH.TERMINAL_BIZ_TYPE_CHANGE.getType() : 205L;
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO != null) {
            interfaceC976620bWO.LJII(type);
        }
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ != null) {
            c976640bWQ.LJII(type);
        }
        InterfaceC976620bWO interfaceC976620bWO2 = this.LJIIJJI;
        if (interfaceC976620bWO2 != null) {
            interfaceC976620bWO2.LJIILL(EnumC974260bSa.NONE, EnumC975850bV9.MATCH_MANAGER_UNLOAD, null, null);
        }
        if (this.LIZLLL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("destroyTerminate, SOURCE = ");
            sbLIZ2.append("onDestroy");
            C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ2));
            DataChannel dataChannel = this.LIZJ;
            if (!C176600m4.LIZIZ(dataChannel != null ? (Boolean) dataChannel.gg0(C753790ThZ.class) : null) && (interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ()) != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL.LJLLLLLL(0.0f, 0, true);
            }
            DataChannel dataChannel2 = this.LIZJ;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C753790ThZ.class, Boolean.FALSE);
            }
        }
        DataChannel dataChannel3 = this.LIZJ;
        if (dataChannel3 != null) {
            dataChannel3.zQ2(this);
        }
        this.LJ.LIZIZ();
        C975550bUf c975550bUf = this.LJIIIIZZ;
        if (c975550bUf != null) {
            c975550bUf.LIZIZ();
        }
        C974710bTJ c974710bTJ = this.LJFF;
        if (c974710bTJ != null) {
            c974710bTJ.LIZIZ();
        }
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIIIZ = null;
        this.LJFF = null;
        this.LIZJ = null;
        this.LJIIJ.LIZIZ(EnumC975850bV9.END_ALL_RESET.getSource());
        this.LIZIZ.removeCallbacksAndMessages(null);
        C982320bfa.LIZJ("detach");
        C982320bfa.LIZ = null;
        C982310bfZ.LIZ("detach");
        C982310bfZ.LIZ = null;
        C915980Zwa.LIZIZ().LJI();
    }

    public final void LJIIJ() {
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ != null) {
            c976640bWQ.LJ();
        }
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO != null) {
            interfaceC976620bWO.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0bWN] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0bWj] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0beO] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0bWP] */
    public C976020bVQ(MatchBaseWidget matchBaseWidget) {
        boolean zLJIIZILJ;
        this.LIZ = matchBaseWidget;
        DataChannel dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        this.LIZJ = dataChannelProvideDataChannel;
        if (dataChannelProvideDataChannel != null) {
            zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannelProvideDataChannel);
        } else {
            zLJIIZILJ = false;
        }
        this.LIZLLL = zLJIIZILJ;
        this.LJ = new C976200bVi();
        this.LJIIJ = new C981480beE(EnumC975850bV9.INITIALIZE, zLJIIZILJ, C500260Jjc.LJJLIIIIJ(matchBaseWidget.provideDataChannel()));
        ?? r7 = new InterfaceC976860bWm() { // from class: X.0bWP
            @Override // X.InterfaceC976860bWm
            public final void LIZJ() {
                this.LIZ.LJFF(C973660bRc.LJJJJJL);
            }

            @Override // X.InterfaceC976860bWm
            public final MatchBaseWidget LIZIZ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getOwnerWidget, widget = ");
                sbLIZ.append(this.LIZ.LIZ);
                C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
                return this.LIZ.LIZ;
            }

            @Override // X.InterfaceC976860bWm
            public final void LIZ(EnumC962960bAM enumC962960bAM, String str) {
                C974050bSF c974050bSF = this.LIZ.LJIILIIL;
                if (c974050bSF != null) {
                    c974050bSF.LIZ(enumC962960bAM, str);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:56:0x01d7  */
            /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object] */
            @Override // X.InterfaceC976860bWm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(X.InterfaceC976620bWO r26, X.EnumC974260bSa r27) {
                /*
                    Method dump skipped, instruction units count: 904
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C976630bWP.LIZLLL(X.0bWO, X.0bSa):void");
            }

            @Override // X.InterfaceC976860bWm
            public final void LJ(InterfaceC976620bWO interfaceC976620bWO, EnumC962960bAM enumC962960bAM) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("engineDidSetBizType, bizType=");
                sbLIZ.append(enumC962960bAM);
                sbLIZ.append(", engine=");
                sbLIZ.append(interfaceC976620bWO.hashCode());
                sbLIZ.append(", engine.isRematch=");
                sbLIZ.append(interfaceC976620bWO.d3());
                C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
                if (!interfaceC976620bWO.d3()) {
                    EnumC962960bAM.Companion.getClass();
                    EnumC919170a1j enumC919170a1jLJFF = C962950bAL.LJFF(enumC962960bAM);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Register components for matchType: ");
                    sbLIZ2.append(enumC919170a1jLJFF);
                    C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ2));
                    C975550bUf c975550bUf = this.LIZ.LJIIIIZZ;
                    if (c975550bUf != null) {
                        c975550bUf.LIZIZ();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (LiveMatchLynxConfigSetting.INSTANCE.isLynxEnabledInCompetition()) {
                        arrayList.add(new C976750bWb());
                    }
                    View viewFindViewById = null;
                    if (enumC919170a1jLJFF.isTakeTheStage()) {
                        C976020bVQ c976020bVQ = this.LIZ;
                        final List<C954460awe> list = c976020bVQ.LJIIJ.LJII;
                        View view = c976020bVQ.LIZ.LL;
                        if (view != null) {
                            viewFindViewById = view.findViewById(R.id.mgd);
                        }
                        C962250b9D.LJIIIIZZ(viewFindViewById);
                        C976020bVQ c976020bVQ2 = this.LIZ;
                        final C982830bgP c982830bgP = new C982830bgP(c976020bVQ2.LIZLLL, c976020bVQ2.LIZJ, new AwS559S0100000_15(c976020bVQ2, 1202), list);
                        arrayList.add(new InterfaceC975560bUg(c982830bgP) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list2, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c982830bgP;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("onIMMessage, message = ");
                                sbLIZ3.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ3));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("onStartUIChange, model = ");
                                    sbLIZ3.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ3));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list2, list3, list4, list5);
                            }
                        });
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("registerComponents, competitionModel=");
                        sbLIZ3.append(this.LIZ.LJIIJ);
                        sbLIZ3.append(", linkedHostListSortByUid=");
                        sbLIZ3.append(list);
                        C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ3));
                        C976020bVQ c976020bVQ3 = this.LIZ;
                        final C982260bfU c982260bfU = new C982260bfU(c976020bVQ3.LIZLLL, c976020bVQ3.LIZJ, new AwS559S0100000_15(c976020bVQ3, 1193), list, new AwS559S0100000_15(this.LIZ, 1194));
                        arrayList.add(new InterfaceC975560bUg(c982260bfU) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list2, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c982260bfU;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list2, list3, list4, list5);
                            }
                        });
                        C976020bVQ c976020bVQ4 = this.LIZ;
                        final C982720bgE c982720bgE = new C982720bgE(c976020bVQ4.LIZLLL, c976020bVQ4.LIZJ, new AwS559S0100000_15(c976020bVQ4, 1195), list);
                        arrayList.add(new InterfaceC975560bUg(c982720bgE) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list2, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c982720bgE;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list2, list3, list4, list5);
                            }
                        });
                        C976020bVQ c976020bVQ5 = this.LIZ;
                        final C984910bjl c984910bjl = new C984910bjl(c976020bVQ5.LIZLLL, c976020bVQ5.LIZJ, new AwS559S0100000_15(c976020bVQ5, 1203), list, this.LIZ.LJI);
                        C976020bVQ c976020bVQ6 = this.LIZ;
                        final C985370bkV c985370bkV = new C985370bkV(c976020bVQ6.LIZLLL, c976020bVQ6.LIZJ, new AwS559S0100000_15(c976020bVQ6, 1196), list, new AwS559S0100000_15(c984910bjl, 1197));
                        arrayList.add(new InterfaceC975560bUg(c985370bkV) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list2, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c985370bkV;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list2, list3, list4, list5);
                            }
                        });
                        C976020bVQ c976020bVQ7 = this.LIZ;
                        final C982280bfW c982280bfW = new C982280bfW(c976020bVQ7.LIZLLL, c976020bVQ7.LIZJ, new AwS559S0100000_15(c976020bVQ7, 1198), list);
                        arrayList.add(new InterfaceC975560bUg(c982280bfW) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list2, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c982280bfW;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list2, list3, list4, list5);
                            }
                        });
                        arrayList.add(new InterfaceC975560bUg(c984910bjl) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list2, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c984910bjl;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list2, list3, list4, list5);
                            }
                        });
                        C976020bVQ c976020bVQ8 = this.LIZ;
                        final boolean z = c976020bVQ8.LIZLLL;
                        final DataChannel dataChannel = c976020bVQ8.LIZJ;
                        final InterfaceC977410bXf interfaceC977410bXf = new InterfaceC977410bXf(dataChannel, z) { // from class: X.0bZb
                            public final boolean LL;
                            public final DataChannel LLILLJJLI;
                            public long LLILLL;
                            public boolean LLILZ;

                            @Override // X.InterfaceC977410bXf
                            public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                            }

                            @Override // X.InterfaceC977430bXh
                            public final void onUnload() {
                            }

                            @Override // X.InterfaceC977410bXf
                            public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
                                if (!(abstractC982800bgM instanceof C982570bfz)) {
                                    return;
                                }
                                LJI(((C982570bfz) abstractC982800bgM).LJFF);
                            }

                            @Override // X.InterfaceC977430bXh
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                C981500beG c981500beG;
                                boolean zLJ = false;
                                C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
                                if (c981480beEM91 != null && (c981500beG = c981480beEM91.LJJIJIIJI) != null) {
                                    zLJ = c981500beG.LJ();
                                }
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("onLoad. Was V3 style:");
                                sbLIZ4.append(this.LLILZ);
                                sbLIZ4.append(". Is V3 style:");
                                sbLIZ4.append(zLJ);
                                C20441214yg.LIZIZ("TakeTheStageGiftPanelComponent", C2188811AlT.LIZIZ(sbLIZ4));
                                this.LLILZ = zLJ;
                                DataChannel dataChannel2 = this.LLILLJJLI;
                                if (dataChannel2 != null) {
                                    dataChannel2.zW(TakeTheStageGiftPanelChannel.class, new C986650bmZ(0L, 0L, zLJ));
                                }
                            }

                            public final void LJI(List<C982390bfh> list2) {
                                C982390bfh next;
                                long j;
                                long j2;
                                if (this.LL) {
                                    return;
                                }
                                Iterator<C982390bfh> it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (next.LIZ == this.LLILLL) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                C982390bfh c982390bfh = next;
                                if (c982390bfh == null) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("Failed to find self team (id: ");
                                    sbLIZ4.append(this.LLILLL);
                                    sbLIZ4.append(") in teamScores list");
                                    C20441214yg.LJ("TakeTheStageGiftPanelComponent", C2188811AlT.LIZIZ(sbLIZ4));
                                    j = 0;
                                    j2 = 0;
                                } else {
                                    j = c982390bfh.LIZJ;
                                    j2 = c982390bfh.LIZIZ;
                                }
                                DataChannel dataChannel2 = this.LLILLJJLI;
                                if (dataChannel2 != null) {
                                    dataChannel2.zW(TakeTheStageGiftPanelChannel.class, new C986650bmZ(j, j2, this.LLILZ));
                                }
                            }

                            @Override // X.InterfaceC977410bXf
                            public final void LJIIIZ(C982460bfo c982460bfo) {
                                LJI(c982460bfo.LJII);
                            }

                            {
                                this.LL = z;
                                this.LLILLJJLI = dataChannel;
                            }

                            @Override // X.InterfaceC977410bXf
                            public final void LJ(EnumC974260bSa enumC974260bSa, C981480beE c981480beE) {
                                if (c981480beE != null) {
                                    this.LLILLL = c981480beE.LJIILIIL;
                                    boolean zLJ = c981480beE.LJJIJIIJI.LJ();
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("onStatusChange. curStatus=");
                                    sbLIZ4.append(enumC974260bSa);
                                    sbLIZ4.append(". Was V3:");
                                    sbLIZ4.append(this.LLILZ);
                                    sbLIZ4.append(". Is V3:");
                                    sbLIZ4.append(zLJ);
                                    C20441214yg.LIZIZ("TakeTheStageGiftPanelComponent", C2188811AlT.LIZIZ(sbLIZ4));
                                    this.LLILZ = zLJ;
                                    LJI(c981480beE.LJIILJJIL);
                                }
                            }
                        };
                        arrayList.add(new InterfaceC975560bUg(interfaceC977410bXf) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list2, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = interfaceC977410bXf;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list2, list3, list4, list5);
                            }
                        });
                        if (this.LIZ.LIZLLL) {
                            C976020bVQ c976020bVQ9 = this.LIZ;
                            final DataChannel dataChannel2 = c976020bVQ9.LIZJ;
                            final AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(c976020bVQ9, 1199);
                            final AbstractC982270bfV abstractC982270bfV = new AbstractC982270bfV(dataChannel2, awS559S0100000_15, list) { // from class: X.0bWU
                                @Override // X.AbstractC982270bfV
                                public final String LJIIL() {
                                    return "TakeTheStageEventTrackingComponent";
                                }

                                @Override // X.AbstractC982270bfV
                                public final void LJIIJ() {
                                    C974430bSr c974430bSr;
                                    super.LJIIJ();
                                    C981480beE c981480beE = this.LLILZIL;
                                    if (c981480beE == null || (c974430bSr = c981480beE.LJJIJIIJIL) == null) {
                                        return;
                                    }
                                    c974430bSr.LIZ(0L);
                                }

                                @Override // X.AbstractC982270bfV
                                public final void LJIILL(boolean z2) {
                                    C974430bSr c974430bSr;
                                    super.LJIILL(z2);
                                    C981480beE c981480beE = this.LLILZIL;
                                    if (c981480beE != null && (c974430bSr = c981480beE.LJJIJIIJIL) != null) {
                                        c974430bSr.LIZ(0L);
                                    }
                                }

                                @Override // X.AbstractC982270bfV, X.InterfaceC977410bXf
                                public final void LJ(EnumC974260bSa enumC974260bSa, C981480beE c981480beE) {
                                    EnumC973680bRe enumC973680bRe;
                                    C981550beL c981550beL;
                                    C981550beL c981550beL2;
                                    C974430bSr c974430bSr;
                                    super.LJ(enumC974260bSa, c981480beE);
                                    EnumC974260bSa enumC974260bSa2 = EnumC974260bSa.NONE;
                                    if (enumC974260bSa.compareTo(enumC974260bSa2) > 0 && enumC974260bSa.compareTo(EnumC974260bSa.START) <= 0) {
                                        C981480beE c981480beE2 = this.LLILZIL;
                                        if (c981480beE2 != null && (c974430bSr = c981480beE2.LJJIJIIJIL) != null) {
                                            c974430bSr.LIZ(0L);
                                        }
                                        C973920bS2.LIZLLL = 0;
                                        C973920bS2.LJ = 0L;
                                        ((LinkedHashMap) C973920bS2.LJFF).clear();
                                    }
                                    if (enumC974260bSa.compareTo(enumC974260bSa2) > 0 && enumC974260bSa.compareTo(EnumC974260bSa.PUNISH) < 0) {
                                        C973920bS2.LJI = 0L;
                                    }
                                    EnumC973680bRe enumC973680bRe2 = null;
                                    if (c981480beE != null && (c981550beL2 = c981480beE.LJJIJ) != null) {
                                        enumC973680bRe = c981550beL2.LJIIIZ;
                                    } else {
                                        enumC973680bRe = null;
                                    }
                                    if (enumC974260bSa.compareTo(EnumC974260bSa.PUNISH) >= 0) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("tryReportPKEndEvent status:");
                                        sbLIZ4.append(enumC974260bSa);
                                        sbLIZ4.append(" finishType:");
                                        sbLIZ4.append(enumC973680bRe);
                                        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ4));
                                        if (enumC974260bSa.compareTo(EnumC974260bSa.FINISH) < 0) {
                                            C973690bRf.LJJIJIIJI(EnumC973680bRe.TIME_OUT);
                                        } else if (enumC973680bRe != null) {
                                            C973690bRf.LJJIJIIJI(enumC973680bRe);
                                        } else {
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("tryReportPKEndEventByDisconnectId getDisconnectId:");
                                            sbLIZ5.append(C915980Zwa.LJI().LIZ().LJJJ());
                                            LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ5));
                                            if (C915980Zwa.LJI().LIZ().LJJJ() != 0) {
                                                C973690bRf.LJJIJIIJI(EnumC973680bRe.POSITIVE_OVER);
                                            } else {
                                                C973690bRf.LJJIJIIJI(EnumC973680bRe.NEGATIVE_OVER);
                                            }
                                        }
                                    }
                                    if (c981480beE != null && (c981550beL = c981480beE.LJJIJ) != null) {
                                        enumC973680bRe2 = c981550beL.LJIIIZ;
                                    }
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("tryReportPunishEndEvent status:");
                                    sbLIZ6.append(enumC974260bSa);
                                    sbLIZ6.append(" finishType:");
                                    sbLIZ6.append(enumC973680bRe2);
                                    LJIILIIL(C2188811AlT.LIZIZ(sbLIZ6));
                                    if (enumC974260bSa != EnumC974260bSa.FINISH && enumC974260bSa != enumC974260bSa2) {
                                        return;
                                    }
                                    if (enumC973680bRe2 != null) {
                                        C915980Zwa.LIZIZ().Af1();
                                        C973690bRf.LJIJJ(enumC973680bRe2, !C976850bWl.LIZ());
                                        return;
                                    }
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("tryReportPunishEndEventByDisconnectId getDisconnectId:");
                                    sbLIZ7.append(C915980Zwa.LJI().LIZ().LJJJ());
                                    LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ7));
                                    if (C915980Zwa.LJI().LIZ().LJJJ() != 0) {
                                        EnumC973680bRe enumC973680bRe3 = EnumC973680bRe.POSITIVE_OVER;
                                        C915980Zwa.LIZIZ().Af1();
                                        C973690bRf.LJIJJ(enumC973680bRe3, !C976850bWl.LIZ());
                                    } else {
                                        EnumC973680bRe enumC973680bRe4 = EnumC973680bRe.NEGATIVE_OVER;
                                        C915980Zwa.LIZIZ().Af1();
                                        C973690bRf.LJIJJ(enumC973680bRe4, !C976850bWl.LIZ());
                                    }
                                }

                                @Override // X.AbstractC982270bfV
                                public final void LJIILLIIL(EnumC982500bfs enumC982500bfs, long j) {
                                    super.LJIILLIIL(enumC982500bfs, j);
                                    if (enumC982500bfs == EnumC982500bfs.WIN || enumC982500bfs == EnumC982500bfs.LOSE || enumC982500bfs == EnumC982500bfs.DRAW) {
                                        LJIILIIL("set punishStartTime");
                                        C973920bS2.LJI = C158B.LIZIZ();
                                    }
                                }

                                @Override // X.InterfaceC977410bXf
                                public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                                    C974430bSr c974430bSr;
                                    long j;
                                    C981480beE c981480beE = this.LLILZIL;
                                    if (c981480beE != null && (c974430bSr = c981480beE.LJJIJIIJIL) != null) {
                                        C954460awe c954460awe = (C954460awe) C13LP.LJJJLZIJ(0, list5);
                                        if (c954460awe != null) {
                                            j = c954460awe.LJ;
                                        } else {
                                            j = 0;
                                        }
                                        c974430bSr.LIZ(j);
                                    }
                                }
                            };
                            arrayList.add(new InterfaceC975560bUg(abstractC982270bfV) { // from class: X.0bXY
                                public final InterfaceC977410bXf LL;

                                @Override // X.InterfaceC975560bUg
                                public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LJI(EnumC919170a1j enumC919170a1j) {
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void vc(List<C954460awe> list2, List<C954460awe> list3) {
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void onDestroy() {
                                    this.LL.onUnload();
                                }

                                @Override // X.InterfaceC975560bUg
                                public final EnumC976730bWZ getPriority() {
                                    return EnumC976730bWZ.P1;
                                }

                                {
                                    this.LL = abstractC982270bfV;
                                    EnumSet.noneOf(EnumC963560bBK.class);
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                    this.LL.LIZLLL(matchBaseWidget2);
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                    if (interfaceC963620bBQ instanceof C981480beE) {
                                        this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                    }
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                    if (interfaceC963620bBQ instanceof C981480beE) {
                                        this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                    }
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onIMMessage, message = ");
                                    sbLIZ32.append(abstractC1136060ffY);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    if (abstractC1136060ffY instanceof CompetitionMessage) {
                                        this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                    }
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                    if (interfaceC963620bBQ instanceof C981480beE) {
                                        this.LL.onUnload();
                                    }
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                    if (interfaceC963620bBQ instanceof C981480beE) {
                                        this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                    }
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                    if (interfaceC963620bBQ instanceof C981480beE) {
                                        StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                        sbLIZ32.append("onStartUIChange, model = ");
                                        sbLIZ32.append(interfaceC963620bBQ);
                                        C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                        this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                    }
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                    if (abstractC970850bN5 instanceof C970860bN6) {
                                        this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                    }
                                }

                                @Override // X.InterfaceC975560bUg
                                public final void LIZIZ(int i, int i2, List list2, List list3, List list4, List list5) {
                                    this.LL.LIZIZ(i, i2, list2, list3, list4, list5);
                                }
                            });
                        }
                        C976020bVQ c976020bVQ10 = this.LIZ;
                        c976020bVQ10.LJ.LIZIZ();
                        for (Object obj : arrayList) {
                            C976200bVi c976200bVi = c976020bVQ10.LJ;
                            c976200bVi.getClass();
                            Object obj2 = new InterfaceC975560bUg[]{obj}[0];
                            if (obj2 != null) {
                                c976200bVi.LIZIZ.add((InterfaceC975560bUg) obj2);
                            }
                        }
                        DataChannel dataChannel3 = c976020bVQ10.LIZJ;
                        if (dataChannel3 != null) {
                            dataChannel3.zQ2(c976020bVQ10);
                        }
                        DataChannel dataChannel4 = c976020bVQ10.LIZJ;
                        if (dataChannel4 != null) {
                            dataChannel4.CQ2(TakeStageSwitchTurnEvent.class, c976020bVQ10, new AwS594S0100000_15(c976020bVQ10, 1177));
                        }
                    } else if (enumC919170a1jLJFF.isCatchBeans()) {
                        C976020bVQ c976020bVQ11 = this.LIZ;
                        List<C954460awe> list2 = c976020bVQ11.LJIIJ.LJII;
                        View view2 = c976020bVQ11.LIZ.LL;
                        if (view2 != null) {
                            viewFindViewById = view2.findViewById(R.id.mcg);
                        }
                        C962250b9D.LJIIIIZZ(viewFindViewById);
                        C976020bVQ c976020bVQ12 = this.LIZ;
                        final C985640bkw c985640bkw = new C985640bkw(c976020bVQ12.LIZLLL, c976020bVQ12.LIZJ, new AwS559S0100000_15(c976020bVQ12, 1205), list2);
                        C976020bVQ c976020bVQ13 = this.LIZ;
                        final C984920bjm c984920bjm = new C984920bjm(c976020bVQ13.LIZLLL, c976020bVQ13.LIZJ, new AwS559S0100000_15(c976020bVQ13, 1204), list2, this.LIZ.LJI);
                        arrayList.add(new InterfaceC975560bUg(c985640bkw) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list22, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c985640bkw;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list22, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list22, list3, list4, list5);
                            }
                        });
                        arrayList.add(new InterfaceC975560bUg(c984920bjm) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list22, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c984920bjm;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list22, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list22, list3, list4, list5);
                            }
                        });
                        C976020bVQ c976020bVQ14 = this.LIZ;
                        final C985360bkU c985360bkU = new C985360bkU(c976020bVQ14.LIZLLL, c976020bVQ14.LIZJ, new AwS559S0100000_15(c976020bVQ14, 1200), list2, new AwS559S0100000_15(c985640bkw, 1201));
                        arrayList.add(new InterfaceC975560bUg(c985360bkU) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list22, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c985360bkU;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list22, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list22, list3, list4, list5);
                            }
                        });
                        C976020bVQ c976020bVQ15 = this.LIZ;
                        final CatchBeansGameComponent catchBeansGameComponent = new CatchBeansGameComponent(c976020bVQ15.LIZJ, new AwS559S0100000_15(c976020bVQ15, 1190));
                        arrayList.add(new InterfaceC975560bUg(catchBeansGameComponent) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list22, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = catchBeansGameComponent;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list22, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list22, list3, list4, list5);
                            }
                        });
                        C976020bVQ c976020bVQ16 = this.LIZ;
                        final C976660bWS c976660bWS = new C976660bWS(c976020bVQ16.LIZLLL, c976020bVQ16.LIZJ, new AwS559S0100000_15(c976020bVQ16, 1191), list2);
                        arrayList.add(new InterfaceC975560bUg(c976660bWS) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list22, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = c976660bWS;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list22, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list22, list3, list4, list5);
                            }
                        });
                        C976020bVQ c976020bVQ17 = this.LIZ;
                        final boolean z2 = c976020bVQ17.LIZLLL;
                        final DataChannel dataChannel5 = c976020bVQ17.LIZJ;
                        final AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15(c976020bVQ17, 1192);
                        final AbstractC983420bhM abstractC983420bhM = new AbstractC983420bhM(dataChannel5, awS559S0100000_152, z2) { // from class: X.0bWT
                            @Override // X.AbstractC983420bhM
                            public final String LJIIJ() {
                                return "CatchBeansEventTrackingComponent";
                            }

                            @Override // X.AbstractC983420bhM
                            public final void LJIILJJIL(EnumC982500bfs enumC982500bfs) {
                                super.LJIILJJIL(enumC982500bfs);
                                if (enumC982500bfs == EnumC982500bfs.WIN || enumC982500bfs == EnumC982500bfs.LOSE) {
                                    LJIIJJI("set punishStartTime");
                                    C973920bS2.LJI = C158B.LIZIZ();
                                }
                            }

                            @Override // X.AbstractC983420bhM, X.InterfaceC977410bXf
                            public final void LJ(EnumC974260bSa enumC974260bSa, C981480beE c981480beE) {
                                EnumC973680bRe enumC973680bRe;
                                C981550beL c981550beL;
                                C981550beL c981550beL2;
                                super.LJ(enumC974260bSa, c981480beE);
                                EnumC974260bSa enumC974260bSa2 = EnumC974260bSa.NONE;
                                if (enumC974260bSa.compareTo(enumC974260bSa2) > 0 && enumC974260bSa.compareTo(EnumC974260bSa.PUNISH) < 0) {
                                    C973920bS2.LJI = 0L;
                                }
                                EnumC973680bRe enumC973680bRe2 = null;
                                if (c981480beE != null && (c981550beL2 = c981480beE.LJJIJ) != null) {
                                    enumC973680bRe = c981550beL2.LJIIIZ;
                                } else {
                                    enumC973680bRe = null;
                                }
                                if (enumC974260bSa.compareTo(enumC974260bSa2) <= 0 || enumC974260bSa.compareTo(EnumC974260bSa.PUNISH) >= 0) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("tryReportPKEndEvent status:");
                                    sbLIZ4.append(enumC974260bSa);
                                    sbLIZ4.append(" finishType:");
                                    sbLIZ4.append(enumC973680bRe);
                                    LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
                                    if (enumC974260bSa.compareTo(enumC974260bSa2) > 0 && enumC974260bSa.compareTo(EnumC974260bSa.FINISH) < 0) {
                                        C973690bRf.LJIJ(EnumC973680bRe.TIME_OUT);
                                    } else if (enumC973680bRe != null) {
                                        C973690bRf.LJIJ(enumC973680bRe);
                                    } else {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("tryReportPKEndEventByDisconnectId getDisconnectId:");
                                        sbLIZ5.append(C915980Zwa.LJI().LIZ().LJJJ());
                                        LJIIL(C2188811AlT.LIZIZ(sbLIZ5));
                                        if (C915980Zwa.LJI().LIZ().LJJJ() != 0) {
                                            C973690bRf.LJIJ(EnumC973680bRe.POSITIVE_OVER);
                                        } else {
                                            C973690bRf.LJIJ(EnumC973680bRe.NEGATIVE_OVER);
                                        }
                                    }
                                }
                                if (c981480beE != null && (c981550beL = c981480beE.LJJIJ) != null) {
                                    enumC973680bRe2 = c981550beL.LJIIIZ;
                                }
                                if (enumC974260bSa != EnumC974260bSa.FINISH && enumC974260bSa != enumC974260bSa2) {
                                    return;
                                }
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("tryReportPunishEndEvent status:");
                                sbLIZ6.append(enumC974260bSa);
                                sbLIZ6.append(" finishType:");
                                sbLIZ6.append(enumC973680bRe2);
                                LJIIJJI(C2188811AlT.LIZIZ(sbLIZ6));
                                if (enumC973680bRe2 != null) {
                                    C973690bRf.LJIJJ(enumC973680bRe2, false);
                                    return;
                                }
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("tryReportPunishEndEventByDisconnectId getDisconnectId:");
                                sbLIZ7.append(C915980Zwa.LJI().LIZ().LJJJ());
                                LJIIL(C2188811AlT.LIZIZ(sbLIZ7));
                                if (C915980Zwa.LJI().LIZ().LJJJ() != 0) {
                                    C973690bRf.LJIJJ(EnumC973680bRe.POSITIVE_OVER, false);
                                } else {
                                    C973690bRf.LJIJJ(EnumC973680bRe.NEGATIVE_OVER, false);
                                }
                            }

                            {
                                ArrayList arrayList2 = new ArrayList();
                            }
                        };
                        arrayList.add(new InterfaceC975560bUg(abstractC983420bhM) { // from class: X.0bXY
                            public final InterfaceC977410bXf LL;

                            @Override // X.InterfaceC975560bUg
                            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJI(EnumC919170a1j enumC919170a1j) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void vc(List<C954460awe> list22, List<C954460awe> list3) {
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void onDestroy() {
                                this.LL.onUnload();
                            }

                            @Override // X.InterfaceC975560bUg
                            public final EnumC976730bWZ getPriority() {
                                return EnumC976730bWZ.P1;
                            }

                            {
                                this.LL = abstractC983420bhM;
                                EnumSet.noneOf(EnumC963560bBK.class);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZLLL(MatchBaseWidget matchBaseWidget2) {
                                this.LL.LIZLLL(matchBaseWidget2);
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.DRAW, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.PUNISH, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("onIMMessage, message = ");
                                sbLIZ32.append(abstractC1136060ffY);
                                C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                if (abstractC1136060ffY instanceof CompetitionMessage) {
                                    this.LL.LIZ(C982440bfm.LJII((CompetitionMessage) abstractC1136060ffY));
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.onUnload();
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    this.LL.LJ(EnumC974260bSa.SETTLE, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
                                if (interfaceC963620bBQ instanceof C981480beE) {
                                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                    sbLIZ32.append("onStartUIChange, model = ");
                                    sbLIZ32.append(interfaceC963620bBQ);
                                    C20441214yg.LIZIZ("CompetitionComponentAdapter", C2188811AlT.LIZIZ(sbLIZ32));
                                    this.LL.LJ(EnumC974260bSa.START, (C981480beE) interfaceC963620bBQ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
                                if (abstractC970850bN5 instanceof C970860bN6) {
                                    this.LL.LJIIIZ(((C970860bN6) abstractC970850bN5).LIZ);
                                }
                            }

                            @Override // X.InterfaceC975560bUg
                            public final void LIZIZ(int i, int i2, List list22, List list3, List list4, List list5) {
                                this.LL.LIZIZ(i, i2, list22, list3, list4, list5);
                            }
                        });
                        arrayList.add(new C977360bXa(new C15FS(this.LIZ.LIZ)));
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Registered components count: ");
                    sbLIZ4.append(arrayList.size());
                    C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ4));
                    C975550bUf c975550bUf2 = this.LIZ.LJIIIIZZ;
                    if (c975550bUf2 != null) {
                        c975550bUf2.LIZ(arrayList);
                    }
                    C976020bVQ c976020bVQ18 = this.LIZ;
                    C975550bUf c975550bUf3 = c976020bVQ18.LJIIIIZZ;
                    if (c975550bUf3 != null) {
                        MatchBaseWidget matchBaseWidget2 = c976020bVQ18.LIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("loadComponents (all), components=");
                        sbLIZ5.append(c975550bUf3.LIZJ());
                        C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ5));
                        c975550bUf3.LJ(matchBaseWidget2);
                        c975550bUf3.LJFF(matchBaseWidget2);
                    }
                    C975550bUf c975550bUf4 = this.LIZ.LJIIIIZZ;
                    if (c975550bUf4 != null) {
                        c975550bUf4.LIZLLL(enumC919170a1jLJFF);
                    }
                }
            }

            @Override // X.InterfaceC976860bWm
            public final void LJFF(InterfaceC976620bWO interfaceC976620bWO, EnumC974260bSa enumC974260bSa) {
                EnumC974260bSa enumC974260bSaY2;
                EnumC974260bSa enumC974260bSaY22;
                C981480beE c981480beELJI;
                C981480beE c981480beE;
                String str;
                C981550beL c981550beL;
                List<C981480beE> arrayList;
                C981480beE c981480beELJI2;
                C976020bVQ c976020bVQ = this.LIZ;
                c976020bVQ.getClass();
                boolean zD3 = interfaceC976620bWO.d3();
                boolean zLJFF = Intrinsics.LJFF(interfaceC976620bWO, c976020bVQ.LJIIJJI);
                boolean zLJFF2 = Intrinsics.LJFF(interfaceC976620bWO, c976020bVQ.LJIIL);
                InterfaceC976620bWO interfaceC976620bWO2 = c976020bVQ.LJIIJJI;
                EnumC962960bAM bizType = null;
                if (interfaceC976620bWO2 != null) {
                    enumC974260bSaY2 = interfaceC976620bWO2.Y2();
                } else {
                    enumC974260bSaY2 = null;
                }
                C976640bWQ c976640bWQ = c976020bVQ.LJIIL;
                if (c976640bWQ != null) {
                    enumC974260bSaY22 = c976640bWQ.Y2();
                } else {
                    enumC974260bSaY22 = null;
                }
                EnumC962960bAM enumC962960bAM = c976020bVQ.LJIIJ.LJIIIIZZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("engineWillEnterStatus");
                sbLIZ.append(", callbackInitialBizType=");
                sbLIZ.append(enumC962960bAM);
                sbLIZ.append(", callbackStatus=");
                sbLIZ.append(enumC974260bSa);
                sbLIZ.append(", callbackIsRematch=");
                sbLIZ.append(zD3);
                sbLIZ.append(", callbackIsMainEngine=");
                sbLIZ.append(zLJFF);
                sbLIZ.append(", callbackIsRematchEngine=");
                sbLIZ.append(zLJFF2);
                sbLIZ.append(", callbackEngine.model=");
                sbLIZ.append(interfaceC976620bWO.LJI());
                sbLIZ.append(", mainEngineStatus=");
                sbLIZ.append(enumC974260bSaY2);
                sbLIZ.append(", mainEngine.model=");
                InterfaceC976620bWO interfaceC976620bWO3 = c976020bVQ.LJIIJJI;
                if (interfaceC976620bWO3 != null) {
                    c981480beELJI = interfaceC976620bWO3.LJI();
                } else {
                    c981480beELJI = null;
                }
                sbLIZ.append(c981480beELJI);
                sbLIZ.append(", rematchEngineStatus=");
                sbLIZ.append(enumC974260bSaY22);
                sbLIZ.append(", rematchEngine.model = ");
                C976640bWQ c976640bWQ2 = c976020bVQ.LJIIL;
                if (c976640bWQ2 != null) {
                    c981480beE = c976640bWQ2.LJII;
                } else {
                    c981480beE = null;
                }
                sbLIZ.append(c981480beE);
                C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
                int i = C970880bN8.LIZ[enumC974260bSa.ordinal()];
                if (i != 1) {
                    if ((i != 2 && i != 3) || !c976020bVQ.LIZLLL) {
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("engineWillEnterStatus");
                    sbLIZ2.append(", callbackStatus=");
                    sbLIZ2.append(enumC974260bSa);
                    sbLIZ2.append(", punish_or_draw start, rematchEngine_create");
                    C20441214yg.LJ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ2));
                    C976640bWQ c976640bWQ3 = new C976640bWQ(c976020bVQ.LIZLLL, C500260Jjc.LJJLIIIIJ(c976020bVQ.LIZJ), c976020bVQ.LIZJ, true, c976020bVQ.LJIILJJIL, interfaceC976620bWO.a3(), interfaceC976620bWO.LJIIIZ(), new C981480beE(EnumC975850bV9.INITIALIZE_REMATCH, c976020bVQ.LIZLLL, C500260Jjc.LJJLIIIIJ(c976020bVQ.LIZJ)));
                    InterfaceC976620bWO interfaceC976620bWO4 = c976020bVQ.LJIIJJI;
                    if (interfaceC976620bWO4 == null || (arrayList = interfaceC976620bWO4.LJIJI()) == null) {
                        arrayList = new ArrayList<>();
                    }
                    c976640bWQ3.LJIIJ = arrayList;
                    InterfaceC976620bWO interfaceC976620bWO5 = c976020bVQ.LJIIJJI;
                    if (interfaceC976620bWO5 != null && (c981480beELJI2 = interfaceC976620bWO5.LJI()) != null) {
                        c976640bWQ3.LJIIJ.add(c981480beELJI2);
                    }
                    c976020bVQ.LJIIL = c976640bWQ3;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("engineWillEnterStatus");
                    sbLIZ3.append(", callbackStatus=");
                    sbLIZ3.append(enumC974260bSa);
                    sbLIZ3.append(", punish_or_draw start, rematchEngine_create_end");
                    C20441214yg.LJ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                String uniqueId = interfaceC976620bWO.getUniqueId();
                C976640bWQ c976640bWQ4 = c976020bVQ.LJIIL;
                if (c976640bWQ4 != null) {
                    str = c976640bWQ4.LJIIIIZZ;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(uniqueId, str)) {
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("engineWillEnterStatus");
                sbLIZ4.append(", callbackStatus=");
                sbLIZ4.append(enumC974260bSa);
                sbLIZ4.append(", rematchEngine_start_replace_engine");
                C20441214yg.LJ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ4));
                InterfaceC976620bWO interfaceC976620bWO6 = c976020bVQ.LJIIJJI;
                c976020bVQ.LJIIJJI = interfaceC976620bWO;
                interfaceC976620bWO.c3(false);
                c976020bVQ.LJIIJ = interfaceC976620bWO.LJI();
                c976020bVQ.LJIIL = null;
                if (interfaceC976620bWO6 != null) {
                    bizType = interfaceC976620bWO6.getBizType();
                }
                EnumC962960bAM bizType2 = interfaceC976620bWO.getBizType();
                if (bizType == EnumC962960bAM.TAKE_THE_STAGE && bizType2 != bizType) {
                    interfaceC976620bWO.LJI().LJJIIJZLJL = true;
                }
                if (interfaceC976620bWO6 != null) {
                    C981480beE c981480beELJI3 = interfaceC976620bWO6.LJI();
                    if (c981480beELJI3 != null && (c981550beL = c981480beELJI3.LJJIJ) != null) {
                        c981550beL.LJII = interfaceC976620bWO.LJI().LJIIJJI;
                    }
                    interfaceC976620bWO6.LJII(201L);
                    C981480beE c981480beELJI4 = interfaceC976620bWO6.LJI();
                    if (c981480beELJI4 != null) {
                        c981480beELJI4.LIZIZ("engineWillEnterStatus_competition_start");
                    }
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("engineWillEnterStatus");
                sbLIZ5.append(", callbackStatus=");
                sbLIZ5.append(enumC974260bSa);
                sbLIZ5.append(", preEngine_reset_end");
                C20441214yg.LJ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ5));
            }
        };
        this.LJIILJJIL = r7;
        DataChannel dataChannel = matchBaseWidget.dataChannel;
        this.LIZJ = dataChannel;
        final boolean zLJIIZILJ2 = C500260Jjc.LJIIZILJ(dataChannel);
        this.LIZLLL = zLJIIZILJ2;
        this.LJIIIIZZ = new C975550bUf();
        C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", "InteractiveModeComponentManager initialized for Competition");
        this.LJIIIZ = new InterfaceC976810bWh(zLJIIZILJ2) { // from class: X.0beO
            public final boolean LIZ;
            public EnumC962960bAM LIZIZ = EnumC962960bAM.UNKNOWN;

            @Override // X.InterfaceC976810bWh
            public final EnumC962960bAM LIZ() {
                return this.LIZIZ;
            }

            {
                this.LIZ = zLJIIZILJ2;
            }

            @Override // X.InterfaceC976810bWh
            public final void LIZJ(EnumC962960bAM enumC962960bAM) {
                this.LIZIZ = enumC962960bAM;
            }

            @Override // X.InterfaceC976810bWh
            public final AbstractC981450beB LIZIZ(final InterfaceC976620bWO interfaceC976620bWO, final EnumC974260bSa enumC974260bSa, final AbstractC982800bgM abstractC982800bgM, C982460bfo c982460bfo) {
                switch (C974390bSn.LIZ[enumC974260bSa.ordinal()]) {
                    case 1:
                        if (this.LIZ) {
                            return new AbstractC981450beB<InterfaceC983910bi9>(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM) { // from class: X.0beC
                                @Override // X.AbstractC981450beB
                                public final Set LJJIFFI() {
                                    return C093Y.LIZJ(EnumC974260bSa.NONE);
                                }

                                @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LIZ(AbstractC982800bgM abstractC982800bgM2) {
                                    String str;
                                    String strLJIJJ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("onReceiveMessage");
                                    sbLIZ.append(", status=");
                                    sbLIZ.append(this.LIZIZ);
                                    sbLIZ.append(", message=");
                                    sbLIZ.append(abstractC982800bgM2);
                                    C20441214yg.LIZIZ("CompetitionStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ));
                                    if (abstractC982800bgM2 instanceof C982480bfq) {
                                        C982480bfq c982480bfq = (C982480bfq) abstractC982800bgM2;
                                        boolean zIsRematch = c982480bfq.LJFF.isRematch();
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("handleBeInvited, isReMatch=");
                                        sbLIZ2.append(zIsRematch);
                                        C20441214yg.LJIIIZ("CompetitionStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                                        C961300b7g.LIZ.getClass();
                                        C961300b7g.LIZIZ("");
                                        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(this.LIZ.getDataChannel());
                                        if (c0utjPl1 != null) {
                                            c0utjPl1.LJIL(EnumC20429414wm.DETAIL, "match_playbook_entrance", null);
                                        }
                                        LJJIIZI("handleInviteMsg");
                                        LJJJJIZL(c982480bfq);
                                        C981480beE c981480beELJJIII = LJJIII();
                                        c981480beELJJIII.LJJIJ.LJ = zIsRematch;
                                        int iLIZIZ = C915980Zwa.LIZ().o20().LIZIZ();
                                        C962950bAL c962950bAL = EnumC962960bAM.Companion;
                                        EnumC962960bAM enumC962960bAM = c982480bfq.LIZJ.LIZ;
                                        c962950bAL.getClass();
                                        if (iLIZIZ == C962950bAL.LJFF(enumC962960bAM).getType()) {
                                            str = CardStruct.IStatusCode.DEFAULT;
                                        } else {
                                            str = "1";
                                        }
                                        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                                        if (interfaceC975870bVBLJFF == null || (strLJIJJ = interfaceC975870bVBLJFF.LJIJJ()) == null) {
                                            strLJIJJ = "";
                                        }
                                        c981480beELJJIII.LJJIIJ = new C973800bRq("", str, strLJIJJ);
                                        InterfaceC983910bi9 interfaceC983910bi9 = (InterfaceC983910bi9) LJJII();
                                        if (interfaceC983910bi9 != null) {
                                            interfaceC983910bi9.LJJJJ(c982480bfq);
                                        }
                                        C389001fE.LIZ("LiveMatchInvitationReceivedEvent", null, System.currentTimeMillis(), false);
                                        AbstractC981450beB.LJJJIL(this, EnumC975850bV9.INVITE_MESSAGE, c982480bfq);
                                        return;
                                    }
                                    if (abstractC982800bgM2 instanceof C982450bfn) {
                                        C982450bfn c982450bfn = (C982450bfn) abstractC982800bgM2;
                                        new C974560bT4().LJJIFFI(c982450bfn);
                                        boolean zIsRematch2 = c982450bfn.LJFF.isRematch();
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("handleAcceptMsg, isRematch:");
                                        sbLIZ3.append(zIsRematch2);
                                        sbLIZ3.append(", meanwhile scene handle invite lost");
                                        C20441214yg.LIZIZ("CompetitionStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ3));
                                        boolean zIsRematch3 = c982450bfn.LJFF.isRematch();
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("inviteActionByUid updated by Accept Message， isReMatch=");
                                        sbLIZ4.append(zIsRematch3);
                                        C20441214yg.LIZIZ("CompetitionStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ4));
                                        LJJJJIZL(c982450bfn);
                                        InterfaceC983910bi9 interfaceC983910bi92 = (InterfaceC983910bi9) LJJII();
                                        if (interfaceC983910bi92 != null) {
                                            interfaceC983910bi92.LJJJJ(c982450bfn);
                                        }
                                        int i = C981640beU.LIZ[c982450bfn.LJIIIZ.ordinal()];
                                        if (i == 1 || i == 2 || i == 3) {
                                            return;
                                        }
                                        AbstractC981450beB.LJJJIL(this, EnumC975850bV9.ACCEPT_MESSAGE, c982450bfn);
                                        return;
                                    }
                                    if (abstractC982800bgM2 instanceof C982470bfp) {
                                        C982470bfp c982470bfp = (C982470bfp) abstractC982800bgM2;
                                        boolean zIsRematch4 = c982470bfp.LJFF.isRematch();
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("handleStartMsg, isRematch:");
                                        sbLIZ5.append(zIsRematch4);
                                        sbLIZ5.append(", maybe cause by api failed; cacheId=");
                                        sbLIZ5.append(LJJIII().LJIIIZ);
                                        sbLIZ5.append(", msgCompetitionId=");
                                        sbLIZ5.append(c982470bfp.LIZJ.LIZJ);
                                        C20441214yg.LJ("CompetitionStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ5));
                                        if (LJJIII().LJIIIZ > 0) {
                                            if (!AbstractC981450beB.LJJIIJZLJL(this, c982470bfp.LIZJ.LIZJ)) {
                                                return;
                                            }
                                            LJJJJIZL(c982470bfp);
                                            InterfaceC983910bi9 interfaceC983910bi93 = (InterfaceC983910bi9) LJJII();
                                            if (interfaceC983910bi93 == null) {
                                                return;
                                            }
                                            interfaceC983910bi93.LJJJJ(c982470bfp);
                                            return;
                                        }
                                        LJJJJIZL(c982470bfp);
                                        InterfaceC983910bi9 interfaceC983910bi94 = (InterfaceC983910bi9) LJJII();
                                        if (interfaceC983910bi94 != null) {
                                            interfaceC983910bi94.LJJJJ(c982470bfp);
                                        }
                                        AbstractC981450beB.LJJJJI(this, EnumC975850bV9.OPEN_MESSAGE, c982470bfp, null, 4);
                                        return;
                                    }
                                    super.LIZ(abstractC982800bgM2);
                                }

                                @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
                                    DataChannel dataChannel2;
                                    super.LIZJ(enumC975850bV9);
                                    LJJIIZI("updateDataWithStateDidEnter");
                                    if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(this.LIZ.d3())) && (dataChannel2 = this.LIZ.getDataChannel()) != null) {
                                        dataChannel2.CQ2(BattleCohostJoiningEvent.class, this, new AwS594S0100000_15(this, 787));
                                    }
                                }

                                @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LJI(EnumC975850bV9 enumC975850bV9) {
                                    super.LJI(enumC975850bV9);
                                    DataChannel dataChannel2 = this.LIZ.getDataChannel();
                                    if (dataChannel2 != null) {
                                        dataChannel2.zQ2(this);
                                    }
                                }

                                @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
                                    String value;
                                    String strLJIJJ;
                                    InterfaceC955780aym interfaceC955780aymLJIIJ = C915980Zwa.LJI().LJIIJ();
                                    if (str == null) {
                                        value = EnumC973640bRa.PK_ICON.getValue();
                                    } else {
                                        value = str;
                                    }
                                    interfaceC955780aymLJIIJ.LJ(value);
                                    if (Intrinsics.LJFF(str, EnumC973640bRa.PK_REMATCH.getValue())) {
                                        C981480beE c981480beELJJIII = LJJIII();
                                        c981480beELJJIII.LJJIJ.LJ = true;
                                        String str2 = C973660bRc.LJJJJL;
                                        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                                        if (interfaceC975870bVBLJFF == null || (strLJIJJ = interfaceC975870bVBLJFF.LJIJJ()) == null) {
                                            strLJIJJ = "";
                                        }
                                        c981480beELJJIII.LJJIIJ = new C973800bRq(str2, "1", strLJIJJ);
                                    }
                                    this.LIZ.LJIJ(enumC962960bAM, "onClick");
                                    super.LIZIZ(enumC962960bAM, str);
                                    LJJJJJL(this, false, null, 2);
                                }

                                @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LJIILIIL(EnumC962960bAM enumC962960bAM, int i) {
                                    String value;
                                    if (i == 7) {
                                        value = EnumC973640bRa.CATCH_BEANS_GUIDE_CAPSULE.getValue();
                                    } else {
                                        value = EnumC973640bRa.PK_GUIDE.getValue();
                                    }
                                    C915980Zwa.LJI().LJIIJ().LJ(value);
                                    this.LIZ.LJIJ(enumC962960bAM, "onClickGuide");
                                    super.LJIILIIL(enumC962960bAM, i);
                                    LJJJJJL(this, true, Integer.valueOf(i), 4);
                                }

                                @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LJIILLIIL(EnumC962960bAM enumC962960bAM, String str) {
                                    String strLJIJJ;
                                    super.LJIILLIIL(enumC962960bAM, str);
                                    C915980Zwa.LJI().LJIIJ().LJ(EnumC973640bRa.PK_REMATCH.getValue());
                                    this.LIZ.LJIJ(enumC962960bAM, "onClickRematch");
                                    C981480beE c981480beELJJIII = LJJIII();
                                    c981480beELJJIII.LJJIJ.LJ = true;
                                    InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                                    if (interfaceC975870bVBLJFF == null || (strLJIJJ = interfaceC975870bVBLJFF.LJIJJ()) == null) {
                                        strLJIJJ = "";
                                    }
                                    c981480beELJJIII.LJJIIJ = new C973800bRq(str, CardStruct.IStatusCode.DEFAULT, strLJIJJ);
                                    AbstractC981450beB.LJJJ(this, EnumC975850bV9.PUNISH_REMATCH_BUTTON_CLICK);
                                }

                                @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void Z2(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
                                    super.Z2(list, list2, customLinkMessage);
                                    AbstractC981450beB.LJJIZ(this, EnumC975850bV9.HOSTS_LIST_CHANGED, null, 6);
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
                                
                                    if (r1 != false) goto L13;
                                 */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public static void LJJJJJL(X.C981460beC r2, boolean r3, java.lang.Integer r4, int r5) {
                                    /*
                                        r0 = r5 & 2
                                        if (r0 == 0) goto L5
                                        r4 = 0
                                    L5:
                                        r2.getClass()
                                        if (r4 == 0) goto L21
                                        int r1 = r4.intValue()
                                        r0 = 7
                                        if (r1 != r0) goto L21
                                        r1 = 1
                                    L12:
                                        if (r3 == 0) goto L1c
                                        if (r1 == 0) goto L23
                                        X.0bV9 r0 = X.EnumC975850bV9.GUIDE_CAPSULE_CLICK
                                    L18:
                                        X.AbstractC981450beB.LJJIL(r2, r0)
                                        return
                                    L1c:
                                        X.0bV9 r0 = X.EnumC975850bV9.INVITE_BUTTON_CLICK
                                        if (r1 == 0) goto L25
                                        goto L18
                                    L21:
                                        r1 = 0
                                        goto L12
                                    L23:
                                        X.0bV9 r0 = X.EnumC975850bV9.MODE_GUIDE_BUTTON_CLICK
                                    L25:
                                        X.AbstractC981450beB.LJJJ(r2, r0)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C981460beC.LJJJJJL(X.0beC, boolean, java.lang.Integer, int):void");
                                }
                            };
                        }
                        return new AbstractC981450beB<Object>(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM) { // from class: X.0bfL
                            public final C982210bfP LJ = new C982210bfP();

                            @Override // X.AbstractC981450beB
                            public final Set LJJIFFI() {
                                return C093Y.LIZJ(EnumC974260bSa.NONE);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZ(final AbstractC982800bgM abstractC982800bgM2) {
                                if (abstractC982800bgM2 instanceof C982470bfp) {
                                    C982210bfP c982210bfP = this.LJ;
                                    InterfaceC983620bhg interfaceC983620bhg = new InterfaceC983620bhg() { // from class: X.0bfM
                                        @Override // X.InterfaceC983620bhg
                                        public final void LIZ(EnumC982970bgd enumC982970bgd) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onReceiveMessage");
                                            sbLIZ.append(", validSuccess, scene=");
                                            sbLIZ.append(enumC982970bgd);
                                            sbLIZ.append(", competitionId=");
                                            sbLIZ.append(LJJIII().LJIIIZ);
                                            C20441214yg.LJ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ));
                                            C973910bS1.LIZJ(LJJIII().LJIIIZ, "open_message");
                                            AbstractC981450beB.LJJJJI(this.LIZ, EnumC975850bV9.OPEN_MESSAGE, abstractC982800bgM2, null, 4);
                                        }

                                        @Override // X.InterfaceC983620bhg
                                        public final void LIZIZ(EnumC982970bgd enumC982970bgd, C982460bfo c982460bfo2) {
                                            boolean z;
                                            C982170bfL c982170bfL = this.LIZ;
                                            C982470bfp c982470bfp = (C982470bfp) abstractC982800bgM2;
                                            c982170bfL.getClass();
                                            if (c982470bfp.LJFF == EnumC982740bgG.REMATCH) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("updateDataForAudienceByMessage, message.isRematch=");
                                            sbLIZ.append(z);
                                            sbLIZ.append(", engine.isRematch = ");
                                            sbLIZ.append(c982170bfL.LIZ.d3());
                                            C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
                                            C981530beJ.LIZ(c982470bfp, c982170bfL.LJJIII(), c982170bfL.LIZIZ, c982170bfL.LIZ.getDataChannel());
                                            c982170bfL.LIZ.LJIJ(c982470bfp.LIZJ.LIZ, "audienceUpdateDataByMsg");
                                        }

                                        @Override // X.InterfaceC983620bhg
                                        public final void LIZJ(EnumC982970bgd enumC982970bgd, EnumC982990bgf enumC982990bgf) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onReceiveMessage");
                                            sbLIZ.append(", validFailed, scene=");
                                            sbLIZ.append(enumC982970bgd);
                                            sbLIZ.append(", failReason=");
                                            sbLIZ.append(enumC982990bgf);
                                            sbLIZ.append(", competitionId=");
                                            sbLIZ.append(LJJIII().LJIIIZ);
                                            C20441214yg.LJ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    };
                                    C981480beE c981480beELJJIII = LJJIII();
                                    c982210bfP.getClass();
                                    C982210bfP.LIZ(interfaceC983620bhg, c981480beELJJIII, abstractC982800bgM2);
                                    return;
                                }
                                if (abstractC982800bgM2 instanceof C982670bg9) {
                                    if (!LiveCoHostTakeTheStageV2FixEndTimeSetting.INSTANCE.getValue()) {
                                        return;
                                    }
                                    C982210bfP c982210bfP2 = this.LJ;
                                    InterfaceC983620bhg interfaceC983620bhg2 = new InterfaceC983620bhg() { // from class: X.0bfN
                                        @Override // X.InterfaceC983620bhg
                                        public final void LIZ(EnumC982970bgd enumC982970bgd) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onReceiveMessage");
                                            sbLIZ.append(", validSuccess, scene=");
                                            sbLIZ.append(enumC982970bgd);
                                            sbLIZ.append(", competitionId=");
                                            sbLIZ.append(LJJIII().LJIIIZ);
                                            C20441214yg.LJ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ));
                                            C973910bS1.LIZJ(LJJIII().LJIIIZ, "settle_start_message");
                                            AbstractC981450beB.LJJJJI(this.LIZ, EnumC975850bV9.SETTLE_START_MESSAGE, abstractC982800bgM2, null, 4);
                                        }

                                        @Override // X.InterfaceC983620bhg
                                        public final void LIZIZ(EnumC982970bgd enumC982970bgd, C982460bfo c982460bfo2) {
                                            C982170bfL c982170bfL = this.LIZ;
                                            AbstractC982800bgM abstractC982800bgM3 = abstractC982800bgM2;
                                            c982170bfL.getClass();
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("updateDataForAudienceByMessage, mmessage=");
                                            sbLIZ.append(abstractC982800bgM3);
                                            sbLIZ.append(", engine.isRematch = ");
                                            sbLIZ.append(c982170bfL.LIZ.d3());
                                            C20441214yg.LIZIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ));
                                            C981530beJ.LIZ(abstractC982800bgM3, c982170bfL.LJJIII(), c982170bfL.LIZIZ, c982170bfL.LIZ.getDataChannel());
                                            c982170bfL.LIZ.LJIJ(abstractC982800bgM3.LIZJ.LIZ, "audienceUpdateDataByMsg");
                                        }

                                        @Override // X.InterfaceC983620bhg
                                        public final void LIZJ(EnumC982970bgd enumC982970bgd, EnumC982990bgf enumC982990bgf) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onReceiveMessage");
                                            sbLIZ.append(", validFailed, scene=");
                                            sbLIZ.append(enumC982970bgd);
                                            sbLIZ.append(", failReason=");
                                            sbLIZ.append(enumC982990bgf);
                                            sbLIZ.append(", competitionId=");
                                            sbLIZ.append(LJJIII().LJIIIZ);
                                            C20441214yg.LJ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    };
                                    C981480beE c981480beELJJIII2 = LJJIII();
                                    c982210bfP2.getClass();
                                    C982210bfP.LIZ(interfaceC983620bhg2, c981480beELJJIII2, abstractC982800bgM2);
                                    return;
                                }
                                if (abstractC982800bgM2 instanceof C982490bfr) {
                                    C982210bfP c982210bfP3 = this.LJ;
                                    InterfaceC983620bhg interfaceC983620bhg3 = new InterfaceC983620bhg() { // from class: X.0bfK
                                        @Override // X.InterfaceC983620bhg
                                        public final void LIZ(EnumC982970bgd enumC982970bgd) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onReceiveMessage");
                                            sbLIZ.append(", validSuccess, scene=");
                                            sbLIZ.append(enumC982970bgd);
                                            sbLIZ.append(", competitionId=");
                                            sbLIZ.append(LJJIII().LJIIIZ);
                                            C20441214yg.LJ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ));
                                            C982170bfL c982170bfL = this.LIZ;
                                            String source = EnumC975850bV9.SETTLE_FINISH_MESSAGE_AUDIENCE.getSource();
                                            EnumC975850bV9 enumC975850bV9 = EnumC975850bV9.RESULT_FROM_FINISH_MESSAGE;
                                            List<C982390bfh> list = ((C982490bfr) abstractC982800bgM2).LJFF;
                                            EnumC974260bSa enumC974260bSa2 = EnumC974260bSa.SETTLE;
                                            if (!Room.isValid(c982170bfL.LIZ.getRoomInfo())) {
                                                C20441214yg.LJIIIZ("CompetitionStateBase", "dealResult, room is not valid, return");
                                                return;
                                            }
                                            if (c982170bfL.LIZ.Y2().compareTo(EnumC974260bSa.PUNISH) >= 0) {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("dealResult, isEnd=true, status = ");
                                                sbLIZ2.append(c982170bfL.LIZ.Y2());
                                                C20441214yg.LJIIIZ("CompetitionStateBase", C2188811AlT.LIZIZ(sbLIZ2));
                                                return;
                                            }
                                            if (list.isEmpty()) {
                                                C20441214yg.LJIIIZ("CompetitionStateBase", "dealResult, teamScores isEmpty ");
                                                return;
                                            }
                                            if (!Intrinsics.LJFF(source, "finish_msg") && Intrinsics.LJFF(source, "battle_info")) {
                                                enumC975850bV9 = EnumC975850bV9.RESULT_FROM_BATTLE_INFO;
                                            }
                                            if (c982170bfL.LJJIII().LJIJI == EnumC982500bfs.DRAW) {
                                                AbstractC981450beB.LJJIJIL(c982170bfL, enumC975850bV9);
                                            } else if (enumC974260bSa2 == EnumC974260bSa.START) {
                                                c982170bfL.LJJIIZ();
                                                AbstractC981450beB.LJJIJLIJ(c982170bfL, enumC975850bV9, null, null, 6);
                                            } else {
                                                AbstractC981450beB.LJJJI(c982170bfL, enumC975850bV9, null, 6);
                                            }
                                        }

                                        @Override // X.InterfaceC983620bhg
                                        public final void LIZIZ(EnumC982970bgd enumC982970bgd, C982460bfo c982460bfo2) {
                                            LJJJJIZL(abstractC982800bgM2);
                                        }

                                        @Override // X.InterfaceC983620bhg
                                        public final void LIZJ(EnumC982970bgd enumC982970bgd, EnumC982990bgf enumC982990bgf) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onReceiveMessage");
                                            sbLIZ.append(", validFailed, scene=");
                                            sbLIZ.append(enumC982970bgd);
                                            sbLIZ.append(", failReason=");
                                            sbLIZ.append(enumC982990bgf);
                                            sbLIZ.append(", competitionId=");
                                            sbLIZ.append(LJJIII().LJIIIZ);
                                            C20441214yg.LJ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    };
                                    C981480beE c981480beELJJIII3 = LJJIII();
                                    c982210bfP3.getClass();
                                    C982210bfP.LIZ(interfaceC983620bhg3, c981480beELJJIII3, abstractC982800bgM2);
                                    return;
                                }
                                super.LIZ(abstractC982800bgM2);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
                                super.LIZJ(enumC975850bV9);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJI(EnumC975850bV9 enumC975850bV9) {
                                super.LJI(enumC975850bV9);
                                C982210bfP c982210bfP = this.LJ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append("_stateWillLeave");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c982210bfP.getClass();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("dispose");
                                sbLIZ2.append(", source=");
                                sbLIZ2.append(strLIZIZ);
                                C20441214yg.LJ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                C11JF c11jf = c982210bfP.LIZIZ;
                                if (c11jf != null) {
                                    C500260Jjc.LJJLIIIJLJLI(c11jf);
                                }
                                c982210bfP.LIZIZ = null;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
                            /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
                            /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJIIJ(X.C945320ahu r16) {
                                /*
                                    Method dump skipped, instruction units count: 454
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C982170bfL.LJIIJ(X.0ahu):void");
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final boolean LJIIJJI(final C982460bfo c982460bfo2, EnumC970440bMQ enumC970440bMQ) {
                                boolean zLIZ;
                                super.LJIIJJI(c982460bfo2, enumC970440bMQ);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onHandleAudienceInfoResult");
                                sbLIZ.append(", info = ");
                                sbLIZ.append(c982460bfo2);
                                C20441214yg.LJIIIZ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ));
                                C982210bfP c982210bfP = this.LJ;
                                InterfaceC983620bhg interfaceC983620bhg = new InterfaceC983620bhg() { // from class: X.0bfS
                                    @Override // X.InterfaceC983620bhg
                                    public final void LIZ(EnumC982970bgd enumC982970bgd) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("onHandleAudienceInfoResult");
                                        sbLIZ2.append(", validSuccess, scene=");
                                        sbLIZ2.append(enumC982970bgd);
                                        sbLIZ2.append(", competitionId=");
                                        sbLIZ2.append(c982460bfo2.LIZJ.LIZJ);
                                        C20441214yg.LJ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ2));
                                        C973910bS1.LIZJ(LJJIII().LJIIIZ, "room_enter_battleinfo");
                                        if (c982460bfo2.LIZJ.LIZ == EnumC962960bAM.CATCH_BEANS) {
                                            C982170bfL c982170bfL = this;
                                            c982170bfL.LJJIJIIJI("onHandleAudienceInfoResult", c982170bfL.LJJIII().LJIJJLI, c982460bfo2);
                                        }
                                    }

                                    @Override // X.InterfaceC983620bhg
                                    public final void LIZIZ(EnumC982970bgd enumC982970bgd, C982460bfo c982460bfo3) {
                                        C982170bfL c982170bfL = this;
                                        if (c982460bfo3 != null) {
                                            c982170bfL.LJJJJJ(c982460bfo3);
                                            c982170bfL.LJJI(c982460bfo3.LJI);
                                        } else {
                                            c982170bfL.getClass();
                                        }
                                    }

                                    @Override // X.InterfaceC983620bhg
                                    public final void LIZJ(EnumC982970bgd enumC982970bgd, EnumC982990bgf enumC982990bgf) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("onHandleAudienceInfoResult");
                                        sbLIZ2.append(", validFailed, scene=");
                                        sbLIZ2.append(enumC982970bgd);
                                        sbLIZ2.append(", failReason=");
                                        sbLIZ2.append(enumC982990bgf);
                                        sbLIZ2.append(", competitionId=");
                                        sbLIZ2.append(c982460bfo2.LIZJ.LIZJ);
                                        C20441214yg.LJ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                };
                                C981480beE c981480beELJJIII = LJJIII();
                                c982210bfP.getClass();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onHandleAudienceInfoResult");
                                sbLIZ2.append(", info = ");
                                sbLIZ2.append(c982460bfo2);
                                C20441214yg.LJIIIZ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                if (C973910bS1.LIZIZ(C950220apo.LIZLLL(), c982460bfo2.LIZJ.LIZJ)) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("onHandleAudienceInfoResult");
                                    sbLIZ3.append(", return by checkRoomFinishCompetitionId = true, competitionId=");
                                    sbLIZ3.append(c982460bfo2.LIZJ.LIZJ);
                                    C20441214yg.LJ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ3));
                                    interfaceC983620bhg.LIZJ(EnumC982970bgd.SCENE_INFO, EnumC982990bgf.FAIL_REASON_HIT_FINISH_CACHE);
                                } else {
                                    EnumC982970bgd enumC982970bgd = EnumC982970bgd.SCENE_INFO;
                                    interfaceC983620bhg.LIZIZ(enumC982970bgd, c982460bfo2);
                                    if (!C982220bfQ.LIZIZ(c981480beELJJIII, C915980Zwa.LJI().LIZJ().LLF())) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("onHandleAudienceInfoResult");
                                        sbLIZ4.append(", return by isSEICompetitionIdValid = false, competitionId=");
                                        sbLIZ4.append(c982460bfo2.LIZJ.LIZJ);
                                        C20441214yg.LJ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ4));
                                        interfaceC983620bhg.LIZJ(enumC982970bgd, EnumC982990bgf.FAIL_REASON_ID_INVALID);
                                    } else {
                                        zLIZ = C982220bfQ.LIZ("onHandleAudienceInfoResult", c982460bfo2.LJ);
                                        if (!zLIZ) {
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("onHandleAudienceInfoResult");
                                            sbLIZ5.append(", return by checkCanTransitStatusByInfoResult = false, competitionId=");
                                            sbLIZ5.append(c982460bfo2.LIZJ.LIZJ);
                                            C20441214yg.LJ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ5));
                                            interfaceC983620bhg.LIZJ(enumC982970bgd, EnumC982990bgf.FAIL_REASON_STATUS_INVALID);
                                        } else {
                                            interfaceC983620bhg.LIZ(enumC982970bgd);
                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                            sbLIZ6.append("onHandleAudienceInfoResult");
                                            sbLIZ6.append(", checkInfo result = ");
                                            sbLIZ6.append(zLIZ);
                                            C20441214yg.LIZIZ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ6));
                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                            sbLIZ7.append("onHandleAudienceInfoResult");
                                            sbLIZ7.append(", checkResult = ");
                                            sbLIZ7.append(zLIZ);
                                            C20441214yg.LIZIZ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ7));
                                            return zLIZ;
                                        }
                                    }
                                }
                                zLIZ = false;
                                StringBuilder sbLIZ72 = C2188811AlT.LIZ();
                                sbLIZ72.append("onHandleAudienceInfoResult");
                                sbLIZ72.append(", checkResult = ");
                                sbLIZ72.append(zLIZ);
                                C20441214yg.LIZIZ("CompetitionStateNoneAudience", C2188811AlT.LIZIZ(sbLIZ72));
                                return zLIZ;
                            }
                        };
                    case 2:
                    case 3:
                        return new AbstractC981450beB<InterfaceC981590beP>(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM) { // from class: X.0beD
                            @Override // X.AbstractC981450beB
                            public final Set LJJIFFI() {
                                return C093Y.LIZJ(EnumC974260bSa.PREPARE, EnumC974260bSa.INVITED);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJ() {
                                C20441214yg.LIZIZ("CompetitionStateInviter", "onMicRoomStart, cancel invite");
                                InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                if (interfaceC981590bePLJJII != null) {
                                    interfaceC981590bePLJJII.LJ();
                                }
                                InterfaceC981590beP interfaceC981590bePLJJII2 = LJJII();
                                if (interfaceC981590bePLJJII2 != null) {
                                    interfaceC981590bePLJJII2.LIZLLL();
                                }
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIILL() {
                                InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                if (interfaceC981590bePLJJII != null) {
                                    interfaceC981590bePLJJII.LJIJJ(LJJIII().LJIIIZ, EnumC981380be4.CANCEL_BUTTON);
                                }
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZ(AbstractC982800bgM abstractC982800bgM2) {
                                EnumC975850bV9 enumC975850bV9;
                                Boolean boolValueOf;
                                super.LIZ(abstractC982800bgM2);
                                boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(this.LIZ.d3()));
                                Boolean boolValueOf2 = null;
                                if (abstractC982800bgM2 instanceof C982480bfq) {
                                    C982480bfq c982480bfq = (C982480bfq) abstractC982800bgM2;
                                    if (c982480bfq.LJI != C950220apo.LJFF()) {
                                        EnumC962960bAM enumC962960bAM = LJJIII().LJIIIIZZ;
                                        EnumC962960bAM enumC962960bAM2 = c982480bfq.LIZJ.LIZ;
                                        if (enumC962960bAM != enumC962960bAM2) {
                                            this.LIZ.LJIJ(enumC962960bAM2, "");
                                            AbstractC981450beB.LJJJIL(this, EnumC975850bV9.INVITE_MESSAGE, abstractC982800bgM2);
                                            return;
                                        }
                                        InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                        if (interfaceC981590bePLJJII != null) {
                                            boolValueOf = Boolean.valueOf(interfaceC981590bePLJJII.LJJII(c982480bfq));
                                        } else {
                                            boolValueOf = null;
                                        }
                                        if (C500260Jjc.LJJJI(boolValueOf)) {
                                            LJJIII().LJJIJ.LJFF = true;
                                            InterfaceC981590beP interfaceC981590bePLJJII2 = LJJII();
                                            if (interfaceC981590bePLJJII2 != null) {
                                                boolValueOf2 = Boolean.valueOf(interfaceC981590bePLJJII2.LJJJ(c982480bfq));
                                            }
                                            if (C500260Jjc.LJJJI(boolValueOf2)) {
                                                LJJIII().LJJIJ.getClass();
                                                AbstractC981450beB.LJJIJIIJIL(this, EnumC975850bV9.INVITER_MEANWHILE_AUTO_ACCEPT, abstractC982800bgM2);
                                                return;
                                            } else {
                                                if (LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptInvitationLogic()) {
                                                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851704));
                                                }
                                                AbstractC981450beB.LJJJIL(this, EnumC975850bV9.INVITER_MEANWHILE, abstractC982800bgM2);
                                                return;
                                            }
                                        }
                                        AbstractC981450beB.LJJJIL(this, EnumC975850bV9.INVITE_MESSAGE, abstractC982800bgM2);
                                        return;
                                    }
                                    return;
                                }
                                if (abstractC982800bgM2 instanceof C982470bfp) {
                                    AbstractC981450beB.LJJJJI(this, EnumC975850bV9.OPEN_MESSAGE, abstractC982800bgM2, null, 4);
                                    InterfaceC981590beP interfaceC981590bePLJJII3 = LJJII();
                                    if (interfaceC981590bePLJJII3 == null) {
                                        return;
                                    }
                                    interfaceC981590bePLJJII3.LIZLLL();
                                    return;
                                }
                                if (abstractC982800bgM2 instanceof C982450bfn) {
                                    C982450bfn c982450bfn = (C982450bfn) abstractC982800bgM2;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("handleAcceptMsg, server isRematch:$");
                                    sbLIZ.append(c982450bfn.LJFF.isRematch());
                                    sbLIZ.append(", local isRematch=");
                                    sbLIZ.append(this.LIZ.d3());
                                    C20441214yg.LIZIZ("CompetitionStateInviter", C2188811AlT.LIZIZ(sbLIZ));
                                    new C974560bT4().LJJIFFI(c982450bfn);
                                    if (c982450bfn.LJIIIZ == EnumC974260bSa.START) {
                                        AbstractC981450beB.LJJJJI(this, EnumC975850bV9.ACCEPT_MESSAGE, c982450bfn, null, 4);
                                    }
                                    InterfaceC981590beP interfaceC981590bePLJJII4 = LJJII();
                                    if (interfaceC981590bePLJJII4 == null) {
                                        return;
                                    }
                                    interfaceC981590bePLJJII4.LJIILJJIL(c982450bfn);
                                    return;
                                }
                                if (abstractC982800bgM2 instanceof C982870bgT) {
                                    C982870bgT c982870bgT = (C982870bgT) abstractC982800bgM2;
                                    if (!AbstractC981450beB.LJJIIJZLJL(this, c982870bgT.LIZJ.LIZJ)) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("handleMessage");
                                        sbLIZ2.append(", CompetitionRejectMessage, checkBattleIdSame = false, local competitionId=");
                                        sbLIZ2.append(LJJIII().LJIIIZ);
                                        sbLIZ2.append(", remote competitionId=");
                                        sbLIZ2.append(c982870bgT.LIZJ.LIZJ);
                                        C20441214yg.LJ("CompetitionStateInviter", C2188811AlT.LIZIZ(sbLIZ2));
                                        return;
                                    }
                                    InterfaceC981590beP interfaceC981590bePLJJII5 = LJJII();
                                    if (interfaceC981590bePLJJII5 != null) {
                                        interfaceC981590bePLJJII5.LJJIIZ(c982870bgT);
                                    }
                                    AbstractC981450beB.LJJIZ(this, EnumC975850bV9.REJECT_MESSAGE, abstractC982800bgM2, 4);
                                    return;
                                }
                                if (abstractC982800bgM2 instanceof C983020bgi) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("handleMessage");
                                    sbLIZ3.append(", CompetitionWithdrawMessage");
                                    C20441214yg.LJIIIZ("CompetitionStateInviter", C2188811AlT.LIZIZ(sbLIZ3));
                                    C983020bgi c983020bgi = (C983020bgi) abstractC982800bgM2;
                                    if (!AbstractC981450beB.LJJIIJZLJL(this, c983020bgi.LIZJ.LIZJ)) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("handleMessage");
                                        sbLIZ4.append(", CompetitionRejectMessage, checkBattleIdSame = false, local competitionId=");
                                        sbLIZ4.append(LJJIII().LJIIIZ);
                                        sbLIZ4.append(", remote competitionId=");
                                        sbLIZ4.append(c983020bgi.LIZJ.LIZJ);
                                        C20441214yg.LJ("CompetitionStateInviter", C2188811AlT.LIZIZ(sbLIZ4));
                                        return;
                                    }
                                    InterfaceC981590beP interfaceC981590bePLJJII6 = LJJII();
                                    if (interfaceC981590bePLJJII6 != null) {
                                        interfaceC981590bePLJJII6.LJJIJ(c983020bgi);
                                    }
                                    if (zLJJJI) {
                                        enumC975850bV9 = EnumC975850bV9.CANCEL_MESSAGE_REMATCH;
                                    } else {
                                        enumC975850bV9 = EnumC975850bV9.CANCEL_MESSAGE;
                                    }
                                    AbstractC981450beB.LJJIZ(this, enumC975850bV9, abstractC982800bgM2, 4);
                                    return;
                                }
                                super.LIZ(abstractC982800bgM2);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
                                super.LIZJ(enumC975850bV9);
                                LJJIIZI("updateDataWithStateDidEnter");
                                InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                if (interfaceC981590bePLJJII != null) {
                                    interfaceC981590bePLJJII.LJJIII();
                                }
                                LJJJJJL("stateDidEnter", true, enumC975850bV9);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJI(EnumC975850bV9 enumC975850bV9) {
                                super.LJI(enumC975850bV9);
                                InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                if (interfaceC981590bePLJJII != null) {
                                    interfaceC981590bePLJJII.LIZIZ();
                                }
                                InterfaceC981590beP interfaceC981590bePLJJII2 = LJJII();
                                if (interfaceC981590bePLJJII2 != null) {
                                    interfaceC981590bePLJJII2.LIZLLL();
                                }
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJII(long j) {
                                super.LJII(j);
                                AbstractC981450beB.LJJIZ(this, EnumC975850bV9.INVITER_LEAVE_COHOST, null, 6);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIILJJIL(boolean z) {
                                super.LJIILJJIL(z);
                                if (z) {
                                    InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                    if (interfaceC981590bePLJJII != null) {
                                        interfaceC981590bePLJJII.LJI();
                                    }
                                    InterfaceC981590beP interfaceC981590bePLJJII2 = LJJII();
                                    if (interfaceC981590bePLJJII2 != null) {
                                        interfaceC981590bePLJJII2.LIZLLL();
                                    }
                                    InterfaceC981590beP interfaceC981590bePLJJII3 = LJJII();
                                    if (interfaceC981590bePLJJII3 != null) {
                                        interfaceC981590bePLJJII3.LJJ();
                                    }
                                    AbstractC981450beB.LJJIZ(this, EnumC975850bV9.INVITER_LEAVE_GUEST, null, 6);
                                }
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
                                super.LIZIZ(enumC962960bAM, str);
                                LJJJJJL("onClick", false, null);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJFF(long j, String str) {
                                super.LJFF(j, str);
                                InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                if (interfaceC981590bePLJJII != null) {
                                    interfaceC981590bePLJJII.LJIIJ(C500260Jjc.LJJIFFI(Boolean.valueOf(this.LIZ.d3())));
                                }
                                InterfaceC981590beP interfaceC981590bePLJJII2 = LJJII();
                                if (interfaceC981590bePLJJII2 != null) {
                                    interfaceC981590bePLJJII2.LIZLLL();
                                }
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIILIIL(EnumC962960bAM enumC962960bAM, int i) {
                                super.LJIILIIL(enumC962960bAM, i);
                                C766270U4b.LIZLLL(2131851645);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
                                super.LJIIIIZZ(i, i2, abnormalDisconnectReason);
                                InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                if (interfaceC981590bePLJJII != null) {
                                    interfaceC981590bePLJJII.LJIIJ(false);
                                }
                                InterfaceC981590beP interfaceC981590bePLJJII2 = LJJII();
                                if (interfaceC981590bePLJJII2 != null) {
                                    interfaceC981590bePLJJII2.LIZLLL();
                                }
                                AbstractC981450beB.LJJIZ(this, EnumC975850bV9.INVITER_LEAVE_COHOST, null, 6);
                            }

                            public final void LJJJJJL(String str, boolean z, EnumC975850bV9 enumC975850bV9) {
                                boolean z2 = LJJIII().LJJIJ.LJ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("openInvitationPanel");
                                sbLIZ.append(", status = ");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(", source=");
                                sbLIZ.append(str);
                                sbLIZ.append(", isInitialOpen=");
                                sbLIZ.append(z);
                                sbLIZ.append(", initialIsRematch=");
                                sbLIZ.append(z2);
                                C20441214yg.LIZIZ("CompetitionStateInviter", C2188811AlT.LIZIZ(sbLIZ));
                                InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                if (interfaceC981590bePLJJII != null) {
                                    LJJIII().LJJIIZI.getClass();
                                    String str2 = C973910bS1.LIZIZ;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    LJJIII().getClass();
                                    interfaceC981590bePLJJII.LJJIJIL(z, z2, str2, new AwS155S0110000_15(this, z2, 1), new AwS629S0100000_15(this, 75), new AwS381S0200000_15(this, enumC975850bV9, 106), new AwS594S0100000_15(this, 785), new AwS594S0100000_15(this, 786), new AwS559S0100000_15(this, 804), new AwS559S0100000_15(this, 805));
                                }
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void Z2(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
                                super.Z2(list, list2, customLinkMessage);
                                InterfaceC981590beP interfaceC981590bePLJJII = LJJII();
                                if (interfaceC981590bePLJJII != null) {
                                    interfaceC981590bePLJJII.LJIIJ(true);
                                }
                                InterfaceC981590beP interfaceC981590bePLJJII2 = LJJII();
                                if (interfaceC981590bePLJJII2 != null) {
                                    interfaceC981590bePLJJII2.LIZLLL();
                                }
                            }
                        };
                    case 4:
                    case 5:
                        return new C981440beA(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM);
                    case 6:
                        if (this.LIZ) {
                            return new C982030bf7(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM, c982460bfo);
                        }
                        return new AbstractC981980bf2<InterfaceC983920biA>(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM, c982460bfo) { // from class: X.0bf4
                            public final C982460bfo LJIIIIZZ;
                            public final BPEAHandler LJIIIZ = new BPEAHandler(Looper.getMainLooper());
                            public final ARunnableS115S0100000_15 LJIIJ = new ARunnableS115S0100000_15(this, 150);

                            @Override // X.AbstractC981450beB
                            public final Set LJJIFFI() {
                                return C093Y.LIZJ(EnumC974260bSa.START);
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZ(AbstractC982800bgM abstractC982800bgM2) {
                                if (abstractC982800bgM2 instanceof C982490bfr) {
                                    C982490bfr c982490bfr = (C982490bfr) abstractC982800bgM2;
                                    if (!AbstractC981450beB.LJJIIJZLJL(this, c982490bfr.LIZJ.LIZJ)) {
                                        C20441214yg.LJ("CompetitionStatePlayingAudience", "CompetitionSettlementEndMessage, checkBattleIdSame = false");
                                        return;
                                    } else if (c982490bfr.LJII == EnumC982750bgH.CUTSHORT) {
                                        LJJJJLI(c982490bfr);
                                        return;
                                    } else {
                                        AbstractC981450beB.LJJJJ(this, EnumC975850bV9.SETTLE_FINISH_MESSAGE_AUDIENCE, abstractC982800bgM2, 4);
                                        return;
                                    }
                                }
                                if (abstractC982800bgM2 instanceof C982530bfv) {
                                    if (!AbstractC981450beB.LJJIIJZLJL(this, abstractC982800bgM2.LIZJ.LIZJ)) {
                                        C20441214yg.LJ("CompetitionStatePlayingAudience", "CompetitionFinishMessage, checkBattleIdSame = false");
                                        return;
                                    } else {
                                        AbstractC981450beB.LJJIJLIJ(this, EnumC975850bV9.SETTLE_CUT_SHORT_MESSAGE_AUDIENCE, abstractC982800bgM2, null, 4);
                                        return;
                                    }
                                }
                                super.LIZ(abstractC982800bgM2);
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
                                super.LIZJ(enumC975850bV9);
                                C978500bZQ.LIZIZ("match_in_progress");
                                AbstractC982800bgM abstractC982800bgM2 = this.LIZJ;
                                if (abstractC982800bgM2 != null) {
                                    if (!(abstractC982800bgM2 instanceof C982470bfp)) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("handleAudienceStartMessage");
                                        sbLIZ.append(", return by message not CompetitionStartMessage, message=");
                                        sbLIZ.append(abstractC982800bgM2);
                                        C20441214yg.LIZIZ("CompetitionStatePlayingAudience", C2188811AlT.LIZIZ(sbLIZ));
                                    } else {
                                        try {
                                            LJJJJIZL(abstractC982800bgM2);
                                            LJJI(((C982470bfp) abstractC982800bgM2).LJII);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("handleAudienceStartMessage");
                                            sbLIZ2.append(", exceptions, Exception = ");
                                            sbLIZ2.append(e);
                                            C20441214yg.LJ("CompetitionStatePlayingAudience", C2188811AlT.LIZIZ(sbLIZ2));
                                        }
                                    }
                                } else {
                                    C982460bfo c982460bfo2 = this.LJIIIIZZ;
                                    if (c982460bfo2 != null) {
                                        LJJJJJ(c982460bfo2);
                                    }
                                }
                                InterfaceC983130bgt interfaceC983130bgt = (InterfaceC983130bgt) LJJII();
                                if (interfaceC983130bgt != null) {
                                    interfaceC983130bgt.LJJIJL(this.LJIIIIZZ, this.LIZJ, enumC975850bV9);
                                }
                                AbstractC982800bgM abstractC982800bgM3 = this.LIZJ;
                                InterfaceC983130bgt interfaceC983130bgt2 = (InterfaceC983130bgt) LJJII();
                                if (interfaceC983130bgt2 != null) {
                                    interfaceC983130bgt2.LJIJJLI(this.LJIIIIZZ, abstractC982800bgM3, enumC975850bV9);
                                }
                                C945320ahu c945320ahu = LJJIII().LJIJJ;
                                InterfaceC983920biA interfaceC983920biA = (InterfaceC983920biA) LJJII();
                                if (interfaceC983920biA != null) {
                                    interfaceC983920biA.LJIILL(c945320ahu);
                                }
                                C973760bRm.LIZ.LIZIZ();
                                C973760bRm.LIZIZ.LIZIZ();
                                C973690bRf.LIZ.LJJI(false);
                                C970920bNC c970920bNC = new C970920bNC();
                                long j = LJJIII().LJIIIZ;
                                List<C982390bfh> list = LJJIII().LJIILJJIL;
                                c970920bNC.LJIIL(0, "remainTime", true);
                                c970920bNC.LJIIL(0, "stage", true);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (C982390bfh c982390bfh : list) {
                                    linkedHashMap.put(Long.valueOf(c982390bfh.LIZ), Long.valueOf(c982390bfh.LIZIZ));
                                }
                                AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "scores", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkedHashMap), true);
                                String str = C973910bS1.LJII.get(Long.valueOf(j));
                                if (str == null) {
                                    str = "";
                                }
                                c970920bNC.LJIIL(str, Scene.SCENE_SERVICE, true);
                                c970920bNC.LJIJJLI("battle_start");
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJI(EnumC975850bV9 enumC975850bV9) {
                                super.LJI(enumC975850bV9);
                                this.LJIIIZ.removeCallbacks(this.LJIIJ);
                                DataChannel dataChannel2 = this.LIZ.getDataChannel();
                                if (dataChannel2 != null) {
                                    dataChannel2.zQ2(this);
                                }
                                LJJ("stateWillLeave");
                                C973760bRm.LIZIZ.LIZJ();
                                C973760bRm.LIZJ.LIZJ();
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIIJ(C945320ahu c945320ahu) {
                                super.LJIIJ(c945320ahu);
                                InterfaceC983920biA interfaceC983920biA = (InterfaceC983920biA) LJJII();
                                if (interfaceC983920biA != null) {
                                    interfaceC983920biA.LJIILL(c945320ahu);
                                }
                            }

                            @Override // X.AbstractC981980bf2
                            public final void LJJJJZ(C983300bhA c983300bhA) {
                                super.LJJJJZ(c983300bhA);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onStateTransitCountdownStart");
                                sbLIZ.append(", source=");
                                sbLIZ.append(c983300bhA.LIZ);
                                sbLIZ.append(", countdownSeconds = ");
                                sbLIZ.append(c983300bhA.LIZIZ);
                                C20441214yg.LJIIIZ("CompetitionStatePlayingAudience", C2188811AlT.LIZIZ(sbLIZ));
                                LJJ("onStateTransitCountdownStart");
                                C982320bfa.LIZ(LJJIII().LJIIIIZZ, EnumC982850bgR.PLAYING, C950220apo.LJ(), 0L, c983300bhA.LIZIZ, true, AFwS250S0000000_15.get$arr$(185), new AwS559S0100000_15(this, 854));
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
                                super.LIZIZ(enumC962960bAM, str);
                                long j = LJJIII().LJIIIZ;
                                InterfaceC983470bhR interfaceC983470bhR = (InterfaceC983470bhR) LJJII();
                                if (interfaceC983470bhR != null) {
                                    interfaceC983470bhR.LJIJI(j, str, AFwS299S0000000_15.get$arr$(39));
                                }
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void Z2(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
                                super.Z2(list, list2, customLinkMessage);
                            }

                            {
                                this.LJIIIIZZ = c982460bfo;
                            }
                        };
                    case 7:
                        if (this.LIZ) {
                            return new AbstractC981980bf2<InterfaceC983270bh7>(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM, c982460bfo) { // from class: X.0bfJ
                                public final C982460bfo LJIIIIZZ;

                                @Override // X.AbstractC981450beB
                                public final Set LJJIFFI() {
                                    return C093Y.LIZJ(EnumC974260bSa.SETTLE);
                                }

                                @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LIZ(AbstractC982800bgM abstractC982800bgM2) {
                                    super.LIZ(abstractC982800bgM2);
                                }

                                @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
                                    super.LIZJ(enumC975850bV9);
                                    if (enumC975850bV9 == EnumC975850bV9.TIME_OVER_SETTLEMENT) {
                                        InterfaceC983130bgt interfaceC983130bgt = (InterfaceC983130bgt) LJJII();
                                        if (interfaceC983130bgt != null) {
                                            interfaceC983130bgt.LJJIJL(this.LJIIIIZZ, this.LIZJ, enumC975850bV9);
                                        }
                                        InterfaceC983130bgt interfaceC983130bgt2 = (InterfaceC983130bgt) LJJII();
                                        if (interfaceC983130bgt2 != null) {
                                            interfaceC983130bgt2.LJIJJLI(this.LJIIIIZZ, this.LIZJ, enumC975850bV9);
                                            return;
                                        }
                                        return;
                                    }
                                    AbstractC982800bgM abstractC982800bgM2 = this.LIZJ;
                                    if (abstractC982800bgM2 == null) {
                                        return;
                                    }
                                    super.LIZ(abstractC982800bgM2);
                                }

                                @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LJI(EnumC975850bV9 enumC975850bV9) {
                                    super.LJI(enumC975850bV9);
                                    C982320bfa.LIZJ("stateWillLeave_CompetitionStateSettlementAnchor");
                                    this.LJ.removeCallbacksAndMessages(null);
                                }

                                @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LJIJI(long j) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("onForceQuit, reason = ");
                                    sbLIZ.append(j);
                                    C20441214yg.LJIIIZ("CompetitionStateSettlementAnchor", C2188811AlT.LIZIZ(sbLIZ));
                                    AbstractC981980bf2.LJJJJZI(this);
                                }

                                @Override // X.AbstractC981980bf2
                                public final void LJJJJZ(C983300bhA c983300bhA) {
                                    super.LJJJJZ(c983300bhA);
                                    C982320bfa.LIZ(LJJIII().LJIIIIZZ, EnumC982850bgR.SETTLEMENT, C950220apo.LJ(), 0L, c983300bhA.LIZIZ, false, AFwS250S0000000_15.get$arr$(179), new AwS559S0100000_15(this, 806));
                                }

                                @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                                public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
                                    super.LIZIZ(enumC962960bAM, str);
                                    long j = LJJIII().LJIIIZ;
                                    InterfaceC983270bh7 interfaceC983270bh7 = (InterfaceC983270bh7) LJJII();
                                    if (interfaceC983270bh7 != null) {
                                        interfaceC983270bh7.LJJIIZI(j, str, new AwS629S0100000_15(this, 77));
                                    }
                                }

                                {
                                    this.LJIIIIZZ = c982460bfo;
                                }
                            };
                        }
                        return new C981970bf1(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM, c982460bfo);
                    case 8:
                        return new AbstractC981980bf2<InterfaceC983570bhb>(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM, c982460bfo) { // from class: X.0bf3
                            public final C982460bfo LJIIIIZZ;

                            @Override // X.AbstractC981450beB
                            public final Set LJJIFFI() {
                                return C093Y.LIZJ(EnumC974260bSa.PUNISH);
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZ(AbstractC982800bgM abstractC982800bgM2) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onReceiveMessage, message ");
                                sbLIZ.append(abstractC982800bgM2);
                                C20441214yg.LIZIZ("CompetitionStatePunishing", C2188811AlT.LIZIZ(sbLIZ));
                                if (abstractC982800bgM2 instanceof C982470bfp) {
                                    if (C176600m4.LIZIZ(Boolean.valueOf(this.LIZ.isAnchor()))) {
                                        C20441214yg.LIZIZ("CompetitionStatePunishing", "handleStartMessageOnPunishForAnchor");
                                        return;
                                    }
                                    C973690bRf c973690bRf = C973690bRf.LIZ;
                                    c973690bRf.LJIJI(LJJIII().LJIIIZ, this.LIZ.getRoomInfo());
                                    C955400ayA.LJJJJI();
                                    LJJIIZ();
                                    LJJJJIZL(abstractC982800bgM2);
                                    if (C982220bfQ.LIZIZ(LJJIII(), LJJIII().LJIJJ)) {
                                        AbstractC981450beB.LJJJJI(this, EnumC975850bV9.OPEN_MESSAGE_IN_PUNISH, abstractC982800bgM2, null, 4);
                                        return;
                                    }
                                    if (!LJJIII().LIZIZ) {
                                        c973690bRf.LJJI(true);
                                    }
                                    AbstractC981450beB.LJJIZ(this, EnumC975850bV9.OPEN_MESSAGE_IN_PUNISH, null, 6);
                                    return;
                                }
                                super.LIZ(abstractC982800bgM2);
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
                                Object objValueOf;
                                super.LIZJ(enumC975850bV9);
                                LJJ("punish_start_statedidenter");
                                InterfaceC983130bgt interfaceC983130bgt = (InterfaceC983130bgt) LJJII();
                                if (interfaceC983130bgt != null) {
                                    interfaceC983130bgt.LJJIJL(this.LJIIIIZZ, this.LIZJ, enumC975850bV9);
                                }
                                InterfaceC983130bgt interfaceC983130bgt2 = (InterfaceC983130bgt) LJJII();
                                if (interfaceC983130bgt2 != null) {
                                    interfaceC983130bgt2.LJIJJLI(this.LJIIIIZZ, this.LIZJ, enumC975850bV9);
                                }
                                if (enumC975850bV9 == EnumC975850bV9.AUDIENCE_BATTLE_INFO_ROOM_ENTER && !LJJIII().LIZIZ) {
                                    C973690bRf.LIZ.LJJI(false);
                                }
                                C978500bZQ.LIZIZ("match_punish");
                                if (LJJIII().LIZIZ) {
                                    C974560bT4 c974560bT4 = new C974560bT4();
                                    c974560bT4.LJIIL(LJJIII().LJIJI.getString(), "result", true);
                                    c974560bT4.LJIJJLI("punish_start");
                                    LJJIII().LJJIJ.LJIILIIL = C158B.LIZ();
                                    return;
                                }
                                C970920bNC c970920bNC = new C970920bNC();
                                C981480beE c981480beELJJIII = LJJIII();
                                c970920bNC.LJIIL(c981480beELJJIII.LJIJI, "result", true);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (C982390bfh c982390bfh : c981480beELJJIII.LJIILJJIL) {
                                    linkedHashMap.put(Long.valueOf(c982390bfh.LIZ), Long.valueOf(c982390bfh.LIZIZ));
                                }
                                AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "scores", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkedHashMap), true);
                                AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "remainTime", Long.valueOf(c981480beELJJIII.LJIIJ.LIZIZ()), true);
                                C982390bfh c982390bfh2 = c981480beELJJIII.LJIILL.get(Long.valueOf(c981480beELJJIII.LJIILIIL));
                                if (c982390bfh2 != null) {
                                    objValueOf = Long.valueOf(c982390bfh2.LIZIZ);
                                } else {
                                    objValueOf = "";
                                }
                                AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "current_anchor_score", objValueOf, true);
                                c970920bNC.LJIJJLI("punish_start");
                                C973760bRm.LIZ.LIZIZ();
                                C973760bRm.LIZJ.LIZJ();
                                C973760bRm.LIZLLL.LIZIZ();
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZLLL(AwS55S0310000_15 awS55S0310000_15) {
                                super.LIZLLL(awS55S0310000_15);
                                LJJJJL(awS55S0310000_15);
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJI(EnumC975850bV9 enumC975850bV9) {
                                super.LJI(enumC975850bV9);
                                LJJ("punish_start_statewillleave");
                                if (!LJJIII().LIZIZ) {
                                    C973760bRm.LIZLLL.LIZJ();
                                }
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJII(long j) {
                                EnumC975850bV9 enumC975850bV9;
                                super.LJII(j);
                                LJJ("onForceTerminated");
                                if (j == 201) {
                                    enumC975850bV9 = EnumC975850bV9.PUNISH_REMATCH_RESTART;
                                    InterfaceC983570bhb interfaceC983570bhb = (InterfaceC983570bhb) LJJII();
                                    if (interfaceC983570bhb != null) {
                                        interfaceC983570bhb.LJJJIL(1, LJJIII().LJIIIZ, null, null);
                                    }
                                } else {
                                    enumC975850bV9 = EnumC975850bV9.TEST_DEFAULT_TERMINAL;
                                }
                                if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(this.LIZ.isAnchor()))) {
                                    C973890bRz.LJIILL.put(String.valueOf(LJJIII().LJIIIZ), Boolean.TRUE);
                                }
                                AbstractC981450beB.LJJIZ(this, enumC975850bV9, null, 6);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIIJ(C945320ahu c945320ahu) {
                                super.LJIIJ(c945320ahu);
                                if (!C982220bfQ.LIZJ(c945320ahu)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("updateCompetitionSEI");
                                    sbLIZ.append(", sei isCompetitionSEIValid is false, sei=");
                                    sbLIZ.append(c945320ahu);
                                    C20441214yg.LJ("CompetitionStatePunishing", C2188811AlT.LIZIZ(sbLIZ));
                                    return;
                                }
                                LJJIII().LJIJJ = c945320ahu;
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIJI(long j) {
                                AbstractC981980bf2.LJJJJZI(this);
                            }

                            @Override // X.AbstractC981980bf2
                            public final void LJJJJZ(C983300bhA c983300bhA) {
                                super.LJJJJZ(c983300bhA);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onStateTransitCountdownStart");
                                sbLIZ.append(", source=");
                                sbLIZ.append(c983300bhA.LIZ);
                                sbLIZ.append(", countdownSeconds = ");
                                sbLIZ.append(c983300bhA.LIZIZ);
                                C20441214yg.LJIIIZ("CompetitionStatePunishing", C2188811AlT.LIZIZ(sbLIZ));
                                C982320bfa.LIZ(LJJIII().LJIIIIZZ, EnumC982850bgR.PUNISHING, C950220apo.LJ(), 0L, c983300bhA.LIZIZ, true, new AwS249S0000000_15(4), new AwS559S0100000_15(this, 764));
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
                                super.LIZIZ(enumC962960bAM, str);
                                InterfaceC983570bhb interfaceC983570bhb = (InterfaceC983570bhb) LJJII();
                                if (interfaceC983570bhb != null) {
                                    interfaceC983570bhb.LJIILLIIL(str, new AwS629S0100000_15(this, 74));
                                }
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJFF(long j, String str) {
                                super.LJFF(j, str);
                                if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(this.LIZ.isAnchor())) && C915980Zwa.LJII().LLILZLL(true).size() < 2) {
                                    LJJ("onLinkMicFinish");
                                }
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
                                super.LJIIIIZZ(i, i2, abnormalDisconnectReason);
                                if (C915980Zwa.LJII().LLILZLL(true).size() < 2) {
                                    LJJ("onLinkMicFinish");
                                }
                            }

                            {
                                this.LJIIIIZZ = c982460bfo;
                            }
                        };
                    case BdTuring.TYPE_ECAF /* 9 */:
                        return new AbstractC981980bf2<InterfaceC985230bkH>(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM) { // from class: X.0bfA
                            public final BPEAHandler LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());

                            @Override // X.AbstractC981450beB
                            public final Set LJJIFFI() {
                                return C093Y.LIZJ(EnumC974260bSa.DRAW);
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZ(AbstractC982800bgM abstractC982800bgM2) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onReceiveMessage, message ");
                                sbLIZ.append(abstractC982800bgM2);
                                C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
                                if (!LiveCoHostTakeTheStageAtmosphereAudienceSetting.INSTANCE.isEnable()) {
                                    return;
                                }
                                if (abstractC982800bgM2 instanceof C982470bfp) {
                                    if (C176600m4.LIZIZ(Boolean.valueOf(this.LIZ.isAnchor()))) {
                                        C20441214yg.LIZIZ("CompetitionStatePlayingBase", "handleStartMessageOnPunishForAnchor");
                                        return;
                                    }
                                    if (!LJJIII().LIZIZ) {
                                        C973690bRf.LIZ.LJIJI(LJJIII().LJIIIZ, this.LIZ.getRoomInfo());
                                    }
                                    C955400ayA.LJJJJI();
                                    LJJIIZ();
                                    LJJJJIZL(abstractC982800bgM2);
                                    if (C982220bfQ.LIZIZ(LJJIII(), LJJIII().LJIJJ)) {
                                        AbstractC981450beB.LJJJJI(this, EnumC975850bV9.OPEN_MESSAGE_IN_PUNISH, abstractC982800bgM2, null, 4);
                                        return;
                                    }
                                    if (!LJJIII().LIZIZ) {
                                        C973690bRf.LIZ.LJJI(true);
                                    }
                                    AbstractC981450beB.LJJIZ(this, EnumC975850bV9.OPEN_MESSAGE_IN_PUNISH, null, 6);
                                    return;
                                }
                                super.LIZ(abstractC982800bgM2);
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
                                super.LIZJ(enumC975850bV9);
                                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LJIIIIZZ, new ARunnableS115S0100000_15(this, 137));
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZLLL(AwS55S0310000_15 awS55S0310000_15) {
                                super.LIZLLL(awS55S0310000_15);
                                LJJJJL(awS55S0310000_15);
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJI(EnumC975850bV9 enumC975850bV9) {
                                super.LJI(enumC975850bV9);
                                this.LJIIIIZZ.removeCallbacksAndMessages(null);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJII(long j) {
                                EnumC975850bV9 enumC975850bV9;
                                super.LJII(j);
                                this.LJIIIIZZ.removeCallbacksAndMessages(null);
                                LJJ("onForceTerminated");
                                if (j == 201) {
                                    enumC975850bV9 = EnumC975850bV9.PUNISH_REMATCH_RESTART;
                                } else {
                                    enumC975850bV9 = EnumC975850bV9.TEST_DEFAULT_TERMINAL;
                                }
                                if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(this.LIZ.isAnchor()))) {
                                    C973890bRz.LJIILL.put(String.valueOf(LJJIII().LJIIIZ), Boolean.TRUE);
                                }
                                AbstractC981450beB.LJJIZ(this, enumC975850bV9, null, 6);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIIL(long j) {
                                super.LJIIL(j);
                                this.LJIIIIZZ.removeCallbacksAndMessages(null);
                                C786410Ut5.LJLIIL(j, this.LJIIIIZZ, new ARunnableS115S0100000_15(this, 138));
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJIJI(long j) {
                                AbstractC981980bf2.LJJJJZI(this);
                            }

                            @Override // X.AbstractC981980bf2, X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
                                super.LIZIZ(enumC962960bAM, str);
                                InterfaceC983570bhb interfaceC983570bhb = (InterfaceC983570bhb) LJJII();
                                if (interfaceC983570bhb != null) {
                                    interfaceC983570bhb.LJIILLIIL(str, new AwS629S0100000_15(this, 73));
                                }
                            }
                        };
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return new AbstractC981450beB<Object>(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM) { // from class: X.0beF
                            public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

                            @Override // X.AbstractC981450beB
                            public final Set LJJIFFI() {
                                return C093Y.LIZJ(EnumC974260bSa.FINISH);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
                                Object objValueOf;
                                super.LIZJ(enumC975850bV9);
                                LJIL();
                                if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(this.LIZ.isAnchor()))) {
                                    C973890bRz.LJIILL.put(String.valueOf(LJJIII().LJIIIZ), Boolean.TRUE);
                                }
                                if (this.LIZIZ == EnumC974260bSa.FINISH) {
                                    C786410Ut5.LJJZZIII(this.LJ, new ARunnableS84S0200000_15(this, enumC975850bV9, 38));
                                }
                                if (LJJIII().LIZIZ) {
                                    C974560bT4 c974560bT4 = new C974560bT4();
                                    C981480beE c981480beELJJIII = LJJIII();
                                    if (C915980Zwa.LIZIZ().JV1(false).isPlayingIncludeResult()) {
                                        c974560bT4.LJIIL(0, "stage", true);
                                    } else {
                                        c974560bT4.LJIIL(1, "stage", true);
                                    }
                                    c974560bT4.LJIIL(c981480beELJJIII.LJIJI, "result", true);
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (C982390bfh c982390bfh : c981480beELJJIII.LJIILJJIL) {
                                        linkedHashMap.put(Long.valueOf(c982390bfh.LIZ), Long.valueOf(c982390bfh.LIZIZ));
                                    }
                                    AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "scores", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkedHashMap), true);
                                    C982390bfh c982390bfh2 = c981480beELJJIII.LJIILL.get(Long.valueOf(c981480beELJJIII.LJIILIIL));
                                    if (c982390bfh2 != null) {
                                        objValueOf = Long.valueOf(c982390bfh2.LIZIZ);
                                    } else {
                                        objValueOf = "";
                                    }
                                    AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "current_anchor_score", objValueOf, true);
                                    AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "match_duration", Long.valueOf(c981480beELJJIII.LJJIJ.LIZIZ()), true);
                                    AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "punish_duration", Long.valueOf(c981480beELJJIII.LJJIJ.LIZJ()), true);
                                    c974560bT4.LJIIL(c981480beELJJIII.LJJIJ.LJIILJJIL, "reason", true);
                                    c974560bT4.LJIIL(Boolean.TRUE, "in_final_call", true);
                                    c974560bT4.LJIJJLI("battle_finish");
                                } else {
                                    new C970920bNC().LJJII(LJJIII().LJJIJ.LIZIZ(), false);
                                }
                                C389001fE.LIZ("LiveMatchDidFinishEvent", null, System.currentTimeMillis(), false);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJI(EnumC975850bV9 enumC975850bV9) {
                                super.LJI(enumC975850bV9);
                                C978500bZQ.LIZJ();
                                Function0<Unit> function0 = LJJIII().LJJIII;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJII(long j) {
                                this.LJ.removeCallbacksAndMessages(null);
                                super.LJII(j);
                                AbstractC981450beB.LJJIZ(this, EnumC975850bV9.INVITE_REQUEST_FAILED, null, 6);
                            }
                        };
                    default:
                        return new AbstractC981450beB<InterfaceC981890bet>(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM) { // from class: X.0beN
                            @Override // X.AbstractC981450beB
                            public final Set LJJIFFI() {
                                return Collections.singleton(EnumC974260bSa.NONE);
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("stateDidEnter, bizType=");
                                sbLIZ.append(this.LIZ.getBizType());
                                sbLIZ.append(", status=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(", fromSource=");
                                sbLIZ.append(enumC975850bV9);
                                C20441214yg.LJ("CompetitionEmptyState", C2188811AlT.LIZIZ(sbLIZ));
                            }

                            @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
                            public final void LJI(EnumC975850bV9 enumC975850bV9) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("stateWillLeave, bizType=");
                                sbLIZ.append(this.LIZ.getBizType());
                                sbLIZ.append(", status=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(", fromSource=");
                                sbLIZ.append(enumC975850bV9);
                                C20441214yg.LJ("CompetitionEmptyState", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        };
                }
            }
        };
        C915980Zwa.LIZIZ().Zs0(C500260Jjc.LJJLIIIIJ(this.LIZJ), this);
        C974710bTJ c974710bTJ = new C974710bTJ(this.LIZJ);
        this.LJFF = c974710bTJ;
        c974710bTJ.LIZ(this.LIZJ);
        C981580beO c981580beO = this.LJIIIZ;
        if (c981580beO != null) {
            this.LJIIJJI = new C976640bWQ(zLJIIZILJ2, C500260Jjc.LJJLIIIIJ(this.LIZJ), this.LIZJ, false, r7, c981580beO, new InterfaceC981660beW() { // from class: X.0bfF
                @Override // X.InterfaceC981660beW
                public final <COORDINATOR extends InterfaceC981890bet> COORDINATOR LIZ(MatchBaseWidget matchBaseWidget2, InterfaceC981940bey interfaceC981940bey, boolean z, EnumC962960bAM enumC962960bAM, EnumC974260bSa enumC974260bSa) {
                    switch (C974290bSd.LIZ[enumC974260bSa.ordinal()]) {
                        case 1:
                            if (z) {
                                int i = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                                if (i != 1) {
                                    if (i != 2) {
                                        return new C981510beH(matchBaseWidget2, interfaceC981940bey);
                                    }
                                    return new C982950bgb(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C981510beH(matchBaseWidget2, interfaceC981940bey);
                            }
                            int i2 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    return new C983610bhf(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C983600bhe(matchBaseWidget2, interfaceC981940bey);
                            }
                            return new C983610bhf(matchBaseWidget2, interfaceC981940bey);
                        case 2:
                        case 3:
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("createInviterCoordinator, bizType = ");
                            sbLIZ.append(enumC962960bAM);
                            C20441214yg.LIZIZ("CompetitionCoordinatorRegistryImpl", C2188811AlT.LIZIZ(sbLIZ));
                            int i3 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    return new C981360be2(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C981670beX(matchBaseWidget2, interfaceC981940bey);
                            }
                            return new C981360be2(matchBaseWidget2, interfaceC981940bey);
                        case 4:
                        case 5:
                            int i4 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    C981370be3 c981370be3 = C981370be3.LJIILJJIL;
                                    if (c981370be3 != null && c981370be3.LIZ == matchBaseWidget2) {
                                        return c981370be3;
                                    }
                                    C981370be3 c981370be32 = new C981370be3(matchBaseWidget2, interfaceC981940bey);
                                    C981370be3.LJIILJJIL = c981370be32;
                                    return c981370be32;
                                }
                                C981680beY c981680beY = C981680beY.LJIILJJIL;
                                if (c981680beY != null && c981680beY.LIZ == matchBaseWidget2) {
                                    return c981680beY;
                                }
                                C981680beY c981680beY2 = new C981680beY(matchBaseWidget2, interfaceC981940bey);
                                C981680beY.LJIILJJIL = c981680beY2;
                                return c981680beY2;
                            }
                            C981370be3 c981370be33 = C981370be3.LJIILJJIL;
                            if (c981370be33 != null && c981370be33.LIZ == matchBaseWidget2) {
                                return c981370be33;
                            }
                            C981370be3 c981370be34 = new C981370be3(matchBaseWidget2, interfaceC981940bey);
                            C981370be3.LJIILJJIL = c981370be34;
                            return c981370be34;
                        case 6:
                            if (z) {
                                int i5 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        return new C981960bf0(matchBaseWidget2, interfaceC981940bey);
                                    }
                                    return new CatchBeansPlayingCoordinatorAnchor(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C981960bf0(matchBaseWidget2, interfaceC981940bey);
                            }
                            int i6 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    return new C981950bez(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C982010bf5(matchBaseWidget2, interfaceC981940bey);
                            }
                            return new C981950bez(matchBaseWidget2, interfaceC981940bey);
                        case 7:
                            if (z) {
                                int i7 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        return new C982050bf9(matchBaseWidget2, interfaceC981940bey);
                                    }
                                    return new C982120bfG(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C982050bf9(matchBaseWidget2, interfaceC981940bey);
                            }
                            int i8 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    return new C982130bfH(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C982090bfD(matchBaseWidget2, interfaceC981940bey);
                            }
                            return new C982130bfH(matchBaseWidget2, interfaceC981940bey);
                        case 8:
                            if (z) {
                                int i9 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                                if (i9 != 1) {
                                    if (i9 != 2) {
                                        return new C982040bf8(matchBaseWidget2, interfaceC981940bey);
                                    }
                                    return new C982070bfB(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C982040bf8(matchBaseWidget2, interfaceC981940bey);
                            }
                            int i10 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    return new C982100bfE(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C982380bfg(matchBaseWidget2, interfaceC981940bey);
                            }
                            return new C982100bfE(matchBaseWidget2, interfaceC981940bey);
                        case BdTuring.TYPE_ECAF /* 9 */:
                            if (z) {
                                int i11 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        return new C982140bfI(matchBaseWidget2, interfaceC981940bey);
                                    }
                                    return new C983100bgq(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C982140bfI(matchBaseWidget2, interfaceC981940bey);
                            }
                            int i12 = C974290bSd.LIZIZ[enumC962960bAM.ordinal()];
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    return new C982140bfI(matchBaseWidget2, interfaceC981940bey);
                                }
                                return new C983230bh3(matchBaseWidget2, interfaceC981940bey);
                            }
                            return new C982140bfI(matchBaseWidget2, interfaceC981940bey);
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            if (z) {
                                if (enumC962960bAM == EnumC962960bAM.TAKE_THE_STAGE) {
                                    return new AbstractC981930bex(matchBaseWidget2, interfaceC981940bey) { // from class: X.0bZZ
                                        @Override // X.AbstractC981930bex, X.InterfaceC981890bet
                                        public final void LJJIII() {
                                            if (C963580bBM.LIZ()) {
                                                C958040b2Q.LJIIJJI("finish_state_did_enter", this.LIZ.dataChannel, LJJJJJ(), EnumC958080b2U.TAKE_STAGE_EXIT);
                                            }
                                            Long lLJIIJ = C930540aK4.LJIIJ();
                                            C915120ZvC.LIZIZ(lLJIIJ != null ? lLJIIJ.longValue() : 0L, LJJJJJ().LIZIZ, 6, null, null, 24);
                                        }
                                    };
                                }
                                return new AbstractC981930bex(matchBaseWidget2, interfaceC981940bey) { // from class: X.0bZZ
                                    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
                                    public final void LJJIII() {
                                        if (C963580bBM.LIZ()) {
                                            C958040b2Q.LJIIJJI("finish_state_did_enter", this.LIZ.dataChannel, LJJJJJ(), EnumC958080b2U.TAKE_STAGE_EXIT);
                                        }
                                        Long lLJIIJ = C930540aK4.LJIIJ();
                                        C915120ZvC.LIZIZ(lLJIIJ != null ? lLJIIJ.longValue() : 0L, LJJJJJ().LIZIZ, 6, null, null, 24);
                                    }
                                };
                            }
                            if (enumC962960bAM == EnumC962960bAM.TAKE_THE_STAGE) {
                                return new AbstractC981930bex(matchBaseWidget2, interfaceC981940bey) { // from class: X.0bZZ
                                    @Override // X.AbstractC981930bex, X.InterfaceC981890bet
                                    public final void LJJIII() {
                                        if (C963580bBM.LIZ()) {
                                            C958040b2Q.LJIIJJI("finish_state_did_enter", this.LIZ.dataChannel, LJJJJJ(), EnumC958080b2U.TAKE_STAGE_EXIT);
                                        }
                                        Long lLJIIJ = C930540aK4.LJIIJ();
                                        C915120ZvC.LIZIZ(lLJIIJ != null ? lLJIIJ.longValue() : 0L, LJJJJJ().LIZIZ, 6, null, null, 24);
                                    }
                                };
                            }
                            return new AbstractC981930bex(matchBaseWidget2, interfaceC981940bey) { // from class: X.0bZZ
                                @Override // X.AbstractC981930bex, X.InterfaceC981890bet
                                public final void LJJIII() {
                                    if (C963580bBM.LIZ()) {
                                        C958040b2Q.LJIIJJI("finish_state_did_enter", this.LIZ.dataChannel, LJJJJJ(), EnumC958080b2U.TAKE_STAGE_EXIT);
                                    }
                                    Long lLJIIJ = C930540aK4.LJIIJ();
                                    C915120ZvC.LIZIZ(lLJIIJ != null ? lLJIIJ.longValue() : 0L, LJJJJJ().LIZIZ, 6, null, null, 24);
                                }
                            };
                        default:
                            return new InterfaceC981890bet() { // from class: X.0bi4
                                @Override // X.InterfaceC981890bet
                                public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
                                }

                                @Override // X.InterfaceC981890bet
                                public final void LIZIZ() {
                                }

                                @Override // X.InterfaceC981890bet
                                public final void LJFF() {
                                }

                                @Override // X.InterfaceC981890bet
                                public final void LJIIL(List list, List list2) {
                                }

                                @Override // X.InterfaceC981890bet
                                public final void LJJ() {
                                }

                                @Override // X.InterfaceC981890bet
                                public final void LJJIII() {
                                }
                            };
                    }
                }
            }, this.LJIIJ);
        }
        C974710bTJ c974710bTJ2 = this.LJFF;
        if (c974710bTJ2 != null) {
            c974710bTJ2.LIZJ = new InterfaceC952110asr() { // from class: X.0bWR
                @Override // X.InterfaceC952110asr
                public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
                    Long lValueOf;
                    C982690bgB c982690bgB;
                    C981480beE c981480beELJI;
                    long jLongValue;
                    Long lValueOf2;
                    C982690bgB c982690bgB2;
                    C981480beE c981480beELJI2;
                    C976020bVQ c976020bVQ = this.LIZ;
                    c976020bVQ.getClass();
                    if (!(abstractC982800bgM instanceof C982480bfq) && !(abstractC982800bgM instanceof C983020bgi) && !(abstractC982800bgM instanceof C982450bfn) && !(abstractC982800bgM instanceof C982870bgT) && !(abstractC982800bgM instanceof C982470bfp) && !(abstractC982800bgM instanceof C982490bfr) && !(abstractC982800bgM instanceof C982530bfv)) {
                        Long lValueOf3 = null;
                        if (!(abstractC982800bgM instanceof C982570bfz) && !(abstractC982800bgM instanceof C974760bTO)) {
                            if (abstractC982800bgM instanceof C982670bg9) {
                                if (c976020bVQ.LIZLLL) {
                                    C974560bT4 c974560bT4 = new C974560bT4();
                                    c974560bT4.LJIL(abstractC982800bgM);
                                    if (abstractC982800bgM instanceof C982670bg9) {
                                        C982670bg9 c982670bg9 = (C982670bg9) abstractC982800bgM;
                                        AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "action_by_userId", Long.valueOf(c982670bg9.LJFF.LIZ), true);
                                        AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "extra_time_interval", Long.valueOf(c982670bg9.LJI.LJII), true);
                                        AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "planned_settlement_end_time", Long.valueOf(c982670bg9.LJI.LJFF), true);
                                    }
                                    c974560bT4.LJIJJLI("settlement_start_message");
                                } else {
                                    C970920bNC c970920bNC = new C970920bNC();
                                    c970920bNC.LJIL(abstractC982800bgM);
                                    if (abstractC982800bgM instanceof C982670bg9) {
                                        C982670bg9 c982670bg92 = (C982670bg9) abstractC982800bgM;
                                        AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "action_by_userId", Long.valueOf(c982670bg92.LJFF.LIZ), true);
                                        AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "extra_time_interval", Long.valueOf(c982670bg92.LJI.LJII), true);
                                        AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "planned_settlement_end_time", Long.valueOf(c982670bg92.LJI.LJFF), true);
                                    }
                                    c970920bNC.LJIJJLI("settlement_start_message");
                                }
                            } else if ((abstractC982800bgM instanceof C982620bg4) && c976020bVQ.LIZLLL) {
                                C974560bT4 c974560bT42 = new C974560bT4();
                                TakeTheStageBizExtra takeTheStageBizExtraLIZIZ = C982410bfj.LIZIZ(abstractC982800bgM);
                                if (takeTheStageBizExtraLIZIZ != null) {
                                    List<TakeTheStageBizExtra.PerformAnchor> list = takeTheStageBizExtraLIZIZ.LIZ;
                                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                    Iterator<TakeTheStageBizExtra.PerformAnchor> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(Long.valueOf(it2.next().userId));
                                    }
                                    Long l = (Long) C13LP.LJJJLZIJ(0, arrayList);
                                    long jLongValue2 = 0;
                                    if (l != null) {
                                        jLongValue = l.longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    AbstractC962030b8r.LJIIJ(c974560bT42.LIZLLL, "select_uid", Long.valueOf(jLongValue), true);
                                    Long l2 = (Long) C13LP.LJJJLZIJ(0, arrayList);
                                    if (l2 != null) {
                                        jLongValue2 = l2.longValue();
                                    }
                                    AbstractC962030b8r.LJIIJ(c974560bT42.LIZLLL, "action_by_userId", Long.valueOf(jLongValue2), true);
                                    AbstractC962030b8r.LJIIJ(c974560bT42.LIZLLL, "order", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62), true);
                                    c974560bT42.LJIIL(takeTheStageBizExtraLIZIZ.switchTurnReason.getString(), "reason", true);
                                }
                                c974560bT42.LJIL(abstractC982800bgM);
                                c974560bT42.LJIJJLI("switch_turn_message");
                            }
                            InterfaceC976620bWO interfaceC976620bWO = c976020bVQ.LJIIJJI;
                            if (interfaceC976620bWO != null && (c981480beELJI2 = interfaceC976620bWO.LJI()) != null) {
                                lValueOf2 = Long.valueOf(c981480beELJI2.LJIIIZ);
                            } else {
                                lValueOf2 = null;
                            }
                            if (abstractC982800bgM != null && (c982690bgB2 = abstractC982800bgM.LIZJ) != null) {
                                lValueOf3 = Long.valueOf(c982690bgB2.LIZJ);
                            }
                            if (Intrinsics.LJFF(lValueOf2, lValueOf3)) {
                                InterfaceC976620bWO interfaceC976620bWO2 = c976020bVQ.LJIIJJI;
                                if (interfaceC976620bWO2 != null) {
                                    interfaceC976620bWO2.LJIJJ(abstractC982800bgM);
                                }
                                if (abstractC982800bgM != null) {
                                    CompetitionMessage competitionMessageLIZ = C982440bfm.LIZ(abstractC982800bgM);
                                    C975550bUf c975550bUf = c976020bVQ.LJIIIIZZ;
                                    if (c975550bUf != null) {
                                        c975550bUf.LJII(competitionMessageLIZ);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        InterfaceC976620bWO interfaceC976620bWO3 = c976020bVQ.LJIIJJI;
                        if (interfaceC976620bWO3 != null && (c981480beELJI = interfaceC976620bWO3.LJI()) != null) {
                            lValueOf = Long.valueOf(c981480beELJI.LJIIIZ);
                        } else {
                            lValueOf = null;
                        }
                        if (abstractC982800bgM instanceof C974760bTO) {
                            long j = ((C974760bTO) abstractC982800bgM).LJII;
                            if (lValueOf == null || lValueOf.longValue() != j) {
                                return;
                            }
                            InterfaceC976620bWO interfaceC976620bWO4 = c976020bVQ.LJIIJJI;
                            if (interfaceC976620bWO4 != null) {
                                interfaceC976620bWO4.LJIJJ(abstractC982800bgM);
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onReceiveScoreChangeMessage, message = ");
                            sbLIZ.append(abstractC982800bgM);
                            C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
                            CompetitionMessage competitionMessageLIZ2 = C982440bfm.LIZ(abstractC982800bgM);
                            C975550bUf c975550bUf2 = c976020bVQ.LJIIIIZZ;
                            if (c975550bUf2 == null) {
                                return;
                            }
                            c975550bUf2.LJII(competitionMessageLIZ2);
                            return;
                        }
                        if (abstractC982800bgM != null && (c982690bgB = abstractC982800bgM.LIZJ) != null) {
                            lValueOf3 = Long.valueOf(c982690bgB.LIZJ);
                        }
                        if (!Intrinsics.LJFF(lValueOf, lValueOf3)) {
                            return;
                        }
                        InterfaceC976620bWO interfaceC976620bWO5 = c976020bVQ.LJIIJJI;
                        if (interfaceC976620bWO5 != null) {
                            interfaceC976620bWO5.LJIJJ(abstractC982800bgM);
                        }
                        if (abstractC982800bgM == null) {
                            return;
                        }
                        CompetitionMessage competitionMessageLIZ3 = C982440bfm.LIZ(abstractC982800bgM);
                        C975550bUf c975550bUf3 = c976020bVQ.LJIIIIZZ;
                        if (c975550bUf3 == null) {
                            return;
                        }
                        c975550bUf3.LJII(competitionMessageLIZ3);
                        return;
                    }
                    c976020bVQ.LJIIJJI(abstractC982800bgM);
                }
            };
        }
        DataChannel dataChannel2 = matchBaseWidget.dataChannel;
        C982320bfa.LIZ = dataChannel2;
        C982310bfZ.LIZ = dataChannel2;
        this.LJI = new InterfaceC985020bjw() { // from class: X.0bWN
            @Override // X.InterfaceC985020bjw
            public final void LIZJ() {
            }

            @Override // X.InterfaceC985020bjw
            public final void LIZIZ() {
                C976020bVQ c976020bVQ = this.LIZ;
                if (c976020bVQ.LIZLLL) {
                    c976020bVQ.LJFF(C973660bRc.LJJJJJL);
                }
            }

            @Override // X.InterfaceC985020bjw
            public final void LIZ(long j) {
                InterfaceC976620bWO interfaceC976620bWO;
                if (C915980Zwa.LIZ().kg2()) {
                    InterfaceC976620bWO interfaceC976620bWO2 = this.LIZ.LJIIJJI;
                    if (interfaceC976620bWO2 != null) {
                        interfaceC976620bWO2.LJIIL(j);
                        return;
                    }
                    return;
                }
                C976020bVQ c976020bVQ = this.LIZ;
                if (!c976020bVQ.LIZLLL || (interfaceC976620bWO = c976020bVQ.LJIIJJI) == null) {
                    return;
                }
                interfaceC976620bWO.LJIIL(j);
            }
        };
        this.LJII = new InterfaceC978000bYc() { // from class: X.0bWj
            @Override // X.InterfaceC978000bYc
            public final void onClick(String str) {
                C976020bVQ c976020bVQ = this.LIZ;
                c976020bVQ.LIZLLL(str, c976020bVQ.LJIIJ.LJIIIIZZ);
            }
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init isAnchor=");
        sbLIZ.append(zLJIIZILJ2);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mainEngine=");
        sbLIZ.append(this.LJIIJJI);
        C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final EnumC974260bSa LIZ(boolean z) {
        EnumC974260bSa enumC974260bSaY2;
        EnumC974260bSa enumC974260bSaY22;
        if (!z) {
            if (this.LJIIJJI == null) {
                C20441214yg.LJ("CompetitionAnchorAudienceManager", "getCurrentBizStatus, isRematch=false but mainEngine isNull");
            }
            InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
            if (interfaceC976620bWO == null || (enumC974260bSaY22 = interfaceC976620bWO.Y2()) == null) {
                return EnumC974260bSa.NONE;
            }
            return enumC974260bSaY22;
        }
        if (this.LJIIL == null) {
            C20441214yg.LJ("CompetitionAnchorAudienceManager", "getCurrentBizStatus, isRematch=true but rematchEngine isNull");
        }
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ != null && (enumC974260bSaY2 = c976640bWQ.Y2()) != null) {
            return enumC974260bSaY2;
        }
        return EnumC974260bSa.NONE;
    }

    public final C981480beE LIZIZ(boolean z) {
        if (!z) {
            if (this.LJIIJJI == null) {
                C20441214yg.LJ("CompetitionAnchorAudienceManager", "getCurrentModel, isRematch=false but mainEngine isNull");
            }
            InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
            if (interfaceC976620bWO != null) {
                return interfaceC976620bWO.LJI();
            }
            return null;
        }
        if (this.LJIIL == null) {
            C20441214yg.LJ("CompetitionAnchorAudienceManager", "getCurrentModel, isRematch=true but rematchEngine isNull");
        }
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ != null) {
            return c976640bWQ.LJII;
        }
        return null;
    }

    public final boolean LIZJ(C982460bfo c982460bfo) {
        Boolean boolValueOf;
        C975550bUf c975550bUf;
        EnumC970440bMQ enumC970440bMQLIZ = C970430bMP.LIZ(0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Audience handle battleInfo scene = ");
        sbLIZ.append(enumC970440bMQLIZ);
        C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO != null) {
            boolValueOf = Boolean.valueOf(interfaceC976620bWO.LJIIJJI(c982460bfo, enumC970440bMQLIZ));
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf) && (c975550bUf = this.LJIIIIZZ) != null) {
            c975550bUf.LJI(new C970860bN6(c982460bfo), enumC970440bMQLIZ);
        }
        return C176600m4.LIZIZ(boolValueOf);
    }

    public final void LJFF(String str) {
        Integer numValueOf;
        EnumC962960bAM enumC962960bAM = this.LJIIJ.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickRematch, mainEngine = ");
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO != null) {
            numValueOf = Integer.valueOf(interfaceC976620bWO.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", bizType=");
        sbLIZ.append(enumC962960bAM);
        C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ != null) {
            c976640bWQ.LIZLLL = true;
            c976640bWQ.LIZJ(enumC962960bAM, str);
        }
        new C974560bT4().LJIJJLI("rematch_click");
    }

    public final void LJII(boolean z) {
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ != null) {
            c976640bWQ.LJIILJJIL(z);
        }
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO != null) {
            interfaceC976620bWO.LJIILJJIL(z);
        }
    }

    public final void LJIIJJI(AbstractC982800bgM abstractC982800bgM) {
        C981550beL c981550beL;
        long j;
        InterfaceC976620bWO interfaceC976620bWO;
        boolean z = abstractC982800bgM instanceof C982480bfq;
        Long lValueOf = null;
        if (!z && !(abstractC982800bgM instanceof C983020bgi) && !(abstractC982800bgM instanceof C982450bfn) && !(abstractC982800bgM instanceof C982870bgT) && !(abstractC982800bgM instanceof C982470bfp)) {
            if (abstractC982800bgM instanceof C982490bfr) {
                if (((C982490bfr) abstractC982800bgM).LJII == EnumC982750bgH.CUTSHORT) {
                    InterfaceC976620bWO interfaceC976620bWO2 = this.LJIIJJI;
                    if (interfaceC976620bWO2 != null) {
                        interfaceC976620bWO2.LJIJJ(abstractC982800bgM);
                    }
                    C976640bWQ c976640bWQ = this.LJIIL;
                    if (c976640bWQ != null) {
                        c976640bWQ.LJIJJ(abstractC982800bgM);
                    }
                    this.LJIIL = null;
                } else {
                    InterfaceC976620bWO interfaceC976620bWO3 = this.LJIIJJI;
                    if (interfaceC976620bWO3 != null) {
                        interfaceC976620bWO3.LJIJJ(abstractC982800bgM);
                    }
                }
            } else if ((abstractC982800bgM instanceof C982530bfv) && (interfaceC976620bWO = this.LJIIJJI) != null) {
                interfaceC976620bWO.LJIJJ(abstractC982800bgM);
            }
        } else {
            InterfaceC976620bWO interfaceC976620bWO4 = this.LJIIL;
            if (interfaceC976620bWO4 != null || (interfaceC976620bWO4 = this.LJIIJJI) != null) {
                interfaceC976620bWO4.LJIJJ(abstractC982800bgM);
            }
        }
        if (z) {
            C974560bT4 c974560bT4 = new C974560bT4();
            c974560bT4.LJIL(abstractC982800bgM);
            AbstractC963310bAv.LJJ(c974560bT4, abstractC982800bgM.LIZJ.LIZ);
            c974560bT4.LJIIL("invitee", "role_type", true);
            Object obj = abstractC982800bgM.LIZIZ;
            if ((obj instanceof CompetitionMessage) && obj != null) {
                AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "invite_message_fetch_cost", Long.valueOf(AbstractC963310bAv.LJJI(abstractC982800bgM)), true);
            }
            C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM91 != null) {
                c981550beL = c981480beEM91.LJJIJ;
            } else {
                c981550beL = null;
            }
            if (abstractC982800bgM instanceof C982480bfq) {
                C982480bfq c982480bfq = (C982480bfq) abstractC982800bgM;
                AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "action_by_userId", Long.valueOf(c982480bfq.LJI), true);
                if (c981550beL != null) {
                    if (c982480bfq.LJFF.isRematch()) {
                        j = c981550beL.LJIILL + 1;
                    } else {
                        j = 0;
                    }
                    c981550beL.LJIILL = j;
                    lValueOf = Long.valueOf(c981550beL.LJIILL);
                }
            } else if (c981550beL != null) {
                lValueOf = Long.valueOf(c981550beL.LJIILL);
            }
            AbstractC962030b8r.LJIIJ(c974560bT4.LIZLLL, "rematch_count", lValueOf, true);
            c974560bT4.LJIJJLI("invite_message");
            return;
        }
        if ((abstractC982800bgM instanceof C983020bgi) || (abstractC982800bgM instanceof C982450bfn) || (abstractC982800bgM instanceof C982870bgT)) {
            return;
        }
        if (abstractC982800bgM instanceof C982470bfp) {
            if (this.LIZLLL) {
                C974560bT4 c974560bT42 = new C974560bT4();
                Object obj2 = abstractC982800bgM.LIZIZ;
                if ((obj2 instanceof CompetitionMessage) && obj2 != null) {
                    AbstractC962030b8r.LJIIJ(c974560bT42.LIZLLL, "open_message_fetch_cost", Long.valueOf(AbstractC963310bAv.LJJI(abstractC982800bgM)), true);
                }
                if (abstractC982800bgM instanceof C982470bfp) {
                    AbstractC962030b8r.LJIIJ(c974560bT42.LIZLLL, "action_by_userId", Long.valueOf(((C982470bfp) abstractC982800bgM).LJI), true);
                }
                c974560bT42.LJIL(abstractC982800bgM);
                c974560bT42.LJIJJLI("open_message");
                return;
            }
            C970920bNC c970920bNC = new C970920bNC();
            c970920bNC.LJIL(abstractC982800bgM);
            c970920bNC.LJIJJLI("open_message");
            return;
        }
        if (abstractC982800bgM instanceof C982490bfr) {
            if (this.LIZLLL) {
                if (((C982490bfr) abstractC982800bgM).LJII == EnumC982750bgH.CUTSHORT) {
                    C974560bT4 c974560bT43 = new C974560bT4();
                    c974560bT43.LJIL(abstractC982800bgM);
                    c974560bT43.LJIJJLI("cut_short_message");
                    return;
                }
                C974560bT4 c974560bT44 = new C974560bT4();
                c974560bT44.LJIL(abstractC982800bgM);
                if (abstractC982800bgM instanceof C982490bfr) {
                    C982490bfr c982490bfr = (C982490bfr) abstractC982800bgM;
                    c974560bT44.LJIIL(c982490bfr.LJI.getString(), "result", true);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C982390bfh c982390bfh : c982490bfr.LJFF) {
                        linkedHashMap.put(Long.valueOf(c982390bfh.LIZ), Long.valueOf(c982390bfh.LIZIZ));
                    }
                    AbstractC962030b8r.LJIIJ(c974560bT44.LIZLLL, "scores", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkedHashMap), true);
                }
                c974560bT44.LJIJJLI("battle_finish_message");
                c974560bT44.LJIJJLI("settlement_message");
                return;
            }
            if (((C982490bfr) abstractC982800bgM).LJII == EnumC982750bgH.CUTSHORT) {
                return;
            }
            C970920bNC c970920bNC2 = new C970920bNC();
            c970920bNC2.LJIL(abstractC982800bgM);
            if (abstractC982800bgM instanceof C982490bfr) {
                C982490bfr c982490bfr2 = (C982490bfr) abstractC982800bgM;
                c970920bNC2.LJIIL(c982490bfr2.LJI.getString(), "result", true);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (C982390bfh c982390bfh2 : c982490bfr2.LJFF) {
                    linkedHashMap2.put(Long.valueOf(c982390bfh2.LIZ), Long.valueOf(c982390bfh2.LIZIZ));
                }
                AbstractC962030b8r.LJIIJ(c970920bNC2.LIZLLL, "scores", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkedHashMap2), true);
            }
            c970920bNC2.LJIJJLI("battle_finish_message");
            c970920bNC2.LJIJJLI("settlement_message");
            return;
        }
        if (!(abstractC982800bgM instanceof C982530bfv)) {
            return;
        }
        if (this.LIZLLL) {
            C974560bT4 c974560bT45 = new C974560bT4();
            c974560bT45.LJIL(abstractC982800bgM);
            c974560bT45.LJIJJLI("punish_finish_message");
        } else {
            C970920bNC c970920bNC3 = new C970920bNC();
            c970920bNC3.LJIL(abstractC982800bgM);
            c970920bNC3.LJIJJLI("punish_finish_message");
        }
    }

    public final void LJIIL(AbstractC963500bBE abstractC963500bBE) {
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO != null) {
            interfaceC976620bWO.LJIIZILJ(abstractC963500bBE);
        }
    }

    public final void LJIILIIL(C974230bSX c974230bSX) {
        String value;
        C981480beE c981480beELJI;
        if (c974230bSX.LIZJ) {
            value = EnumC973640bRa.PK_REMATCH.getValue();
        } else if (c974230bSX.LIZLLL.length() > 0) {
            value = c974230bSX.LIZLLL;
        } else {
            value = EnumC973640bRa.OTHER_VALUE.getValue();
        }
        if (c974230bSX.LIZ == EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE) {
            InterfaceC1106030et7.o9.LJFF(Long.valueOf(LiveCoHostTakeTheStageDurationListSetting.INSTANCE.getFirstDuration()));
            InterfaceC976620bWO interfaceC976620bWO = this.LJIIL;
            if ((interfaceC976620bWO != null || (interfaceC976620bWO = this.LJIIJJI) != null) && (c981480beELJI = interfaceC976620bWO.LJI()) != null) {
                c981480beELJI.LJJIIZ = true;
            }
        }
        InterfaceC976620bWO interfaceC976620bWO2 = this.LJIIL;
        if (interfaceC976620bWO2 != null || (interfaceC976620bWO2 = this.LJIIJJI) != null) {
            C962950bAL c962950bAL = EnumC962960bAM.Companion;
            EnumC919170a1j enumC919170a1j = c974230bSX.LIZ;
            c962950bAL.getClass();
            interfaceC976620bWO2.LIZIZ(C962950bAL.LJ(enumC919170a1j), value);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIILL(C981480beE c981480beE) {
        if (c981480beE == null) {
            return;
        }
        List<C954460awe> listLIZIZ = c981480beE.LJJIJIIJI.LIZIZ();
        ArrayList arrayList = (ArrayList) listLIZIZ;
        if (arrayList.isEmpty()) {
            C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", "syncPerformSequenceFromModel return by empty perform list");
            return;
        }
        C976200bVi c976200bVi = this.LJ;
        if (!c976200bVi.LIZ) {
            StringBuilder sb = new StringBuilder("syncPerformSequenceFromModel init, performerSequence=");
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((C954460awe) it2.next()).LJ));
            }
            sb.append(arrayList2);
            C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", sb.toString());
            C976200bVi c976200bVi2 = this.LJ;
            List<C954460awe> list = c981480beE.LJII;
            c976200bVi2.getClass();
            StringBuilder sb2 = new StringBuilder("init linkMicSequence:");
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C954460awe> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(it3.next().LJ));
            }
            sb2.append(arrayList3);
            sb2.append(", performerSequence:");
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Long.valueOf(((C954460awe) it4.next()).LJ));
            }
            sb2.append(arrayList4);
            C20441214yg.LJIIIZ("TakeTheStageSequenceHelper", sb2.toString());
            ArrayList arrayList5 = new ArrayList();
            c976200bVi2.LIZJ = arrayList5;
            arrayList5.addAll(list);
            ArrayList arrayList6 = new ArrayList();
            c976200bVi2.LIZLLL = arrayList6;
            arrayList6.addAll(listLIZIZ);
            C13BV c13bv = C13BV.INSTANCE;
            List<C954460awe> list2 = c976200bVi2.LIZJ;
            List<C954460awe> list3 = c976200bVi2.LIZLLL;
            c976200bVi2.LIZJ(0, c976200bVi2.LIZ((C954460awe) C13LP.LJJJLZIJ(0, list3)), c13bv, c13bv, list2, list3);
            c976200bVi2.LIZ = true;
            return;
        }
        StringBuilder sb3 = new StringBuilder("updatePerformSequence start, newPerformSequence:");
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList7.add(Long.valueOf(((C954460awe) it5.next()).LJ));
        }
        sb3.append(arrayList7);
        C20441214yg.LJIIIZ("TakeTheStageSequenceHelper", sb3.toString());
        List<C954460awe> list4 = c976200bVi.LIZJ;
        List<C954460awe> list5 = c976200bVi.LIZLLL;
        int iLIZ = c976200bVi.LIZ((C954460awe) C13LP.LJJJLZIJ(0, list5));
        ArrayList arrayList8 = new ArrayList();
        for (C954460awe c954460awe : (ArrayList) c976200bVi.LIZJ) {
            long j = c954460awe.LJ;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((C954460awe) ListProtector.get(listLIZIZ, i)).LJ == j) {
                    if (i >= 0) {
                        arrayList8.add(c954460awe);
                    }
                } else {
                    i++;
                }
            }
        }
        c976200bVi.LIZJ = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        arrayList9.addAll(listLIZIZ);
        c976200bVi.LIZLLL = arrayList9;
        c976200bVi.LIZJ(iLIZ, c976200bVi.LIZ((C954460awe) C13LP.LJJJLZIJ(0, arrayList9)), list4, list5, c976200bVi.LIZJ, arrayList9);
    }

    public final void LJIILLIIL(MultiMatchPrepareResponse multiMatchPrepareResponse) {
        InterfaceC976620bWO interfaceC976620bWO;
        C981480beE c981480beELJI;
        if (multiMatchPrepareResponse != null && (interfaceC976620bWO = this.LJIIJJI) != null && (c981480beELJI = interfaceC976620bWO.LJI()) != null) {
            C973910bS1 c973910bS1 = c981480beELJI.LJJIIZI;
            String str = multiMatchPrepareResponse.ruleGuideUrl;
            c973910bS1.getClass();
            C973910bS1.LIZIZ = str;
            C973910bS1 c973910bS12 = c981480beELJI.LJJIIZI;
            List<GiftMode> list = multiMatchPrepareResponse.giftMode;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            c973910bS12.getClass();
            C973910bS1.LIZJ = list;
        }
    }

    public final void LIZLLL(String str, EnumC962960bAM enumC962960bAM) {
        boolean z;
        EnumC974260bSa enumC974260bSaY2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onIconClick, mainEngine is null = ");
        if (this.LJIIJJI == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", clickFrom = ");
        sbLIZ.append(str);
        sbLIZ.append(", bizType=");
        sbLIZ.append(enumC962960bAM);
        C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ == null || (enumC974260bSaY2 = c976640bWQ.Y2()) == null) {
            enumC974260bSaY2 = EnumC974260bSa.NONE;
        }
        if (enumC974260bSaY2.compareTo(EnumC974260bSa.NONE) > 0) {
            C976640bWQ c976640bWQ2 = this.LJIIL;
            if (c976640bWQ2 != null) {
                c976640bWQ2.LIZIZ(enumC962960bAM, str);
                return;
            }
            return;
        }
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO == null) {
            return;
        }
        interfaceC976620bWO.LIZIZ(enumC962960bAM, str);
    }

    public final void LJ(EnumC962960bAM enumC962960bAM, int i) {
        boolean z;
        EnumC974260bSa enumC974260bSaY2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGuideClick, mainEngine is null = ");
        if (this.LJIIJJI == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", noticeType = ");
        sbLIZ.append(i);
        sbLIZ.append(", bizType=");
        sbLIZ.append(enumC962960bAM);
        C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ == null || (enumC974260bSaY2 = c976640bWQ.Y2()) == null) {
            enumC974260bSaY2 = EnumC974260bSa.NONE;
        }
        if (enumC974260bSaY2.compareTo(EnumC974260bSa.NONE) > 0) {
            C976640bWQ c976640bWQ2 = this.LJIIL;
            if (c976640bWQ2 != null) {
                c976640bWQ2.LJIILIIL(enumC962960bAM, i);
                return;
            }
            return;
        }
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO == null) {
            return;
        }
        interfaceC976620bWO.LJIILIIL(enumC962960bAM, i);
    }

    public final void LJIILJJIL(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leaveReason=");
        sbLIZ.append(j);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(", hostsize=");
        sbLIZ.append(C915980Zwa.LJII().LLILZLL(true).size());
        C20441214yg.LJ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ != null) {
            c976640bWQ.LJFF(j, str);
        }
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO != null) {
            interfaceC976620bWO.LJFF(j, str);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIIIIZZ(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("oldList = ");
        if (list2 != null) {
            numValueOf = Integer.valueOf(((ArrayList) list2).size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", newList = ");
        sbLIZ.append(Integer.valueOf(list.size()));
        C20441214yg.LJ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ != null) {
            c976640bWQ.Z2(list, list2, customLinkMessage);
        }
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO != null) {
            interfaceC976620bWO.Z2(list, list2, customLinkMessage);
        }
        C975550bUf c975550bUf = this.LJIIIIZZ;
        if (c975550bUf != null) {
            c975550bUf.LJIIIIZZ(list, list2);
        }
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        StringBuilder sb = new StringBuilder("dispatchOnUserListChange latestLinkedUserList:");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLI, 10));
        Iterator<C954460awe> it2 = listLJJLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        sb.append(arrayList);
        sb.append(", oldList:");
        List<C954460awe> list3 = this.LJ.LIZLLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator it3 = ((ArrayList) list3).iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((C954460awe) it3.next()).LJ));
        }
        sb.append(arrayList2);
        C20441214yg.LIZIZ("CompetitionAnchorAudienceManager", sb.toString());
        if (listLJJLI.size() > 1 && listLJJLI.size() < ((ArrayList) this.LJ.LIZLLL).size()) {
            C976200bVi c976200bVi = this.LJ;
            if (c976200bVi.LIZ) {
                if (((ArrayList) c976200bVi.LIZJ).size() == listLJJLI.size()) {
                    C20441214yg.LJIIIZ("TakeTheStageSequenceHelper", "updateLinkMicSequence return by same size");
                } else {
                    StringBuilder sb2 = new StringBuilder("updateLinkMicSequence start, list:");
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJLI, 10));
                    Iterator<C954460awe> it4 = listLJJLI.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(Long.valueOf(it4.next().LJ));
                    }
                    sb2.append(arrayList3);
                    C20441214yg.LJIIIZ("TakeTheStageSequenceHelper", sb2.toString());
                    List<C954460awe> list4 = c976200bVi.LIZJ;
                    List<C954460awe> list5 = c976200bVi.LIZLLL;
                    int iLIZ = c976200bVi.LIZ((C954460awe) C13LP.LJJJLZIJ(0, list5));
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.addAll(listLJJLI);
                    c976200bVi.LIZJ = arrayList4;
                    ArrayList arrayList5 = new ArrayList();
                    for (C954460awe c954460awe : (ArrayList) c976200bVi.LIZLLL) {
                        long j = c954460awe.LJ;
                        int size = listLJJLI.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (((C954460awe) ListProtector.get(listLJJLI, i)).LJ == j) {
                                if (i >= 0) {
                                    arrayList5.add(c954460awe);
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                    c976200bVi.LIZLLL = arrayList5;
                    c976200bVi.LIZJ(iLIZ, c976200bVi.LIZ((C954460awe) C13LP.LJJJLZIJ(0, arrayList5)), list4, list5, c976200bVi.LIZJ, arrayList5);
                }
            }
        }
        DataChannel dataChannel = this.LIZJ;
        if (C915980Zwa.LIZIZ().JV1(false).isPlayingIncludeResult()) {
            if (C497740JfY.LJJ()) {
                if (C958040b2Q.LIZLLL()) {
                    C956400azm.LIZ(dataChannel, "setTakeStageGiftTraySize");
                    return;
                } else {
                    C956400azm.LIZIZ(dataChannel, "setTakeStageGiftTraySize");
                    return;
                }
            }
            C956400azm.LIZIZ(dataChannel, "setTakeStageGiftTraySize");
            return;
        }
        if (C915980Zwa.LJII().LLILZLL(true).size() > 2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateGiftTraySizeFallback");
            sbLIZ2.append(", user count > 2");
            C20441214yg.LJIIIZ("TakeStageGiftUtil", C2188811AlT.LIZIZ(sbLIZ2));
            C956400azm.LIZIZ(dataChannel, "updateGiftTraySizeFallback");
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateGiftTraySizeFallback");
        sbLIZ3.append(", user count <= 2");
        C20441214yg.LIZIZ("TakeStageGiftUtil", C2188811AlT.LIZIZ(sbLIZ3));
        C956400azm.LIZ(dataChannel, "updateGiftTraySizeFallback");
    }

    public final void LJIIIZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkMicFinish, mainEngine=");
        InterfaceC976620bWO interfaceC976620bWO = this.LJIIJJI;
        if (interfaceC976620bWO != null) {
            numValueOf = Integer.valueOf(interfaceC976620bWO.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", finishReason=");
        sbLIZ.append(i);
        sbLIZ.append(", detailedCode=");
        sbLIZ.append(i2);
        C20441214yg.LJ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ));
        C976640bWQ c976640bWQ = this.LJIIL;
        if (c976640bWQ != null) {
            c976640bWQ.LJIIIIZZ(i, i2, abnormalDisconnectReason);
        }
        InterfaceC976620bWO interfaceC976620bWO2 = this.LJIIJJI;
        if (interfaceC976620bWO2 != null) {
            interfaceC976620bWO2.LJIIIIZZ(i, i2, abnormalDisconnectReason);
        }
        if (C915980Zwa.LJII().LLILZLL(true).size() < 2 && this.LJIIJ.LJIIIIZZ.isValid()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLinkMicFinish -->");
            sbLIZ2.append(i);
            C20441214yg.LJ("CompetitionAnchorAudienceManager", C2188811AlT.LIZIZ(sbLIZ2));
            C976640bWQ c976640bWQ2 = this.LJIIL;
            if (c976640bWQ2 != null) {
                c976640bWQ2.LJII(203L);
            }
            InterfaceC976620bWO interfaceC976620bWO3 = this.LJIIJJI;
            if (interfaceC976620bWO3 != null) {
                interfaceC976620bWO3.LJII(203L);
            }
            C975550bUf c975550bUf = this.LJIIIIZZ;
            if (c975550bUf != null) {
                c975550bUf.LIZIZ();
            }
        }
    }
}
