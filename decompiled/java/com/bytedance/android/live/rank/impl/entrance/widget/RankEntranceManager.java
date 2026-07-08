package com.bytedance.android.live.rank.impl.entrance.widget;

import X.AnonymousClass0956;
import X.C001A;
import X.C020W;
import X.C0IFW;
import X.C0IH1;
import X.C0IJT;
import X.C0J1R;
import X.C0JT6;
import X.C0K04;
import X.C0PEM;
import X.C0UO0;
import X.C1078930eBP;
import X.C1078960eBS;
import X.C1082810eHf;
import X.C1083590eIv;
import X.C1097080eeg;
import X.C1099590eij;
import X.C1161920gLG;
import X.C118300cf;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1809330xBT;
import X.C1810470xDJ;
import X.C1810700xDg;
import X.C1810760xDm;
import X.C1811420xEq;
import X.C1811840xFW;
import X.C1842380y2m;
import X.C1842390y2n;
import X.C1842440y2s;
import X.C1842460y2u;
import X.C1842860y3Y;
import X.C1846730y9n;
import X.C1846860yA0;
import X.C1846870yA1;
import X.C1846880yA2;
import X.C1846890yA3;
import X.C1864500ycS;
import X.C19748512Ol;
import X.C1CC2;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C235000vU;
import X.C259800zU;
import X.C356901a3;
import X.C389001fE;
import X.C474500IjA;
import X.C480460Ism;
import X.C497120JeY;
import X.C500260Jjc;
import X.C776250Uch;
import X.EnumC1083210eIJ;
import X.EnumC1811400xEo;
import X.EnumC1842510y2z;
import X.InterfaceC1094280eaA;
import X.InterfaceC1842760y3O;
import X.InterfaceC1842770y3P;
import X.InterfaceC1842850y3X;
import X.InterfaceC1842870y3Z;
import Y.AfS116S0300000_27;
import Y.AfS161S0200000_27;
import Y.AfS186S0100000_17;
import Y.AfS196S0100000_27;
import Y.AkS198S0300000_12;
import android.text.TextUtils;
import android.util.SparseLongArray;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.livesdk.dataChannel.AnchorRankEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorLeagueMatchCampaignRankingSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveHourlyRankQueryEntranceDelaySetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankEntranceSplitSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchLiveLeaksFixSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.LeagueMatchExtra;
import com.bytedance.android.livesdk.model.message.MarqueeAnnouncementMessage;
import com.bytedance.android.livesdk.model.message.OwnerRankInfo;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.model.message.RankNoticeMessage;
import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.RankUpdateMessage;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceSettlementCountdownConfig;
import com.bytedance.android.livesdk.rank.api.MatchRankNoScoreAddedEvent;
import com.bytedance.android.livesdk.rank.api.MatchRankScoreAddedEvent;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.RankingEntranceClickEvent;
import com.bytedance.android.livesdk.rank.impl.RankingEntranceRefreshEvent;
import com.bytedance.android.livesdk.rank.impl.UpdateRankingEntranceDataEvent;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.model.TeamRankBonusTime;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes28.dex */
public final class RankEntranceManager implements OnMessageListener, C0IFW, InterfaceC1842850y3X {
    public final Fragment LL;
    public final DataChannel LLILLJJLI;
    public final InterfaceC1842760y3O LLILLL;
    public RankEntranceWidget LLILZ;
    public RankEntranceWidget LLILZIL;
    public final List<InterfaceC1842770y3P> LLILZLL;
    public final C1842390y2n LLIZ;
    public final C1842440y2s LLIZLLLIL;
    public final C1078960eBS LLJ;
    public C1810760xDm LLJI;
    public InterfaceC1842870y3Z LLJIJIL;
    public C1842860y3Y LLJILJIL;
    public C1842460y2u LLJILJILJ;
    public final IMessageManager LLJILLL;
    public final Room LLJJ;
    public final boolean LLJJI;
    public final int LLJJIII;
    public final C1810470xDJ LLJJIJI;
    public final C11NJ LLJJIJIIJIL;
    public final ArrayList<Runnable> LLJJIJIL;
    public boolean LLJJJ;
    public AnonymousClass0956 LLJJJIL;
    public C1842380y2m LLJJJJ;
    public C1842380y2m LLJJJJJIL;

