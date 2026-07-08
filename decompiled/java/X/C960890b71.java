package X;

import android.util.Pair;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.quickcohost.PreferenceTagsChangedChannel;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.competition.event.CompetitionStateEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.LinkerModeChangeChannelV2;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostOpenEOYListEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.event.QuickCoHostCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.event.QuickCoHostStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.reservation.MultiCoHostNudgeCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.reservation.MultiCoHostNudgeCountUpEvent;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.AcknowledgementsParam;
import com.bytedance.android.livesdk.chatroom.interact.model.BattleOptPair;
import com.bytedance.android.livesdk.chatroom.interact.model.CollectUnreadParams;
import com.bytedance.android.livesdk.chatroom.interact.model.DynamicListConfig;
import com.bytedance.android.livesdk.chatroom.interact.model.GuidePopupBanner;
import com.bytedance.android.livesdk.chatroom.interact.model.RemoveDeduplicationSceneRooms;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.dataChannel.CoHostIsClickInvite;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostFriendOnlineAppendExperimentSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPreloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostViewerSuggestionsExperimentSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostInviteListDynamicListSectionSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionExtraConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0b71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960890b71 extends AbstractC960500b6O {
    public final AwS629S0100000_15 LLJZ;
    public final long LLJZIJLIL;
    public long LLL;
    public long LLLF;
    public long LLLFF;
    public final Map<String, String> LLLFFI;
    public final Set<Long> LLLFZ;
    public List<BattleOptPair> LLLI;
    public List<? extends Room> LLLII;
    public List<? extends Room> LLLIIII;
    public List<? extends Room> LLLIIIIL;
    public List<? extends Room> LLLIIIL;
    public List<? extends Room> LLLIIL;
    public long LLLIILIL;
    public long LLLIL;
    public long LLLILZ;
    public final List<Pair<Long, C955540ayO>> LLLILZJ;
    public C956150azN LLLILZLLLI;
    public int LLLIZZ;
    public int LLLJ;
    public boolean LLLJIL;
    public Map<Long, ? extends RivalsListsData.TopHostInfo> LLLJL;
    public final C11NJ LLLL;
    public GuidePopupBanner LLLLII;
    public RivalsListsData.OffliveInvitationBanner LLLLIIIILLL;
    public boolean LLLLIIL;
    public int LLLLIILL;
    public boolean LLLLIILLL;
    public int LLLLIL;
    public boolean LLLLILI;
    public int LLLLJ;
    public RivalsListsData.BannerText LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;
    public boolean LLLLLILLIL;
    public String LLLLLJIL;
    public boolean LLLLLJLJLL;
    public final List<EnumC952640ati> LLLLLL;
    public boolean LLLLLLIL;
    public final List<EnumC952640ati> LLLLLLJ;
    public boolean LLLLLLL;
    public boolean LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public final Map<EnumC952640ati, EnumC961090b7L> LLLLLLLZIL;
    public boolean LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public final Map<Long, String> LLLLLZIL;
    public final List<C956250azX> LLLLLZL;
    public EnumC961060b7I LLLLZ;
    public long LLLLZI;
    public long LLLLZIL;
    public Set<Long> LLLLZLL;
    public final Set<Long> LLLLZLLIL;
    public Set<Long> LLLLZLLLI;
    public Set<Long> LLLZ;
    public final Set<Long> LLLZI;
    public C961640b8E LLLZIIL;
    public final HashSet<Integer> LLLZIL;
    public DynamicListConfig LLLZL;
    public C961660b8G LLLZLL;
    public DynamicListConfig.SectionConfig LLLZLZ;
    public boolean LLLZZ;
    public final C960590b6X LLLZZIL;

    @Override // X.AbstractC960500b6O, com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void LJIIIIZZ() throws JSONException {
        HashSet<Integer> hashSet = this.LLLZIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hashSet, 10));
        Iterator<Integer> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().intValue() == 40 ? 0 : null);
        }
        List listLJJJJLI = C13LP.LJJJJLI(arrayList);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStatusDisplay, statusShowAckedPendingList = ");
        sbLIZ.append(this.LLLZIL);
        sbLIZ.append(", requestAckTypes=");
        sbLIZ.append(listLJJJJLI);
        C20441214yg.LIZIZ("MultiCoHostUpgradeListPresenter", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        AcknowledgementsParam acknowledgementsParam = new AcknowledgementsParam();
        acknowledgementsParam.ackType.addAll(listLJJJJLI);
        coHostApi.cohostAcknowledgement(acknowledgementsParam).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0Zwk
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostUpgradeListPresenter@7661.ackStatusSeen$2");
                C958790b3d c958790b3d = InterfaceC954910axN.LIZ;
                AFwS250S0000000_15 aFwS250S0000000_15 = AFwS250S0000000_15.get$arr$(30);
                c958790b3d.getClass();
                C958790b3d.LIZLLL((BaseResponse) obj, aFwS250S0000000_15);
                C1C7U.LIZIZ("MultiCoHostUpgradeListPresenter@7661.ackStatusSeen$2");
            }
        }, new C09JN() { // from class: X.0Zwj
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostUpgradeListPresenter@7661.ackStatusSeen$3");
                C958790b3d c958790b3d = InterfaceC954910axN.LIZ;
                AFwS250S0000000_15 aFwS250S0000000_15 = AFwS250S0000000_15.get$arr$(31);
                c958790b3d.getClass();
                C958790b3d.LIZJ((Throwable) obj, aFwS250S0000000_15);
                C1C7U.LIZIZ("MultiCoHostUpgradeListPresenter@7661.ackStatusSeen$3");
            }
        });
        C20441214yg.LJIIIZ("CoHostInviteListRepo", "reset");
        C960910b73.LJI.clear();
        EnumC952640ati.Companion.getClass();
        for (EnumC952640ati enumC952640ati : (ArrayList) C952630ath.LIZ(true)) {
            C960910b73.LIZIZ(enumC952640ati, false);
            C960910b73.LIZJ(enumC952640ati, "reset");
        }
        ((LinkedHashMap) C960910b73.LIZIZ).clear();
        long j = this.LLLLZI;
        boolean z = this.LLJLLIL;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject.put("cohost_panel_request_cost", j);
        jSONObject3.put("cohost_invitation_request_or_not", z);
        C1CC2.LIZJ("ttlive_client_anchor_cohost_preload_data", jSONObject3, jSONObject, jSONObject2);
        if (this.LLLLLJLJLL) {
            C20337914i1<Integer> c20337914i1 = InterfaceC960800b6s.LLLIZZ;
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            InterfaceC960800b6s.LLLJ.LJFF(Long.valueOf(System.currentTimeMillis()));
        }
        super.LJIIIIZZ();
        ((LinkedHashMap) C955400ayA.LJII).clear();
        this.LLLL.LJ();
        C955580ayS.LJIIZILJ = 0L;
        this.LLJJJJJIL.zQ2(this);
        DataChannelGlobal.LLILZ.zQ2(this);
        C924810aAp.LJ().LJI.remove(this.LLLZZIL);
        C915980Zwa.LJII().LJJLIIIJL(C954930axP.class, this.LLJZ);
        C915980Zwa.LJI().LIZ().LJIILJJIL().clear();
        this.LLLZIL.clear();
        LJJIJIIJI();
    }

    @Override // X.AbstractC960950b77
    public final int LJIIJ() {
        List<? extends Room> list = this.LLLII;
        ArrayList arrayList = new ArrayList();
        for (Room room : list) {
            RivalExtraInfo rivalExtraInfo = this.LLJJLIIIJLLLLLLLZ.get(Long.valueOf(room.getId()));
            if (rivalExtraInfo != null && !C949990apR.LIZIZ(rivalExtraInfo)) {
                arrayList.add(room);
            }
        }
        return arrayList.size();
    }

    @Override // X.AbstractC960950b77
    public final void LJJIIZI() {
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView;
        ListIterator<Object> listIterator = this.LLJILJILJ.listIterator();
        int i = 0;
        int i2 = -1;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            Object next = listIterator.next();
            if (((next instanceof C961160b7S) && ((C961160b7S) next).LJFF == 3) || ((next instanceof C955590ayT) && Intrinsics.LJFF(((C955590ayT) next).LJI, C955540ayO.LJJJJL))) {
                listIterator.remove();
                if (i2 == -1) {
                    i2 = iNextIndex;
                }
                i++;
            }
        }
        if (i2 == -1 || (multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LL) == null) {
            return;
        }
        multiCoHostInviteListContract$AbsView.kS(i2, i);
    }

    @Override // X.AbstractC960950b77
    public final void LJJIJIIJI() {
        for (Object obj : this.LLJILJILJ) {
            if (obj instanceof C955590ayT) {
                C955590ayT c955590ayT = (C955590ayT) obj;
                if (!c955590ayT.LIZ) {
                    int i = c955590ayT.LJI.LIZ;
                    if (i == C955540ayO.LIZJ.LIZ) {
                        this.LLLLZLL.add(Long.valueOf(c955590ayT.LJ.getId()));
                    } else if (i == C955540ayO.LJJJJL.LIZ) {
                        this.LLLLZLLIL.add(Long.valueOf(c955590ayT.LJ.getId()));
                    } else if (i == C955540ayO.LJJIII.LIZ) {
                        this.LLLZ.add(Long.valueOf(c955590ayT.LJ.getId()));
                    } else if (i == C955540ayO.LIZLLL.LIZ) {
                        this.LLLLZLLLI.add(Long.valueOf(c955590ayT.LJ.getId()));
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(C15442062u.LJII(this.LLLLZLL, this.LLLZI));
        ArrayList arrayList2 = new ArrayList(C15442062u.LJII(this.LLLZ, this.LLLZI));
        ArrayList arrayList3 = new ArrayList(C15442062u.LJII(this.LLLLZLLLI, this.LLLZI));
        RemoveDeduplicationSceneRooms removeDeduplicationSceneRooms = new RemoveDeduplicationSceneRooms();
        removeDeduplicationSceneRooms.scene = 1;
        removeDeduplicationSceneRooms.roomIds = arrayList;
        RemoveDeduplicationSceneRooms removeDeduplicationSceneRooms2 = new RemoveDeduplicationSceneRooms();
        removeDeduplicationSceneRooms2.scene = 3;
        removeDeduplicationSceneRooms2.roomIds = arrayList2;
        RemoveDeduplicationSceneRooms removeDeduplicationSceneRooms3 = new RemoveDeduplicationSceneRooms();
        removeDeduplicationSceneRooms3.scene = 2;
        removeDeduplicationSceneRooms3.roomIds = arrayList3;
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        CollectUnreadParams collectUnreadParams = new CollectUnreadParams();
        if (!removeDeduplicationSceneRooms.roomIds.isEmpty()) {
            collectUnreadParams.removeDeduplicationSceneRooms.add(removeDeduplicationSceneRooms);
        }
        if (!removeDeduplicationSceneRooms2.roomIds.isEmpty()) {
            collectUnreadParams.removeDeduplicationSceneRooms.add(removeDeduplicationSceneRooms2);
        }
        if (!removeDeduplicationSceneRooms3.roomIds.isEmpty()) {
            collectUnreadParams.removeDeduplicationSceneRooms.add(removeDeduplicationSceneRooms3);
        }
        if (collectUnreadParams.removeDeduplicationSceneRooms.isEmpty()) {
            return;
        }
        this.LLLZI.addAll(arrayList);
        this.LLLZI.addAll(arrayList2);
        this.LLLZI.addAll(arrayList3);
        coHostApi.collectUnreadRequest(collectUnreadParams).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0T74
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("MultiCoHostUpgradeListPresenter@7661.sendCollectUnreadRequest$1");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resp = ");
                sbLIZ.append(obj2);
                C20441214yg.LJIIIZ("CohostCollectUnread", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("MultiCoHostUpgradeListPresenter@7661.sendCollectUnreadRequest$1");
            }
        }, new C09JN() { // from class: X.0T75
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("MultiCoHostUpgradeListPresenter@7661.sendCollectUnreadRequest$2");
                C20441214yg.LJ("CohostCollectUnread", String.valueOf(((Throwable) obj2).getMessage()));
                C1C7U.LIZIZ("MultiCoHostUpgradeListPresenter@7661.sendCollectUnreadRequest$2");
            }
        });
        this.LLLLZLL = new LinkedHashSet();
        this.LLLLZLLLI = new LinkedHashSet();
        this.LLLZ = new LinkedHashSet();
    }

    @Override // X.AbstractC960950b77
    public final Integer LJJIJLIJ() {
        int i = 0;
        for (Object obj : this.LLJILJILJ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (obj instanceof C961160b7S) {
                C961160b7S c961160b7S = (C961160b7S) obj;
                if (c961160b7S.LJFF == 0) {
                    c961160b7S.LJ = C497740JfY.LJIJJ(2131851858, Integer.valueOf(this.LLJJIII), Integer.valueOf(this.LLLII.size()));
                    return Integer.valueOf(i);
                }
            }
            i = i2;
        }
        return null;
    }

    public final boolean LJJJJLI() {
        return (C0IKQ.LIZ(this.LLLIIIIL) && C0IKQ.LIZ(this.LLLII) && C0IKQ.LIZ(this.LLLIIIL) && C0IKQ.LIZ(this.LLLIIII)) ? false : true;
    }

    @Override // X.AbstractC960500b6O, X.AbstractC960950b77
    public final void LJJIIZ() {
        super.LJJIIZ();
        LJJJI();
        if (CoHostInviteListPreloadSetting.INSTANCE.isEnable()) {
            LJJIJIIJI();
        }
    }

    @Override // X.AbstractC960500b6O
    public final boolean LJJIZ() {
        return LJJJJLI() || this.LLLLL;
    }

    @Override // X.AbstractC960500b6O
    public final void LJJJI() {
        C961160b7S c961160b7S;
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView;
        C955590ayT c955590ayT;
        Room room;
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView2;
        RivalSectionConfig rivalSectionConfig;
        RivalSectionExtraConfig rivalSectionExtraConfig;
        if (C960910b73.LJII()) {
            MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView3 = (MultiCoHostInviteListContract$AbsView) this.LL;
            if (multiCoHostInviteListContract$AbsView3 == null || !(multiCoHostInviteListContract$AbsView3.LLJ || multiCoHostInviteListContract$AbsView3.PR())) {
                List listLLIIII = C13LP.LLIIII(C960910b73.LJI.values());
                if (listLLIIII.isEmpty()) {
                    return;
                }
                List<? extends Room> list = this.LLLII;
                HashSet hashSet = new HashSet();
                Iterator<? extends Room> it2 = list.iterator();
                while (it2.hasNext()) {
                    hashSet.add(Long.valueOf(it2.next().getId()));
                }
                List<? extends Room> list2 = this.LLLII;
                HashSet hashSet2 = new HashSet();
                Iterator<? extends Room> it3 = list2.iterator();
                while (it3.hasNext()) {
                    hashSet2.add(Long.valueOf(it3.next().getOwnerUserId()));
                }
                ArrayList<C961050b7H> arrayList = new ArrayList();
                for (Object obj : listLLIIII) {
                    C961050b7H c961050b7H = (C961050b7H) obj;
                    if (!hashSet.contains(Long.valueOf(c961050b7H.LIZIZ.getId())) && !hashSet2.contains(Long.valueOf(c961050b7H.LIZ))) {
                        arrayList.add(obj);
                    }
                }
                C960910b73.LJI.clear();
                if (arrayList.isEmpty()) {
                    return;
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    this.LLLFZ.add(Long.valueOf(((C961050b7H) it4.next()).LIZIZ.getId()));
                }
                int size = arrayList.size();
                C955400ayA c955400ayA = C955400ayA.LIZ;
                if ((CoHostFriendOnlineAppendExperimentSetting.INSTANCE.isEnable() || ((rivalSectionConfig = CoHostInviteListPreloadSetting.INSTANCE.getRivalSectionConfig(EnumC952640ati.FRIENDS.getValue())) != null && (rivalSectionExtraConfig = rivalSectionConfig.extra) != null && rivalSectionExtraConfig.enableFriendOnlineAppend)) && size > 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("append_array_count", String.valueOf(size));
                    C955400ayA.LIZ.LIZJ(linkedHashMap);
                    C955400ayA.LLIILII("livesdk_cohost_friend_online_append_append", linkedHashMap);
                }
                List<? extends Room> list3 = this.LLLII;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(((C961050b7H) it5.next()).LIZIZ);
                }
                this.LLLII = C13LP.LJLIL(arrayList2, list3);
                for (C961050b7H c961050b7H2 : arrayList) {
                    RivalExtraInfo rivalExtraInfo = c961050b7H2.LIZJ;
                    if (rivalExtraInfo != null) {
                        this.LLJJLIIIJLLLLLLLZ.put(Long.valueOf(c961050b7H2.LIZIZ.getId()), rivalExtraInfo);
                    }
                    this.LLLLLZIL.put(Long.valueOf(c961050b7H2.LIZIZ.getId()), c961050b7H2.LIZLLL);
                }
                this.LLJJIII = LJIIJ();
                Pair pairLJJIL = AbstractC960500b6O.LJJIL(this.LLLII);
                this.LLLLIIL = ((Boolean) pairLJJIL.first).booleanValue();
                this.LLLLIILL = ((Number) pairLJJIL.second).intValue();
                this.LLJILJILJ = LJJJIL(this.LLLZL, this.LLLZLL);
                MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView4 = (MultiCoHostInviteListContract$AbsView) this.LL;
                if (multiCoHostInviteListContract$AbsView4 != null) {
                    multiCoHostInviteListContract$AbsView4.oS();
                }
                long id = ((C961050b7H) C13LP.LJJJJZI(arrayList)).LIZIZ.getId();
                Iterator<Object> it6 = this.LLJILJILJ.iterator();
                int i = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next = it6.next();
                    if (!(next instanceof C955590ayT) || (c955590ayT = (C955590ayT) next) == null || (room = c955590ayT.LJ) == null || room.getId() != id) {
                        i++;
                    } else if (i > 0 && (multiCoHostInviteListContract$AbsView2 = (MultiCoHostInviteListContract$AbsView) this.LL) != null) {
                        multiCoHostInviteListContract$AbsView2.cS(i, arrayList.size());
                    }
                }
                int i2 = 0;
                for (Object obj2 : this.LLJILJILJ) {
                    if ((obj2 instanceof C961160b7S) && (c961160b7S = (C961160b7S) obj2) != null && c961160b7S.LJFF == 0) {
                        if (i2 <= 0 || (multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LL) == null) {
                            return;
                        }
                        multiCoHostInviteListContract$AbsView.rS(i2);
                        return;
                    }
                    i2++;
                }
            }
        }
    }

    @Override // X.AbstractC960950b77
    public final List<Room> LJIILL() {
        return this.LLLII;
    }

    @Override // X.AbstractC960950b77
    public final Map<String, String> LJIIZILJ() {
        return this.LLLFFI;
    }

    @Override // X.AbstractC960950b77
    public final Map<Long, RivalExtraInfo> LJIJI() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC960950b77
    public final boolean LJIILIIL(C956250azX c956250azX) {
        return ((ArrayList) this.LLLLLZL).contains(c956250azX);
    }

    @Override // X.AbstractC960950b77
    public final void LJIJJLI(C954460awe c954460awe) {
        long j;
        long j2;
        final String str;
        InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
        long id = 0;
        if (c954460awe != null) {
            j = c954460awe.LJ;
        } else {
            j = 0;
        }
        interfaceC955420ayCLIZ.LJJZZI(j);
        if (c954460awe != null) {
            j2 = c954460awe.LJ;
        } else {
            j2 = 0;
        }
        C920570a3z c920570a3z = new C920570a3z("leave_with_user_click_disconnect", j2, 10080, 56);
        final long innerChannelId = C915980Zwa.LJII().getInnerChannelId();
        final long channelId = C915980Zwa.LJII().getChannelId();
        IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        User userLJIILL = C930540aK4.LJIILL();
        if (userLJIILL != null) {
            id = userLJIILL.getId();
        }
        C954460awe c954460aweLLILL = iMultiHostServiceLJII.LLILL(id);
        if (c954460aweLLILL == null || (str = c954460aweLLILL.LJIIJJI) == null) {
            str = "";
        }
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LL;
        if (multiCoHostInviteListContract$AbsView != null) {
            multiCoHostInviteListContract$AbsView.iS();
        }
        C915980Zwa.LJII().LLLJL(c920570a3z, new InterfaceC950010apT<C920630a45>() { // from class: X.0arT
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
            
                if (java.lang.System.currentTimeMillis() < X.InterfaceC960800b6s.LLLILZ.LIZIZ().longValue()) goto L28;
             */
            @Override // X.InterfaceC950010apT
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C920640a46 r15) {
                /*
                    Method dump skipped, instruction units count: 352
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C951250arT.LIZ(X.0a46):void");
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                if (th != null) {
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                    C1304660k3U.LIZ.LIZIZ(411, "leave multi_cohost link mic failed", th, null);
                }
            }
        });
    }

    @Override // X.AbstractC960950b77
    public final void LJJ(C956250azX c956250azX) {
        ((ArrayList) this.LLLLLZL).add(c956250azX);
    }

    @Override // X.AbstractC960950b77
    public final void LJJI(int i) {
        if (i >= 0 && i < this.LLJILJILJ.size()) {
            this.LLJILJILJ.remove(i);
            if (this.LLLLIIL) {
                this.LLILZ--;
            }
            if (this.LLLLILI) {
                this.LLIZ--;
            }
        }
    }

    @Override // X.AbstractC960950b77
    public final void LJJIFFI(int i) {
        if (i >= 0 && i < this.LLJILJILJ.size()) {
            this.LLJILJILJ.remove(i);
            this.LLJILJIL--;
            if (this.LLLLIIL) {
                this.LLILZ--;
            }
            if (this.LLLLILI) {
                this.LLIZ--;
            }
        }
    }

    @Override // X.AbstractC960950b77
    public final void LJJII(int i) {
        if (i >= 0 && i < this.LLJILJILJ.size()) {
            this.LLJILJILJ.remove(i);
        }
    }

    @Override // X.AbstractC960500b6O, X.AbstractC960950b77
    public final void LJJIJIIJIL(EnumC961080b7K enumC961080b7K) {
        Object obj;
        int i = C961070b7J.LIZIZ[enumC961080b7K.ordinal()];
        if (i != 1) {
            if (i == 2) {
                obj = "friends_section";
            } else if (i != 3) {
                if (i == 4) {
                    obj = "may_know_section";
                } else if (i == 5) {
                    obj = "user_suggestions_section";
                } else {
                    throw new C1954807lC();
                }
            } else {
                return;
            }
            if (this.LLJLIL.contains(obj)) {
                int size = this.LLJLIL.size();
                for (int iIndexOf = this.LLJLIL.indexOf(obj); iIndexOf < size; iIndexOf++) {
                    String str = (String) ListProtector.get(this.LLJLIL, iIndexOf);
                    int iHashCode = str.hashCode();
                    if (iHashCode != -569449695) {
                        if (iHashCode != 1119226427) {
                            if (iHashCode == 1725835723 && str.equals("may_know_section")) {
                                this.LLIZ++;
                            }
                        } else if (str.equals("friends_section")) {
                            this.LLILZ++;
                        }
                    } else if (str.equals("user_suggestions_section")) {
                        this.LLJIJIL++;
                    }
                }
            }
        }
    }

    @Override // X.AbstractC960950b77
    public final void LJJIJIL(EnumC961230b7Z enumC961230b7Z) {
        int i;
        int i2;
        if (enumC961230b7Z == EnumC961230b7Z.FRIEND_LIST_TYPE) {
            i = this.LLILZ - 1;
            i2 = this.LLILLL;
            this.LLILLJJLI = true;
        } else if (enumC961230b7Z == EnumC961230b7Z.VIEWER_SUGGESTION_LIST_TYPE) {
            i = this.LLJIJIL - 1;
            i2 = this.LLJI;
            this.LLJ = true;
        } else {
            i = this.LLIZ - 1;
            i2 = this.LLILZLL;
            this.LLILZIL = true;
        }
        if (i < 0) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i - 1;
            Object objRemove = this.LLJILJILJ.remove(i);
            if (objRemove instanceof C955590ayT) {
                this.LLLLZLL.remove(Long.valueOf(((C955590ayT) objRemove).LJ.getId()));
            }
            i3++;
            i = i4;
        }
        if (enumC961230b7Z == EnumC961230b7Z.FRIEND_LIST_TYPE) {
            this.LLILZ = i + 1;
            if (this.LLLLIILLL) {
                this.LLJIJIL -= i2;
            }
            if (this.LLLLILI) {
                this.LLIZ -= i2;
                return;
            }
            return;
        }
        if (enumC961230b7Z == EnumC961230b7Z.VIEWER_SUGGESTION_LIST_TYPE) {
            this.LLJIJIL = i + 1;
            if (!this.LLLLILI) {
                return;
            }
            this.LLIZ -= i2;
            return;
        }
        this.LLIZ = i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[PHI: r5
      0x006a: PHI (r5v3 com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo) = 
      (r5v2 com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo)
      (r5v9 com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo)
     binds: [B:22:0x0067, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC960950b77
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(X.EnumC961230b7Z r24) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960890b71.LJJIJL(X.0b7Z):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(X.EnumC952640ati r19) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960890b71.LJJJJ(X.0ati):void");
    }

    public final void LJJJJIZL(EnumC961200b7W enumC961200b7W) {
        String strLJIJJ;
        String strLJIJI;
        C961160b7S c961160b7S;
        if ((this.LLLIL != 0 && !this.LLLJIL && enumC961200b7W == EnumC961200b7W.LLILLJJLI) || (this.LLLILZ != 0 && enumC961200b7W == EnumC961200b7W.LLILZ)) {
            this.LLLJ = this.LLJILJILJ.size();
        }
        C410901il c410901il = this.LLJILJILJ;
        int iOrdinal = enumC961200b7W.ordinal();
        int i = 1;
        int i2 = 2;
        if (iOrdinal != 0) {
            int i3 = 4;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    int i4 = 3;
                    if (iOrdinal == 3) {
                        c961160b7S = new C961160b7S(C497740JfY.LJIJJ(2131856552, Integer.valueOf(this.LLLIIL.size())), i4, i3);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c961160b7S = new C961160b7S(C497740JfY.LJIJI(2131841230), i2, i3);
                }
            } else {
                c961160b7S = new C961160b7S(C497740JfY.LJIJI(2131841174), i, i3);
            }
        } else {
            if (C949990apR.LJFF()) {
                strLJIJJ = C497740JfY.LJIJJ(2131851858, Integer.valueOf(this.LLJJIII), Integer.valueOf(this.LLLII.size()));
            } else {
                strLJIJJ = C497740JfY.LJIJJ(2131841130, Integer.valueOf(this.LLLII.size()));
            }
            if (C949990apR.LJFF()) {
                strLJIJI = C497740JfY.LJIJI(2131851864);
            } else {
                strLJIJI = "";
            }
            c961160b7S = new C961160b7S(strLJIJJ, 0, strLJIJI);
        }
        c410901il.add(c961160b7S);
        if (this.LLLIILIL != 0 && this.LLLJIL && enumC961200b7W == EnumC961200b7W.LL) {
            this.LLLIZZ = this.LLJILJILJ.size();
        }
    }

    public final boolean LJJJJJL(EnumC952640ati enumC952640ati) {
        if (enumC952640ati == EnumC952640ati.DEFAULT) {
            return true;
        }
        List<EnumC952640ati> list = this.LLLLLL;
        ArrayList arrayList = new ArrayList();
        for (EnumC952640ati enumC952640ati2 : list) {
            if (enumC952640ati2 != EnumC952640ati.DEFAULT) {
                arrayList.add(enumC952640ati2);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        List<EnumC952640ati> list2 = this.LLLLLLJ;
        ArrayList arrayList2 = new ArrayList();
        for (EnumC952640ati enumC952640ati3 : list2) {
            if (enumC952640ati3 != EnumC952640ati.DEFAULT) {
                arrayList2.add(enumC952640ati3);
            }
        }
        if (Intrinsics.LJFF(setLLIIJI, C13LP.LLIIJI(arrayList2))) {
            return true;
        }
        return false;
    }

    public final void LJJJJZI(C915780ZwG c915780ZwG) {
        C410901il c410901il = this.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c410901il) {
            if ((obj instanceof C955590ayT) && ((C955590ayT) obj).LJ.getOwnerUserId() == c915780ZwG.LIZ) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : arrayList) {
            MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LL;
            if (multiCoHostInviteListContract$AbsView != null) {
                multiCoHostInviteListContract$AbsView.rS(this.LLJILJILJ.indexOf(obj2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025c  */
    @Override // X.AbstractC960950b77
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(final int r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960890b71.LJIILJJIL(int, boolean):void");
    }

    public final C410901il LJJJIL(DynamicListConfig dynamicListConfig, C961660b8G c961660b8G) {
        List<String> listAsList;
        DynamicListConfig.SectionConfig sectionConfig;
        Map<String, DynamicListConfig.SectionConfig> map;
        this.LLJILJILJ = new C410901il();
        LJJJJZ("title_section", null, c961660b8G);
        if (dynamicListConfig == null || (listAsList = dynamicListConfig.listSections) == null || listAsList.isEmpty()) {
            listAsList = Arrays.asList(LiveCoHostInviteListDynamicListSectionSettings.INSTANCE.getSectionList());
        }
        this.LLJLIL = listAsList;
        for (String str : listAsList) {
            if (!Intrinsics.LJFF(str, "user_suggestions_section") || (CoHostViewerSuggestionsExperimentSetting.INSTANCE.isEnable() && InterfaceC934710aQn.ob.LIZIZ().booleanValue())) {
                if (dynamicListConfig != null && (map = dynamicListConfig.sectionConfigs) != null) {
                    sectionConfig = map.get(str);
                } else {
                    sectionConfig = null;
                }
                LJJJJZ(str, sectionConfig, c961660b8G);
            }
        }
        return this.LLJILJILJ;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [X.0b6X] */
    public C960890b71(final MultiHostInviteListFragmentV2 multiHostInviteListFragmentV2, DataChannel dataChannel, long j) {
        boolean z;
        super(multiHostInviteListFragmentV2, dataChannel);
        AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(this, 7);
        this.LLJZ = awS629S0100000_15;
        this.LLLFFI = new LinkedHashMap();
        this.LLLFZ = new LinkedHashSet();
        this.LLJZIJLIL = j;
        C948450amx.LIZIZ.LIZJ(this);
        dataChannel.CQ2(MultiCoHostCountDownEvent.class, this, new AwS594S0100000_15(this, 73));
        dataChannel.CQ2(QuickCoHostCountDownEvent.class, this, new AwS594S0100000_15(this, 74));
        dataChannel.CQ2(QuickCoHostStateChannel.class, this, new AwS594S0100000_15(this, 75));
        dataChannel.CQ2(CoHostOpenEOYListEvent.class, this, new AwS594S0100000_15(this, 76));
        dataChannel.CQ2(MultiCoHostNudgeCountDownEvent.class, this, new AwS594S0100000_15(this, 78));
        dataChannel.CQ2(MultiCoHostNudgeCountUpEvent.class, this, new AwS594S0100000_15(this, 79));
        dataChannel.CQ2(LinkerModeChangeChannelV2.class, this, new AwS594S0100000_15(this, 80));
        dataChannel.CQ2(CoHostIsClickInvite.class, this, new AwS594S0100000_15(this, 81));
        AwS629S0100000_15 awS629S0100000_152 = new AwS629S0100000_15(this, 11);
        dataChannel.BQ2(multiHostInviteListFragmentV2, BattleStateChannel.class, new AwS594S0100000_15(awS629S0100000_152, (Function2<? super Boolean, ? super String, Unit>) 724));
        dataChannel.BQ2(multiHostInviteListFragmentV2, CompetitionStateEvent.class, new AwS594S0100000_15(awS629S0100000_152, (Function2<? super Boolean, ? super String, Unit>) 725));
        DataChannelGlobal.LLILZ.CQ2(PreferenceTagsChangedChannel.class, this, new AwS594S0100000_15(this, 72));
        String strLJJLIIIJ = C915980Zwa.LJI().LIZ().LJJLIIIJ();
        if (strLJJLIIIJ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LLJJJJ = strLJJLIIIJ;
            C915980Zwa.LJI().LIZ().LLJZIJLIL("");
        }
        C915980Zwa.LJII().LLLJIL(C954930axP.class, awS629S0100000_15);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLLI = c13bv;
        this.LLLII = c13bv;
        this.LLLIIII = c13bv;
        this.LLLIIIIL = c13bv;
        this.LLLIIIL = c13bv;
        this.LLLIIL = c13bv;
        this.LLLILZJ = new ArrayList();
        this.LLLIZZ = -1;
        this.LLLJL = C2097608Jq.LJ();
        this.LLLL = new C11NJ();
        this.LLLLLJIL = "";
        this.LLLLLL = new ArrayList();
        EnumC952640ati[] enumC952640atiArrValues = EnumC952640ati.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC952640ati enumC952640ati : enumC952640atiArrValues) {
            if (enumC952640ati != EnumC952640ati.LEAGUE_RECOMMEND) {
                arrayList.add(enumC952640ati);
            }
        }
        this.LLLLLLJ = arrayList;
        this.LLLLLLLZIL = new LinkedHashMap();
        this.LLLLLZIL = new LinkedHashMap();
        this.LLLLLZL = new ArrayList();
        this.LLLLZI = -1L;
        this.LLLLZIL = -1L;
        this.LLLLZLL = new LinkedHashSet();
        this.LLLLZLLIL = new LinkedHashSet();
        this.LLLLZLLLI = new LinkedHashSet();
        this.LLLZ = new LinkedHashSet();
        this.LLLZI = new LinkedHashSet();
        this.LLLZIIL = new C961640b8E();
        this.LLLZIL = new HashSet<>();
        this.LLLZZIL = new InterfaceC915740ZwC() { // from class: X.0b6X
            @Override // X.InterfaceC915740ZwC
            public final void LIZ(boolean z2) {
                if (!z2 && this.LIZ.LLJILJILJ.size() > 0) {
                    C924810aAp.LJ().LJI.remove(this);
                    multiHostInviteListFragmentV2.SR();
                    if (this.LIZ.LJJJJLI()) {
                        this.LIZ.LLJLL.LJFF(false);
                    }
                }
            }
        };
    }

    public static void LJJJJLL(EnumC952640ati enumC952640ati, EnumC961090b7L enumC961090b7L, String str) {
        new C955440ayE().LJJJJ(enumC952640ati, str, C961440b7u.LIZ(enumC961090b7L));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028d  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(X.EnumC961210b7X r27, X.C961660b8G r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960890b71.LJJJJJ(X.0b7X, X.0b8G, java.lang.String):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZ(java.lang.String r20, com.bytedance.android.livesdk.chatroom.interact.model.DynamicListConfig.SectionConfig r21, X.C961660b8G r22) {
        /*
            Method dump skipped, instruction units count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960890b71.LJJJJZ(java.lang.String, com.bytedance.android.livesdk.chatroom.interact.model.DynamicListConfig$SectionConfig, X.0b8G):void");
    }
}
