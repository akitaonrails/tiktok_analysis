package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0wEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772890wEh<T> {
    public final Integer LIZ;
    public final Function1<? super T, Boolean> LIZIZ;
    public final Function2<T, T, T> LIZJ;
    public final LinkedList<T> LIZLLL;

    public C1772890wEh() {
        this(null, null, 7);
    }

    public final synchronized void LIZJ() {
        int iIntValue;
        Integer num = this.LIZ;
        if (num != null && this.LIZLLL.size() > (iIntValue = num.intValue())) {
            LJ(this.LIZLLL.size() - iIntValue);
        }
    }

    public final synchronized void LIZLLL() {
        this.LIZLLL.clear();
    }

    public final synchronized List<T> LJFF() {
        return C13LP.LLIIII(this.LIZLLL);
    }

    public final String toString() {
        return C13LP.LJJLIIIJ(this.LIZLLL, ", ", null, null, 0, null, null, 62);
    }

    public final synchronized void LJ(int i) {
        T tRemoveFirst;
        IntRange intRange = new IntRange(1, i);
        ArrayList arrayList = new ArrayList();
        C531650Kt9 it2 = intRange.iterator();
        while (it2.LLILLL) {
            it2.nextInt();
            if ((!this.LIZLLL.isEmpty()) && (tRemoveFirst = this.LIZLLL.removeFirst()) != null) {
                arrayList.add(tRemoveFirst);
            }
        }
    }

    public static void LIZIZ(C1772890wEh c1772890wEh, Collection collection) {
        EnumC1772920wEk enumC1772920wEk = EnumC1772920wEk.REMOVE_AND_ADD_LAST;
        synchronized (c1772890wEh) {
            if (enumC1772920wEk != EnumC1772920wEk.ADD_NEW && c1772890wEh.LIZJ != null) {
                Iterator<T> it2 = collection.iterator();
                while (it2.hasNext()) {
                    c1772890wEh.LIZ(it2.next(), enumC1772920wEk);
                }
            } else {
                LinkedList<T> linkedList = c1772890wEh.LIZLLL;
                ArrayList arrayList = new ArrayList();
                for (T t : collection) {
                    Function1<? super T, Boolean> function1 = c1772890wEh.LIZIZ;
                    if (function1 == null || function1.invoke(t).booleanValue()) {
                        arrayList.add(t);
                    }
                }
                linkedList.addAll(arrayList);
            }
            c1772890wEh.LIZJ();
        }
    }

    public final synchronized void LIZ(T t, EnumC1772920wEk enumC1772920wEk) {
        Function1<? super T, Boolean> function1 = this.LIZIZ;
        if (function1 != null && !function1.invoke(t).booleanValue()) {
            return;
        }
        if (enumC1772920wEk != EnumC1772920wEk.ADD_NEW && this.LIZJ != null) {
            LinkedList<T> linkedList = this.LIZLLL;
            ListIterator<T> listIterator = linkedList.listIterator(linkedList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (this.LIZJ.invoke(listIterator.previous(), t) != null) {
                    int iNextIndex = listIterator.nextIndex();
                    if (iNextIndex != -1) {
                        T tInvoke = this.LIZJ.invoke(this.LIZLLL.get(iNextIndex), t);
                        if (tInvoke != null) {
                            t = tInvoke;
                        }
                        int i = C1772930wEl.LIZ[enumC1772920wEk.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                this.LIZLLL.remove(iNextIndex);
                                this.LIZLLL.addLast(t);
                            }
                        } else {
                            this.LIZLLL.set(iNextIndex, t);
                        }
                    }
                }
            }
            this.LIZLLL.addLast(t);
        } else {
            this.LIZLLL.addLast(t);
        }
        LIZJ();
    }

    public C1772890wEh(Integer num, Function2 function2, int i) {
        num = (i & 1) != 0 ? null : num;
        function2 = (i & 4) != 0 ? null : function2;
        this.LIZ = num;
        this.LIZIZ = null;
        this.LIZJ = function2;
        this.LIZLLL = new LinkedList<>();
    }
}
