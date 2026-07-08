package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0ReY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700960ReY {
    public static final C700950ReX LIZIZ(C700170RdH c700170RdH) {
        C700950ReX c700950ReX;
        String str;
        List list;
        AbstractC701310Rf7 abstractC701310Rf7;
        C700970ReZ c700970ReZ = c700170RdH.LIZ.LIZIZ().get(c700170RdH.LIZLLL);
        if (c700970ReZ != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LIZ(linkedHashSet2, linkedHashSet3, linkedHashSet, c700970ReZ);
            List listLLIIII = C13LP.LLIIII(linkedHashSet);
            List listLLIIII2 = C13LP.LLIIII(linkedHashSet2);
            List listLLIIII3 = C13LP.LLIIII(linkedHashSet3);
            C700950ReX c700950ReX2 = c700970ReZ.LJFF;
            if (c700950ReX2 == null || (list = c700950ReX2.LIZIZ) == null) {
                list = C13BV.INSTANCE;
            }
            c700950ReX = new C700950ReX(listLLIIII, list, listLLIIII2, listLLIIII3);
            C700950ReX c700950ReX3 = c700970ReZ.LJFF;
            if (c700950ReX3 != null) {
                abstractC701310Rf7 = c700950ReX3.LJ;
            } else {
                abstractC701310Rf7 = null;
            }
            c700950ReX.LJ = abstractC701310Rf7;
        } else {
            C13BV c13bv = C13BV.INSTANCE;
            c700950ReX = new C700950ReX(c13bv, c13bv, c13bv, c13bv);
        }
        Collection<C700970ReZ> collectionValues = c700170RdH.LIZ.LIZIZ().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            C700970ReZ c700970ReZ2 = (C700970ReZ) obj;
            c700970ReZ2.getClass();
            C701240Rf0 c701240Rf0 = c700970ReZ2.LJIIIIZZ;
            if (c701240Rf0 != null) {
                str = c701240Rf0.LIZ;
            } else {
                str = null;
            }
            if (!C1533950q1J.LJ(str)) {
                arrayList.add(obj);
            }
        }
        return C700950ReX.LIZ(c700950ReX, C13LP.LJJJJI(C13LP.LJLIL(arrayList, c700950ReX.LIZ)), null, null, C13LP.LJJJJI(C13LP.LJLIL(arrayList, c700950ReX.LIZLLL)), 22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(Set<C700970ReZ> set, Set<C700970ReZ> set2, Set<C700970ReZ> set3, C700970ReZ c700970ReZ) {
        Collection<? extends C700970ReZ> collection;
        Collection<? extends C700970ReZ> collection2;
        C700950ReX c700950ReX = c700970ReZ.LJFF;
        if (c700950ReX == null || (collection = c700950ReX.LIZJ) == null) {
            collection = C08CX.INSTANCE;
        }
        set.addAll(collection);
        C700950ReX c700950ReX2 = c700970ReZ.LJFF;
        if (c700950ReX2 == null || (collection2 = c700950ReX2.LIZLLL) == null) {
            collection2 = C08CX.INSTANCE;
        }
        set2.addAll(collection2);
        if (c700970ReZ.LIZIZ() > 0) {
            C701170Ret c701170Ret = new C701170Ret(set, set2, set3);
            synchronized (c700970ReZ) {
                Iterator it2 = ((ArrayList) c700970ReZ.LIZIZ).iterator();
                while (it2.hasNext()) {
                    c701170Ret.invoke(it2.next());
                }
            }
            return;
        }
        set3.add(c700970ReZ);
    }
}
