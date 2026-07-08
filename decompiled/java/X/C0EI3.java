package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.ugc.android.editor.base.bottombar.DynamicBottomItem;
import com.ss.ugc.android.editor.base.bottombar.DynamicBottomOrderModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EI3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EI3 {
    public static DynamicBottomOrderModel LIZIZ;
    public static final C0EI3 LIZ = new C0EI3();
    public static final Gson LIZJ = new Gson();

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    public final synchronized List<C361980EHc> LIZLLL(List<C361980EHc> list) {
        boolean z;
        Object next;
        boolean z2;
        boolean z3;
        boolean z4;
        DynamicBottomOrderModel dynamicBottomOrderModel = LIZIZ;
        if (dynamicBottomOrderModel == null) {
            return list;
        }
        List<DynamicBottomItem> orderList = dynamicBottomOrderModel.getOrderList();
        if (dynamicBottomOrderModel.getEnable()) {
            if (orderList == null || orderList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !list.isEmpty()) {
                System.currentTimeMillis();
                ArrayList<C361980EHc> arrayList = new ArrayList(list);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C361980EHc) it2.next()).LJI);
                }
                List<DynamicBottomItem> orderList2 = dynamicBottomOrderModel.getOrderList();
                if (orderList2 != null) {
                    Iterator<DynamicBottomItem> it3 = orderList2.iterator();
                    while (it3.hasNext()) {
                        String itemType = it3.next().getItemType();
                        if (itemType == null || itemType.length() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4 && !arrayList2.contains(itemType)) {
                            C361970EHb c361970EHb = new C361970EHb();
                            c361970EHb.LJ = itemType;
                            c361970EHb.LJIIJJI = true;
                            arrayList.add(c361970EHb.LIZ());
                        }
                    }
                }
                int i = 0;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ((C361980EHc) obj).LJIILIIL = i;
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                for (C361980EHc c361980EHc : arrayList) {
                }
                for (DynamicBottomItem dynamicBottomItem : orderList) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.LJFF(((C361980EHc) next).LJI, dynamicBottomItem.getItemType())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C361980EHc c361980EHc2 = (C361980EHc) next;
                    if (c361980EHc2 != null) {
                        String leftTo = dynamicBottomItem.getLeftTo();
                        if (leftTo == null || leftTo.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            arrayList = LIZ(arrayList, dynamicBottomItem, c361980EHc2);
                        } else {
                            String rightTo = dynamicBottomItem.getRightTo();
                            if (rightTo == null || rightTo.length() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                arrayList = LIZJ(arrayList, dynamicBottomItem, c361980EHc2);
                            } else if (dynamicBottomItem.getPinIndex() >= 1) {
                                arrayList = LIZIZ(dynamicBottomItem.getPinIndex(), c361980EHc2, arrayList);
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!((C361980EHc) obj2).LJIIIZ) {
                        arrayList3.add(obj2);
                    }
                }
                List<C361980EHc> listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(75), arrayList3);
                for (C361980EHc c361980EHc3 : listLJLLLL) {
                }
                return listLJLLLL;
            }
        }
        return list;
    }

    public static List LIZ(List list, DynamicBottomItem dynamicBottomItem, C361980EHc c361980EHc) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C361980EHc) next).LJI, dynamicBottomItem.getLeftTo())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C361980EHc c361980EHc2 = (C361980EHc) next;
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(72), list);
        if (c361980EHc2 != null) {
            int i = c361980EHc2.LJIILIIL;
            int i2 = c361980EHc.LJIILIIL;
            if (i < i2) {
                c361980EHc.LJIILIIL = i;
                while (i < i2) {
                    ((C361980EHc) ListProtector.get(listLJLLLL, i)).LJIILIIL++;
                    i++;
                }
            } else if (i > i2) {
                c361980EHc.LJIILIIL = i - 1;
                while (true) {
                    i2++;
                    if (i2 >= i) {
                        break;
                    }
                    C361980EHc c361980EHc3 = (C361980EHc) ListProtector.get(listLJLLLL, i2);
                    c361980EHc3.LJIILIIL--;
                }
            }
            Iterator it3 = listLJLLLL.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        return new ArrayList(listLJLLLL);
    }

    public static List LIZIZ(int i, C361980EHc c361980EHc, List list) {
        int size = i - 1;
        if (size > list.size() - 1) {
            size = list.size() - 1;
        }
        int i2 = c361980EHc.LJIILIIL;
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(73), list);
        if (i2 > size) {
            c361980EHc.LJIILIIL = size;
            while (size < i2) {
                ((C361980EHc) ListProtector.get(listLJLLLL, size)).LJIILIIL++;
                size++;
            }
        } else if (i2 < size) {
            c361980EHc.LJIILIIL = size;
            int i3 = size + 1;
            for (int i4 = i2 + 1; i4 < i3; i4++) {
                C361980EHc c361980EHc2 = (C361980EHc) ListProtector.get(listLJLLLL, i4);
                c361980EHc2.LJIILIIL--;
            }
        }
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        return new ArrayList(listLJLLLL);
    }

    public static List LIZJ(List list, DynamicBottomItem dynamicBottomItem, C361980EHc c361980EHc) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C361980EHc) next).LJI, dynamicBottomItem.getRightTo())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C361980EHc c361980EHc2 = (C361980EHc) next;
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(74), list);
        if (c361980EHc2 != null) {
            int i = c361980EHc2.LJIILIIL;
            int i2 = c361980EHc.LJIILIIL;
            if (i < i2) {
                c361980EHc.LJIILIIL = i + 1;
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    ((C361980EHc) ListProtector.get(listLJLLLL, i)).LJIILIIL++;
                }
            } else if (i > i2) {
                c361980EHc.LJIILIIL = i;
                int i3 = i + 1;
                for (int i4 = i2 + 1; i4 < i3; i4++) {
                    C361980EHc c361980EHc3 = (C361980EHc) ListProtector.get(listLJLLLL, i4);
                    c361980EHc3.LJIILIIL--;
                }
            }
            Iterator it3 = listLJLLLL.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        return new ArrayList(listLJLLLL);
    }
}
