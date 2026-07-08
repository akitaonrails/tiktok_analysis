package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19881612qc {
    public static <E> ArrayList<E> LIZ(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        Iterator<? extends E> it2 = iterable.iterator();
        ArrayList<E> arrayList = new ArrayList<>();
        C19867212oI.LIZ(arrayList, it2);
        return arrayList;
    }

    public static <E> ArrayList<E> LIZIZ(E... eArr) {
        int length = eArr.length;
        C19863912nl.LIZIZ(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(C19881312qZ.LIZIZ(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <T> List<T> LIZJ(List<T> list) {
        if (list instanceof AbstractC19875512pd) {
            return ((AbstractC19875512pd) list).reverse();
        }
        if (list instanceof C19882112qh) {
            return ((C19882112qh) list).LL;
        }
        if (list instanceof RandomAccess) {
            return new C19881712qd(list);
        }
        return new C19882112qh(list);
    }

    public static <F, T> List<T> LIZLLL(List<F> list, InterfaceC19882712qn<? super F, ? extends T> interfaceC19882712qn) {
        if (list instanceof RandomAccess) {
            return new C19882012qg(list, interfaceC19882712qn);
        }
        return new C19881912qf(list, interfaceC19882712qn);
    }
}
