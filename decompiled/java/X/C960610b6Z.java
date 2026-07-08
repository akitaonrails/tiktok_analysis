package X;

import Y.AfS0S0410100_15;
import Y.AfS0S0510100_15;
import Y.AfS109S0300000_15;
import Y.AfS151S0200000_15;
import Y.AfS172S0100000_3;
import Y.AfS1S1101100_15;
import Y.AfS82S0101000_15;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.reservation.MultiCoHostNudgeCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.reservation.MultiCoHostNudgeCountUpEvent;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse;
import com.bytedance.android.livesdk.dataChannel.CoHostIsClickInvite;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostInviteSameLevelInSearchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSearchLeagueAutoRefreshSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveFriendRankingSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b6Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960610b6Z extends AbstractC960710b6j implements InterfaceC950820aqm {
    public final DataChannel LLIZ;
    public String LLIZLLLIL;
    public Map<Long, ? extends RivalExtraInfo> LLJ;
    public Map<Long, ? extends RivalExtraInfo> LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;
    public C00CG LLJJ;
    public List<? extends Room> LLJJI;
    public final Map<Long, RivalExtraInfo> LLJJIII;
    public Map<Long, ? extends RivalsListsData.TopHostInfo> LLJJIJI;
    public final Map<Long, String> LLJJIJIIJIL;
    public EnumC959280b4Q LLJJIJIL;
    public final C960510b6P LLJJJ;
    public final C960780b6q LLJJJIL;
    public final C960770b6p LLJJJJ;
    public final C960660b6e LLJJJJJIL;

    @Override // X.InterfaceC950820aqm
    public final void LJ() {
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZLLL() {
        MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LL;
        if (multiCoHostSearchContract$AbsView != null) {
            multiCoHostSearchContract$AbsView.cS();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void LJIIIIZZ() {
        C960510b6P c960510b6P = this.LLJJJ;
        c960510b6P.LJI();
        c960510b6P.LJI = new C960530b6R();
        this.LLIZ.zQ2(this);
    }

    @Override // X.AbstractC960710b6j
    public final void LJIIL() {
        InterfaceC960800b6s.LLLLJI.LJFF(C13BV.INSTANCE);
    }

    public final void LJJII() {
        if (!this.LLILLL.isEmpty()) {
            this.LLILZIL.add(new C961160b7S(C497740JfY.LJIJI(LiveCoHostInviteSameLevelInSearchSetting.INSTANCE.isEnable() ? 2131851865 : 2131841216), 0, 6));
            this.LLJIJIL = true;
        }
    }

    public final boolean LJJIIJZLJL() {
        return (this.LLILLJJLI.isEmpty() ^ true) || (this.LLILLL.isEmpty() ^ true);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void onCreate() {
        this.LLJJJ.LJI = this.LLJJJJJIL;
    }

    public static boolean LJJIIZ(RivalExtraInfo rivalExtraInfo) {
        if (rivalExtraInfo.showPlayType != 2 && rivalExtraInfo.reserveInfo != null && C955940az2.LIZ(rivalExtraInfo)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC960710b6j
    public final void LJIIJ(Room room) {
        C950790aqj.LIZLLL(room);
    }

    @Override // X.AbstractC960710b6j
    public final void LJIILIIL(int i) {
        this.LLJJJ.LJI();
        DataChannel dataChannel = this.LLIZ;
        final EnumC952640ati enumC952640ati = EnumC952640ati.FRIEND_LIST_SEARCH;
        C960910b73.LIZLLL(dataChannel, i, 0L, 0L, 0L, enumC952640ati, "", null, new AbstractC961450b7v(enumC952640ati) { // from class: X.0b6b
            @Override // X.AbstractC961450b7v
            public final void LIZ(String str) {
            }

            @Override // X.AbstractC961450b7v
            public final void LIZIZ(Throwable th) {
                C960610b6Z c960610b6Z = this.LIZIZ;
                if (c960610b6Z.LLJJIJIL != EnumC959280b4Q.FRIENDS_RANKING) {
                    return;
                }
                c960610b6Z.LLJJJ.LJI();
                this.LIZIZ.LJJI(false);
                this.LIZIZ.LLILZLL.add(new C960760b6o(C497740JfY.LJIJI(2131855543), false));
                MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LIZIZ.LL;
                if (multiCoHostSearchContract$AbsView != null) {
                    multiCoHostSearchContract$AbsView.VR(th);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData$TopHostInfo>] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
            @Override // X.AbstractC961450b7v
            public final void LIZJ(RivalsListExtra rivalsListExtra, RivalsListsData rivalsListsData, String str, long j, EnumC961090b7L enumC961090b7L) {
                List listLJJJJLI;
                ?? LJ;
                String requestId;
                if (this.LIZIZ.LLJJIJIL != EnumC959280b4Q.FRIENDS_RANKING) {
                    return;
                }
                List<Room> list = rivalsListsData.friendSearchList;
                if (list != null) {
                    listLJJJJLI = C13LP.LJJJJLI(list);
                } else {
                    listLJJJJLI = C13BV.INSTANCE;
                }
                Map<Long, RivalExtraInfo> map = rivalsListsData.rivalExtraInfos;
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Long, RivalExtraInfo> entry : map.entrySet()) {
                        if (entry.getKey() != null || entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    this.LIZIZ.LLJJIII.putAll(linkedHashMap);
                }
                C960610b6Z c960610b6Z = this.LIZIZ;
                Map<Long, RivalsListsData.TopHostInfo> map2 = rivalsListsData.roomTopHostInfo;
                if (map2 != null) {
                    LJ = new LinkedHashMap();
                    for (Map.Entry<Long, RivalsListsData.TopHostInfo> entry2 : map2.entrySet()) {
                        if (entry2.getKey() != null || entry2.getValue() != null) {
                            LJ.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
                c960610b6Z.LLJJIJI = LJ;
                Set<Long> setKeySet = rivalsListsData.rivalExtraInfos.keySet();
                C960610b6Z c960610b6Z2 = this.LIZIZ;
                for (Long l : setKeySet) {
                    if (l != null) {
                        long jLongValue = l.longValue();
                        Map<Long, String> map3 = c960610b6Z2.LLJJIJIIJIL;
                        Long lValueOf = Long.valueOf(jLongValue);
                        if (rivalsListExtra == null || (requestId = rivalsListExtra.getRequestId()) == null) {
                            requestId = "";
                        }
                        map3.put(lValueOf, requestId);
                    }
                }
                this.LIZIZ.LJJI(false);
                C960610b6Z c960610b6Z3 = this.LIZIZ;
                int i2 = 0;
                for (Object obj : listLJJJJLI) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        Room room = (Room) obj;
                        RivalExtraInfo rivalExtraInfo = (RivalExtraInfo) ((LinkedHashMap) c960610b6Z3.LLJJIII).get(Long.valueOf(room.getId()));
                        if (rivalExtraInfo != null) {
                            RivalsListsData.TopHostInfo topHostInfo = c960610b6Z3.LLJJIJI.get(Long.valueOf(room.getId()));
                            if (topHostInfo == null) {
                                topHostInfo = RivalsListsData.TopHostInfo.LIZ;
                            }
                            C957700b1s c957700b1s = new C957700b1s(room, topHostInfo, C955540ayO.LJJJZ, rivalExtraInfo, (String) ((LinkedHashMap) c960610b6Z3.LLJJIJIIJIL).get(Long.valueOf(room.getId())), EnumC961080b7K.IDLE);
                            c957700b1s.LJJ = EnumC959280b4Q.FRIENDS_RANKING;
                            c957700b1s.LJJI = i3;
                            c957700b1s.LJIJJ = EnumC961060b7I.Normal;
                            c960610b6Z3.LLILZLL.add(c957700b1s);
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LIZIZ.LL;
                if (multiCoHostSearchContract$AbsView != null) {
                    multiCoHostSearchContract$AbsView.WR(false, new LinkedHashSet());
                }
                if (LiveCoHostSearchLeagueAutoRefreshSetting.INSTANCE.isEnable()) {
                    this.LIZIZ.LLJJJ.LJFF(false);
                }
            }
        }, 7);
    }

    @Override // X.AbstractC960710b6j
    public final void LJIILJJIL(int i) {
        this.LLJJJ.LJI();
        DataChannel dataChannel = this.LLIZ;
        final EnumC952640ati enumC952640ati = EnumC952640ati.LEAGUE_RECOMMEND;
        C960910b73.LIZLLL(dataChannel, i, 0L, 0L, 0L, enumC952640ati, "", null, new AbstractC961450b7v(enumC952640ati) { // from class: X.0b6c
            @Override // X.AbstractC961450b7v
            public final void LIZ(String str) {
            }

            @Override // X.AbstractC961450b7v
            public final void LIZIZ(Throwable th) {
                if (LiveFriendRankingSetting.INSTANCE.getEnableFriendRanking() && this.LIZIZ.LLJJIJIL != EnumC959280b4Q.LEAGUE_RECOMMEND) {
                    return;
                }
                this.LIZIZ.LLJJJ.LJI();
                this.LIZIZ.LJJI(false);
                this.LIZIZ.LLILZLL.add(new C960760b6o(C497740JfY.LJIJI(2131846589), false));
                MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LIZIZ.LL;
                if (multiCoHostSearchContract$AbsView != null) {
                    multiCoHostSearchContract$AbsView.ZR();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData$TopHostInfo>] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
            @Override // X.AbstractC961450b7v
            public final void LIZJ(RivalsListExtra rivalsListExtra, RivalsListsData rivalsListsData, String str, long j, EnumC961090b7L enumC961090b7L) {
                List<? extends Room> listLJJJJLI;
                ?? LJ;
                String requestId;
                if (LiveFriendRankingSetting.INSTANCE.getEnableFriendRanking() && this.LIZIZ.LLJJIJIL != EnumC959280b4Q.LEAGUE_RECOMMEND) {
                    return;
                }
                C960610b6Z c960610b6Z = this.LIZIZ;
                List<Room> list = rivalsListsData.leagueRecommendList;
                if (list != null) {
                    listLJJJJLI = C13LP.LJJJJLI(list);
                } else {
                    listLJJJJLI = C13BV.INSTANCE;
                }
                c960610b6Z.LLJJI = listLJJJJLI;
                Map<Long, RivalExtraInfo> map = rivalsListsData.rivalExtraInfos;
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Long, RivalExtraInfo> entry : map.entrySet()) {
                        if (entry.getKey() != null || entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    this.LIZIZ.LLJJIII.putAll(linkedHashMap);
                }
                C960610b6Z c960610b6Z2 = this.LIZIZ;
                Map<Long, RivalsListsData.TopHostInfo> map2 = rivalsListsData.roomTopHostInfo;
                if (map2 != null) {
                    LJ = new LinkedHashMap();
                    for (Map.Entry<Long, RivalsListsData.TopHostInfo> entry2 : map2.entrySet()) {
                        if (entry2.getKey() != null || entry2.getValue() != null) {
                            LJ.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
                c960610b6Z2.LLJJIJI = LJ;
                Set<Long> setKeySet = rivalsListsData.rivalExtraInfos.keySet();
                C960610b6Z c960610b6Z3 = this.LIZIZ;
                for (Long l : setKeySet) {
                    if (l != null) {
                        long jLongValue = l.longValue();
                        Map<Long, String> map3 = c960610b6Z3.LLJJIJIIJIL;
                        Long lValueOf = Long.valueOf(jLongValue);
                        if (rivalsListExtra == null || (requestId = rivalsListExtra.getRequestId()) == null) {
                            requestId = "";
                        }
                        map3.put(lValueOf, requestId);
                    }
                }
                this.LIZIZ.LJJI(false);
                C960610b6Z c960610b6Z4 = this.LIZIZ;
                for (Room room : c960610b6Z4.LLJJI) {
                    RivalExtraInfo rivalExtraInfo = (RivalExtraInfo) ((LinkedHashMap) c960610b6Z4.LLJJIII).get(Long.valueOf(room.getId()));
                    if (rivalExtraInfo != null) {
                        RivalsListsData.TopHostInfo topHostInfo = c960610b6Z4.LLJJIJI.get(Long.valueOf(room.getId()));
                        if (topHostInfo == null) {
                            topHostInfo = RivalsListsData.TopHostInfo.LIZ;
                        }
                        C957700b1s c957700b1s = new C957700b1s(room, topHostInfo, C955540ayO.LJJJ, rivalExtraInfo, (String) ((LinkedHashMap) c960610b6Z4.LLJJIJIIJIL).get(Long.valueOf(room.getId())), EnumC961080b7K.IDLE);
                        c957700b1s.LJIJJ = EnumC961060b7I.Normal;
                        c960610b6Z4.LLILZLL.add(c957700b1s);
                    }
                }
                MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LIZIZ.LL;
                if (multiCoHostSearchContract$AbsView != null) {
                    multiCoHostSearchContract$AbsView.aS(false, new LinkedHashSet());
                }
                if (LiveCoHostSearchLeagueAutoRefreshSetting.INSTANCE.isEnable()) {
                    this.LIZIZ.LLJJJ.LJFF(false);
                }
            }
        }, 3);
    }

    @Override // X.AbstractC960710b6j
    public final void LJIJJ(C955590ayT c955590ayT) {
        Long lValueOf;
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        String strValueOf2 = String.valueOf(c955590ayT.LJ.getOwnerUserId());
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        C955400ayA.LJLJL(strValueOf, strValueOf2, String.valueOf(lValueOf2));
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        ((C0J1N) coHostApi.reserve(id, c955590ayT.LJ.getId(), c955590ayT.LJ.getOwnerUserId(), 1).LJIILIIL(new C0UO0()).LIZJ(LJII())).LIZ(new AfS109S0300000_15(room, c955590ayT, this, 5), new AfS151S0200000_15(this, c955590ayT, 18));
    }

    @Override // X.AbstractC960710b6j
    public final void LJIJJLI(String str) {
        if (str != null) {
            List<String> listLIZIZ = InterfaceC960800b6s.LLLLJI.LIZIZ();
            ArrayList arrayList = new ArrayList();
            if (listLIZIZ != null) {
                Iterator<String> it2 = listLIZIZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
            if (arrayList.contains(str)) {
                arrayList.remove(str);
            }
            if (arrayList.size() == 20) {
                ListProtector.remove(arrayList, 19);
            }
            ListProtector.add(arrayList, 0, str);
            InterfaceC960800b6s.LLLLJI.LJFF(arrayList);
        }
    }

    @Override // X.AbstractC960710b6j
    public final void LJJ(boolean z) {
        if (z) {
            if (this.LLILZLL.contains(this.LLJJJJ) && this.LLILZLL.contains(this.LLJJJIL)) {
                return;
            }
            this.LLILZLL.add(0, this.LLJJJJ);
            this.LLILZLL.add(0, this.LLJJJIL);
            return;
        }
        this.LLILZLL.remove(this.LLJJJIL);
        this.LLILZLL.remove(this.LLJJJJ);
    }

    public final void LJJI(boolean z) {
        String strLJIJI;
        int i = 1;
        if (this.LLILZLL.contains(this.LLJJJJ) && this.LLILZLL.contains(this.LLJJJIL)) {
            this.LLILZLL = new C410901il(this.LLILZLL.subList(0, 2));
        } else {
            this.LLILZLL = new C410901il();
        }
        LiveFriendRankingSetting liveFriendRankingSetting = LiveFriendRankingSetting.INSTANCE;
        if (liveFriendRankingSetting.getEnableFriendRanking()) {
            strLJIJI = C497740JfY.LJIJI(2131855584);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131846588);
        }
        if (!liveFriendRankingSetting.getEnableFriendRanking() || this.LLJJIJIL == EnumC959280b4Q.FRIENDS_RANKING) {
            i = 0;
        }
        this.LLILZLL.add(new C961160b7S(strLJIJI, i, C497740JfY.LJIJI(2131855546)));
        if (z) {
            this.LLILZLL.add(new Object() { // from class: X.0b6n
            });
        }
    }

    public final void LJJIIZI(C915780ZwG c915780ZwG) {
        Object next;
        Iterator<Object> it2 = this.LLILZIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if ((next instanceof C955590ayT) && ((C955590ayT) next).LJ.getOwnerUserId() == c915780ZwG.LIZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LL;
        if (multiCoHostSearchContract$AbsView != null) {
            multiCoHostSearchContract$AbsView.dS(this.LLILZIL.indexOf(next), false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0b6p] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0b6e] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0b6q] */
    public C960610b6Z(MultiCoHostSearchFragment multiCoHostSearchFragment, DataChannel dataChannel) {
        super(multiCoHostSearchFragment);
        this.LLIZ = dataChannel;
        this.LLJ = C2097608Jq.LJ();
        this.LLJI = C2097608Jq.LJ();
        this.LLJILLL = "";
        this.LLJJ = C00CG.NONE;
        this.LLJJI = C13BV.INSTANCE;
        this.LLJJIII = new LinkedHashMap();
        this.LLJJIJI = C2097608Jq.LJ();
        this.LLJJIJIIJIL = new LinkedHashMap();
        this.LLJJIJIL = EnumC959280b4Q.FRIENDS_RANKING;
        C960510b6P c960510b6P = new C960510b6P();
        this.LLJJJ = c960510b6P;
        this.LLJJJIL = new Object() { // from class: X.0b6q
        };
        this.LLJJJJ = new Object() { // from class: X.0b6p
        };
        this.LLJJJJJIL = new InterfaceC960540b6S() { // from class: X.0b6e
            @Override // X.InterfaceC960540b6S
            public final C410901il LIZ() {
                return this.LIZ.LLILZLL;
            }

            @Override // X.InterfaceC960540b6S
            public final C410901il LIZIZ() {
                C410901il c410901il = new C410901il();
                for (Object obj : this.LIZ.LLILZLL) {
                    if ((obj instanceof C955670ayb) && ((C955670ayb) obj).LIZJ) {
                        c410901il.add(obj);
                    }
                }
                return c410901il;
            }

            @Override // X.InterfaceC960540b6S
            public final boolean LIZLLL() {
                MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LIZ.LL;
                if (multiCoHostSearchContract$AbsView != null) {
                    return multiCoHostSearchContract$AbsView.UR();
                }
                return false;
            }

            @Override // X.InterfaceC960540b6S
            public final void LIZJ(C410901il c410901il, boolean z, Set<Integer> set, MGetUserLinkmicStatusResponse.ResponseData responseData) {
                this.LIZ.LLILZLL = c410901il;
                if (z) {
                    C955400ayA c955400ayA = C955400ayA.LIZ;
                    C955400ayA.LJLI(c410901il);
                }
                if (LiveFriendRankingSetting.INSTANCE.getEnableFriendRanking()) {
                    C960610b6Z c960610b6Z = this.LIZ;
                    if (c960610b6Z.LLJJIJIL == EnumC959280b4Q.FRIENDS_RANKING) {
                        MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) c960610b6Z.LL;
                        if (multiCoHostSearchContract$AbsView != null) {
                            multiCoHostSearchContract$AbsView.WR(true, set);
                            return;
                        }
                        return;
                    }
                }
                MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView2 = (MultiCoHostSearchContract$AbsView) this.LIZ.LL;
                if (multiCoHostSearchContract$AbsView2 == null) {
                    return;
                }
                multiCoHostSearchContract$AbsView2.aS(true, set);
            }
        };
        dataChannel.CQ2(MultiCoHostCountDownEvent.class, this, new AwS594S0100000_15(this, 90));
        dataChannel.CQ2(MultiCoHostNudgeCountDownEvent.class, this, new AwS594S0100000_15(this, 91));
        dataChannel.CQ2(MultiCoHostNudgeCountUpEvent.class, this, new AwS594S0100000_15(this, 92));
        dataChannel.CQ2(CoHostIsClickInvite.class, this, new AwS594S0100000_15(this, 93));
        c960510b6P.LJIIIIZZ = EnumC960560b6U.SEARCH_PANEL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC950820aqm
    public final void LIZ(Throwable th, Room room) {
        Iterator it2 = C13LP.LLIIL(this.LLILZLL).iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            T t = ((IndexedValue) c717610SCx.next()).LIZIZ;
            if ((t instanceof C955590ayT) && ((C955590ayT) t).LJ.getId() == room.getId()) {
                break;
            }
        }
        MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LL;
        if (multiCoHostSearchContract$AbsView != null) {
            multiCoHostSearchContract$AbsView.bS(th);
        }
    }

    @Override // X.AbstractC960710b6j
    public final void LJIIJJI(C955590ayT c955590ayT, Room room) {
        C950790aqj.LIZ.LIZ(c955590ayT, room);
    }

    public final RivalExtraInfo LJJIFFI(long j, long j2) {
        if (LiveCoHostInviteSameLevelInSearchSetting.INSTANCE.isEnable() && this.LLJI.get(Long.valueOf(j2)) != null) {
            return this.LLJI.get(Long.valueOf(j2));
        }
        return this.LLJ.get(Long.valueOf(j));
    }

    public final void LJJIIJ(int i, int i2) {
        long id;
        long ownerUserId;
        long ownerUserId2;
        boolean zLJIIJ;
        boolean zLJIIJ2;
        boolean z;
        boolean z2;
        boolean z3;
        long id2;
        long ownerUserId3;
        boolean z4;
        if (i == 1) {
            if (!this.LLILLL.isEmpty()) {
                List<SearchRivalsResponse.Cell> list = this.LLILLL;
                C410901il c410901il = this.LLILZIL;
                for (SearchRivalsResponse.Cell cell : list) {
                    Room room = cell.room;
                    if (room != null) {
                        id2 = room.getId();
                    } else {
                        id2 = 0;
                    }
                    Room room2 = cell.room;
                    if (room2 != null) {
                        ownerUserId3 = room2.getOwnerUserId();
                    } else {
                        ownerUserId3 = 0;
                    }
                    RivalExtraInfo rivalExtraInfoLJJIFFI = LJJIFFI(id2, ownerUserId3);
                    if (rivalExtraInfoLJJIFFI != null) {
                        RivalsListsData.TopHostInfo topHostInfo = RivalsListsData.TopHostInfo.LIZ;
                        Room room3 = cell.room;
                        if (room3 == null) {
                            room3 = new Room();
                        }
                        C955980az6 c955980az6 = new C955980az6(room3, topHostInfo, rivalExtraInfoLJJIFFI, EnumC961080b7K.IDLE, LJJIIZ(rivalExtraInfoLJJIFFI));
                        if (cell.cellType == 3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c955980az6.LJJ = z4;
                        String str = this.LLIZLLLIL;
                        if (str == null) {
                            str = "";
                        }
                        c955980az6.LJJI = str;
                        c955980az6.LJJIFFI = i2;
                        c410901il.add(c955980az6);
                    }
                }
                return;
            }
            return;
        }
        if (!this.LLILLJJLI.isEmpty()) {
            List<SearchRivalsResponse.Cell> list2 = this.LLILLJJLI;
            C410901il c410901il2 = this.LLILZIL;
            for (SearchRivalsResponse.Cell cell2 : list2) {
                Room room4 = cell2.room;
                if (room4 != null) {
                    id = room4.getId();
                } else {
                    id = 0;
                }
                Room room5 = cell2.room;
                if (room5 != null) {
                    ownerUserId = room5.getOwnerUserId();
                } else {
                    ownerUserId = 0;
                }
                RivalExtraInfo rivalExtraInfoLJJIFFI2 = LJJIFFI(id, ownerUserId);
                if (rivalExtraInfoLJJIFFI2 != null) {
                    RivalsListsData.TopHostInfo topHostInfo2 = RivalsListsData.TopHostInfo.LIZ;
                    Room room6 = cell2.room;
                    if (room6 == null) {
                        room6 = new Room();
                    }
                    C955980az6 c955980az62 = new C955980az6(room6, topHostInfo2, rivalExtraInfoLJJIFFI2, EnumC961080b7K.IDLE, LJJIIZ(rivalExtraInfoLJJIFFI2));
                    Room room7 = cell2.room;
                    if (room7 != null) {
                        ownerUserId2 = room7.getOwnerUserId();
                    } else {
                        ownerUserId2 = 0;
                    }
                    C954460awe c954460aweLLLI = C915980Zwa.LJII().LLLI(ownerUserId2, true);
                    if (c954460aweLLLI != null) {
                        zLJIIJ = c954460aweLLLI.LJIIJ();
                    } else {
                        zLJIIJ = false;
                    }
                    C954460awe c954460aweLLLI2 = C915980Zwa.LJII().LLLI(ownerUserId2, false);
                    if (c954460aweLLLI2 != null) {
                        zLJIIJ2 = c954460aweLLLI2.LJIIJ();
                    } else {
                        zLJIIJ2 = false;
                    }
                    if (!zLJIIJ && !zLJIIJ2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c955980az62.LJIIJJI = z;
                    int i3 = cell2.cellType;
                    if (i3 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c955980az62.LJIL = z2;
                    if (i3 == 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c955980az62.LJJ = z3;
                    String str2 = this.LLIZLLLIL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c955980az62.LJJI = str2;
                    c955980az62.LJJIFFI = i2;
                    c410901il2.add(this.LLJILJILJ, c955980az62);
                    this.LLJILJILJ++;
                }
            }
        }
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZJ(int i, int i2, long j) {
        Object next;
        boolean z;
        RivalExtraInfo rivalExtraInfo;
        Iterator<Object> it2 = this.LLILZIL.iterator();
        while (true) {
            next = null;
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            if ((next instanceof C955590ayT) && ((C955590ayT) next).LJ.getId() == j) {
                break;
            }
        }
        int iIndexOf = this.LLILZIL.indexOf(next);
        if (next != null && (next instanceof C955590ayT)) {
            z = false;
        } else {
            Iterator<Object> it3 = this.LLILZLL.iterator();
            while (it3.hasNext()) {
                next = it3.next();
                if ((next instanceof C955590ayT) && ((C955590ayT) next).LJ.getId() == j) {
                    if (next == null || !(next instanceof C955590ayT)) {
                        return;
                    } else {
                        iIndexOf = this.LLILZLL.indexOf(next);
                    }
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("onInviteFailed update item pos = ");
        sb.append(iIndexOf);
        sb.append(" nickname = ");
        C955590ayT c955590ayT = (C955590ayT) next;
        sb.append(C0KVU.LJ(c955590ayT.LJ.getOwner()));
        C20441214yg.LJIIIZ("MultiCoHostSearchPres", sb.toString());
        if (i >= 0 && (rivalExtraInfo = c955590ayT.LJIIJ) != null) {
            C955940az2.LIZJ(rivalExtraInfo, i, i2, c955590ayT);
        }
        MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LL;
        if (multiCoHostSearchContract$AbsView != null) {
            multiCoHostSearchContract$AbsView.dS(iIndexOf, z);
        }
    }

    @Override // X.InterfaceC950820aqm
    public final void LJFF(long j, Room room, RivalExtraInfo rivalExtraInfo) {
        for (Object obj : this.LLILZIL) {
            if ((obj instanceof C955590ayT) && ((C955590ayT) obj).LJ.getOwnerUserId() == j) {
                if (obj != null && (obj instanceof C955590ayT)) {
                    int iIndexOf = this.LLILZIL.indexOf(obj);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateInviteItemPlayTypeByUid update item pos = ");
                    sbLIZ.append(iIndexOf);
                    sbLIZ.append(" nickname = ");
                    C955590ayT c955590ayT = (C955590ayT) obj;
                    sbLIZ.append(C0KVU.LJ(c955590ayT.LJ.getOwner()));
                    C20441214yg.LJIIIZ("MultiCoHostSearchPres", C2188811AlT.LIZIZ(sbLIZ));
                    c955590ayT.LJ = room;
                    c955590ayT.LJIIJ = rivalExtraInfo;
                    c955590ayT.LJIJ = c955590ayT.LJ();
                    MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LL;
                    if (multiCoHostSearchContract$AbsView != null) {
                        multiCoHostSearchContract$AbsView.dS(iIndexOf, false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC960710b6j
    public final void LJIIZILJ(int i, String str, AwS381S0200000_15 awS381S0200000_15) {
        long id;
        String str2 = this.LLIZLLLIL;
        if (this.LLJILJIL != 0 && LJJIIJZLJL()) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            C480460Ism.LIZ().getClass();
            CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
            if (str2 == null) {
                str2 = "";
            }
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            ((C0J1N) coHostApi.rivalsListForSearchMore(str2, id, str, 20, this.LLJILJIL).LJIILIIL(new C0UO0()).LIZJ(LJII())).LIZ(new AfS82S0101000_15(i, this, 0), new AfS172S0100000_3((Object) awS381S0200000_15, 4));
        }
    }

    @Override // X.AbstractC960710b6j
    public final void LJIJI(int i, long j, String str) {
        long id;
        if (i == 2 && Intrinsics.LJFF(this.LLJILLL, str) && this.LLJJ == C00CG.SEARCHING) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("This is a high-frequency request, discard， keyWord = ");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("MultiCoHostSearchPres", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLJILLL = str;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (i == 2) {
            this.LLJJ = C00CG.SEARCHING;
        }
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        ((C0J1N) coHostApi.rivalsListForSearch(id, str, 20).LJIILIIL(new C0UO0()).LIZJ(LJII())).LIZ(new AfS1S1101100_15(i, j, this, str, 0), new AfS1S1101100_15(i, j, this, str, 1));
    }

    @Override // X.InterfaceC950820aqm
    public final void LIZIZ(int i, int i2, int i3, long j) {
        Object next;
        boolean z;
        Iterator<Object> it2 = this.LLILZIL.iterator();
        while (true) {
            next = null;
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            if ((next instanceof C955590ayT) && ((C955590ayT) next).LJ.getId() == j) {
                break;
            }
        }
        int iIndexOf = this.LLILZIL.indexOf(next);
        if (next != null && (next instanceof C955590ayT)) {
            z = false;
        } else {
            Iterator<Object> it3 = this.LLILZLL.iterator();
            while (it3.hasNext()) {
                next = it3.next();
                if ((next instanceof C955590ayT) && ((C955590ayT) next).LJ.getId() == j) {
                    if (next == null || !(next instanceof C955590ayT)) {
                        return;
                    } else {
                        iIndexOf = this.LLILZLL.indexOf(next);
                    }
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("updateInviteItemPlayTypeByRoomId update item pos = ");
        sb.append(iIndexOf);
        sb.append(" nickname = ");
        C955590ayT c955590ayT = (C955590ayT) next;
        sb.append(C0KVU.LJ(c955590ayT.LJ.getOwner()));
        sb.append(" new playType = ");
        sb.append(i);
        C20441214yg.LJIIIZ("MultiCoHostSearchPres", sb.toString());
        RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
        if (rivalExtraInfo != null) {
            rivalExtraInfo.showPlayType = i;
            C955940az2.LIZJ(rivalExtraInfo, i2, i3, c955590ayT);
        }
        MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) this.LL;
        if (multiCoHostSearchContract$AbsView != null) {
            multiCoHostSearchContract$AbsView.dS(iIndexOf, z);
        }
    }

    @Override // X.AbstractC960710b6j
    public final void LJIIIZ(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j) {
        Room room = c955590ayT.LJ;
        C238400w2 c238400w2 = new C238400w2();
        long jLJIIL = C950220apo.LJIIL(room);
        c238400w2.element = jLJIIL;
        long jLongValue = 0;
        if (jLJIIL == 0) {
            C480460Ism.LIZ().getClass();
            CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
            Long lLJIIJ = C930540aK4.LJIIJ();
            if (lLJIIJ != null) {
                jLongValue = lLJIIJ.longValue();
            }
            ((C0J1N) coHostApi.getUserLinkmicStatusMultiCoHost(jLongValue, String.valueOf(room.getOwnerUserId()), String.valueOf(room.getId()), "", "", "", "", false).LJIILIIL(new C0UO0()).LIZJ(LJII())).LIZ(new AfS0S0510100_15(c238400w2, room, c955590ayT, c955540ayO, z, this, j, 2), new AfS0S0410100_15(c955590ayT, c955540ayO, this, z, c238400w2, j, 2));
            return;
        }
        C950790aqj.LIZJ(c955590ayT, c955540ayO, z, "", this, j, jLJIIL);
    }

    @Override // X.AbstractC960710b6j
    public final void LJIILL(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j) {
        C950790aqj.LJ(c955590ayT, c955540ayO, z, C915980Zwa.LJI().LIZ().LJL(), this, j);
    }
}
