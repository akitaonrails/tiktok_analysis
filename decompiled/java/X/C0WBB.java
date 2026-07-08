package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0WBB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WBB {
    public static void LIZ(List<C0WBP<?>> list) {
        boolean z;
        boolean z2;
        ArrayList arrayList = (ArrayList) list;
        HashMap map = new HashMap(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (true) {
            int i = 0;
            if (it2.hasNext()) {
                C0WBP c0wbp = (C0WBP) it2.next();
                C0WBD c0wbd = new C0WBD(c0wbp);
                Iterator it3 = c0wbp.LIZ.iterator();
                while (it3.hasNext()) {
                    C0WBF c0wbf = (C0WBF) it3.next();
                    if (c0wbp.LIZLLL == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z3 = !z2;
                    C0WBE c0wbe = new C0WBE(c0wbf, z3);
                    if (!map.containsKey(c0wbe)) {
                        map.put(c0wbe, new HashSet());
                    }
                    Set set = (Set) map.get(c0wbe);
                    if (!set.isEmpty() && !z3) {
                        throw new IllegalArgumentException(C786410Ut5.j4("Multiple components provide %s.", new Object[]{c0wbf}));
                    }
                    set.add(c0wbd);
                }
            } else {
                Iterator it4 = map.values().iterator();
                while (it4.hasNext()) {
                    for (C0WBD c0wbd2 : (Set) it4.next()) {
                        for (C0WBG c0wbg : c0wbd2.LIZ.LIZIZ) {
                            if (c0wbg.LIZJ == 0) {
                                C0WBF<?> c0wbf2 = c0wbg.LIZ;
                                if (c0wbg.LIZIZ == 2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Set<C0WBD> set2 = (Set) map.get(new C0WBE(c0wbf2, z));
                                if (set2 != null) {
                                    for (C0WBD c0wbd3 : set2) {
                                        ((HashSet) c0wbd2.LIZIZ).add(c0wbd3);
                                        ((HashSet) c0wbd3.LIZJ).add(c0wbd2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<C0WBD> hashSet = new HashSet();
                Iterator it5 = map.values().iterator();
                while (it5.hasNext()) {
                    hashSet.addAll((Collection) it5.next());
                }
                HashSet hashSet2 = new HashSet();
                for (C0WBD c0wbd4 : hashSet) {
                    if (((HashSet) c0wbd4.LIZJ).isEmpty()) {
                        hashSet2.add(c0wbd4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C0WBD c0wbd5 = (C0WBD) hashSet2.iterator().next();
                    hashSet2.remove(c0wbd5);
                    i++;
                    for (C0WBD c0wbd6 : (HashSet) c0wbd5.LIZIZ) {
                        ((HashSet) c0wbd6.LIZJ).remove(c0wbd5);
                        if (((HashSet) c0wbd6.LIZJ).isEmpty()) {
                            hashSet2.add(c0wbd6);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                for (C0WBD c0wbd7 : hashSet) {
                    if (!((HashSet) c0wbd7.LIZJ).isEmpty() && !((HashSet) c0wbd7.LIZIZ).isEmpty()) {
                        arrayList2.add(c0wbd7.LIZ);
                    }
                }
                throw new C0WB4(arrayList2) { // from class: X.0WBC
                    public final List<C0WBP<?>> LL;

                    public List<C0WBP<?>> getComponentsInCycle() {
                        return this.LL;
                    }

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Dependency cycle detected: ");
                        sbLIZ.append(Arrays.toString(arrayList2.toArray()));
                        super(C2188811AlT.LIZIZ(sbLIZ));
                        this.LL = arrayList2;
                    }
                };
            }
        }
    }
}
