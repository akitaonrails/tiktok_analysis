package X;

import Y.AComparatorS34S0000000_15;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2UpdateGuestListInCohostOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveRoomPerfOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0awZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954410awZ {
    public Room LIZ;
    public boolean LIZIZ;
    public List<VirtualWaitingUser> LIZLLL;
    public DataChannel LJIIL;
    public final ConcurrentHashMap<Long, C954460awe> LIZJ = new ConcurrentHashMap<>();
    public final List<LinkUser> LJ = new ArrayList();
    public final ConcurrentHashMap<Long, C954460awe> LJFF = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, C954460awe> LJI = new ConcurrentHashMap<>();
    public final ConcurrentHashSet<Long> LJII = new ConcurrentHashSet<>();
    public final ConcurrentHashSet<InterfaceC955350ay5> LJIIIIZZ = new ConcurrentHashSet<>();
    public final ConcurrentHashMap<String, Long> LJIIIZ = new ConcurrentHashMap<>();
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 993));
    public final ConcurrentHashMap<Long, C914570ZuJ> LJIIJJI = new ConcurrentHashMap<>();

    public final C946220ajM LIZIZ() {
        return (C946220ajM) this.LJIIJ.getValue();
    }

    public final List<C954460awe> LJ() {
        Room room = this.LIZ;
        if (room == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        long ownerUserId = room.getOwnerUserId();
        C954460awe c954460awe = this.LIZJ.get(Long.valueOf(ownerUserId));
        if (c954460awe != null) {
            arrayList.add(c954460awe);
        }
        Collection<C954460awe> collectionValues = this.LIZJ.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            C954460awe c954460awe2 = (C954460awe) obj;
            if (!c954460awe2.LJIIIZ(Long.valueOf(ownerUserId)) && c954460awe2.LJJIIZ == EnumC950200apm.LINKED) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(C13LP.LJLLLL(new AComparatorS34S0000000_15(13), arrayList2));
        Collection<C954460awe> collectionValues2 = this.LIZJ.values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : collectionValues2) {
            C954460awe c954460awe3 = (C954460awe) obj2;
            if (!c954460awe3.LJIIIZ(Long.valueOf(ownerUserId)) && c954460awe3.LJJIIZ != EnumC950200apm.LINKED) {
                arrayList3.add(obj2);
            }
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final void LJIIJ() {
        this.LIZJ.clear();
        this.LJFF.clear();
        ((ArrayList) this.LJ).clear();
        this.LJII.clear();
        C946220ajM c946220ajMLIZIZ = LIZIZ();
        c946220ajMLIZIZ.getClass();
        C946240ajO.LIZ().LJIILLIIL("clearGuests", null);
        if (!CohostWithGuestPhase2UpdateGuestListInCohostOpt.INSTANCE.notifyWhenCohostEnd()) {
            c946220ajMLIZIZ.LIZJ().clear();
        } else if (!c946220ajMLIZIZ.LIZJ().isEmpty()) {
            List<C936770aU7> listLIZ = c946220ajMLIZIZ.LIZ();
            c946220ajMLIZIZ.LIZJ().clear();
            c946220ajMLIZIZ.LIZLLL(listLIZ);
        }
        ((LinkedHashMap) C914820Zui.LIZ).clear();
        ((LinkedHashMap) C914820Zui.LIZIZ).clear();
        c946220ajMLIZIZ.LIZIZ().clear();
        Iterator<InterfaceC955350ay5> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ();
        }
    }

    public final C954460awe LIZ(long j) {
        C754570Tip c754570TipLJIIZILJ;
        User owner;
        C954460awe c954460aweLIZLLL = LIZLLL(j);
        if (c954460aweLIZLLL == null) {
            c954460aweLIZLLL = new C954460awe(j);
            if (C950220apo.LJFF() == j) {
                Room room = this.LIZ;
                if (room != null && (owner = room.getOwner()) != null) {
                    c754570TipLJIIZILJ = C950220apo.LJIIZILJ(owner);
                } else {
                    c754570TipLJIIZILJ = null;
                }
                c954460aweLIZLLL.LJIJJ = c754570TipLJIIZILJ;
            }
        }
        this.LIZJ.put(Long.valueOf(j), c954460aweLIZLLL);
        return c954460aweLIZLLL;
    }

    public final List<C954460awe> LIZJ(boolean z) {
        C954460awe c954460awe;
        Room room = this.LIZ;
        if (room == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        long ownerUserId = room.getOwnerUserId();
        if (z && (c954460awe = this.LIZJ.get(Long.valueOf(ownerUserId))) != null) {
            arrayList.add(c954460awe);
        }
        Collection<C954460awe> collectionValues = this.LIZJ.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            C954460awe c954460awe2 = (C954460awe) obj;
            if (!z || !c954460awe2.LJIIIZ(Long.valueOf(ownerUserId))) {
                if (c954460awe2.LJJIIZ == EnumC950200apm.LINKED) {
                    arrayList2.add(obj);
                }
            }
        }
        arrayList.addAll(C13LP.LJLLLL(new AComparatorS34S0000000_15(12), arrayList2));
        return arrayList;
    }

    public final C954460awe LIZLLL(long j) {
        return this.LIZJ.get(Long.valueOf(j));
    }

    public final C954460awe LJFF(String str) {
        Object next;
        Iterator it2 = C2097808Js.LJIL(this.LIZJ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (TextUtils.equals(((C954460awe) ((Pair) next).getSecond()).LJIIJJI, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Pair pair = (Pair) next;
        if (pair == null) {
            return null;
        }
        return (C954460awe) pair.getSecond();
    }

    public final void LJII(long j) {
        Long lValueOf;
        int size = this.LJI.size();
        C954460awe c954460aweRemove = this.LJI.remove(Long.valueOf(j));
        int size2 = this.LJI.size();
        if (c954460aweRemove != null) {
            c954460aweRemove.LJJIJ = "sdk";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeLocalApplyingUser, uid = ");
        if (c954460aweRemove != null) {
            lValueOf = Long.valueOf(c954460aweRemove.LJ);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", beforeSize=");
        sbLIZ.append(size);
        sbLIZ.append(", afterSize=");
        sbLIZ.append(size2);
        C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIIIZZ(long j) {
        Long lValueOf;
        int size = this.LJFF.size();
        C954460awe c954460aweRemove = this.LJFF.remove(Long.valueOf(j));
        int size2 = this.LJFF.size();
        if (c954460aweRemove != null) {
            c954460aweRemove.LJJIJ = "sdk";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeLocalInvitingUser, uid = ");
        if (c954460aweRemove != null) {
            lValueOf = Long.valueOf(c954460aweRemove.LJ);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", beforeSize=");
        sbLIZ.append(size);
        sbLIZ.append(", afterSize=");
        sbLIZ.append(size2);
        C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIIZ(long j) {
        C954460awe c954460awe;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeUser, uid = ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ));
        C954460awe c954460awe2 = this.LIZJ.get(Long.valueOf(j));
        if (c954460awe2 != null) {
            c954460awe2.LJJIIZ = EnumC950200apm.IDLE;
        }
        if (this.LIZJ.remove(Long.valueOf(j)) == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("userMap does not contain uid = ");
            sbLIZ2.append(j);
            C20441214yg.LJ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C954460awe c954460awe3 = this.LIZJ.get(Long.valueOf(C950220apo.LJFF()));
        if (c954460awe3 != null && c954460awe3.LJII == j && (c954460awe = this.LIZJ.get(Long.valueOf(C950220apo.LJFF()))) != null) {
            c954460awe.LJII = 0L;
            c954460awe.LJ();
        }
        Iterator<InterfaceC955350ay5> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(j);
        }
    }

    public final void LJIIJJI(InterfaceC954900axM interfaceC954900axM, final List list, final String str) {
        if (LiveRoomPerfOptSetting.enableLowMemStringGCOpt()) {
            C20441214yg.LIZ.LIZJ(EnumC20440914yd.I, "MultiHostCrossUserManager", new InterfaceC1456340o08() { // from class: X.0axH
                @Override // X.InterfaceC1456340o08
                public final Object get() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateAnchorForAudienceEnterRoom");
                    sbLIZ.append(", source=");
                    sbLIZ.append(str);
                    sbLIZ.append(", linkedList = ");
                    sbLIZ.append(list);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            });
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateAnchorForAudienceEnterRoom");
            sbLIZ.append(", source=");
            sbLIZ.append(str);
            sbLIZ.append(", linkedList = ");
            sbLIZ.append(list);
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LIZ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateAnchorForAudienceEnterRoom");
            sbLIZ2.append(", source=");
            sbLIZ2.append(str);
            sbLIZ2.append(", return room=");
            sbLIZ2.append(this.LIZ);
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (LiveRoomPerfOptSetting.enableLowMemStringGCOpt()) {
            C20441214yg.LIZ.LIZJ(EnumC20440914yd.I, "MultiHostCrossUserManager", new InterfaceC1456340o08() { // from class: X.0ax4
                @Override // X.InterfaceC1456340o08
                public final Object get() {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("updateAnchorForAudienceEnterRoom");
                    sbLIZ3.append(", source=");
                    sbLIZ3.append(str);
                    sbLIZ3.append(",  before coHostUserMap size = ");
                    sbLIZ3.append(this.LIZJ.size());
                    sbLIZ3.append(", linkedUsers size  = ");
                    sbLIZ3.append(list.size());
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
            });
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateAnchorForAudienceEnterRoom");
            sbLIZ3.append(", source=");
            sbLIZ3.append(str);
            sbLIZ3.append(", before coHostUserMap size = ");
            sbLIZ3.append(this.LIZJ.size());
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("updateAnchorForAudienceEnterRoom");
            sbLIZ4.append(", source=");
            sbLIZ4.append(str);
            sbLIZ4.append(", linkedUsers size = ");
            sbLIZ4.append(list.size());
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ4));
        }
        ArrayList<Pair> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Pair(it2.next(), EnumC950200apm.LINKED));
        }
        arrayList.addAll(arrayList2);
        HashMap map = new HashMap();
        map.putAll(this.LIZJ);
        for (Pair pair : arrayList) {
            LinkUser linkUser = (LinkUser) pair.getFirst();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("updateAnchorForAudienceEnterRoom");
            sbLIZ5.append(", source=");
            sbLIZ5.append(str);
            sbLIZ5.append(", foreach state = ");
            sbLIZ5.append(pair.getSecond());
            sbLIZ5.append(" user = ");
            sbLIZ5.append(linkUser);
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ5));
            LJIIL(interfaceC954900axM, (LinkUser) pair.getFirst(), (EnumC950200apm) pair.getSecond(), null, false, false, new HashSet<>(), "updateAnchorForAudienceEnterRoom", true, null, "");
            C19719512Dh.LIZJ(map).remove(linkUser.userId);
        }
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("updateAnchorForAudienceEnterRoom");
            sbLIZ6.append(", source=");
            sbLIZ6.append(str);
            sbLIZ6.append(", remove uid = ");
            sbLIZ6.append(((Number) entry.getKey()).longValue());
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ6));
            LJIIIZ(((Number) entry.getKey()).longValue());
        }
        C20441214yg.LJIIIZ("MultiHostCrossUserManager", "updateAnchorForAudienceEnterRoom, source=" + str + ", after coHostUserMap size = " + this.LIZJ.size());
        for (Map.Entry<Long, C954460awe> entry2 : this.LIZJ.entrySet()) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("updateAnchorForAudienceEnterRoom");
            sbLIZ7.append(", source=");
            sbLIZ7.append(str);
            sbLIZ7.append(", after user = ");
            sbLIZ7.append(entry2.getValue());
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ7));
        }
    }

    public final void LJI(BusinessContent businessContent, InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        String str3;
        C954460awe c954460aweLJFF;
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserListChangeForAudience");
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(", from=");
        sbLIZ.append(str2);
        sbLIZ.append(", message = ");
        sbLIZ.append(businessContent);
        C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserListChangeForAudience");
            sbLIZ2.append(", return room=");
            sbLIZ2.append(this.LIZ);
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        List<LinkUser> listLJI = C948780anU.LJI(interfaceC954180awC);
        List<LinkUser> listLIZJ = C948780anU.LIZJ(interfaceC954180awC);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onUserListChangeForAudience");
        sbLIZ3.append(", source=");
        sbLIZ3.append(str);
        sbLIZ3.append(", liveUserList.size=");
        sbLIZ3.append(listLJI.size());
        sbLIZ3.append(", liveUserListFromIM.size=");
        sbLIZ3.append(listLIZJ.size());
        C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ3));
        if (Intrinsics.LJFF(str2, "im") && !(!listLJI.isEmpty())) {
            listLJI = listLIZJ;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onUserListChangeForAudience");
        sbLIZ4.append(", source=");
        sbLIZ4.append(str);
        sbLIZ4.append(", sync_before coHostUserMap size = ");
        sbLIZ4.append(this.LIZJ.size());
        C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("onUserListChangeForAudience");
        sbLIZ5.append(", source=");
        sbLIZ5.append(str);
        sbLIZ5.append(", linkedUsers size = ");
        sbLIZ5.append(listLJI.size());
        C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ5));
        if (listLJI.isEmpty()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("onUserListChangeForAudience");
            sbLIZ6.append(", source=");
            sbLIZ6.append(str);
            sbLIZ6.append(", return by linkedUsers isEmpty");
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ6));
            return;
        }
        if (Intrinsics.LJFF(str2, "im") && this.LIZJ.isEmpty()) {
            C955430ayD.LJIIIIZZ("cohost_list_change");
        }
        ArrayList<Pair> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
        Iterator<LinkUser> it2 = listLJI.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Pair(it2.next(), EnumC950200apm.LINKED));
        }
        arrayList.addAll(arrayList2);
        HashMap map = new HashMap();
        map.putAll(this.LIZJ);
        for (Pair pair : arrayList) {
            LinkUser linkUserCopy = (LinkUser) pair.getFirst();
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("onUserListChangeForAudience");
            sbLIZ7.append(", source=");
            sbLIZ7.append(str);
            sbLIZ7.append(", foreach state = ");
            sbLIZ7.append(pair.getSecond());
            sbLIZ7.append(", user = ");
            sbLIZ7.append(linkUserCopy);
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ7));
            if (linkUserCopy.userId == null && (str3 = linkUserCopy.linkMicId) != null && (c954460aweLJFF = LJFF(str3)) != null && (lValueOf = Long.valueOf(c954460aweLJFF.LJ)) != null) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("onUserListChangeForAudience");
                sbLIZ8.append(", source=");
                sbLIZ8.append(str);
                sbLIZ8.append(", foreach state = ");
                sbLIZ8.append(pair.getSecond());
                sbLIZ8.append(", find cacheUserId=");
                sbLIZ8.append(lValueOf);
                C20441214yg.LJ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ8));
                linkUserCopy = linkUserCopy.copy(linkUserCopy.roomId, lValueOf, linkUserCopy.channelId, linkUserCopy.linkMicId, linkUserCopy.position, linkUserCopy.extra, linkUserCopy.audioMutedByChannel, linkUserCopy.audioSwitchOn, linkUserCopy.videoSwitchOn, linkUserCopy.audioOccupied, linkUserCopy.appVersion, linkUserCopy.channelOwnerJoinTime, linkUserCopy.channelOwnerLinkedTime, linkUserCopy.ownerUid, linkUserCopy.ownerRoomId, linkUserCopy.ownerChannelId, linkUserCopy.linkedTimeNano, linkUserCopy.avatarID, linkUserCopy.operatorUid, linkUserCopy.linkUserType, linkUserCopy.onLineUserState, linkUserCopy.groupChannelId, linkUserCopy.groupLinkMicId);
            }
            LJIIL(interfaceC954180awC, linkUserCopy, (EnumC950200apm) pair.getSecond(), businessContent, false, false, new HashSet<>(), "onUserListChangeForAudience", false, null, str2);
            C19719512Dh.LIZJ(map).remove(linkUserCopy.userId);
        }
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("onUserListChangeForAudience");
            sbLIZ9.append(", source=");
            sbLIZ9.append(str);
            sbLIZ9.append(", remove uid = ");
            sbLIZ9.append(((Number) entry.getKey()).longValue());
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ9));
            LJIIIZ(((Number) entry.getKey()).longValue());
        }
        C20441214yg.LJIIIZ("MultiHostCrossUserManager", "onUserListChangeForAudience, source=" + str + ", sync_after coHostUserMap size = " + this.LIZJ.size());
        for (Map.Entry<Long, C954460awe> entry2 : this.LIZJ.entrySet()) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("onUserListChangeForAudience");
            sbLIZ10.append(",source=");
            sbLIZ10.append(str);
            sbLIZ10.append(", sync_after user = ");
            sbLIZ10.append(entry2.getValue());
            C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ10));
        }
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            for (C954460awe c954460awe : this.LIZJ.values()) {
                if (c954460awe.LJJIIZ == EnumC950200apm.LINKED) {
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("cacheLinkMicIdToUserForAudience, linkmicId=");
                    sbLIZ11.append(c954460awe.LJIIJJI);
                    sbLIZ11.append(", uid=");
                    sbLIZ11.append(c954460awe.LJ);
                    C20441214yg.LJIIIZ("MultiHostCrossUserManager", C2188811AlT.LIZIZ(sbLIZ11));
                    this.LJIIIZ.put(c954460awe.LJIIJJI, Long.valueOf(c954460awe.LJ));
                }
            }
        }
        LIZIZ().LJ(interfaceC954180awC, businessContent, str);
        Iterator<InterfaceC955350ay5> it3 = this.LJIIIIZZ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(businessContent, interfaceC954180awC, str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.InterfaceC954180awC r22, com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r23, X.EnumC950200apm r24, com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r25, boolean r26, boolean r27, java.util.HashSet<java.lang.Long> r28, java.lang.String r29, boolean r30, webcast.im.P2PGroupChangeContent r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 1369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C954410awZ.LJIIL(X.0awC, com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser, X.0apm, com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent, boolean, boolean, java.util.HashSet, java.lang.String, boolean, webcast.im.P2PGroupChangeContent, java.lang.String):void");
    }
}