    @Override // X.InterfaceC1842850y3X
    public final void LIZ() {
        LIZLLL(false);
    }

    public final void LIZJ() {
        IMessageManager iMessageManager = this.LLJILLL;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.RANK_UPDATE_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.LLJILLL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.MARQUEE_ANNOUNCEMENT_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.LLJILLL;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(C001A.WEEKLY_RANK_REWARD_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager4 = this.LLJILLL;
        if (iMessageManager4 != null) {
            iMessageManager4.addMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
        }
        IMessageManager iMessageManager5 = this.LLJILLL;
        if (iMessageManager5 != null) {
            iMessageManager5.addMessageListener(C001A.RANK_NOTICE_MESSAGE.getIntType(), this);
        }
        C1810470xDJ c1810470xDJ = this.LLJJIJI;
        if (c1810470xDJ != null) {
            C1548820qPI.LIZLLL("ttlive_anchor_ranking_open_event", c1810470xDJ.LJFF);
            C1548820qPI.LIZLLL("ttlive_rest_card_id_update_event", c1810470xDJ.LJFF);
            C1548820qPI.LIZLLL("LEAGUE_MATCH_INIT_DATA", c1810470xDJ.LJFF);
        }
        if (this.LL.isAdded()) {
            DataChannelGlobal.LLILZ.BQ2(this, this.LL, AnchorRankEvent.class, new AwS606S0100000_27(this, 492));
        }
    }

    public final void LJ() {
        IMessageManager iMessageManager = this.LLJILLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.RANK_UPDATE_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.LLJILLL;
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(C001A.MARQUEE_ANNOUNCEMENT_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.LLJILLL;
        if (iMessageManager3 != null) {
            iMessageManager3.removeMessageListener(C001A.WEEKLY_RANK_REWARD_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager4 = this.LLJILLL;
        if (iMessageManager4 != null) {
            iMessageManager4.removeMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
        }
        IMessageManager iMessageManager5 = this.LLJILLL;
        if (iMessageManager5 != null) {
            iMessageManager5.removeMessageListener(C001A.RANK_NOTICE_MESSAGE.getIntType(), this);
        }
        C1810470xDJ c1810470xDJ = this.LLJJIJI;
        if (c1810470xDJ != null) {
            C1548820qPI.LJIIIIZZ("ttlive_anchor_ranking_open_event", c1810470xDJ.LJFF);
            C1548820qPI.LJIIIIZZ("ttlive_rest_card_id_update_event", c1810470xDJ.LJFF);
            C1548820qPI.LJIIIIZZ("LEAGUE_MATCH_INIT_DATA", c1810470xDJ.LJFF);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    public final void LJFF() {
        Room room;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return;
        }
        C480460Ism.LIZ().getClass();
        ((RankApi) C480460Ism.LIZLLL(RankApi.class)).notifyRankingEntranceRefresh(room.getId()).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this.LL)).LJJLL(new AfS196S0100000_27(this, 7), new AfS196S0100000_27(this, 8));
    }

    @Override // X.C0IFW
    public final void cancel() {
        this.LLJJIJIIJIL.dispose();
    }

    @Override // X.C0IFW
    public final void pause() {
        C20441214yg.LJIIIZ("matao-test", "Rank pause");
        this.LLJJJ = true;
    }

    @Override // X.C0IFW
    public final void resume() {
        C20441214yg.LJIIIZ("matao-test", "Rank resume");
        this.LLJJJ = false;
        if (this.LLJJIJIL.isEmpty()) {
            return;
        }
        Iterator<Runnable> it2 = this.LLJJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.LLJJIJIL.clear();
    }

    @Override // X.C0IFW
    public final void W() {
        cancel();
        this.LLJJIJIL.clear();
    }

    /* JADX INFO: renamed from: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceManager$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes18.dex */
    public final class AnonymousClass2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass2() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            RankEntranceManager.this.LJ();
        }
    }

    public final void LIZLLL(boolean z) {
        Room room;
        C11NZ c11nzLJJLIIIJLJLI;
        boolean zLJI = MethodIDManager.LJI(202144);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 1;
        C259800zU c259800zU = new C259800zU();
        if (this.LLILLJJLI != null && this.LL.isAdded() && (room = (Room) this.LLILLJJLI.gg0(RoomChannel.class)) != null && room.getOwner() != null) {
            if (C1811840xFW.LIZJ == 0) {
                C1811840xFW.LIZJ = System.currentTimeMillis();
            }
            if (z && LiveCombineRequestExp.INSTANCE.enableForRequest("/webcast/ranklist/entrance/v3/")) {
                c11nzLJJLIIIJLJLI = C497120JeY.LJIIZILJ.LIZIZ("/webcast/ranklist/entrance/v3/", new AwS561S0100000_17(room, 99)).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this.LL));
            } else {
                C480460Ism.LIZ().getClass();
                c11nzLJJLIIIJLJLI = ((RankApi) C480460Ism.LIZLLL(RankApi.class)).queryRankEntrancesV3(room.getOwner().getId(), room.getId()).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this.LL)).LJJLIIIJLJLI(new AkS198S0300000_12(this, c118300cf, c259800zU, 0));
            }
            this.LLJJIJIIJIL.LIZ(c11nzLJJLIIIJLJLI.LJJLL(new AfS116S0300000_27(this, c118300cf, c259800zU, 0), new AfS161S0200000_27(this, c118300cf, 3)));
            ((HashSet) C0IH1.LIZ).add(this);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        C1810760xDm c1810760xDm;
        Room room;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        Room room2;
        RoomAuthStatus roomAuthStatus3;
        MarqueeAnnouncementMessage marqueeAnnouncementMessage;
        List<MarqueeAnnouncementMessage.MessageEntity> list;
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        EnumC1811400xEo enumC1811400xEo;
        long j2;
        long jCurrentTimeMillis;
        Integer next;
        int iIntValue;
        RankUpdate.AffiliatedInfo affiliatedInfo;
        TeamRankBonusTime teamRankBonusTime;
        if (iMessage == null) {
            return;
        }
        long j3 = 0;
        boolean z2 = false;
        z2 = false;
        if (iMessage instanceof RankUpdateMessage) {
            C1811840xFW.LIZIZ = "change_by_ranklist_message";
            RankUpdateMessage rankUpdateMessage = (RankUpdateMessage) iMessage;
            C1842860y3Y c1842860y3Y = this.LLJILJIL;
            if (c1842860y3Y != null) {
                List<RankUpdate> list2 = rankUpdateMessage.updates;
                if (list2 != null) {
                    C1809330xBT.LIZ(list2, AFwS269S0000000_27.get$arr$(410));
                }
                List<RankUpdate> list3 = rankUpdateMessage.updates;
                if (list3 != null) {
                    C1809330xBT.LIZ(list3, new C020W(rankUpdateMessage, c1842860y3Y, 66));
                }
            }
            List<RankUpdate> list4 = rankUpdateMessage.updates;
            if (list4 != null) {
                for (RankUpdate rankUpdate : list4) {
                    if (rankUpdate.rankType == RankTypeV2.LJIJJLI.type && (affiliatedInfo = rankUpdate.affiliatedInfo) != null && (teamRankBonusTime = affiliatedInfo.teamRankBonusTime) != null) {
                        LivePopularityRankingBonusTimeSetting.INSTANCE.updateBonusTimeRange(teamRankBonusTime.startTimestamp, teamRankBonusTime.endTimestamp);
                    }
                }
            }
            Iterator<InterfaceC1842770y3P> it2 = this.LLILZLL.iterator();
            while (it2.hasNext()) {
                it2.next().LJ(rankUpdateMessage);
            }
            C1078960eBS c1078960eBS = this.LLJ;
            c1078960eBS.getClass();
            C20441214yg.LIZIZ("Ranking Entrance Unification", "RankingSettlementCountdownManager - updateFromMessage");
            List<RankUpdate> list5 = rankUpdateMessage.updates;
            if (list5 != null) {
                for (RankUpdate rankUpdate2 : list5) {
                    for (LiveRankingEntranceSettlementCountdownConfig.RankingSettlementCountdownConfig rankingSettlementCountdownConfig : LiveRankingEntranceSettlementCountdownConfig.INSTANCE.getValue().rankingSettlementCountdownConfigList) {
                        if (rankingSettlementCountdownConfig.rankType == rankUpdate2.rankType) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("update countdown map - ");
                            sbLIZ.append(rankUpdate2.rankType);
                            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
                            int i = rankingSettlementCountdownConfig.scenario;
                            if (i == EnumC1083210eIJ.RANKING_SETTLEMENT.getType()) {
                                jCurrentTimeMillis = rankUpdate2.countdown;
                            } else if (i == EnumC1083210eIJ.RANKING_MIDDAY_SPRINT_START.getType() || i == EnumC1083210eIJ.RANKING_MIDDAY_SPRINT_COUNTDOWN.getType()) {
                                RankUpdate.AffiliatedInfo affiliatedInfo2 = rankUpdate2.affiliatedInfo;
                                if (affiliatedInfo2 != null) {
                                    j2 = affiliatedInfo2.middayPeakTimeStamp;
                                } else {
                                    j2 = 0;
                                }
                                jCurrentTimeMillis = j2 - (System.currentTimeMillis() / 1000);
                            }
                            if (jCurrentTimeMillis > j3) {
                                Iterator<Integer> it3 = rankingSettlementCountdownConfig.rankSettlementCountdownList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        if (next.intValue() >= jCurrentTimeMillis) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                Integer num = next;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                Pair pair = new Pair(Integer.valueOf(rankUpdate2.rankType), Integer.valueOf(rankingSettlementCountdownConfig.scenario));
                                LinkedHashMap linkedHashMap = (LinkedHashMap) c1078960eBS.LIZIZ;
                                Object obj2 = linkedHashMap.get(pair);
                                Object obj3 = obj2;
                                if (obj2 == null) {
                                    RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                                    C1078930eBP c1078930eBP = new C1078930eBP(C235000vU.LIZ(rankUpdate2.rankType, z2 ? 1 : 0), rankingSettlementCountdownConfig.scenario, jCurrentTimeMillis, rankingSettlementCountdownConfig.rankSettlementCountdownDuration, rankingSettlementCountdownConfig.countdownAnimationType, iIntValue);
                                    linkedHashMap.put(pair, c1078930eBP);
                                    obj3 = c1078930eBP;
                                }
                                C1078930eBP c1078930eBP2 = (C1078930eBP) obj3;
                                c1078930eBP2.LIZJ = jCurrentTimeMillis;
                                c1078930eBP2.LJFF = iIntValue;
                            }
                        }
                        j3 = 0;
                        z2 = false;
                    }
                }
            }
            C20441214yg.LIZIZ("Ranking Entrance Unification", "RankEntranceManager#updateFromMessage");
            C1842390y2n c1842390y2n = this.LLIZ;
            c1842390y2n.getClass();
            C20441214yg.LIZIZ("Ranking Entrance Unification", "handleIM");
            if (rankUpdateMessage.opType != EnumC1842510y2z.REMOVE.getType() && rankUpdateMessage.opType != EnumC1842510y2z.RELOAD.getType()) {
                z = true;
            } else {
                z = false;
            }
            if ((rankUpdateMessage.updates != null && (!r0.isEmpty())) || !z) {
                RankUpdateMessage.ValidRanks validRanks = rankUpdateMessage.validRanks;
                if (validRanks != null && validRanks.isEffect) {
                    Iterator it4 = ((ArrayList) c1842390y2n.LJ).iterator();
                    while (it4.hasNext()) {
                        C1809330xBT.LIZ(((C1842380y2m) it4.next()).LIZJ, new AwS393S0200000_27(c1842390y2n, rankUpdateMessage, 128));
                    }
                }
                List<RankUpdate> list6 = rankUpdateMessage.updates;
                if (list6 != null) {
                    Iterator<RankUpdate> it5 = list6.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        RankAnimationInfo rankAnimationInfo = it5.next().animationInfo;
                        if (rankAnimationInfo != null && rankAnimationInfo.type == RankAnimationType.LJIILL.type) {
                            rankUpdateMessage.opType = EnumC1842510y2z.BASIC_ANIMATION.getType();
                            break;
                        }
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RankUpdateMessage - OpType - ");
                sbLIZ2.append(rankUpdateMessage.opType);
                C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ2));
                int i2 = rankUpdateMessage.opType;
                if (i2 == EnumC1842510y2z.DEFAULT.getType() || i2 == EnumC1842510y2z.ADD.getType()) {
                    c1842390y2n.LIZIZ(rankUpdateMessage);
                } else if (i2 == EnumC1842510y2z.REMOVE.getType()) {
                    C20441214yg.LIZIZ("Ranking Entrance Unification", "handleRemoveEntranceIM");
                    Iterator it6 = ((ArrayList) c1842390y2n.LJ).iterator();
                    while (it6.hasNext()) {
                        C1809330xBT.LIZ(((C1842380y2m) it6.next()).LIZJ, new AwS606S0100000_27(rankUpdateMessage, 493));
                    }
                    C1809330xBT.LIZ(c1842390y2n.LJ, AFwS269S0000000_27.get$arr$(411));
                } else {
                    if (i2 == EnumC1842510y2z.RELOAD.getType()) {
                        c1842390y2n.LIZIZ.LIZ();
                        return;
                    }
                    if (i2 == EnumC1842510y2z.BASIC_ANIMATION.getType()) {
                        C20441214yg.LIZIZ("Ranking Entrance Unification", "handleAnimationOnlyIM");
                        ((ArrayList) c1842390y2n.LJI).clear();
                        C20441214yg.LIZIZ("Ranking Entrance Unification", "handleAnimationOnlyIMForUnifiedEntrance");
                        if (LiveRankEntranceSplitSetting.INSTANCE.isSplitEnabled()) {
                            if (!C1099590eij.LIZ.contains(Integer.valueOf(rankUpdateMessage.groupType))) {
                                enumC1811400xEo = EnumC1811400xEo.ENTRANCE1;
                            } else {
                                enumC1811400xEo = EnumC1811400xEo.ENTRANCE2;
                            }
                            C1842380y2m c1842380y2m = new C1842380y2m();
                            c1842380y2m.LIZLLL(rankUpdateMessage, enumC1811400xEo, c1842390y2n.LIZ);
                            ((ArrayList) c1842390y2n.LJI).add(c1842380y2m);
                        } else {
                            Iterator it7 = ((ArrayList) c1842390y2n.LJFF).iterator();
                            while (it7.hasNext()) {
                                it7.next();
                                C1842380y2m c1842380y2m2 = new C1842380y2m();
                                C1811420xEq c1811420xEq = EnumC1811400xEo.Companion;
                                int i3 = rankUpdateMessage.groupType;
                                c1811420xEq.getClass();
                                c1842380y2m2.LIZLLL(rankUpdateMessage, C1811420xEq.LIZ(i3), c1842390y2n.LIZ);
                                ((ArrayList) c1842390y2n.LJI).add(c1842380y2m2);
                            }
                        }
                        c1842390y2n.LIZIZ.LIZIZ(c1842390y2n.LJI, true);
                        return;
                    }
                }
                c1842390y2n.LIZJ();
                c1842390y2n.LIZIZ.LIZIZ(c1842390y2n.LJFF, z2);
                return;
            }
            return;
        }
        if (iMessage instanceof MarqueeAnnouncementMessage) {
            if (!LiveAnchorGiftDisableSetting.INSTANCE.getValue()) {
                Room room3 = this.LLJJ;
                if (((room3 != null && room3.getRoomAuthStatus() == null) || (room2 = this.LLJJ) == null || (roomAuthStatus3 = room2.getRoomAuthStatus()) == null || roomAuthStatus3.getRankState() != 2) && !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1() && (list = (marqueeAnnouncementMessage = (MarqueeAnnouncementMessage) iMessage).messageEntity) != null && (!list.isEmpty())) {
                    String str6 = "";
                    for (MarqueeAnnouncementMessage.MessageEntity messageEntity : marqueeAnnouncementMessage.messageEntity) {
                        IMessageManager iMessageManager = this.LLJILLL;
                        if (iMessageManager != null) {
                            iMessageManager.insertMessage(messageEntity.notifyMessage, true);
                            String str7 = marqueeAnnouncementMessage.messageScene;
                            if (Intrinsics.LJFF(str7, "start_room_event")) {
                                str6 = RankTypeV2.LIZIZ.rankName;
                            } else if (Intrinsics.LJFF(str7, "start_room_event_daily")) {
                                str6 = RankTypeV2.LJIIL.rankName;
                            } else {
                                str6 = marqueeAnnouncementMessage.messageScene;
                            }
                            if (TextUtils.equals(str6, RankTypeV2.LJIILLIIL.rankName)) {
                                str = "top3_live_notice";
                            } else {
                                str = "top1_live_notice";
                            }
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_message_send");
                            c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
                            c474500IjALIZ.LJJII(str, "message_type");
                            c474500IjALIZ.LJJII(str6, "rank_type");
                            String str8 = "anchor";
                            if (this.LLJJI) {
                                obj = "anchor";
                            } else {
                                obj = "user";
                            }
                            c474500IjALIZ.LJJII(obj, "user_type");
                            c474500IjALIZ.LIZ();
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_advanced_message_privilege_show");
                            if (!this.LLJJI) {
                                str8 = "user";
                            }
                            c474500IjALIZ2.LJJII(str8, "user_type");
                            c474500IjALIZ2.LJJII("weekly_rank_anchor_live", "privilege_scenario");
                            c474500IjALIZ2.LJJII("room_top", "show_place");
                            c474500IjALIZ2.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                            c474500IjALIZ2.LJJII(Long.valueOf(messageEntity.notifyMessage.from_user_id), "to_user_id");
                            PrivilegeLogExtra privilegeLogExtra = messageEntity.notifyMessage.logExtra;
                            if (privilegeLogExtra == null || (str2 = privilegeLogExtra.privilege_id) == null) {
                                str2 = "";
                            }
                            c474500IjALIZ2.LJJII(str2, "privilege_id");
                            PrivilegeLogExtra privilegeLogExtra2 = messageEntity.notifyMessage.logExtra;
                            if (privilegeLogExtra2 == null || (str3 = privilegeLogExtra2.privilege_order_id) == null) {
                                str3 = "";
                            }
                            c474500IjALIZ2.LJJII(str3, "privilege_order_id");
                            PrivilegeLogExtra privilegeLogExtra3 = messageEntity.notifyMessage.logExtra;
                            if (privilegeLogExtra3 == null || (str4 = privilegeLogExtra3.privilege_version) == null) {
                                str4 = "";
                            }
                            c474500IjALIZ2.LJJII(str4, "privilege_version_id");
                            PrivilegeLogExtra privilegeLogExtra4 = messageEntity.notifyMessage.logExtra;
                            if (privilegeLogExtra4 == null || (str5 = privilegeLogExtra4.data_version) == null) {
                                str5 = "";
                            }
                            c474500IjALIZ2.LJJII(str5, "data_version_id");
                            c474500IjALIZ2.LJJII(Integer.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()), "online_user");
                            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ2.LJIJ())) {
                                c474500IjALIZ2.LJIJJLI(this.LLILLJJLI);
                                c474500IjALIZ2.LIZ();
                            } else {
                                c474500IjALIZ2.LJJIJLIJ();
                                c474500IjALIZ2.LJIIIIZZ();
                                w wVar = w.LIZ;
                                wVar.getClass();
                                c474500IjALIZ2.LJJII(w.LIZLLL(), "action_type");
                                c474500IjALIZ2.LJJII(wVar.LIZJ(), "live_type");
                                c474500IjALIZ2.LJJIJL();
                            }
                        }
                    }
                    DataChannel dataChannel = this.LLILLJJLI;
                    RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
                    RankTypeV2 rankTypeV2LIZIZ = C235000vU.LIZIZ(str6);
                    EnumC1811400xEo enumC1811400xEo2 = EnumC1811400xEo.GIFT_RANK;
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    C0K04.LJFF("current_entrance_rank_type", rankTypeV2LIZIZ.rankName, jSONObject);
                    C0K04.LIZLLL(enumC1811400xEo2.getType(), "group_type", jSONObject);
                    C1811840xFW.LIZ(dataChannel, jSONObject3, null);
                    C0K04.LJII("extra", jSONObject4, jSONObject3);
                    C1CC2.LJ("ttlive_ranklist_notification_message_reward_show", jSONObject, jSONObject2, jSONObject4);
                    return;
                }
                return;
            }
            return;
        }
        if (iMessage instanceof RoomVerifyMessage) {
            int i4 = ((RoomVerifyMessage) iMessage).verifyAction;
            if (i4 == 30) {
                Room room4 = this.LLJJ;
                if (room4 != null && room4.getRoomAuthStatus() != null) {
                    Room room5 = this.LLJJ;
                    if (room5 != null && (roomAuthStatus2 = room5.getRoomAuthStatus()) != null) {
                        roomAuthStatus2.setRankState(1);
                    }
                    C1811840xFW.LIZIZ = "change_by_roomverify_message";
                    LIZLLL(false);
                    return;
                }
                return;
            }
            if (i4 == 31 && (room = this.LLJJ) != null && room.getRoomAuthStatus() != null) {
                Room room6 = this.LLJJ;
                if (room6 != null && (roomAuthStatus = room6.getRoomAuthStatus()) != null) {
                    roomAuthStatus.setRankState(2);
                }
                C1811840xFW.LIZIZ = "change_by_roomverify_message";
                RankEntranceWidget rankEntranceWidget = this.LLILZ;
                if (rankEntranceWidget != null) {
                    rankEntranceWidget.hide();
                }
                RankEntranceWidget rankEntranceWidget2 = this.LLILZIL;
                if (rankEntranceWidget2 != null) {
                    rankEntranceWidget2.hide();
                    return;
                }
                return;
            }
            return;
        }
        if (iMessage instanceof RankNoticeMessage) {
            RankNoticeMessage rankNoticeMessage = (RankNoticeMessage) iMessage;
            int i5 = rankNoticeMessage.scene;
            if (i5 != 1) {
                if ((i5 == 2 || i5 == 3) && (c1810760xDm = this.LLJI) != null) {
                    if (i5 != 2) {
                        c1810760xDm.LIZ.zW(MatchRankNoScoreAddedEvent.class, rankNoticeMessage.contentText);
                        return;
                    } else {
                        c1810760xDm.LIZ.zW(MatchRankScoreAddedEvent.class, rankNoticeMessage);
                        return;
                    }
                }
                return;
            }
            if (LiveCreatorLeagueMatchCampaignRankingSetting.INSTANCE.getValue().campaignBannerUpdateOpt) {
                if (this.LLJI != null) {
                    C389001fE.LIZ("LEAGUE_MATCH_RANK_CHANGE", new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, rankNoticeMessage)), System.currentTimeMillis(), false);
                }
                C1810760xDm c1810760xDm2 = this.LLJI;
                if (c1810760xDm2 != null) {
                    SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                    int i6 = rankNoticeMessage.rankType;
                    OwnerRankInfo ownerRankInfo = rankNoticeMessage.ownerRankInfo;
                    if (ownerRankInfo != null) {
                        j = ownerRankInfo.rank;
                    } else {
                        j = 0;
                    }
                    C1810700xDg.LJFF(i6, j, false);
                    LeagueMatchExtra leagueMatchExtra = rankNoticeMessage.leagueMatchExtra;
                    if (leagueMatchExtra != null) {
                        boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(c1810760xDm2.LIZ);
                        int i7 = leagueMatchExtra.stage;
                        if (zLJIIZILJ && C1810700xDg.LIZ() != i7) {
                            InterfaceC1094280eaA.xd.LIZJ(String.valueOf(i7));
                        }
                        C1810700xDg.LJIIIIZZ = i7;
                        boolean z3 = leagueMatchExtra.isAnchorOptOut;
                        if (zLJIIZILJ && C1810700xDg.LIZJ() != z3) {
                            InterfaceC1094280eaA.wd.LIZJ(Boolean.valueOf(z3));
                        }
                        C1810700xDg.LJIIIZ = z3;
                        String strValueOf = String.valueOf(leagueMatchExtra.endTimestampSec);
                        C0JT6<String> c0jt6 = InterfaceC1094280eaA.f143yd;
                        String strLIZ = c0jt6.LIZ();
                        if (strLIZ == null) {
                            strLIZ = CardStruct.IStatusCode.DEFAULT;
                        }
                        if (strValueOf.compareTo(strLIZ) > 0) {
                            c0jt6.LIZJ(strValueOf);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0172  */
    @Override // X.InterfaceC1842850y3X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.List<X.C1842380y2m> r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceManager.LIZIZ(java.util.List, boolean):void");
    }

    public RankEntranceManager(Fragment fragment, DataChannel dataChannel, InterfaceC1842760y3O interfaceC1842760y3O) {
        boolean zBooleanValue;
        InterfaceC1842870y3Z interfaceC1842870y3ZLIZ;
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC1842760y3O;
        List<InterfaceC1842770y3P> listLJIIJJI = C1697810uHb.LJIIJJI(new C1846860yA0(dataChannel), new C1846730y9n(dataChannel), new C1846880yA2(dataChannel), new C1846890yA3(dataChannel), new C1846870yA1(dataChannel));
        this.LLILZLL = listLJIIJJI;
        this.LLIZ = new C1842390y2n(dataChannel, this);
        this.LLIZLLLIL = new C1842440y2s(new AwS571S0100000_27(this, 85), new AwS571S0100000_27(this, 86));
        this.LLJ = new C1078960eBS(dataChannel);
        this.LLJILLL = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        this.LLJJIII = 1;
        C11NJ c11nj = new C11NJ();
        this.LLJJIJIIJIL = c11nj;
        this.LLJJIJIL = new ArrayList<>();
        this.LLJILJILJ = C1842460y2u.LIZLLL.LIZ(dataChannel);
        this.LLJI = new C1810760xDm(dataChannel);
        this.LLJILJIL = new C1842860y3Y(dataChannel);
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            C1842460y2u c1842460y2u = this.LLJILJILJ;
            if (c1842460y2u != null) {
                interfaceC1842870y3ZLIZ = c1842460y2u.LIZ();
            } else {
                interfaceC1842870y3ZLIZ = null;
            }
            this.LLJIJIL = interfaceC1842870y3ZLIZ;
            if (interfaceC1842870y3ZLIZ != null) {
                interfaceC1842870y3ZLIZ.init();
            }
        }
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        this.LLJJ = room;
        this.LLJJIJI = new C1810470xDJ(dataChannel, fragment, false, room, this.LLJI);
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJJI = zBooleanValue;
        dataChannel.gg0(C1082810eHf.class);
        long value = LiveHourlyRankQueryEntranceDelaySetting.INSTANCE.getValue();
        dataChannel.SX0(C1083590eIv.class, Long.valueOf(System.currentTimeMillis()));
        if (value > 0 && zBooleanValue) {
            if (fragment.isAdded()) {
                c11nj.LIZ(C11NZ.LJLJJLL(value, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLJLI(new AfS186S0100000_17(this, 12)));
                ((HashSet) C0IH1.LIZ).add(this);
            }
        } else {
            LIZLLL(true);
        }
        if (WatchLiveLeaksFixSetting.enablePortraitAudienceFragmentLeakFix()) {
            fragment.getLifecycle().addObserver(new AnonymousClass2());
        }
        if (fragment.isAdded()) {
            Iterator<InterfaceC1842770y3P> it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                it2.next().onCreate();
            }
            this.LL.requireFragmentManager().LJZL(new C1864500ycS(this, 0), false);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this.LL, RankingEntranceRefreshEvent.class, new AwS606S0100000_27(this, 44));
        }
        DataChannel dataChannel3 = this.LLILLJJLI;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this.LL, RankingEntranceClickEvent.class, new AwS606S0100000_27(this, 45));
            dataChannel3.BQ2(this.LL, UpdateRankingEntranceDataEvent.class, new AwS606S0100000_27(this, 46));
        }
        if (!this.LLJJI) {
            C1DFH c1dfh = C0PEM.LIZ;
            this.LLJJJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1097080eeg(null), 3);
        }
    }
}
