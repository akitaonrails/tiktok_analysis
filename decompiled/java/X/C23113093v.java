package X;

import Y.AComparatorS502S0100000_3;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.tools.net.WeakNetSortRule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS91S0110000_3;

/* JADX INFO: renamed from: X.093v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23113093v {
    public static final List LIZIZ(String str, List list, Function1 function1) {
        List arrayList;
        C20510015Ni c20510015Ni = C20510015Ni.LIZ;
        if (!c20510015Ni.LJIIIIZZ() && !list.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            WeakNetSortRule weakNetSortRuleLIZ = c20510015Ni.LIZ();
            int i = weakNetSortRuleLIZ.sortCategory;
            if (i != 1) {
                if (i == 2) {
                    boolean z = weakNetSortRuleLIZ.sortCover;
                    AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(778);
                    if (C19719512Dh.LJI(list)) {
                        arrayList = list;
                    } else {
                        arrayList = new ArrayList(list);
                    }
                    Map mapLJIJ = C2097608Jq.LJIJ(new C08LY(new C1939607ik(list), new AwS91S0110000_3(aFwS229S0000000_2, z, 1)));
                    if (arrayList.size() > 1) {
                        C08XD.LJJ(arrayList, new AComparatorS502S0100000_3(mapLJIJ, 5));
                    }
                    list = arrayList;
                }
            } else {
                int i2 = weakNetSortRuleLIZ.minNeededCount;
                int iMin = Math.min(weakNetSortRuleLIZ.maxSortCount, list.size());
                int iMin2 = Math.min(i2, list.size());
                if (iMin > 0 && iMin2 > 0 && !list.isEmpty()) {
                    if (!C19719512Dh.LJI(list)) {
                        list = new ArrayList(list);
                    }
                    HashSet hashSet = new HashSet(iMin, 1.0f);
                    LinkedList linkedList = new LinkedList();
                    int i3 = 0;
                    int i4 = -1;
                    int i5 = 0;
                    int i6 = 0;
                    do {
                        if (((Boolean) function1.invoke(ListProtector.get(list, i5))).booleanValue()) {
                            i6++;
                            hashSet.add(Integer.valueOf(i5));
                            linkedList.addLast(ListProtector.get(list, i5));
                            i4 = i5;
                        }
                        if (i6 >= iMin2) {
                            break;
                        }
                        i5++;
                    } while (i5 < iMin);
                    if (i4 > 0) {
                        while (true) {
                            Object obj = ListProtector.get(list, i3);
                            ListProtector.set(list, i3, linkedList.removeFirst());
                            if (!hashSet.contains(Integer.valueOf(i3))) {
                                linkedList.addLast(obj);
                            }
                            if (i3 == i4) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            C2281251EQx.LIZ.LIZ(System.currentTimeMillis() - jCurrentTimeMillis, str);
        }
        return list;
    }

    public static final <T> LiveData<T> LIZ(final LiveData<T> liveData, final InterfaceC497601wk interfaceC497601wk, final Function1<? super T, Boolean> function1, final Function1<? super T, Boolean> function12) {
        if (C20510015Ni.LIZ.LJ() <= 0) {
            return liveData;
        }
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        final C259800zU c259800zU = new C259800zU();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: X.01WR
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                C09AE c09ae = c259800zU.element;
                if (c09ae != null) {
                    c09ae.LIZIZ(null);
                }
                if (function1.invoke(t).booleanValue() && c238400w2.element > 0) {
                    long jLJ = C20510015Ni.LIZ.LJ();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C238400w2 c238400w22 = c238400w2;
                    long j = jLJ - (jCurrentTimeMillis - c238400w22.element);
                    c238400w22.element = -1L;
                    if (j < 0) {
                        mediatorLiveData.setValue(t);
                        return;
                    } else {
                        C259800zU<C09AE> c259800zU2 = c259800zU;
                        c259800zU2.element = (T) C23250099c.LIZLLL(interfaceC497601wk, null, null, new C01WQ(j, c259800zU2, function1, liveData, mediatorLiveData, t, null), 3);
                        return;
                    }
                }
                if (function12.invoke(t).booleanValue()) {
                    c238400w2.element = System.currentTimeMillis();
                } else {
                    c238400w2.element = -1L;
                }
                mediatorLiveData.setValue(t);
            }
        });
        return mediatorLiveData;
    }
}
