package X;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0WzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841140WzA {
    public static C0WSU LIZ(C0276007m c0276007m, C841060Wz2 c841060Wz2) {
        AbstractC841440Wze abstractC841440Wze;
        AbstractC841440Wze abstractC841440WzePrevious;
        AbstractC841440Wze abstractC841440WzePrevious2;
        List<AbstractC841440Wze> list = c0276007m.LIZ;
        ListIterator<AbstractC841440Wze> listIterator = list.listIterator(list.size());
        while (true) {
            abstractC841440Wze = null;
            if (listIterator.hasPrevious()) {
                abstractC841440WzePrevious = listIterator.previous();
                if (abstractC841440WzePrevious instanceof C841160WzC) {
                    break;
                }
            } else {
                abstractC841440WzePrevious = null;
                break;
            }
        }
        if (!(abstractC841440WzePrevious instanceof C841160WzC)) {
            abstractC841440WzePrevious = null;
        }
        C841160WzC c841160WzC = (C841160WzC) abstractC841440WzePrevious;
        if (c841160WzC != null) {
            return new C0WSU(true, c841160WzC.LIZ);
        }
        List<AbstractC841440Wze> list2 = c0276007m.LIZ;
        ListIterator<AbstractC841440Wze> listIterator2 = list2.listIterator(list2.size());
        while (true) {
            if (listIterator2.hasPrevious()) {
                abstractC841440WzePrevious2 = listIterator2.previous();
                if (abstractC841440WzePrevious2 instanceof C841150WzB) {
                    break;
                }
            } else {
                abstractC841440WzePrevious2 = null;
                break;
            }
        }
        if (abstractC841440WzePrevious2 instanceof C841150WzB) {
            abstractC841440Wze = abstractC841440WzePrevious2;
        }
        C841150WzB c841150WzB = (C841150WzB) abstractC841440Wze;
        if (c841150WzB != null) {
            return new C0WSU(c841150WzB.LIZIZ, c841150WzB.LIZ);
        }
        C0WSU c0wsu = c841060Wz2.LIZIZ;
        if (c0wsu != null) {
            return c0wsu;
        }
        return C0WSU.LIZLLL;
    }
}
