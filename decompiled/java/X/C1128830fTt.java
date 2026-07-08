package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInsertSelectedGiftOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128830fTt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJFF(Iterable iterable) {
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public static AbstractC1126600fQI LIZ(LinkedList linkedList, Gift gift) {
        Gift gift2;
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) it2.next();
            if (abstractC1126600fQI != null && abstractC1126600fQI.LJI() == gift.id) {
                T t = abstractC1126600fQI.LIZIZ;
                if ((t instanceof Gift) && (gift2 = (Gift) t) != null && gift2.isDisplayedOnPanel) {
                    return abstractC1126600fQI;
                }
            }
        }
        return null;
    }

    public static boolean LIZLLL(AbstractC1126600fQI abstractC1126600fQI, AbstractC1126600fQI abstractC1126600fQI2) {
        if (abstractC1126600fQI == abstractC1126600fQI2) {
            return true;
        }
        if (abstractC1126600fQI == null || abstractC1126600fQI2 == null) {
            return false;
        }
        if (abstractC1126600fQI.LJIILIIL() != null && abstractC1126600fQI2.LJIILIIL() != null) {
            return Intrinsics.LJFF(abstractC1126600fQI.LJIILIIL(), abstractC1126600fQI2.LJIILIIL());
        }
        if (abstractC1126600fQI.LJI() == abstractC1126600fQI2.LJI()) {
            return true;
        }
        return false;
    }

    public static Pair LJ(LinkedList linkedList, List list) {
        ArrayList arrayList;
        Object obj;
        String strLJIIIZ;
        ImageModel imageModelLJII;
        Integer numValueOf;
        Long lValueOf;
        Object obj2;
        Integer numValueOf2;
        Object obj3;
        String str;
        Object obj4;
        Gift.SchemeInfo schemeInfo;
        Gift gift;
        Gift gift2;
        Gift.SchemeInfo schemeInfo2;
        Gift gift3;
        Gift gift4;
        List<Integer> list2;
        Long lValueOf2;
        EnumC1148880g0E enumC1148880g0E;
        boolean z;
        String str2;
        Object obj5;
        String strLJIIIZ2;
        ImageModel imageModelLJII2;
        Integer numValueOf3;
        Long lValueOf3;
        Object obj6;
        Integer numValueOf4;
        Object obj7;
        String str3;
        Object obj8;
        Gift.SchemeInfo schemeInfo3;
        Gift gift5;
        Gift gift6;
        Gift.SchemeInfo schemeInfo4;
        Gift gift7;
        Gift gift8;
        List<Integer> list3;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        Set setLLIIJI = C13LP.LLIIJI(list);
        if (setLLIIJI != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(setLLIIJI, 10));
            Iterator it2 = setLLIIJI.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((Gift) it2.next()).id));
            }
        } else {
            arrayList = null;
        }
        if (list.isEmpty()) {
            if (linkedList != null) {
                Iterator it3 = linkedList.iterator();
                while (it3.hasNext()) {
                    AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) it3.next();
                    if (!(abstractC1126600fQI instanceof C1129840fVW) && !(abstractC1126600fQI instanceof C01AY) && !(abstractC1126600fQI instanceof C01AX)) {
                        if (abstractC1126600fQI != null) {
                            if (!GiftManager.inst().isPollGift(abstractC1126600fQI.LJI())) {
                                obj5 = abstractC1126600fQI.LIZIZ;
                            }
                        } else {
                            obj5 = null;
                        }
                        if (!(obj5 instanceof Gift) || (gift8 = (Gift) obj5) == null || (list3 = gift8.giftVerticalScenarios) == null || !list3.contains(29)) {
                            if (abstractC1126600fQI != null) {
                                strLJIIIZ2 = abstractC1126600fQI.LJIIIZ();
                                imageModelLJII2 = abstractC1126600fQI.LJII();
                                numValueOf3 = Integer.valueOf(abstractC1126600fQI.LIZLLL());
                                lValueOf3 = Long.valueOf(abstractC1126600fQI.LJI());
                            } else {
                                strLJIIIZ2 = null;
                                imageModelLJII2 = null;
                                numValueOf3 = null;
                                lValueOf3 = null;
                            }
                            EnumC1148880g0E enumC1148880g0E2 = EnumC1148880g0E.OTHER_ITEM;
                            if (abstractC1126600fQI != null) {
                                obj6 = abstractC1126600fQI.LIZIZ;
                            } else {
                                obj6 = null;
                            }
                            if ((obj6 instanceof Gift) && (gift7 = (Gift) obj6) != null) {
                                numValueOf4 = Integer.valueOf(gift7.type);
                            } else {
                                numValueOf4 = null;
                            }
                            if (abstractC1126600fQI != null) {
                                obj7 = abstractC1126600fQI.LIZIZ;
                            } else {
                                obj7 = null;
                            }
                            if ((obj7 instanceof Gift) && (gift6 = (Gift) obj7) != null && (schemeInfo4 = gift6.schemeInfo) != null) {
                                str3 = schemeInfo4.schemeDescribe;
                            } else {
                                str3 = null;
                            }
                            if (abstractC1126600fQI != null) {
                                obj8 = abstractC1126600fQI.LIZIZ;
                            } else {
                                obj8 = null;
                            }
                            if ((obj8 instanceof Gift) && (gift5 = (Gift) obj8) != null) {
                                schemeInfo3 = gift5.schemeInfo;
                            } else {
                                schemeInfo3 = null;
                            }
                            linkedList3.add(new C1148910g0H(strLJIIIZ2, imageModelLJII2, numValueOf3, lValueOf3, enumC1148880g0E2, numValueOf4, false, str3, schemeInfo3, 192));
                        }
                    }
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                Gift gift9 = (Gift) it4.next();
                int i = gift9.giftSubType;
                if (i != 3 && i != 4) {
                    if (!gift9.forLinkMic && gift9.isDisplayedOnPanel) {
                        if (C1125800fP0.LIZIZ() == EnumC1125400fOM.GUEST) {
                            enumC1148880g0E = EnumC1148880g0E.FAVORITE_DISABLED_ITEM;
                        } else {
                            enumC1148880g0E = EnumC1148880g0E.FAVORITE_ITEM;
                        }
                    } else if (gift9.isDisplayedOnPanel) {
                        enumC1148880g0E = EnumC1148880g0E.FAVORITE_ITEM;
                    } else {
                        enumC1148880g0E = EnumC1148880g0E.FAVORITE_DISABLED_ITEM;
                    }
                } else if (C1128450fTH.LJJIJIIJIL()) {
                    enumC1148880g0E = EnumC1148880g0E.FAVORITE_DISABLED_ITEM;
                } else {
                    enumC1148880g0E = EnumC1148880g0E.FAVORITE_ITEM;
                }
                String str4 = gift9.name;
                ImageModel imageModel = gift9.image;
                Integer numValueOf5 = Integer.valueOf(gift9.diamondCount);
                Long lValueOf4 = Long.valueOf(gift9.id);
                Integer numValueOf6 = Integer.valueOf(gift9.type);
                if (enumC1148880g0E == EnumC1148880g0E.FAVORITE_DISABLED_ITEM) {
                    z = true;
                } else {
                    z = false;
                }
                Gift.SchemeInfo schemeInfo5 = gift9.schemeInfo;
                if (schemeInfo5 != null) {
                    str2 = schemeInfo5.schemeDescribe;
                } else {
                    str2 = null;
                }
                arrayList2.add(new C1148910g0H(str4, imageModel, numValueOf5, lValueOf4, enumC1148880g0E, numValueOf6, z, str2, schemeInfo5, 128));
            }
            linkedList2 = new LinkedList(arrayList2);
            if (linkedList != null) {
                Iterator it5 = linkedList.iterator();
                while (it5.hasNext()) {
                    AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) it5.next();
                    if (arrayList != null) {
                        if (abstractC1126600fQI2 != null) {
                            lValueOf2 = Long.valueOf(abstractC1126600fQI2.LJI());
                        } else {
                            lValueOf2 = null;
                        }
                        if (C13LP.LJJJJ(lValueOf2, arrayList)) {
                        }
                    }
                    if (!(abstractC1126600fQI2 instanceof C1129840fVW) && !(abstractC1126600fQI2 instanceof C01AY) && !(abstractC1126600fQI2 instanceof C01AX)) {
                        if (abstractC1126600fQI2 != null) {
                            if (!GiftManager.inst().isPollGift(abstractC1126600fQI2.LJI())) {
                                obj = abstractC1126600fQI2.LIZIZ;
                            }
                        } else {
                            obj = null;
                        }
                        if (!(obj instanceof Gift) || (gift4 = (Gift) obj) == null || (list2 = gift4.giftVerticalScenarios) == null || !list2.contains(29)) {
                            if (abstractC1126600fQI2 != null) {
                                strLJIIIZ = abstractC1126600fQI2.LJIIIZ();
                                imageModelLJII = abstractC1126600fQI2.LJII();
                                numValueOf = Integer.valueOf(abstractC1126600fQI2.LIZLLL());
                                lValueOf = Long.valueOf(abstractC1126600fQI2.LJI());
                            } else {
                                strLJIIIZ = null;
                                imageModelLJII = null;
                                numValueOf = null;
                                lValueOf = null;
                            }
                            EnumC1148880g0E enumC1148880g0E3 = EnumC1148880g0E.OTHER_ITEM;
                            if (abstractC1126600fQI2 != null) {
                                obj2 = abstractC1126600fQI2.LIZIZ;
                            } else {
                                obj2 = null;
                            }
                            if ((obj2 instanceof Gift) && (gift3 = (Gift) obj2) != null) {
                                numValueOf2 = Integer.valueOf(gift3.type);
                            } else {
                                numValueOf2 = null;
                            }
                            if (abstractC1126600fQI2 != null) {
                                obj3 = abstractC1126600fQI2.LIZIZ;
                            } else {
                                obj3 = null;
                            }
                            if ((obj3 instanceof Gift) && (gift2 = (Gift) obj3) != null && (schemeInfo2 = gift2.schemeInfo) != null) {
                                str = schemeInfo2.schemeDescribe;
                            } else {
                                str = null;
                            }
                            if (abstractC1126600fQI2 != null) {
                                obj4 = abstractC1126600fQI2.LIZIZ;
                            } else {
                                obj4 = null;
                            }
                            if ((obj4 instanceof Gift) && (gift = (Gift) obj4) != null) {
                                schemeInfo = gift.schemeInfo;
                            } else {
                                schemeInfo = null;
                            }
                            linkedList3.add(new C1148910g0H(strLJIIIZ, imageModelLJII, numValueOf, lValueOf, enumC1148880g0E3, numValueOf2, false, str, schemeInfo, 192));
                        }
                    }
                }
            }
        }
        return new Pair(linkedList2, linkedList3);
    }

    public static void LJI(ArrayList arrayList, List list, int i) {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            GiftPage giftPage = (GiftPage) it2.next();
            Collection collection = giftPage.gifts;
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
            Iterable iterable = giftPage.favouriteGifts;
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(C13LP.LJLIL(iterable, collection), arrayList2);
        }
        Set setLLIIIZ = C13LP.LLIIIZ(arrayList2);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            GiftPage giftPage2 = (GiftPage) it3.next();
            if (giftPage2.pageType == i) {
                List<Gift> list2 = giftPage2.favouriteGifts;
                if (list2 != null) {
                    setLLIIIZ.addAll(list2);
                }
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    long jLongValue = ((Number) it4.next()).longValue();
                    Iterator it5 = setLLIIIZ.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            Object next = it5.next();
                            if (((Gift) next).id == jLongValue) {
                                if (next != null) {
                                    linkedList.add(next);
                                }
                            }
                        }
                    }
                }
                giftPage2.favouriteGifts = linkedList;
            }
        }
    }

    public static void LIZJ(LinkedList linkedList, LinkedList linkedList2, int i, boolean z) {
        long jLIZIZ = C1131900fYq.LIZIZ(C497740JfY.LJII(), "default_dialog_item");
        Object obj = null;
        if (jLIZIZ > 0) {
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) next;
                if (abstractC1126600fQI != null && abstractC1126600fQI.LJI() == jLIZIZ) {
                    obj = next;
                    break;
                }
            }
            AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) obj;
            if (abstractC1126600fQI2 != null) {
                if (z) {
                    C19719612Di.LJJIIJ(linkedList, new AwS596S0100000_17(abstractC1126600fQI2, (AbstractC1126600fQI<? extends AnonymousClass0054>) 480), true);
                }
                if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
                    Iterator it3 = linkedList.iterator();
                    while (it3.hasNext()) {
                        if (LIZLLL((AbstractC1126600fQI) it3.next(), abstractC1126600fQI2)) {
                            return;
                        }
                    }
                }
                linkedList.add(C13LZ.LJ(i, 0, linkedList.size()), abstractC1126600fQI2);
            }
        }
    }

    public static void LIZIZ(GiftPage giftPage, LinkedList linkedList, LinkedList linkedList2, List list, List list2, List list3, List list4, C1128920fU2 c1128920fU2, boolean z, boolean z2) {
        int size;
        boolean z3;
        boolean z4;
        String strLJIILIIL;
        String strLJIILIIL2;
        Long lValueOf;
        AbstractC1126600fQI abstractC1126600fQILIZ;
        Long lValueOf2;
        Gift gift;
        Gift gift2;
        Long lValueOf3;
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        Iterator it3 = linkedList2.iterator();
        while (it3.hasNext()) {
            it3.next();
        }
        if (giftPage.pageType != 18) {
            InterfaceC1133710fbl.LIZ.getClass();
            if (((C1133940fc8) C1120710fGn.LIZ()).LJIIJ()) {
                list3.clear();
                list4.clear();
                if (c1128920fU2 != null) {
                    c1128920fU2.LLILLJJLI = EnumC1129610fV9.LL;
                    RecyclerView recyclerView = c1128920fU2.LL;
                    if (recyclerView != null) {
                        recyclerView.invalidateItemDecorations();
                    }
                }
                List<Long> listLJI = C1128820fTs.LJI(linkedList, linkedList2, list);
                LJFF(C13LP.LL(linkedList, ((ArrayList) listLJI).size()));
                ArrayList arrayList = (ArrayList) list2;
                arrayList.clear();
                arrayList.addAll(listLJI);
                return;
            }
        }
        List<Gift> list5 = giftPage.favouriteGifts;
        if (list5 != null && !list5.isEmpty()) {
            LinkedList<AbstractC1126600fQI> linkedList3 = new LinkedList();
            LinkedList<AbstractC1126600fQI> linkedList4 = new LinkedList();
            LinkedList<AbstractC1126600fQI> linkedList5 = new LinkedList();
            List<Gift> list6 = giftPage.favouriteGifts;
            if (list6 != null) {
                for (Gift gift3 : list6) {
                    AbstractC1126600fQI abstractC1126600fQILIZ2 = LIZ(linkedList, gift3);
                    if (abstractC1126600fQILIZ2 != null) {
                        linkedList3.add(abstractC1126600fQILIZ2);
                    } else {
                        AbstractC1126600fQI abstractC1126600fQILIZ3 = LIZ(linkedList2, gift3);
                        if (abstractC1126600fQILIZ3 != null) {
                            linkedList3.add(abstractC1126600fQILIZ3);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC1126600fQI abstractC1126600fQI : linkedList3) {
                if (abstractC1126600fQI != null && (lValueOf3 = Long.valueOf(abstractC1126600fQI.LJI())) != null) {
                    arrayList2.add(lValueOf3);
                }
            }
            LinkedList linkedList6 = new LinkedList(arrayList2);
            int size2 = linkedList3.size();
            List<Gift> list7 = giftPage.favouriteGifts;
            if (list7 != null) {
                size = list7.size();
            } else {
                size = 0;
            }
            if (size2 < size) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (linkedList3.size() < 4) {
                int size3 = linkedList3.size();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C1086850eOB pollGifts = GiftManager.inst().getPollGifts();
                if (pollGifts != null && (gift2 = pollGifts.LIZ) != null) {
                    linkedHashSet.add(Long.valueOf(gift2.id));
                }
                C1086850eOB pollGifts2 = GiftManager.inst().getPollGifts();
                if (pollGifts2 != null && (gift = pollGifts2.LIZIZ) != null) {
                    linkedHashSet.add(Long.valueOf(gift.id));
                }
                long jLJJIJIIJI = C1128450fTH.LJJIJIIJI();
                if (jLJJIJIIJI > 0) {
                    linkedHashSet.add(Long.valueOf(jLJJIJIIJI));
                }
                if (!linkedList3.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (AbstractC1126600fQI abstractC1126600fQI2 : linkedList3) {
                        if (abstractC1126600fQI2 != null && (lValueOf2 = Long.valueOf(abstractC1126600fQI2.LJI())) != null) {
                            arrayList3.add(lValueOf2);
                        }
                    }
                    linkedHashSet.addAll(arrayList3);
                }
                List<Gift> list8 = giftPage.backfillGifts;
                if (list8 != null) {
                    for (Gift gift4 : list8) {
                        if (!linkedHashSet.contains(Long.valueOf(gift4.id)) && (abstractC1126600fQILIZ = LIZ(linkedList, gift4)) != null && linkedList3.size() < 4) {
                            linkedList3.add(abstractC1126600fQILIZ);
                            linkedList4.add(abstractC1126600fQILIZ);
                        }
                    }
                }
                if (!linkedList4.isEmpty()) {
                    LinkedList linkedList7 = new LinkedList();
                    LinkedList linkedList8 = new LinkedList();
                    LinkedList linkedList9 = new LinkedList();
                    int i = 0;
                    for (Object obj : linkedList4) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            AbstractC1126600fQI abstractC1126600fQI3 = (AbstractC1126600fQI) obj;
                            if (abstractC1126600fQI3 != null) {
                                linkedList7.add(Integer.valueOf(abstractC1126600fQI3.LIZLLL()));
                                linkedList8.add(Integer.valueOf(i + size3 + 1));
                                linkedList9.add(Long.valueOf(abstractC1126600fQI3.LJI()));
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (!z) {
                        ArrayList arrayList4 = new ArrayList();
                        for (AbstractC1126600fQI abstractC1126600fQI4 : linkedList3) {
                            if (abstractC1126600fQI4 != null && (lValueOf = Long.valueOf(abstractC1126600fQI4.LJI())) != null) {
                                arrayList4.add(lValueOf);
                            }
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("edit_featured_area_autofill");
                        c474500IjALIZ.LJIL();
                        C1129850fVX.LIZ(c474500IjALIZ);
                        c474500IjALIZ.LJJII(linkedList7, "autofill_gift_price");
                        c474500IjALIZ.LJJII(linkedList8, "autofill_position");
                        c474500IjALIZ.LJJII(linkedList9, "autofill_gift_id");
                        c474500IjALIZ.LJJII(arrayList4, "featured_gift_id_set");
                        c474500IjALIZ.LIZ();
                    }
                }
            }
            if (linkedList3.isEmpty()) {
                linkedList.addFirst(new C1129840fVW(new C1130200fW6(new AbstractC1130170fW3() { // from class: X.0fWH
                })));
                ((ArrayList) list2).clear();
                if (c1128920fU2 == null) {
                    return;
                }
                c1128920fU2.LLILLJJLI = EnumC1129610fV9.LLILLJJLI;
                RecyclerView recyclerView2 = c1128920fU2.LL;
                if (recyclerView2 == null) {
                    return;
                }
                recyclerView2.invalidateItemDecorations();
                return;
            }
            if (giftPage.useBackfillSpecialText && (!linkedList4.isEmpty())) {
                z4 = true;
            } else {
                z4 = false;
            }
            linkedList5.addFirst(new C1129840fVW(new C1130200fW6(new C1129960fVi(linkedList6, z4, z3))));
            LJFF(linkedList3);
            linkedList5.addAll(linkedList3);
            LIZJ(linkedList5, linkedList, linkedList5.size(), false);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (AbstractC1126600fQI abstractC1126600fQI5 : linkedList5) {
                if (abstractC1126600fQI5 != null) {
                    strLJIILIIL2 = abstractC1126600fQI5.LJIILIIL();
                } else {
                    strLJIILIIL2 = null;
                }
                linkedHashSet2.add(strLJIILIIL2);
            }
            Iterator it4 = linkedList.iterator();
            while (it4.hasNext()) {
                AbstractC1126600fQI abstractC1126600fQI6 = (AbstractC1126600fQI) it4.next();
                if (abstractC1126600fQI6 != null) {
                    strLJIILIIL = abstractC1126600fQI6.LJIILIIL();
                } else {
                    strLJIILIIL = null;
                }
                if (!linkedHashSet2.contains(strLJIILIIL)) {
                    linkedList5.add(abstractC1126600fQI6);
                }
            }
            if ((!linkedList4.isEmpty()) && giftPage.useBackfillSpecialText) {
                for (AbstractC1126600fQI abstractC1126600fQI7 : linkedList4) {
                    if (abstractC1126600fQI7 != null) {
                        abstractC1126600fQI7.LJIILL = true;
                    }
                }
            }
            linkedList.clear();
            linkedList.addAll(linkedList5);
            list3.clear();
            for (AbstractC1126600fQI abstractC1126600fQI8 : linkedList3) {
                if (abstractC1126600fQI8 != null) {
                    list3.add(Long.valueOf(abstractC1126600fQI8.LJI()));
                }
            }
            list4.clear();
            for (AbstractC1126600fQI abstractC1126600fQI9 : linkedList4) {
                if (abstractC1126600fQI9 != null) {
                    list4.add(Long.valueOf(abstractC1126600fQI9.LJI()));
                }
            }
            ((ArrayList) list2).clear();
            if (c1128920fU2 == null) {
                return;
            }
            c1128920fU2.LLILLJJLI = EnumC1129610fV9.LLILZ;
            RecyclerView recyclerView3 = c1128920fU2.LL;
            if (recyclerView3 == null) {
                return;
            }
            recyclerView3.invalidateItemDecorations();
            return;
        }
        list3.clear();
        list4.clear();
        List<Long> listLJI2 = C1128820fTs.LJI(linkedList, linkedList2, list);
        ArrayList arrayList5 = (ArrayList) listLJI2;
        if (!arrayList5.isEmpty()) {
            LJFF(C13LP.LL(linkedList, arrayList5.size()));
            linkedList.addFirst(new C1129840fVW(new C1130200fW6(new C1129990fVl(listLJI2))));
            ArrayList arrayList6 = (ArrayList) list2;
            arrayList6.clear();
            arrayList6.addAll(listLJI2);
            if (c1128920fU2 == null) {
                return;
            }
            c1128920fU2.LLILLJJLI = EnumC1129610fV9.LLILLL;
            RecyclerView recyclerView4 = c1128920fU2.LL;
            if (recyclerView4 != null) {
                recyclerView4.invalidateItemDecorations();
            }
            c1128920fU2.LLILZ = listLJI2;
            return;
        }
        if (z2) {
            return;
        }
        linkedList.addFirst(new C1129840fVW(new C1130200fW6(new AbstractC1130170fW3() { // from class: X.0fWH
        })));
        if (LiveGiftInsertSelectedGiftOptSetting.INSTANCE.enable()) {
            LIZJ(linkedList, linkedList, 1, true);
        }
        ((ArrayList) list2).clear();
        if (c1128920fU2 == null) {
            return;
        }
        c1128920fU2.LLILLJJLI = EnumC1129610fV9.LLILLJJLI;
        RecyclerView recyclerView5 = c1128920fU2.LL;
        if (recyclerView5 == null) {
            return;
        }
        recyclerView5.invalidateItemDecorations();
    }
}
