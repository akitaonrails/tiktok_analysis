package X;

import Y.ARunnableS117S0100000_17;
import Y.AfS186S0100000_17;
import android.util.SparseLongArray;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankConfig;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.OnlineRankConfigChannel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.rank.LiveAudienceRankingOptOutFallbackSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.Contributor;
import com.bytedance.android.livesdk.model.message.EpiDecision;
import com.bytedance.android.livesdk.model.message.EpiMessage;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdk.rank.api.AudienceInProfileListChannel;
import com.bytedance.android.livesdk.rank.api.MemberCountChannel;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0ery, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105320ery implements OnMessageListener, C01VE {
    public final DataChannel LL;
    public InterfaceC1105450esB LLILLJJLI;
    public C11JF LLILLL;
    public int LLILZIL;
    public boolean LLJ;
    public boolean LLJIJIL;
    public Room LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJJI;
    public C1105520esI LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public C1088730eRD LLJJJJ;
    public boolean LLILZ = true;
    public long LLILZLL = 2;
    public final List<C1105460esC> LLIZ = new ArrayList();
    public OnlineRankConfig LLIZLLLIL = new OnlineRankConfig(true, true, true, 2, true);
    public boolean LLJI = true;
    public final C11NJ LLJILLL = new C11NJ();
    public long LLJJ = 2000;
    public final long LLJJIJIIJIL = UserService.getInstance().user().getCurrentUserId();
    public final List<C1105460esC> LLJJIJIL = new ArrayList();
    public boolean LLJJJJJIL = true;

    public final void LIZLLL() {
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILLL = (C11JF) C11NZ.LJJJJLI(this.LLJJ, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS186S0100000_17(this, 166));
    }

    public final void LJFF() {
        ConcurrentHashMap concurrentHashMap;
        C0IXL c0ixl;
        C1088730eRD c1088730eRD = this.LLJJJJ;
        if (c1088730eRD != null) {
            ARunnableS117S0100000_17 aRunnableS117S0100000_17 = c1088730eRD.LIZJ;
            if (aRunnableS117S0100000_17 != null) {
                c1088730eRD.LJII.removeCallbacks(aRunnableS117S0100000_17);
            }
            c1088730eRD.LIZJ = null;
            C1088660eR6 c1088660eR6 = c1088730eRD.LJ;
            if (c1088660eR6 != null) {
                c1088660eR6.LIZ(true);
            }
            c1088730eRD.LJ = null;
            C1088740eRE c1088740eRE = c1088730eRD.LIZLLL;
            if (c1088740eRE != null) {
                C1102070emj c1102070emj = C1102070emj.LIZ;
                DataChannel dataChannel = c1088730eRD.LIZ;
                String str = c1088740eRE.LIZ;
                c1102070emj.getClass();
                C1102070emj.LJIIL(dataChannel, 1, str);
            }
            c1088730eRD.LJI = false;
            c1088730eRD.LIZLLL = null;
            c1088730eRD.LIZIZ = null;
        }
        this.LLJJJJ = null;
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        C0IUA.LIZJ = 0;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null) {
            c0ixl.LJJIL = 0;
        }
        C1810700xDg.LJFF = 0;
        this.LLILZ = true;
        this.LLJILLL.LJ();
        this.LLILLJJLI = null;
        IMessageManager iMessageManager = (IMessageManager) this.LL.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLILZ = true;
        this.LLILZIL = 0;
        this.LLJJI = 0;
        this.LLJJIII = null;
        ((ArrayList) this.LLIZ).clear();
        ((ArrayList) this.LLJJIJIL).clear();
        this.LLJJJ = false;
        this.LLJJIJI = false;
        this.LLJJJIL = false;
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLIZLLLIL = new OnlineRankConfig(true, true, true, 2, true);
        C1105330erz.LIZLLL = 0L;
        C1105330erz.LJ = 0L;
        C1105330erz.LIZ = false;
        C1105330erz.LIZIZ = true;
        C1105330erz.LJFF = null;
        C1105330erz.LJI = 0L;
        Room room = this.LLJILJIL;
        if (room != null) {
            long id = room.getId();
            if (id != 0 && (concurrentHashMap = (ConcurrentHashMap) dataChannelGlobal.gg0(C1148010fyp.class)) != null) {
                concurrentHashMap.remove(Long.valueOf(id));
            }
        }
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableOnlineAudienceRefreshInterval()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.ONLINE_AUDIENCE_REFRESH_INTERVAL);
        }
    }

    public final boolean LJI() {
        if (!((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ee1(this.LLJILJIL)) {
            return false;
        }
        if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS()) {
            return true;
        }
        return this.LLIZLLLIL.onlinePanelShow;
    }

    public final boolean LJII() {
        if (!LiveAnchorGiftDisableSetting.INSTANCE.getValue()) {
            return this.LLIZLLLIL.onlinePanelClick;
        }
        C766270U4b.LIZLLL(2131855618);
        return false;
    }

    public final void onResume() {
        C1105520esI c1105520esI = this.LLJJIII;
        if (c1105520esI == null || !c1105520esI.LIZLLL) {
            return;
        }
        c1105520esI.LIZLLL = false;
        c1105520esI.LJ = 0L;
        c1105520esI.LJFF = System.currentTimeMillis();
    }

    public C1105320ery(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // X.C01VE
    public final void LIZ(RoomUserSeqMessage roomUserSeqMessage) {
        long id;
        long j;
        String str;
        long id2;
        AudienceRankingEntranceViewModel viewModel;
        if (roomUserSeqMessage != null) {
            try {
                if (roomUserSeqMessage.mContributors != null) {
                    int i = C1105710esb.LIZLLL;
                    DataChannel dataChannel = this.LL;
                    if (dataChannel != null) {
                        Room room = (Room) dataChannel.gg0(RoomChannel.class);
                        if (room != null) {
                            id2 = room.getId();
                        } else {
                            id2 = 0;
                        }
                        if (!(!roomUserSeqMessage.isCurrentRoom(id2))) {
                            C1105330erz.LJFF = roomUserSeqMessage;
                            if (roomUserSeqMessage.mContributors != null) {
                                C1105360es2.LJFF = System.currentTimeMillis();
                                C1105360es2.LIZJ.LIZ.clear();
                                Iterator<Contributor> it2 = roomUserSeqMessage.mContributors.iterator();
                                while (it2.hasNext()) {
                                    User user = it2.next().mUser;
                                    if (user != null) {
                                        C1105360es2.LIZJ.LIZ.add(user);
                                    }
                                }
                                C1105360es2.LIZJ.getClass();
                            }
                            C474750IjZ.LIZLLL = (int) roomUserSeqMessage.mTotal;
                            ((ArrayList) this.LLIZ).clear();
                            ((ArrayList) this.LLJJIJIL).clear();
                            this.LLJJJ = false;
                            List listLJJJJLI = C13LP.LJJJJLI(roomUserSeqMessage.mContributors);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : (ArrayList) listLJJJJLI) {
                                if (((Contributor) obj).mUser != null) {
                                    arrayList.add(obj);
                                }
                            }
                            List listLL = C13LP.LL(arrayList, this.LLIZLLLIL.avatarNumber + 1);
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                            Iterator it3 = listLL.iterator();
                            while (true) {
                                EnumC187400no enumC187400noVQ2 = null;
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Contributor contributor = (Contributor) it3.next();
                                InterfaceC1105450esB interfaceC1105450esB = this.LLILLJJLI;
                                if (interfaceC1105450esB != null && (viewModel = interfaceC1105450esB.getViewModel()) != null) {
                                    enumC187400noVQ2 = viewModel.vQ2();
                                }
                                User user2 = contributor.mUser;
                                long j2 = contributor.mScore;
                                long j3 = contributor.mRank;
                                if (enumC187400noVQ2 == null) {
                                    enumC187400noVQ2 = EnumC187400no.TOP_VIEWER;
                                }
                                arrayList2.add(new C1105460esC(user2, j2, j3, "", 0L, enumC187400noVQ2));
                            }
                            int i2 = 0;
                            for (Object obj2 : arrayList2) {
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    C1105460esC c1105460esC = (C1105460esC) obj2;
                                    if (i2 <= this.LLIZLLLIL.avatarNumber - 1) {
                                        ((ArrayList) this.LLIZ).add(c1105460esC);
                                    }
                                    if (i2 <= this.LLIZLLLIL.avatarNumber - 1 && c1105460esC.LIZ.getId() == this.LLJJIJIIJIL) {
                                        this.LLJJJ = true;
                                    }
                                    if (c1105460esC.LIZ.getId() != this.LLJJIJIIJIL && ((ArrayList) this.LLJJIJIL).size() < this.LLIZLLLIL.avatarNumber) {
                                        ((ArrayList) this.LLJJIJIL).add(c1105460esC);
                                    }
                                    i2 = i3;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            if (!C500260Jjc.LJIIZILJ(this.LL)) {
                                List listLJJJJLI2 = C13LP.LJJJJLI(roomUserSeqMessage.mContributors);
                                ArrayList<Contributor> arrayList3 = new ArrayList();
                                for (Object obj3 : (ArrayList) listLJJJJLI2) {
                                    if (((Contributor) obj3).mUser != null) {
                                        arrayList3.add(obj3);
                                    }
                                }
                                boolean z = false;
                                int i4 = 0;
                                for (Contributor contributor2 : arrayList3) {
                                    if (contributor2.mScore > 0) {
                                        i4++;
                                    }
                                    User user3 = contributor2.mUser;
                                    if (user3 != null && user3.getId() == UserService.getInstance().user().getCurrentUserId()) {
                                        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                                        C1810700xDg.LJI = contributor2.mRank;
                                        C1810700xDg.LJII = contributor2.mScore;
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    C1810700xDg.LJI = 0L;
                                    C1810700xDg.LJII = 0L;
                                }
                                C1105510esH.LIZ().LIZ = arrayList3;
                                C1105510esH.LIZ().LIZIZ = i4;
                            }
                            int i5 = (int) roomUserSeqMessage.mTotal;
                            C1105520esI c1105520esI = this.LLJJIII;
                            if (c1105520esI != null) {
                                c1105520esI.LIZ = roomUserSeqMessage.getMessageId();
                                c1105520esI.LIZJ = 1;
                            }
                            C1105330erz.LJ(this.LL, i5, this.LLILZIL, this.LLJJIII);
                            LJIIIIZZ(i5);
                            return;
                        }
                    }
                    DataChannel dataChannel2 = this.LL;
                    int i6 = this.LLILZIL;
                    if (dataChannel2 != null) {
                        Room room2 = (Room) dataChannel2.gg0(RoomChannel.class);
                        if (room2 != null) {
                            id = room2.getId();
                        } else {
                            id = 0;
                        }
                        CommonMessageData commonMessageData = roomUserSeqMessage.baseMessage;
                        if (commonMessageData != null) {
                            j = commonMessageData.roomId;
                        } else {
                            j = 0;
                        }
                        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_seq_message_room_id_error", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                        c474500IjALIZIZ.LJJII(Integer.valueOf(i6), "cur_user_count");
                        c474500IjALIZIZ.LJJII(Long.valueOf(roomUserSeqMessage.mTotal), "message_user_count");
                        c474500IjALIZIZ.LJJII(Long.valueOf(roomUserSeqMessage.getMessageId()), "msg_id");
                        CommonMessageData commonMessageData2 = roomUserSeqMessage.baseMessage;
                        if (commonMessageData2 == null || (str = commonMessageData2.logId) == null) {
                            str = "";
                        }
                        c474500IjALIZIZ.LJJII(str, "msg_log_id");
                        c474500IjALIZIZ.LJJII(Long.valueOf(id), "cur_room_id");
                        c474500IjALIZIZ.LJJII(Long.valueOf(j), "message_room_id");
                        c474500IjALIZIZ.LIZ();
                        return;
                    }
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.C01VE
    public final void LIZIZ(C148100hT c148100hT) {
        OnlineRankListResponse onlineRankListResponse;
        long id;
        int i;
        long j;
        long j2;
        EnumC187400no enumC187400noVQ2;
        AudienceRankingEntranceViewModel viewModel;
        Long l;
        long j3;
        if (c148100hT != null) {
            onlineRankListResponse = c148100hT.LIZ;
        } else {
            onlineRankListResponse = null;
        }
        if (onlineRankListResponse != null) {
            Room room = (Room) this.LL.gg0(RoomChannel.class);
            long jLongValue = 0;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            if (id != 0 && (!C01PJ.LIZ(id, this.LL).LIZIZ)) {
                Room room2 = (Room) this.LL.gg0(RoomChannel.class);
                if (room2 != null) {
                    j3 = room2.roomPcu;
                } else {
                    j3 = 0;
                }
                i = (int) j3;
            } else {
                i = onlineRankListResponse.total;
            }
            DataChannel dataChannel = this.LL;
            C01PK c01pkLIZ = C01PJ.LIZ(id, dataChannel);
            dataChannel.SX0(C1083480eIk.class, new C01PK(c01pkLIZ.LIZ, true, c01pkLIZ.LIZJ));
            LJIIIIZZ(i);
            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
            Rank rank = onlineRankListResponse.selfInfo;
            if (rank != null) {
                j = rank.rank;
            } else {
                j = 0;
            }
            C1810700xDg.LJI = j;
            if (rank != null) {
                j2 = rank.score;
            } else {
                j2 = 0;
            }
            C1810700xDg.LJII = j2;
            this.LLJ = true;
            DataChannel dataChannel2 = this.LL;
            if (C1105330erz.LJ == 0 && C1127020fQy.LIZ(0.1f, "ttlive_audience_rank_entrance_show_all") && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_audience_rank_entrance_show_all", 0.1d)) {
                C1105330erz.LJ = System.currentTimeMillis();
                HashMap map = new HashMap();
                map.put("data_source", "entrance");
                map.put("duration", Long.valueOf(C1105330erz.LJ - C1105330erz.LIZLLL));
                map.put("is_error", Boolean.FALSE);
                if (dataChannel2 != null && (l = (Long) dataChannel2.gg0(C1082850eHj.class)) != null) {
                    jLongValue = l.longValue();
                }
                map.put("room_duration", Long.valueOf(C1105330erz.LJ - jLongValue));
                C1105330erz.LIZ(dataChannel2, map);
                C501590Jll.LJ(map);
                C1CC2.LJIIJJI(0, "ttlive_audience_rank_entrance_show_all", map, C1105330erz.LJ - C1105330erz.LIZLLL);
            }
            try {
                if (onlineRankListResponse.ranks != null) {
                    C1105360es2.LIZIZ = c148100hT.LIZIZ;
                    OnlineRankListResponse onlineRankListResponse2 = C1105360es2.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1105360es2.LJ = jCurrentTimeMillis;
                    C1105360es2.LJFF = jCurrentTimeMillis;
                    List<Rank> list = onlineRankListResponse.ranks;
                    if (list != null) {
                        int size = list.size();
                        if (size > 5) {
                            size = 5;
                        }
                        List<Rank> listSubList = list.subList(0, size);
                        onlineRankListResponse2.ranks = listSubList;
                        Iterator<Rank> it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            User user = it2.next().user;
                            if (user != null) {
                                C1105360es2.LIZJ.LIZ.add(user);
                            }
                        }
                    }
                    onlineRankListResponse2.selfInfo = onlineRankListResponse.selfInfo;
                    onlineRankListResponse2.currency = onlineRankListResponse.currency;
                    onlineRankListResponse2.isBroadcastMENAT = onlineRankListResponse.isBroadcastMENAT;
                    onlineRankListResponse2.ruleUrl = onlineRankListResponse.ruleUrl;
                    onlineRankListResponse2.total = onlineRankListResponse.total;
                    C1105360es2.LIZJ.getClass();
                    onlineRankListResponse2.config = onlineRankListResponse.config;
                    OnlineRankConfig onlineRankConfig = onlineRankListResponse.config;
                    if (onlineRankConfig != null) {
                        this.LLIZLLLIL = onlineRankConfig;
                        this.LL.zW(OnlineRankConfigChannel.class, onlineRankConfig);
                    }
                    ((ArrayList) this.LLIZ).clear();
                    ((ArrayList) this.LLJJIJIL).clear();
                    this.LLJJJ = false;
                    List<Rank> list2 = onlineRankListResponse.ranks;
                    ArrayList arrayList = new ArrayList();
                    for (Rank rank2 : list2) {
                        if (rank2.user != null) {
                            arrayList.add(rank2);
                        }
                    }
                    List<Rank> listLL = C13LP.LL(arrayList, this.LLIZLLLIL.avatarNumber + 1);
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                    for (Rank rank3 : listLL) {
                        InterfaceC1105450esB interfaceC1105450esB = this.LLILLJJLI;
                        if (interfaceC1105450esB != null && (viewModel = interfaceC1105450esB.getViewModel()) != null) {
                            enumC187400noVQ2 = viewModel.vQ2();
                        } else {
                            enumC187400noVQ2 = null;
                        }
                        User user2 = rank3.user;
                        if (user2 != null) {
                            long j4 = rank3.score;
                            long j5 = rank3.rank;
                            String str = rank3.gapDescription;
                            long j6 = rank3.userRestrictionLevel;
                            if (enumC187400noVQ2 == null) {
                                enumC187400noVQ2 = EnumC187400no.TOP_VIEWER;
                            }
                            arrayList2.add(new C1105460esC(user2, j4, j5, str, j6, enumC187400noVQ2));
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    int i2 = 0;
                    for (Object obj : arrayList2) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C1105460esC c1105460esC = (C1105460esC) obj;
                            if (i2 <= this.LLIZLLLIL.avatarNumber - 1) {
                                ((ArrayList) this.LLIZ).add(c1105460esC);
                            }
                            if (i2 <= this.LLIZLLLIL.avatarNumber - 1 && c1105460esC.LIZ.getId() == this.LLJJIJIIJIL) {
                                this.LLJJJ = true;
                            }
                            if (c1105460esC.LIZ.getId() != this.LLJJIJIIJIL && ((ArrayList) this.LLJJIJIL).size() < this.LLIZLLLIL.avatarNumber) {
                                ((ArrayList) this.LLJJIJIL).add(c1105460esC);
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    LJ(this.LLJJJJJIL);
                    this.LLJJJJJIL = false;
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        this.LLJ = true;
        C1105330erz.LIZLLL(this.LL, new Throwable("gson parse error"));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.InterfaceC1105450esB r6) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1105320ery.LIZJ(X.0esB):void");
    }

    public final void LJ(boolean z) {
        Long lValueOf;
        Room room;
        RoomAuthStatus roomAuthStatus;
        EnumC187400no enumC187400noVQ2;
        String str;
        Object obj;
        String str2;
        long ownerUserId;
        String rankingName;
        Room room2;
        AudienceRankingEntranceViewModel viewModel;
        try {
            if (this.LLILLJJLI != null) {
                if (this.LLJ) {
                    this.LLILZ = false;
                    Long lValueOf2 = null;
                    long messageId = 0;
                    int i = 2;
                    if (LJI()) {
                        InterfaceC1105450esB interfaceC1105450esB = this.LLILLJJLI;
                        if (interfaceC1105450esB != null) {
                            interfaceC1105450esB.b0(this.LLILZIL);
                        }
                        if (this.LLJI) {
                            DataChannel dataChannel = this.LL;
                            InterfaceC1105450esB interfaceC1105450esB2 = this.LLILLJJLI;
                            if (interfaceC1105450esB2 != null && (viewModel = interfaceC1105450esB2.getViewModel()) != null) {
                                enumC187400noVQ2 = viewModel.vQ2();
                            } else {
                                enumC187400noVQ2 = null;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("rank_position", "top_right");
                            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                                str = "anchor";
                            } else {
                                str = "user";
                            }
                            linkedHashMap.put("user_type", str);
                            boolean z2 = C1086280eNG.LIZIZ.LJI;
                            String str3 = CardStruct.IStatusCode.DEFAULT;
                            if (z2) {
                                obj = "1";
                            } else {
                                obj = CardStruct.IStatusCode.DEFAULT;
                            }
                            linkedHashMap.put("boost_card_effective", obj);
                            if (Intrinsics.LJFF("top_right", "top_right")) {
                                str3 = "-1";
                            } else if (C1810700xDg.LJ(dataChannel) == 2) {
                                str3 = "1";
                            }
                            linkedHashMap.put("is_ranking_turn_off", str3);
                            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_active_user_rank_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                            c474500IjALIZIZ.LJJIIZI(linkedHashMap);
                            if (!Intrinsics.LJFF("top_right", "top_right") && !C500260Jjc.LJIIZILJ(dataChannel) && C1810700xDg.LJ(dataChannel) == 2) {
                                str2 = "ranking_turned_off";
                            } else {
                                str2 = "null";
                            }
                            c474500IjALIZIZ.LJJII(str2, "bottom_bar_content");
                            if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                                ownerUserId = room2.getOwnerUserId();
                            } else {
                                ownerUserId = 0;
                            }
                            c474500IjALIZIZ.LJJII(Long.valueOf(ownerUserId), "author_id");
                            if (enumC187400noVQ2 != null) {
                                rankingName = enumC187400noVQ2.getRankingName();
                            } else {
                                rankingName = null;
                            }
                            c474500IjALIZIZ.LJJII(rankingName, "rank_type");
                            c474500IjALIZIZ.LJJII("top_right", "enter_type");
                            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                                c474500IjALIZIZ.LJIJJLI(dataChannel);
                                c474500IjALIZIZ.LIZ();
                            } else {
                                c474500IjALIZIZ.LJJIJLIJ();
                                c474500IjALIZIZ.LJIIIIZZ();
                                c474500IjALIZIZ.LJJII(w.LIZ.LIZJ(), "live_type");
                                c474500IjALIZIZ.LJJII(w.LJIILIIL(), "event_page");
                                c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
                                c474500IjALIZIZ.LJJIJL();
                            }
                        }
                        C1105520esI c1105520esI = this.LLJJIII;
                        if (c1105520esI != null) {
                            c1105520esI.LIZJ = 2;
                        }
                        C1105330erz.LJ(this.LL, this.LLILZIL, this.LLJJI, c1105520esI);
                        this.LLJJI = this.LLILZIL;
                        C1105520esI c1105520esI2 = this.LLJJIII;
                        if (c1105520esI2 != null) {
                            c1105520esI2.LIZIZ = System.currentTimeMillis();
                        }
                    } else {
                        InterfaceC1105450esB interfaceC1105450esB3 = this.LLILLJJLI;
                        if (interfaceC1105450esB3 != null) {
                            interfaceC1105450esB3.T();
                        }
                    }
                    LiveAudienceRankingOptOutFallbackSetting liveAudienceRankingOptOutFallbackSetting = LiveAudienceRankingOptOutFallbackSetting.INSTANCE;
                    if (liveAudienceRankingOptOutFallbackSetting.getValue() && this.LLJJJIL) {
                        this.LL.zW(AudienceInProfileListChannel.class, this.LLJJIJIL);
                    } else {
                        this.LL.zW(AudienceInProfileListChannel.class, this.LLIZ);
                    }
                    if (!this.LLJIJIL || ((C497740JfY.LJJI(C497740JfY.LJIIZILJ()) <= 320.0f && !LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) || LiveAnchorGiftDisableSetting.INSTANCE.getValue() || ((!this.LLJILJILJ && (room = this.LLJILJIL) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && !roomAuthStatus.isEnableGift()) || !Intrinsics.LJFF(this.LL.gg0(C0TZM.class), Boolean.TRUE) || !this.LLIZLLLIL.avatarShow))) {
                        InterfaceC1105450esB interfaceC1105450esB4 = this.LLILLJJLI;
                        if (interfaceC1105450esB4 != null) {
                            interfaceC1105450esB4.LJJLIIIJJI();
                        }
                        InterfaceC1105450esB interfaceC1105450esB5 = this.LLILLJJLI;
                        if (interfaceC1105450esB5 != null) {
                            interfaceC1105450esB5.S(0);
                        }
                    } else {
                        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                        if (C1810700xDg.LJ(this.LL) == 2) {
                            C1810700xDg.LJI = 0L;
                            C1810700xDg.LJII = 0L;
                        }
                        InterfaceC1105450esB interfaceC1105450esB6 = this.LLILLJJLI;
                        if (interfaceC1105450esB6 != null) {
                            interfaceC1105450esB6.LLLLII();
                        }
                        if (liveAudienceRankingOptOutFallbackSetting.getValue() && this.LLJJJIL) {
                            InterfaceC1105450esB interfaceC1105450esB7 = this.LLILLJJLI;
                            if (interfaceC1105450esB7 != null) {
                                interfaceC1105450esB7.LLLZIIL(this.LLJJIJIL, z);
                            }
                        } else {
                            InterfaceC1105450esB interfaceC1105450esB8 = this.LLILLJJLI;
                            if (interfaceC1105450esB8 != null) {
                                interfaceC1105450esB8.LLLZIIL(this.LLIZ, z);
                            }
                        }
                    }
                    this.LLJI = false;
                    DataChannel dataChannel2 = this.LL;
                    RoomUserSeqMessage roomUserSeqMessage = C1105330erz.LJFF;
                    if (roomUserSeqMessage != null && roomUserSeqMessage.getMessageId() != C1105330erz.LJI) {
                        RoomUserSeqMessage roomUserSeqMessage2 = C1105330erz.LJFF;
                        if (roomUserSeqMessage2 != null) {
                            messageId = roomUserSeqMessage2.getMessageId();
                        }
                        C1105330erz.LJI = messageId;
                        C474500IjA c474500IjALIZIZ2 = C0IJT.LIZIZ("livesdk_online_user_count_im", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                        c474500IjALIZIZ2.LJIJJLI(dataChannel2);
                        RoomUserSeqMessage roomUserSeqMessage3 = C1105330erz.LJFF;
                        if (roomUserSeqMessage3 != null) {
                            lValueOf = Long.valueOf(roomUserSeqMessage3.getMessageId());
                        } else {
                            lValueOf = null;
                        }
                        c474500IjALIZIZ2.LJJII(lValueOf, "msg_id");
                        RoomUserSeqMessage roomUserSeqMessage4 = C1105330erz.LJFF;
                        if (roomUserSeqMessage4 != null) {
                            lValueOf2 = Long.valueOf(roomUserSeqMessage4.mTotal);
                        }
                        c474500IjALIZIZ2.LJJII(lValueOf2, "total");
                        if (dataChannel2 != null && C500260Jjc.LJIIZILJ(dataChannel2)) {
                            i = 1;
                        }
                        c474500IjALIZIZ2.LJJII(Integer.valueOf(i), "user_type");
                        c474500IjALIZIZ2.LJJII(Long.valueOf(System.currentTimeMillis()), "ts");
                        c474500IjALIZIZ2.LIZ();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIIIZZ(int i) {
        long id;
        C0IXL c0ixl;
        this.LLILZ = true;
        this.LLILZIL = i;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).rf2(this.LLILZIL);
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        int i2 = this.LLILZIL;
        c1276840jKc.getClass();
        C1276840jKc.LJIIL.put("acu_num", String.valueOf(i2));
        if (C1276840jKc.LJIIZILJ == 0 && i2 > 0 && !C1276840jKc.LJJIJ && C1276840jKc.LJJIJIIJI == 0) {
            C1276840jKc.LJJIJIIJI = C1276840jKc.LJJJ.invoke().longValue() * 1000;
        }
        C1276840jKc.LJIIZILJ = i2;
        C1276840jKc.LJIIJ.put("user_count", String.valueOf(i2));
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        int i3 = this.LLILZIL;
        C0IUA.LIZJ = i3;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null) {
            c0ixl.LJJIL = i3;
        }
        C1810700xDg.LJFF = i3;
        this.LL.SX0(C0UZS.class, Integer.valueOf(this.LLILZIL));
        this.LL.zW(MemberCountChannel.class, Integer.valueOf(this.LLILZIL));
        Room room = this.LLJILJIL;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        int i4 = this.LLILZIL;
        if (id != 0) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) dataChannelGlobal.gg0(C1148010fyp.class);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
                dataChannelGlobal.JQ2(C1148010fyp.class, concurrentHashMap);
            }
            concurrentHashMap.put(Long.valueOf(id), Integer.valueOf(i4));
        }
        C474750IjZ.LIZLLL = this.LLILZIL;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Map<String, String> map;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        if (iMessage instanceof RoomVerifyMessage) {
            int i = ((RoomVerifyMessage) iMessage).verifyAction;
            if (i == 34) {
                Room room = this.LLJILJIL;
                if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null) {
                    roomAuthStatus2.setEnableViewers(true);
                }
                this.LLJIJIL = true;
                return;
            }
            if (i != 35) {
                return;
            }
            Room room2 = this.LLJILJIL;
            if (room2 != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null) {
                roomAuthStatus.setEnableViewers(false);
            }
            this.LLJIJIL = false;
            return;
        }
        if (!(iMessage instanceof EpiMessage)) {
            return;
        }
        long j = this.LLJJ;
        int i2 = C1105710esb.LIZLLL;
        EpiDecision epiDecision = ((EpiMessage) iMessage).decisions;
        if (epiDecision != null) {
            map = epiDecision.data;
        } else {
            map = null;
        }
        long jLIZIZ = C1105710esb.LIZIZ(map);
        this.LLJJ = jLIZIZ;
        if (j == jLIZIZ) {
            return;
        }
        LIZLLL();
    }
}
