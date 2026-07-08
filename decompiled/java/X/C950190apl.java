package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0apl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950190apl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static C954460awe LIZ() {
        ?? arrayList;
        List<Long> listLIZLLL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null || (listLIZLLL = interfaceC973730bRjYf2.LIZLLL()) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (Long l : listLIZLLL) {
                if (l.longValue() != C950220apo.LJ()) {
                    arrayList.add(l);
                }
            }
        }
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        C954460awe c954460awe = null;
        if (!(!arrayList.isEmpty())) {
            if (C970370bMJ.LJIIIIZZ() || listLJJLI.size() != 4) {
                return null;
            }
            return (C954460awe) ListProtector.get(listLJJLI, 2);
        }
        ListIterator<C954460awe> listIterator = listLJJLI.listIterator(listLJJLI.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            C954460awe c954460awePrevious = listIterator.previous();
            if (arrayList.contains(Long.valueOf(c954460awePrevious.LJ))) {
                c954460awe = c954460awePrevious;
                break;
            }
        }
        return c954460awe;
    }
}
