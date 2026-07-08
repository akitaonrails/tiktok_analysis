package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.guide.model.LocalCurrencyGiftInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftClientForceInsertMigrateSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftHighlightGoalEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128820fTs {
    public static final void LJFF(GiftListResult giftListResult) {
        List<GiftPage> list = giftListResult.giftPages;
        if (list != null && !list.isEmpty()) {
            for (GiftPage giftPage : list) {
                List<Gift> list2 = giftPage.frequentlyUsedGifts;
                List<Gift> list3 = giftPage.gifts;
                if (!list2.isEmpty() && list3 != null && !list3.isEmpty()) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator<Gift> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(it2.next().id));
                    }
                    Set setLLIIJI = C13LP.LLIIJI(arrayList);
                    Iterator it3 = new C13EO(list2).iterator();
                    while (true) {
                        C13EN c13en = (C13EN) it3;
                        if (c13en.hasNext()) {
                            Gift gift = (Gift) c13en.next();
                            if (!setLLIIJI.contains(Long.valueOf(gift.id))) {
                                ListProtector.add(list3, 0, gift);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void LJII(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList) {
        LocalCurrencyGiftInfo localCurrencyGiftInfoLIZIZ = C1127580fRs.LIZIZ();
        if (localCurrencyGiftInfoLIZIZ != null) {
            long j = localCurrencyGiftInfoLIZIZ.giftId;
            int i = 0;
            int i2 = 0;
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : linkedList) {
                if (abstractC1126600fQI != null && abstractC1126600fQI.LJFF() == j) {
                    if (i2 != -1) {
                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = linkedList.get(0);
                        if ((abstractC1126600fQI2 instanceof C293101Bp) || (abstractC1126600fQI2 instanceof C293301Br) || (abstractC1126600fQI2 instanceof C293201Bq)) {
                            i = 1;
                        }
                        if (i2 == i) {
                            return;
                        }
                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = linkedList.get(i2);
                        linkedList.remove(i2);
                        linkedList.add(i, abstractC1126600fQI3);
                        return;
                    }
                    return;
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(java.util.LinkedList<X.AbstractC1126600fQI<? extends X.AnonymousClass0054>> r7, java.util.Map<java.lang.Long, java.lang.Integer> r8) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128820fTs.LJIIIIZZ(java.util.LinkedList, java.util.Map):void");
    }

    public static final void LIZJ(GiftPage giftPage, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, Function1<? super Gift, ? extends AbstractC1126600fQI<? extends AnonymousClass0054>> function1) {
        Gift userLevelUpgradeGift;
        Gift next;
        if (!LiveGiftClientForceInsertMigrateSettings.INSTANCE.enableStrategyForceInsertLevelUpGame() && ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).shouldForceInsertLevelUpGift() && (userLevelUpgradeGift = GiftManager.inst().getUserLevelUpgradeGift()) != null) {
            linkedList.add(2, function1.invoke(userLevelUpgradeGift));
            List<Gift> list = giftPage.favouriteGifts;
            if (list != null) {
                Iterator<Gift> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.id == userLevelUpgradeGift.id) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Gift gift = next;
                if (gift != null) {
                    gift.isDisplayedOnPanel = true;
                }
            }
        }
    }

    public static final List<Long> LJI(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList2, List<Long> list) {
        AbstractC1126600fQI<? extends AnonymousClass0054> next;
        AbstractC1126600fQI<? extends AnonymousClass0054> next2;
        Long lValueOf;
        Long lValueOf2;
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty() && !linkedList.isEmpty()) {
            Set setLLIIIZ = C13LP.LLIIIZ(list);
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : linkedList) {
                if (abstractC1126600fQI != null && (lValueOf2 = Long.valueOf(abstractC1126600fQI.LJI())) != null) {
                    arrayList2.add(lValueOf2);
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 : linkedList2) {
                if (abstractC1126600fQI2 != null && (lValueOf = Long.valueOf(abstractC1126600fQI2.LJI())) != null) {
                    arrayList3.add(lValueOf);
                }
            }
            Set setLLIIJI2 = C13LP.LLIIJI(arrayList3);
            long jLIZIZ = C1131900fYq.LIZIZ(C497740JfY.LJII(), "default_dialog_item");
            if (jLIZIZ != 0 && !setLLIIJI2.contains(Long.valueOf(jLIZIZ))) {
                if (setLLIIIZ.contains(Long.valueOf(jLIZIZ))) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next3 = it2.next();
                        if (jLIZIZ == ((Number) next3).longValue()) {
                            if (next3 != null) {
                                arrayList.remove(next3);
                                ListProtector.add(list, 0, next3);
                                setLLIIIZ.add(Long.valueOf(jLIZIZ));
                            }
                        }
                    }
                } else if (setLLIIJI.contains(Long.valueOf(jLIZIZ))) {
                    Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it3 = linkedList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = next2;
                            if (abstractC1126600fQI3 != null && abstractC1126600fQI3.LJI() == jLIZIZ) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI4 = next2;
                    if (abstractC1126600fQI4 != null) {
                        ListProtector.add(list, 0, Long.valueOf(abstractC1126600fQI4.LJI()));
                        setLLIIIZ.add(Long.valueOf(jLIZIZ));
                    }
                }
            }
            while (arrayList.size() > 4) {
                setLLIIIZ.remove(Long.valueOf(((Number) C19719612Di.LJJIJ(list)).longValue()));
            }
            Iterator it4 = new C13EO(list).iterator();
            while (true) {
                C13EN c13en = (C13EN) it4;
                if (c13en.hasNext()) {
                    long jLongValue = ((Number) c13en.next()).longValue();
                    Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it5 = linkedList.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        next = it5.next();
                        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI5 = next;
                        if (abstractC1126600fQI5 != null && abstractC1126600fQI5.LJI() == jLongValue) {
                            if (next != null) {
                                linkedList.remove(next);
                            }
                        }
                    }
                    Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it6 = linkedList2.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            next = it6.next();
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI6 = next;
                            if (abstractC1126600fQI6 == null || abstractC1126600fQI6.LJI() != jLongValue) {
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    linkedList.add(0, next);
                } else {
                    return list;
                }
            }
        } else {
            return new ArrayList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, List<Long> list, List<Long> list2, List<Long> list3, Long l) {
        int i;
        Object objLJJJLZIJ;
        if (l != null && l.longValue() != 0 && !list.contains(l) && !list2.contains(l)) {
            Iterator it2 = linkedList.iterator();
            int i2 = 0;
            while (true) {
                Long lValueOf = null;
                if (it2.hasNext()) {
                    AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) it2.next();
                    if (abstractC1126600fQI != null) {
                        lValueOf = Long.valueOf(abstractC1126600fQI.LJFF());
                    }
                    if (Intrinsics.LJFF(lValueOf, l)) {
                        if (i2 != -1) {
                            if (!list3.isEmpty()) {
                                i = 6;
                            } else {
                                i = 0;
                            }
                            Iterator it3 = linkedList.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next = it3.next();
                                if (next instanceof C1129840fVW) {
                                    if (next != null) {
                                        if (list.isEmpty() && list2.isEmpty()) {
                                            i++;
                                        } else {
                                            i += 5;
                                        }
                                    }
                                }
                            }
                            if (C13LP.LJJJLZIJ(i, linkedList) instanceof C01AX) {
                                i++;
                            }
                            Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i, linkedList);
                            if (objLJJJLZIJ2 == null) {
                                return;
                            }
                            if ((objLJJJLZIJ2 instanceof C293101Bp) || (objLJJJLZIJ2 instanceof C293301Br) || (objLJJJLZIJ2 instanceof C293201Bq)) {
                                i++;
                            }
                            if (i2 == i || (objLJJJLZIJ = C13LP.LJJJLZIJ(i2, linkedList)) == null) {
                                return;
                            }
                            linkedList.remove(i2);
                            linkedList.add(i, objLJJJLZIJ);
                            return;
                        }
                        return;
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void LIZLLL(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, List<Long> list, List<Long> list2, List<Long> list3, boolean z, long j) {
        int iLIZIZ;
        AbstractC1126600fQI abstractC1126600fQI;
        int i;
        if (z && (iLIZIZ = C01AU.LIZIZ(j, linkedList)) != -1 && (abstractC1126600fQI = (AbstractC1126600fQI) C13LP.LJJJLZIJ(iLIZIZ, linkedList)) != null && !list.contains(Long.valueOf(abstractC1126600fQI.LJFF())) && !list2.contains(Long.valueOf(abstractC1126600fQI.LJFF()))) {
            if (!list3.isEmpty()) {
                i = 6;
            } else {
                i = 0;
            }
            Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC1126600fQI<? extends AnonymousClass0054> next = it2.next();
                if (next instanceof C1129840fVW) {
                    if (next != null) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            i++;
                        } else {
                            i += 5;
                        }
                    }
                }
            }
            if (C13LP.LJJJLZIJ(i, linkedList) instanceof C01AX) {
                i++;
            }
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = linkedList.get(i);
            if ((abstractC1126600fQI2 instanceof C293101Bp) || (abstractC1126600fQI2 instanceof C293301Br) || (abstractC1126600fQI2 instanceof C293201Bq)) {
                i++;
            }
            if (iLIZIZ == i) {
                return;
            }
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = linkedList.get(iLIZIZ);
            linkedList.remove(iLIZIZ);
            linkedList.add(i, abstractC1126600fQI3);
        }
    }

    public static long LJ(LinkedList linkedList, LinkedList linkedList2, List list, List list2, List list3, boolean z) {
        C1125860fP6 c1125860fP6;
        C1125920fPC c1125920fPCLIZ;
        int i;
        int i2 = LiveGiftHighlightGoalEnabledSetting.INSTANCE.getValue().goalPosition;
        if (!LiveGiftClientForceInsertMigrateSettings.INSTANCE.enableStrategyForceInsertLiveGoal() && (c1125860fP6 = C1125820fP2.LJFF().LIZ) != null && (c1125920fPCLIZ = c1125860fP6.LIZ()) != null) {
            long j = c1125920fPCLIZ.LIZ;
            if ((linkedList instanceof Collection) && linkedList.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (Object obj : linkedList) {
                    if ((obj instanceof C1129840fVW) || (obj instanceof C292301Bh) || (obj instanceof C01AY) || (obj instanceof C01AX)) {
                        i++;
                        if (i < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
            }
            int size = i2 + i + list3.size();
            if (!list.contains(Long.valueOf(j)) && !list2.contains(Long.valueOf(j))) {
                Iterator it2 = linkedList.iterator();
                int i3 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) it2.next();
                        if (abstractC1126600fQI != null && abstractC1126600fQI.LJI() == j && abstractC1126600fQI.LIZ != 17) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 != size) {
                    if (i3 != -1 && !z) {
                        Object obj2 = linkedList.get(i3);
                        linkedList.remove(i3);
                        linkedList.add(size, obj2);
                    } else {
                        Iterator it3 = linkedList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next = it3.next();
                            AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) next;
                            if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LJI() == j) {
                                if (next != null) {
                                    if (i3 != -1) {
                                        linkedList.remove(i3);
                                    }
                                    linkedList.add(size, next);
                                    return j;
                                }
                            }
                        }
                    }
                    return j;
                }
                return -1L;
            }
            return -1L;
        }
        return -1L;
    }

    public static final Map<Long, Integer> LIZ(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, List<Long> list, List<Long> list2, List<Long> list3, long j, List<Long> list4, List<Long> list5, C1128650fTb c1128650fTb) {
        int iLIZ;
        int iLIZ2;
        if (c1128650fTb == null) {
            c1128650fTb = C1128620fTY.LIZ(linkedList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list2 != null) {
            Iterator it2 = ((ArrayList) list2).iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                if (list3 != null && !list3.contains(Long.valueOf(jLongValue)) && (iLIZ2 = c1128650fTb.LIZ(jLongValue)) > 0) {
                    linkedHashMap.put(Long.valueOf(jLongValue), Integer.valueOf(iLIZ2));
                }
            }
        }
        if (list != null) {
            Iterator it3 = ((ArrayList) list).iterator();
            while (it3.hasNext()) {
                long jLongValue2 = ((Number) it3.next()).longValue();
                int iLIZ3 = c1128650fTb.LIZ(jLongValue2);
                if (iLIZ3 > 0) {
                    linkedHashMap.put(Long.valueOf(jLongValue2), Integer.valueOf(iLIZ3));
                }
            }
        }
        if (j > 0 && (iLIZ = c1128650fTb.LIZ(j)) > 0) {
            linkedHashMap.put(Long.valueOf(j), Integer.valueOf(iLIZ));
        }
        if (list4 != null && (!list4.isEmpty())) {
            Iterator<Long> it4 = list4.iterator();
            while (it4.hasNext()) {
                long jLongValue3 = it4.next().longValue();
                int iLIZ4 = c1128650fTb.LIZ(jLongValue3);
                if (iLIZ4 > 0) {
                    linkedHashMap.put(Long.valueOf(jLongValue3), Integer.valueOf(iLIZ4));
                }
            }
        }
        if (list5 != null) {
            Iterator it5 = ((ArrayList) list5).iterator();
            while (it5.hasNext()) {
                long jLongValue4 = ((Number) it5.next()).longValue();
                int iLIZ5 = c1128650fTb.LIZ(jLongValue4);
                if (iLIZ5 > 0) {
                    linkedHashMap.put(Long.valueOf(jLongValue4), Integer.valueOf(iLIZ5));
                }
            }
        }
        return linkedHashMap;
    }
}
