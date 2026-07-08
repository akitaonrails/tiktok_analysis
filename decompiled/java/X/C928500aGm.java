package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import webcast.data.MGHostGrowthActivityEntrance;

/* JADX INFO: renamed from: X.0aGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928500aGm extends AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> {
    public ListByTypeResponse.MultiGuestBonus LJIILLIIL;
    public MGHostGrowthActivityEntrance LJIIZILJ;

    @Override // X.AbstractC928510aGn, X.InterfaceC921200a50
    public final Boolean LJ() {
        MGHostGrowthActivityEntrance mGHostGrowthActivityEntrance = this.LJIIZILJ;
        boolean z = false;
        if (mGHostGrowthActivityEntrance != null && mGHostGrowthActivityEntrance.status > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.AbstractC928510aGn, X.InterfaceC921200a50
    public final String LJIIIIZZ() {
        MGHostGrowthActivityEntrance mGHostGrowthActivityEntrance = this.LJIIZILJ;
        Integer numValueOf = mGHostGrowthActivityEntrance != null ? Integer.valueOf(mGHostGrowthActivityEntrance.targetUserTagEnum) : null;
        return (numValueOf == null || numValueOf.intValue() == 0) ? "" : numValueOf.intValue() == 1 ? "potential" : numValueOf.intValue() == 2 ? "gold" : numValueOf.intValue() == 3 ? "silver" : numValueOf.intValue() == 4 ? "bronze" : "";
    }

    @Override // X.AbstractC928510aGn, X.InterfaceC921200a50
    public final String LJIIIZ() {
        ListByTypeResponse.MultiGuestBonus multiGuestBonus = this.LJIILLIIL;
        if (multiGuestBonus != null) {
            return multiGuestBonus.multiGuestBonusValueString;
        }
        return null;
    }

    @Override // X.AbstractC928510aGn, X.InterfaceC921200a50
    public final String LJIIJ() {
        ListByTypeResponse.MultiGuestBonus multiGuestBonus = this.LJIILLIIL;
        if (multiGuestBonus != null) {
            return multiGuestBonus.multiGuestBonusNoteString;
        }
        return null;
    }

    @Override // X.AbstractC928510aGn, X.InterfaceC921200a50
    public final Long LJIJ() {
        ListByTypeResponse.MultiGuestBonus multiGuestBonus = this.LJIILLIIL;
        if (multiGuestBonus != null) {
            return Long.valueOf(multiGuestBonus.multiGuestBonusValue);
        }
        return null;
    }

    @Override // X.AbstractC928510aGn, X.InterfaceC921200a50
    public final List<LinkPlayerInfo> LJIJI() {
        return LJJIJL(this, (List) this.LJIIIIZZ.getValue());
    }

    @Override // X.AbstractC928510aGn, X.InterfaceC921200a50
    public final List<LinkPlayerInfo> LJIIJJI() {
        return LJJIJL(this, LJJIFFI());
    }

    @Override // X.AbstractC928510aGn, X.InterfaceC921200a50
    public final List<LinkPlayerInfo> LJIILLIIL() {
        return LJJIJL(this, LJIL());
    }

    @Override // X.InterfaceC921200a50
    public final Object LJFF(String str) {
        LinkPlayerInfo next;
        LinkPlayerInfo linkPlayerInfo;
        synchronized (this) {
            try {
                Iterator<LinkPlayerInfo> it2 = LJIJJLI().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (TextUtils.equals(str, next.mInteractIdStr)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                linkPlayerInfo = next;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkPlayerInfo;
    }

    @Override // X.InterfaceC921200a50
    public final Object LJII(long j) {
        LinkPlayerInfo next;
        LinkPlayerInfo linkPlayerInfo;
        synchronized (this) {
            try {
                Iterator<LinkPlayerInfo> it2 = LJIJJLI().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.mUser.getId() == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                linkPlayerInfo = next;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkPlayerInfo;
    }

    @Override // X.InterfaceC921200a50
    public final int LJIIL(long j) {
        int i;
        LinkPlayerInfo next;
        synchronized (this) {
            try {
                Iterator<LinkPlayerInfo> it2 = LJIJJLI().iterator();
                while (true) {
                    i = 0;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.mUser.getId() == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LinkPlayerInfo linkPlayerInfo = next;
                if (linkPlayerInfo != null) {
                    i = linkPlayerInfo.LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // X.InterfaceC921200a50
    public final Object LJIILIIL(long j) {
        LinkPlayerInfo next;
        LinkPlayerInfo linkPlayerInfo;
        synchronized (this) {
            try {
                Iterator<LinkPlayerInfo> it2 = LJJIII().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.mUser.getId() == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                linkPlayerInfo = next;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkPlayerInfo;
    }

    @Override // X.InterfaceC921200a50
    public final Object LJIIZILJ(String str) {
        LinkPlayerInfo next;
        LinkPlayerInfo linkPlayerInfo;
        synchronized (this) {
            try {
                Iterator<LinkPlayerInfo> it2 = LJJIII().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (TextUtils.equals(str, next.mInteractIdStr)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                linkPlayerInfo = next;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkPlayerInfo;
    }

    @Override // X.AbstractC928510aGn
    public final void LJJIJIIJI(MultiLiveGuestInfoList multiLiveGuestInfoList) {
        long jLongValue;
        MultiLiveGuestInfoList multiLiveGuestInfoList2 = multiLiveGuestInfoList;
        Long lLJIIJ = C930540aK4.LJIIJ();
        if (lLJIIJ != null) {
            jLongValue = lLJIIJ.longValue();
        } else {
            jLongValue = 0;
        }
        ArrayList<LinkPlayerInfo> arrayList = multiLiveGuestInfoList2.onLineUsers;
        if (arrayList != null) {
            for (LinkPlayerInfo linkPlayerInfo : arrayList) {
                linkPlayerInfo.LIZ = 2;
                linkPlayerInfo.LJII = jLongValue;
                LJJIII().add(linkPlayerInfo);
            }
        }
        ArrayList<LinkPlayerInfo> arrayList2 = multiLiveGuestInfoList2.waitingUsers;
        if (arrayList2 != null) {
            for (LinkPlayerInfo linkPlayerInfo2 : arrayList2) {
                linkPlayerInfo2.LIZ = 1;
                linkPlayerInfo2.LJII = jLongValue;
                LJIL().add(linkPlayerInfo2);
            }
        }
        List<ListByTypeResponse.GiftScoreAppliedUser> list = multiLiveGuestInfoList2.giftScoreAppliedUsers;
        if (list != null) {
            Iterator<ListByTypeResponse.GiftScoreAppliedUser> it2 = list.iterator();
            while (it2.hasNext()) {
                ((List) this.LJII.getValue()).add(it2.next());
            }
        }
        ArrayList<LinkPlayerInfo> arrayList3 = multiLiveGuestInfoList2.waitingUsers;
        if ((arrayList3 == null || arrayList3.isEmpty()) && LJIL().isEmpty() && (!((List) this.LJII.getValue()).isEmpty())) {
            Iterator it3 = ((List) this.LJII.getValue()).iterator();
            while (it3.hasNext()) {
                LinkPlayerInfo linkPlayerInfo3 = ((ListByTypeResponse.GiftScoreAppliedUser) it3.next()).listUser;
                if (linkPlayerInfo3 != null) {
                    linkPlayerInfo3.LJII = jLongValue;
                    linkPlayerInfo3.LIZ = 1;
                    LJIL().add(linkPlayerInfo3);
                }
            }
        }
        ArrayList<LinkPlayerInfo> arrayList4 = multiLiveGuestInfoList2.viewerUsers;
        if (arrayList4 != null) {
            for (LinkPlayerInfo linkPlayerInfo4 : arrayList4) {
                linkPlayerInfo4.LJII = jLongValue;
                linkPlayerInfo4.LIZ = 0;
                ((List) this.LJIIIIZZ.getValue()).add(linkPlayerInfo4);
            }
        }
        ArrayList<LinkPlayerInfo> arrayList5 = multiLiveGuestInfoList2.connectingUsers;
        if (arrayList5 != null) {
            for (LinkPlayerInfo linkPlayerInfo5 : arrayList5) {
                linkPlayerInfo5.LIZ = 4;
                linkPlayerInfo5.LJII = jLongValue;
                LJJIFFI().add(linkPlayerInfo5);
            }
        }
        List<ListByTypeResponse.ReservedUser> list2 = multiLiveGuestInfoList2.reservedUsers;
        if (list2 != null) {
            Iterator<ListByTypeResponse.ReservedUser> it4 = list2.iterator();
            while (it4.hasNext()) {
                ((List) this.LIZLLL.getValue()).add(it4.next());
            }
        }
        ArrayList<LinkPlayerInfo> arrayList6 = multiLiveGuestInfoList2.notViewerFriends;
        if (arrayList6 != null) {
            for (LinkPlayerInfo linkPlayerInfo6 : arrayList6) {
                linkPlayerInfo6.LJII = jLongValue;
                linkPlayerInfo6.LIZ = 0;
                LJJIIJZLJL().add(linkPlayerInfo6);
            }
        }
        ListByTypeResponse.MultiGuestBonus multiGuestBonus = multiLiveGuestInfoList2.multiGuestBonus;
        if (multiGuestBonus != null && multiGuestBonus.isSuccess) {
            this.LJIILLIIL = multiGuestBonus;
        }
        MGHostGrowthActivityEntrance mGHostGrowthActivityEntrance = multiLiveGuestInfoList2.mgHostGrowthActivityEntrance;
        if (mGHostGrowthActivityEntrance != null) {
            this.LJIIZILJ = mGHostGrowthActivityEntrance;
        }
        List<ListByTypeResponse.ChatGroupInfo> list3 = multiLiveGuestInfoList2.chatGroups;
        if (list3 != null) {
            Iterator<ListByTypeResponse.ChatGroupInfo> it5 = list3.iterator();
            while (it5.hasNext()) {
                ((List) this.LJIIL.getValue()).add(it5.next());
            }
        }
        ArrayList<ListByTypeResponse.LiveEventRegisterUser> arrayList7 = new ArrayList();
        List<ListByTypeResponse.LiveEventRegisterUser> list4 = multiLiveGuestInfoList2.liveEventNotJoinUsers;
        if (list4 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (ListByTypeResponse.LiveEventRegisterUser liveEventRegisterUser : list4) {
                Long lValueOf = Long.valueOf(liveEventRegisterUser.sourceType);
                Object arrayList8 = linkedHashMap.get(lValueOf);
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                    linkedHashMap.put(lValueOf, arrayList8);
                }
                ((List) arrayList8).add(liveEventRegisterUser);
            }
            Collection collection = (Collection) linkedHashMap.get(1L);
            if (collection != null) {
                arrayList7.addAll(collection);
            }
            Collection collection2 = (Collection) linkedHashMap.get(2L);
            if (collection2 != null) {
                arrayList7.addAll(collection2);
            }
        }
        for (ListByTypeResponse.LiveEventRegisterUser liveEventRegisterUser2 : arrayList7) {
            LinkPlayerInfo linkPlayerInfo7 = liveEventRegisterUser2.listUser;
            if (linkPlayerInfo7 != null) {
                linkPlayerInfo7.LIZ = 0;
                linkPlayerInfo7.LJ = true;
                linkPlayerInfo7.LJFF = (int) liveEventRegisterUser2.sourceType;
                linkPlayerInfo7.LJI = liveEventRegisterUser2.registerTime;
                linkPlayerInfo7.LJII = jLongValue;
                ((List) this.LJIIJJI.getValue()).add(linkPlayerInfo7);
            }
        }
        List<LinkPlayerInfo> list5 = multiLiveGuestInfoList2.suggestedUsers;
        if (list5 != null) {
            for (LinkPlayerInfo linkPlayerInfo8 : list5) {
                linkPlayerInfo8.LJII = jLongValue;
                ((List) this.LJIILIIL.getValue()).add(linkPlayerInfo8);
            }
        }
        List<LinkPlayerInfo> list6 = multiLiveGuestInfoList2.batchSuggestUsers;
        if (list6 != null) {
            Iterator<LinkPlayerInfo> it6 = list6.iterator();
            while (it6.hasNext()) {
                ((List) this.LJIILJJIL.getValue()).add(it6.next());
            }
        }
    }

    public static List LJJIJL(Object obj, List list) {
        ArrayList arrayList;
        boolean z;
        synchronized (obj) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    User user = ((LinkPlayerInfo) obj2).mUser;
                    if (user == null || user.getId() != UserService.getInstance().user().getCurrentUserId()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(arrayList2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }
}
