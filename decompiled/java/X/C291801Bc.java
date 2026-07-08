package X;

import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.01Bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C291801Bc {
    public static final C291801Bc LIZ = new C291801Bc();

    public static C292101Bf LIZIZ(GiftPage giftPage, boolean z) {
        Boolean boolValueOf;
        ArrayList<Double> arrayListI42;
        List<Map.Entry> listLJLLLL;
        boolean z2;
        List<Gift> list = giftPage.gifts;
        ArrayList<Double> arrayListI422 = null;
        if (list != null) {
            if (!list.isEmpty()) {
                Iterator<Gift> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().groupInTab != 0) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                boolValueOf = Boolean.valueOf(z2);
            } else {
                z2 = false;
                boolValueOf = Boolean.valueOf(z2);
            }
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
            if (iFansClubService != null) {
                arrayListI42 = iFansClubService.i42();
            } else {
                arrayListI42 = null;
            }
            CopyOnWriteArraySet<Double> copyOnWriteArraySetLB2 = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).lB2();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<Gift> list2 = giftPage.gifts;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            for (Gift gift : list2) {
                if (gift.groupInTab > 0) {
                    AbstractC1126600fQI<Gift> abstractC1126600fQILIZ = C292201Bg.LIZ(gift);
                    LIZ(abstractC1126600fQILIZ, gift, arrayListI42, copyOnWriteArraySetLB2, z);
                    Integer numValueOf = Integer.valueOf(gift.groupInTab);
                    Object linkedList = linkedHashMap.get(numValueOf);
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        linkedHashMap.put(numValueOf, linkedList);
                    }
                    ((LinkedList) linkedList).add(abstractC1126600fQILIZ);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LIZ.getClass();
            List list3 = giftPage.groupsInTab;
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    GiftPage.GiftGroupInTab giftGroupInTab = (GiftPage.GiftGroupInTab) obj;
                    if (giftGroupInTab != null) {
                        arrayList.add(new Pair(Integer.valueOf(giftGroupInTab.groupInTab), Integer.valueOf(i)));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
            if (mapLJIILLIIL.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[GIFT_PANEL_ORDER] no groups_in_tab from server, fallback to legacy LinkedHashMap order; client groups=");
                sbLIZ.append(linkedHashMap.keySet());
                sbLIZ.append(", page_type=");
                sbLIZ.append(giftPage.pageType);
                C20441214yg.LJIIIZ("ExclusivePanelBuildHelper", C2188811AlT.LIZIZ(sbLIZ));
                listLJLLLL = C13LP.LLIIII(linkedHashMap.entrySet());
            } else {
                listLJLLLL = C13LP.LJLLLL(C20085613iQ.LIZ(new C5183020f(mapLJIILLIIL, (Map<String, String>) 278), AnonymousClass0207.get$arr$(134)), linkedHashMap.entrySet());
                StringBuilder sb = new StringBuilder("[GIFT_PANEL_ORDER] groups_in_tab order=");
                List listLJLLLL2 = C13LP.LJLLLL(new C512401z8(61), mapLJIILLIIL.entrySet());
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLLLL2, 10));
                Iterator it3 = listLJLLLL2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(((Number) ((Map.Entry) it3.next()).getKey()).intValue()));
                }
                sb.append(arrayList2);
                sb.append(", rendered_order=");
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                Iterator it4 = listLJLLLL.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((Map.Entry) it4.next()).getKey());
                }
                sb.append(arrayList3);
                sb.append(", page_type=");
                sb.append(giftPage.pageType);
                C20441214yg.LJIIIZ("ExclusivePanelBuildHelper", sb.toString());
            }
            for (Map.Entry entry : listLJLLLL) {
                linkedHashMap2.put(Integer.valueOf(((Number) entry.getKey()).intValue()), entry.getValue());
            }
            C012M c012mLIZLLL = C162300jl.LIZLLL(linkedHashMap2, C1127170fRD.LIZJ(), C1127170fRD.LIZLLL());
            if (c012mLIZLLL.LIZIZ && !C1127170fRD.LIZLLL()) {
                C1127170fRD.LIZJ = true;
                C1127170fRD.LJFF("guardian_group_demoted_", true);
            }
            LinkedHashMap<Integer, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> linkedHashMap3 = c012mLIZLLL.LIZ;
            int i3 = 0;
            int size = 0;
            for (Map.Entry<Integer, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> entry2 : linkedHashMap3.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                C292001Be c292001BeLIZ = C291901Bd.LIZ(iIntValue, giftPage);
                if (c292001BeLIZ.LIZ.length() == 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[GIFT_PANEL_ORDER] skip empty-title header for group_in_tab=");
                    sbLIZ2.append(iIntValue);
                    sbLIZ2.append(", page_type=");
                    sbLIZ2.append(giftPage.pageType);
                    C20441214yg.LJIIL("ExclusivePanelBuildHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    size += entry2.getValue().size();
                } else {
                    int size2 = entry2.getValue().size() + 1;
                    if (i3 == 0 && iIntValue == 1) {
                        i3 = size + size2;
                    }
                    LinkedList value = entry2.getValue();
                    C292301Bh c292301Bh = new C292301Bh(c292001BeLIZ);
                    c292301Bh.LJJIIJ = iIntValue;
                    value.addFirst(c292301Bh);
                    size += size2;
                }
            }
            LinkedList linkedList2 = new LinkedList();
            ArrayList arrayList4 = new ArrayList();
            Iterator<Map.Entry<Integer, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>>> it5 = linkedHashMap3.entrySet().iterator();
            while (it5.hasNext()) {
                C19719612Di.LJJI(it5.next().getValue(), arrayList4);
            }
            linkedList2.addAll(arrayList4);
            return new C292101Bf(i3, linkedList2);
        }
        IFansClubService iFansClubService2 = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        if (iFansClubService2 != null) {
            arrayListI422 = iFansClubService2.i42();
        }
        CopyOnWriteArraySet<Double> copyOnWriteArraySetLB22 = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).lB2();
        List<Gift> list4 = giftPage.gifts;
        if (list4 == null) {
            list4 = C13BV.INSTANCE;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Gift gift2 : list4) {
            AbstractC1126600fQI<Gift> abstractC1126600fQILIZ2 = C292201Bg.LIZ(gift2);
            LIZ.getClass();
            LIZ(abstractC1126600fQILIZ2, gift2, arrayListI422, copyOnWriteArraySetLB22, z);
            arrayList5.add(abstractC1126600fQILIZ2);
        }
        LinkedList linkedList3 = new LinkedList();
        linkedList3.addAll(arrayList5);
        return new C292101Bf(0, linkedList3);
    }

    public static void LIZ(AbstractC1126600fQI abstractC1126600fQI, Gift gift, ArrayList arrayList, Set set, boolean z) {
        C1118340fCy teamRankManager;
        GiftLockInfo giftLockInfo;
        Set<Long> set2;
        GiftLockInfo giftLockInfo2;
        GiftLockInfo giftLockInfo3;
        Gift gift2;
        C1118340fCy teamRankManager2 = GiftManager.inst().getTeamRankManager();
        if (teamRankManager2 != null) {
            GiftsInfo.LimitedTimeRewardGiftInfo limitedTimeRewardGiftInfo = (GiftsInfo.LimitedTimeRewardGiftInfo) ((LinkedHashMap) teamRankManager2.LIZIZ).get(Long.valueOf(gift.id));
            if (limitedTimeRewardGiftInfo != null) {
                abstractC1126600fQI.LJIIJJI = limitedTimeRewardGiftInfo.validStart;
                abstractC1126600fQI.LJIIL = limitedTimeRewardGiftInfo.validEnd;
            }
            Gift gift3 = (Gift) ((LinkedHashMap) teamRankManager2.LIZJ).get(Long.valueOf(abstractC1126600fQI.LJI()));
            if (gift3 != null) {
                T t = abstractC1126600fQI.LIZIZ;
                if ((t instanceof Gift) && (gift2 = (Gift) t) != null) {
                    gift2.giftSubInfo = gift3.giftSubInfo;
                    gift2.giftPanelBanner = gift3.giftPanelBanner;
                }
                if (z) {
                    teamRankManager2.LIZJ.remove(Long.valueOf(abstractC1126600fQI.LJI()));
                }
            }
        }
        if ((set.contains(Double.valueOf(gift.id)) && (giftLockInfo3 = gift.giftSubInfo) != null && giftLockInfo3.mLockType == 3) || ((arrayList != null && arrayList.contains(Double.valueOf(gift.id)) && (giftLockInfo2 = gift.giftSubInfo) != null && giftLockInfo2.mLockType == 4) || (((teamRankManager = GiftManager.inst().getTeamRankManager()) != null && (set2 = teamRankManager.LIZLLL) != null && set2.contains(Long.valueOf(gift.id))) || (C1123390fL7.LIZIZ.contains(Long.valueOf(gift.id)) && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 8)))) {
            abstractC1126600fQI.LJIIJ = true;
        }
    }
}
