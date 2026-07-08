package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.14lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20360514lf {
    public static final boolean LIZ(C20379114of c20379114of) {
        List<C20359414lU> list;
        C20360614lg c20360614lg;
        if (c20379114of == null || (c20360614lg = c20379114of.LIZIZ) == null || (list = c20360614lg.LIZIZ) == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return false;
        }
        if (!list.isEmpty()) {
            for (C20359414lU c20359414lU : list) {
                if (!c20359414lU.LIZJ.isEmpty()) {
                    List<C20361214lm> list2 = c20359414lU.LIZJ;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<C20361214lm> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (!C500260Jjc.LJJIIZ(it2.next().LJII)) {
                                return false;
                            }
                        }
                    }
                } else {
                    String str = c20359414lU.LJ;
                    if (str == null || str.length() == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
